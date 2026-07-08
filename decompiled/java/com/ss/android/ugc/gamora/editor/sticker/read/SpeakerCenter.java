package com.ss.android.ugc.gamora.editor.sticker.read;

import X.C09CT;
import X.C0CHQ;
import X.C123100dR;
import X.C2188811AlT;
import X.C2219091BtD;
import X.C311110CHl;
import X.InterfaceC1457290o1f;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class SpeakerCenter {
    public static final Keva LIZ = Keva.getRepo("text_to_speech_v2");

    public static String LIZ() {
        return LIZ.getString("setCheckVoice", "");
    }

    public static KevaSpeakerBean LIZIZ() {
        String string = LIZ.getString("check_voice_effect_bean", "");
        return C123100dR.LIZ(string) ? (KevaSpeakerBean) GsonProtectorUtils.fromJson(C2219091BtD.LIZJ(), string, KevaSpeakerBean.class) : new KevaSpeakerBean(null, null, null, null, "", "", false, 0L, 0L);
    }

    public static String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        InterfaceC1457290o1f accountService = C0CHQ.LIZ().getAccountService();
        sbLIZ.append(accountService.isLogin() ? accountService.getCurrentUserID() : "");
        sbLIZ.append('_');
        sbLIZ.append(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
        sbLIZ.append('_');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL() {
        return LJFF() ? LIZ().length() > 0 ? LIZ() : "" : LIZ.getString("setLastVoice", "");
    }

    public static String LJ() {
        if (LJFF()) {
            return C123100dR.LIZ(LIZIZ().voiceEffectId) ? LIZIZ().voiceEffectId : "";
        }
        String string = LIZ.getString("last_voice_effect_bean", "");
        String str = (C123100dR.LIZ(string) ? (KevaSpeakerBean) GsonProtectorUtils.fromJson(C2219091BtD.LIZJ(), string, KevaSpeakerBean.class) : new KevaSpeakerBean(null, null, null, null, "", "", false, 0L, 0L)).voiceEffectId;
        return str != null ? str : "";
    }

    public static boolean LJFF() {
        if (C311110CHl.LIZ()) {
            return LIZ.getBoolean("checkbox", false);
        }
        return false;
    }

    public static final class KevaSpeakerBean implements Serializable {

        @C09CT("is_creator")
        public final boolean isCreatorVoice;

        @C09CT("tts_anchor_release_date")
        public final long ttsAnchorReleaseDate;

        @C09CT("tts_release_date")
        public final long ttsReleaseDate;

        @C09CT("voice_anchor_name")
        public final String voiceAnchorName;

        @C09CT("creator_user_id")
        public final String voiceCreatorUserId;

        @C09CT("creator_user_name")
        public final String voiceCreatorUserName;

        @C09CT("voice_effect_icon_url")
        public final String voiceEffectIconUrl;

        @C09CT("voice_effect_id")
        public final String voiceEffectId;

        @C09CT("voice_effect_resource_id")
        public final String voiceEffectResourceId;

        public KevaSpeakerBean() {
            this(null, null, null, null, "", "", false, 0L, 0L);
        }

        public final boolean isCreatorVoice() {
            return this.isCreatorVoice;
        }

        public KevaSpeakerBean(String str, String str2, String str3, String str4, String str5, String str6, boolean z, long j, long j2) {
            this.voiceEffectId = str;
            this.voiceEffectIconUrl = str2;
            this.voiceAnchorName = str3;
            this.voiceEffectResourceId = str4;
            this.voiceCreatorUserId = str5;
            this.voiceCreatorUserName = str6;
            this.isCreatorVoice = z;
            this.ttsAnchorReleaseDate = j;
            this.ttsReleaseDate = j2;
        }
    }

    public static boolean LJI(String str) {
        Keva keva = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_NUM");
        int i = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("_TIME");
        long j = keva.getLong(C2188811AlT.LIZIZ(sbLIZ2), -1L);
        if (i >= 3 || System.currentTimeMillis() - j < 86400000) {
            return false;
        }
        return true;
    }

    public static void LJII(KevaSpeakerBean kevaSpeakerBean) {
        LIZ.storeString("check_voice_effect_bean", GsonProtectorUtils.toJson(C2219091BtD.LIZJ(), kevaSpeakerBean));
    }

    public static void LJIIIZ(String str) {
        Keva keva = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_NUM");
        int i = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0) + 1;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("_NUM");
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append("_TIME");
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ3), System.currentTimeMillis());
    }

    public static void LJIIIIZZ(String str, String str2) {
        Keva keva = LIZ;
        keva.storeString("setLastSpeakerId", str);
        keva.storeString("setLastStreamSpeakerId", str2);
    }
}
