package com.ss.android.ugc.aweme.cubes.api;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class GoogleCubesVideosData implements Serializable {

    @C09CT("display_settings")
    public final DisplayIcons displayIcons;

    @C09CT("suggest_videos")
    public final List<VideosInfo> videosInfo;

    public GoogleCubesVideosData(DisplayIcons displayIcons, List<VideosInfo> list) {
        this.displayIcons = displayIcons;
        this.videosInfo = list;
    }
}
