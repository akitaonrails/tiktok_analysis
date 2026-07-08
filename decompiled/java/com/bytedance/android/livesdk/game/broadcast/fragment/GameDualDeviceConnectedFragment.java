package com.bytedance.android.livesdk.game.broadcast.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C0J1N;
import X.C0TDF;
import X.C1143680frq;
import X.C11RD;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C743540TEq;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import Y.AfS181S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDeviceConnectedFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyOzHELIOSFiLz0yLygpJzt9DyQhLAsmKSkILDk6KyAPJiE9LSY4LCsVOiQrJCo9PA==";
    public final C01GW LL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(112));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(111));

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.yrj);
        if (viewFindViewById != null) {
            C1143680frq.LJ(viewFindViewById, "tiktok_live_game_demand_1", "ttlive_game_dual_device_connected_img.png", ImageView.ScaleType.CENTER_INSIDE);
        }
        View viewFindViewById2 = view.findViewById(R.id.yqk);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 19), viewFindViewById2);
        }
        C743540TEq.LJIILIIL(String.valueOf(((Number) this.LL.getValue()).longValue()), "screen_share", "live_take_prepare", null, false, C0TDF.LIZ(), 24);
        ((C0J1N) C0TDF.LIZJ().LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZJ(new AfS181S0100000_12(this, 10));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gi2, viewGroup, false);
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
