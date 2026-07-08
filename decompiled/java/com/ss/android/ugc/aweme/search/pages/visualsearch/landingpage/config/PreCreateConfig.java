package com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class PreCreateConfig {

    @C09CT("enable_pre_create")
    public final int enablePreCreate;

    @C09CT("photo_count")
    public final int photoCount;

    @C09CT("remove_video_view")
    public final int removeVideoView;

    @C09CT("video_count")
    public final int videoCount;

    public PreCreateConfig() {
        this(0, 0, 0, 0);
    }

    public PreCreateConfig(int i, int i2, int i3, int i4) {
        this.enablePreCreate = i;
        this.videoCount = i2;
        this.photoCount = i3;
        this.removeVideoView = i4;
    }
}
