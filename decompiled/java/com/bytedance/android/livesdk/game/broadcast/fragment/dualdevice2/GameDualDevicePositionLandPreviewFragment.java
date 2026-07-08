package com.bytedance.android.livesdk.game.broadcast.fragment.dualdevice2;

import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDevicePositionLandPreviewFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyOzFiLz0yLygpJzt9HELIOSLDAtJSs2PiwvLH19DyQhLAsmKSkILDk6KyAcJjw6PCwjJwMyJiEcOyolISA7Dz0yLygpJzs=";
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 261));

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            super.onViewCreated(r5, r6)
            com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingSetting r0 = com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingSetting.INSTANCE
            boolean r1 = r0.isExperiment()
            r0 = 2131378569(0x7f0a4189, float:1.8377374E38)
            if (r1 == 0) goto L77
            android.view.View r3 = r5.findViewById(r0)
            if (r3 == 0) goto L41
            android.content.Context r0 = r3.getContext()
            boolean r0 = X.C960203pA.LIZIZ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L74
            java.lang.String r0 = com.bytedance.android.livesdk.game.broadcast.fragment.dualdevice3.GameDualDeviceDialogV3._pnsPageId
            X.01GW r0 = r4.LL
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "live_take_prepare"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L74
            java.lang.String r2 = "ttlive_game_dual_device_land_position_dark.png"
        L3a:
            java.lang.String r1 = "tiktok_live_game_demand_2"
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            X.C1143680frq.LJ(r3, r1, r2, r0)
        L41:
            r0 = 2131395940(0x7f0a8564, float:1.8412607E38)
            android.view.View r2 = r5.findViewById(r0)
            if (r2 == 0) goto L53
            Y.ACListenerS116S0200000_12 r1 = new Y.ACListenerS116S0200000_12
            r0 = 2
            r1.<init>(r4, r2, r0)
            X.C786410Ut5.I7(r1, r2)
        L53:
            X.11PQ r1 = X.C0TDF.LIZJ()
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r1 = r1.LJJJLZIJ(r0)
            X.11L0 r0 = X.C11RD.LIZLLL(r4)
            java.lang.Object r2 = r1.LIZJ(r0)
            X.0J1N r2 = (X.C0J1N) r2
            Y.AfS181S0100000_12 r1 = new Y.AfS181S0100000_12
            r0 = 93
            r1.<init>(r4, r0)
            r2.LIZJ(r1)
            return
        L74:
            java.lang.String r2 = "ttlive_game_dual_device_land_position.png"
            goto L3a
        L77:
            android.view.View r3 = r5.findViewById(r0)
            if (r3 == 0) goto L41
            android.content.Context r0 = r3.getContext()
            boolean r0 = X.C960203pA.LIZIZ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto La9
            java.lang.String r2 = "_dark.png"
        L91:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ttlive_game_dual_device_land_position_preview"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
            java.lang.String r0 = "tiktok_live_game_demand_1"
            X.C1143680frq.LJ(r3, r0, r2, r1)
            goto L41
        La9:
            java.lang.String r2 = "_light.png"
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.broadcast.fragment.dualdevice2.GameDualDevicePositionLandPreviewFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        if (GameDualDeviceInvitingSetting.INSTANCE.isExperiment()) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.ghg, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.ghf, viewGroup, false);
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
