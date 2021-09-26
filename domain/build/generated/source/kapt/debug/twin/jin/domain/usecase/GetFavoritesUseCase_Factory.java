// Generated by Dagger (https://dagger.dev).
package twin.jin.domain.usecase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import twin.jin.domain.repository.ProductRepository;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetFavoritesUseCase_Factory implements Factory<GetFavoritesUseCase> {
  private final Provider<ProductRepository> productRepositoryProvider;

  public GetFavoritesUseCase_Factory(Provider<ProductRepository> productRepositoryProvider) {
    this.productRepositoryProvider = productRepositoryProvider;
  }

  @Override
  public GetFavoritesUseCase get() {
    return newInstance(productRepositoryProvider.get());
  }

  public static GetFavoritesUseCase_Factory create(
      Provider<ProductRepository> productRepositoryProvider) {
    return new GetFavoritesUseCase_Factory(productRepositoryProvider);
  }

  public static GetFavoritesUseCase newInstance(ProductRepository productRepository) {
    return new GetFavoritesUseCase(productRepository);
  }
}