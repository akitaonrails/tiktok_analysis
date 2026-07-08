package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBBasicInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBCourse;
import com.bytedance.android.livesdk.chatroom.api.SMBServiceSKU;
import com.bytedance.android.livesdk.chatroom.api.VerificationWarningInfo;
import java.util.ArrayList;
import java.util.List;
import webcast.data.DailyChallenges;

/* JADX INFO: loaded from: classes18.dex */
public final class SMBCreatorInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class DailyChallengesInfo {

        @C09CT("challenges")
        public DailyChallenges challenges;

        @C09CT("in_season")
        public boolean inSeason;

        @C09CT("unclaimed_rewards_number")
        public long unclaimedRewardsNumber;

        @C09CT("unclaimed_rewards_value")
        public long unclaimedRewardsValue;

        @C09CT("unclaimed_rewards_value_local")
        public long unclaimedRewardsValueLocal;

        @C09CT("unclaimed_rewards_value_local_formatted")
        public String unclaimedRewardsValueLocalFormatted = "";

        @C09CT("currency_code")
        public String currencyCode = "";
    }

    public static final class ResponseData {

        @C09CT("business_overview")
        public BusinessOverView businessOverview;

        @C09CT("daily_challenges_info")
        public DailyChallengesInfo dailyChallengesInfo;

        @C09CT("dm_intent_leads_count")
        public long dmIntentLeadsCount;

        @C09CT("enable_form_v2")
        public boolean enableFormV2;

        @C09CT("has_been_blacklisted")
        public boolean hasBeenBlacklisted;

        @C09CT("has_live_permission")
        public int hasLivePermission;

        @C09CT("industry_l2_type")
        public int industryL2Type;

        @C09CT("industry_type")
        public int industryType;

        @C09CT("is_in_grace_period")
        public boolean isInGracePeriod;

        @C09CT("is_smb_hidden")
        public boolean isSmbHidden;

        @C09CT("is_target_anchor")
        public boolean isTargetAnchor;

        @C09CT("live_scripts_version")
        public int liveScriptsVersion;

        @C09CT("smb_basic_info")
        public SMBBasicInfo smbBasicInfo;

        @C09CT("smb_is_open")
        public boolean smbIsOpen;

        @C09CT("smb_opt_in_source")
        public int smbOptInSource;

        @C09CT("smb_opt_in_status")
        public int smbOptInStatus;

        @C09CT("smb_opt_in_time")
        public long smbOptInTime;

        @C09CT("subscription_type")
        public int subscriptionType;

        @C09CT("tip")
        public SmbTip tip;

        @C09CT("verification_info")
        public VerificationInfo verificationInfo;

        @C09CT("verification_warning_info")
        public VerificationWarningInfo verificationWarningInfo;

        @C09CT("service_sku_list")
        public List<SMBServiceSKU> serviceSkuList = new ArrayList();

        @C09CT("course_list")
        public List<SMBCourse> courseList = new ArrayList();

        @C09CT("tip_list")
        public List<SmbTip> tipList = new ArrayList();

        @C09CT("service_bio_tasks")
        public List<ServiceBioTask> serviceBioTasks = new ArrayList();

        @C09CT("sku_order")
        public List<Long> skuOrder = new ArrayList();

        @C09CT("profile_biolink")
        public String profileBiolink = "";

        @C09CT("authorized_biolink_list")
        public List<String> authorizedBiolinkList = new ArrayList();
    }
}
