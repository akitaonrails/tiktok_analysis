package com.ss.android.ugc.aweme.poi.detail.container;

import X.AbstractC1180940gpw;
import X.C09CT;
import X.C1171370gaV;
import X.C1175120ggY;
import X.C1183780guW;
import X.C1184920gwM;
import X.C1186730gzH;
import X.C11NZ;
import X.C1201190hMb;
import X.C123100dR;
import X.C13LP;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC035600Ao;
import X.EnumC1184730gw3;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC1891350zJl;
import X.InterfaceC2753014t;
import com.bytedance.im.core.proto.UrlStruct;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.CleanModeHeaderConfig;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.IntentButtonConfig;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiStyleConfig;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.ai.model.PoiHeadAiSummary;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.ai.model.PoiHeadMergedTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.ChartInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.DistanceInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel;
import com.ss.android.ugc.aweme.poi.detail.container.model.OwnerInfoModel;
import com.ss.android.ugc.aweme.poi.detail.container.model.PhoneInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBasicInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingProviderInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiHeaderButtonGroup;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiHighlightTagModule;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.ReportInfo;
import com.ss.android.ugc.aweme.poi.detail.container.model.StoreInfoModel;
import com.ss.android.ugc.aweme.poi.map.model.DynamicMapParams;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public interface PoiListApi {
    public static final C1171370gaV LIZ = C1171370gaV.LIZ;

    public static final class PoiDetailResponse extends BaseComponentData implements Serializable {
        public String LL;
        public final Boolean LLILLJJLI;
        public Boolean LLILLL;

        @C09CT("formatted_address")
        public final String address;

        @C09CT("ai_summary")
        public final PoiHeadAiSummary aiSummary;

        @C09CT("average_price")
        public final String averagePrice;

        @C09CT("banners")
        public final List<PoiActivityApi.PoiBannerInfo> bannerListInfo;

        @C09CT("booking_info")
        public final PoiBookingInfo bookingInfo;

        @C09CT("category_name")
        public final String categoryName;

        @C09CT("chart_tag")
        public final ChartInfo chartTag;

        @C09CT("city_code")
        public final String cityCode;

        @C09CT("city_name")
        public final String cityName;

        @C09CT("city_poi_id")
        public final String cityPoiId;

        @C09CT("city_poi_name")
        public final String cityPoiName;

        @C09CT("claim_store_status")
        public final Boolean claimStoreStatus;

        @C09CT("clean_mode_header_config")
        public final CleanModeHeaderConfig cleanModeHeaderConfig;

        @C09CT("collect_info")
        public final String collectInfo;

        @C09CT("country_code")
        public final String countryCode;

        @C09CT("cover")
        public final UrlModel cover;

        @C09CT("distance_info")
        public final DistanceInfo distanceInfo;

        @C09CT("dynamic_map_params")
        public final DynamicMapParams dynamicMapParams;

        @C09CT("edit_poi_status")
        public final Boolean editPoiStatus;

        @C09CT("father_poi")
        public final FatherPoiModel fatherPoi;

        @C09CT("follow_owner_status")
        public final Boolean followOwnerStatus;

        @C09CT("geo_name_ids")
        public final String geoNameIds;

        @C09CT("have_background_top_map")
        public final Boolean haveBackgroundTopMap;

        @C09CT("have_product_shelf")
        public final Boolean haveProductShelf;

        @C09CT("have_region_discovery")
        public final Boolean haveRegionDiscovery;

        @C09CT("region_cover_img")
        public UrlModel headerCoverImage;

        @C09CT("help_center_url")
        public final String helpCenterUrl;

        @C09CT("highlight_category_name")
        public final String highLightCategoryName;

        @C09CT("intent_button_config")
        public final IntentButtonConfig intentButtonConfig;

        @C09CT("is_ba_account")
        public final Boolean isBaAccount;

        @C09CT("is_collected")
        public final Boolean isCollected;

        @C09CT("is_product_visible")
        public final Boolean isProductVisible;

        @C09CT("is_semi_closed_loop_hotel")
        public final Boolean isSemiClosedLoopHotel;

        @C09CT("merged_tags")
        public final List<PoiHeadMergedTag> mergedTagsList;

        @C09CT("poi_name")
        public final String name;

        @C09CT("no_need_empty_feed")
        public final Boolean noNeedEmptyFeed;

        @C09CT("owner_info")
        public final OwnerInfoModel ownerInfo;

        @C09CT("phone_info")
        public final PhoneInfo phoneInfo;

        @C09CT("picture_album")
        public final PictureAlbum pictureAlbum;

        @C09CT("poi_detail_page_opt")
        public final Integer poiDetailPageOpt;

        @C09CT("poi_detail_tag_style_map")
        public final Map<String, PoiDetailTagStyle> poiDetailTagStyleMap;

        @C09CT("poi_head_button_group")
        public final PoiHeaderButtonGroup poiHeadButtonGroup;

        @C09CT("poi_highlight_tag_module")
        public final PoiHighlightTagModule poiHighlightTagModule;

        @C09CT("poi_info_source")
        public final String poiInfoSource;

        @C09CT("poi_introduction")
        public String poiIntro;

        @C09CT("location")
        public final PoiLocation poiLocation;

        @C09CT("poi_review_entrance")
        public final PoiReviewEntrance poiReviewEntrance;

        @C09CT("poi_review_summary")
        public final PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel;

        @C09CT("poi_shop_booking_info")
        public final List<PoiShopBookingInfo> poiShopBookingInfoList;

        @C09CT("style_config")
        public final PoiStyleConfig poiStyleConfig;

        @C09CT("poi_third_party_key_info")
        public final String poiThirdPartyKeyInfo;

        @C09CT("poi_detail_top_tags")
        public final List<PoiDetailTag> poiTopTags;

        @C09CT("province_code")
        public final String provinceCode;

        @C09CT("real_time_fav_cnt")
        public final Long realFavoriteCnt;

        @C09CT("region_code")
        public final String regionCode;

        @C09CT("report_info")
        public final ReportInfo reportInfo;

        @C09CT("share_info")
        public final ShareInfo shareInfo;

        @C09CT("show_bottom_bar_when_disappear")
        public final Boolean showBottomBarWhenDisappear;

        @C09CT("show_help_center")
        public final Boolean showHelpCenter;

        @C09CT("store_info")
        public final StoreInfoModel storeInfo;

        @C09CT("poi_detail_tags")
        public final List<PoiDetailTag> tags;

        @C09CT("poi_detail_trust_tags")
        public final List<PoiDetailTag> trustTags;

        @C09CT("tt_type_code")
        public final String ttTypeCode;

        @C09CT("tt_type_name_medium")
        public final String ttTypeNameMedium;

        @C09CT("tt_type_name_super")
        public final String ttTypeNameSuper;

        @C09CT("tt_type_name_tiny")
        public final String ttTypeNameTiny;

        @C09CT("type_level")
        public final String typeLevel;

        @C09CT("user_location")
        public final Integer userLocation;

        @C09CT("year_for_display")
        public final PoiYearForDisplay yearForDisplay;

        public final PoiDetailResponse copy(String str, String str2, UrlModel urlModel, PictureAlbum pictureAlbum, Boolean bool, String str3, String str4, String str5, String str6, String str7, FatherPoiModel fatherPoiModel, StoreInfoModel storeInfoModel, List<PoiDetailTag> list, PoiHighlightTagModule poiHighlightTagModule, List<PoiDetailTag> list2, Map<String, PoiDetailTagStyle> map, OwnerInfoModel ownerInfoModel, PoiLocation poiLocation, DistanceInfo distanceInfo, PhoneInfo phoneInfo, Boolean bool2, DynamicMapParams dynamicMapParams, Boolean bool3, ReportInfo reportInfo, Boolean bool4, String str8, String str9, Boolean bool5, ShareInfo shareInfo, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, Long l, PoiBookingInfo poiBookingInfo, List<PoiShopBookingInfo> list3, Boolean bool6, Boolean bool7, String str10, Boolean bool8, List<PoiActivityApi.PoiBannerInfo> list4, UrlModel urlModel2, String str11, Boolean bool9, String str12, Integer num, ChartInfo chartInfo, IntentButtonConfig intentButtonConfig, CleanModeHeaderConfig cleanModeHeaderConfig, Boolean bool10, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, PoiStyleConfig poiStyleConfig, List<PoiHeadMergedTag> list5, PoiHeadAiSummary poiHeadAiSummary, Boolean bool11, List<PoiDetailTag> list6, String str23, PoiHeaderButtonGroup poiHeaderButtonGroup, Boolean bool12, Integer num2, Boolean bool13, PoiReviewEntrance poiReviewEntrance, PoiYearForDisplay poiYearForDisplay, String str24, Boolean bool14) {
            return new PoiDetailResponse(str, str2, urlModel, pictureAlbum, bool, str3, str4, str5, str6, str7, fatherPoiModel, storeInfoModel, list, poiHighlightTagModule, list2, map, ownerInfoModel, poiLocation, distanceInfo, phoneInfo, bool2, dynamicMapParams, bool3, reportInfo, bool4, str8, str9, bool5, shareInfo, poiReviewSummaryModel, l, poiBookingInfo, list3, bool6, bool7, str10, bool8, list4, urlModel2, str11, bool9, str12, num, chartInfo, intentButtonConfig, cleanModeHeaderConfig, bool10, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, poiStyleConfig, list5, poiHeadAiSummary, bool11, list6, str23, poiHeaderButtonGroup, bool12, num2, bool13, poiReviewEntrance, poiYearForDisplay, str24, bool14);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiDetailResponse)) {
                return false;
            }
            PoiDetailResponse poiDetailResponse = (PoiDetailResponse) obj;
            return Intrinsics.LJFF(this.name, poiDetailResponse.name) && Intrinsics.LJFF(this.address, poiDetailResponse.address) && Intrinsics.LJFF(this.cover, poiDetailResponse.cover) && Intrinsics.LJFF(this.pictureAlbum, poiDetailResponse.pictureAlbum) && Intrinsics.LJFF(this.isCollected, poiDetailResponse.isCollected) && Intrinsics.LJFF(this.collectInfo, poiDetailResponse.collectInfo) && Intrinsics.LJFF(this.poiInfoSource, poiDetailResponse.poiInfoSource) && Intrinsics.LJFF(this.cityCode, poiDetailResponse.cityCode) && Intrinsics.LJFF(this.regionCode, poiDetailResponse.regionCode) && Intrinsics.LJFF(this.typeLevel, poiDetailResponse.typeLevel) && Intrinsics.LJFF(this.fatherPoi, poiDetailResponse.fatherPoi) && Intrinsics.LJFF(this.storeInfo, poiDetailResponse.storeInfo) && Intrinsics.LJFF(this.tags, poiDetailResponse.tags) && Intrinsics.LJFF(this.poiHighlightTagModule, poiDetailResponse.poiHighlightTagModule) && Intrinsics.LJFF(this.poiTopTags, poiDetailResponse.poiTopTags) && Intrinsics.LJFF(this.poiDetailTagStyleMap, poiDetailResponse.poiDetailTagStyleMap) && Intrinsics.LJFF(this.ownerInfo, poiDetailResponse.ownerInfo) && Intrinsics.LJFF(this.poiLocation, poiDetailResponse.poiLocation) && Intrinsics.LJFF(this.distanceInfo, poiDetailResponse.distanceInfo) && Intrinsics.LJFF(this.phoneInfo, poiDetailResponse.phoneInfo) && Intrinsics.LJFF(this.editPoiStatus, poiDetailResponse.editPoiStatus) && Intrinsics.LJFF(this.dynamicMapParams, poiDetailResponse.dynamicMapParams) && Intrinsics.LJFF(this.claimStoreStatus, poiDetailResponse.claimStoreStatus) && Intrinsics.LJFF(this.reportInfo, poiDetailResponse.reportInfo) && Intrinsics.LJFF(this.isBaAccount, poiDetailResponse.isBaAccount) && Intrinsics.LJFF(this.categoryName, poiDetailResponse.categoryName) && Intrinsics.LJFF(this.averagePrice, poiDetailResponse.averagePrice) && Intrinsics.LJFF(this.followOwnerStatus, poiDetailResponse.followOwnerStatus) && Intrinsics.LJFF(this.shareInfo, poiDetailResponse.shareInfo) && Intrinsics.LJFF(this.poiReviewSummaryModel, poiDetailResponse.poiReviewSummaryModel) && Intrinsics.LJFF(this.realFavoriteCnt, poiDetailResponse.realFavoriteCnt) && Intrinsics.LJFF(this.bookingInfo, poiDetailResponse.bookingInfo) && Intrinsics.LJFF(this.poiShopBookingInfoList, poiDetailResponse.poiShopBookingInfoList) && Intrinsics.LJFF(this.haveRegionDiscovery, poiDetailResponse.haveRegionDiscovery) && Intrinsics.LJFF(this.haveBackgroundTopMap, poiDetailResponse.haveBackgroundTopMap) && Intrinsics.LJFF(this.poiThirdPartyKeyInfo, poiDetailResponse.poiThirdPartyKeyInfo) && Intrinsics.LJFF(this.haveProductShelf, poiDetailResponse.haveProductShelf) && Intrinsics.LJFF(this.bannerListInfo, poiDetailResponse.bannerListInfo) && Intrinsics.LJFF(this.headerCoverImage, poiDetailResponse.headerCoverImage) && Intrinsics.LJFF(this.poiIntro, poiDetailResponse.poiIntro) && Intrinsics.LJFF(this.showHelpCenter, poiDetailResponse.showHelpCenter) && Intrinsics.LJFF(this.helpCenterUrl, poiDetailResponse.helpCenterUrl) && Intrinsics.LJFF(this.userLocation, poiDetailResponse.userLocation) && Intrinsics.LJFF(this.chartTag, poiDetailResponse.chartTag) && Intrinsics.LJFF(this.intentButtonConfig, poiDetailResponse.intentButtonConfig) && Intrinsics.LJFF(this.cleanModeHeaderConfig, poiDetailResponse.cleanModeHeaderConfig) && Intrinsics.LJFF(this.isSemiClosedLoopHotel, poiDetailResponse.isSemiClosedLoopHotel) && Intrinsics.LJFF(this.provinceCode, poiDetailResponse.provinceCode) && Intrinsics.LJFF(this.ttTypeCode, poiDetailResponse.ttTypeCode) && Intrinsics.LJFF(this.geoNameIds, poiDetailResponse.geoNameIds) && Intrinsics.LJFF(this.ttTypeNameSuper, poiDetailResponse.ttTypeNameSuper) && Intrinsics.LJFF(this.cityPoiName, poiDetailResponse.cityPoiName) && Intrinsics.LJFF(this.cityPoiId, poiDetailResponse.cityPoiId) && Intrinsics.LJFF(this.cityName, poiDetailResponse.cityName) && Intrinsics.LJFF(this.ttTypeNameMedium, poiDetailResponse.ttTypeNameMedium) && Intrinsics.LJFF(this.countryCode, poiDetailResponse.countryCode) && Intrinsics.LJFF(this.ttTypeNameTiny, poiDetailResponse.ttTypeNameTiny) && Intrinsics.LJFF(this.poiStyleConfig, poiDetailResponse.poiStyleConfig) && Intrinsics.LJFF(this.mergedTagsList, poiDetailResponse.mergedTagsList) && Intrinsics.LJFF(this.aiSummary, poiDetailResponse.aiSummary) && Intrinsics.LJFF(this.isProductVisible, poiDetailResponse.isProductVisible) && Intrinsics.LJFF(this.trustTags, poiDetailResponse.trustTags) && Intrinsics.LJFF(this.highLightCategoryName, poiDetailResponse.highLightCategoryName) && Intrinsics.LJFF(this.poiHeadButtonGroup, poiDetailResponse.poiHeadButtonGroup) && Intrinsics.LJFF(this.showBottomBarWhenDisappear, poiDetailResponse.showBottomBarWhenDisappear) && Intrinsics.LJFF(this.poiDetailPageOpt, poiDetailResponse.poiDetailPageOpt) && Intrinsics.LJFF(this.noNeedEmptyFeed, poiDetailResponse.noNeedEmptyFeed) && Intrinsics.LJFF(this.poiReviewEntrance, poiDetailResponse.poiReviewEntrance) && Intrinsics.LJFF(this.yearForDisplay, poiDetailResponse.yearForDisplay) && Intrinsics.LJFF(this.LL, poiDetailResponse.LL) && Intrinsics.LJFF(this.LLILLJJLI, poiDetailResponse.LLILLJJLI);
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
        public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
            return C1201190hMb.LIZ(this);
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.address;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            UrlModel urlModel = this.cover;
            int iHashCode3 = (iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
            PictureAlbum pictureAlbum = this.pictureAlbum;
            int iHashCode4 = (iHashCode3 + (pictureAlbum == null ? 0 : pictureAlbum.hashCode())) * 31;
            Boolean bool = this.isCollected;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.collectInfo;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.poiInfoSource;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.cityCode;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.regionCode;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.typeLevel;
            int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            FatherPoiModel fatherPoiModel = this.fatherPoi;
            int iHashCode11 = (iHashCode10 + (fatherPoiModel == null ? 0 : fatherPoiModel.hashCode())) * 31;
            StoreInfoModel storeInfoModel = this.storeInfo;
            int iHashCode12 = (iHashCode11 + (storeInfoModel == null ? 0 : storeInfoModel.hashCode())) * 31;
            List<PoiDetailTag> list = this.tags;
            int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
            PoiHighlightTagModule poiHighlightTagModule = this.poiHighlightTagModule;
            int iHashCode14 = (iHashCode13 + (poiHighlightTagModule == null ? 0 : poiHighlightTagModule.hashCode())) * 31;
            List<PoiDetailTag> list2 = this.poiTopTags;
            int iHashCode15 = (iHashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Map<String, PoiDetailTagStyle> map = this.poiDetailTagStyleMap;
            int iHashCode16 = (iHashCode15 + (map == null ? 0 : map.hashCode())) * 31;
            OwnerInfoModel ownerInfoModel = this.ownerInfo;
            int iHashCode17 = (iHashCode16 + (ownerInfoModel == null ? 0 : ownerInfoModel.hashCode())) * 31;
            PoiLocation poiLocation = this.poiLocation;
            int iHashCode18 = (iHashCode17 + (poiLocation == null ? 0 : poiLocation.hashCode())) * 31;
            DistanceInfo distanceInfo = this.distanceInfo;
            int iHashCode19 = (iHashCode18 + (distanceInfo == null ? 0 : distanceInfo.hashCode())) * 31;
            PhoneInfo phoneInfo = this.phoneInfo;
            int iHashCode20 = (iHashCode19 + (phoneInfo == null ? 0 : phoneInfo.hashCode())) * 31;
            Boolean bool2 = this.editPoiStatus;
            int iHashCode21 = (iHashCode20 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            DynamicMapParams dynamicMapParams = this.dynamicMapParams;
            int iHashCode22 = (iHashCode21 + (dynamicMapParams == null ? 0 : dynamicMapParams.hashCode())) * 31;
            Boolean bool3 = this.claimStoreStatus;
            int iHashCode23 = (iHashCode22 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            ReportInfo reportInfo = this.reportInfo;
            int iHashCode24 = (iHashCode23 + (reportInfo == null ? 0 : reportInfo.hashCode())) * 31;
            Boolean bool4 = this.isBaAccount;
            int iHashCode25 = (iHashCode24 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            String str8 = this.categoryName;
            int iHashCode26 = (iHashCode25 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.averagePrice;
            int iHashCode27 = (iHashCode26 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Boolean bool5 = this.followOwnerStatus;
            int iHashCode28 = (iHashCode27 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            ShareInfo shareInfo = this.shareInfo;
            int iHashCode29 = (iHashCode28 + (shareInfo == null ? 0 : shareInfo.hashCode())) * 31;
            PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel = this.poiReviewSummaryModel;
            int iHashCode30 = (iHashCode29 + (poiReviewSummaryModel == null ? 0 : poiReviewSummaryModel.hashCode())) * 31;
            Long l = this.realFavoriteCnt;
            int iHashCode31 = (iHashCode30 + (l == null ? 0 : l.hashCode())) * 31;
            PoiBookingInfo poiBookingInfo = this.bookingInfo;
            int iHashCode32 = (iHashCode31 + (poiBookingInfo == null ? 0 : poiBookingInfo.hashCode())) * 31;
            List<PoiShopBookingInfo> list3 = this.poiShopBookingInfoList;
            int iHashCode33 = (iHashCode32 + (list3 == null ? 0 : list3.hashCode())) * 31;
            Boolean bool6 = this.haveRegionDiscovery;
            int iHashCode34 = (iHashCode33 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.haveBackgroundTopMap;
            int iHashCode35 = (iHashCode34 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            String str10 = this.poiThirdPartyKeyInfo;
            int iHashCode36 = (iHashCode35 + (str10 == null ? 0 : str10.hashCode())) * 31;
            Boolean bool8 = this.haveProductShelf;
            int iHashCode37 = (iHashCode36 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            List<PoiActivityApi.PoiBannerInfo> list4 = this.bannerListInfo;
            int iHashCode38 = (iHashCode37 + (list4 == null ? 0 : list4.hashCode())) * 31;
            UrlModel urlModel2 = this.headerCoverImage;
            int iHashCode39 = (iHashCode38 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
            String str11 = this.poiIntro;
            int iHashCode40 = (iHashCode39 + (str11 == null ? 0 : str11.hashCode())) * 31;
            Boolean bool9 = this.showHelpCenter;
            int iHashCode41 = (iHashCode40 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            String str12 = this.helpCenterUrl;
            int iHashCode42 = (iHashCode41 + (str12 == null ? 0 : str12.hashCode())) * 31;
            Integer num = this.userLocation;
            int iHashCode43 = (iHashCode42 + (num == null ? 0 : num.hashCode())) * 31;
            ChartInfo chartInfo = this.chartTag;
            int iHashCode44 = (iHashCode43 + (chartInfo == null ? 0 : chartInfo.hashCode())) * 31;
            IntentButtonConfig intentButtonConfig = this.intentButtonConfig;
            int iHashCode45 = (iHashCode44 + (intentButtonConfig == null ? 0 : intentButtonConfig.hashCode())) * 31;
            CleanModeHeaderConfig cleanModeHeaderConfig = this.cleanModeHeaderConfig;
            int iHashCode46 = (iHashCode45 + (cleanModeHeaderConfig == null ? 0 : cleanModeHeaderConfig.hashCode())) * 31;
            Boolean bool10 = this.isSemiClosedLoopHotel;
            int iHashCode47 = (iHashCode46 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            String str13 = this.provinceCode;
            int iHashCode48 = (iHashCode47 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.ttTypeCode;
            int iHashCode49 = (iHashCode48 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.geoNameIds;
            int iHashCode50 = (iHashCode49 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.ttTypeNameSuper;
            int iHashCode51 = (iHashCode50 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.cityPoiName;
            int iHashCode52 = (iHashCode51 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.cityPoiId;
            int iHashCode53 = (iHashCode52 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.cityName;
            int iHashCode54 = (iHashCode53 + (str19 == null ? 0 : str19.hashCode())) * 31;
            String str20 = this.ttTypeNameMedium;
            int iHashCode55 = (iHashCode54 + (str20 == null ? 0 : str20.hashCode())) * 31;
            String str21 = this.countryCode;
            int iHashCode56 = (iHashCode55 + (str21 == null ? 0 : str21.hashCode())) * 31;
            String str22 = this.ttTypeNameTiny;
            int iHashCode57 = (iHashCode56 + (str22 == null ? 0 : str22.hashCode())) * 31;
            PoiStyleConfig poiStyleConfig = this.poiStyleConfig;
            int iHashCode58 = (iHashCode57 + (poiStyleConfig == null ? 0 : poiStyleConfig.hashCode())) * 31;
            List<PoiHeadMergedTag> list5 = this.mergedTagsList;
            int iHashCode59 = (iHashCode58 + (list5 == null ? 0 : list5.hashCode())) * 31;
            PoiHeadAiSummary poiHeadAiSummary = this.aiSummary;
            int iHashCode60 = (iHashCode59 + (poiHeadAiSummary == null ? 0 : poiHeadAiSummary.hashCode())) * 31;
            Boolean bool11 = this.isProductVisible;
            int iHashCode61 = (iHashCode60 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            List<PoiDetailTag> list6 = this.trustTags;
            int iHashCode62 = (iHashCode61 + (list6 == null ? 0 : list6.hashCode())) * 31;
            String str23 = this.highLightCategoryName;
            int iHashCode63 = (iHashCode62 + (str23 == null ? 0 : str23.hashCode())) * 31;
            PoiHeaderButtonGroup poiHeaderButtonGroup = this.poiHeadButtonGroup;
            int iHashCode64 = (iHashCode63 + (poiHeaderButtonGroup == null ? 0 : poiHeaderButtonGroup.hashCode())) * 31;
            Boolean bool12 = this.showBottomBarWhenDisappear;
            int iHashCode65 = (iHashCode64 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            Integer num2 = this.poiDetailPageOpt;
            int iHashCode66 = (iHashCode65 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool13 = this.noNeedEmptyFeed;
            int iHashCode67 = (iHashCode66 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
            PoiReviewEntrance poiReviewEntrance = this.poiReviewEntrance;
            int iHashCode68 = (iHashCode67 + (poiReviewEntrance == null ? 0 : poiReviewEntrance.hashCode())) * 31;
            PoiYearForDisplay poiYearForDisplay = this.yearForDisplay;
            int iHashCode69 = (iHashCode68 + (poiYearForDisplay == null ? 0 : poiYearForDisplay.hashCode())) * 31;
            String str24 = this.LL;
            int iHashCode70 = (iHashCode69 + (str24 == null ? 0 : str24.hashCode())) * 31;
            Boolean bool14 = this.LLILLJJLI;
            return iHashCode70 + (bool14 != null ? bool14.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            return "PoiDetailResponse(name=" + this.name + ", address=" + this.address + ", cover=" + this.cover + ", pictureAlbum=" + this.pictureAlbum + ", isCollected=" + this.isCollected + ", collectInfo=" + this.collectInfo + ", poiInfoSource=" + this.poiInfoSource + ", cityCode=" + this.cityCode + ", regionCode=" + this.regionCode + ", typeLevel=" + this.typeLevel + ", fatherPoi=" + this.fatherPoi + ", storeInfo=" + this.storeInfo + ", tags=" + this.tags + ", poiHighlightTagModule=" + this.poiHighlightTagModule + ", poiTopTags=" + this.poiTopTags + ", poiDetailTagStyleMap=" + this.poiDetailTagStyleMap + ", ownerInfo=" + this.ownerInfo + ", poiLocation=" + this.poiLocation + ", distanceInfo=" + this.distanceInfo + ", phoneInfo=" + this.phoneInfo + ", editPoiStatus=" + this.editPoiStatus + ", dynamicMapParams=" + this.dynamicMapParams + ", claimStoreStatus=" + this.claimStoreStatus + ", reportInfo=" + this.reportInfo + ", isBaAccount=" + this.isBaAccount + ", categoryName=" + this.categoryName + ", averagePrice=" + this.averagePrice + ", followOwnerStatus=" + this.followOwnerStatus + ", shareInfo=" + this.shareInfo + ", poiReviewSummaryModel=" + this.poiReviewSummaryModel + ", realFavoriteCnt=" + this.realFavoriteCnt + ", bookingInfo=" + this.bookingInfo + ", poiShopBookingInfoList=" + this.poiShopBookingInfoList + ", haveRegionDiscovery=" + this.haveRegionDiscovery + ", haveBackgroundTopMap=" + this.haveBackgroundTopMap + ", poiThirdPartyKeyInfo=" + this.poiThirdPartyKeyInfo + ", haveProductShelf=" + this.haveProductShelf + ", bannerListInfo=" + this.bannerListInfo + ", headerCoverImage=" + this.headerCoverImage + ", poiIntro=" + this.poiIntro + ", showHelpCenter=" + this.showHelpCenter + ", helpCenterUrl=" + this.helpCenterUrl + ", userLocation=" + this.userLocation + ", chartTag=" + this.chartTag + ", intentButtonConfig=" + this.intentButtonConfig + ", cleanModeHeaderConfig=" + this.cleanModeHeaderConfig + ", isSemiClosedLoopHotel=" + this.isSemiClosedLoopHotel + ", provinceCode=" + this.provinceCode + ", ttTypeCode=" + this.ttTypeCode + ", geoNameIds=" + this.geoNameIds + ", ttTypeNameSuper=" + this.ttTypeNameSuper + ", cityPoiName=" + this.cityPoiName + ", cityPoiId=" + this.cityPoiId + ", cityName=" + this.cityName + ", ttTypeNameMedium=" + this.ttTypeNameMedium + ", countryCode=" + this.countryCode + ", ttTypeNameTiny=" + this.ttTypeNameTiny + ", poiStyleConfig=" + this.poiStyleConfig + ", mergedTagsList=" + this.mergedTagsList + ", aiSummary=" + this.aiSummary + ", isProductVisible=" + this.isProductVisible + ", trustTags=" + this.trustTags + ", highLightCategoryName=" + this.highLightCategoryName + ", poiHeadButtonGroup=" + this.poiHeadButtonGroup + ", showBottomBarWhenDisappear=" + this.showBottomBarWhenDisappear + ", poiDetailPageOpt=" + this.poiDetailPageOpt + ", noNeedEmptyFeed=" + this.noNeedEmptyFeed + ", poiReviewEntrance=" + this.poiReviewEntrance + ", yearForDisplay=" + this.yearForDisplay + ", rdTtlsDataSource=" + this.LL + ", forceRefreshSignal=" + this.LLILLJJLI + ')';
        }

        public final String getPartnerDataSource() {
            List<PoiBookingProviderInfo> list;
            PoiBookingInfo poiBookingInfo = this.bookingInfo;
            if (poiBookingInfo != null && (list = poiBookingInfo.providers) != null) {
                ArrayList arrayList = new ArrayList();
                for (PoiBookingProviderInfo poiBookingProviderInfo : list) {
                    PoiBookingProviderInfo poiBookingProviderInfo2 = poiBookingProviderInfo;
                    if (poiBookingProviderInfo2.provider != null && poiBookingProviderInfo2.url != null) {
                        arrayList.add(poiBookingProviderInfo);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((PoiBookingProviderInfo) it2.next()).provider);
                }
                String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
                if (strLJJLIIIJ != null) {
                    return strLJJLIIIJ;
                }
            }
            return "";
        }

        public final boolean hasReserveTable() {
            List<PoiBookingProviderInfo> list;
            PoiBookingInfo poiBookingInfo = this.bookingInfo;
            return (poiBookingInfo == null || (list = poiBookingInfo.providers) == null || C13LP.LJJJLL(list) == null) ? false : true;
        }

        public final boolean isClaimed() {
            OwnerInfoModel ownerInfoModel = this.ownerInfo;
            return ownerInfoModel != null && C123100dR.LIZ(ownerInfoModel.uid);
        }

        public final boolean isHeaderAlbumMode() {
            PictureAlbum pictureAlbum = this.pictureAlbum;
            if (pictureAlbum == null || pictureAlbum.albumMode != EnumC035600Ao.LARGE_HEADER.getValue()) {
                return false;
            }
            List<UrlModel> picturesByExperiment = this.pictureAlbum.getPicturesByExperiment();
            return C1175120ggY.LIZJ(picturesByExperiment != null ? Integer.valueOf(picturesByExperiment.size()) : null) > 0;
        }

        public final boolean isHeaderImageMode() {
            List<String> urlList;
            UrlModel urlModel = this.headerCoverImage;
            if (urlModel == null || (urlList = urlModel.getUrlList()) == null || urlList.size() <= 0) {
                return false;
            }
            C1184920gwM c1184920gwM = EnumC1184730gw3.Companion;
            String str = this.typeLevel;
            boolean zIsClaimed = isClaimed();
            c1184920gwM.getClass();
            return C1184920gwM.LIZ(str, zIsClaimed) == EnumC1184730gw3.REGIONAL;
        }

        public final boolean isRegionalPOI() {
            C1184920gwM c1184920gwM = EnumC1184730gw3.Companion;
            String str = this.typeLevel;
            c1184920gwM.getClass();
            return C1184920gwM.LIZ(str, false) == EnumC1184730gw3.REGIONAL;
        }

        public final boolean isStoreType() {
            C1184920gwM c1184920gwM = EnumC1184730gw3.Companion;
            String str = this.typeLevel;
            boolean zIsClaimed = isClaimed();
            c1184920gwM.getClass();
            EnumC1184730gw3 enumC1184730gw3LIZ = C1184920gwM.LIZ(str, zIsClaimed);
            return enumC1184730gw3LIZ == EnumC1184730gw3.CLAIMED_STORE || enumC1184730gw3LIZ == EnumC1184730gw3.UN_CLAIMED_STORE;
        }

        public final String poiTypeName() {
            C1184920gwM c1184920gwM = EnumC1184730gw3.Companion;
            String str = this.typeLevel;
            boolean zIsClaimed = isClaimed();
            c1184920gwM.getClass();
            return C1184920gwM.LIZ(str, zIsClaimed).getTypeName();
        }

        public final boolean showPoiSmallPic() {
            return (this.cover == null || isHeaderAlbumMode()) ? false : true;
        }

        public final String isClaimedForMob() {
            return isStoreType() ? isClaimed() ? "1" : CardStruct.IStatusCode.DEFAULT : "";
        }

        public final Boolean isClaimedForMobBoolType() {
            if (isStoreType()) {
                return Boolean.valueOf(isClaimed());
            }
            return null;
        }

        public final boolean isNonRegionalPOI() {
            return !isRegionalPOI();
        }

        public final String mobPicMode() {
            if (isHeaderAlbumMode()) {
                return "large_header_image";
            }
            if (showPoiSmallPic()) {
                return "small_header_image";
            }
            return null;
        }

        public final String getAddress() {
            return this.address;
        }

        public final PoiHeadAiSummary getAiSummary() {
            return this.aiSummary;
        }

        public final String getAveragePrice() {
            return this.averagePrice;
        }

        public final List<PoiActivityApi.PoiBannerInfo> getBannerListInfo() {
            return this.bannerListInfo;
        }

        public final PoiBookingInfo getBookingInfo() {
            return this.bookingInfo;
        }

        public final String getCategoryName() {
            return this.categoryName;
        }

        public final ChartInfo getChartTag() {
            return this.chartTag;
        }

        public final String getCityCode() {
            return this.cityCode;
        }

        public final String getCityName() {
            return this.cityName;
        }

        public final String getCityPoiId() {
            return this.cityPoiId;
        }

        public final String getCityPoiName() {
            return this.cityPoiName;
        }

        public final Boolean getClaimStoreStatus() {
            return this.claimStoreStatus;
        }

        public final CleanModeHeaderConfig getCleanModeHeaderConfig() {
            return this.cleanModeHeaderConfig;
        }

        public final String getCollectInfo() {
            return this.collectInfo;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public final UrlModel getCover() {
            return this.cover;
        }

        public final Boolean getDataFromAnchor() {
            return this.LLILLL;
        }

        public final DistanceInfo getDistanceInfo() {
            return this.distanceInfo;
        }

        public final DynamicMapParams getDynamicMapParams() {
            return this.dynamicMapParams;
        }

        public final Boolean getEditPoiStatus() {
            return this.editPoiStatus;
        }

        public final FatherPoiModel getFatherPoi() {
            return this.fatherPoi;
        }

        public final Boolean getFollowOwnerStatus() {
            return this.followOwnerStatus;
        }

        public final Boolean getForceRefreshSignal() {
            return this.LLILLJJLI;
        }

        public final String getGeoNameIds() {
            return this.geoNameIds;
        }

        public final Boolean getHaveBackgroundTopMap() {
            return this.haveBackgroundTopMap;
        }

        public final Boolean getHaveProductShelf() {
            return this.haveProductShelf;
        }

        public final Boolean getHaveRegionDiscovery() {
            return this.haveRegionDiscovery;
        }

        public final UrlModel getHeaderCoverImage() {
            return this.headerCoverImage;
        }

        public final String getHelpCenterUrl() {
            return this.helpCenterUrl;
        }

        public final String getHighLightCategoryName() {
            return this.highLightCategoryName;
        }

        public final IntentButtonConfig getIntentButtonConfig() {
            return this.intentButtonConfig;
        }

        public final List<PoiHeadMergedTag> getMergedTagsList() {
            return this.mergedTagsList;
        }

        public final String getName() {
            return this.name;
        }

        public final Boolean getNoNeedEmptyFeed() {
            return this.noNeedEmptyFeed;
        }

        public final OwnerInfoModel getOwnerInfo() {
            return this.ownerInfo;
        }

        public final PhoneInfo getPhoneInfo() {
            return this.phoneInfo;
        }

        public final PictureAlbum getPictureAlbum() {
            return this.pictureAlbum;
        }

        public final Integer getPoiDetailPageOpt() {
            return this.poiDetailPageOpt;
        }

        public final Map<String, PoiDetailTagStyle> getPoiDetailTagStyleMap() {
            return this.poiDetailTagStyleMap;
        }

        public final PoiHeaderButtonGroup getPoiHeadButtonGroup() {
            return this.poiHeadButtonGroup;
        }

        public final PoiHighlightTagModule getPoiHighlightTagModule() {
            return this.poiHighlightTagModule;
        }

        public final String getPoiInfoSource() {
            return this.poiInfoSource;
        }

        public final String getPoiIntro() {
            return this.poiIntro;
        }

        public final PoiLocation getPoiLocation() {
            return this.poiLocation;
        }

        public final PoiReviewEntrance getPoiReviewEntrance() {
            return this.poiReviewEntrance;
        }

        public final PoiReviewsApi.PoiReviewSummaryModel getPoiReviewSummaryModel() {
            return this.poiReviewSummaryModel;
        }

        public final List<PoiShopBookingInfo> getPoiShopBookingInfoList() {
            return this.poiShopBookingInfoList;
        }

        public final PoiStyleConfig getPoiStyleConfig() {
            return this.poiStyleConfig;
        }

        public final String getPoiThirdPartyKeyInfo() {
            return this.poiThirdPartyKeyInfo;
        }

        public final List<PoiDetailTag> getPoiTopTags() {
            return this.poiTopTags;
        }

        public final String getProvinceCode() {
            return this.provinceCode;
        }

        public final String getRdTtlsDataSource() {
            return this.LL;
        }

        public final Long getRealFavoriteCnt() {
            return this.realFavoriteCnt;
        }

        public final String getRegionCode() {
            return this.regionCode;
        }

        public final ReportInfo getReportInfo() {
            return this.reportInfo;
        }

        public final ShareInfo getShareInfo() {
            return this.shareInfo;
        }

        public final Boolean getShowBottomBarWhenDisappear() {
            return this.showBottomBarWhenDisappear;
        }

        public final Boolean getShowHelpCenter() {
            return this.showHelpCenter;
        }

        public final StoreInfoModel getStoreInfo() {
            return this.storeInfo;
        }

        public final List<PoiDetailTag> getTags() {
            return this.tags;
        }

        public final List<PoiDetailTag> getTrustTags() {
            return this.trustTags;
        }

        public final String getTtTypeCode() {
            return this.ttTypeCode;
        }

        public final String getTtTypeNameMedium() {
            return this.ttTypeNameMedium;
        }

        public final String getTtTypeNameSuper() {
            return this.ttTypeNameSuper;
        }

        public final String getTtTypeNameTiny() {
            return this.ttTypeNameTiny;
        }

        public final String getTypeLevel() {
            return this.typeLevel;
        }

        public final Integer getUserLocation() {
            return this.userLocation;
        }

        public final PoiYearForDisplay getYearForDisplay() {
            return this.yearForDisplay;
        }

        public final Boolean isBaAccount() {
            return this.isBaAccount;
        }

        public final Boolean isCollected() {
            return this.isCollected;
        }

        public final Boolean isProductVisible() {
            return this.isProductVisible;
        }

        public final Boolean isSemiClosedLoopHotel() {
            return this.isSemiClosedLoopHotel;
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1891350zJl
        public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            return areItemTheSame(interfaceC1891350zJl);
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1891350zJl
        public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            if (this == interfaceC1891350zJl) {
                return true;
            }
            if (!(interfaceC1891350zJl instanceof PoiDetailResponse)) {
                return false;
            }
            return Intrinsics.LJFF(this.name, ((PoiDetailResponse) interfaceC1891350zJl).name);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0018 A[PHI: r46
          0x0018: PHI (r46v26 java.lang.String) = (r46v0 java.lang.String), (r46v27 java.lang.String) binds: [B:7:0x0010, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x001e A[PHI: r45 r46
          0x001e: PHI (r45v0 java.lang.String) = (r45v25 java.lang.String), (r45v26 java.lang.String) binds: [B:11:0x001c, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]
          0x001e: PHI (r46v1 java.lang.String) = (r46v26 java.lang.String), (r46v27 java.lang.String) binds: [B:11:0x001c, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[PHI: r45 r46
          0x0024: PHI (r45v24 java.lang.String) = (r45v0 java.lang.String), (r45v25 java.lang.String) binds: [B:13:0x0022, B:11:0x001c] A[DONT_GENERATE, DONT_INLINE]
          0x0024: PHI (r46v25 java.lang.String) = (r46v1 java.lang.String), (r46v26 java.lang.String) binds: [B:13:0x0022, B:11:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x002a A[PHI: r44 r45 r46
          0x002a: PHI (r44v23 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v0 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v24 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:13:0x0022, B:15:0x0028] A[DONT_GENERATE, DONT_INLINE]
          0x002a: PHI (r45v23 java.lang.String) = (r45v0 java.lang.String), (r45v24 java.lang.String) binds: [B:13:0x0022, B:15:0x0028] A[DONT_GENERATE, DONT_INLINE]
          0x002a: PHI (r46v24 java.lang.String) = (r46v1 java.lang.String), (r46v25 java.lang.String) binds: [B:13:0x0022, B:15:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[PHI: r44 r45 r46
          0x0030: PHI (r44v1 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v23 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v24 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:17:0x002e, B:15:0x0028] A[DONT_GENERATE, DONT_INLINE]
          0x0030: PHI (r45v1 java.lang.String) = (r45v23 java.lang.String), (r45v24 java.lang.String) binds: [B:17:0x002e, B:15:0x0028] A[DONT_GENERATE, DONT_INLINE]
          0x0030: PHI (r46v2 java.lang.String) = (r46v24 java.lang.String), (r46v25 java.lang.String) binds: [B:17:0x002e, B:15:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[PHI: r43 r44 r45 r46
          0x0036: PHI (r43v21 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v0 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v22 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:19:0x0034, B:17:0x002e] A[DONT_GENERATE, DONT_INLINE]
          0x0036: PHI (r44v22 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v1 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v23 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:19:0x0034, B:17:0x002e] A[DONT_GENERATE, DONT_INLINE]
          0x0036: PHI (r45v22 java.lang.String) = (r45v1 java.lang.String), (r45v23 java.lang.String) binds: [B:19:0x0034, B:17:0x002e] A[DONT_GENERATE, DONT_INLINE]
          0x0036: PHI (r46v23 java.lang.String) = (r46v2 java.lang.String), (r46v24 java.lang.String) binds: [B:19:0x0034, B:17:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[PHI: r43 r44 r45 r46
          0x003c: PHI (r43v20 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v0 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v21 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:19:0x0034, B:21:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x003c: PHI (r44v21 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v1 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v22 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:19:0x0034, B:21:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x003c: PHI (r45v21 java.lang.String) = (r45v1 java.lang.String), (r45v22 java.lang.String) binds: [B:19:0x0034, B:21:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x003c: PHI (r46v22 java.lang.String) = (r46v2 java.lang.String), (r46v23 java.lang.String) binds: [B:19:0x0034, B:21:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0042 A[PHI: r42 r43 r44 r45 r46
          0x0042: PHI (r42v0 java.lang.Boolean) = (r42v19 java.lang.Boolean), (r42v20 java.lang.Boolean) binds: [B:23:0x0040, B:21:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x0042: PHI (r43v1 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v20 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v21 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:23:0x0040, B:21:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x0042: PHI (r44v2 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v21 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v22 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:23:0x0040, B:21:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x0042: PHI (r45v2 java.lang.String) = (r45v21 java.lang.String), (r45v22 java.lang.String) binds: [B:23:0x0040, B:21:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x0042: PHI (r46v3 java.lang.String) = (r46v22 java.lang.String), (r46v23 java.lang.String) binds: [B:23:0x0040, B:21:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0048 A[PHI: r42 r43 r44 r45 r46
          0x0048: PHI (r42v18 java.lang.Boolean) = (r42v0 java.lang.Boolean), (r42v19 java.lang.Boolean) binds: [B:25:0x0046, B:23:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x0048: PHI (r43v19 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v1 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v20 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:25:0x0046, B:23:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x0048: PHI (r44v20 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v2 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v21 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:25:0x0046, B:23:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x0048: PHI (r45v20 java.lang.String) = (r45v2 java.lang.String), (r45v21 java.lang.String) binds: [B:25:0x0046, B:23:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x0048: PHI (r46v21 java.lang.String) = (r46v3 java.lang.String), (r46v22 java.lang.String) binds: [B:25:0x0046, B:23:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x004e A[PHI: r41 r42 r43 r44 r45 r46
          0x004e: PHI (r41v17 java.lang.String) = (r41v0 java.lang.String), (r41v18 java.lang.String) binds: [B:25:0x0046, B:27:0x004c] A[DONT_GENERATE, DONT_INLINE]
          0x004e: PHI (r42v17 java.lang.Boolean) = (r42v0 java.lang.Boolean), (r42v18 java.lang.Boolean) binds: [B:25:0x0046, B:27:0x004c] A[DONT_GENERATE, DONT_INLINE]
          0x004e: PHI (r43v18 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v1 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v19 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:25:0x0046, B:27:0x004c] A[DONT_GENERATE, DONT_INLINE]
          0x004e: PHI (r44v19 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v2 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v20 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:25:0x0046, B:27:0x004c] A[DONT_GENERATE, DONT_INLINE]
          0x004e: PHI (r45v19 java.lang.String) = (r45v2 java.lang.String), (r45v20 java.lang.String) binds: [B:25:0x0046, B:27:0x004c] A[DONT_GENERATE, DONT_INLINE]
          0x004e: PHI (r46v20 java.lang.String) = (r46v3 java.lang.String), (r46v21 java.lang.String) binds: [B:25:0x0046, B:27:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0054 A[PHI: r41 r42 r43 r44 r45 r46
          0x0054: PHI (r41v1 java.lang.String) = (r41v17 java.lang.String), (r41v18 java.lang.String) binds: [B:29:0x0052, B:27:0x004c] A[DONT_GENERATE, DONT_INLINE]
          0x0054: PHI (r42v1 java.lang.Boolean) = (r42v17 java.lang.Boolean), (r42v18 java.lang.Boolean) binds: [B:29:0x0052, B:27:0x004c] A[DONT_GENERATE, DONT_INLINE]
          0x0054: PHI (r43v2 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v18 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v19 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:29:0x0052, B:27:0x004c] A[DONT_GENERATE, DONT_INLINE]
          0x0054: PHI (r44v3 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v19 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v20 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:29:0x0052, B:27:0x004c] A[DONT_GENERATE, DONT_INLINE]
          0x0054: PHI (r45v3 java.lang.String) = (r45v19 java.lang.String), (r45v20 java.lang.String) binds: [B:29:0x0052, B:27:0x004c] A[DONT_GENERATE, DONT_INLINE]
          0x0054: PHI (r46v4 java.lang.String) = (r46v20 java.lang.String), (r46v21 java.lang.String) binds: [B:29:0x0052, B:27:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x005a A[PHI: r40 r41 r42 r43 r44 r45 r46
          0x005a: PHI (r40v15 java.lang.String) = (r40v0 java.lang.String), (r40v16 java.lang.String) binds: [B:31:0x0058, B:29:0x0052] A[DONT_GENERATE, DONT_INLINE]
          0x005a: PHI (r41v16 java.lang.String) = (r41v1 java.lang.String), (r41v17 java.lang.String) binds: [B:31:0x0058, B:29:0x0052] A[DONT_GENERATE, DONT_INLINE]
          0x005a: PHI (r42v16 java.lang.Boolean) = (r42v1 java.lang.Boolean), (r42v17 java.lang.Boolean) binds: [B:31:0x0058, B:29:0x0052] A[DONT_GENERATE, DONT_INLINE]
          0x005a: PHI (r43v17 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v2 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v18 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:31:0x0058, B:29:0x0052] A[DONT_GENERATE, DONT_INLINE]
          0x005a: PHI (r44v18 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v3 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v19 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:31:0x0058, B:29:0x0052] A[DONT_GENERATE, DONT_INLINE]
          0x005a: PHI (r45v18 java.lang.String) = (r45v3 java.lang.String), (r45v19 java.lang.String) binds: [B:31:0x0058, B:29:0x0052] A[DONT_GENERATE, DONT_INLINE]
          0x005a: PHI (r46v19 java.lang.String) = (r46v4 java.lang.String), (r46v20 java.lang.String) binds: [B:31:0x0058, B:29:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0060 A[PHI: r40 r41 r42 r43 r44 r45 r46
          0x0060: PHI (r40v14 java.lang.String) = (r40v0 java.lang.String), (r40v15 java.lang.String) binds: [B:31:0x0058, B:33:0x005e] A[DONT_GENERATE, DONT_INLINE]
          0x0060: PHI (r41v15 java.lang.String) = (r41v1 java.lang.String), (r41v16 java.lang.String) binds: [B:31:0x0058, B:33:0x005e] A[DONT_GENERATE, DONT_INLINE]
          0x0060: PHI (r42v15 java.lang.Boolean) = (r42v1 java.lang.Boolean), (r42v16 java.lang.Boolean) binds: [B:31:0x0058, B:33:0x005e] A[DONT_GENERATE, DONT_INLINE]
          0x0060: PHI (r43v16 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v2 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v17 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:31:0x0058, B:33:0x005e] A[DONT_GENERATE, DONT_INLINE]
          0x0060: PHI (r44v17 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v3 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v18 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:31:0x0058, B:33:0x005e] A[DONT_GENERATE, DONT_INLINE]
          0x0060: PHI (r45v17 java.lang.String) = (r45v3 java.lang.String), (r45v18 java.lang.String) binds: [B:31:0x0058, B:33:0x005e] A[DONT_GENERATE, DONT_INLINE]
          0x0060: PHI (r46v18 java.lang.String) = (r46v4 java.lang.String), (r46v19 java.lang.String) binds: [B:31:0x0058, B:33:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0066 A[PHI: r39 r40 r41 r42 r43 r44 r45 r46
          0x0066: PHI (r39v0 java.lang.String) = (r39v13 java.lang.String), (r39v14 java.lang.String) binds: [B:35:0x0064, B:33:0x005e] A[DONT_GENERATE, DONT_INLINE]
          0x0066: PHI (r40v1 java.lang.String) = (r40v14 java.lang.String), (r40v15 java.lang.String) binds: [B:35:0x0064, B:33:0x005e] A[DONT_GENERATE, DONT_INLINE]
          0x0066: PHI (r41v2 java.lang.String) = (r41v15 java.lang.String), (r41v16 java.lang.String) binds: [B:35:0x0064, B:33:0x005e] A[DONT_GENERATE, DONT_INLINE]
          0x0066: PHI (r42v2 java.lang.Boolean) = (r42v15 java.lang.Boolean), (r42v16 java.lang.Boolean) binds: [B:35:0x0064, B:33:0x005e] A[DONT_GENERATE, DONT_INLINE]
          0x0066: PHI (r43v3 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v16 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v17 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:35:0x0064, B:33:0x005e] A[DONT_GENERATE, DONT_INLINE]
          0x0066: PHI (r44v4 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v17 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v18 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:35:0x0064, B:33:0x005e] A[DONT_GENERATE, DONT_INLINE]
          0x0066: PHI (r45v4 java.lang.String) = (r45v17 java.lang.String), (r45v18 java.lang.String) binds: [B:35:0x0064, B:33:0x005e] A[DONT_GENERATE, DONT_INLINE]
          0x0066: PHI (r46v5 java.lang.String) = (r46v18 java.lang.String), (r46v19 java.lang.String) binds: [B:35:0x0064, B:33:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x006c A[PHI: r39 r40 r41 r42 r43 r44 r45 r46
          0x006c: PHI (r39v12 java.lang.String) = (r39v0 java.lang.String), (r39v13 java.lang.String) binds: [B:37:0x006a, B:35:0x0064] A[DONT_GENERATE, DONT_INLINE]
          0x006c: PHI (r40v13 java.lang.String) = (r40v1 java.lang.String), (r40v14 java.lang.String) binds: [B:37:0x006a, B:35:0x0064] A[DONT_GENERATE, DONT_INLINE]
          0x006c: PHI (r41v14 java.lang.String) = (r41v2 java.lang.String), (r41v15 java.lang.String) binds: [B:37:0x006a, B:35:0x0064] A[DONT_GENERATE, DONT_INLINE]
          0x006c: PHI (r42v14 java.lang.Boolean) = (r42v2 java.lang.Boolean), (r42v15 java.lang.Boolean) binds: [B:37:0x006a, B:35:0x0064] A[DONT_GENERATE, DONT_INLINE]
          0x006c: PHI (r43v15 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v3 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v16 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:37:0x006a, B:35:0x0064] A[DONT_GENERATE, DONT_INLINE]
          0x006c: PHI (r44v16 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v4 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v17 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:37:0x006a, B:35:0x0064] A[DONT_GENERATE, DONT_INLINE]
          0x006c: PHI (r45v16 java.lang.String) = (r45v4 java.lang.String), (r45v17 java.lang.String) binds: [B:37:0x006a, B:35:0x0064] A[DONT_GENERATE, DONT_INLINE]
          0x006c: PHI (r46v17 java.lang.String) = (r46v5 java.lang.String), (r46v18 java.lang.String) binds: [B:37:0x006a, B:35:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0072 A[PHI: r38 r39 r40 r41 r42 r43 r44 r45 r46
          0x0072: PHI (r38v11 java.lang.String) = (r38v0 java.lang.String), (r38v12 java.lang.String) binds: [B:37:0x006a, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]
          0x0072: PHI (r39v11 java.lang.String) = (r39v0 java.lang.String), (r39v12 java.lang.String) binds: [B:37:0x006a, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]
          0x0072: PHI (r40v12 java.lang.String) = (r40v1 java.lang.String), (r40v13 java.lang.String) binds: [B:37:0x006a, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]
          0x0072: PHI (r41v13 java.lang.String) = (r41v2 java.lang.String), (r41v14 java.lang.String) binds: [B:37:0x006a, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]
          0x0072: PHI (r42v13 java.lang.Boolean) = (r42v2 java.lang.Boolean), (r42v14 java.lang.Boolean) binds: [B:37:0x006a, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]
          0x0072: PHI (r43v14 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v3 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v15 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:37:0x006a, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]
          0x0072: PHI (r44v15 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v4 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v16 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:37:0x006a, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]
          0x0072: PHI (r45v15 java.lang.String) = (r45v4 java.lang.String), (r45v16 java.lang.String) binds: [B:37:0x006a, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]
          0x0072: PHI (r46v16 java.lang.String) = (r46v5 java.lang.String), (r46v17 java.lang.String) binds: [B:37:0x006a, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0078 A[PHI: r38 r39 r40 r41 r42 r43 r44 r45 r46
          0x0078: PHI (r38v1 java.lang.String) = (r38v11 java.lang.String), (r38v12 java.lang.String) binds: [B:41:0x0076, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]
          0x0078: PHI (r39v1 java.lang.String) = (r39v11 java.lang.String), (r39v12 java.lang.String) binds: [B:41:0x0076, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]
          0x0078: PHI (r40v2 java.lang.String) = (r40v12 java.lang.String), (r40v13 java.lang.String) binds: [B:41:0x0076, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]
          0x0078: PHI (r41v3 java.lang.String) = (r41v13 java.lang.String), (r41v14 java.lang.String) binds: [B:41:0x0076, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]
          0x0078: PHI (r42v3 java.lang.Boolean) = (r42v13 java.lang.Boolean), (r42v14 java.lang.Boolean) binds: [B:41:0x0076, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]
          0x0078: PHI (r43v4 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v14 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v15 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:41:0x0076, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]
          0x0078: PHI (r44v5 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v15 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v16 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:41:0x0076, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]
          0x0078: PHI (r45v5 java.lang.String) = (r45v15 java.lang.String), (r45v16 java.lang.String) binds: [B:41:0x0076, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]
          0x0078: PHI (r46v6 java.lang.String) = (r46v16 java.lang.String), (r46v17 java.lang.String) binds: [B:41:0x0076, B:39:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x007e A[PHI: r37 r38 r39 r40 r41 r42 r43 r44 r45 r46
          0x007e: PHI (r37v9 java.lang.String) = (r37v0 java.lang.String), (r37v10 java.lang.String) binds: [B:43:0x007c, B:41:0x0076] A[DONT_GENERATE, DONT_INLINE]
          0x007e: PHI (r38v10 java.lang.String) = (r38v1 java.lang.String), (r38v11 java.lang.String) binds: [B:43:0x007c, B:41:0x0076] A[DONT_GENERATE, DONT_INLINE]
          0x007e: PHI (r39v10 java.lang.String) = (r39v1 java.lang.String), (r39v11 java.lang.String) binds: [B:43:0x007c, B:41:0x0076] A[DONT_GENERATE, DONT_INLINE]
          0x007e: PHI (r40v11 java.lang.String) = (r40v2 java.lang.String), (r40v12 java.lang.String) binds: [B:43:0x007c, B:41:0x0076] A[DONT_GENERATE, DONT_INLINE]
          0x007e: PHI (r41v12 java.lang.String) = (r41v3 java.lang.String), (r41v13 java.lang.String) binds: [B:43:0x007c, B:41:0x0076] A[DONT_GENERATE, DONT_INLINE]
          0x007e: PHI (r42v12 java.lang.Boolean) = (r42v3 java.lang.Boolean), (r42v13 java.lang.Boolean) binds: [B:43:0x007c, B:41:0x0076] A[DONT_GENERATE, DONT_INLINE]
          0x007e: PHI (r43v13 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v4 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v14 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:43:0x007c, B:41:0x0076] A[DONT_GENERATE, DONT_INLINE]
          0x007e: PHI (r44v14 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v5 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v15 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:43:0x007c, B:41:0x0076] A[DONT_GENERATE, DONT_INLINE]
          0x007e: PHI (r45v14 java.lang.String) = (r45v5 java.lang.String), (r45v15 java.lang.String) binds: [B:43:0x007c, B:41:0x0076] A[DONT_GENERATE, DONT_INLINE]
          0x007e: PHI (r46v15 java.lang.String) = (r46v6 java.lang.String), (r46v16 java.lang.String) binds: [B:43:0x007c, B:41:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0084 A[PHI: r37 r38 r39 r40 r41 r42 r43 r44 r45 r46
          0x0084: PHI (r37v8 java.lang.String) = (r37v0 java.lang.String), (r37v9 java.lang.String) binds: [B:43:0x007c, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x0084: PHI (r38v9 java.lang.String) = (r38v1 java.lang.String), (r38v10 java.lang.String) binds: [B:43:0x007c, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x0084: PHI (r39v9 java.lang.String) = (r39v1 java.lang.String), (r39v10 java.lang.String) binds: [B:43:0x007c, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x0084: PHI (r40v10 java.lang.String) = (r40v2 java.lang.String), (r40v11 java.lang.String) binds: [B:43:0x007c, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x0084: PHI (r41v11 java.lang.String) = (r41v3 java.lang.String), (r41v12 java.lang.String) binds: [B:43:0x007c, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x0084: PHI (r42v11 java.lang.Boolean) = (r42v3 java.lang.Boolean), (r42v12 java.lang.Boolean) binds: [B:43:0x007c, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x0084: PHI (r43v12 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v4 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v13 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:43:0x007c, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x0084: PHI (r44v13 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v5 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v14 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:43:0x007c, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x0084: PHI (r45v13 java.lang.String) = (r45v5 java.lang.String), (r45v14 java.lang.String) binds: [B:43:0x007c, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x0084: PHI (r46v14 java.lang.String) = (r46v6 java.lang.String), (r46v15 java.lang.String) binds: [B:43:0x007c, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x008a A[PHI: r36 r37 r38 r39 r40 r41 r42 r43 r44 r45 r46
          0x008a: PHI (r36v0 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel) = 
          (r36v7 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel)
          (r36v8 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel)
         binds: [B:47:0x0088, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x008a: PHI (r37v1 java.lang.String) = (r37v8 java.lang.String), (r37v9 java.lang.String) binds: [B:47:0x0088, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x008a: PHI (r38v2 java.lang.String) = (r38v9 java.lang.String), (r38v10 java.lang.String) binds: [B:47:0x0088, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x008a: PHI (r39v2 java.lang.String) = (r39v9 java.lang.String), (r39v10 java.lang.String) binds: [B:47:0x0088, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x008a: PHI (r40v3 java.lang.String) = (r40v10 java.lang.String), (r40v11 java.lang.String) binds: [B:47:0x0088, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x008a: PHI (r41v4 java.lang.String) = (r41v11 java.lang.String), (r41v12 java.lang.String) binds: [B:47:0x0088, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x008a: PHI (r42v4 java.lang.Boolean) = (r42v11 java.lang.Boolean), (r42v12 java.lang.Boolean) binds: [B:47:0x0088, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x008a: PHI (r43v5 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v12 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v13 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:47:0x0088, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x008a: PHI (r44v6 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v13 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v14 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:47:0x0088, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x008a: PHI (r45v6 java.lang.String) = (r45v13 java.lang.String), (r45v14 java.lang.String) binds: [B:47:0x0088, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]
          0x008a: PHI (r46v7 java.lang.String) = (r46v14 java.lang.String), (r46v15 java.lang.String) binds: [B:47:0x0088, B:45:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0090 A[PHI: r36 r37 r38 r39 r40 r41 r42 r43 r44 r45 r46
          0x0090: PHI (r36v6 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel) = 
          (r36v0 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel)
          (r36v7 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel)
         binds: [B:49:0x008e, B:47:0x0088] A[DONT_GENERATE, DONT_INLINE]
          0x0090: PHI (r37v7 java.lang.String) = (r37v1 java.lang.String), (r37v8 java.lang.String) binds: [B:49:0x008e, B:47:0x0088] A[DONT_GENERATE, DONT_INLINE]
          0x0090: PHI (r38v8 java.lang.String) = (r38v2 java.lang.String), (r38v9 java.lang.String) binds: [B:49:0x008e, B:47:0x0088] A[DONT_GENERATE, DONT_INLINE]
          0x0090: PHI (r39v8 java.lang.String) = (r39v2 java.lang.String), (r39v9 java.lang.String) binds: [B:49:0x008e, B:47:0x0088] A[DONT_GENERATE, DONT_INLINE]
          0x0090: PHI (r40v9 java.lang.String) = (r40v3 java.lang.String), (r40v10 java.lang.String) binds: [B:49:0x008e, B:47:0x0088] A[DONT_GENERATE, DONT_INLINE]
          0x0090: PHI (r41v10 java.lang.String) = (r41v4 java.lang.String), (r41v11 java.lang.String) binds: [B:49:0x008e, B:47:0x0088] A[DONT_GENERATE, DONT_INLINE]
          0x0090: PHI (r42v10 java.lang.Boolean) = (r42v4 java.lang.Boolean), (r42v11 java.lang.Boolean) binds: [B:49:0x008e, B:47:0x0088] A[DONT_GENERATE, DONT_INLINE]
          0x0090: PHI (r43v11 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v5 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v12 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:49:0x008e, B:47:0x0088] A[DONT_GENERATE, DONT_INLINE]
          0x0090: PHI (r44v12 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v6 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v13 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:49:0x008e, B:47:0x0088] A[DONT_GENERATE, DONT_INLINE]
          0x0090: PHI (r45v12 java.lang.String) = (r45v6 java.lang.String), (r45v13 java.lang.String) binds: [B:49:0x008e, B:47:0x0088] A[DONT_GENERATE, DONT_INLINE]
          0x0090: PHI (r46v13 java.lang.String) = (r46v7 java.lang.String), (r46v14 java.lang.String) binds: [B:49:0x008e, B:47:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0096 A[PHI: r35 r36 r37 r38 r39 r40 r41 r42 r43 r44 r45 r46
          0x0096: PHI (r35v5 com.ss.android.ugc.aweme.poi.detail.container.model.StoreInfoModel) = 
          (r35v0 com.ss.android.ugc.aweme.poi.detail.container.model.StoreInfoModel)
          (r35v6 com.ss.android.ugc.aweme.poi.detail.container.model.StoreInfoModel)
         binds: [B:49:0x008e, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r36v5 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel) = 
          (r36v0 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel)
          (r36v6 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel)
         binds: [B:49:0x008e, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r37v6 java.lang.String) = (r37v1 java.lang.String), (r37v7 java.lang.String) binds: [B:49:0x008e, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r38v7 java.lang.String) = (r38v2 java.lang.String), (r38v8 java.lang.String) binds: [B:49:0x008e, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r39v7 java.lang.String) = (r39v2 java.lang.String), (r39v8 java.lang.String) binds: [B:49:0x008e, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r40v8 java.lang.String) = (r40v3 java.lang.String), (r40v9 java.lang.String) binds: [B:49:0x008e, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r41v9 java.lang.String) = (r41v4 java.lang.String), (r41v10 java.lang.String) binds: [B:49:0x008e, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r42v9 java.lang.Boolean) = (r42v4 java.lang.Boolean), (r42v10 java.lang.Boolean) binds: [B:49:0x008e, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r43v10 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v5 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v11 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:49:0x008e, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r44v11 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v6 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v12 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:49:0x008e, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r45v11 java.lang.String) = (r45v6 java.lang.String), (r45v12 java.lang.String) binds: [B:49:0x008e, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x0096: PHI (r46v12 java.lang.String) = (r46v7 java.lang.String), (r46v13 java.lang.String) binds: [B:49:0x008e, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x009c A[PHI: r35 r36 r37 r38 r39 r40 r41 r42 r43 r44 r45 r46
          0x009c: PHI (r35v1 com.ss.android.ugc.aweme.poi.detail.container.model.StoreInfoModel) = 
          (r35v5 com.ss.android.ugc.aweme.poi.detail.container.model.StoreInfoModel)
          (r35v6 com.ss.android.ugc.aweme.poi.detail.container.model.StoreInfoModel)
         binds: [B:53:0x009a, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x009c: PHI (r36v1 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel) = 
          (r36v5 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel)
          (r36v6 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel)
         binds: [B:53:0x009a, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x009c: PHI (r37v2 java.lang.String) = (r37v6 java.lang.String), (r37v7 java.lang.String) binds: [B:53:0x009a, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x009c: PHI (r38v3 java.lang.String) = (r38v7 java.lang.String), (r38v8 java.lang.String) binds: [B:53:0x009a, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x009c: PHI (r39v3 java.lang.String) = (r39v7 java.lang.String), (r39v8 java.lang.String) binds: [B:53:0x009a, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x009c: PHI (r40v4 java.lang.String) = (r40v8 java.lang.String), (r40v9 java.lang.String) binds: [B:53:0x009a, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x009c: PHI (r41v5 java.lang.String) = (r41v9 java.lang.String), (r41v10 java.lang.String) binds: [B:53:0x009a, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x009c: PHI (r42v5 java.lang.Boolean) = (r42v9 java.lang.Boolean), (r42v10 java.lang.Boolean) binds: [B:53:0x009a, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x009c: PHI (r43v6 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v10 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v11 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:53:0x009a, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x009c: PHI (r44v7 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v11 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v12 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:53:0x009a, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x009c: PHI (r45v7 java.lang.String) = (r45v11 java.lang.String), (r45v12 java.lang.String) binds: [B:53:0x009a, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]
          0x009c: PHI (r46v8 java.lang.String) = (r46v12 java.lang.String), (r46v13 java.lang.String) binds: [B:53:0x009a, B:51:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00a2 A[PHI: r34 r35 r36 r37 r38 r39 r40 r41 r42 r43 r44 r45 r46
          0x00a2: PHI (r34v3 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag>) = 
          (r34v0 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag>)
          (r34v4 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag>)
         binds: [B:55:0x00a0, B:53:0x009a] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r35v4 com.ss.android.ugc.aweme.poi.detail.container.model.StoreInfoModel) = 
          (r35v1 com.ss.android.ugc.aweme.poi.detail.container.model.StoreInfoModel)
          (r35v5 com.ss.android.ugc.aweme.poi.detail.container.model.StoreInfoModel)
         binds: [B:55:0x00a0, B:53:0x009a] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r36v4 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel) = 
          (r36v1 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel)
          (r36v5 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel)
         binds: [B:55:0x00a0, B:53:0x009a] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r37v5 java.lang.String) = (r37v2 java.lang.String), (r37v6 java.lang.String) binds: [B:55:0x00a0, B:53:0x009a] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r38v6 java.lang.String) = (r38v3 java.lang.String), (r38v7 java.lang.String) binds: [B:55:0x00a0, B:53:0x009a] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r39v6 java.lang.String) = (r39v3 java.lang.String), (r39v7 java.lang.String) binds: [B:55:0x00a0, B:53:0x009a] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r40v7 java.lang.String) = (r40v4 java.lang.String), (r40v8 java.lang.String) binds: [B:55:0x00a0, B:53:0x009a] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r41v8 java.lang.String) = (r41v5 java.lang.String), (r41v9 java.lang.String) binds: [B:55:0x00a0, B:53:0x009a] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r42v8 java.lang.Boolean) = (r42v5 java.lang.Boolean), (r42v9 java.lang.Boolean) binds: [B:55:0x00a0, B:53:0x009a] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r43v9 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v6 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v10 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:55:0x00a0, B:53:0x009a] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r44v10 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v7 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v11 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:55:0x00a0, B:53:0x009a] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r45v10 java.lang.String) = (r45v7 java.lang.String), (r45v11 java.lang.String) binds: [B:55:0x00a0, B:53:0x009a] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r46v11 java.lang.String) = (r46v8 java.lang.String), (r46v12 java.lang.String) binds: [B:55:0x00a0, B:53:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00a8 A[PHI: r34 r35 r36 r37 r38 r39 r40 r41 r42 r43 r44 r45 r46
          0x00a8: PHI (r34v2 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag>) = 
          (r34v0 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag>)
          (r34v3 java.util.List<com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTag>)
         binds: [B:55:0x00a0, B:57:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x00a8: PHI (r35v3 com.ss.android.ugc.aweme.poi.detail.container.model.StoreInfoModel) = 
          (r35v1 com.ss.android.ugc.aweme.poi.detail.container.model.StoreInfoModel)
          (r35v4 com.ss.android.ugc.aweme.poi.detail.container.model.StoreInfoModel)
         binds: [B:55:0x00a0, B:57:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x00a8: PHI (r36v3 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel) = 
          (r36v1 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel)
          (r36v4 com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel)
         binds: [B:55:0x00a0, B:57:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x00a8: PHI (r37v4 java.lang.String) = (r37v2 java.lang.String), (r37v5 java.lang.String) binds: [B:55:0x00a0, B:57:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x00a8: PHI (r38v5 java.lang.String) = (r38v3 java.lang.String), (r38v6 java.lang.String) binds: [B:55:0x00a0, B:57:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x00a8: PHI (r39v5 java.lang.String) = (r39v3 java.lang.String), (r39v6 java.lang.String) binds: [B:55:0x00a0, B:57:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x00a8: PHI (r40v6 java.lang.String) = (r40v4 java.lang.String), (r40v7 java.lang.String) binds: [B:55:0x00a0, B:57:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x00a8: PHI (r41v7 java.lang.String) = (r41v5 java.lang.String), (r41v8 java.lang.String) binds: [B:55:0x00a0, B:57:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x00a8: PHI (r42v7 java.lang.Boolean) = (r42v5 java.lang.Boolean), (r42v8 java.lang.Boolean) binds: [B:55:0x00a0, B:57:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x00a8: PHI (r43v8 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum) = 
          (r43v6 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
          (r43v9 com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum)
         binds: [B:55:0x00a0, B:57:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x00a8: PHI (r44v9 com.ss.android.ugc.aweme.base.model.UrlModel) = (r44v7 com.ss.android.ugc.aweme.base.model.UrlModel), (r44v10 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:55:0x00a0, B:57:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x00a8: PHI (r45v9 java.lang.String) = (r45v7 java.lang.String), (r45v10 java.lang.String) binds: [B:55:0x00a0, B:57:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x00a8: PHI (r46v10 java.lang.String) = (r46v8 java.lang.String), (r46v11 java.lang.String) binds: [B:55:0x00a0, B:57:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0012 A[PHI: r46
          0x0012: PHI (r46v27 java.lang.String) = (r46v0 java.lang.String), (r46v28 java.lang.String) binds: [B:7:0x0010, B:5:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse merge$poi_release(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r120) {
            /*
                Method dump skipped, instruction units count: 740
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse.merge$poi_release(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse):com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse");
        }

        public final void setDataFromAnchor(Boolean bool) {
            this.LLILLL = bool;
        }

        public final void setHeaderCoverImage(UrlModel urlModel) {
            this.headerCoverImage = urlModel;
        }

        public final void setPoiIntro(String str) {
            this.poiIntro = str;
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData
        public void setRdTTLSDataSource(String str) {
            super.setRdTTLSDataSource(str);
            this.LL = str;
        }

        public final void setRdTtlsDataSource(String str) {
            this.LL = str;
        }

        public PoiDetailResponse(String str, String str2, UrlModel urlModel, PictureAlbum pictureAlbum, Boolean bool, String str3, String str4, String str5, String str6, String str7, FatherPoiModel fatherPoiModel, StoreInfoModel storeInfoModel, List<PoiDetailTag> list, PoiHighlightTagModule poiHighlightTagModule, List<PoiDetailTag> list2, Map<String, PoiDetailTagStyle> map, OwnerInfoModel ownerInfoModel, PoiLocation poiLocation, DistanceInfo distanceInfo, PhoneInfo phoneInfo, Boolean bool2, DynamicMapParams dynamicMapParams, Boolean bool3, ReportInfo reportInfo, Boolean bool4, String str8, String str9, Boolean bool5, ShareInfo shareInfo, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, Long l, PoiBookingInfo poiBookingInfo, List<PoiShopBookingInfo> list3, Boolean bool6, Boolean bool7, String str10, Boolean bool8, List<PoiActivityApi.PoiBannerInfo> list4, UrlModel urlModel2, String str11, Boolean bool9, String str12, Integer num, ChartInfo chartInfo, IntentButtonConfig intentButtonConfig, CleanModeHeaderConfig cleanModeHeaderConfig, Boolean bool10, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, PoiStyleConfig poiStyleConfig, List<PoiHeadMergedTag> list5, PoiHeadAiSummary poiHeadAiSummary, Boolean bool11, List<PoiDetailTag> list6, String str23, PoiHeaderButtonGroup poiHeaderButtonGroup, Boolean bool12, Integer num2, Boolean bool13, PoiReviewEntrance poiReviewEntrance, PoiYearForDisplay poiYearForDisplay, String str24, Boolean bool14) {
            this.name = str;
            this.address = str2;
            this.cover = urlModel;
            this.pictureAlbum = pictureAlbum;
            this.isCollected = bool;
            this.collectInfo = str3;
            this.poiInfoSource = str4;
            this.cityCode = str5;
            this.regionCode = str6;
            this.typeLevel = str7;
            this.fatherPoi = fatherPoiModel;
            this.storeInfo = storeInfoModel;
            this.tags = list;
            this.poiHighlightTagModule = poiHighlightTagModule;
            this.poiTopTags = list2;
            this.poiDetailTagStyleMap = map;
            this.ownerInfo = ownerInfoModel;
            this.poiLocation = poiLocation;
            this.distanceInfo = distanceInfo;
            this.phoneInfo = phoneInfo;
            this.editPoiStatus = bool2;
            this.dynamicMapParams = dynamicMapParams;
            this.claimStoreStatus = bool3;
            this.reportInfo = reportInfo;
            this.isBaAccount = bool4;
            this.categoryName = str8;
            this.averagePrice = str9;
            this.followOwnerStatus = bool5;
            this.shareInfo = shareInfo;
            this.poiReviewSummaryModel = poiReviewSummaryModel;
            this.realFavoriteCnt = l;
            this.bookingInfo = poiBookingInfo;
            this.poiShopBookingInfoList = list3;
            this.haveRegionDiscovery = bool6;
            this.haveBackgroundTopMap = bool7;
            this.poiThirdPartyKeyInfo = str10;
            this.haveProductShelf = bool8;
            this.bannerListInfo = list4;
            this.headerCoverImage = urlModel2;
            this.poiIntro = str11;
            this.showHelpCenter = bool9;
            this.helpCenterUrl = str12;
            this.userLocation = num;
            this.chartTag = chartInfo;
            this.intentButtonConfig = intentButtonConfig;
            this.cleanModeHeaderConfig = cleanModeHeaderConfig;
            this.isSemiClosedLoopHotel = bool10;
            this.provinceCode = str13;
            this.ttTypeCode = str14;
            this.geoNameIds = str15;
            this.ttTypeNameSuper = str16;
            this.cityPoiName = str17;
            this.cityPoiId = str18;
            this.cityName = str19;
            this.ttTypeNameMedium = str20;
            this.countryCode = str21;
            this.ttTypeNameTiny = str22;
            this.poiStyleConfig = poiStyleConfig;
            this.mergedTagsList = list5;
            this.aiSummary = poiHeadAiSummary;
            this.isProductVisible = bool11;
            this.trustTags = list6;
            this.highLightCategoryName = str23;
            this.poiHeadButtonGroup = poiHeaderButtonGroup;
            this.showBottomBarWhenDisappear = bool12;
            this.poiDetailPageOpt = num2;
            this.noNeedEmptyFeed = bool13;
            this.poiReviewEntrance = poiReviewEntrance;
            this.yearForDisplay = poiYearForDisplay;
            this.LL = str24;
            this.LLILLJJLI = bool14;
        }
    }

    public static final class PoiMergedListResponse extends AbstractC1180940gpw implements InterfaceC2753014t, Serializable {
        public static final C1186730gzH Companion = new Object() { // from class: X.0gzH
        };

        @C09CT("aweme_cursor")
        public final Long awemeCursor;

        @C09CT("collect_info")
        public final String collectInfo;

        @C09CT("current_post_tab_code")
        public final String currentPostTabCode;

        @C09CT("has_more_aweme")
        public final Integer hasMoreAweme;

        @C09CT("has_more_review")
        public final Integer hasMoreReview;

        @C09CT("hide_poi_post_card_desc")
        public final boolean hidePoiPostCardDesc;

        @C09CT("log_id")
        public final String logId;

        @C09CT("item_list")
        public final List<PoiMergedListItem> mergedListItems;

        @C09CT("poi_post_tag_style")
        public final Integer poiPostTagStyle;

        @C09CT("post_bottom_bar_style")
        public final int postBottomBarStyle;

        @C09CT("post_tab_list")
        public final List<PostTab> postTabList;

        @C09CT("post_tag_list")
        public final List<PostTag> postTagList;

        @C09CT("review_cursor")
        public final Long reviewCursor;

        @C09CT("scroll_type")
        public final Integer scrollType;

        public PoiMergedListResponse() {
            this(null, null, null, null, null, null, null, null, null, null, null, 0, null, false);
        }

        public final PoiMergedListResponse copy(List<PoiMergedListItem> list, List<PostTag> list2, Integer num, Long l, Integer num2, Long l2, Integer num3, List<PostTab> list3, String str, String str2, String str3, int i, Integer num4, boolean z) {
            return new PoiMergedListResponse(list, list2, num, l, num2, l2, num3, list3, str, str2, str3, i, num4, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiMergedListResponse)) {
                return false;
            }
            PoiMergedListResponse poiMergedListResponse = (PoiMergedListResponse) obj;
            return Intrinsics.LJFF(this.mergedListItems, poiMergedListResponse.mergedListItems) && Intrinsics.LJFF(this.postTagList, poiMergedListResponse.postTagList) && Intrinsics.LJFF(this.poiPostTagStyle, poiMergedListResponse.poiPostTagStyle) && Intrinsics.LJFF(this.awemeCursor, poiMergedListResponse.awemeCursor) && Intrinsics.LJFF(this.hasMoreAweme, poiMergedListResponse.hasMoreAweme) && Intrinsics.LJFF(this.reviewCursor, poiMergedListResponse.reviewCursor) && Intrinsics.LJFF(this.hasMoreReview, poiMergedListResponse.hasMoreReview) && Intrinsics.LJFF(this.postTabList, poiMergedListResponse.postTabList) && Intrinsics.LJFF(this.currentPostTabCode, poiMergedListResponse.currentPostTabCode) && Intrinsics.LJFF(this.logId, poiMergedListResponse.logId) && Intrinsics.LJFF(this.collectInfo, poiMergedListResponse.collectInfo) && this.postBottomBarStyle == poiMergedListResponse.postBottomBarStyle && Intrinsics.LJFF(this.scrollType, poiMergedListResponse.scrollType) && this.hidePoiPostCardDesc == poiMergedListResponse.hidePoiPostCardDesc;
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
        public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
            return C1201190hMb.LIZ(this);
        }

        public String getSourceId() {
            return "PoiMergedListResponse";
        }

        public int hashCode() {
            List<PoiMergedListItem> list = this.mergedListItems;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<PostTag> list2 = this.postTagList;
            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            Integer num = this.poiPostTagStyle;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Long l = this.awemeCursor;
            int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
            Integer num2 = this.hasMoreAweme;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Long l2 = this.reviewCursor;
            int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
            Integer num3 = this.hasMoreReview;
            int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
            List<PostTab> list3 = this.postTabList;
            int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
            String str = this.currentPostTabCode;
            int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.logId;
            int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.collectInfo;
            int iHashCode11 = (((iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.postBottomBarStyle) * 31;
            Integer num4 = this.scrollType;
            return ((iHashCode11 + (num4 != null ? num4.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.hidePoiPostCardDesc);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            return "PoiMergedListResponse(mergedListItems=" + this.mergedListItems + ", postTagList=" + this.postTagList + ", poiPostTagStyle=" + this.poiPostTagStyle + ", awemeCursor=" + this.awemeCursor + ", hasMoreAweme=" + this.hasMoreAweme + ", reviewCursor=" + this.reviewCursor + ", hasMoreReview=" + this.hasMoreReview + ", postTabList=" + this.postTabList + ", currentPostTabCode=" + this.currentPostTabCode + ", logId=" + this.logId + ", collectInfo=" + this.collectInfo + ", postBottomBarStyle=" + this.postBottomBarStyle + ", scrollType=" + this.scrollType + ", hidePoiPostCardDesc=" + this.hidePoiPostCardDesc + ')';
        }

        public final boolean hasMergedList$poi_release() {
            List<PoiMergedListItem> list = this.mergedListItems;
            return list != null && list.size() > 0;
        }

        public final boolean hasMoreData$poi_release() {
            Integer num;
            Integer num2 = this.hasMoreReview;
            return (num2 != null && num2.intValue() == 1) || ((num = this.hasMoreAweme) != null && num.intValue() == 1);
        }

        public final boolean hasMultiTab$poi_release() {
            List<PostTab> list = this.postTabList;
            return list != null && list.size() > 0;
        }

        public final Long getAwemeCursor() {
            return this.awemeCursor;
        }

        public final String getCollectInfo() {
            return this.collectInfo;
        }

        public final String getCurrentPostTabCode() {
            return this.currentPostTabCode;
        }

        public final Integer getHasMoreAweme() {
            return this.hasMoreAweme;
        }

        public final Integer getHasMoreReview() {
            return this.hasMoreReview;
        }

        public final boolean getHidePoiPostCardDesc() {
            return this.hidePoiPostCardDesc;
        }

        public final String getLogId() {
            return this.logId;
        }

        public final List<PoiMergedListItem> getMergedListItems() {
            return this.mergedListItems;
        }

        public final Integer getPoiPostTagStyle() {
            return this.poiPostTagStyle;
        }

        public final int getPostBottomBarStyle() {
            return this.postBottomBarStyle;
        }

        public final List<PostTab> getPostTabList() {
            return this.postTabList;
        }

        public final List<PostTag> getPostTagList() {
            return this.postTagList;
        }

        public final Long getReviewCursor() {
            return this.reviewCursor;
        }

        public final Integer getScrollType() {
            return this.scrollType;
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData
        public boolean areContentsTheSame(BaseComponentData baseComponentData) {
            String aid;
            Aweme aweme;
            Aweme aweme2;
            if (!(baseComponentData instanceof PoiMergedListResponse)) {
                return false;
            }
            List<PoiMergedListItem> list = this.mergedListItems;
            List<PoiMergedListItem> list2 = ((PoiMergedListResponse) baseComponentData).mergedListItems;
            if (list == null) {
                if (list2 == null) {
                    return true;
                }
            } else {
                if (list2 == null || list.size() != list2.size()) {
                    return false;
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    PoiMergedListItem poiMergedListItem = (PoiMergedListItem) ListProtector.get(list, i);
                    PoiMergedListItem poiMergedListItem2 = (PoiMergedListItem) ListProtector.get(list2, i);
                    String aid2 = null;
                    if (poiMergedListItem != null && (aweme2 = poiMergedListItem.getAweme()) != null) {
                        aid = aweme2.getAid();
                    } else {
                        aid = null;
                    }
                    if (poiMergedListItem2 != null && (aweme = poiMergedListItem2.getAweme()) != null) {
                        aid2 = aweme.getAid();
                    }
                    if (!Intrinsics.LJFF(aid, aid2)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }

        public PoiMergedListResponse(List<PoiMergedListItem> list, List<PostTag> list2, Integer num, Long l, Integer num2, Long l2, Integer num3, List<PostTab> list3, String str, String str2, String str3, int i, Integer num4, boolean z) {
            this.mergedListItems = list;
            this.postTagList = list2;
            this.poiPostTagStyle = num;
            this.awemeCursor = l;
            this.hasMoreAweme = num2;
            this.reviewCursor = l2;
            this.hasMoreReview = num3;
            this.postTabList = list3;
            this.currentPostTabCode = str;
            this.logId = str2;
            this.collectInfo = str3;
            this.postBottomBarStyle = i;
            this.scrollType = num4;
            this.hidePoiPostCardDesc = z;
        }
    }

    public static final class PoiYMALModel implements InterfaceC1891350zJl {

        @C09CT("basic_info")
        public final PoiBasicInfo basicInfo;

        @C09CT("sub_tags")
        public final List<String> subTags;

        @C09CT("track_info")
        public final String trackInfo;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiYMALModel)) {
                return false;
            }
            PoiYMALModel poiYMALModel = (PoiYMALModel) obj;
            return Intrinsics.LJFF(this.basicInfo, poiYMALModel.basicInfo) && Intrinsics.LJFF(this.subTags, poiYMALModel.subTags) && Intrinsics.LJFF(this.trackInfo, poiYMALModel.trackInfo);
        }

        @Override // X.InterfaceC1891350zJl
        public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
            return null;
        }

        public final int hashCode() {
            PoiBasicInfo poiBasicInfo = this.basicInfo;
            int iHashCode = (poiBasicInfo == null ? 0 : poiBasicInfo.hashCode()) * 31;
            List<String> list = this.subTags;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.trackInfo;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiYMALModel(basicInfo=");
            sbLIZ.append(this.basicInfo);
            sbLIZ.append(", subTags=");
            sbLIZ.append(this.subTags);
            sbLIZ.append(", trackInfo=");
            sbLIZ.append(this.trackInfo);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final Boolean LIZ() {
            Boolean boolValueOf = null;
            if (this.trackInfo == null) {
                return null;
            }
            try {
                boolValueOf = Boolean.valueOf(new JSONObject(this.trackInfo).optBoolean("is_claimed"));
                return boolValueOf;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return boolValueOf;
            }
        }

        @Override // X.InterfaceC1891350zJl
        public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }

        @Override // X.InterfaceC1891350zJl
        public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            String str;
            PoiYMALModel poiYMALModel;
            PoiBasicInfo poiBasicInfo;
            PoiBasicInfo poiBasicInfo2 = this.basicInfo;
            String str2 = null;
            if (poiBasicInfo2 != null) {
                str = poiBasicInfo2.id;
            } else {
                str = null;
            }
            if ((interfaceC1891350zJl instanceof PoiYMALModel) && (poiYMALModel = (PoiYMALModel) interfaceC1891350zJl) != null && (poiBasicInfo = poiYMALModel.basicInfo) != null) {
                str2 = poiBasicInfo.id;
            }
            return Intrinsics.LJFF(str, str2);
        }

        public PoiYMALModel(PoiBasicInfo poiBasicInfo, List<String> list, String str) {
            this.basicInfo = poiBasicInfo;
            this.subTags = list;
            this.trackInfo = str;
        }
    }

    public static final class PoiYMALResponse extends BaseComponentData implements Serializable {

        @C09CT("pois")
        public final List<PoiYMALModel> ymalModels;

        public final PoiYMALResponse copy(List<PoiYMALModel> list) {
            return new PoiYMALResponse(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiYMALResponse) && Intrinsics.LJFF(this.ymalModels, ((PoiYMALResponse) obj).ymalModels);
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
        public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
            return C1201190hMb.LIZ(this);
        }

        public int hashCode() {
            List<PoiYMALModel> list = this.ymalModels;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiYMALResponse(ymalModels=");
            sbLIZ.append(this.ymalModels);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final boolean hasYmalContent() {
            List<PoiYMALModel> list = this.ymalModels;
            return list != null && list.size() > 0;
        }

        public final List<PoiYMALModel> getYmalModels() {
            return this.ymalModels;
        }

        public PoiYMALResponse(List<PoiYMALModel> list) {
            this.ymalModels = list;
        }
    }

    @InterfaceC1501200pAU("/tiktok/poi/get/v1")
    C11NZ<PoiDetailResponse> LIZ(@InterfaceC1501120pAM("poi_id") String str);

    @InterfaceC1501240pAY("/tiktok/poi/collect/v1")
    @InterfaceC1485505rh
    C11NZ<BaseResponse> collectPoi(@InterfaceC1501050pAF("poi_id") String str, @InterfaceC1501050pAF("action") int i);

    public static final class PoiMergedListItem implements Serializable {
        public static final C1183780guW Companion = new Object() { // from class: X.0guW
        };

        @C09CT("aweme")
        public final Aweme aweme;

        @C09CT("aweme_cover")
        public final UrlModel awemeCover;

        @C09CT("aweme_topic_tag")
        public final String awemeTopicTag;

        @C09CT("aweme_topic_tag_en")
        public final String awemeTopicTagEn;

        @C09CT("banners")
        public final List<PoiActivityApi.PoiBannerInfo> banners;

        @C09CT("crop_aweme_cover")
        public final UrlModel cropAwemeCover;

        @C09CT("item_type")
        public final Integer itemType;

        @C09CT("media_type")
        public final Integer mediaType;

        @C09CT("review")
        public final PoiReviewCardModel review;

        public PoiMergedListItem() {
            this(null, null, null, null, null, null, null, null, null);
        }

        public final PoiMergedListItem copy(Integer num, Aweme aweme, PoiReviewCardModel poiReviewCardModel, List<PoiActivityApi.PoiBannerInfo> list, UrlModel urlModel, String str, Integer num2, UrlModel urlModel2, String str2) {
            return new PoiMergedListItem(num, aweme, poiReviewCardModel, list, urlModel, str, num2, urlModel2, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiMergedListItem)) {
                return false;
            }
            PoiMergedListItem poiMergedListItem = (PoiMergedListItem) obj;
            return Intrinsics.LJFF(this.itemType, poiMergedListItem.itemType) && Intrinsics.LJFF(this.aweme, poiMergedListItem.aweme) && Intrinsics.LJFF(this.review, poiMergedListItem.review) && Intrinsics.LJFF(this.banners, poiMergedListItem.banners) && Intrinsics.LJFF(this.awemeCover, poiMergedListItem.awemeCover) && Intrinsics.LJFF(this.awemeTopicTag, poiMergedListItem.awemeTopicTag) && Intrinsics.LJFF(this.mediaType, poiMergedListItem.mediaType) && Intrinsics.LJFF(this.cropAwemeCover, poiMergedListItem.cropAwemeCover) && Intrinsics.LJFF(this.awemeTopicTagEn, poiMergedListItem.awemeTopicTagEn);
        }

        public int hashCode() {
            Integer num = this.itemType;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Aweme aweme = this.aweme;
            int iHashCode2 = (iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
            PoiReviewCardModel poiReviewCardModel = this.review;
            int iHashCode3 = (iHashCode2 + (poiReviewCardModel == null ? 0 : poiReviewCardModel.hashCode())) * 31;
            List<PoiActivityApi.PoiBannerInfo> list = this.banners;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            UrlModel urlModel = this.awemeCover;
            int iHashCode5 = (iHashCode4 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
            String str = this.awemeTopicTag;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num2 = this.mediaType;
            int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            UrlModel urlModel2 = this.cropAwemeCover;
            int iHashCode8 = (iHashCode7 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
            String str2 = this.awemeTopicTagEn;
            return iHashCode8 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiMergedListItem(itemType=");
            sbLIZ.append(this.itemType);
            sbLIZ.append(", aweme=");
            sbLIZ.append(this.aweme);
            sbLIZ.append(", review=");
            sbLIZ.append(this.review);
            sbLIZ.append(", banners=");
            sbLIZ.append(this.banners);
            sbLIZ.append(", awemeCover=");
            sbLIZ.append(this.awemeCover);
            sbLIZ.append(", awemeTopicTag=");
            sbLIZ.append(this.awemeTopicTag);
            sbLIZ.append(", mediaType=");
            sbLIZ.append(this.mediaType);
            sbLIZ.append(", cropAwemeCover=");
            sbLIZ.append(this.cropAwemeCover);
            sbLIZ.append(", awemeTopicTagEn=");
            sbLIZ.append(this.awemeTopicTagEn);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final Aweme getAweme() {
            return this.aweme;
        }

        public final UrlModel getAwemeCover() {
            return this.awemeCover;
        }

        public final String getAwemeTopicTag() {
            return this.awemeTopicTag;
        }

        public final String getAwemeTopicTagEn() {
            return this.awemeTopicTagEn;
        }

        public final List<PoiActivityApi.PoiBannerInfo> getBanners() {
            return this.banners;
        }

        public final UrlModel getCropAwemeCover() {
            return this.cropAwemeCover;
        }

        public final Integer getItemType() {
            return this.itemType;
        }

        public final Integer getMediaType() {
            return this.mediaType;
        }

        public final PoiReviewCardModel getReview() {
            return this.review;
        }

        public PoiMergedListItem(Integer num, Aweme aweme, PoiReviewCardModel poiReviewCardModel, List<PoiActivityApi.PoiBannerInfo> list, UrlModel urlModel, String str, Integer num2, UrlModel urlModel2, String str2) {
            this.itemType = num;
            this.aweme = aweme;
            this.review = poiReviewCardModel;
            this.banners = list;
            this.awemeCover = urlModel;
            this.awemeTopicTag = str;
            this.mediaType = num2;
            this.cropAwemeCover = urlModel2;
            this.awemeTopicTagEn = str2;
        }
    }

    public static final class PostTag implements Serializable {

        @C09CT("is_selected")
        public final Boolean isSelected;

        @C09CT("tag_code")
        public final String tagCode;

        @C09CT("tag_icon")
        public final DynamicIcon tagIcon;

        @C09CT("tag_icon_url_list")
        public final List<PoiUrlStruct> tagIconUrlList;

        @C09CT("tag_name")
        public final String tagName;

        @C09CT("tag_video_count")
        public final Long tagVideoCount;

        public PostTag() {
            this(null, null, null, null, null, null);
        }

        public final PostTag copy(String str, String str2, List<PoiUrlStruct> list, Boolean bool, DynamicIcon dynamicIcon, Long l) {
            return new PostTag(str, str2, list, bool, dynamicIcon, l);
        }

        public int hashCode() {
            String str = this.tagCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.tagName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<PoiUrlStruct> list = this.tagIconUrlList;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.isSelected;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            DynamicIcon dynamicIcon = this.tagIcon;
            int iHashCode5 = (iHashCode4 + (dynamicIcon == null ? 0 : dynamicIcon.hashCode())) * 31;
            Long l = this.tagVideoCount;
            return iHashCode5 + (l != null ? l.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PostTag(tagCode=");
            sbLIZ.append(this.tagCode);
            sbLIZ.append(", tagName=");
            sbLIZ.append(this.tagName);
            sbLIZ.append(", tagIconUrlList=");
            sbLIZ.append(this.tagIconUrlList);
            sbLIZ.append(", isSelected=");
            sbLIZ.append(this.isSelected);
            sbLIZ.append(", tagIcon=");
            sbLIZ.append(this.tagIcon);
            sbLIZ.append(", tagVideoCount=");
            sbLIZ.append(this.tagVideoCount);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final Boolean isSelected() {
            return this.isSelected;
        }

        public PostTag(String str, String str2, List<PoiUrlStruct> list, Boolean bool, DynamicIcon dynamicIcon, Long l) {
            this.tagCode = str;
            this.tagName = str2;
            this.tagIconUrlList = list;
            this.isSelected = bool;
            this.tagIcon = dynamicIcon;
            this.tagVideoCount = l;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class PoiUrlStruct implements Serializable {

        @C09CT("uri")
        public final String uri;

        @C09CT("url_list")
        public final List<String> urlList;

        public PoiUrlStruct() {
            this(null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiUrlStruct)) {
                return false;
            }
            PoiUrlStruct poiUrlStruct = (PoiUrlStruct) obj;
            return Intrinsics.LJFF(this.uri, poiUrlStruct.uri) && Intrinsics.LJFF(this.urlList, poiUrlStruct.urlList);
        }

        public int hashCode() {
            String str = this.uri;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.urlList;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiUrlStruct(uri=");
            sbLIZ.append(this.uri);
            sbLIZ.append(", urlList=");
            sbLIZ.append(this.urlList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiUrlStruct(String str, List<String> list) {
            this.uri = str;
            this.urlList = list;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class PoiYearForDisplay implements Serializable {

        @C09CT("display_text")
        public final String displayText;

        @C09CT("year_type")
        public final Integer yearType;

        public PoiYearForDisplay() {
            this(null, null);
        }

        public int hashCode() {
            String str = this.displayText;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.yearType;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiYearForDisplay(displayText=");
            sbLIZ.append(this.displayText);
            sbLIZ.append(", yearType=");
            sbLIZ.append(this.yearType);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiYearForDisplay(String str, Integer num) {
            this.displayText = str;
            this.yearType = num;
        }
    }

    public static final class PostTab implements Serializable {

        @C09CT("tab_code")
        public final String tabCode;

        @C09CT("tab_name")
        public final String tabName;

        public PostTab() {
            this(null, null);
        }

        public final PostTab copy(String str, String str2) {
            return new PostTab(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PostTab)) {
                return false;
            }
            PostTab postTab = (PostTab) obj;
            return Intrinsics.LJFF(this.tabCode, postTab.tabCode) && Intrinsics.LJFF(this.tabName, postTab.tabName);
        }

        public int hashCode() {
            String str = this.tabCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.tabName;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PostTab(tabCode=");
            sbLIZ.append(this.tabCode);
            sbLIZ.append(", tabName=");
            sbLIZ.append(this.tabName);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PostTab(String str, String str2) {
            this.tabCode = str;
            this.tabName = str2;
        }
    }

    public static final class PoiReviewEntrance implements Serializable {

        @C09CT("eligible")
        public final Boolean eligible;

        @C09CT("eligible_extra_info_str")
        public final String eligibleExtraInfo;

        @C09CT("post_frequency_control")
        public final Boolean postFrequencyControl;

        public PoiReviewEntrance() {
            this(null, null, null);
        }

        public int hashCode() {
            Boolean bool = this.eligible;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.eligibleExtraInfo;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool2 = this.postFrequencyControl;
            return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiReviewEntrance(eligible=");
            sbLIZ.append(this.eligible);
            sbLIZ.append(", eligibleExtraInfo=");
            sbLIZ.append(this.eligibleExtraInfo);
            sbLIZ.append(", postFrequencyControl=");
            sbLIZ.append(this.postFrequencyControl);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiReviewEntrance(Boolean bool, String str, Boolean bool2) {
            this.eligible = bool;
            this.eligibleExtraInfo = str;
            this.postFrequencyControl = bool2;
        }
    }

    public static final class PoiReviewCardModel implements Serializable {

        @C09CT("author")
        public final PoiReviewsApi.PoiReviewUserModel author;

        @C09CT("brand_logo")
        public final UrlStruct brandLogo;

        @C09CT("brand_display_text")
        public final String brandName;

        @C09CT("dark_mode_brand_logo")
        public final UrlStruct darkModeBrandLogo;

        @C09CT("image")
        public final UrlModel image;

        @C09CT("image_count")
        public final Integer imageCount;

        @C09CT("poi_id")
        public final String poiId;

        @C09CT("rating")
        public final Double rating;

        @C09CT("display_rating")
        public final String ratingStr;

        @C09CT("review_id")
        public final String reviewId;

        @C09CT("review_source")
        public final Integer source;

        @C09CT("statistics")
        public final PoiReviewsApi.PoiReviewStatisticsModel statistics;

        @C09CT("text")
        public final String text;

        @C09CT("text_lang")
        public final String textLang;

        @C09CT("translated_text")
        public final String translatedContent;

        public PoiReviewCardModel() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }

        public PoiReviewCardModel(String str, String str2, UrlModel urlModel, Integer num, PoiReviewsApi.PoiReviewUserModel poiReviewUserModel, Double d, String str3, String str4, String str5, String str6, String str7, UrlStruct urlStruct, UrlStruct urlStruct2, PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel, Integer num2) {
            this.poiId = str;
            this.reviewId = str2;
            this.image = urlModel;
            this.imageCount = num;
            this.author = poiReviewUserModel;
            this.rating = d;
            this.ratingStr = str3;
            this.text = str4;
            this.textLang = str5;
            this.translatedContent = str6;
            this.brandName = str7;
            this.brandLogo = urlStruct;
            this.darkModeBrandLogo = urlStruct2;
            this.statistics = poiReviewStatisticsModel;
            this.source = num2;
        }
    }
}
