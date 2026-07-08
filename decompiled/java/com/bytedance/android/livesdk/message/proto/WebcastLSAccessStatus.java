package com.bytedance.android.livesdk.message.proto;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class WebcastLSAccessStatus {

    @C09CT("is_upgrade_restricted")
    public boolean isUpgradeRestricted;

    @C09CT("punish_detail_url")
    public String punishDetailUrl = "";

    @C09CT("upgrade_restriction_end_day")
    public String upgradeRestrictionEndDay = "";

    @C09CT("user_access_status")
    public boolean userAccessStatus;
}
