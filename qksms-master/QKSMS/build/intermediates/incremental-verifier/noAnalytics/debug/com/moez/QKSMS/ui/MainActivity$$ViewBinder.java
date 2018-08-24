// Generated code from Butter Knife. Do not modify!
package com.moez.QKSMS.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.moez.QKSMS.ui.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755156, "field 'mRoot'");
    target.mRoot = view;
    view = finder.findRequiredView(source, 2131755157, "field 'mSlidingMenu'");
    target.mSlidingMenu = finder.castView(view, 2131755157, "field 'mSlidingMenu'");
  }

  @Override public void unbind(T target) {
    target.mRoot = null;
    target.mSlidingMenu = null;
  }
}
