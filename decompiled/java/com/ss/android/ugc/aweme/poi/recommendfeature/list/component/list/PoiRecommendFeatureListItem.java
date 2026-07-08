package com.ss.android.ugc.aweme.poi.recommendfeature.list.component.list;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureListItem implements Serializable {

    @C09CT("user_avatar_list")
    public final List<UrlModel> avatars;

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("cover")
    public final UrlModel cover;

    @C09CT("recommend_text")
    public final String desc;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("is_hot")
    public final Boolean isHot;

    @C09CT("like_num")
    public final Integer likeNum;

    @C09CT("like_num_display")
    public final String likesCount;

    @C09CT("price_currency")
    public final String priceCurrency;

    @C09CT("price_num")
    public final String priceNum;

    @C09CT("name")
    public final String title;

    @C09CT("top_rank")
    public final Integer topRank;

    public PoiRecommendFeatureListItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiRecommendFeatureListItem)) {
            return false;
        }
        PoiRecommendFeatureListItem poiRecommendFeatureListItem = (PoiRecommendFeatureListItem) obj;
        return Intrinsics.LJFF(this.id, poiRecommendFeatureListItem.id) && Intrinsics.LJFF(this.title, poiRecommendFeatureListItem.title) && Intrinsics.LJFF(this.desc, poiRecommendFeatureListItem.desc) && Intrinsics.LJFF(this.priceNum, poiRecommendFeatureListItem.priceNum) && Intrinsics.LJFF(this.priceCurrency, poiRecommendFeatureListItem.priceCurrency) && Intrinsics.LJFF(this.likeNum, poiRecommendFeatureListItem.likeNum) && Intrinsics.LJFF(this.likesCount, poiRecommendFeatureListItem.likesCount) && Intrinsics.LJFF(this.cover, poiRecommendFeatureListItem.cover) && Intrinsics.LJFF(this.avatars, poiRecommendFeatureListItem.avatars) && Intrinsics.LJFF(this.isHot, poiRecommendFeatureListItem.isHot) && Intrinsics.LJFF(this.topRank, poiRecommendFeatureListItem.topRank) && Intrinsics.LJFF(this.collectInfo, poiRecommendFeatureListItem.collectInfo);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.priceNum;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.priceCurrency;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.likeNum;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.likesCount;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        UrlModel urlModel = this.cover;
        int iHashCode8 = (iHashCode7 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        List<UrlModel> list = this.avatars;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isHot;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.topRank;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.collectInfo;
        return iHashCode11 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "PoiRecommendFeatureListItem(id=" + this.id + ", title=" + this.title + ", desc=" + this.desc + ", priceNum=" + this.priceNum + ", priceCurrency=" + this.priceCurrency + ", likeNum=" + this.likeNum + ", likesCount=" + this.likesCount + ", cover=" + this.cover + ", avatars=" + this.avatars + ", isHot=" + this.isHot + ", topRank=" + this.topRank + ", collectInfo=" + this.collectInfo + ')';
    }

    public final Boolean isHot() {
        return this.isHot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PoiRecommendFeatureListItem(String str, String str2, String str3, String str4, String str5, Integer num, String str6, UrlModel urlModel, List<? extends UrlModel> list, Boolean bool, Integer num2, String str7) {
        this.id = str;
        this.title = str2;
        this.desc = str3;
        this.priceNum = str4;
        this.priceCurrency = str5;
        this.likeNum = num;
        this.likesCount = str6;
        this.cover = urlModel;
        this.avatars = list;
        this.isHot = bool;
        this.topRank = num2;
        this.collectInfo = str7;
    }
}
