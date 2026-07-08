package com.ss.android.ugc.aweme.live.toplives.notifications;

import X.C098200Yq;
import X.C099F;
import X.C1161920gLG;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1APY;
import X.C480680It8;
import X.C484120Iyg;
import X.C484270Iyv;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC480510Isr;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
@InterfaceC836760Ws6
public final class LiveNotificationFragment extends SAFTikTokFragment {
    public static String LLJJ = null;
    public static boolean LLJJI = false;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9PCo8JSYlLTZiHELIOSJyAnISMlKi4nISoiOmEfITMpByAnISMlKi4nISoiDz0yLygpJzs=";
    public final C484120Iyg LLJILLL;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Iyg] */
    public LiveNotificationFragment() {
        aS(AFwS237S0000000_7.get$arr$(113));
        this.LLJILLL = new C1APY() { // from class: X.0Iyg
            @Override // X.C1APY
            public final boolean LIZ(boolean z) {
                return !z;
            }

            @Override // X.C1APY
            public final void isMute() {
            }
        };
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C480680It8 c480680It8YY;
        InterfaceC480510Isr interfaceC480510Isr;
        super.onDestroy();
        C099F c099f = C484270Iyv.LIZJ;
        if (c099f != null) {
            c099f.LIZIZ(null);
        }
        C484270Iyv.LIZJ = null;
        C484270Iyv.LIZLLL = null;
        C484270Iyv.LIZIZ.clear();
        IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
        if (iPullStreamService == null || (c480680It8YY = iPullStreamService.YY()) == null || (interfaceC480510Isr = c480680It8YY.LIZIZ) == null) {
            return;
        }
        interfaceC480510Isr.unRegisterMuteFilter(this.LLJILLL);
        interfaceC480510Isr.e0(Boolean.FALSE);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C480680It8 c480680It8YY;
        InterfaceC480510Isr interfaceC480510Isr;
        super.onPause();
        LLJJI = true;
        IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
        if (iPullStreamService == null || (c480680It8YY = iPullStreamService.YY()) == null || (interfaceC480510Isr = c480680It8YY.LIZIZ) == null) {
            return;
        }
        interfaceC480510Isr.unRegisterMuteFilter(this.LLJILLL);
        interfaceC480510Isr.e0(Boolean.FALSE);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C480680It8 c480680It8YY;
        InterfaceC480510Isr interfaceC480510Isr;
        super.onResume();
        IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
        if (iPullStreamService == null || (c480680It8YY = iPullStreamService.YY()) == null || (interfaceC480510Isr = c480680It8YY.LIZIZ) == null) {
            return;
        }
        interfaceC480510Isr.registerMuteFilter(this.LLJILLL);
        interfaceC480510Isr.e0(Boolean.TRUE);
        interfaceC480510Isr.t0(interfaceC480510Isr.getPlayerTag(), "live_notification", true);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 245), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.hfi, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
