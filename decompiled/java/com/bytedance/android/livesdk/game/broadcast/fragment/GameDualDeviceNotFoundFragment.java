package com.bytedance.android.livesdk.game.broadcast.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0IJT;
import X.C0J1N;
import X.C0TDF;
import X.C0TDL;
import X.C11RD;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20736316Cj;
import X.C452501pT;
import X.C474500IjA;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import Y.AfS181S0100000_12;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDeviceNotFoundFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyHELIOSOzFiLz0yLygpJzt9DyQhLAsmKSkILDk6KyACJjsVJzAiLQkhKSIhLCEn";
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 246));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 247));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(117));

    public final boolean NR() {
        return ((Boolean) this.LLILLJJLI.getValue()).booleanValue();
    }

    public final long getRoomId() {
        return ((Number) this.LLILLL.getValue()).longValue();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.yrn);
        if (liveIconView != null) {
            liveIconView.setIcon(C20736316Cj.LJI(R.attr.eoe, liveIconView.getContext()));
        }
        View viewFindViewById = view.findViewById(R.id.ypm);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 20), viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.yr0);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 21), viewFindViewById2);
        }
        if (NR()) {
            str = "splice";
        } else {
            str = "embed";
        }
        String strValueOf = String.valueOf(getRoomId());
        Object value = this.LL.getValue();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_connec_failed_show");
        c474500IjALIZ.LJJII(Long.valueOf(C0TDL.LIZ()), "anchor_id");
        c474500IjALIZ.LJJII(str, "position_type");
        if (value != null) {
            c474500IjALIZ.LJJII(value, "source_page");
        }
        if (strValueOf != null) {
            c474500IjALIZ.LJJII(strValueOf, "room_id");
        }
        c474500IjALIZ.LIZ();
        ((C0J1N) C0TDF.LIZJ().LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 85), new C09JN() { // from class: X.0T6q
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameDualDeviceNotFoundFragment@2f73.onViewCreated$2");
                C20441214yg.LJ("GameDualDeviceNotFoundFragment", Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("GameDualDeviceNotFoundFragment@2f73.onViewCreated$2");
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gi7, viewGroup, false);
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
