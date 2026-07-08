package com.ss.android.ugc.aweme.explore.topic;

import X.C019F;
import X.C01D1;
import X.C0QSJ;
import X.C13LE;
import X.C15V4;
import X.C1622206Wu;
import X.C16HK;
import X.C19719912Dl;
import X.C2187701Ajg;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C987103tV;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.explore.monitor.ff.ExploreCustomFeedColdBootManager;
import com.ss.android.ugc.aweme.explore.monitor.lcp.ExploreLCPTracker;
import com.ss.android.ugc.aweme.explore.scope.ExploreFeedComponentScope;
import com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreTopicGeneralFeedFragment extends BaseExploreTopicFeedFragment implements C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiA0OSM8OiBiPSAjHELIOSISZiDDcjJCo+LBs8OCwvDio9LTctJQk2LSEKOy40JSAiPQ==";

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ExploreTopicGeneralFeedFragment.class, "topicFeedListVM", "getTopicFeedListVM()Lcom/ss/android/ugc/aweme/explore/vm/ExploreTopicGeneralFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

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

    public ExploreTopicGeneralFeedFragment() {
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ExploreTopicGeneralFeedListViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 364);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(104);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 626), aFwS276S0000000_31, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            return;
        }
        if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS575S0100000_31((Fragment) this, 627), aFwS276S0000000_31, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 628), aFwS276S0000000_31, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.topic.BaseExploreTopicFeedFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ExploreCustomFeedColdBootManager.LIZ.start(this.LLIZLLLIL, null, "subtab", this.LLIZ);
    }

    @Override // com.ss.android.ugc.aweme.explore.topic.BaseExploreTopicFeedFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ExploreLCPTracker.INSTANCE.recordStage$explore_release(this.LLIZLLLIL, C15V4.PAGE_BUILD);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            C16HK c16hk = new C16HK(this, view, 2);
            viewTreeObserver.addOnPreDrawListener(c16hk);
            C2187701Ajg.LIZ(viewTreeObserver, c16hk, ViewTreeObserver.OnPreDrawListener.class);
        }
        C723850SaN.LIZ(this, false, null, new AwS397S0200000_31(this, view, 48), 3);
    }
}
