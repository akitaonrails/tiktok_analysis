package com.ss.android.ugc.aweme.topicfeed.ui.fragment;

import X.C673150Qan;
import X.C687700QyG;
import com.ss.android.ugc.aweme.topicfeed.scope.TopicFeedFragmentScope;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class TopicSportsFeedFragment extends BaseTopicFeedFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjOSYwLiApLWEmHELIOSIWsqOy40JSAiPWEHJzUlKhwjJzc4Ogk2LSEKOy40JSAiPQ==";

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.fragment.BaseTopicFeedFragment, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TopicFeedFragmentScope.class});
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.fragment.BaseTopicFeedFragment, X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.fragment.BaseTopicFeedFragment, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(TopicFeedFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.fragment.BaseTopicFeedFragment, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(TopicFeedFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.fragment.BaseTopicFeedFragment, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.fragment.BaseTopicFeedFragment, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
        C673150Qan.LIZIZ(this, obj, cls);
    }
}
