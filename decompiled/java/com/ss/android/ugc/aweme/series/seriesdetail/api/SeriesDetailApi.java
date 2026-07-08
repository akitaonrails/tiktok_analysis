package com.ss.android.ugc.aweme.series.seriesdetail.api;

import X.AbstractC19484711Kz;
import X.C080U;
import X.C09CT;
import X.C11NZ;
import X.C1612110s3N;
import X.C1612130s3P;
import X.C1612440s3u;
import X.C1615010s83;
import X.C178100mJ;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C309390CAv;
import X.InterfaceC1485405rg;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.PaidCollectionPanelResponse;
import com.ss.android.ugc.aweme.model.PaidCollectionRecommendResponse;
import com.ss.android.ugc.aweme.model.PaidContentVideoListResponse;
import com.ss.android.ugc.aweme.model.PineDramaMidInsertRequest;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesDetailApi {
    public static GetPaidCollectionDetailApi LIZ;
    public static PostPaidContentVideoProgressApi LIZIZ;

    public interface GetPaidCollectionDetailApi {
        @InterfaceC1501200pAU("/tiktok/v1/paid_content/collection/detail")
        C11NZ<PaidCollectionDetailResponse> getPaidCollectionDetail(@InterfaceC1501070pAH("collection_id") long j, @InterfaceC1501070pAH("source") int i, @InterfaceC1501070pAH("has_pagination") boolean z, @InterfaceC1501070pAH("paid_content_order_id") String str);

        @InterfaceC1501200pAU("{path}")
        C11NZ<PaidCollectionPanelResponse> getPaidCollectionPanel(@InterfaceC1501060pAG(encode = false, value = "path") String str, @InterfaceC1501070pAH("collection_id") long j);

        @InterfaceC1501200pAU("{path}")
        C11NZ<PaidCollectionRecommendResponse> getPaidCollectionRecommend(@InterfaceC1501060pAG(encode = false, value = "path") String str, @InterfaceC1501070pAH("collection_id") long j);

        @InterfaceC1501200pAU("/tiktok/v1/paid_content/collection/video")
        C11NZ<PaidContentVideoListResponse> getPaidCollectionVideoList(@InterfaceC1501070pAH("collection_id") long j, @InterfaceC1501070pAH("requested_page") int i, @InterfaceC1501070pAH("video_list_type") int i2, @InterfaceC1501070pAH("page_size") int i3, @InterfaceC1501070pAH("is_trailer_paginated") boolean z, @InterfaceC1501070pAH("need_collection_detail") Boolean bool);

        @InterfaceC1501200pAU("/tiktok/v1/paid_content/collection/video")
        AbstractC19484711Kz<PaidContentVideoListResponse> getPaidCollectionVideoListByVideoId(@InterfaceC1501070pAH("collection_id") long j, @InterfaceC1501070pAH("video_list_type") int i, @InterfaceC1501070pAH("page_size") int i2, @InterfaceC1501070pAH("video_id") Long l, @InterfaceC1501070pAH("need_collection_detail") boolean z);

        @InterfaceC1501200pAU("/tiktok/v3/paid_content/collection/video")
        AbstractC19484711Kz<C1615010s83> getPaidCollectionVideoListV3(@InterfaceC1501130pAN Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

        @InterfaceC1501240pAY("/tiktok/v3/paid_content/collection/video")
        AbstractC19484711Kz<C1615010s83> postPaidCollectionVideoListV3(@InterfaceC1485405rg InnerFeedRequest innerFeedRequest, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

        public static final class InnerFeedRequest {

            @C09CT("collection_id")
            public final Long collectionId;

            @C09CT("count")
            public final Integer count;

            @C09CT("current_seq_id")
            public final Long curSeqId;

            @C09CT("current_session_ad_items")
            public final String curSessionAds;

            @C09CT("current_session_block_ad_items")
            public final String currentSessionBlockAds;

            @C09CT("direction")
            public final Integer direction;

            @C09CT("drama_request_type")
            public final String dramaRequestType;

            @C09CT("enter_from")
            public final String enterFrom;

            @C09CT("is_trailer_paginated")
            public final Boolean isTrailerPaginated;

            @C09CT("last_feed_ad_items")
            public final String lastFeedAdItems;

            @C09CT("last_feed_items")
            public final String lastFeedItems;

            @C09CT("need_collection_detail")
            public final Boolean needCollectionDetail;

            @C09CT("pine_drama_mid_insert_request_info")
            public final PineDramaMidInsertRequest pineDramaMidInsertRequest;

            @C09CT("query_type")
            public final String queryType;

            @C09CT("query_scene")
            public final String requestScene;

            @C09CT("request_source")
            public final String requestSource;

            @C09CT("root_scene")
            public final Integer rootScene;

            @C09CT("series_enter_entrance")
            public final String seriesEnterEntrance;

            @C09CT("video_id")
            public final Long videoId;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InnerFeedRequest)) {
                    return false;
                }
                InnerFeedRequest innerFeedRequest = (InnerFeedRequest) obj;
                return Intrinsics.LJFF(this.collectionId, innerFeedRequest.collectionId) && Intrinsics.LJFF(this.curSeqId, innerFeedRequest.curSeqId) && Intrinsics.LJFF(this.videoId, innerFeedRequest.videoId) && Intrinsics.LJFF(this.queryType, innerFeedRequest.queryType) && Intrinsics.LJFF(this.direction, innerFeedRequest.direction) && Intrinsics.LJFF(this.count, innerFeedRequest.count) && Intrinsics.LJFF(this.isTrailerPaginated, innerFeedRequest.isTrailerPaginated) && Intrinsics.LJFF(this.requestScene, innerFeedRequest.requestScene) && Intrinsics.LJFF(this.needCollectionDetail, innerFeedRequest.needCollectionDetail) && Intrinsics.LJFF(this.rootScene, innerFeedRequest.rootScene) && Intrinsics.LJFF(this.enterFrom, innerFeedRequest.enterFrom) && Intrinsics.LJFF(this.requestSource, innerFeedRequest.requestSource) && Intrinsics.LJFF(this.lastFeedItems, innerFeedRequest.lastFeedItems) && Intrinsics.LJFF(this.lastFeedAdItems, innerFeedRequest.lastFeedAdItems) && Intrinsics.LJFF(this.curSessionAds, innerFeedRequest.curSessionAds) && Intrinsics.LJFF(this.currentSessionBlockAds, innerFeedRequest.currentSessionBlockAds) && Intrinsics.LJFF(this.seriesEnterEntrance, innerFeedRequest.seriesEnterEntrance) && Intrinsics.LJFF(this.dramaRequestType, innerFeedRequest.dramaRequestType) && Intrinsics.LJFF(this.pineDramaMidInsertRequest, innerFeedRequest.pineDramaMidInsertRequest);
            }

            public final int hashCode() {
                Long l = this.collectionId;
                int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
                Long l2 = this.curSeqId;
                int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
                Long l3 = this.videoId;
                int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
                String str = this.queryType;
                int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
                Integer num = this.direction;
                int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.count;
                int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.isTrailerPaginated;
                int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str2 = this.requestScene;
                int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool2 = this.needCollectionDetail;
                int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num3 = this.rootScene;
                int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
                String str3 = this.enterFrom;
                int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.requestSource;
                int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.lastFeedItems;
                int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.lastFeedAdItems;
                int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.curSessionAds;
                int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.currentSessionBlockAds;
                int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.seriesEnterEntrance;
                int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.dramaRequestType;
                int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
                PineDramaMidInsertRequest pineDramaMidInsertRequest = this.pineDramaMidInsertRequest;
                return iHashCode18 + (pineDramaMidInsertRequest != null ? pineDramaMidInsertRequest.hashCode() : 0);
            }

            public final String toString() {
                return "InnerFeedRequest(collectionId=" + this.collectionId + ", curSeqId=" + this.curSeqId + ", videoId=" + this.videoId + ", queryType=" + this.queryType + ", direction=" + this.direction + ", count=" + this.count + ", isTrailerPaginated=" + this.isTrailerPaginated + ", requestScene=" + this.requestScene + ", needCollectionDetail=" + this.needCollectionDetail + ", rootScene=" + this.rootScene + ", enterFrom=" + this.enterFrom + ", requestSource=" + this.requestSource + ", lastFeedItems=" + this.lastFeedItems + ", lastFeedAdItems=" + this.lastFeedAdItems + ", curSessionAds=" + this.curSessionAds + ", currentSessionBlockAds=" + this.currentSessionBlockAds + ", seriesEnterEntrance=" + this.seriesEnterEntrance + ", dramaRequestType=" + this.dramaRequestType + ", pineDramaMidInsertRequest=" + this.pineDramaMidInsertRequest + ')';
            }

            public final Map<String, String> LIZ() {
                try {
                    Map<String, Object> mapLIZIZ = C178100mJ.LIZIZ(C309390CAv.LIZIZ(this));
                    if (mapLIZIZ == null) {
                        mapLIZIZ = C2097608Jq.LJ();
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry : mapLIZIZ.entrySet()) {
                        Object value = entry.getValue();
                        if ((value == null || Intrinsics.LJFF(value.toString(), "null")) ? false : true) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
                    for (Object obj : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(((Map.Entry) obj).getKey(), String.valueOf(((Map.Entry) obj).getValue()));
                    }
                    return linkedHashMap2;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return C2097608Jq.LJ();
                }
            }

            public InnerFeedRequest(Long l, Long l2, Long l3, String str, Integer num, Integer num2, Boolean bool, String str2, Boolean bool2, Integer num3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, PineDramaMidInsertRequest pineDramaMidInsertRequest) {
                this.collectionId = l;
                this.curSeqId = l2;
                this.videoId = l3;
                this.queryType = str;
                this.direction = num;
                this.count = num2;
                this.isTrailerPaginated = bool;
                this.requestScene = str2;
                this.needCollectionDetail = bool2;
                this.rootScene = num3;
                this.enterFrom = str3;
                this.requestSource = str4;
                this.lastFeedItems = str5;
                this.lastFeedAdItems = str6;
                this.curSessionAds = str7;
                this.currentSessionBlockAds = str8;
                this.seriesEnterEntrance = str9;
                this.dramaRequestType = str10;
                this.pineDramaMidInsertRequest = pineDramaMidInsertRequest;
            }
        }
    }

    public interface PostPaidContentVideoProgressApi {
        @InterfaceC1501240pAY("{path}")
        C11NZ<BaseResponse> postPaidContentVideoProgress(@InterfaceC1501060pAG(encode = false, value = "path") String str, @InterfaceC1501070pAH("paid_video_id") long j, @InterfaceC1501070pAH("user_id") long j2, @InterfaceC1501070pAH("start_timestamp") int i, @InterfaceC1501070pAH("end_timestamp") int i2, @InterfaceC1501070pAH("trigger") int i3, @InterfaceC1501070pAH("play_scene") int i4, @InterfaceC1501070pAH("is_inner_feed_more_recommendation") boolean z);
    }

    static {
        new C1612110s3N();
    }

    public interface AppDiffProtocol {
        public static final C1612440s3u LIZ = C1612440s3u.LIZ;

        C11NZ LIZ(C1612130s3P c1612130s3P);

        public static final class DowngradeInstance implements AppDiffProtocol {
            @Override // com.ss.android.ugc.aweme.series.seriesdetail.api.SeriesDetailApi.AppDiffProtocol
            public final C11NZ LIZ(C1612130s3P c1612130s3P) {
                return c1612130s3P.invoke();
            }
        }
    }
}
