package co.windly.bookstore.presentation.base.activity

import androidx.annotation.CallSuper
import co.windly.bookstore.presentation.base.MvpPresenter
import co.windly.bookstore.presentation.base.MvpView
import io.reactivex.disposables.CompositeDisposable

abstract class MvpActivityPresenter<V : MvpView<P>, out P : MvpPresenter<V>> : MvpPresenter<V> {

  //region Ui

  override lateinit var view: V

  //endregion

  //region Reactive

  val disposables = CompositeDisposable()

  @CallSuper
  fun clearDisposables() {
    disposables.clear()
  }

  //endregion
}