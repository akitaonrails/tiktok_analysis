package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class MiniDramaOverview implements Serializable {

    @C09CT("collection_id")
    public Long collectionId;

    @C09CT("cover")
    public UrlModel cover;

    @C09CT("end_time_in_ms")
    public Long endTimeInMs;

    @C09CT("num_watched")
    public Integer numWatched;

    @C09CT("start_time_in_ms")
    public Long startTimeInMs;

    @C09CT("theme_tag_list")
    public List<String> themeTagList;

    @C09CT("title")
    public String title;

    @C09CT("video_id")
    public Long videoId;

    public MiniDramaOverview() {
        this(null, null, null, null, null, null, null, null);
    }

    public MiniDramaOverview(Long l, String str, UrlModel urlModel, Integer num, List<String> list, Long l2, Long l3, Long l4) {
        this.collectionId = l;
        this.title = str;
        this.cover = urlModel;
        this.numWatched = num;
        this.themeTagList = list;
        this.startTimeInMs = l2;
        this.endTimeInMs = l3;
        this.videoId = l4;
    }
}
