package com.ss.android.ugc.aweme.im.service.impl.core;

import X.C05CL;
import X.C08TN;
import X.C0I0B;
import X.C0PEM;
import X.C1494005t4;
import X.C1510700pPo;
import X.C1697810uHb;
import X.C1730606q8;
import X.C202094145s;
import X.C2206221BWi;
import X.C2296808zG;
import X.C23250099c;
import X.C293370Beh;
import X.C830490Whz;
import X.EnumC1609850rzj;
import X.EnumC883570YlP;
import X.InterfaceC1103750epR;
import X.InterfaceC1493105sv;
import X.InterfaceC1493505sz;
import X.InterfaceC909580ZmG;
import android.os.SystemClock;
import com.bytedance.android.starship.solaria.profile.StarshipSolariaProfile;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.im.common.setting.IMUserPortraitDelaySettingsModel;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager;
import com.ss.android.ugc.aweme.im.service.impl.core.IMUserPortraitManager;
import com.ss.android.ugc.aweme.im.userportrait.api.service.IMUserPortraitApi;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public final class IMUserPortraitManager implements IIMUserPortraitManager {
    public static final IMUserPortraitManager LIZIZ = new IMUserPortraitManager();
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("send_message_label", "receive_message_label", "like_message_label", "low_im_activeness", "has_mutual_follow_friends", "receive_message_not_15_label");
    public static final Map<String, String> LIZLLL = new LinkedHashMap();
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;

    public static final class Service implements IIMUserPortraitManager {
        public final /* synthetic */ IMUserPortraitManager LIZIZ = IMUserPortraitManager.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
        public final boolean LIZ(long j, String str, String str2) {
            return this.LIZIZ.LIZ(j, str, str2);
        }

        @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
        public final int LIZIZ(String str) {
            return this.LIZIZ.LIZIZ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
        public final void LIZJ(long j, String str) {
            this.LIZIZ.LIZJ(j, str);
        }

        @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
        public final boolean LIZLLL(long j, long j2, String str, String str2) {
            return this.LIZIZ.LIZLLL(j, j2, str, str2);
        }

        @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
        public final void LJ(long j, String str, List list) {
            this.LIZIZ.LJ(j, str, list);
        }

        @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
        public final boolean LJFF(long j, long j2, String str) {
            return this.LIZIZ.LJFF(j, j2, str);
        }

        @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
        public final void LJI(boolean z, EnumC883570YlP enumC883570YlP, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LJI(z, enumC883570YlP, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
        public final void LJII(String str, String str2) {
            this.LIZIZ.LJII(str, str2);
        }

        @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
        public final void LJIIIIZZ(Long l, String str) {
            this.LIZIZ.LJIIIIZZ(l, str);
        }

        @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
        public final boolean LJIIIZ() {
            this.LIZIZ.getClass();
            return IMUserPortraitManager.LJFF;
        }
    }

    static {
        if ((C293370Beh.LIZ() & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 2048) {
            StarshipSolariaProfile.LJII().LIZIZ(new InterfaceC1103750epR() { // from class: X.05CK
                @Override // X.InterfaceC1103750epR
                public final void LIZ() {
                    IMUserPortraitManager.LIZIZ.getClass();
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05CJ(null), 3);
                }
            });
        }
    }

    public static long LJIIJ() {
        return (C293370Beh.LIZ() & 64) == 64 ? ((IMUserPortraitDelaySettingsModel) C2206221BWi.LIZIZ.getValue()).longDelay : ((IMUserPortraitDelaySettingsModel) C2206221BWi.LIZIZ.getValue()).shortDelay;
    }

    public static String LJIILIIL() {
        return (C293370Beh.LIZ() & 1024) == 1024 ? LJIIL("receive_message_not_15_label") : LJIIL("receive_message_label");
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
    public final boolean LJIIIZ() {
        return LJFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIJJI(java.lang.String r11) {
        /*
            X.01GW r0 = X.C05CL.LIZ
            java.lang.Object r6 = r0.getValue()
            com.bytedance.keva.Keva r6 = (com.bytedance.keva.Keva) r6
            int r1 = r11.hashCode()
            r0 = -541959104(0xffffffffdfb25c40, float:-2.5704436E19)
            r5 = 0
            if (r1 == r0) goto L34
            r0 = 569317809(0x21ef19b1, float:1.620207E-18)
            if (r1 == r0) goto L29
            r0 = 585859468(0x22eb818c, float:6.383404E-18)
            if (r1 != r0) goto L3f
            java.lang.String r0 = "receive_message_local_label"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L3f
            java.lang.String r10 = "receive_message_local_time_stamp"
        L26:
            if (r10 == 0) goto L7a
            goto L41
        L29:
            java.lang.String r0 = "send_message_local_label"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L3f
            java.lang.String r10 = "send_message_local_time_stamp"
            goto L26
        L34:
            java.lang.String r0 = "like_message_local_label"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L3f
            java.lang.String r10 = "like_message_local_time_stamp"
            goto L26
        L3f:
            r10 = r5
            goto L26
        L41:
            java.lang.String r0 = r6.getString(r10, r5)     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L54
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L50
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L50
            goto L55
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L54:
            r0 = r5
        L55:
            if (r0 == 0) goto L7a
            long r0 = r0.longValue()
            long r8 = com.ss.android.common.util.NetworkUtils.getServerTimeMills()
            java.lang.String r7 = r6.getString(r11, r5)
            long r3 = r8 - r0
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L79
            java.lang.String r0 = "0"
            r6.storeString(r11, r0)
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r6.storeString(r10, r0)
            return r5
        L79:
            return r7
        L7a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.impl.core.IMUserPortraitManager.LJIIJJI(java.lang.String):java.lang.String");
    }

    public static String LJIIL(String str) {
        boolean z;
        String strLIZJ = C1510700pPo.LIZ().LIZJ(str);
        if (strLIZJ == null) {
            if ((C293370Beh.LIZ() & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 2048) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return null;
            }
            LJ = true;
            return ((Keva) C05CL.LIZ.getValue()).getString(str, null);
        }
        return strLIZJ;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
    public final int LIZIZ(String str) {
        IMUserPortraitApi.LIZ.getClass();
        return C1730606q8.LIZ().LJ().LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
    public final void LIZJ(long j, String str) {
        IMUserPortraitApi.LIZ.getClass();
        C1730606q8.LIZ().LJ().LIZJ(j, str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
    public final void LJII(String str, String str2) {
        ((Keva) C05CL.LIZ.getValue()).storeString(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
    public final void LJIIIIZZ(Long l, String str) {
        IMUserPortraitApi.LIZ.getClass();
        InterfaceC909580ZmG interfaceC909580ZmGLJ = C1730606q8.LIZ().LJ();
        if (l != null) {
            long jLongValue = l.longValue();
            if (str == null) {
                return;
            }
            interfaceC909580ZmGLJ.LJIIIZ(jLongValue, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
    public final boolean LIZ(long j, String str, String str2) {
        IMUserPortraitApi.LIZ.getClass();
        return C1730606q8.LIZ().LJ().LIZ(j, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
    public final void LJ(long j, String str, List list) {
        IMUserPortraitApi.LIZ.getClass();
        C1730606q8.LIZ().LJ().LJ(j, str, list);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
    public final boolean LJFF(long j, long j2, String str) {
        IMUserPortraitApi.LIZ.getClass();
        return C1730606q8.LIZ().LJ().LJFF(j, j2, str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
    public final void LJI(boolean z, EnumC883570YlP enumC883570YlP, InterfaceC1493105sv interfaceC1493105sv) {
        if (LJI) {
            return;
        }
        LJI = true;
        Map<String, String> map = LIZLLL;
        map.put("need_ensure", String.valueOf(z));
        map.put(Scene.SCENE_SERVICE, enumC883570YlP.toString());
        interfaceC1493105sv.sendEvent("user_portrait_im_sdk_ensure", map);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager
    public final boolean LIZLLL(long j, long j2, String str, String str2) {
        IMUserPortraitApi.LIZ.getClass();
        return C1730606q8.LIZ().LJ().LIZLLL(j, j2, str, str2);
    }

    public static void LJIILJJIL(IMUserPortraitManager iMUserPortraitManager, int i, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ;
        boolean z;
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        if ((i2 & 32) != 0) {
            str4 = null;
        }
        if ((i2 & 64) != 0) {
            str5 = null;
        }
        if ((i2 & 128) != 0) {
            str6 = null;
        }
        if ((i2 & 256) != 0) {
            str7 = null;
        }
        if ((i2 & 512) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        } else {
            interfaceC1493505szLIZIZ = null;
        }
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("experiment", String.valueOf(i));
        c830490Whz.put("delay_time", String.valueOf(j));
        c830490Whz.put("has_mutual_follow_friends", str);
        c830490Whz.put("send_message_label", str2);
        c830490Whz.put("receive_message_label", str3);
        c830490Whz.put("like_message_label", str4);
        c830490Whz.put("send_message_local_label", str5);
        c830490Whz.put("receive_message_local_label", str6);
        c830490Whz.put("like_message_local_label", str7);
        c830490Whz.put("server_portrait_compensated", String.valueOf(LJ));
        c830490Whz.put("inside_first_do_frame", String.valueOf(C08TN.LIZ().LJIILJJIL()));
        boolean z2 = true;
        if (C08TN.LIZ().LJJJJZI.ordinal() >= EnumC1609850rzj.MAIN_FOCUS.ordinal()) {
            z = true;
        } else {
            z = false;
        }
        c830490Whz.put("is_cold_boot_finish", String.valueOf(z));
        if (C08TN.LIZ().LJJJJZI.ordinal() < EnumC1609850rzj.FEED_TOTAL.ordinal()) {
            z2 = false;
        }
        c830490Whz.put("is_first_feed_finish", String.valueOf(z2));
        c830490Whz.put("trigger_time_from_attach_base_context", String.valueOf(SystemClock.uptimeMillis() - C202094145s.LJIILL));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1494005t4(interfaceC1493505szLIZIZ, c830490Whz, null), 3);
    }
}
