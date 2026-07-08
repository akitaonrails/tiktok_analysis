package com.bytedance.android.livesdk.game.broadcast.dialog;

import X.C01GW;
import X.C1143680frq;
import X.C452501pT;
import X.C497740JfY;
import X.C500980Jkm;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.game.GameDualDevicePageChannel;
import com.bytedance.android.livesdk.comp.api.game.GamePreparePageStopCountDown;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDeviceDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExHELIOSOiotLSwyOzFiLSYyJCorZwgyJSAIPC4/DCA6ICw2DCwtJSA0";
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 238));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 237));
    public int LLILLL = 1;
    public final String[] LLILZ = {"ttlive_game_dual_device_camera_icon.png", "ttlive_game_dual_device_connected_img.png", "ttlive_game_dual_device_intro_img.png", "ttlive_game_dual_device_position_preview_mask.png", "ttlive_game_dual_device_position_selected.png"};

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if (r4 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void MR() {
        /*
            r5 = this;
            int r2 = r5.LLILLL
            r0 = 1
            if (r2 == r0) goto L5a
            r0 = 2
            r1 = 0
            if (r2 == r0) goto L6b
            r0 = 3
            if (r2 == r0) goto L54
            r0 = 4
            if (r2 != r0) goto L7d
            X.01GW r0 = r5.LL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            X.01GW r0 = r5.LLILLJJLI
            java.lang.Object r2 = r0.getValue()
            java.lang.String r2 = (java.lang.String) r2
            com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDevicePositionFragment r4 = new com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDevicePositionFragment
            r4.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "is_landscape"
            r1.putBoolean(r0, r3)
            java.lang.String r0 = "event_page"
            X.C786410Ut5.LJJJI(r0, r2, r1)
            r4.setArguments(r1)
        L3a:
            androidx.fragment.app.FragmentManager r0 = r5.getChildFragmentManager()
            X.19EH r2 = r0.LJIIJ()
            java.lang.Class r0 = r4.getClass()
            java.lang.String r1 = r0.getSimpleName()
            r0 = 2131395834(0x7f0a84fa, float:1.8412392E38)
            r2.LJIJ(r0, r4, r1)
            r2.LJIIJ()
            return
        L54:
            com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceConnectedFragment r4 = new com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceConnectedFragment
            r4.<init>()
            goto L3a
        L5a:
            X.01GW r0 = r5.LL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceIntroFragment r4 = X.C0TDN.LIZ(r0)
            goto L7b
        L6b:
            X.01GW r0 = r5.LL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceQRCodeFragment r4 = X.C0TDV.LIZ(r1, r0)
        L7b:
            if (r4 != 0) goto L3a
        L7d:
            r5.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.broadcast.dialog.GameDualDeviceDialog.MR():void");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g5s);
        c500980Jkm.LIZIZ = 0;
        c500980Jkm.LIZJ = R.style.ak6;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = (int) C497740JfY.LIZIZ(415.0f);
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(GamePreparePageStopCountDown.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("current_page");
        } else {
            i = 1;
        }
        this.LLILLL = i;
        MR();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, GameDualDevicePageChannel.class, new AwS591S0100000_12(this, 1029));
        }
        for (String str : this.LLILZ) {
            C1143680frq.LJJII("tiktok_live_game_demand_1", str);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.LC0(GamePreparePageStopCountDown.class, Boolean.TRUE);
        }
    }
}
