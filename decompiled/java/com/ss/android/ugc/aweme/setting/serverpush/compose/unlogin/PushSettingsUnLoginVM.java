package com.ss.android.ugc.aweme.setting.serverpush.compose.unlogin;

import X.C01GW;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C14XB;
import X.C14XC;
import X.C14XE;
import X.C14XF;
import X.C1701940uOG;
import X.C1954807lC;
import X.C20308114dD;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.C824390WVp;
import X.C824420WVs;
import X.InterfaceC0148002o;
import Y.ACallableS1S1001000_28;
import Y.AfS10S1110000_30;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.serverpush.model.NotificationSettings;
import com.ss.android.ugc.aweme.setting.serverpush.model.NotificationSettingsInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS42S0010000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class PushSettingsUnLoginVM extends AssemViewModel<C14XB> {
    public static NotificationSettings LLILZLL;
    public NotificationSettings LLILLJJLI;
    public C11JF LLILZ;
    public boolean LLILZIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(97));
    public final List<Runnable> LLILLL = new ArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C14XB(0);
    }

    public final int vQ2(String str) {
        NotificationSettingsInfo notificationSettingsInfo;
        NotificationSettings notificationSettings = this.LLILLJJLI;
        if (notificationSettings != null) {
            if (Intrinsics.LJFF(str, "recommend_video_push")) {
                NotificationSettingsInfo notificationSettingsInfo2 = notificationSettings.notificationSettingsInfo;
                if (notificationSettingsInfo2 != null) {
                    return notificationSettingsInfo2.pushDeviceRecommendVideo;
                }
                return -1;
            }
            if (Intrinsics.LJFF(str, "other_channel") && (notificationSettingsInfo = notificationSettings.notificationSettingsInfo) != null) {
                return notificationSettingsInfo.pushDeviceOtherChannel;
            }
            return -1;
        }
        return -1;
    }

    public final void yQ2(C14XF c14xf) {
        String str = "on";
        if (c14xf instanceof C14XE) {
            C14XE c14xe = (C14XE) c14xf;
            C824390WVp.LJFF(c14xe.LIZ, "push_settings_unlogin_open_system_notification");
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (!C824390WVp.LIZJ(c14xe.LIZ)) {
                str = "off";
            }
            c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
            C20684815ws.LJIILLIIL("notifications_click", c2344009Gk.LIZ);
            return;
        }
        if (c14xf instanceof C14XC) {
            if (this.LLILZIL) {
                return;
            }
            C14XC c14xc = (C14XC) c14xf;
            if (!C824420WVs.LIZIZ(c14xc.LIZ, "push_settings_unlogin_push_switch_change_intent")) {
                return;
            }
            this.LLILZIL = true;
            if (!c14xc.LIZJ && !C824420WVs.LIZ(c14xc.LIZIZ)) {
                setState(new AwS609S0100000_30(c14xf, 85));
                ((Keva) this.LL.getValue()).storeString("need_sync_channel_push_logout", c14xc.LIZIZ);
                this.LLILZIL = false;
                return;
            }
            boolean z = !c14xc.LIZJ;
            wQ2(c14xc.LIZIZ, z);
            String str2 = c14xc.LIZIZ;
            if (!z) {
                str = "off";
            }
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("label", str2);
            c2344009Gk2.LJIIIIZZ("to_status", str);
            C20684815ws.LJIILLIIL("notification_switch", c2344009Gk2.LIZ);
            return;
        }
        throw new C1954807lC();
    }

    public final void wQ2(String str, boolean z) {
        String str2;
        xQ2(str, z);
        if (Intrinsics.LJFF(str, "recommend_video_push")) {
            str2 = "push_device_recommend_video";
        } else {
            if (Intrinsics.LJFF(str, "other_channel")) {
                str2 = "push_device_other_channel";
            }
            zQ2(str, z);
        }
        disposeOnClear(C11NZ.LJJJJI(new ACallableS1S1001000_28(str2, z ? 1 : 0, 2)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new AfS10S1110000_30(this, str, z, 0), new AfS10S1110000_30(this, str, z, 1), new C20308114dD(this, 2)));
        zQ2(str, z);
    }

    public final void xQ2(String str, boolean z) {
        if (Intrinsics.LJFF(str, "recommend_video_push")) {
            setState(new AwS42S0010000_30(z, 0));
        } else {
            if (!Intrinsics.LJFF(str, "other_channel")) {
                return;
            }
            setState(new AwS42S0010000_30(z, 1));
        }
    }

    public final void zQ2(String str, boolean z) {
        NotificationSettingsInfo notificationSettingsInfo;
        NotificationSettings notificationSettings = this.LLILLJJLI;
        if (notificationSettings != null) {
            if (Intrinsics.LJFF(str, "recommend_video_push")) {
                NotificationSettingsInfo notificationSettingsInfo2 = notificationSettings.notificationSettingsInfo;
                if (notificationSettingsInfo2 != null) {
                    notificationSettingsInfo2.pushDeviceRecommendVideo = z ? 1 : 0;
                }
            } else if (Intrinsics.LJFF(str, "other_channel") && (notificationSettingsInfo = notificationSettings.notificationSettingsInfo) != null) {
                notificationSettingsInfo.pushDeviceOtherChannel = z ? 1 : 0;
            }
        }
        LLILZLL = this.LLILLJJLI;
    }
}
