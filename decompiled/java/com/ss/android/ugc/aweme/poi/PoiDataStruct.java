package com.ss.android.ugc.aweme.poi;

import X.C098200Yq;
import X.C09CT;
import X.C189200o6;
import X.C786410Ut5;
import X.EnumC1188920h2o;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDataStruct implements Serializable {

    @C09CT("address_info")
    public PoiAddressInfo addressInfo;

    @C09CT("ai_sub_summary")
    public AiSubSummary aiSubSummary;
    public boolean anchorAvoidResult;

    @C09CT("anchor_pass_through_info")
    public String anchorPassThroughInfo;
    public boolean anchorShowed;

    @C09CT("anchor_subject_type")
    public Integer anchorSubjectType;

    @C09CT("button_group")
    public PoiDataButtonGroup buttonGroup;

    @C09CT("category_name")
    public String categoryName;

    @C09CT("collect_info")
    public String collectInfo;

    @C09CT("comment_anchor")
    public PoiAnchorInfo commentAnchor;

    @C09CT("extra")
    public String extra;

    @C09CT("real_time_fav_cnt")
    public Long favCnt;

    @C09CT("header_url")
    public UrlModel headImgUrl;

    @C09CT("icon")
    public UrlModel icon;

    @C09CT("info_source")
    public String infoSource;
    public transient boolean isAnchorExpanded;

    @C09CT("is_collected")
    public Boolean isCollected;

    @C09CT("location_desc")
    public String locationDesc;

    @C09CT("nearby_tag")
    public NearbyTag nearbyTag;

    @C09CT("amusement")
    public PoiAmusementModel poiAmusement;

    @C09CT("poi_aweme_config")
    public PoiAwemeConfig poiAwemeConfig;

    @C09CT("poi_aweme_picture_info")
    public PoiAwemePictureInfo poiAwemePictureInfo;

    @C09CT("poi_claim_status")
    public Integer poiClaimStatus;

    @C09CT("poi_id")
    public String poiId;

    @C09CT("poi_mapkit_collect")
    public boolean poiMapkitCollect;

    @C09CT("poi_name")
    public String poiName;

    @C09CT("poi_page_anchor")
    public PoiAnchorInfo poiPostPageAnchor;

    @C09CT("poi_request_extra_params")
    public String poiRequestExtraParams;

    @C09CT("poi_type")
    public String poiType;

    @C09CT("product_guidance_info")
    public ProductGuidanceInfo productGuidanceInfo;

    @C09CT("product_ids")
    public List<String> productIds;

    @C09CT("review_summary")
    public PoiAwemeReviewSummary reviewSummary;
    public boolean tagShowed;

    @C09CT("thumbnail")
    public UrlModel thumbnail;

    @C09CT("type_level")
    public String typeLevel;

    @C09CT("video_anchor")
    public PoiAnchorInfo videoAnchor;

    @C09CT("video_count")
    public String videoCount;

    @C09CT("video_tag")
    public PoiAnchorInfo videoTag;

    public PoiDataStruct() {
        this(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final PoiDataStruct copy(String str, String str2, String str3, String str4, String str5, boolean z, String str6, PoiAddressInfo poiAddressInfo, PoiAnchorInfo poiAnchorInfo, PoiAnchorInfo poiAnchorInfo2, PoiAnchorInfo poiAnchorInfo3, NearbyTag nearbyTag, Integer num, UrlModel urlModel, UrlModel urlModel2, String str7, PoiAnchorInfo poiAnchorInfo4, PoiAmusementModel poiAmusementModel, Integer num2, List<String> list, String str8, UrlModel urlModel3, Long l, Boolean bool, String str9, ProductGuidanceInfo productGuidanceInfo, AiSubSummary aiSubSummary, String str10, PoiAwemeConfig poiAwemeConfig, PoiAwemePictureInfo poiAwemePictureInfo, PoiAwemeReviewSummary poiAwemeReviewSummary, String str11, PoiDataButtonGroup poiDataButtonGroup, String str12) {
        return new PoiDataStruct(str, str2, str3, str4, str5, z, str6, poiAddressInfo, poiAnchorInfo, poiAnchorInfo2, poiAnchorInfo3, nearbyTag, num, urlModel, urlModel2, str7, poiAnchorInfo4, poiAmusementModel, num2, list, str8, urlModel3, l, bool, str9, productGuidanceInfo, aiSubSummary, str10, poiAwemeConfig, poiAwemePictureInfo, poiAwemeReviewSummary, str11, poiDataButtonGroup, str12);
    }

    public int hashCode() {
        String str = this.poiName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.poiId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.poiType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.infoSource;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.collectInfo;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Z2(this.poiMapkitCollect)) * 31;
        String str6 = this.videoCount;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PoiAddressInfo poiAddressInfo = this.addressInfo;
        int iHashCode7 = (iHashCode6 + (poiAddressInfo == null ? 0 : poiAddressInfo.hashCode())) * 31;
        PoiAnchorInfo poiAnchorInfo = this.videoAnchor;
        int iHashCode8 = (iHashCode7 + (poiAnchorInfo == null ? 0 : poiAnchorInfo.hashCode())) * 31;
        PoiAnchorInfo poiAnchorInfo2 = this.commentAnchor;
        int iHashCode9 = (iHashCode8 + (poiAnchorInfo2 == null ? 0 : poiAnchorInfo2.hashCode())) * 31;
        PoiAnchorInfo poiAnchorInfo3 = this.videoTag;
        int iHashCode10 = (iHashCode9 + (poiAnchorInfo3 == null ? 0 : poiAnchorInfo3.hashCode())) * 31;
        NearbyTag nearbyTag = this.nearbyTag;
        int iHashCode11 = (iHashCode10 + (nearbyTag == null ? 0 : nearbyTag.hashCode())) * 31;
        Integer num = this.poiClaimStatus;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        UrlModel urlModel = this.icon;
        int iHashCode13 = (iHashCode12 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        UrlModel urlModel2 = this.thumbnail;
        int iHashCode14 = (iHashCode13 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
        String str7 = this.typeLevel;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        PoiAnchorInfo poiAnchorInfo4 = this.poiPostPageAnchor;
        int iHashCode16 = (iHashCode15 + (poiAnchorInfo4 == null ? 0 : poiAnchorInfo4.hashCode())) * 31;
        PoiAmusementModel poiAmusementModel = this.poiAmusement;
        int iHashCode17 = (iHashCode16 + (poiAmusementModel == null ? 0 : poiAmusementModel.hashCode())) * 31;
        Integer num2 = this.anchorSubjectType;
        int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list = this.productIds;
        int iHashCode19 = (iHashCode18 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.extra;
        int iHashCode20 = (iHashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        UrlModel urlModel3 = this.headImgUrl;
        int iHashCode21 = (iHashCode20 + (urlModel3 == null ? 0 : urlModel3.hashCode())) * 31;
        Long l = this.favCnt;
        int iHashCode22 = (iHashCode21 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.isCollected;
        int iHashCode23 = (iHashCode22 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.locationDesc;
        int iHashCode24 = (iHashCode23 + (str9 == null ? 0 : str9.hashCode())) * 31;
        ProductGuidanceInfo productGuidanceInfo = this.productGuidanceInfo;
        int iHashCode25 = (iHashCode24 + (productGuidanceInfo == null ? 0 : productGuidanceInfo.hashCode())) * 31;
        AiSubSummary aiSubSummary = this.aiSubSummary;
        int iHashCode26 = (iHashCode25 + (aiSubSummary == null ? 0 : aiSubSummary.hashCode())) * 31;
        String str10 = this.anchorPassThroughInfo;
        int iHashCode27 = (iHashCode26 + (str10 == null ? 0 : str10.hashCode())) * 31;
        PoiAwemeConfig poiAwemeConfig = this.poiAwemeConfig;
        int iHashCode28 = (iHashCode27 + (poiAwemeConfig == null ? 0 : poiAwemeConfig.hashCode())) * 31;
        PoiAwemePictureInfo poiAwemePictureInfo = this.poiAwemePictureInfo;
        int iHashCode29 = (iHashCode28 + (poiAwemePictureInfo == null ? 0 : poiAwemePictureInfo.hashCode())) * 31;
        PoiAwemeReviewSummary poiAwemeReviewSummary = this.reviewSummary;
        int iHashCode30 = (iHashCode29 + (poiAwemeReviewSummary == null ? 0 : poiAwemeReviewSummary.hashCode())) * 31;
        String str11 = this.categoryName;
        int iHashCode31 = (iHashCode30 + (str11 == null ? 0 : str11.hashCode())) * 31;
        PoiDataButtonGroup poiDataButtonGroup = this.buttonGroup;
        int iHashCode32 = (iHashCode31 + (poiDataButtonGroup == null ? 0 : poiDataButtonGroup.hashCode())) * 31;
        String str12 = this.poiRequestExtraParams;
        return iHashCode32 + (str12 != null ? str12.hashCode() : 0);
    }

    public String toString() {
        return "PoiDataStruct(poiName=" + this.poiName + ", poiId=" + this.poiId + ", poiType=" + this.poiType + ", infoSource=" + this.infoSource + ", collectInfo=" + this.collectInfo + ", poiMapkitCollect=" + this.poiMapkitCollect + ", videoCount=" + this.videoCount + ", addressInfo=" + this.addressInfo + ", videoAnchor=" + this.videoAnchor + ", commentAnchor=" + this.commentAnchor + ", videoTag=" + this.videoTag + ", nearbyTag=" + this.nearbyTag + ", poiClaimStatus=" + this.poiClaimStatus + ", icon=" + this.icon + ", thumbnail=" + this.thumbnail + ", typeLevel=" + this.typeLevel + ", poiPostPageAnchor=" + this.poiPostPageAnchor + ", poiAmusement=" + this.poiAmusement + ", anchorSubjectType=" + this.anchorSubjectType + ", productIds=" + this.productIds + ", extra=" + this.extra + ", headImgUrl=" + this.headImgUrl + ", favCnt=" + this.favCnt + ", isCollected=" + this.isCollected + ", locationDesc=" + this.locationDesc + ", productGuidanceInfo=" + this.productGuidanceInfo + ", aiSubSummary=" + this.aiSubSummary + ", anchorPassThroughInfo=" + this.anchorPassThroughInfo + ", poiAwemeConfig=" + this.poiAwemeConfig + ", poiAwemePictureInfo=" + this.poiAwemePictureInfo + ", reviewSummary=" + this.reviewSummary + ", categoryName=" + this.categoryName + ", buttonGroup=" + this.buttonGroup + ", poiRequestExtraParams=" + this.poiRequestExtraParams + ')';
    }

    public final boolean isProductAnchor() {
        Integer num = this.anchorSubjectType;
        return num != null && num.intValue() == 1;
    }

    public final String parsePoiInfo() {
        String str;
        Object c098200Yq;
        PoiAnchorInfo poiAnchorInfo = this.videoAnchor;
        if (poiAnchorInfo == null || (str = poiAnchorInfo.trackInfo) == null) {
            return null;
        }
        try {
            c098200Yq = JSONObjectProtectorUtils.getString(new JSONObject(str), "poi_info");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (String) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public final String parseTtlsAnchorType() {
        Integer num = this.anchorSubjectType;
        return (num == null || num.intValue() != 1) ? "poi" : "product";
    }

    public final PoiData trans2PoiData() {
        String str = this.poiName;
        PoiAddressInfo poiAddressInfo = this.addressInfo;
        double dM304double = m304double(poiAddressInfo != null ? poiAddressInfo.lat : null);
        PoiAddressInfo poiAddressInfo2 = this.addressInfo;
        return new PoiData(null, str, dM304double, m304double(poiAddressInfo2 != null ? poiAddressInfo2.lng : null), null, null, null, null, null, null, null, null, null, this.poiId, null, null, null, null, null, null, null, this.poiClaimStatus, null, null, null, null);
    }

    public final boolean isAnchorExpanded() {
        return this.isAnchorExpanded;
    }

    public final Boolean isCollected() {
        return this.isCollected;
    }

    /* JADX INFO: renamed from: double, reason: not valid java name */
    private final double m304double(String str) {
        double d = 0.0d;
        if (str == null) {
            return 0.0d;
        }
        try {
            d = CastDoubleProtector.parseDouble(str);
            return d;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return d;
        }
    }

    public final EnumC1188920h2o getAnchorNavigateTarget(boolean z) {
        List<String> list = this.productIds;
        if (list != null) {
            int size = list.size();
            Integer num = this.anchorSubjectType;
            if (num != null && num.intValue() == 1) {
                if (size == 1) {
                    return EnumC1188920h2o.PRODUCT_DETAIL;
                }
                if (size > 1) {
                    if (z) {
                        return EnumC1188920h2o.PRODUCT_SHELVES_FULL_SCREEN;
                    }
                    return EnumC1188920h2o.PRODUCT_SHELVES_POPUP;
                }
                return EnumC1188920h2o.DEFAULT;
            }
            return EnumC1188920h2o.DEFAULT;
        }
        return EnumC1188920h2o.DEFAULT;
    }

    public final void setAnchorAvoidResult(boolean z) {
        this.anchorAvoidResult = z;
    }

    public final void setAnchorExpanded(boolean z) {
        this.isAnchorExpanded = z;
    }

    public final void setAnchorShowed(boolean z) {
        this.anchorShowed = z;
    }

    public final void setTagShowed(boolean z) {
        this.tagShowed = z;
    }

    public PoiDataStruct(String str, String str2, String str3, String str4, String str5, boolean z, String str6, PoiAddressInfo poiAddressInfo, PoiAnchorInfo poiAnchorInfo, PoiAnchorInfo poiAnchorInfo2, PoiAnchorInfo poiAnchorInfo3, NearbyTag nearbyTag, Integer num, UrlModel urlModel, UrlModel urlModel2, String str7, PoiAnchorInfo poiAnchorInfo4, PoiAmusementModel poiAmusementModel, Integer num2, List<String> list, String str8, UrlModel urlModel3, Long l, Boolean bool, String str9, ProductGuidanceInfo productGuidanceInfo, AiSubSummary aiSubSummary, String str10, PoiAwemeConfig poiAwemeConfig, PoiAwemePictureInfo poiAwemePictureInfo, PoiAwemeReviewSummary poiAwemeReviewSummary, String str11, PoiDataButtonGroup poiDataButtonGroup, String str12) {
        this.poiName = str;
        this.poiId = str2;
        this.poiType = str3;
        this.infoSource = str4;
        this.collectInfo = str5;
        this.poiMapkitCollect = z;
        this.videoCount = str6;
        this.addressInfo = poiAddressInfo;
        this.videoAnchor = poiAnchorInfo;
        this.commentAnchor = poiAnchorInfo2;
        this.videoTag = poiAnchorInfo3;
        this.nearbyTag = nearbyTag;
        this.poiClaimStatus = num;
        this.icon = urlModel;
        this.thumbnail = urlModel2;
        this.typeLevel = str7;
        this.poiPostPageAnchor = poiAnchorInfo4;
        this.poiAmusement = poiAmusementModel;
        this.anchorSubjectType = num2;
        this.productIds = list;
        this.extra = str8;
        this.headImgUrl = urlModel3;
        this.favCnt = l;
        this.isCollected = bool;
        this.locationDesc = str9;
        this.productGuidanceInfo = productGuidanceInfo;
        this.aiSubSummary = aiSubSummary;
        this.anchorPassThroughInfo = str10;
        this.poiAwemeConfig = poiAwemeConfig;
        this.poiAwemePictureInfo = poiAwemePictureInfo;
        this.reviewSummary = poiAwemeReviewSummary;
        this.categoryName = str11;
        this.buttonGroup = poiDataButtonGroup;
        this.poiRequestExtraParams = str12;
    }
}
