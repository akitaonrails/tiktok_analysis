package com.bytedance.android.livesdk.game.broadcast.fragment.dualdevice2;

import X.C01GW;
import X.C1143680frq;
import X.C20736316Cj;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C960203pA;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.game.GameDualDevicePageChannel;
import com.bytedance.android.livesdk.comp.api.game.GamePreparePageStopCountDown;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDeviceDialogV2 extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyOzFiHELIOSLz0yLygpJzt9LDAtJSs2PiwvLH19DyQhLAsmKSkILDk6KyAIIC4/JyIaew==";
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 260));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 259));
    public int LLILLL = 1;
    public final String[] LLILZ = {"ttlive_game_dual_device_camera_icon_connected.png", "ttlive_game_dual_device_intro_img_v2.png", "ttlive_game_dual_device_intro_img_v2_portria.png", "ttlive_game_dual_device_land_position_preview_dark.png", "ttlive_game_dual_device_land_position_preview_light.png"};

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (r3 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void MR() {
        /*
            r4 = this;
            int r3 = r4.LLILLL
            r2 = 1
            if (r3 == r2) goto L5f
            r0 = 2
            r1 = 0
            if (r3 == r0) goto L4e
            r0 = 4
            if (r3 != r0) goto L7f
            X.01GW r0 = r4.LL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L70
            X.01GW r0 = r4.LLILLJJLI
            java.lang.Object r2 = r0.getValue()
            java.lang.String r2 = (java.lang.String) r2
            com.bytedance.android.livesdk.game.broadcast.fragment.dualdevice2.GameDualDevicePositionLandPreviewFragment r3 = new com.bytedance.android.livesdk.game.broadcast.fragment.dualdevice2.GameDualDevicePositionLandPreviewFragment
            r3.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "event_page"
            X.C786410Ut5.LJJJI(r0, r2, r1)
            r3.setArguments(r1)
        L34:
            androidx.fragment.app.FragmentManager r0 = r4.getChildFragmentManager()
            X.19EH r2 = r0.LJIIJ()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r1 = r0.getSimpleName()
            r0 = 2131395834(0x7f0a84fa, float:1.8412392E38)
            r2.LJIJ(r0, r3, r1)
            r2.LJIIJ()
            return
        L4e:
            X.01GW r0 = r4.LL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceQRCodeFragment r3 = X.C0TDV.LIZ(r1, r0)
            goto L7d
        L5f:
            X.01GW r0 = r4.LL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceIntroFragment r3 = X.C0TDN.LIZ(r0)
            goto L7d
        L70:
            X.01GW r0 = r4.LLILLJJLI
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0 = 0
            com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDevicePositionSelectFragment r3 = X.C0TDQ.LIZ(r1, r0, r2)
        L7d:
            if (r3 != 0) goto L34
        L7f:
            r4.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.broadcast.fragment.dualdevice2.GameDualDeviceDialogV2.MR():void");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g5s);
        c500980Jkm.LIZIZ = 0;
        c500980Jkm.LIZJ = R.style.ak6;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = (int) C497740JfY.LIZIZ(488.0f);
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
        Boolean boolValueOf;
        Dialog dialog;
        Window window;
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
            dataChannel.BQ2(this, GameDualDevicePageChannel.class, new AwS591S0100000_12(this, 37));
        }
        for (String str : this.LLILZ) {
            C1143680frq.LJJII("tiktok_live_game_demand_1", str);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.LC0(GamePreparePageStopCountDown.class, Boolean.TRUE);
        }
        Context context = getContext();
        if (context != null) {
            boolValueOf = Boolean.valueOf(C960203pA.LIZIZ(context));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf) && (dialog = getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.setNavigationBarColor(C20736316Cj.LIZIZ(R.attr.ezk, getContext()));
        }
    }
}
