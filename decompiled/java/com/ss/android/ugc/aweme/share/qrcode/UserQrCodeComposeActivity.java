package com.ss.android.ugc.aweme.share.qrcode;

import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS455S0200000_19;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC836760Ws6
public final class UserQrCodeComposeActivity extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkKD02ZjHELIOSQ+KiA3LWsZOiohGTcPJis2CyohOSAgLQQvPSYlITE1";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(316), "extra_enter_from", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS257S0000000_19.get$arr$(317), "extra_enter_method", String.class);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS257S0000000_19.get$arr$(318));
        super.onCreate(bundle);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "qr_code_detail");
        c2344009Gk.LJIIIIZZ("action_type", "show");
        C20684815ws.LJIILLIIL("scan_icon", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C786410Ut5.x3(view.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.08Dr
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C786410Ut5.C3(view.getViewTreeObserver(), this);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "qr_code_compose");
                c2344009Gk.LIZLLL(jCurrentTimeMillis2, "rendering_time");
                C20684815ws.LJIILLIIL("qr_page_render_perf", c2344009Gk.LIZ);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setFitsSystemWindows(false);
        composeView.setContent(new C19719212De(778552537, new AwS455S0200000_19(composeView, this, 22), true));
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
