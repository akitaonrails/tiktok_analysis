package com.ss.android.ugc.aweme.friendstab.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsLaunchDowngradeConfig {

    @C09CT("downgrade_friends_dialog_initialize")
    public final boolean downgradeFriendsDialogInitialize;

    @C09CT("downgrade_main_page_friends")
    public final boolean downgradeMainPageFriends;

    @C09CT("downgrade_observers_initialize")
    public final boolean downgradeObserversInitialize;

    @C09CT("downgrade_red_dot_initialize")
    public final boolean downgradeRedDotInitialize;

    @C09CT("enable_downgrade")
    public final boolean enableDowngrade;

    public FriendsLaunchDowngradeConfig() {
        this(false, true, true, true, true);
    }

    public FriendsLaunchDowngradeConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enableDowngrade = z;
        this.downgradeMainPageFriends = z2;
        this.downgradeFriendsDialogInitialize = z3;
        this.downgradeRedDotInitialize = z4;
        this.downgradeObserversInitialize = z5;
    }
}
