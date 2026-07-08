package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.IndustrySelection;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import com.bytedance.android.livesdk.chatroom.api.UpsellIndustry;
import com.bytedance.android.livesdk.chatroom.api.UpsellRevokeInfo;
import com.bytedance.android.livesdk.chatroom.api.VerificationWarningInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class SMBOptInQualificationResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("active_sku_count")
        public long activeSkuCount;

        @C09CT("can_everyone_send_dm")
        public boolean canEveryoneSendDm;

        @C09CT("can_use_ai_dm_generation")
        public boolean canUseAiDmGeneration;

        @C09CT("has_live_permission")
        public int hasLivePermission;

        @C09CT("has_validated_industry_label")
        public boolean hasValidatedIndustryLabel;

        @C09CT("in_block_industry_cooling_down")
        public boolean inBlockIndustryCoolingDown;

        @C09CT("industry_selection")
        public IndustrySelection industrySelection;

        @C09CT("inferred_industry_type")
        public int inferredIndustryType;

        @C09CT("is_ba")
        public boolean isBa;

        @C09CT("leads_opt_in_status")
        public int leadsOptInStatus;

        @C09CT("max_leads_count_per_anchor")
        public long maxLeadsCountPerAnchor;

        @C09CT("qualification")
        public boolean qualification;

        @C09CT("qualification_info")
        public List<SMBOptInQualificationInfo> qualificationInfo = new ArrayList();

        @C09CT("revoke_info")
        public UpsellRevokeInfo revokeInfo;

        @C09CT("selected_industry_extra")
        public UpsellIndustry selectedIndustryExtra;

        @C09CT("service_plus_opt_in_status")
        public int servicePlusOptInStatus;

        @C09CT("smb_deactivation_info")
        public SmbDeactivationInfo smbDeactivationInfo;

        @C09CT("smb_pending_revoke_info")
        public SmbPendingRevokeInfo smbPendingRevokeInfo;

        @C09CT("verification_info")
        public SMBVerificationInfo verificationInfo;

        @C09CT("verification_warning_info")
        public VerificationWarningInfo verificationWarningInfo;
    }

    public static final class SmbDeactivationInfo {

        @C09CT("in_grace_period")
        public boolean inGracePeriod;

        @C09CT("is_smb_deactivated")
        public boolean isSmbDeactivated;
    }
}
