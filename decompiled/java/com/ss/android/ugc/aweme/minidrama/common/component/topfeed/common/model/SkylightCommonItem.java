package com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightCommonItem {

    @C09CT("category")
    public final Long category;

    @C09CT("collection_id")
    public final Long collectionId;

    @C09CT("is_limited_free")
    public final Boolean isLimitedFree;

    @C09CT("title")
    public final String title;

    @C09CT("num_videos")
    public final Integer totalEpisodes;

    @C09CT("cover")
    public final UrlModel urlModel;

    @C09CT("last_watched")
    public final Integer watchedEpisodes;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkylightCommonItem)) {
            return false;
        }
        SkylightCommonItem skylightCommonItem = (SkylightCommonItem) obj;
        return Intrinsics.LJFF(this.collectionId, skylightCommonItem.collectionId) && Intrinsics.LJFF(this.category, skylightCommonItem.category) && Intrinsics.LJFF(this.isLimitedFree, skylightCommonItem.isLimitedFree) && Intrinsics.LJFF(this.title, skylightCommonItem.title) && Intrinsics.LJFF(this.urlModel, skylightCommonItem.urlModel) && Intrinsics.LJFF(this.watchedEpisodes, skylightCommonItem.watchedEpisodes) && Intrinsics.LJFF(this.totalEpisodes, skylightCommonItem.totalEpisodes);
    }

    public final int hashCode() {
        Long l = this.collectionId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.category;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.isLimitedFree;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.title;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        UrlModel urlModel = this.urlModel;
        int iHashCode5 = (iHashCode4 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Integer num = this.watchedEpisodes;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalEpisodes;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public SkylightCommonItem(Long l, Long l2, Boolean bool, String str, UrlModel urlModel, Integer num, Integer num2) {
        this.collectionId = l;
        this.category = l2;
        this.isLimitedFree = bool;
        this.title = str;
        this.urlModel = urlModel;
        this.watchedEpisodes = num;
        this.totalEpisodes = num2;
    }
}
