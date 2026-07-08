package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaDNUFeedCardConfig implements Serializable {

    @C09CT("not_show_card_toast")
    public final String notShowCardToast;

    @C09CT("not_show_drama_tab_toast")
    public final String notShowDramaTabToast;

    @C09CT("not_show_innerfeed_toast")
    public final String notShowInnerFeedToast;

    @C09CT("not_show_insert_video_toast")
    public final String notShowInsertVideoToast;

    @C09CT("should_show_card")
    public final Boolean shouldShowCard;

    @C09CT("should_show_drama_tab")
    public final Boolean shouldShowDramaTab;

    @C09CT("should_show_innerfeed")
    public final Boolean shouldShowInnerFeed;

    @C09CT("should_show_insert_video")
    public final Boolean shouldShowInsertVideo;

    public DramaDNUFeedCardConfig() {
        this(null, null, null, null, null, null, null, null);
    }

    public DramaDNUFeedCardConfig(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, Boolean bool4, String str4) {
        this.shouldShowCard = bool;
        this.shouldShowDramaTab = bool2;
        this.shouldShowInnerFeed = bool3;
        this.notShowCardToast = str;
        this.notShowDramaTabToast = str2;
        this.notShowInnerFeedToast = str3;
        this.shouldShowInsertVideo = bool4;
        this.notShowInsertVideoToast = str4;
    }
}
