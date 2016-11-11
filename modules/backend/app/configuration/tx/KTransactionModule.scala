package configuration.tx

import com.google.inject.AbstractModule
import com.google.inject.matcher.Matchers
import org.springframework.transaction.annotation.Transactional

class KTransactionModule extends AbstractModule {

  override def configure = {

    // Initializing interceptor for components created by Guice and marked with @Transactional
    val transactionInterceptor = new KTransactionInterceptor()
    requestInjection(transactionInterceptor)
    bindInterceptor(Matchers.any(), Matchers.annotatedWith(classOf[Transactional]), transactionInterceptor)

  }


}
