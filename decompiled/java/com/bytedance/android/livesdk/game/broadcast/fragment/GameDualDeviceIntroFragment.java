package com.bytedance.android.livesdk.game.broadcast.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0J1N;
import X.C0TDF;
import X.C1143680frq;
import X.C11RD;
import X.C1685300txQ;
import X.C16FS;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import Y.AfS181S0100000_12;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingSetting;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceRtcIntroPageSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDeviceIntroFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSHELIOSwyOzFiLz0yLygpJzt9DyQhLAsmKSkILDk6KyAFJzshJwM+KCg+LSs4";
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 241));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(114));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(113));

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        String str = "ttlive_game_dual_device_intro_img_v2.png";
        if (GameDualDeviceInvitingSetting.INSTANCE.isExperiment()) {
            View viewFindViewById = view.findViewById(R.id.yrk);
            if (viewFindViewById != null) {
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = (int) C497740JfY.LIZIZ(342.0f);
                }
                ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = (int) C497740JfY.LIZIZ(217.0f);
                }
                C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(52.0f), viewFindViewById);
                if (!((Boolean) this.LL.getValue()).booleanValue()) {
                    str = "ttlive_game_dual_device_intro_img_v2_portria.png";
                }
                C1143680frq.LJ(viewFindViewById, "tiktok_live_game_demand_1", str, ImageView.ScaleType.CENTER_INSIDE);
            }
            View viewFindViewById2 = view.findViewById(R.id.ypj);
            if (viewFindViewById2 != null) {
                C786410Ut5.I7(new ACListenerS147S0100000_12(this, 12), viewFindViewById2);
            }
            TextView textView = (TextView) view.findViewById(R.id.yvo);
            if (textView != null) {
                textView.setText(C497740JfY.LJIJI(2131842986));
            }
            TextView textView2 = (TextView) view.findViewById(R.id.yvi);
            if (textView2 != null) {
                textView2.setText(C497740JfY.LJIJI(2131853786));
                C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(12.0f), textView2);
            }
            C16FS c16fs = (C16FS) view.findViewById(R.id.yqn);
            if (c16fs != null) {
                C786410Ut5.h8(c16fs, new ACListenerS147S0100000_12(this, 13));
            }
        } else {
            View viewFindViewById3 = view.findViewById(R.id.yrk);
            if (viewFindViewById3 != null) {
                ViewGroup.LayoutParams layoutParams3 = viewFindViewById3.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = (int) C497740JfY.LIZIZ(342.0f);
                }
                ViewGroup.LayoutParams layoutParams4 = viewFindViewById3.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.height = (int) C497740JfY.LIZIZ(217.0f);
                }
                C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(52.0f), viewFindViewById3);
                if (!((Boolean) this.LL.getValue()).booleanValue()) {
                    str = "ttlive_game_dual_device_intro_img_v2_portria.png";
                }
                C1143680frq.LJ(viewFindViewById3, "tiktok_live_game_demand_1", str, ImageView.ScaleType.CENTER_INSIDE);
            }
            View viewFindViewById4 = view.findViewById(R.id.ypj);
            if (viewFindViewById4 != null) {
                C786410Ut5.I7(new ACListenerS147S0100000_12(this, 10), viewFindViewById4);
            }
            TextView textView3 = (TextView) view.findViewById(R.id.yvo);
            if (textView3 != null) {
                textView3.setText(C497740JfY.LJIJI(2131842986));
            }
            TextView textView4 = (TextView) view.findViewById(R.id.yvi);
            if (textView4 != null) {
                textView4.setText(C497740JfY.LJIJI(2131853786));
                C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(12.0f), textView4);
            }
            View viewFindViewById5 = view.findViewById(R.id.yqn);
            if (viewFindViewById5 != null) {
                C786410Ut5.I7(new ACListenerS147S0100000_12(this, 11), viewFindViewById5);
            }
        }
        if (GameDualDeviceRtcIntroPageSetting.INSTANCE.isDefault()) {
            ((C0J1N) C0TDF.LIZJ().LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 81), new C09JN() { // from class: X.0T6o
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GameDualDeviceIntroFragment@57e1.onViewCreated$2");
                    C20441214yg.LJ("GameDualDeviceIntroFragment", Log.getStackTraceString((Throwable) obj));
                    C1C7U.LIZIZ("GameDualDeviceIntroFragment@57e1.onViewCreated$2");
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        if (GameDualDeviceInvitingSetting.INSTANCE.isExperiment()) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.gi4, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.gi3, viewGroup, false);
        }
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
