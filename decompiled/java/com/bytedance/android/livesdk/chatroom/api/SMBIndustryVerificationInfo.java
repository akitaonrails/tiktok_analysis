package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SMBIndustryVerificationInfo {

    @C09CT("approved_industry_badge_name")
    public String approvedIndustryBadgeName = "";

    @C09CT("blocked_reasons")
    public List<Integer> blockedReasons = new ArrayList();

    @C09CT("can_appeal")
    public boolean canAppeal;

    @C09CT("can_instant_apply")
    public boolean canInstantApply;

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("industry_enabled")
    public boolean industryEnabled;

    @C09CT("industry_l2_type")
    public int industryL2Type;

    @C09CT("rejection_reason_code")
    public int rejectionReasonCode;

    @C09CT("source")
    public int source;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
