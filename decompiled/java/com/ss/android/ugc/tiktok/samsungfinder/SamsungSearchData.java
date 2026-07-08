package com.ss.android.ugc.tiktok.samsungfinder;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SamsungSearchData implements Serializable {

    @C09CT("search_videos")
    public final List<VideosInfo> videosInfo;

    public SamsungSearchData(List<VideosInfo> list) {
        this.videosInfo = list;
    }
}
