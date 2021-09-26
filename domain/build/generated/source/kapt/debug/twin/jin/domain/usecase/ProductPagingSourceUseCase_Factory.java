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
public final class ProductPagingSourceUseCase_Factory implements Factory<ProductPagingSourceUseCase> {
  private final Provider<ProductRepository> productRepositoryProvider;

  public ProductPagingSourceUseCase_Factory(Provider<ProductRepository> productRepositoryProvider) {
    this.productRepositoryProvider = productRepositoryProvider;
  }

  @Override
  public ProductPagingSourceUseCase get() {
    return newInstance(productRepositoryProvider.get());
  }

  public static ProductPagingSourceUseCase_Factory create(
      Provider<ProductRepository> productRepositoryProvider) {
    return new ProductPagingSourceUseCase_Factory(productRepositoryProvider);
  }

  public static ProductPagingSourceUseCase newInstance(ProductRepository productRepository) {
    return new ProductPagingSourceUseCase(productRepository);
  }
}