package com.ss.android.ugc.feed.platform.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C0RJN;
import X.C0TMW;
import X.C1558360qeg;
import X.C1566000qr0;
import X.C1578630rBN;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2189821An6;
import X.C2217391BqT;
import X.C452501pT;
import X.C723850SaN;
import X.InterfaceC1055110dYz;
import X.InterfaceC734530Srb;
import X.InterfaceC735760Sta;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hox.Hox;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.fragment.GenericFeedFragment;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class GenericFeedFragment extends AbsFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiMpLCt9OCktPSk8OiHELIOShiLz0yLygpJzt9DyAiLD06KwMpLCsVOiQrJCo9PA==";
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1508));

    public final InterfaceC735760Sta MR() {
        return (InterfaceC735760Sta) this.LL.getValue();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        MR().L();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        MR().fl();
        super.onDetach();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        MR().M();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MR().cq();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        MR().LLLZIL();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        MR().w4();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        InterfaceC734530Srb interfaceC734530SrbAA0;
        RootPanelComponent rootPanelComponentLIZJ;
        C723850SaN.LIZ(this, true, null, new C1566000qr0(this), 2);
        C1558360qeg.LIZIZ(this, null);
        C723850SaN.LIZ(this, true, null, new C0TMW(this), 2);
        RootPanelComponent rootPanelComponentLIZJ2 = C1578630rBN.LIZJ(this);
        if (rootPanelComponentLIZJ2 != null && (interfaceC734530SrbAA0 = rootPanelComponentLIZJ2.AA0()) != null && (rootPanelComponentLIZJ = C1578630rBN.LIZJ(this)) != null) {
            final C0RJN panelContext = rootPanelComponentLIZJ.getPanelContext();
            C2217391BqT c2217391BqT = new C2217391BqT(panelContext) { // from class: X.14TK
                @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217311BqL
                public final Object get() {
                    return ((C0RJN) this.receiver).LIZJ;
                }

                @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217291BqJ
                public final void set(Object obj) {
                    ((C0RJN) this.receiver).LIZJ = (C2189821An6) obj;
                }
            };
            Object c2189821An6 = c2217391BqT.get();
            if (c2189821An6 == null) {
                c2189821An6 = new C2189821An6();
            }
            if (c2217391BqT.get() == null) {
                c2217391BqT.set(c2189821An6);
            }
            getArguments();
            interfaceC734530SrbAA0.LIZIZ();
        }
        MR().Bg(activity, this);
        super.onAttach(activity);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MR().M1(configuration);
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Hox hoxLIZ;
        final String strPz;
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null && (strPz = (hoxLIZ = Hox.LLJILJIL.LIZ(activity)).pz(this)) != null) {
            final C0RJN c0rjnLIZIZ = C1578630rBN.LIZIZ(this);
            hoxLIZ.wQ2(strPz, new InterfaceC1055110dYz() { // from class: X.0rGl
                @Override // X.InterfaceC1583780rJg
                public final String getHoxNodeTag() {
                    return "";
                }

                @Override // X.InterfaceC1055110dYz
                public final void onNodeHide(Bundle bundle2) {
                    String str;
                    C0RJN c0rjn = c0rjnLIZIZ;
                    if (c0rjn != null) {
                        str = c0rjn.LIZ;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, "Friends")) {
                        C1564710qov.LIZIZ(bundle2, new AwS603S0100000_24(this, 418));
                    } else {
                        GenericFeedFragment genericFeedFragment = this;
                        C1564710qov.LIZ(genericFeedFragment, bundle2, strPz, new AwS603S0100000_24(genericFeedFragment, 419));
                    }
                }

                @Override // X.InterfaceC1055110dYz
                public final void onNodeShow(Bundle bundle2) {
                    String str;
                    C0RJN c0rjn = c0rjnLIZIZ;
                    if (c0rjn != null) {
                        str = c0rjn.LIZ;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, "Friends")) {
                        C1564710qov.LIZIZ(bundle2, new AwS603S0100000_24(this, 420));
                    } else {
                        GenericFeedFragment genericFeedFragment = this;
                        C1564710qov.LIZ(genericFeedFragment, bundle2, strPz, new AwS603S0100000_24(genericFeedFragment, 421));
                    }
                }
            });
        }
        MR().P9(bundle);
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        MR().Re(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        MR().Mf(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewV2 = MR().V2(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewV2 instanceof View)) {
            viewV2 = null;
        }
        if (viewV2 != null) {
            try {
                ViewTreeLifecycleOwner.set(viewV2, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewV2, this);
                viewV2.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewV2;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewV2;
    }
}
