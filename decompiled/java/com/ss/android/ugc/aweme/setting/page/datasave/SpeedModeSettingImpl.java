package com.ss.android.ugc.aweme.setting.page.datasave;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C07MW;
import X.C0XQ7;
import X.C1493080oxO;
import X.C1493090oxP;
import X.C1697810uHb;
import X.C1904560zf4;
import X.C1906580ziK;
import X.C1908480zlO;
import X.C19323510in;
import X.C2188811AlT;
import X.C290160BYw;
import X.C452501pT;
import X.C520150Kab;
import X.EnumC1493040oxK;
import Y.ARunnableS18S0201000_12;
import android.app.Activity;
import android.os.Handler;
import com.bytedance.keva.Keva;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes29.dex */
public final class SpeedModeSettingImpl implements ISpeedModeSetting {
    public static final List<String> LJI = C1697810uHb.LJIIJJI("LiveBgBroadcastActivity", "LivePlayActivity", "StartLiveActivity", "LiveBroadcastSigningActivity", "GiftAdActivity", "LiveSettingActivity", "LiveContainerActivity", "LiveBroadcastActivity", "LiveBroadcastSceneWrapperActivity", "LiveBroadcastBgSceneWrapperActivity", "VoiceBroadcastSceneWrapperActivity");
    public int LIZIZ;
    public C1904560zf4 LJ;
    public long LIZ = -1;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 126));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(361));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(654));

    public static String LJI() {
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_enable_smart_data_switch_");
        sbLIZ.append(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId);
        sbLIZ.append('_');
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting
    public final void LJ() {
        ((Handler) this.LIZJ.getValue()).removeMessages(10001);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting
    public final EnumC1493040oxK LJFF() {
        int i = ((Keva) this.LJFF.getValue()).getInt(LJI(), 0);
        return i != -1 ? i != 1 ? EnumC1493040oxK.NONE : EnumC1493040oxK.ALLOW : EnumC1493040oxK.NOT_ALLOW;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting
    public final void LIZ() {
        LJII(2131848348);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting
    public final void LIZLLL() {
        LJII(2131848347);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting
    public final void LIZIZ(C1493090oxP c1493090oxP) {
        C1904560zf4 c1904560zf4 = this.LJ;
        if (c1904560zf4 != null) {
            C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
            c1908480zlO.LJI(c1904560zf4);
            c1908480zlO.LJIIZILJ(c1904560zf4);
        }
        C1904560zf4 c1904560zf42 = new C1904560zf4(c1493090oxP);
        this.LJ = c1904560zf42;
        C1908480zlO c1908480zlO2 = C1908480zlO.LIZIZ;
        c1908480zlO2.LJ(c1904560zf42);
        c1908480zlO2.LJIILL(c1904560zf42, new int[]{1018});
        ((C19323510in) this.LIZLLL.getValue()).LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting
    public final void LIZJ(EnumC1493040oxK enumC1493040oxK) {
        int i = C1493080oxO.LIZ[enumC1493040oxK.ordinal()];
        if (i != 1) {
            if (i != 2) {
                ((Keva) this.LJFF.getValue()).storeInt(LJI(), 0);
                return;
            } else {
                ((Keva) this.LJFF.getValue()).storeInt(LJI(), -1);
                return;
            }
        }
        ((Keva) this.LJFF.getValue()).storeInt(LJI(), 1);
    }

    public final void LJII(int i) {
        Boolean boolValueOf;
        if (this.LIZIZ > 3) {
            return;
        }
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null && !topActivity.isFinishing()) {
            boolean zContains = LJI.contains(topActivity.getClass().getSimpleName());
            if (!C290160BYw.LIZ() && !C07MW.LIZ()) {
                if (zContains) {
                    return;
                }
            } else if (zContains || C520150Kab.LIZIZ(C1906580ziK.LJ())) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.LIZ > 600000) {
                ((Handler) this.LIZJ.getValue()).post(new ARunnableS18S0201000_12(i, topActivity, this, 5));
                this.LIZ = jCurrentTimeMillis;
            }
            ((Handler) this.LIZJ.getValue()).sendEmptyMessageDelayed(10001, 600000L);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toast failed,activity finish ");
        if (topActivity != null) {
            boolValueOf = Boolean.valueOf(topActivity.isFinishing());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
