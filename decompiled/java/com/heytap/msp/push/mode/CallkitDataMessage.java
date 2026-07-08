package com.heytap.msp.push.mode;

import X.C2188811AlT;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.utils.b;

/* JADX INFO: loaded from: classes14.dex */
public final class CallkitDataMessage extends BaseMode {
    public final String mAppId;
    public final String mContent;
    public final String mDescription;
    public final String mMessageId;
    public final String mMessagePathType;
    public final int mType;

    public CallkitDataMessage(Intent intent, int i) {
        this.mAppId = safeDecrypt(INVOKEVIRTUAL_com_heytap_msp_push_mode_CallkitDataMessage_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "appID"));
        this.mMessageId = safeDecrypt(INVOKEVIRTUAL_com_heytap_msp_push_mode_CallkitDataMessage_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "messageID"));
        this.mContent = safeDecrypt(INVOKEVIRTUAL_com_heytap_msp_push_mode_CallkitDataMessage_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "content"));
        this.mDescription = safeDecrypt(INVOKEVIRTUAL_com_heytap_msp_push_mode_CallkitDataMessage_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "description"));
        this.mMessagePathType = safeDecrypt(INVOKEVIRTUAL_com_heytap_msp_push_mode_CallkitDataMessage_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "messagePathType"));
        this.mType = i;
    }

    public static String safeDecrypt(String str) {
        try {
            return b.d(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public String getAppID() {
        return this.mAppId;
    }

    public String getContent() {
        return this.mContent;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getMessageID() {
        return this.mMessageId;
    }

    public String getMessagePathType() {
        return this.mMessagePathType;
    }

    @Override // com.heytap.msp.push.mode.BaseMode
    public int getType() {
        return this.mType;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CallkitDataMessage{messageId='");
        sbLIZ.append(this.mMessageId);
        sbLIZ.append('\'');
        sbLIZ.append(", appId='");
        sbLIZ.append(this.mAppId);
        sbLIZ.append('\'');
        sbLIZ.append(", content='");
        sbLIZ.append(this.mContent);
        sbLIZ.append('\'');
        sbLIZ.append(", description='");
        sbLIZ.append(this.mDescription);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String INVOKEVIRTUAL_com_heytap_msp_push_mode_CallkitDataMessage_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
