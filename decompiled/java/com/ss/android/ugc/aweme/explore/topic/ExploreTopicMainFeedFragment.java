package com.ss.android.ugc.aweme.explore.topic;

import X.C0QSJ;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.InterfaceC1146704e9;
import X.InterfaceC687730QyJ;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.explore.scope.ExploreFeedComponentScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class ExploreTopicMainFeedFragment extends BaseExploreTopicFeedFragment implements C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiA0OSM8OiBiPSHELIOSAjISZiDDcjJCo+LBs8OCwvBC46JgMpLCsVOiQrJCo9PA==";

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ExploreFeedComponentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ExploreFeedComponentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ExploreFeedComponentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.aweme.explore.topic.BaseExploreTopicFeedFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS384S0200000_18(this, view, 34), 3);
    }
}
