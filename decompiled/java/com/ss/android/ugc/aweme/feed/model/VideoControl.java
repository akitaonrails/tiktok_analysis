package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class VideoControl implements Serializable {

    @C09CT("allow_download")
    public Boolean allowDownload;

    @C09CT("draft_progress_bar")
    public int draftProgressBar;

    @C09CT("allow_duet")
    public boolean isAllowDuet;

    @C09CT("allow_dynamic_wallpaper")
    public boolean isAllowDynamicWallpaper;

    @C09CT("allow_react")
    public boolean isAllowReact;

    @C09CT("prevent_download_type")
    public int preventDownloadType;

    @C09CT("share_type")
    public int shareType;

    @C09CT("show_progress_bar")
    public int showProgressBar;

    @C09CT("timer_status")
    public int timerStatus = 1;

    @C09CT("allow_music")
    public boolean isAllowMusic = true;
}
