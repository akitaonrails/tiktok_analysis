package com.bytedance.android.livesdk.game.broadcast.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C0TDU;
import X.C1143680frq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19MB;
import X.C20441214yg;
import X.C2188811AlT;
import X.C439101nJ;
import X.C452501pT;
import X.C475510Ikn;
import X.C748890TZf;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDevicePositionPreviewFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyOzFiLzHELIOS0yLygpJzt9DyQhLAsmKSkILDk6KyAcJjw6PCwjJx8hLTMlLDgVOiQrJCo9PA==";
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 250));

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        ConstraintLayout constraintLayout;
        int i;
        int i2;
        Integer num;
        super.onResume();
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        int iIntValue = (dataChannelLJ == null || (num = (Integer) dataChannelLJ.gg0(C748890TZf.class)) == null) ? 0 : num.intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("positionSelect = ");
        sbLIZ.append(iIntValue);
        C20441214yg.LJIIIZ("GameDualDevicePositionPreviewFragment", C2188811AlT.LIZIZ(sbLIZ));
        View view = getView();
        if (view == null || (constraintLayout = (ConstraintLayout) view.findViewById(R.id.ytp)) == null) {
            return;
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        c19mb.LJI(R.id.ytq, 2);
        c19mb.LJI(R.id.ytq, 1);
        c19mb.LJI(R.id.ytq, 4);
        c19mb.LJI(R.id.ytq, 3);
        if (iIntValue == C0TDU.LeftTop.ordinal()) {
            i = 1;
            i2 = 3;
        } else if (iIntValue == C0TDU.RightTop.ordinal()) {
            i = 2;
            i2 = 3;
        } else {
            if (iIntValue != C0TDU.LeftBottom.ordinal()) {
                i = iIntValue == C0TDU.RightBottom.ordinal() ? 2 : 1;
                i = 1;
                i2 = 3;
            }
            i2 = 4;
        }
        c19mb.LJIIIIZZ(R.id.ytq, i2, R.id.yto, i2);
        c19mb.LJIIIIZZ(R.id.ytq, i, R.id.yto, i);
        if (!((Boolean) this.LL.getValue()).booleanValue()) {
            c19mb.LJJIIJZLJL(R.id.ytq, 1, C439101nJ.LIZ(6));
            c19mb.LJJIIJZLJL(R.id.ytq, 3, C439101nJ.LIZ(42));
            c19mb.LJJIIJZLJL(R.id.ytq, 2, C439101nJ.LIZ(6));
            c19mb.LJJIIJZLJL(R.id.ytq, 4, C439101nJ.LIZ(33));
        }
        c19mb.LIZIZ(constraintLayout);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (((Boolean) this.LL.getValue()).booleanValue()) {
            View viewFindViewById = view.findViewById(R.id.yto);
            if (viewFindViewById != null) {
                C1143680frq.LJ(viewFindViewById, "tiktok_live_game_demand_1", "ttlive_game_dual_device_position_preview_mask.png", ImageView.ScaleType.FIT_XY);
            }
        } else {
            View viewFindViewById2 = view.findViewById(R.id.ytl);
            if (viewFindViewById2 != null) {
                C1143680frq.LJ(viewFindViewById2, "tiktok_live_game_demand_1", "ttlive_game_dual_device_position_preview_mask_bg_port.png", ImageView.ScaleType.FIT_XY);
            }
            View viewFindViewById3 = view.findViewById(R.id.yto);
            if (viewFindViewById3 != null) {
                C1143680frq.LJ(viewFindViewById3, "tiktok_live_game_demand_1", "ttlive_game_dual_device_position_preview_mask_port.png", ImageView.ScaleType.FIT_XY);
            }
        }
        View viewFindViewById4 = view.findViewById(R.id.ytq);
        if (viewFindViewById4 != null) {
            C1143680frq.LJ(viewFindViewById4, "tiktok_live_game_demand_1", "ttlive_game_dual_device_position_selected.png", ImageView.ScaleType.FIT_XY);
        }
        View viewFindViewById5 = view.findViewById(R.id.ytm);
        if (viewFindViewById5 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 23), viewFindViewById5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (((Boolean) this.LL.getValue()).booleanValue()) {
            i = R.layout.gi9;
        } else {
            i = R.layout.gi_;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
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
