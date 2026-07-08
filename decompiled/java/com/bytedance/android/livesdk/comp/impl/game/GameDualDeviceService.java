package com.bytedance.android.livesdk.comp.impl.game;

import X.C0TDF;
import X.C1161920gLG;
import X.C19322110iZ;
import X.C20441214yg;
import X.C464790IKn;
import X.C495520Jby;
import X.C497740JfY;
import X.C742700TBk;
import X.C786410Ut5;
import X.InterfaceC772390URp;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.api.game.service.IGameDualDeviceService;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.game.broadcast.fragment.dualdevice3.GameDualDeviceBeInvitedDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.GameDualDeviceParamsSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.GameLiveDualDevicePadEnableSettingSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.HashMap;
import webcast.api.game.CreateInfoResponse;

/* JADX INFO: loaded from: classes13.dex */
public class GameDualDeviceService implements IGameDualDeviceService {
    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameDualDeviceService
    public final C742700TBk MU0() {
        return new C742700TBk();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameDualDeviceService
    public final boolean Me2() {
        CreateInfoResponse.ResponseData responseDataI92;
        IGameService iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class);
        if ((iGameService == null || (responseDataI92 = iGameService.I92()) == null || !responseDataI92.haveDualDeviceCamera) && !InterfaceC772390URp.F.LIZIZ().booleanValue()) {
            return GameLiveDualDevicePadEnableSettingSetting.INSTANCE.isPadEnable() && C497740JfY.LJIIZILJ() >= ((int) C497740JfY.LIZIZ(600.0f)) && C497740JfY.LJIILLIIL() >= ((int) C497740JfY.LIZIZ(683.0f));
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameDualDeviceService
    public final void tO1() {
        C0TDF.LIZLLL().LIZLLL();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameDualDeviceService
    public final void pG2(FragmentManager fragmentManager, HashMap<String, Object> map) {
        Long l = GameDualDeviceBeInvitedDialog.LLLFF;
        if (l != null) {
            C464790IKn.LIZ.LIZIZ(l.longValue());
        }
        if (C0TDF.LJI()) {
            C20441214yg.LJIIIZ("DualDeviceRtc", "GameDualDeviceBeInvitedDialog is connected");
            return;
        }
        String string = GameDualDeviceBeInvitedDialog.class.toString();
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(26.0f);
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof String) {
                C786410Ut5.LJJJI(str, (String) obj, bundle);
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            }
        }
        GameDualDeviceBeInvitedDialog.LLLFF = Long.valueOf(C19322110iZ.LIZLLL(fragmentManager, GameDualDeviceBeInvitedDialog.class, string, sheetOptions, bundle));
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameDualDeviceService
    public final String Id1(int i, String str, String str2) {
        GameDualDeviceParamsSetting gameDualDeviceParamsSetting = GameDualDeviceParamsSetting.INSTANCE;
        int i2 = gameDualDeviceParamsSetting.getParamSetting().width;
        int i3 = gameDualDeviceParamsSetting.getParamSetting().height;
        C495520Jby c495520Jby = new C495520Jby("snssdk1180://dual_device?");
        c495520Jby.LIZ(i2, "video_w");
        c495520Jby.LIZ(i3, "video_h");
        c495520Jby.LIZJ("did_sink", str);
        c495520Jby.LIZ(1, "is_rtc");
        c495520Jby.LIZJ("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        c495520Jby.LIZ(i, "ver");
        c495520Jby.LIZJ("connect_type", "one_click");
        if (str2 != null) {
            c495520Jby.LIZJ("sink_platform", str2);
        }
        return c495520Jby.LIZLLL();
    }
}
