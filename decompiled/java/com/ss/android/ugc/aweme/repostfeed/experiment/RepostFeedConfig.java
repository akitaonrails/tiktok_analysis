package com.ss.android.ugc.aweme.repostfeed.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class RepostFeedConfig {

    @C09CT("bottom_reminder")
    public final int bottomReminder;

    @C09CT("enable_repost_feed")
    public final int enableRepostFeed;

    @C09CT("landing_to_repost")
    public final int landingToRepostFeed;

    @C09CT("top_reminder")
    public final int topReminder;

    @C09CT("use_popup_manager")
    public final int usePopupManager;

    public RepostFeedConfig() {
        this(0, 0, 0, 0, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepostFeedConfig)) {
            return false;
        }
        RepostFeedConfig repostFeedConfig = (RepostFeedConfig) obj;
        return this.enableRepostFeed == repostFeedConfig.enableRepostFeed && this.bottomReminder == repostFeedConfig.bottomReminder && this.topReminder == repostFeedConfig.topReminder && this.landingToRepostFeed == repostFeedConfig.landingToRepostFeed && this.usePopupManager == repostFeedConfig.usePopupManager;
    }

    public RepostFeedConfig(int i, int i2, int i3, int i4, int i5) {
        this.enableRepostFeed = i;
        this.bottomReminder = i2;
        this.topReminder = i3;
        this.landingToRepostFeed = i4;
        this.usePopupManager = i5;
    }
}
