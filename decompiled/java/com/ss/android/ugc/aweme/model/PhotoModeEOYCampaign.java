package com.ss.android.ugc.aweme.model;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class PhotoModeEOYCampaign {

    @C09CT("anchor_icon_url")
    public String anchorIconUrl;

    @C09CT("anchor_title")
    public String anchorTitle;

    @C09CT("default_hashtag")
    public String defaultHashTag;

    public PhotoModeEOYCampaign() {
        this("2023unwrapped", "2023 Unwrapped", "https://p16.tiktokcdn.com/obj/tiktok-obj/activity_anchor_1_192.png");
    }

    public PhotoModeEOYCampaign(String str, String str2, String str3) {
        this.defaultHashTag = str;
        this.anchorTitle = str2;
        this.anchorIconUrl = str3;
    }
}
