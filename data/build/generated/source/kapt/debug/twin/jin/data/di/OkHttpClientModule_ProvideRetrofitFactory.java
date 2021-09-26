// Generated by Dagger (https://dagger.dev).
package twin.jin.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OkHttpClientModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  public OkHttpClientModule_ProvideRetrofitFactory(Provider<OkHttpClient> okHttpClientProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(okHttpClientProvider.get());
  }

  public static OkHttpClientModule_ProvideRetrofitFactory create(
      Provider<OkHttpClient> okHttpClientProvider) {
    return new OkHttpClientModule_ProvideRetrofitFactory(okHttpClientProvider);
  }

  public static Retrofit provideRetrofit(OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(OkHttpClientModule.INSTANCE.provideRetrofit(okHttpClient));
  }
}