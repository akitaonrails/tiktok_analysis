package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import com.bytedance.android.livesdk.chatroom.api.VerificationWarningInfo;
import com.bytedance.android.livesdkapi.depend.model.live.CoverInfo;

/* JADX INFO: loaded from: classes18.dex */
public final class SMBVerificationInfoResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("dm_intent_leads_enabled")
        public boolean dmIntentLeadsEnabled;

        @C09CT("feature_enabled")
        public boolean featureEnabled;

        @C09CT("has_leads_genie_permission")
        public boolean hasLeadsGeniePermission;

        @C09CT("industry_l2_type")
        public int industryL2Type;

        @C09CT("is_acu_hot")
        public boolean isAcuHot;

        @C09CT("is_rba_verified")
        public boolean isRbaVerified;

        @C09CT("is_target_anchor")
        public boolean isTargetAnchor;

        @C09CT("user_avatar")
        public CoverInfo userAvatar;

        @C09CT("verification_info")
        public SMBVerificationInfo verificationInfo;

        @C09CT("verification_warning_info")
        public VerificationWarningInfo verificationWarningInfo;
    }
}
