package com.ss.android.ugc.aweme.series.feed.profile.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesProfileTabItemModel {

    @C09CT("category")
    public final SeriesCategory category;

    @C09CT("cover")
    public final UrlModel collectionCover;

    @C09CT("collection_id")
    public final Long collectionId;

    @C09CT("title")
    public final String collectionName;

    @C09CT("num_videos")
    public final Long collectionVideoNum;

    @C09CT("first_unlocked_video_id")
    public final Long firstUnlockedVideoId;

    @C09CT("has_trailer")
    public final Boolean hasTrailer;

    @C09CT("is_limited_free")
    public Boolean isLimitedFree;

    @C09CT("last_watched")
    public Integer lastWatched;

    @C09CT("num_watched")
    public final Long numWatched;

    @C09CT("full_video_ids")
    public final List<String> videoIdList;

    @C09CT("video_list")
    public final List<ShortDramaVideoItemModel> videoModellist;

    public SeriesProfileTabItemModel(Long l, String str, UrlModel urlModel, Long l2, Long l3, Integer num, Boolean bool, SeriesCategory seriesCategory, List<String> list, List<ShortDramaVideoItemModel> list2, Boolean bool2, Long l4) {
        this.collectionId = l;
        this.collectionName = str;
        this.collectionCover = urlModel;
        this.collectionVideoNum = l2;
        this.numWatched = l3;
        this.lastWatched = num;
        this.isLimitedFree = bool;
        this.category = seriesCategory;
        this.videoIdList = list;
        this.videoModellist = list2;
        this.hasTrailer = bool2;
        this.firstUnlockedVideoId = l4;
    }
}
