package com.ss.android.ugc.aweme.account.login.trustedfriends;

import X.C09CT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class TrustedFriendsRecoverySettingsModel {

    @C09CT("error_allowList")
    public final List<String> allowedErrorList;

    @C09CT("expire_time_minutes")
    public final int expireTimeMinutes;

    @C09CT("is_enabled")
    public final boolean isEnabled;

    @C09CT("lynx_url")
    public final String lynxUrl;

    @C09CT("polling_interval_seconds")
    public final int pollingIntervalSeconds;

    @C09CT("show_security_checkup_tool")
    public final boolean showSecurityCheckupTool;

    public TrustedFriendsRecoverySettingsModel() {
        this(false, 0, 0, null, null, false, 63, null);
    }

    public TrustedFriendsRecoverySettingsModel(boolean z, int i, int i2, List<String> list, String str, boolean z2) {
        this.isEnabled = z;
        this.pollingIntervalSeconds = i;
        this.expireTimeMinutes = i2;
        this.allowedErrorList = list;
        this.lynxUrl = str;
        this.showSecurityCheckupTool = z2;
    }

    public TrustedFriendsRecoverySettingsModel(boolean z, int i, int i2, List list, String str, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? true : z, (i3 & 2) != 0 ? 5 : i, (i3 & 4) != 0 ? 180 : i2, (i3 & 8) != 0 ? Collections.singletonList("6") : list, (i3 & 16) != 0 ? "aweme://lynxview?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-internal-sg%2F9%2Fgecko%2Fresource%2Faccount_recovery_trusted_friend%2Fgecko_build%2Frow%2Fpages%2Fhome%2Ftemplate.js&use_spark=1&hide_nav_bar=1&trans_status_bar=1&enable_prefetch=1&bdhm_bid=trusted_friend_account_recovery_approval&bdhm_pid=trusted_friend_index_page" : str, (i3 & 32) != 0 ? false : z2);
    }
}
