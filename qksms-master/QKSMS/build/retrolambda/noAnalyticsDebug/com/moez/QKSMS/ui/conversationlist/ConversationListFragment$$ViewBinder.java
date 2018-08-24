// Generated code from Butter Knife. Do not modify!
package com.moez.QKSMS.ui.conversationlist;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ConversationListFragment$$ViewBinder<T extends com.moez.QKSMS.ui.conversationlist.ConversationListFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755193, "field 'mEmptyState'");
    target.mEmptyState = view;
    view = finder.findRequiredView(source, 2131755194, "field 'mEmptyStateIcon'");
    target.mEmptyStateIcon = finder.castView(view, 2131755194, "field 'mEmptyStateIcon'");
    view = finder.findRequiredView(source, 2131755195, "field 'mRecyclerView'");
    target.mRecyclerView = finder.castView(view, 2131755195, "field 'mRecyclerView'");
    view = finder.findRequiredView(source, 2131755196, "field 'mFab'");
    target.mFab = finder.castView(view, 2131755196, "field 'mFab'");
  }

  @Override public void unbind(T target) {
    target.mEmptyState = null;
    target.mEmptyStateIcon = null;
    target.mRecyclerView = null;
    target.mFab = null;
  }
}
