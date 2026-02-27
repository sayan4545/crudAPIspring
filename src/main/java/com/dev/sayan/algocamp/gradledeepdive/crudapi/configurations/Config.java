package com.dev.sayan.algocamp.gradledeepdive.crudapi.configurations;

import com.dev.sayan.algocamp.gradledeepdive.crudapi.gateway.api.FakeStoreCategoryApi;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.Collections;

@Configuration
public class Config {

    @Bean
    public OkHttpClient okHttpClient() {
        // Force TLS 1.2/1.3 and disable HTTP/2 (test)
        ConnectionSpec spec = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
                .tlsVersions(TlsVersion.TLS_1_2, TlsVersion.TLS_1_3)
                .build();

        return new OkHttpClient.Builder()
                .connectionSpecs(Collections.singletonList(spec))
                .protocols(Collections.singletonList(Protocol.HTTP_1_1)) // optional
                .build();
    }

    @Bean
    public Retrofit retrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.com/") // your API base URL
                .client(okHttpClient) // inject custom client
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeStoreCategoryApi getFakeStoreCategoryApi(Retrofit retrofit) {
        return retrofit.create(FakeStoreCategoryApi.class);
    }
}