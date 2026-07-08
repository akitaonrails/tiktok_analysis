package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class FeedLauncherShortcutAddExpModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("follow_guide")
    public final boolean followGuide;

    @C09CT("frequency_control_mode")
    public final int frequencyControlMode;

    @C09CT("friends_guide")
    public final boolean friendsGuide;

    @C09CT("inbox_guide")
    public final boolean inboxGuide;

    @C09CT("search_guide")
    public final boolean searchGuide;

    @C09CT("shop_guide")
    public final boolean shopGuide;

    public FeedLauncherShortcutAddExpModel() {
        this(false, false, false, false, false, false, 0);
    }

    public FeedLauncherShortcutAddExpModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        this.enable = z;
        this.inboxGuide = z2;
        this.searchGuide = z3;
        this.followGuide = z4;
        this.friendsGuide = z5;
        this.shopGuide = z6;
        this.frequencyControlMode = i;
    }
}
