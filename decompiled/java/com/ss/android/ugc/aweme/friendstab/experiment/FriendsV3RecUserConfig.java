package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3RecUserConfig {

    @C09CT("add_bottom_rec_user_card_list")
    public final boolean addBottomUserCard;

    @C09CT("add_middle_rec_user_card_list")
    public final boolean addMiddleUserCard;

    public FriendsV3RecUserConfig() {
        this(false, false);
    }

    public FriendsV3RecUserConfig(boolean z, boolean z2) {
        this.addMiddleUserCard = z;
        this.addBottomUserCard = z2;
    }
}
