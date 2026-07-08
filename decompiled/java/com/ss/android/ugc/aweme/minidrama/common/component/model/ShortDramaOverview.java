package com.ss.android.ugc.aweme.minidrama.common.component.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.model.BadgeType;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class ShortDramaOverview implements Serializable {

    @C09CT("badge_type")
    public BadgeType badgeType;

    @C09CT("categories")
    public String categories;

    @C09CT("category")
    public final SeriesCategory category;

    @C09CT("collection_id")
    public Long collectionId;

    @C09CT("collection_id_str")
    public String collectionIdStr;

    @C09CT("cover")
    public final UrlModel cover;

    @C09CT("full_video_ids")
    public final List<Long> fullVideoIds;

    @C09CT("heat_score")
    public Long heatScore;

    @C09CT("is_limited_free")
    public Boolean isLimitedFree;

    @C09CT("is_safety_selected")
    public final Boolean isSafe;

    @C09CT("label_hot")
    public Boolean labelHot;

    @C09CT("label_new")
    public Boolean labelNew;

    @C09CT("last_watched_time")
    public Long lastWatchTimestamp;

    @C09CT("last_watched")
    public Integer lastWatched;

    @C09CT("log_extra")
    public final Map<String, Object> logExtra;

    @C09CT("num_videos")
    public Long numVideos;

    @C09CT("num_watched")
    public Long numWatched;

    @C09CT("show_rank_badge")
    public final Boolean showRankBadge;

    @C09CT("title")
    public String title;

    public ShortDramaOverview() {
        this(null, null, null, null, null, null, null, 0L, 0L, -1, Boolean.FALSE, SeriesCategory.DEFAULT, Boolean.FALSE, 0L, BadgeType.NUM_WATCHED, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortDramaOverview)) {
            return false;
        }
        ShortDramaOverview shortDramaOverview = (ShortDramaOverview) obj;
        return Intrinsics.LJFF(this.collectionId, shortDramaOverview.collectionId) && Intrinsics.LJFF(this.collectionIdStr, shortDramaOverview.collectionIdStr) && Intrinsics.LJFF(this.title, shortDramaOverview.title) && Intrinsics.LJFF(this.cover, shortDramaOverview.cover) && Intrinsics.LJFF(this.labelHot, shortDramaOverview.labelHot) && Intrinsics.LJFF(this.labelNew, shortDramaOverview.labelNew) && Intrinsics.LJFF(this.categories, shortDramaOverview.categories) && Intrinsics.LJFF(this.numVideos, shortDramaOverview.numVideos) && Intrinsics.LJFF(this.numWatched, shortDramaOverview.numWatched) && Intrinsics.LJFF(this.lastWatched, shortDramaOverview.lastWatched) && Intrinsics.LJFF(this.isLimitedFree, shortDramaOverview.isLimitedFree) && this.category == shortDramaOverview.category && Intrinsics.LJFF(this.showRankBadge, shortDramaOverview.showRankBadge) && Intrinsics.LJFF(this.heatScore, shortDramaOverview.heatScore) && this.badgeType == shortDramaOverview.badgeType && Intrinsics.LJFF(this.fullVideoIds, shortDramaOverview.fullVideoIds) && Intrinsics.LJFF(this.isSafe, shortDramaOverview.isSafe) && Intrinsics.LJFF(this.lastWatchTimestamp, shortDramaOverview.lastWatchTimestamp) && Intrinsics.LJFF(this.logExtra, shortDramaOverview.logExtra);
    }

    public int hashCode() {
        Long l = this.collectionId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.collectionIdStr;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.cover;
        int iHashCode4 = (iHashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Boolean bool = this.labelHot;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.labelNew;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.categories;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.numVideos;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.numWatched;
        int iHashCode9 = (iHashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.lastWatched;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.isLimitedFree;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        SeriesCategory seriesCategory = this.category;
        int iHashCode12 = (iHashCode11 + (seriesCategory == null ? 0 : seriesCategory.hashCode())) * 31;
        Boolean bool4 = this.showRankBadge;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Long l4 = this.heatScore;
        int iHashCode14 = (iHashCode13 + (l4 == null ? 0 : l4.hashCode())) * 31;
        BadgeType badgeType = this.badgeType;
        int iHashCode15 = (iHashCode14 + (badgeType == null ? 0 : badgeType.hashCode())) * 31;
        List<Long> list = this.fullVideoIds;
        int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool5 = this.isSafe;
        int iHashCode17 = (iHashCode16 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Long l5 = this.lastWatchTimestamp;
        int iHashCode18 = (iHashCode17 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Map<String, Object> map = this.logExtra;
        return iHashCode18 + (map != null ? map.hashCode() : 0);
    }

    public final Boolean isLimitedFree() {
        return this.isLimitedFree;
    }

    public final Boolean isSafe() {
        return this.isSafe;
    }

    public final void setBadgeType(BadgeType badgeType) {
        this.badgeType = badgeType;
    }

    public final void setCategories(String str) {
        this.categories = str;
    }

    public final void setCollectionId(Long l) {
        this.collectionId = l;
    }

    public final void setCollectionIdStr(String str) {
        this.collectionIdStr = str;
    }

    public final void setHeatScore(Long l) {
        this.heatScore = l;
    }

    public final void setLabelHot(Boolean bool) {
        this.labelHot = bool;
    }

    public final void setLabelNew(Boolean bool) {
        this.labelNew = bool;
    }

    public final void setLastWatchTimestamp(Long l) {
        this.lastWatchTimestamp = l;
    }

    public final void setLastWatched(Integer num) {
        this.lastWatched = num;
    }

    public final void setLimitedFree(Boolean bool) {
        this.isLimitedFree = bool;
    }

    public final void setNumVideos(Long l) {
        this.numVideos = l;
    }

    public final void setNumWatched(Long l) {
        this.numWatched = l;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public ShortDramaOverview(Long l, String str, String str2, UrlModel urlModel, Boolean bool, Boolean bool2, String str3, Long l2, Long l3, Integer num, Boolean bool3, SeriesCategory seriesCategory, Boolean bool4, Long l4, BadgeType badgeType, List<Long> list, Boolean bool5, Long l5, Map<String, ? extends Object> map) {
        this.collectionId = l;
        this.collectionIdStr = str;
        this.title = str2;
        this.cover = urlModel;
        this.labelHot = bool;
        this.labelNew = bool2;
        this.categories = str3;
        this.numVideos = l2;
        this.numWatched = l3;
        this.lastWatched = num;
        this.isLimitedFree = bool3;
        this.category = seriesCategory;
        this.showRankBadge = bool4;
        this.heatScore = l4;
        this.badgeType = badgeType;
        this.fullVideoIds = list;
        this.isSafe = bool5;
        this.lastWatchTimestamp = l5;
        this.logExtra = map;
    }
}
