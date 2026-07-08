package tikcast.api.wallet;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class UserKYCIncentiveData {

    @C09CT("eligible_rewards_list")
    public List<IncentiveRewardsData> eligibleRewardsList = new ArrayList();

    @C09CT("has_rewards_issued")
    public boolean hasRewardsIssued;

    @C09CT("is_user_in_program")
    public boolean isUserInProgram;

    @C09CT("is_voucher_used")
    public boolean isVoucherUsed;

    @C09CT("show_us_text")
    public boolean showUsText;

    @C09CT("show_voucher_info")
    public boolean showVoucherInfo;

    @C09CT("user_kyc_status")
    public int userKycStatus;

    @C09CT("user_options")
    public IncentiveUserOptions userOptions;

    @C09CT("version")
    public int version;
}
