package com.ss.android.ugc.aweme.poi.collect;

import X.C09CT;
import X.C1172460gcG;
import X.C11NZ;
import X.C2188811AlT;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public interface PoiCollectApi {
    public static final C1172460gcG LIZ = C1172460gcG.LIZ;

    @InterfaceC1501200pAU("/tiktok/poi/collections/v1")
    C11NZ<PoiCollectListResponse> LIZ(@InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("ab_param") String str, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i3);

    public static final class TTLSAbParam {

        @C09CT("poi_core")
        public final Map<String, Object> poiCore;

        public TTLSAbParam() {
            this(null);
        }

        public TTLSAbParam(Map<String, ? extends Object> map) {
            this.poiCore = map;
        }
    }

    public static final class PoiCollectListResponse extends BaseResponse {

        @C09CT("cursor")
        public final int cursor;

        @C09CT("has_more")
        public final int hasMore;

        @C09CT("poi_detail_tag_style_map")
        public final Map<String, PoiDetailTagStyle> poiDetailTagStyleMap;

        @C09CT("poi_list")
        public final List<PoiDetail> poiList;

        @C09CT("poi_list_v2")
        public final List<PoiGeneralCard> poiListV2;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiCollectListResponse)) {
                return false;
            }
            PoiCollectListResponse poiCollectListResponse = (PoiCollectListResponse) obj;
            return this.cursor == poiCollectListResponse.cursor && Intrinsics.LJFF(this.poiList, poiCollectListResponse.poiList) && Intrinsics.LJFF(this.poiListV2, poiCollectListResponse.poiListV2) && this.hasMore == poiCollectListResponse.hasMore && Intrinsics.LJFF(this.poiDetailTagStyleMap, poiCollectListResponse.poiDetailTagStyleMap);
        }

        public final int hashCode() {
            int i = this.cursor * 31;
            List<PoiDetail> list = this.poiList;
            int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
            List<PoiGeneralCard> list2 = this.poiListV2;
            int iHashCode2 = (((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31) + this.hasMore) * 31;
            Map<String, PoiDetailTagStyle> map = this.poiDetailTagStyleMap;
            return iHashCode2 + (map != null ? map.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiCollectListResponse(cursor=");
            sbLIZ.append(this.cursor);
            sbLIZ.append(", poiList=");
            sbLIZ.append(this.poiList);
            sbLIZ.append(", poiListV2=");
            sbLIZ.append(this.poiListV2);
            sbLIZ.append(", hasMore=");
            sbLIZ.append(this.hasMore);
            sbLIZ.append(", poiDetailTagStyleMap=");
            sbLIZ.append(this.poiDetailTagStyleMap);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiCollectListResponse(int i, List<PoiDetail> list, List<PoiGeneralCard> list2, int i2, Map<String, PoiDetailTagStyle> map) {
            this.cursor = i;
            this.poiList = list;
            this.poiListV2 = list2;
            this.hasMore = i2;
            this.poiDetailTagStyleMap = map;
        }
    }

    public static final class PoiDetail {

        @C09CT("category_name")
        public final String categoryName;

        @C09CT("city_code")
        public final String cityCode;

        @C09CT("collect_info")
        public final String collectInfo;

        @C09CT("cover")
        public final UrlModel cover;

        @C09CT("detail_page_poi_display")
        public final String detailPagePoiDisplay;

        @C09CT("distance")
        public final String distance;

        @C09CT("is_claimed")
        public final boolean isClaimed;

        @C09CT("is_collected")
        public final Boolean isCollected;

        @C09CT("key_category")
        public final String keyCategory;

        @C09CT("location")
        public final PoiLocation location;

        @C09CT("formatted_address")
        public final String poiAddress;

        @C09CT("poi_detail_tags")
        public final List<PoiDetailTag> poiDetailTag;

        @C09CT("poi_detail_tag_style_map")
        public final Map<String, PoiDetailTagStyle> poiDetailTagStyleMap;

        @C09CT("poi_id")
        public final String poiId;

        @C09CT("poi_info_source")
        public final String poiInfoSource;

        @C09CT("poi_name")
        public final String poiName;

        @C09CT("poi_review_summary")
        public final PoiReviewsApi.PoiReviewSummaryModel poiReviewSummary;

        @C09CT("poi_status")
        public final int poiStatus;

        @C09CT("region_code")
        public final String regionCode;

        @C09CT("region_level")
        public final String regionLevel;

        @C09CT("type_level")
        public final String typeLevel;

        @C09CT("upper_tag")
        public final PoiDetailTag upperTag;

        public PoiDetail() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null);
        }

        public PoiDetail(String str, String str2, String str3, PoiLocation poiLocation, String str4, String str5, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, String str6, PoiDetailTag poiDetailTag, String str7, Map<String, PoiDetailTagStyle> map, List<PoiDetailTag> list, String str8, int i, String str9, String str10, Boolean bool, boolean z, String str11, UrlModel urlModel, String str12, String str13) {
            this.poiName = str;
            this.poiAddress = str2;
            this.poiId = str3;
            this.location = poiLocation;
            this.typeLevel = str4;
            this.poiInfoSource = str5;
            this.poiReviewSummary = poiReviewSummaryModel;
            this.categoryName = str6;
            this.upperTag = poiDetailTag;
            this.distance = str7;
            this.poiDetailTagStyleMap = map;
            this.poiDetailTag = list;
            this.detailPagePoiDisplay = str8;
            this.poiStatus = i;
            this.regionCode = str9;
            this.collectInfo = str10;
            this.isCollected = bool;
            this.isClaimed = z;
            this.keyCategory = str11;
            this.cover = urlModel;
            this.cityCode = str12;
            this.regionLevel = str13;
        }
    }
}
