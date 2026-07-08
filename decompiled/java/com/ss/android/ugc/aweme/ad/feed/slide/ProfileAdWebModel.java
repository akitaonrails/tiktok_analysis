package com.ss.android.ugc.aweme.ad.feed.slide;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class ProfileAdWebModel {

    @C09CT("left_slide_lynx_page_preload_progress_percentage")
    public final int preloadLynxProcess;

    @C09CT("left_slide_webpage_preload_progress_percentage")
    public final int preloadWebProcess;

    @C09CT("left_slide_lynx_page_track_progress_percentage")
    public final int trackLynxProcess;

    @C09CT("left_slide_webpage_track_progress_percentage")
    public final int trackWebProcess;

    public ProfileAdWebModel() {
        this(100, 100, 100, 100);
    }

    public ProfileAdWebModel(int i, int i2, int i3, int i4) {
        this.trackWebProcess = i;
        this.preloadWebProcess = i2;
        this.trackLynxProcess = i3;
        this.preloadLynxProcess = i4;
    }
}
