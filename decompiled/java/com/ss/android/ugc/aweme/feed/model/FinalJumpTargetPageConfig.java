package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class FinalJumpTargetPageConfig implements Serializable {

    @C09CT("enable_auto_pull_up")
    public final boolean enableAutoPullUp;

    @C09CT("enable_full_screen_profile_landing_page")
    public final boolean enableFullScreenProfileLandingPage;

    @C09CT("landing_page_bottom_bar_type")
    public final int landingPageBottomBarType;

    @C09CT("middle_page_type")
    public final int middlePageType;

    public final boolean getEnableAutoPullUp() {
        return this.enableAutoPullUp;
    }

    public final boolean getEnableFullScreenProfileLandingPage() {
        return this.enableFullScreenProfileLandingPage;
    }

    public final int getLandingPageBottomBarType() {
        return this.landingPageBottomBarType;
    }

    public final int getMiddlePageType() {
        return this.middlePageType;
    }
}
