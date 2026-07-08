package com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.desc;

import X.C09CT;
import X.C1201190hMb;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureDetailDescModule extends BaseComponentData implements Serializable {

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("is_hot")
    public final Boolean isHot;

    @C09CT("like_num")
    public final Integer likeNum;

    @C09CT("like_num_display")
    public final String likeNumDisplay;

    @C09CT("name")
    public final String name;

    @C09CT("price_currency")
    public final String priceCurrency;

    @C09CT("price_num")
    public final String priceNum;

    @C09CT("recommend_text")
    public final String recommendText;

    @C09CT("top_rank")
    public final Integer topRank;

    @C09CT("user_avatar_list")
    public final List<UrlModel> userAvatarList;

    public PoiRecommendFeatureDetailDescModule() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public final PoiRecommendFeatureDetailDescModule copy(String str, String str2, String str3, String str4, String str5, Integer num, String str6, List<? extends UrlModel> list, Boolean bool, Integer num2, String str7) {
        return new PoiRecommendFeatureDetailDescModule(str, str2, str3, str4, str5, num, str6, list, bool, num2, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiRecommendFeatureDetailDescModule)) {
            return false;
        }
        PoiRecommendFeatureDetailDescModule poiRecommendFeatureDetailDescModule = (PoiRecommendFeatureDetailDescModule) obj;
        return Intrinsics.LJFF(this.id, poiRecommendFeatureDetailDescModule.id) && Intrinsics.LJFF(this.name, poiRecommendFeatureDetailDescModule.name) && Intrinsics.LJFF(this.recommendText, poiRecommendFeatureDetailDescModule.recommendText) && Intrinsics.LJFF(this.priceNum, poiRecommendFeatureDetailDescModule.priceNum) && Intrinsics.LJFF(this.priceCurrency, poiRecommendFeatureDetailDescModule.priceCurrency) && Intrinsics.LJFF(this.likeNum, poiRecommendFeatureDetailDescModule.likeNum) && Intrinsics.LJFF(this.likeNumDisplay, poiRecommendFeatureDetailDescModule.likeNumDisplay) && Intrinsics.LJFF(this.userAvatarList, poiRecommendFeatureDetailDescModule.userAvatarList) && Intrinsics.LJFF(this.isHot, poiRecommendFeatureDetailDescModule.isHot) && Intrinsics.LJFF(this.topRank, poiRecommendFeatureDetailDescModule.topRank) && Intrinsics.LJFF(this.collectInfo, poiRecommendFeatureDetailDescModule.collectInfo);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.recommendText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.priceNum;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.priceCurrency;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.likeNum;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.likeNumDisplay;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<UrlModel> list = this.userAvatarList;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isHot;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.topRank;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.collectInfo;
        return iHashCode10 + (str7 != null ? str7.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return "PoiRecommendFeatureDetailDescModule(id=" + this.id + ", name=" + this.name + ", recommendText=" + this.recommendText + ", priceNum=" + this.priceNum + ", priceCurrency=" + this.priceCurrency + ", likeNum=" + this.likeNum + ", likeNumDisplay=" + this.likeNumDisplay + ", userAvatarList=" + this.userAvatarList + ", isHot=" + this.isHot + ", topRank=" + this.topRank + ", collectInfo=" + this.collectInfo + ')';
    }

    public final String getCollectInfo() {
        return this.collectInfo;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getLikeNum() {
        return this.likeNum;
    }

    public final String getLikeNumDisplay() {
        return this.likeNumDisplay;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPriceCurrency() {
        return this.priceCurrency;
    }

    public final String getPriceNum() {
        return this.priceNum;
    }

    public final String getRecommendText() {
        return this.recommendText;
    }

    public final Integer getTopRank() {
        return this.topRank;
    }

    public final List<UrlModel> getUserAvatarList() {
        return this.userAvatarList;
    }

    public final Boolean isHot() {
        return this.isHot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PoiRecommendFeatureDetailDescModule(String str, String str2, String str3, String str4, String str5, Integer num, String str6, List<? extends UrlModel> list, Boolean bool, Integer num2, String str7) {
        this.id = str;
        this.name = str2;
        this.recommendText = str3;
        this.priceNum = str4;
        this.priceCurrency = str5;
        this.likeNum = num;
        this.likeNumDisplay = str6;
        this.userAvatarList = list;
        this.isHot = bool;
        this.topRank = num2;
        this.collectInfo = str7;
    }
}
