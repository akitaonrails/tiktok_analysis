package com.bytedance.android.livesdk.game.broadcast.fragment.dualdevice3;

import X.C01GW;
import X.C1143680frq;
import X.C452501pT;
import X.C475510Ikn;
import X.C497740JfY;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.comp.api.game.GameDualDevicePageChannel;
import com.bytedance.android.livesdk.comp.api.game.GamePreparePageStopCountDown;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDeviceDialogV3 extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyOzFiHELIOSLz0yLygpJzt9LDAtJSs2PiwvLHx9DyQhLAsmKSkILDk6KyAIIC4/JyIaeg==";
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 268));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 267));
    public int LLJZIJLIL = 1;
    public final String[] LLL = {"ttlive_game_dual_device_intro_img_v2.png", "ttlive_game_dual_device_intro_img_v2_portria.png", "ttlive_game_dual_device_position_select_bg_v3_dark.png", "ttlive_game_dual_device_position_select_bg_v3.png", "ttlive_game_dual_device_land_position_dark.png", "ttlive_game_dual_device_land_position.png"};

    public final String uS() {
        return (String) this.LLJZ.getValue();
    }

    public final boolean wS() {
        return ((Boolean) this.LLJLLL.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00da, code lost:
    
        if (r3 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yS() {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.broadcast.fragment.dualdevice3.GameDualDeviceDialogV3.yS():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.LC0(GamePreparePageStopCountDown.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        yS();
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(this, GameDualDevicePageChannel.class, new AwS591S0100000_12(this, 54));
        }
        for (String str : this.LLL) {
            C1143680frq.LJJII("tiktok_live_game_demand_1", str);
        }
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 != null) {
            dataChannelLJ2.LC0(GamePreparePageStopCountDown.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("current_page");
        } else {
            i = 1;
        }
        this.LLJZIJLIL = i;
        if (i == 7) {
            return C786410Ut5.Td(layoutInflater, R.layout.g5u, viewGroup, false);
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g5t, viewGroup, false);
        if (viewTd != null) {
            View viewFindViewById = viewTd.findViewById(R.id.yqr);
            if (viewFindViewById != null) {
                viewFindViewById.setMinimumHeight((int) C497740JfY.LIZIZ(488.0f));
            }
            return viewTd;
        }
        return null;
    }
}
