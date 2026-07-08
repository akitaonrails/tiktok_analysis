package com.ss.android.ugc.aweme.account.loginapproval;

import X.C098200Yq;
import X.C13Z4;
import X.C13ZC;
import X.C13ZT;
import X.C1669670tYD;
import X.C1685300txQ;
import X.C1689320u3u;
import X.C1689570u4J;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20030013Ys;
import X.C20088213iq;
import X.C20277814Wa;
import X.C20684815ws;
import X.C2344009Gk;
import X.C703302op;
import X.EnumC1427810nG7;
import X.InterfaceC1680500tpg;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS48S0102000_19;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.AwS68S0001000_19;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC836760Ws6
public final class TwoStepPromoteFragment extends BaseFragment implements InterfaceC21503819Do {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSHELIOSA0ISstOT8hJzMtJWEHPyofPSojGDcjJCAnLQM+KCg+LSs4";

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public final void VR() {
        String string = requireArguments().getString("back_button_action_link", "");
        if (C703302op.LIZ(string)) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), string);
            smartRouteBuildRoute.addFlags(67108864);
            smartRouteBuildRoute.open();
        } else {
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public final void UR(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", requireArguments().getString("enter_from", ""));
        c2344009Gk.LJIIIIZZ("result", str);
        C20684815ws.LJIILLIIL("optional_twosv_popup", c2344009Gk.LIZ);
    }

    public final void SR(int i, InterfaceC1680500tpg interfaceC1680500tpg, int i2) {
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-485922593);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C13ZT.LIZ(C1689320u3u.LIZ.LIZJ(C1689570u4J.LIZ), C13Z4.LIZJ(2119969823, new AwS68S0001000_19(i, 0), c13zcLJIIJ), c13zcLJIIJ, 56);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS48S0102000_19(this, i, i2, 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setFitsSystemWindows(true);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-1109320106, new AwS639S0100000_25(this, 18), true));
        try {
            ViewTreeLifecycleOwner.set(composeView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(composeView, this);
            composeView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return composeView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return composeView;
        }
    }
}
