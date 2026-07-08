package com.ss.android.ugc.aweme.stemfeed.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class StemFeedConfig {

    @C09CT("bkgd_video")
    public UrlStruct bkgdVideo;

    @C09CT("bkgd_video_cover")
    public UrlStruct bkgdVideoCover;

    @C09CT("welcome_popup")
    public WelcomePopup welcomePopup;

    public StemFeedConfig() {
        this(new WelcomePopup("", "", ""), null, null);
    }

    public StemFeedConfig(WelcomePopup welcomePopup, UrlStruct urlStruct, UrlStruct urlStruct2) {
        this.welcomePopup = welcomePopup;
        this.bkgdVideo = urlStruct;
        this.bkgdVideoCover = urlStruct2;
    }
}
