package com.ss.android.ugc.aweme.poi.reviews;

import X.C080U;
import X.C09CT;
import X.C1172760gck;
import X.C1180030goT;
import X.C1190060h4e;
import X.C1190190h4r;
import X.C1190820h5s;
import X.C11NZ;
import X.C1201190hMb;
import X.C14NM;
import X.C15438062q;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1156320gCE;
import X.EnumC1189990h4X;
import X.EnumC1191110h6L;
import X.InterfaceC1196330hEl;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485705rj;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501300pAe;
import X.InterfaceC1891350zJl;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import X.InterfaceC2753014t;
import com.bytedance.im.core.proto.UrlStruct;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.uiwidget.richtext.LsRichText;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public interface PoiReviewsApi {
    public static final C1172760gck LIZ = C1172760gck.LIZ;

    public static final class PoiReviewListResponse extends BaseComponentData implements Serializable, InterfaceC2753014t, InterfaceC1196330hEl {
        public final String LL;
        public String LLILLJJLI;

        @C09CT("avatar_168x168")
        public final UrlStruct avatar168;

        @C09CT("avatar_300x300")
        public final UrlStruct avatar300;

        @C09CT("latest_aweme")
        public final Aweme aweme;

        @C09CT("collect_info")
        public final String collectInfo;

        @C09CT("cursor")
        public final Long cursor;

        @C09CT("display_info")
        public final String displayInfo;

        @C09CT("eligible_to_post")
        public final Boolean eligible;

        @C09CT("eligible_extra_info_str")
        public final String eligibleExtraInfo;

        @C09CT("post_review_description")
        public final String entranceDescription;

        @C09CT("post_review_sub_description")
        public final String entranceSubDescription;

        @C09CT("folded_cursor")
        public final Long foldedCursor;

        @C09CT("folded_has_more")
        public final Boolean foldedHasMore;

        @C09CT("has_more")
        public final Boolean hasMore;

        @C09CT("has_video_posted")
        public final Boolean hasVideoPosted;

        @C09CT("landing_tab")
        public final int landingTab;

        @C09CT("avatar_larger")
        public final UrlStruct largerAvatar;

        @C09CT("avatar_medium")
        public final UrlStruct mediumAvatar;

        @C09CT("third_party_review_summary")
        public final List<PoiReviewSummaryModel> poiDetailThirdPartySummary;

        @C09CT("poi_name")
        public final String poiName;

        @C09CT("nps_info")
        public final PoiNpsInfo poiNpsInfo;

        @C09CT("review_summary")
        public final PoiReviewSummaryModel reviewSummary;

        @C09CT("review_tab_infos")
        public final List<PoiReviewsTabInfoModel> reviewTabInfos;

        @C09CT("review_tags")
        public final List<PoiReviewTagModel> reviewTags;

        @C09CT("reviews")
        public final List<PoiReviewModel> reviews;

        @C09CT("statistic_info")
        public final String statisticInfo;

        @C09CT("third_party_cursor")
        public final Long thirdPartyCursor;

        @C09CT("third_party_has_more")
        public final Boolean thirdPartyHasMore;

        @C09CT("third_party_review_disclaimers")
        public final List<PoiReviewDisclaimer> thirdPartyReviewDisclaimers;

        @C09CT("third_party_reviews")
        public final List<PoiReviewModel> thirdPartyReviews;

        @C09CT("third_party_summary")
        public final List<PoiReviewSummaryModel> thirdPartySummary;

        @C09CT("avatar_thumb")
        public final UrlStruct thumbAvatar;

        public PoiReviewListResponse() {
            this(null, null, null, null, null, null, null, 0L, 0L, Boolean.FALSE, Boolean.FALSE, 0L, Boolean.FALSE, null, null, null, null, null, null, null, 1, null, null, null, null, null, null, null, null, null, null, "PoiReviewListResponse");
        }

        public final PoiReviewListResponse copy(List<PoiReviewModel> list, List<PoiReviewModel> list2, List<PoiReviewTagModel> list3, PoiReviewSummaryModel poiReviewSummaryModel, List<PoiReviewSummaryModel> list4, List<PoiReviewSummaryModel> list5, List<PoiReviewDisclaimer> list6, Long l, Long l2, Boolean bool, Boolean bool2, Long l3, Boolean bool3, String str, Boolean bool4, String str2, Aweme aweme, String str3, String str4, String str5, int i, UrlStruct urlStruct, UrlStruct urlStruct2, UrlStruct urlStruct3, UrlStruct urlStruct4, UrlStruct urlStruct5, Boolean bool5, String str6, String str7, PoiNpsInfo poiNpsInfo, List<PoiReviewsTabInfoModel> list7, String str8) {
            return new PoiReviewListResponse(list, list2, list3, poiReviewSummaryModel, list4, list5, list6, l, l2, bool, bool2, l3, bool3, str, bool4, str2, aweme, str3, str4, str5, i, urlStruct, urlStruct2, urlStruct3, urlStruct4, urlStruct5, bool5, str6, str7, poiNpsInfo, list7, str8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewListResponse)) {
                return false;
            }
            PoiReviewListResponse poiReviewListResponse = (PoiReviewListResponse) obj;
            return Intrinsics.LJFF(this.reviews, poiReviewListResponse.reviews) && Intrinsics.LJFF(this.thirdPartyReviews, poiReviewListResponse.thirdPartyReviews) && Intrinsics.LJFF(this.reviewTags, poiReviewListResponse.reviewTags) && Intrinsics.LJFF(this.reviewSummary, poiReviewListResponse.reviewSummary) && Intrinsics.LJFF(this.thirdPartySummary, poiReviewListResponse.thirdPartySummary) && Intrinsics.LJFF(this.poiDetailThirdPartySummary, poiReviewListResponse.poiDetailThirdPartySummary) && Intrinsics.LJFF(this.thirdPartyReviewDisclaimers, poiReviewListResponse.thirdPartyReviewDisclaimers) && Intrinsics.LJFF(this.cursor, poiReviewListResponse.cursor) && Intrinsics.LJFF(this.thirdPartyCursor, poiReviewListResponse.thirdPartyCursor) && Intrinsics.LJFF(this.hasMore, poiReviewListResponse.hasMore) && Intrinsics.LJFF(this.thirdPartyHasMore, poiReviewListResponse.thirdPartyHasMore) && Intrinsics.LJFF(this.foldedCursor, poiReviewListResponse.foldedCursor) && Intrinsics.LJFF(this.foldedHasMore, poiReviewListResponse.foldedHasMore) && Intrinsics.LJFF(this.collectInfo, poiReviewListResponse.collectInfo) && Intrinsics.LJFF(this.eligible, poiReviewListResponse.eligible) && Intrinsics.LJFF(this.eligibleExtraInfo, poiReviewListResponse.eligibleExtraInfo) && Intrinsics.LJFF(this.aweme, poiReviewListResponse.aweme) && Intrinsics.LJFF(this.poiName, poiReviewListResponse.poiName) && Intrinsics.LJFF(this.entranceDescription, poiReviewListResponse.entranceDescription) && Intrinsics.LJFF(this.entranceSubDescription, poiReviewListResponse.entranceSubDescription) && this.landingTab == poiReviewListResponse.landingTab && Intrinsics.LJFF(this.largerAvatar, poiReviewListResponse.largerAvatar) && Intrinsics.LJFF(this.mediumAvatar, poiReviewListResponse.mediumAvatar) && Intrinsics.LJFF(this.thumbAvatar, poiReviewListResponse.thumbAvatar) && Intrinsics.LJFF(this.avatar168, poiReviewListResponse.avatar168) && Intrinsics.LJFF(this.avatar300, poiReviewListResponse.avatar300) && Intrinsics.LJFF(this.hasVideoPosted, poiReviewListResponse.hasVideoPosted) && Intrinsics.LJFF(this.statisticInfo, poiReviewListResponse.statisticInfo) && Intrinsics.LJFF(this.displayInfo, poiReviewListResponse.displayInfo) && Intrinsics.LJFF(this.poiNpsInfo, poiReviewListResponse.poiNpsInfo) && Intrinsics.LJFF(this.reviewTabInfos, poiReviewListResponse.reviewTabInfos) && Intrinsics.LJFF(this.LL, poiReviewListResponse.LL);
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
        public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
            return C1201190hMb.LIZ(this);
        }

        public int hashCode() {
            List<PoiReviewModel> list = this.reviews;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<PoiReviewModel> list2 = this.thirdPartyReviews;
            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<PoiReviewTagModel> list3 = this.reviewTags;
            int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
            PoiReviewSummaryModel poiReviewSummaryModel = this.reviewSummary;
            int iHashCode4 = (iHashCode3 + (poiReviewSummaryModel == null ? 0 : poiReviewSummaryModel.hashCode())) * 31;
            List<PoiReviewSummaryModel> list4 = this.thirdPartySummary;
            int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List<PoiReviewSummaryModel> list5 = this.poiDetailThirdPartySummary;
            int iHashCode6 = (iHashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
            List<PoiReviewDisclaimer> list6 = this.thirdPartyReviewDisclaimers;
            int iHashCode7 = (iHashCode6 + (list6 == null ? 0 : list6.hashCode())) * 31;
            Long l = this.cursor;
            int iHashCode8 = (iHashCode7 + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.thirdPartyCursor;
            int iHashCode9 = (iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
            Boolean bool = this.hasMore;
            int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.thirdPartyHasMore;
            int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Long l3 = this.foldedCursor;
            int iHashCode12 = (iHashCode11 + (l3 == null ? 0 : l3.hashCode())) * 31;
            Boolean bool3 = this.foldedHasMore;
            int iHashCode13 = (iHashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str = this.collectInfo;
            int iHashCode14 = (iHashCode13 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool4 = this.eligible;
            int iHashCode15 = (iHashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            String str2 = this.eligibleExtraInfo;
            int iHashCode16 = (iHashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Aweme aweme = this.aweme;
            int iHashCode17 = (iHashCode16 + (aweme == null ? 0 : aweme.hashCode())) * 31;
            String str3 = this.poiName;
            int iHashCode18 = (iHashCode17 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.entranceDescription;
            int iHashCode19 = (iHashCode18 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.entranceSubDescription;
            int iHashCode20 = (((iHashCode19 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.landingTab) * 31;
            UrlStruct urlStruct = this.largerAvatar;
            int iHashCode21 = (iHashCode20 + (urlStruct == null ? 0 : urlStruct.hashCode())) * 31;
            UrlStruct urlStruct2 = this.mediumAvatar;
            int iHashCode22 = (iHashCode21 + (urlStruct2 == null ? 0 : urlStruct2.hashCode())) * 31;
            UrlStruct urlStruct3 = this.thumbAvatar;
            int iHashCode23 = (iHashCode22 + (urlStruct3 == null ? 0 : urlStruct3.hashCode())) * 31;
            UrlStruct urlStruct4 = this.avatar168;
            int iHashCode24 = (iHashCode23 + (urlStruct4 == null ? 0 : urlStruct4.hashCode())) * 31;
            UrlStruct urlStruct5 = this.avatar300;
            int iHashCode25 = (iHashCode24 + (urlStruct5 == null ? 0 : urlStruct5.hashCode())) * 31;
            Boolean bool5 = this.hasVideoPosted;
            int iHashCode26 = (iHashCode25 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            String str6 = this.statisticInfo;
            int iHashCode27 = (iHashCode26 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.displayInfo;
            int iHashCode28 = (iHashCode27 + (str7 == null ? 0 : str7.hashCode())) * 31;
            PoiNpsInfo poiNpsInfo = this.poiNpsInfo;
            int iHashCode29 = (iHashCode28 + (poiNpsInfo == null ? 0 : poiNpsInfo.hashCode())) * 31;
            List<PoiReviewsTabInfoModel> list7 = this.reviewTabInfos;
            return ((iHashCode29 + (list7 != null ? list7.hashCode() : 0)) * 31) + this.LL.hashCode();
        }

        @Override // X.InterfaceC1196330hEl
        public void setPreloadRealNetDurationMs(long j) {
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            return "PoiReviewListResponse(reviews=" + this.reviews + ", thirdPartyReviews=" + this.thirdPartyReviews + ", reviewTags=" + this.reviewTags + ", reviewSummary=" + this.reviewSummary + ", thirdPartySummary=" + this.thirdPartySummary + ", poiDetailThirdPartySummary=" + this.poiDetailThirdPartySummary + ", thirdPartyReviewDisclaimers=" + this.thirdPartyReviewDisclaimers + ", cursor=" + this.cursor + ", thirdPartyCursor=" + this.thirdPartyCursor + ", hasMore=" + this.hasMore + ", thirdPartyHasMore=" + this.thirdPartyHasMore + ", foldedCursor=" + this.foldedCursor + ", foldedHasMore=" + this.foldedHasMore + ", collectInfo=" + this.collectInfo + ", eligible=" + this.eligible + ", eligibleExtraInfo=" + this.eligibleExtraInfo + ", aweme=" + this.aweme + ", poiName=" + this.poiName + ", entranceDescription=" + this.entranceDescription + ", entranceSubDescription=" + this.entranceSubDescription + ", landingTab=" + this.landingTab + ", largerAvatar=" + this.largerAvatar + ", mediumAvatar=" + this.mediumAvatar + ", thumbAvatar=" + this.thumbAvatar + ", avatar168=" + this.avatar168 + ", avatar300=" + this.avatar300 + ", hasVideoPosted=" + this.hasVideoPosted + ", statisticInfo=" + this.statisticInfo + ", displayInfo=" + this.displayInfo + ", poiNpsInfo=" + this.poiNpsInfo + ", reviewTabInfos=" + this.reviewTabInfos + ", sourceId=" + this.LL + ')';
        }

        public final boolean hasReviewsContent$poi_release() {
            List<PoiReviewModel> list;
            List<PoiReviewModel> list2 = this.reviews;
            return (list2 != null && list2.size() > 0) || ((list = this.thirdPartyReviews) != null && list.size() > 0) || Intrinsics.LJFF(this.eligible, Boolean.TRUE);
        }

        public final UrlStruct getAvatar168() {
            return this.avatar168;
        }

        public final UrlStruct getAvatar300() {
            return this.avatar300;
        }

        public final Aweme getAweme() {
            return this.aweme;
        }

        public final String getCollectInfo() {
            return this.collectInfo;
        }

        public final Long getCursor() {
            return this.cursor;
        }

        public final String getDisplayInfo() {
            return this.displayInfo;
        }

        public final Boolean getEligible() {
            return this.eligible;
        }

        public final String getEligibleExtraInfo() {
            return this.eligibleExtraInfo;
        }

        public final String getEntranceDescription() {
            return this.entranceDescription;
        }

        public final String getEntranceSubDescription() {
            return this.entranceSubDescription;
        }

        public final Long getFoldedCursor() {
            return this.foldedCursor;
        }

        public final Boolean getFoldedHasMore() {
            return this.foldedHasMore;
        }

        public final Boolean getHasMore() {
            return this.hasMore;
        }

        public final Boolean getHasVideoPosted() {
            return this.hasVideoPosted;
        }

        public final int getLandingTab() {
            return this.landingTab;
        }

        public final UrlStruct getLargerAvatar() {
            return this.largerAvatar;
        }

        public final UrlStruct getMediumAvatar() {
            return this.mediumAvatar;
        }

        public final List<PoiReviewSummaryModel> getPoiDetailThirdPartySummary() {
            return this.poiDetailThirdPartySummary;
        }

        public final String getPoiName() {
            return this.poiName;
        }

        public final PoiNpsInfo getPoiNpsInfo() {
            return this.poiNpsInfo;
        }

        @Override // X.InterfaceC1196330hEl
        public String getPreloadFlag() {
            return this.LLILLJJLI;
        }

        public final PoiReviewSummaryModel getReviewSummary() {
            return this.reviewSummary;
        }

        public final List<PoiReviewsTabInfoModel> getReviewTabInfos() {
            return this.reviewTabInfos;
        }

        public final List<PoiReviewTagModel> getReviewTags() {
            return this.reviewTags;
        }

        public final List<PoiReviewModel> getReviews() {
            return this.reviews;
        }

        public String getSourceId() {
            return this.LL;
        }

        public final String getStatisticInfo() {
            return this.statisticInfo;
        }

        public final Long getThirdPartyCursor() {
            return this.thirdPartyCursor;
        }

        public final Boolean getThirdPartyHasMore() {
            return this.thirdPartyHasMore;
        }

        public final List<PoiReviewDisclaimer> getThirdPartyReviewDisclaimers() {
            return this.thirdPartyReviewDisclaimers;
        }

        public final List<PoiReviewModel> getThirdPartyReviews() {
            return this.thirdPartyReviews;
        }

        public final List<PoiReviewSummaryModel> getThirdPartySummary() {
            return this.thirdPartySummary;
        }

        public final UrlStruct getThumbAvatar() {
            return this.thumbAvatar;
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData
        public boolean areContentsTheSame(BaseComponentData baseComponentData) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Boolean bool;
            PoiReviewUserStatusModel userStatus;
            Boolean bool2;
            PoiReviewUserStatusModel userStatus2;
            Boolean bool3;
            PoiReviewUserStatusModel userStatus3;
            Boolean bool4;
            PoiReviewUserStatusModel userStatus4;
            String reviewId;
            String reviewId2;
            if (baseComponentData instanceof PoiReviewListResponse) {
                PoiReviewListResponse poiReviewListResponse = (PoiReviewListResponse) baseComponentData;
                if (Intrinsics.LJFF(this.eligible, poiReviewListResponse.eligible)) {
                    List<PoiReviewModel> list = this.reviews;
                    ArrayList arrayList6 = null;
                    if (list != null) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (PoiReviewModel poiReviewModel : list) {
                            if (poiReviewModel != null) {
                                reviewId2 = poiReviewModel.getReviewId();
                            } else {
                                reviewId2 = null;
                            }
                            arrayList.add(reviewId2);
                        }
                    } else {
                        arrayList = null;
                    }
                    List<PoiReviewModel> list2 = poiReviewListResponse.reviews;
                    if (list2 != null) {
                        arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        for (PoiReviewModel poiReviewModel2 : list2) {
                            if (poiReviewModel2 != null) {
                                reviewId = poiReviewModel2.getReviewId();
                            } else {
                                reviewId = null;
                            }
                            arrayList2.add(reviewId);
                        }
                    } else {
                        arrayList2 = null;
                    }
                    if (Intrinsics.LJFF(arrayList, arrayList2)) {
                        List<PoiReviewModel> list3 = this.reviews;
                        if (list3 != null) {
                            arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                            for (PoiReviewModel poiReviewModel3 : list3) {
                                if (poiReviewModel3 != null && (userStatus4 = poiReviewModel3.getUserStatus()) != null) {
                                    bool4 = userStatus4.liked;
                                } else {
                                    bool4 = null;
                                }
                                arrayList3.add(bool4);
                            }
                        } else {
                            arrayList3 = null;
                        }
                        List<PoiReviewModel> list4 = poiReviewListResponse.reviews;
                        if (list4 != null) {
                            arrayList4 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                            for (PoiReviewModel poiReviewModel4 : list4) {
                                if (poiReviewModel4 != null && (userStatus3 = poiReviewModel4.getUserStatus()) != null) {
                                    bool3 = userStatus3.liked;
                                } else {
                                    bool3 = null;
                                }
                                arrayList4.add(bool3);
                            }
                        } else {
                            arrayList4 = null;
                        }
                        if (Intrinsics.LJFF(arrayList3, arrayList4)) {
                            List<PoiReviewModel> list5 = this.reviews;
                            if (list5 != null) {
                                arrayList5 = new ArrayList(C15438062q.LJIJJ(list5, 10));
                                for (PoiReviewModel poiReviewModel5 : list5) {
                                    if (poiReviewModel5 != null && (userStatus2 = poiReviewModel5.getUserStatus()) != null) {
                                        bool2 = userStatus2.disliked;
                                    } else {
                                        bool2 = null;
                                    }
                                    arrayList5.add(bool2);
                                }
                            } else {
                                arrayList5 = null;
                            }
                            List<PoiReviewModel> list6 = poiReviewListResponse.reviews;
                            if (list6 != null) {
                                ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(list6, 10));
                                for (PoiReviewModel poiReviewModel6 : list6) {
                                    if (poiReviewModel6 != null && (userStatus = poiReviewModel6.getUserStatus()) != null) {
                                        bool = userStatus.disliked;
                                    } else {
                                        bool = null;
                                    }
                                    arrayList7.add(bool);
                                }
                                arrayList6 = arrayList7;
                            }
                            if (Intrinsics.LJFF(arrayList5, arrayList6)) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // X.InterfaceC1196330hEl
        public void setPreloadFlag(String str) {
            this.LLILLJJLI = str;
        }

        public PoiReviewListResponse(List<PoiReviewModel> list, List<PoiReviewModel> list2, List<PoiReviewTagModel> list3, PoiReviewSummaryModel poiReviewSummaryModel, List<PoiReviewSummaryModel> list4, List<PoiReviewSummaryModel> list5, List<PoiReviewDisclaimer> list6, Long l, Long l2, Boolean bool, Boolean bool2, Long l3, Boolean bool3, String str, Boolean bool4, String str2, Aweme aweme, String str3, String str4, String str5, int i, UrlStruct urlStruct, UrlStruct urlStruct2, UrlStruct urlStruct3, UrlStruct urlStruct4, UrlStruct urlStruct5, Boolean bool5, String str6, String str7, PoiNpsInfo poiNpsInfo, List<PoiReviewsTabInfoModel> list7, String str8) {
            this.reviews = list;
            this.thirdPartyReviews = list2;
            this.reviewTags = list3;
            this.reviewSummary = poiReviewSummaryModel;
            this.thirdPartySummary = list4;
            this.poiDetailThirdPartySummary = list5;
            this.thirdPartyReviewDisclaimers = list6;
            this.cursor = l;
            this.thirdPartyCursor = l2;
            this.hasMore = bool;
            this.thirdPartyHasMore = bool2;
            this.foldedCursor = l3;
            this.foldedHasMore = bool3;
            this.collectInfo = str;
            this.eligible = bool4;
            this.eligibleExtraInfo = str2;
            this.aweme = aweme;
            this.poiName = str3;
            this.entranceDescription = str4;
            this.entranceSubDescription = str5;
            this.landingTab = i;
            this.largerAvatar = urlStruct;
            this.mediumAvatar = urlStruct2;
            this.thumbAvatar = urlStruct3;
            this.avatar168 = urlStruct4;
            this.avatar300 = urlStruct5;
            this.hasVideoPosted = bool5;
            this.statisticInfo = str6;
            this.displayInfo = str7;
            this.poiNpsInfo = poiNpsInfo;
            this.reviewTabInfos = list7;
            this.LL = str8;
        }
    }

    @InterfaceC1501200pAU("/tiktok/poi/review/user/level/perks_panel")
    C11NZ<PoiReviewUserLevelPerksPanelResponse> LIZ(@InterfaceC1501120pAM("to_user_id") String str);

    @InterfaceC1501200pAU("/tiktok/poi/review/user/fold/v1")
    C11NZ<PoiReviewsFoldedReviewsResponse> LIZIZ(@InterfaceC1501120pAM("poi_id") String str, @InterfaceC1501120pAM("to_user_id") String str2);

    @InterfaceC1501200pAU("/tiktok/poi/review/get/v2")
    C11NZ<PoiReviewListResponse> LIZJ(@InterfaceC1501120pAM("poi_id") String str, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("pin_review_ids") List<String> list, @InterfaceC1501120pAM("tag_ids") List<String> list2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/poi/review/interact/v1")
    Object doPoiReviewInteract(@InterfaceC1501050pAF("poi_id") String str, @InterfaceC1501050pAF("review_id") String str2, @InterfaceC1501050pAF("interaction") int i, @InterfaceC1501050pAF("server_param") String str3, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/poi/review/user_statistics/v1")
    C11NZ<PoiReviewStatisticsResponse> getPoiReviewUserStatistic(@InterfaceC1501050pAF("poi_id") String str, @InterfaceC1501050pAF("with_user_level") boolean z);

    @InterfaceC1501200pAU
    C11NZ<PoiReviewListResponse> getPoiReviewsList(@InterfaceC1485705rj String str, @InterfaceC1501120pAM("poi_id") String str2, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("pin_review_ids") List<String> list, @InterfaceC1501120pAM("tag_ids") List<String> list2, @InterfaceC1501120pAM("sort_type") int i3, @InterfaceC1501120pAM("review_tab") Integer num, @InterfaceC1501120pAM("enter_from") String str3, @InterfaceC1501120pAM("need_nps_info") Boolean bool, @InterfaceC1501120pAM("enter_method") String str4, @InterfaceC2174808fa List<C080U> list3, @InterfaceC2177008fw Object obj);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/content/translation/")
    C11NZ<TranslationResponse> getTranslation(@InterfaceC1501050pAF("trg_lang") String str, @InterfaceC1501050pAF("content") String str2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) Integer num);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/poi/review/eligible/v1")
    C11NZ<PoiReviewEligibleResponse> isReviewEligible(@InterfaceC1501050pAF("poi_id") String str, @InterfaceC1501050pAF("post_source") int i, @InterfaceC1501050pAF("item_id") String str2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/poi/review/nps/submit/v1")
    C11NZ<PoiReviewNpsResponse> submitPoiReviewNpsScore(@InterfaceC1501050pAF("question_id") String str, @InterfaceC1501050pAF("poi_id") String str2, @InterfaceC1501050pAF("nps_score") int i, @InterfaceC1501050pAF("negative_reasons") String str3, @InterfaceC1501050pAF("record_id") String str4, @InterfaceC1501050pAF("extra_info") String str5);

    public static final class PoiReviewModel implements InterfaceC1891350zJl, C14NM, Serializable {
        public static final C1190060h4e Companion = new Object() { // from class: X.0h4e
        };
        public final boolean LL;
        public final boolean LLILLJJLI;
        public final String LLILLL;
        public final Boolean LLILZ;
        public final Boolean LLILZIL;
        public final EnumC1191110h6L LLILZLL;
        public EnumC1189990h4X LLIZ;
        public final String LLIZLLLIL;
        public boolean LLJ;
        public String LLJI;

        @C09CT("author")
        public final PoiReviewUserModel author;

        @C09CT("basic_info")
        public final PoiReviewBasicInfoModel basicInfo;

        @C09CT("brand_logo")
        public final UrlStruct brandLogo;

        @C09CT("brand_display_text")
        public final String brandName;

        @C09CT("content")
        public final PoiReviewContentModel content;

        @C09CT("dark_mode_brand_logo")
        public final UrlStruct darkModeBrandLogo;

        @C09CT("external_url")
        public final String externalUrl;

        @C09CT("author_self_has_more_review")
        public final boolean hasFoldedReviews;

        @C09CT("anonymous")
        public final boolean isAnonymous;

        @C09CT("poi_id")
        public final String poiId;

        @C09CT("review_id")
        public final String reviewId;

        @C09CT("server_param")
        public final String serverParam;

        @C09CT("review_source")
        public final Integer source;

        @C09CT("statistics")
        public final PoiReviewStatisticsModel statistics;

        @C09CT("review_status")
        public final PoiReviewStatusModel status;

        @C09CT("user_status")
        public final PoiReviewUserStatusModel userStatus;

        @C09CT("verified_display")
        public final String verifiedDisplay;

        public PoiReviewModel() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, EnumC1191110h6L.DEFAULT, null, String.valueOf(System.currentTimeMillis()), false, null);
        }

        public final PoiReviewModel copy(String str, String str2, PoiReviewUserModel poiReviewUserModel, PoiReviewContentModel poiReviewContentModel, PoiReviewBasicInfoModel poiReviewBasicInfoModel, PoiReviewStatisticsModel poiReviewStatisticsModel, PoiReviewUserStatusModel poiReviewUserStatusModel, Integer num, String str3, UrlStruct urlStruct, UrlStruct urlStruct2, String str4, PoiReviewStatusModel poiReviewStatusModel, String str5, boolean z, boolean z2, String str6, boolean z3, boolean z4, String str7, Boolean bool, Boolean bool2, EnumC1191110h6L enumC1191110h6L, EnumC1189990h4X enumC1189990h4X, String str8, boolean z5, String str9) {
            return new PoiReviewModel(str, str2, poiReviewUserModel, poiReviewContentModel, poiReviewBasicInfoModel, poiReviewStatisticsModel, poiReviewUserStatusModel, num, str3, urlStruct, urlStruct2, str4, poiReviewStatusModel, str5, z, z2, str6, z3, z4, str7, bool, bool2, enumC1191110h6L, enumC1189990h4X, str8, z5, str9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewModel)) {
                return false;
            }
            PoiReviewModel poiReviewModel = (PoiReviewModel) obj;
            return Intrinsics.LJFF(this.poiId, poiReviewModel.poiId) && Intrinsics.LJFF(this.reviewId, poiReviewModel.reviewId) && Intrinsics.LJFF(this.author, poiReviewModel.author) && Intrinsics.LJFF(this.content, poiReviewModel.content) && Intrinsics.LJFF(this.basicInfo, poiReviewModel.basicInfo) && Intrinsics.LJFF(this.statistics, poiReviewModel.statistics) && Intrinsics.LJFF(this.userStatus, poiReviewModel.userStatus) && Intrinsics.LJFF(this.source, poiReviewModel.source) && Intrinsics.LJFF(this.brandName, poiReviewModel.brandName) && Intrinsics.LJFF(this.brandLogo, poiReviewModel.brandLogo) && Intrinsics.LJFF(this.darkModeBrandLogo, poiReviewModel.darkModeBrandLogo) && Intrinsics.LJFF(this.externalUrl, poiReviewModel.externalUrl) && Intrinsics.LJFF(this.status, poiReviewModel.status) && Intrinsics.LJFF(this.serverParam, poiReviewModel.serverParam) && this.isAnonymous == poiReviewModel.isAnonymous && this.hasFoldedReviews == poiReviewModel.hasFoldedReviews && Intrinsics.LJFF(this.verifiedDisplay, poiReviewModel.verifiedDisplay) && this.LL == poiReviewModel.LL && this.LLILLJJLI == poiReviewModel.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, poiReviewModel.LLILLL) && Intrinsics.LJFF(this.LLILZ, poiReviewModel.LLILZ) && Intrinsics.LJFF(this.LLILZIL, poiReviewModel.LLILZIL) && this.LLILZLL == poiReviewModel.LLILZLL && this.LLIZ == poiReviewModel.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, poiReviewModel.LLIZLLLIL) && this.LLJ == poiReviewModel.LLJ && Intrinsics.LJFF(this.LLJI, poiReviewModel.LLJI);
        }

        public int hashCode() {
            String str = this.poiId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.reviewId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            PoiReviewUserModel poiReviewUserModel = this.author;
            int iHashCode3 = (iHashCode2 + (poiReviewUserModel == null ? 0 : poiReviewUserModel.hashCode())) * 31;
            PoiReviewContentModel poiReviewContentModel = this.content;
            int iHashCode4 = (iHashCode3 + (poiReviewContentModel == null ? 0 : poiReviewContentModel.hashCode())) * 31;
            PoiReviewBasicInfoModel poiReviewBasicInfoModel = this.basicInfo;
            int iHashCode5 = (iHashCode4 + (poiReviewBasicInfoModel == null ? 0 : poiReviewBasicInfoModel.hashCode())) * 31;
            PoiReviewStatisticsModel poiReviewStatisticsModel = this.statistics;
            int iHashCode6 = (iHashCode5 + (poiReviewStatisticsModel == null ? 0 : poiReviewStatisticsModel.hashCode())) * 31;
            PoiReviewUserStatusModel poiReviewUserStatusModel = this.userStatus;
            int iHashCode7 = (iHashCode6 + (poiReviewUserStatusModel == null ? 0 : poiReviewUserStatusModel.hashCode())) * 31;
            Integer num = this.source;
            int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.brandName;
            int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
            UrlStruct urlStruct = this.brandLogo;
            int iHashCode10 = (iHashCode9 + (urlStruct == null ? 0 : urlStruct.hashCode())) * 31;
            UrlStruct urlStruct2 = this.darkModeBrandLogo;
            int iHashCode11 = (iHashCode10 + (urlStruct2 == null ? 0 : urlStruct2.hashCode())) * 31;
            String str4 = this.externalUrl;
            int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
            PoiReviewStatusModel poiReviewStatusModel = this.status;
            int iHashCode13 = (iHashCode12 + (poiReviewStatusModel == null ? 0 : poiReviewStatusModel.hashCode())) * 31;
            String str5 = this.serverParam;
            int iHashCode14 = (((((iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Z2(this.isAnonymous)) * 31) + C786410Ut5.Z2(this.hasFoldedReviews)) * 31;
            String str6 = this.verifiedDisplay;
            int iHashCode15 = (((((iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31) + C786410Ut5.Z2(this.LL)) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
            String str7 = this.LLILLL;
            int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Boolean bool = this.LLILZ;
            int iHashCode17 = (iHashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.LLILZIL;
            int iHashCode18 = (((iHashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31;
            EnumC1189990h4X enumC1189990h4X = this.LLIZ;
            int iHashCode19 = (iHashCode18 + (enumC1189990h4X == null ? 0 : enumC1189990h4X.hashCode())) * 31;
            String str8 = this.LLIZLLLIL;
            int iHashCode20 = (((iHashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31) + C786410Ut5.Z2(this.LLJ)) * 31;
            String str9 = this.LLJI;
            return iHashCode20 + (str9 != null ? str9.hashCode() : 0);
        }

        public String toString() {
            return "PoiReviewModel(poiId=" + this.poiId + ", reviewId=" + this.reviewId + ", author=" + this.author + ", content=" + this.content + ", basicInfo=" + this.basicInfo + ", statistics=" + this.statistics + ", userStatus=" + this.userStatus + ", source=" + this.source + ", brandName=" + this.brandName + ", brandLogo=" + this.brandLogo + ", darkModeBrandLogo=" + this.darkModeBrandLogo + ", externalUrl=" + this.externalUrl + ", status=" + this.status + ", serverParam=" + this.serverParam + ", isAnonymous=" + this.isAnonymous + ", hasFoldedReviews=" + this.hasFoldedReviews + ", verifiedDisplay=" + this.verifiedDisplay + ", expanded=" + this.LL + ", wantTranslate=" + this.LLILLJJLI + ", translatedContent=" + this.LLILLL + ", hasBeenTranslatedLocal=" + this.LLILZ + ", isLocalAdded=" + this.LLILZIL + ", highlightState=" + this.LLILZLL + ", scene=" + this.LLIZ + ", localFlag=" + this.LLIZLLLIL + ", hasShownInCurrentPage=" + this.LLJ + ", avatarThirdPartyBgColor=" + this.LLJI + ')';
        }

        @Override // X.C14NM
        public int getContentType() {
            if (C1190820h5s.LJ(this)) {
                return 50101;
            }
            return C1190820h5s.LJIIIIZZ(this) ? 50102 : 50100;
        }

        public final PoiReviewUserModel getAuthor() {
            return this.author;
        }

        public final String getAvatarThirdPartyBgColor() {
            return this.LLJI;
        }

        public final PoiReviewBasicInfoModel getBasicInfo() {
            return this.basicInfo;
        }

        public final UrlStruct getBrandLogo() {
            return this.brandLogo;
        }

        public final String getBrandName() {
            return this.brandName;
        }

        public final PoiReviewContentModel getContent() {
            return this.content;
        }

        public final UrlStruct getDarkModeBrandLogo() {
            return this.darkModeBrandLogo;
        }

        public final boolean getExpanded() {
            return this.LL;
        }

        public final String getExternalUrl() {
            return this.externalUrl;
        }

        public final Boolean getHasBeenTranslatedLocal() {
            return this.LLILZ;
        }

        public final boolean getHasFoldedReviews() {
            return this.hasFoldedReviews;
        }

        public final boolean getHasShownInCurrentPage() {
            return this.LLJ;
        }

        public final EnumC1191110h6L getHighlightState() {
            return this.LLILZLL;
        }

        public final String getLocalFlag() {
            return this.LLIZLLLIL;
        }

        public final String getPoiId() {
            return this.poiId;
        }

        public final String getReviewId() {
            return this.reviewId;
        }

        public final EnumC1189990h4X getScene() {
            return this.LLIZ;
        }

        public final String getServerParam() {
            return this.serverParam;
        }

        public final Integer getSource() {
            return this.source;
        }

        public final PoiReviewStatisticsModel getStatistics() {
            return this.statistics;
        }

        public final PoiReviewStatusModel getStatus() {
            return this.status;
        }

        public final String getTranslatedContent() {
            return this.LLILLL;
        }

        public final PoiReviewUserStatusModel getUserStatus() {
            return this.userStatus;
        }

        public final String getVerifiedDisplay() {
            return this.verifiedDisplay;
        }

        public final boolean getWantTranslate() {
            return this.LLILLJJLI;
        }

        public final boolean isAnonymous() {
            return this.isAnonymous;
        }

        public final Boolean isLocalAdded() {
            return this.LLILZIL;
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            PoiReviewModel poiReviewModel;
            String str = this.reviewId;
            if (str == null) {
                return false;
            }
            String str2 = null;
            if ((interfaceC1891350zJl instanceof PoiReviewModel) && (poiReviewModel = (PoiReviewModel) interfaceC1891350zJl) != null) {
                str2 = poiReviewModel.reviewId;
            }
            return Intrinsics.LJFF(str, str2);
        }

        @Override // X.InterfaceC1891350zJl
        public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
            if (!(interfaceC1891350zJl instanceof PoiReviewModel) || Intrinsics.LJFF(interfaceC1891350zJl, this)) {
                return null;
            }
            PoiReviewModel poiReviewModel = (PoiReviewModel) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI))) {
                final boolean z = this.LLILLJJLI;
                final String str = this.LLILLL;
                final Boolean bool = this.LLILZ;
                return new Serializable(z, str, bool) { // from class: X.0h4Z
                    public final Boolean hasBeenTranslatedLocal;
                    public final String translatedContent;
                    public final boolean wantTranslate;

                    public String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ReviewTranslatePayload(wantTranslate=");
                        sbLIZ.append(this.wantTranslate);
                        sbLIZ.append(", translatedContent=");
                        sbLIZ.append(this.translatedContent);
                        sbLIZ.append(", hasBeenTranslatedLocal=");
                        sbLIZ.append(this.hasBeenTranslatedLocal);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.wantTranslate = z;
                        this.translatedContent = str;
                        this.hasBeenTranslatedLocal = bool;
                    }
                };
            }
            if (Intrinsics.LJFF(this, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, this.statistics, this.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI))) {
                return new C1190190h4r(poiReviewModel.statistics, poiReviewModel.userStatus);
            }
            if (!Intrinsics.LJFF(this, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, this.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI))) {
                return null;
            }
            final boolean z2 = poiReviewModel.LL;
            return new Serializable(z2) { // from class: X.00I5
                public final boolean expanded;

                public String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ExpandContentPayload(expanded=");
                    sbLIZ.append(this.expanded);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.expanded = z2;
                }
            };
        }

        public final void setAvatarThirdPartyBgColor(String str) {
            this.LLJI = str;
        }

        public final void setHasShownInCurrentPage(boolean z) {
            this.LLJ = z;
        }

        public final void setScene(EnumC1189990h4X enumC1189990h4X) {
            this.LLIZ = enumC1189990h4X;
        }

        public PoiReviewModel(String str, String str2, PoiReviewUserModel poiReviewUserModel, PoiReviewContentModel poiReviewContentModel, PoiReviewBasicInfoModel poiReviewBasicInfoModel, PoiReviewStatisticsModel poiReviewStatisticsModel, PoiReviewUserStatusModel poiReviewUserStatusModel, Integer num, String str3, UrlStruct urlStruct, UrlStruct urlStruct2, String str4, PoiReviewStatusModel poiReviewStatusModel, String str5, boolean z, boolean z2, String str6, boolean z3, boolean z4, String str7, Boolean bool, Boolean bool2, EnumC1191110h6L enumC1191110h6L, EnumC1189990h4X enumC1189990h4X, String str8, boolean z5, String str9) {
            this.poiId = str;
            this.reviewId = str2;
            this.author = poiReviewUserModel;
            this.content = poiReviewContentModel;
            this.basicInfo = poiReviewBasicInfoModel;
            this.statistics = poiReviewStatisticsModel;
            this.userStatus = poiReviewUserStatusModel;
            this.source = num;
            this.brandName = str3;
            this.brandLogo = urlStruct;
            this.darkModeBrandLogo = urlStruct2;
            this.externalUrl = str4;
            this.status = poiReviewStatusModel;
            this.serverParam = str5;
            this.isAnonymous = z;
            this.hasFoldedReviews = z2;
            this.verifiedDisplay = str6;
            this.LL = z3;
            this.LLILLJJLI = z4;
            this.LLILLL = str7;
            this.LLILZ = bool;
            this.LLILZIL = bool2;
            this.LLILZLL = enumC1191110h6L;
            this.LLIZ = enumC1189990h4X;
            this.LLIZLLLIL = str8;
            this.LLJ = z5;
            this.LLJI = str9;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class PoiReviewNpsResponse extends BaseResponse implements Serializable {

        @C09CT("record_id")
        public final String recordId;

        public PoiReviewNpsResponse() {
            this(null);
        }

        public final PoiReviewNpsResponse copy(String str) {
            return new PoiReviewNpsResponse(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiReviewNpsResponse) && Intrinsics.LJFF(this.recordId, ((PoiReviewNpsResponse) obj).recordId);
        }

        public int hashCode() {
            String str = this.recordId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiReviewNpsResponse(recordId=");
            sbLIZ.append(this.recordId);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final String getRecordId() {
            return this.recordId;
        }

        public PoiReviewNpsResponse(String str) {
            this.recordId = str;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class PoiReviewUserLevelRightModel implements Serializable, InterfaceC1891350zJl {

        @C09CT("dialog")
        public final PoiReviewUserLevelRightDialogModel dialog;

        @C09CT("right_online_status")
        public final Integer rightOnlineStatus;

        @C09CT("right_unlock_level")
        public final Integer rightUnlockLevel;

        @C09CT("rights_status")
        public final Integer rightsStatus;

        @C09CT("rights_sub_title")
        public final String rightsSubTitle;

        @C09CT("rights_title")
        public final String rightsTitle;

        @C09CT("rights_type")
        public final Integer rightsType;

        public PoiReviewUserLevelRightModel() {
            this(null, null, null, null, null, null, null);
        }

        public final PoiReviewUserLevelRightModel copy(Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, PoiReviewUserLevelRightDialogModel poiReviewUserLevelRightDialogModel) {
            return new PoiReviewUserLevelRightModel(num, str, str2, num2, num3, num4, poiReviewUserLevelRightDialogModel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewUserLevelRightModel)) {
                return false;
            }
            PoiReviewUserLevelRightModel poiReviewUserLevelRightModel = (PoiReviewUserLevelRightModel) obj;
            return Intrinsics.LJFF(this.rightsType, poiReviewUserLevelRightModel.rightsType) && Intrinsics.LJFF(this.rightsTitle, poiReviewUserLevelRightModel.rightsTitle) && Intrinsics.LJFF(this.rightsSubTitle, poiReviewUserLevelRightModel.rightsSubTitle) && Intrinsics.LJFF(this.rightsStatus, poiReviewUserLevelRightModel.rightsStatus) && Intrinsics.LJFF(this.rightUnlockLevel, poiReviewUserLevelRightModel.rightUnlockLevel) && Intrinsics.LJFF(this.rightOnlineStatus, poiReviewUserLevelRightModel.rightOnlineStatus) && Intrinsics.LJFF(this.dialog, poiReviewUserLevelRightModel.dialog);
        }

        @Override // X.InterfaceC1891350zJl
        public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
            return null;
        }

        public int hashCode() {
            Integer num = this.rightsType;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.rightsTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.rightsSubTitle;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num2 = this.rightsStatus;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.rightUnlockLevel;
            int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.rightOnlineStatus;
            int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
            PoiReviewUserLevelRightDialogModel poiReviewUserLevelRightDialogModel = this.dialog;
            return iHashCode6 + (poiReviewUserLevelRightDialogModel != null ? poiReviewUserLevelRightDialogModel.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiReviewUserLevelRightModel(rightsType=");
            sbLIZ.append(this.rightsType);
            sbLIZ.append(", rightsTitle=");
            sbLIZ.append(this.rightsTitle);
            sbLIZ.append(", rightsSubTitle=");
            sbLIZ.append(this.rightsSubTitle);
            sbLIZ.append(", rightsStatus=");
            sbLIZ.append(this.rightsStatus);
            sbLIZ.append(", rightUnlockLevel=");
            sbLIZ.append(this.rightUnlockLevel);
            sbLIZ.append(", rightOnlineStatus=");
            sbLIZ.append(this.rightOnlineStatus);
            sbLIZ.append(", dialog=");
            sbLIZ.append(this.dialog);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final PoiReviewUserLevelRightDialogModel getDialog() {
            return this.dialog;
        }

        public final Integer getRightOnlineStatus() {
            return this.rightOnlineStatus;
        }

        public final Integer getRightUnlockLevel() {
            return this.rightUnlockLevel;
        }

        public final Integer getRightsStatus() {
            return this.rightsStatus;
        }

        public final String getRightsSubTitle() {
            return this.rightsSubTitle;
        }

        public final String getRightsTitle() {
            return this.rightsTitle;
        }

        public final Integer getRightsType() {
            return this.rightsType;
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }

        public PoiReviewUserLevelRightModel(Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, PoiReviewUserLevelRightDialogModel poiReviewUserLevelRightDialogModel) {
            this.rightsType = num;
            this.rightsTitle = str;
            this.rightsSubTitle = str2;
            this.rightsStatus = num2;
            this.rightUnlockLevel = num3;
            this.rightOnlineStatus = num4;
            this.dialog = poiReviewUserLevelRightDialogModel;
        }
    }

    public static final class PoiNpsInfo implements Serializable, InterfaceC1891350zJl {
        public C1180030goT LL;

        @C09CT("expose_info")
        public final NpsExposeInfo exposeInfo;

        @C09CT("negative_reason_list")
        public final List<NegativeReason> negativeReasonList;

        @C09CT("negative_title")
        public final String negativeTitle;

        @C09CT("nps_pos")
        public final Integer npsPos;

        @C09CT("positive_score")
        public final Integer positiveScore;

        @C09CT("question_id")
        public final String questionId;

        @C09CT("question_title")
        public final String questionTitle;

        @C09CT("question_title_en")
        public final String questionTitleEn;

        @C09CT("response_title")
        public final String responseTitle;

        @C09CT("score_info_list")
        public final List<ScoreInfo> scoreInfoList;

        public PoiNpsInfo() {
            this(null, null, null, null, null, null, null, null, null, null);
        }

        public final PoiNpsInfo copy(String str, String str2, String str3, Integer num, Integer num2, List<ScoreInfo> list, String str4, String str5, List<NegativeReason> list2, NpsExposeInfo npsExposeInfo) {
            return new PoiNpsInfo(str, str2, str3, num, num2, list, str4, str5, list2, npsExposeInfo);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiNpsInfo)) {
                return false;
            }
            PoiNpsInfo poiNpsInfo = (PoiNpsInfo) obj;
            return Intrinsics.LJFF(this.questionId, poiNpsInfo.questionId) && Intrinsics.LJFF(this.questionTitle, poiNpsInfo.questionTitle) && Intrinsics.LJFF(this.questionTitleEn, poiNpsInfo.questionTitleEn) && Intrinsics.LJFF(this.npsPos, poiNpsInfo.npsPos) && Intrinsics.LJFF(this.positiveScore, poiNpsInfo.positiveScore) && Intrinsics.LJFF(this.scoreInfoList, poiNpsInfo.scoreInfoList) && Intrinsics.LJFF(this.responseTitle, poiNpsInfo.responseTitle) && Intrinsics.LJFF(this.negativeTitle, poiNpsInfo.negativeTitle) && Intrinsics.LJFF(this.negativeReasonList, poiNpsInfo.negativeReasonList) && Intrinsics.LJFF(this.exposeInfo, poiNpsInfo.exposeInfo);
        }

        @Override // X.InterfaceC1891350zJl
        public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
            return null;
        }

        public int hashCode() {
            String str = this.questionId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.questionTitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.questionTitleEn;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.npsPos;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.positiveScore;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            List<ScoreInfo> list = this.scoreInfoList;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.responseTitle;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.negativeTitle;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            List<NegativeReason> list2 = this.negativeReasonList;
            int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
            NpsExposeInfo npsExposeInfo = this.exposeInfo;
            return iHashCode9 + (npsExposeInfo != null ? npsExposeInfo.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiNpsInfo(questionId=");
            sbLIZ.append(this.questionId);
            sbLIZ.append(", questionTitle=");
            sbLIZ.append(this.questionTitle);
            sbLIZ.append(", questionTitleEn=");
            sbLIZ.append(this.questionTitleEn);
            sbLIZ.append(", npsPos=");
            sbLIZ.append(this.npsPos);
            sbLIZ.append(", positiveScore=");
            sbLIZ.append(this.positiveScore);
            sbLIZ.append(", scoreInfoList=");
            sbLIZ.append(this.scoreInfoList);
            sbLIZ.append(", responseTitle=");
            sbLIZ.append(this.responseTitle);
            sbLIZ.append(", negativeTitle=");
            sbLIZ.append(this.negativeTitle);
            sbLIZ.append(", negativeReasonList=");
            sbLIZ.append(this.negativeReasonList);
            sbLIZ.append(", exposeInfo=");
            sbLIZ.append(this.exposeInfo);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final NpsExposeInfo getExposeInfo() {
            return this.exposeInfo;
        }

        public final List<NegativeReason> getNegativeReasonList() {
            return this.negativeReasonList;
        }

        public final String getNegativeTitle() {
            return this.negativeTitle;
        }

        public final Integer getNpsPos() {
            return this.npsPos;
        }

        public final Integer getPositiveScore() {
            return this.positiveScore;
        }

        public final String getQuestionId() {
            return this.questionId;
        }

        public final String getQuestionTitle() {
            return this.questionTitle;
        }

        public final String getQuestionTitleEn() {
            return this.questionTitleEn;
        }

        public final String getResponseTitle() {
            return this.responseTitle;
        }

        public final List<ScoreInfo> getScoreInfoList() {
            return this.scoreInfoList;
        }

        public final C1180030goT getStoreNpsInfo() {
            return this.LL;
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }

        public final void setStoreNpsInfo(C1180030goT c1180030goT) {
            this.LL = c1180030goT;
        }

        public PoiNpsInfo(String str, String str2, String str3, Integer num, Integer num2, List<ScoreInfo> list, String str4, String str5, List<NegativeReason> list2, NpsExposeInfo npsExposeInfo) {
            this.questionId = str;
            this.questionTitle = str2;
            this.questionTitleEn = str3;
            this.npsPos = num;
            this.positiveScore = num2;
            this.scoreInfoList = list;
            this.responseTitle = str4;
            this.negativeTitle = str5;
            this.negativeReasonList = list2;
            this.exposeInfo = npsExposeInfo;
            this.LL = new C1180030goT(null, null, false, null, null, false, false, false);
        }
    }

    public static final class PoiReviewStatisticsResponse extends BaseResponse implements Serializable {

        @C09CT("enable_to_enter_review_center")
        public final Boolean enableReviewCenter;

        @C09CT("extra_info")
        public final String extraInfo;

        @C09CT("review_cnt")
        public final Long reviewCount;

        @C09CT("review_todo_id_list")
        public final List<String> reviewIdList;

        @C09CT("review_todo_cnt")
        public final Long reviewTodoCount;

        @C09CT("tooltip_prompt")
        public final String tooltipPrompt;

        @C09CT("user_level_info")
        public final PoiReviewUserLevelInfoModel userLevelInfo;

        public PoiReviewStatisticsResponse() {
            this(null, null, null, null, null, null, null);
        }

        public final PoiReviewStatisticsResponse copy(List<String> list, Long l, Long l2, String str, Boolean bool, PoiReviewUserLevelInfoModel poiReviewUserLevelInfoModel, String str2) {
            return new PoiReviewStatisticsResponse(list, l, l2, str, bool, poiReviewUserLevelInfoModel, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewStatisticsResponse)) {
                return false;
            }
            PoiReviewStatisticsResponse poiReviewStatisticsResponse = (PoiReviewStatisticsResponse) obj;
            return Intrinsics.LJFF(this.reviewIdList, poiReviewStatisticsResponse.reviewIdList) && Intrinsics.LJFF(this.reviewCount, poiReviewStatisticsResponse.reviewCount) && Intrinsics.LJFF(this.reviewTodoCount, poiReviewStatisticsResponse.reviewTodoCount) && Intrinsics.LJFF(this.extraInfo, poiReviewStatisticsResponse.extraInfo) && Intrinsics.LJFF(this.enableReviewCenter, poiReviewStatisticsResponse.enableReviewCenter) && Intrinsics.LJFF(this.userLevelInfo, poiReviewStatisticsResponse.userLevelInfo) && Intrinsics.LJFF(this.tooltipPrompt, poiReviewStatisticsResponse.tooltipPrompt);
        }

        public int hashCode() {
            List<String> list = this.reviewIdList;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            Long l = this.reviewCount;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.reviewTodoCount;
            int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str = this.extraInfo;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.enableReviewCenter;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            PoiReviewUserLevelInfoModel poiReviewUserLevelInfoModel = this.userLevelInfo;
            int iHashCode6 = (iHashCode5 + (poiReviewUserLevelInfoModel == null ? 0 : poiReviewUserLevelInfoModel.hashCode())) * 31;
            String str2 = this.tooltipPrompt;
            return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiReviewStatisticsResponse(reviewIdList=");
            sbLIZ.append(this.reviewIdList);
            sbLIZ.append(", reviewCount=");
            sbLIZ.append(this.reviewCount);
            sbLIZ.append(", reviewTodoCount=");
            sbLIZ.append(this.reviewTodoCount);
            sbLIZ.append(", extraInfo=");
            sbLIZ.append(this.extraInfo);
            sbLIZ.append(", enableReviewCenter=");
            sbLIZ.append(this.enableReviewCenter);
            sbLIZ.append(", userLevelInfo=");
            sbLIZ.append(this.userLevelInfo);
            sbLIZ.append(", tooltipPrompt=");
            sbLIZ.append(this.tooltipPrompt);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final Boolean getEnableReviewCenter() {
            return this.enableReviewCenter;
        }

        public final String getExtraInfo() {
            return this.extraInfo;
        }

        public final Long getReviewCount() {
            return this.reviewCount;
        }

        public final List<String> getReviewIdList() {
            return this.reviewIdList;
        }

        public final Long getReviewTodoCount() {
            return this.reviewTodoCount;
        }

        public final String getTooltipPrompt() {
            return this.tooltipPrompt;
        }

        public final PoiReviewUserLevelInfoModel getUserLevelInfo() {
            return this.userLevelInfo;
        }

        public PoiReviewStatisticsResponse(List<String> list, Long l, Long l2, String str, Boolean bool, PoiReviewUserLevelInfoModel poiReviewUserLevelInfoModel, String str2) {
            this.reviewIdList = list;
            this.reviewCount = l;
            this.reviewTodoCount = l2;
            this.extraInfo = str;
            this.enableReviewCenter = bool;
            this.userLevelInfo = poiReviewUserLevelInfoModel;
            this.tooltipPrompt = str2;
        }
    }

    public static final class PoiReviewTagModel implements InterfaceC1891350zJl, Serializable {
        public final EnumC1189990h4X LL;
        public boolean LLILLJJLI;
        public Integer LLILLL;

        @C09CT("emotion")
        public final Integer tagEmotion;

        @C09CT("en_name")
        public final String tagEnName;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final String tagId;

        @C09CT("local_name")
        public final String tagName;

        @C09CT("review_count")
        public final Integer tagReviewCount;

        @C09CT("user_avatars")
        public final List<PoiReviewUserModel> tagUserAvatars;

        public PoiReviewTagModel() {
            this(null, null, null, null, null, null, EnumC1189990h4X.REVIEW_LANDING_PAGE, false, null);
        }

        public final PoiReviewTagModel copy(String str, String str2, Integer num, Integer num2, List<PoiReviewUserModel> list, String str3, EnumC1189990h4X enumC1189990h4X, boolean z, Integer num3) {
            return new PoiReviewTagModel(str, str2, num, num2, list, str3, enumC1189990h4X, z, num3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewTagModel)) {
                return false;
            }
            PoiReviewTagModel poiReviewTagModel = (PoiReviewTagModel) obj;
            return Intrinsics.LJFF(this.tagId, poiReviewTagModel.tagId) && Intrinsics.LJFF(this.tagName, poiReviewTagModel.tagName) && Intrinsics.LJFF(this.tagEmotion, poiReviewTagModel.tagEmotion) && Intrinsics.LJFF(this.tagReviewCount, poiReviewTagModel.tagReviewCount) && Intrinsics.LJFF(this.tagUserAvatars, poiReviewTagModel.tagUserAvatars) && Intrinsics.LJFF(this.tagEnName, poiReviewTagModel.tagEnName) && this.LL == poiReviewTagModel.LL && this.LLILLJJLI == poiReviewTagModel.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, poiReviewTagModel.LLILLL);
        }

        @Override // X.InterfaceC1891350zJl
        public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
            return null;
        }

        public int hashCode() {
            String str = this.tagId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.tagName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.tagEmotion;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.tagReviewCount;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            List<PoiReviewUserModel> list = this.tagUserAvatars;
            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            String str3 = this.tagEnName;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            EnumC1189990h4X enumC1189990h4X = this.LL;
            int iHashCode7 = (((iHashCode6 + (enumC1189990h4X == null ? 0 : enumC1189990h4X.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
            Integer num3 = this.LLILLL;
            return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiReviewTagModel(tagId=");
            sbLIZ.append(this.tagId);
            sbLIZ.append(", tagName=");
            sbLIZ.append(this.tagName);
            sbLIZ.append(", tagEmotion=");
            sbLIZ.append(this.tagEmotion);
            sbLIZ.append(", tagReviewCount=");
            sbLIZ.append(this.tagReviewCount);
            sbLIZ.append(", tagUserAvatars=");
            sbLIZ.append(this.tagUserAvatars);
            sbLIZ.append(", tagEnName=");
            sbLIZ.append(this.tagEnName);
            sbLIZ.append(", scene=");
            sbLIZ.append(this.LL);
            sbLIZ.append(", isSelected=");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", index=");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final Integer getIndex() {
            return this.LLILLL;
        }

        public final EnumC1189990h4X getScene() {
            return this.LL;
        }

        public final Integer getTagEmotion() {
            return this.tagEmotion;
        }

        public final String getTagEnName() {
            return this.tagEnName;
        }

        public final String getTagId() {
            return this.tagId;
        }

        public final String getTagName() {
            return this.tagName;
        }

        public final Integer getTagReviewCount() {
            return this.tagReviewCount;
        }

        public final List<PoiReviewUserModel> getTagUserAvatars() {
            return this.tagUserAvatars;
        }

        public final boolean isSelected() {
            return this.LLILLJJLI;
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }

        @Override // X.InterfaceC1891350zJl
        public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
            return Intrinsics.LJFF(interfaceC1891350zJl, this);
        }

        public final void setIndex(Integer num) {
            this.LLILLL = num;
        }

        public final void setSelected(boolean z) {
            this.LLILLJJLI = z;
        }

        public PoiReviewTagModel(String str, String str2, Integer num, Integer num2, List<PoiReviewUserModel> list, String str3, EnumC1189990h4X enumC1189990h4X, boolean z, Integer num3) {
            this.tagId = str;
            this.tagName = str2;
            this.tagEmotion = num;
            this.tagReviewCount = num2;
            this.tagUserAvatars = list;
            this.tagEnName = str3;
            this.LL = enumC1189990h4X;
            this.LLILLJJLI = z;
            this.LLILLL = num3;
        }
    }

    public static final class PoiReviewUserLevelPerksPanelResponse extends BaseComponentData implements Serializable, InterfaceC2753014t {
        public final String LL;

        @C09CT("user_info")
        public final PoiReviewUserModel userInfo;

        @C09CT("to_user_level_panel")
        public final PoiReviewUserLevelPanelInfo userLevelPanelInfo;

        public PoiReviewUserLevelPerksPanelResponse() {
            this(null, null, "PoiReviewUserLevelPerksPanelResponse");
        }

        public final PoiReviewUserLevelPerksPanelResponse copy(PoiReviewUserLevelPanelInfo poiReviewUserLevelPanelInfo, PoiReviewUserModel poiReviewUserModel, String str) {
            return new PoiReviewUserLevelPerksPanelResponse(poiReviewUserLevelPanelInfo, poiReviewUserModel, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewUserLevelPerksPanelResponse)) {
                return false;
            }
            PoiReviewUserLevelPerksPanelResponse poiReviewUserLevelPerksPanelResponse = (PoiReviewUserLevelPerksPanelResponse) obj;
            return Intrinsics.LJFF(this.userLevelPanelInfo, poiReviewUserLevelPerksPanelResponse.userLevelPanelInfo) && Intrinsics.LJFF(this.userInfo, poiReviewUserLevelPerksPanelResponse.userInfo) && Intrinsics.LJFF(this.LL, poiReviewUserLevelPerksPanelResponse.LL);
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
        public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
            return C1201190hMb.LIZ(this);
        }

        public int hashCode() {
            PoiReviewUserLevelPanelInfo poiReviewUserLevelPanelInfo = this.userLevelPanelInfo;
            int iHashCode = (poiReviewUserLevelPanelInfo == null ? 0 : poiReviewUserLevelPanelInfo.hashCode()) * 31;
            PoiReviewUserModel poiReviewUserModel = this.userInfo;
            return ((iHashCode + (poiReviewUserModel != null ? poiReviewUserModel.hashCode() : 0)) * 31) + this.LL.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiReviewUserLevelPerksPanelResponse(userLevelPanelInfo=");
            sbLIZ.append(this.userLevelPanelInfo);
            sbLIZ.append(", userInfo=");
            sbLIZ.append(this.userInfo);
            sbLIZ.append(", sourceId=");
            sbLIZ.append(this.LL);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public String getSourceId() {
            return this.LL;
        }

        public final PoiReviewUserModel getUserInfo() {
            return this.userInfo;
        }

        public final PoiReviewUserLevelPanelInfo getUserLevelPanelInfo() {
            return this.userLevelPanelInfo;
        }

        public PoiReviewUserLevelPerksPanelResponse(PoiReviewUserLevelPanelInfo poiReviewUserLevelPanelInfo, PoiReviewUserModel poiReviewUserModel, String str) {
            this.userLevelPanelInfo = poiReviewUserLevelPanelInfo;
            this.userInfo = poiReviewUserModel;
            this.LL = str;
        }
    }

    public static final class PoiWriteReviewResponse extends BaseComponentData implements Serializable, InterfaceC2753014t {
        public final String LL;

        @C09CT("avatar_168x168")
        public final UrlStruct avatar168;

        @C09CT("avatar_300x300")
        public final UrlStruct avatar300;

        @C09CT("latest_aweme")
        public final Aweme aweme;

        @C09CT("display_info")
        public final String displayInfo;

        @C09CT("eligible_to_post")
        public final Boolean eligible;

        @C09CT("eligible_extra_info_str")
        public final String eligibleExtraInfo;

        @C09CT("post_review_description")
        public final String entranceDescription;

        @C09CT("post_review_sub_description")
        public final String entranceSubDescription;

        @C09CT("has_video_posted")
        public final Boolean hasVideoPosted;

        @C09CT("avatar_larger")
        public final UrlStruct largerAvatar;

        @C09CT("avatar_medium")
        public final UrlStruct mediumAvatar;

        @C09CT("need_event")
        public final Boolean needEvent;

        @C09CT("poi_name")
        public final String poiName;

        @C09CT("post_review_entrance")
        public final PoiReviewEntrance postReviewEntrance;

        @C09CT("avatar_thumb")
        public final UrlStruct thumbAvatar;

        public PoiWriteReviewResponse() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "PoiReviewListResponse");
        }

        public final PoiWriteReviewResponse copy(Boolean bool, String str, Aweme aweme, String str2, String str3, String str4, UrlStruct urlStruct, UrlStruct urlStruct2, UrlStruct urlStruct3, UrlStruct urlStruct4, UrlStruct urlStruct5, Boolean bool2, String str5, Boolean bool3, PoiReviewEntrance poiReviewEntrance, String str6) {
            return new PoiWriteReviewResponse(bool, str, aweme, str2, str3, str4, urlStruct, urlStruct2, urlStruct3, urlStruct4, urlStruct5, bool2, str5, bool3, poiReviewEntrance, str6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiWriteReviewResponse)) {
                return false;
            }
            PoiWriteReviewResponse poiWriteReviewResponse = (PoiWriteReviewResponse) obj;
            return Intrinsics.LJFF(this.eligible, poiWriteReviewResponse.eligible) && Intrinsics.LJFF(this.eligibleExtraInfo, poiWriteReviewResponse.eligibleExtraInfo) && Intrinsics.LJFF(this.aweme, poiWriteReviewResponse.aweme) && Intrinsics.LJFF(this.poiName, poiWriteReviewResponse.poiName) && Intrinsics.LJFF(this.entranceDescription, poiWriteReviewResponse.entranceDescription) && Intrinsics.LJFF(this.entranceSubDescription, poiWriteReviewResponse.entranceSubDescription) && Intrinsics.LJFF(this.largerAvatar, poiWriteReviewResponse.largerAvatar) && Intrinsics.LJFF(this.mediumAvatar, poiWriteReviewResponse.mediumAvatar) && Intrinsics.LJFF(this.thumbAvatar, poiWriteReviewResponse.thumbAvatar) && Intrinsics.LJFF(this.avatar168, poiWriteReviewResponse.avatar168) && Intrinsics.LJFF(this.avatar300, poiWriteReviewResponse.avatar300) && Intrinsics.LJFF(this.hasVideoPosted, poiWriteReviewResponse.hasVideoPosted) && Intrinsics.LJFF(this.displayInfo, poiWriteReviewResponse.displayInfo) && Intrinsics.LJFF(this.needEvent, poiWriteReviewResponse.needEvent) && Intrinsics.LJFF(this.postReviewEntrance, poiWriteReviewResponse.postReviewEntrance) && Intrinsics.LJFF(this.LL, poiWriteReviewResponse.LL);
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
        public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
            return C1201190hMb.LIZ(this);
        }

        public int hashCode() {
            Boolean bool = this.eligible;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.eligibleExtraInfo;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Aweme aweme = this.aweme;
            int iHashCode3 = (iHashCode2 + (aweme == null ? 0 : aweme.hashCode())) * 31;
            String str2 = this.poiName;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.entranceDescription;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.entranceSubDescription;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            UrlStruct urlStruct = this.largerAvatar;
            int iHashCode7 = (iHashCode6 + (urlStruct == null ? 0 : urlStruct.hashCode())) * 31;
            UrlStruct urlStruct2 = this.mediumAvatar;
            int iHashCode8 = (iHashCode7 + (urlStruct2 == null ? 0 : urlStruct2.hashCode())) * 31;
            UrlStruct urlStruct3 = this.thumbAvatar;
            int iHashCode9 = (iHashCode8 + (urlStruct3 == null ? 0 : urlStruct3.hashCode())) * 31;
            UrlStruct urlStruct4 = this.avatar168;
            int iHashCode10 = (iHashCode9 + (urlStruct4 == null ? 0 : urlStruct4.hashCode())) * 31;
            UrlStruct urlStruct5 = this.avatar300;
            int iHashCode11 = (iHashCode10 + (urlStruct5 == null ? 0 : urlStruct5.hashCode())) * 31;
            Boolean bool2 = this.hasVideoPosted;
            int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str5 = this.displayInfo;
            int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool3 = this.needEvent;
            int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            PoiReviewEntrance poiReviewEntrance = this.postReviewEntrance;
            return ((iHashCode14 + (poiReviewEntrance != null ? poiReviewEntrance.hashCode() : 0)) * 31) + this.LL.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            return "PoiWriteReviewResponse(eligible=" + this.eligible + ", eligibleExtraInfo=" + this.eligibleExtraInfo + ", aweme=" + this.aweme + ", poiName=" + this.poiName + ", entranceDescription=" + this.entranceDescription + ", entranceSubDescription=" + this.entranceSubDescription + ", largerAvatar=" + this.largerAvatar + ", mediumAvatar=" + this.mediumAvatar + ", thumbAvatar=" + this.thumbAvatar + ", avatar168=" + this.avatar168 + ", avatar300=" + this.avatar300 + ", hasVideoPosted=" + this.hasVideoPosted + ", displayInfo=" + this.displayInfo + ", needEvent=" + this.needEvent + ", postReviewEntrance=" + this.postReviewEntrance + ", sourceId=" + this.LL + ')';
        }

        public final UrlStruct getAvatar168() {
            return this.avatar168;
        }

        public final UrlStruct getAvatar300() {
            return this.avatar300;
        }

        public final Aweme getAweme() {
            return this.aweme;
        }

        public final String getDisplayInfo() {
            return this.displayInfo;
        }

        public final Boolean getEligible() {
            return this.eligible;
        }

        public final String getEligibleExtraInfo() {
            return this.eligibleExtraInfo;
        }

        public final String getEntranceDescription() {
            return this.entranceDescription;
        }

        public final String getEntranceSubDescription() {
            return this.entranceSubDescription;
        }

        public final Boolean getHasVideoPosted() {
            return this.hasVideoPosted;
        }

        public final UrlStruct getLargerAvatar() {
            return this.largerAvatar;
        }

        public final UrlStruct getMediumAvatar() {
            return this.mediumAvatar;
        }

        public final Boolean getNeedEvent() {
            return this.needEvent;
        }

        public final String getPoiName() {
            return this.poiName;
        }

        public final PoiReviewEntrance getPostReviewEntrance() {
            return this.postReviewEntrance;
        }

        public String getSourceId() {
            return this.LL;
        }

        public final UrlStruct getThumbAvatar() {
            return this.thumbAvatar;
        }

        @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData
        public boolean areContentsTheSame(BaseComponentData baseComponentData) {
            boolean z;
            boolean z2 = baseComponentData instanceof PoiWriteReviewResponse;
            if (z2 && Intrinsics.LJFF(this.eligible, ((PoiWriteReviewResponse) baseComponentData).eligible)) {
                z = true;
            } else {
                z = false;
            }
            String.valueOf(z);
            if (z2) {
                PoiWriteReviewResponse poiWriteReviewResponse = (PoiWriteReviewResponse) baseComponentData;
                if (Intrinsics.LJFF(this.eligible, poiWriteReviewResponse.eligible) && Intrinsics.LJFF(this.displayInfo, poiWriteReviewResponse.displayInfo)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public PoiWriteReviewResponse(Boolean bool, String str, Aweme aweme, String str2, String str3, String str4, UrlStruct urlStruct, UrlStruct urlStruct2, UrlStruct urlStruct3, UrlStruct urlStruct4, UrlStruct urlStruct5, Boolean bool2, String str5, Boolean bool3, PoiReviewEntrance poiReviewEntrance, String str6) {
            this.eligible = bool;
            this.eligibleExtraInfo = str;
            this.aweme = aweme;
            this.poiName = str2;
            this.entranceDescription = str3;
            this.entranceSubDescription = str4;
            this.largerAvatar = urlStruct;
            this.mediumAvatar = urlStruct2;
            this.thumbAvatar = urlStruct3;
            this.avatar168 = urlStruct4;
            this.avatar300 = urlStruct5;
            this.hasVideoPosted = bool2;
            this.displayInfo = str5;
            this.needEvent = bool3;
            this.postReviewEntrance = poiReviewEntrance;
            this.LL = str6;
        }
    }

    public static final class PoiReviewBasicInfoModel implements Serializable {

        @C09CT("create_time")
        public final Long createTime;

        public PoiReviewBasicInfoModel() {
            this(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiReviewBasicInfoModel) && Intrinsics.LJFF(this.createTime, ((PoiReviewBasicInfoModel) obj).createTime);
        }

        public int hashCode() {
            Long l = this.createTime;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiReviewBasicInfoModel(createTime=");
            sbLIZ.append(this.createTime);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiReviewBasicInfoModel(Long l) {
            this.createTime = l;
        }
    }

    public static final class PoiReviewStatisticsModel implements Serializable {

        @C09CT("like_count")
        public final Long likeCount;

        public PoiReviewStatisticsModel() {
            this(null);
        }

        public final PoiReviewStatisticsModel copy(Long l) {
            return new PoiReviewStatisticsModel(l);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiReviewStatisticsModel) && Intrinsics.LJFF(this.likeCount, ((PoiReviewStatisticsModel) obj).likeCount);
        }

        public int hashCode() {
            Long l = this.likeCount;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiReviewStatisticsModel(likeCount=");
            sbLIZ.append(this.likeCount);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiReviewStatisticsModel(Long l) {
            this.likeCount = l;
        }
    }

    public static final class PoiReviewStatusModel implements Serializable {

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public final Integer status;

        public PoiReviewStatusModel() {
            this(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiReviewStatusModel) && Intrinsics.LJFF(this.status, ((PoiReviewStatusModel) obj).status);
        }

        public int hashCode() {
            Integer num = this.status;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiReviewStatusModel(status=");
            sbLIZ.append(this.status);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiReviewStatusModel(Integer num) {
            this.status = num;
        }
    }

    public static final class ImageDataModel implements Serializable {

        @C09CT("crop_image")
        public final UrlModel cropImage;

        @C09CT("origin_image")
        public final UrlModel originImage;

        public ImageDataModel() {
            this(null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageDataModel)) {
                return false;
            }
            ImageDataModel imageDataModel = (ImageDataModel) obj;
            return Intrinsics.LJFF(this.originImage, imageDataModel.originImage) && Intrinsics.LJFF(this.cropImage, imageDataModel.cropImage);
        }

        public int hashCode() {
            UrlModel urlModel = this.originImage;
            int iHashCode = (urlModel == null ? 0 : urlModel.hashCode()) * 31;
            UrlModel urlModel2 = this.cropImage;
            return iHashCode + (urlModel2 != null ? urlModel2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ImageDataModel(originImage=");
            sbLIZ.append(this.originImage);
            sbLIZ.append(", cropImage=");
            sbLIZ.append(this.cropImage);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ImageDataModel(UrlModel urlModel, UrlModel urlModel2) {
            this.originImage = urlModel;
            this.cropImage = urlModel2;
        }
    }

    public static final class NegativeReason implements Serializable {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final String id;

        @C09CT("text")
        public final String text;

        public NegativeReason() {
            this(null, null);
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.text;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public NegativeReason(String str, String str2) {
            this.id = str;
            this.text = str2;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class PoiReviewScoreModel implements Serializable {

        @C09CT("score")
        public final Double score;

        @C09CT("total")
        public final Long total;

        public PoiReviewScoreModel() {
            this(null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewScoreModel)) {
                return false;
            }
            PoiReviewScoreModel poiReviewScoreModel = (PoiReviewScoreModel) obj;
            return Intrinsics.LJFF(this.score, poiReviewScoreModel.score) && Intrinsics.LJFF(this.total, poiReviewScoreModel.total);
        }

        public int hashCode() {
            Double d = this.score;
            int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
            Long l = this.total;
            return iHashCode + (l != null ? l.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiReviewScoreModel(score=");
            sbLIZ.append(this.score);
            sbLIZ.append(", total=");
            sbLIZ.append(this.total);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiReviewScoreModel(Double d, Long l) {
            this.score = d;
            this.total = l;
        }
    }

    public static final class PoiReviewUserStatusModel implements Serializable {

        @C09CT("disliked")
        public final Boolean disliked;

        @C09CT("liked")
        public final Boolean liked;

        public PoiReviewUserStatusModel() {
            this(null, null);
        }

        public final PoiReviewUserStatusModel copy(Boolean bool, Boolean bool2) {
            return new PoiReviewUserStatusModel(bool, bool2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewUserStatusModel)) {
                return false;
            }
            PoiReviewUserStatusModel poiReviewUserStatusModel = (PoiReviewUserStatusModel) obj;
            return Intrinsics.LJFF(this.liked, poiReviewUserStatusModel.liked) && Intrinsics.LJFF(this.disliked, poiReviewUserStatusModel.disliked);
        }

        public int hashCode() {
            Boolean bool = this.liked;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.disliked;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiReviewUserStatusModel(liked=");
            sbLIZ.append(this.liked);
            sbLIZ.append(", disliked=");
            sbLIZ.append(this.disliked);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiReviewUserStatusModel(Boolean bool, Boolean bool2) {
            this.liked = bool;
            this.disliked = bool2;
        }
    }

    public static final class PoiReviewsFoldedReviewsResponse extends BaseResponse {

        @C09CT("collect_info")
        public final String collectInfo;

        @C09CT("reviews")
        public final List<PoiReviewModel> reviews;

        public PoiReviewsFoldedReviewsResponse() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewsFoldedReviewsResponse)) {
                return false;
            }
            PoiReviewsFoldedReviewsResponse poiReviewsFoldedReviewsResponse = (PoiReviewsFoldedReviewsResponse) obj;
            return Intrinsics.LJFF(this.reviews, poiReviewsFoldedReviewsResponse.reviews) && Intrinsics.LJFF(this.collectInfo, poiReviewsFoldedReviewsResponse.collectInfo);
        }

        public final int hashCode() {
            List<PoiReviewModel> list = this.reviews;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.collectInfo;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiReviewsFoldedReviewsResponse(reviews=");
            sbLIZ.append(this.reviews);
            sbLIZ.append(", collectInfo=");
            sbLIZ.append(this.collectInfo);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiReviewsFoldedReviewsResponse(List<PoiReviewModel> list, String str) {
            this.reviews = list;
            this.collectInfo = str;
        }
    }

    public static final class PoiUserReviewModel implements Serializable {

        @C09CT("level")
        public final Integer badgeLevel;

        @C09CT("badge_url")
        public final UrlModel badgeUrl;

        public PoiUserReviewModel() {
            this(null, null);
        }

        public PoiUserReviewModel(UrlModel urlModel, Integer num) {
            this.badgeUrl = urlModel;
            this.badgeLevel = num;
        }
    }

    public static final class TranslationResponse {

        @C09CT("status_code")
        public final Integer statusCode;

        @C09CT("translated_content")
        public final String translatedContent;

        public TranslationResponse(Integer num, String str) {
            this.statusCode = num;
            this.translatedContent = str;
        }
    }

    public static final class NpsExposeInfo implements Serializable {

        @C09CT("expose_days")
        public final Integer exposeDays;

        @C09CT("expose_days_with_feedback")
        public final Integer exposeDaysWithFeedback;

        @C09CT("expose_days_without_feedback")
        public final Integer exposeDaysWithoutFeedback;

        public NpsExposeInfo() {
            this(null, null, null);
        }

        public int hashCode() {
            Integer num = this.exposeDays;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.exposeDaysWithoutFeedback;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.exposeDaysWithFeedback;
            return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
        }

        public NpsExposeInfo(Integer num, Integer num2, Integer num3) {
            this.exposeDays = num;
            this.exposeDaysWithoutFeedback = num2;
            this.exposeDaysWithFeedback = num3;
        }
    }

    public static final class PoiReviewsTabInfoModel implements Serializable {

        @C09CT("review_tab")
        public final Integer reviewTab;

        @C09CT("tab_en_name")
        public final String reviewTabEnName;

        @C09CT("tab_name")
        public final String reviewTabName;

        public PoiReviewsTabInfoModel() {
            this(null, null, null);
        }

        public int hashCode() {
            Integer num = this.reviewTab;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.reviewTabName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.reviewTabEnName;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public PoiReviewsTabInfoModel(Integer num, String str, String str2) {
            this.reviewTab = num;
            this.reviewTabName = str;
            this.reviewTabEnName = str2;
        }
    }

    public static final class PoiReviewUserLevelInfoModel implements Serializable {

        @C09CT("level")
        public final Integer level;

        @C09CT("level_badge")
        public final UrlModel levelIcon;

        @C09CT("level_name")
        public final String levelName;

        @C09CT("level_small_badge")
        public final UrlModel smallLevelIcon;

        public PoiReviewUserLevelInfoModel() {
            this(null, null, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewUserLevelInfoModel)) {
                return false;
            }
            PoiReviewUserLevelInfoModel poiReviewUserLevelInfoModel = (PoiReviewUserLevelInfoModel) obj;
            return Intrinsics.LJFF(this.level, poiReviewUserLevelInfoModel.level) && Intrinsics.LJFF(this.levelName, poiReviewUserLevelInfoModel.levelName) && Intrinsics.LJFF(this.levelIcon, poiReviewUserLevelInfoModel.levelIcon) && Intrinsics.LJFF(this.smallLevelIcon, poiReviewUserLevelInfoModel.smallLevelIcon);
        }

        public int hashCode() {
            Integer num = this.level;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.levelName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            UrlModel urlModel = this.levelIcon;
            int iHashCode3 = (iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
            UrlModel urlModel2 = this.smallLevelIcon;
            return iHashCode3 + (urlModel2 != null ? urlModel2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiReviewUserLevelInfoModel(level=");
            sbLIZ.append(this.level);
            sbLIZ.append(", levelName=");
            sbLIZ.append(this.levelName);
            sbLIZ.append(", levelIcon=");
            sbLIZ.append(this.levelIcon);
            sbLIZ.append(", smallLevelIcon=");
            sbLIZ.append(this.smallLevelIcon);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiReviewUserLevelInfoModel(Integer num, String str, UrlModel urlModel, UrlModel urlModel2) {
            this.level = num;
            this.levelName = str;
            this.levelIcon = urlModel;
            this.smallLevelIcon = urlModel2;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class PoiReviewUserLevelRightDialogModel implements Serializable {

        @C09CT("cta_schema")
        public final String ctaSchema;

        @C09CT("cta_text")
        public final String ctaText;

        @C09CT("rights_desc")
        public final String rightsDesc;

        @C09CT("rights_status_desc")
        public final String rightsStatusDesc;

        public PoiReviewUserLevelRightDialogModel() {
            this(null, null, null, null);
        }

        public PoiReviewUserLevelRightDialogModel(String str, String str2, String str3, String str4) {
            this.rightsDesc = str;
            this.rightsStatusDesc = str2;
            this.ctaText = str3;
            this.ctaSchema = str4;
        }
    }

    public static final class PoiReviewDisclaimer implements Serializable {

        @C09CT("brand_logo")
        public final UrlModel brandLogo;

        @C09CT("disclaimer_content")
        public final LsRichText disClaimerContent;

        @C09CT("review_source")
        public final Integer reviewSource;

        @C09CT("tiktok_logo")
        public final UrlModel tiktokLogo;

        @C09CT("title")
        public final String title;

        public PoiReviewDisclaimer() {
            this(null, null, null, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewDisclaimer)) {
                return false;
            }
            PoiReviewDisclaimer poiReviewDisclaimer = (PoiReviewDisclaimer) obj;
            return Intrinsics.LJFF(this.disClaimerContent, poiReviewDisclaimer.disClaimerContent) && Intrinsics.LJFF(this.reviewSource, poiReviewDisclaimer.reviewSource) && Intrinsics.LJFF(this.brandLogo, poiReviewDisclaimer.brandLogo) && Intrinsics.LJFF(this.tiktokLogo, poiReviewDisclaimer.tiktokLogo) && Intrinsics.LJFF(this.title, poiReviewDisclaimer.title);
        }

        public int hashCode() {
            LsRichText lsRichText = this.disClaimerContent;
            int iHashCode = (lsRichText == null ? 0 : lsRichText.hashCode()) * 31;
            Integer num = this.reviewSource;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            UrlModel urlModel = this.brandLogo;
            int iHashCode3 = (iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
            UrlModel urlModel2 = this.tiktokLogo;
            int iHashCode4 = (iHashCode3 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
            String str = this.title;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiReviewDisclaimer(disClaimerContent=");
            sbLIZ.append(this.disClaimerContent);
            sbLIZ.append(", reviewSource=");
            sbLIZ.append(this.reviewSource);
            sbLIZ.append(", brandLogo=");
            sbLIZ.append(this.brandLogo);
            sbLIZ.append(", tiktokLogo=");
            sbLIZ.append(this.tiktokLogo);
            sbLIZ.append(", title=");
            sbLIZ.append(this.title);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiReviewDisclaimer(LsRichText lsRichText, Integer num, UrlModel urlModel, UrlModel urlModel2, String str) {
            this.disClaimerContent = lsRichText;
            this.reviewSource = num;
            this.brandLogo = urlModel;
            this.tiktokLogo = urlModel2;
            this.title = str;
        }
    }

    public static final class ScoreInfo implements Serializable {

        @C09CT("image_url")
        public final String imageUrl;

        @C09CT("score")
        public final Integer score;

        @C09CT("selected_url")
        public final String selectedUrl;

        @C09CT("text")
        public final String text;

        @C09CT("unselected_url")
        public final String unselectedUrl;

        public ScoreInfo() {
            this(null, null, null, null, null);
        }

        public int hashCode() {
            Integer num = this.score;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.text;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.imageUrl;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.selectedUrl;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.unselectedUrl;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public ScoreInfo(Integer num, String str, String str2, String str3, String str4) {
            this.score = num;
            this.text = str;
            this.imageUrl = str2;
            this.selectedUrl = str3;
            this.unselectedUrl = str4;
        }
    }

    public static final class NpsExtraInfo {

        @C09CT("nps_config_pos")
        public final String npsConfigPos;

        @C09CT("nps_pos")
        public final String npsPos;

        @C09CT("poi_score")
        public final String posScore;

        @C09CT("question_title")
        public final String questionTitle;

        @C09CT("question_title_en")
        public final String questionTitleEn;

        @C09CT("review_id_list")
        public final String reviewIdList;

        public NpsExtraInfo() {
            this(null, null, null, null, null, null);
        }

        public NpsExtraInfo(String str, String str2, String str3, String str4, String str5, String str6) {
            this.questionTitle = str;
            this.questionTitleEn = str2;
            this.reviewIdList = str3;
            this.npsPos = str4;
            this.npsConfigPos = str5;
            this.posScore = str6;
        }
    }

    public static final class PoiReviewContentModel implements Serializable {

        @C09CT("image_data")
        public final List<ImageDataModel> images;

        @C09CT("rating")
        public final Double rating;

        @C09CT("display_rating")
        public final String ratingStr;

        @C09CT("text")
        public final String text;

        @C09CT("text_lang")
        public final String textLang;

        @C09CT("translated_text")
        public final String translatedContent;

        public PoiReviewContentModel() {
            this(null, null, null, null, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewContentModel)) {
                return false;
            }
            PoiReviewContentModel poiReviewContentModel = (PoiReviewContentModel) obj;
            return Intrinsics.LJFF(this.rating, poiReviewContentModel.rating) && Intrinsics.LJFF(this.ratingStr, poiReviewContentModel.ratingStr) && Intrinsics.LJFF(this.text, poiReviewContentModel.text) && Intrinsics.LJFF(this.textLang, poiReviewContentModel.textLang) && Intrinsics.LJFF(this.images, poiReviewContentModel.images) && Intrinsics.LJFF(this.translatedContent, poiReviewContentModel.translatedContent);
        }

        public int hashCode() {
            Double d = this.rating;
            int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
            String str = this.ratingStr;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.text;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.textLang;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<ImageDataModel> list = this.images;
            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.translatedContent;
            return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiReviewContentModel(rating=");
            sbLIZ.append(this.rating);
            sbLIZ.append(", ratingStr=");
            sbLIZ.append(this.ratingStr);
            sbLIZ.append(", text=");
            sbLIZ.append(this.text);
            sbLIZ.append(", textLang=");
            sbLIZ.append(this.textLang);
            sbLIZ.append(", images=");
            sbLIZ.append(this.images);
            sbLIZ.append(", translatedContent=");
            sbLIZ.append(this.translatedContent);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiReviewContentModel(Double d, String str, String str2, String str3, List<ImageDataModel> list, String str4) {
            this.rating = d;
            this.ratingStr = str;
            this.text = str2;
            this.textLang = str3;
            this.images = list;
            this.translatedContent = str4;
        }
    }

    public static final class PoiReviewEntrance implements Serializable {

        @C09CT("latest_aweme")
        public final Aweme aweme;

        @C09CT("content")
        public final LsRichText content;

        @C09CT("eligible_extra_info_str")
        public final String extraInfo;

        @C09CT("source_tag")
        public final LsRichText sourceTag;

        @C09CT("title")
        public final LsRichText title;

        @C09CT("type")
        public final Integer type;

        @C09CT("user")
        public final PoiReviewUserModel user;

        public PoiReviewEntrance() {
            this(null, null, null, null, null, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewEntrance)) {
                return false;
            }
            PoiReviewEntrance poiReviewEntrance = (PoiReviewEntrance) obj;
            return Intrinsics.LJFF(this.title, poiReviewEntrance.title) && Intrinsics.LJFF(this.content, poiReviewEntrance.content) && Intrinsics.LJFF(this.sourceTag, poiReviewEntrance.sourceTag) && Intrinsics.LJFF(this.type, poiReviewEntrance.type) && Intrinsics.LJFF(this.user, poiReviewEntrance.user) && Intrinsics.LJFF(this.extraInfo, poiReviewEntrance.extraInfo) && Intrinsics.LJFF(this.aweme, poiReviewEntrance.aweme);
        }

        public int hashCode() {
            LsRichText lsRichText = this.title;
            int iHashCode = (lsRichText == null ? 0 : lsRichText.hashCode()) * 31;
            LsRichText lsRichText2 = this.content;
            int iHashCode2 = (iHashCode + (lsRichText2 == null ? 0 : lsRichText2.hashCode())) * 31;
            LsRichText lsRichText3 = this.sourceTag;
            int iHashCode3 = (iHashCode2 + (lsRichText3 == null ? 0 : lsRichText3.hashCode())) * 31;
            Integer num = this.type;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            PoiReviewUserModel poiReviewUserModel = this.user;
            int iHashCode5 = (iHashCode4 + (poiReviewUserModel == null ? 0 : poiReviewUserModel.hashCode())) * 31;
            String str = this.extraInfo;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            Aweme aweme = this.aweme;
            return iHashCode6 + (aweme != null ? aweme.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiReviewEntrance(title=");
            sbLIZ.append(this.title);
            sbLIZ.append(", content=");
            sbLIZ.append(this.content);
            sbLIZ.append(", sourceTag=");
            sbLIZ.append(this.sourceTag);
            sbLIZ.append(", type=");
            sbLIZ.append(this.type);
            sbLIZ.append(", user=");
            sbLIZ.append(this.user);
            sbLIZ.append(", extraInfo=");
            sbLIZ.append(this.extraInfo);
            sbLIZ.append(", aweme=");
            sbLIZ.append(this.aweme);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiReviewEntrance(LsRichText lsRichText, LsRichText lsRichText2, LsRichText lsRichText3, Integer num, PoiReviewUserModel poiReviewUserModel, String str, Aweme aweme) {
            this.title = lsRichText;
            this.content = lsRichText2;
            this.sourceTag = lsRichText3;
            this.type = num;
            this.user = poiReviewUserModel;
            this.extraInfo = str;
            this.aweme = aweme;
        }
    }

    public static final class PoiReviewUserLevelPanelInfo implements Serializable {

        @C09CT("cta_schema")
        public final String ctaSchema;

        @C09CT("cta_text")
        public final String ctaText;

        @C09CT("level_guidance")
        public final String levelGuidance;

        @C09CT("level_guide_desc")
        public final String levelGuideDesc;

        @C09CT("level_rights")
        public final List<PoiReviewUserLevelRightModel> levelRights;

        @C09CT("user_level_info")
        public final PoiReviewUserLevelInfoModel userLevelInfo;

        @C09CT("write_review_guidance")
        public final String writeReviewGuidance;

        public PoiReviewUserLevelPanelInfo() {
            this(null, null, null, null, null, null, null);
        }

        public PoiReviewUserLevelPanelInfo(PoiReviewUserLevelInfoModel poiReviewUserLevelInfoModel, List<PoiReviewUserLevelRightModel> list, String str, String str2, String str3, String str4, String str5) {
            this.userLevelInfo = poiReviewUserLevelInfoModel;
            this.levelRights = list;
            this.levelGuideDesc = str;
            this.ctaText = str2;
            this.ctaSchema = str3;
            this.levelGuidance = str4;
            this.writeReviewGuidance = str5;
        }
    }

    public static final class PoiReviewEligibleResponse extends BaseResponse {

        @C09CT("collect_info")
        public final String collectInfo;

        @C09CT("eligible")
        public final Boolean eligible;

        @C09CT("eligible_extra_info_str")
        public final String eligibleExtraInfo;

        @C09CT("has_video_posted")
        public final Boolean hasVideoPosted;

        @C09CT("poi_eligible")
        public final Boolean poiEligible;

        @C09CT("poi_name")
        public final String poiName;

        @C09CT("post_frequency_control")
        public final Boolean postFrequencyControl;

        @C09CT("post_review_entrance")
        public final PoiReviewEntrance postReviewEntrance;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewEligibleResponse)) {
                return false;
            }
            PoiReviewEligibleResponse poiReviewEligibleResponse = (PoiReviewEligibleResponse) obj;
            return Intrinsics.LJFF(this.eligible, poiReviewEligibleResponse.eligible) && Intrinsics.LJFF(this.poiName, poiReviewEligibleResponse.poiName) && Intrinsics.LJFF(this.collectInfo, poiReviewEligibleResponse.collectInfo) && Intrinsics.LJFF(this.eligibleExtraInfo, poiReviewEligibleResponse.eligibleExtraInfo) && Intrinsics.LJFF(this.hasVideoPosted, poiReviewEligibleResponse.hasVideoPosted) && Intrinsics.LJFF(this.postReviewEntrance, poiReviewEligibleResponse.postReviewEntrance) && Intrinsics.LJFF(this.poiEligible, poiReviewEligibleResponse.poiEligible) && Intrinsics.LJFF(this.postFrequencyControl, poiReviewEligibleResponse.postFrequencyControl);
        }

        public final int hashCode() {
            Boolean bool = this.eligible;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.poiName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.collectInfo;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.eligibleExtraInfo;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool2 = this.hasVideoPosted;
            int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            PoiReviewEntrance poiReviewEntrance = this.postReviewEntrance;
            int iHashCode6 = (iHashCode5 + (poiReviewEntrance == null ? 0 : poiReviewEntrance.hashCode())) * 31;
            Boolean bool3 = this.poiEligible;
            int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.postFrequencyControl;
            return iHashCode7 + (bool4 != null ? bool4.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PoiReviewEligibleResponse(eligible=");
            sbLIZ.append(this.eligible);
            sbLIZ.append(", poiName=");
            sbLIZ.append(this.poiName);
            sbLIZ.append(", collectInfo=");
            sbLIZ.append(this.collectInfo);
            sbLIZ.append(", eligibleExtraInfo=");
            sbLIZ.append(this.eligibleExtraInfo);
            sbLIZ.append(", hasVideoPosted=");
            sbLIZ.append(this.hasVideoPosted);
            sbLIZ.append(", postReviewEntrance=");
            sbLIZ.append(this.postReviewEntrance);
            sbLIZ.append(", poiEligible=");
            sbLIZ.append(this.poiEligible);
            sbLIZ.append(", postFrequencyControl=");
            sbLIZ.append(this.postFrequencyControl);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PoiReviewEligibleResponse(Boolean bool, String str, String str2, String str3, Boolean bool2, PoiReviewEntrance poiReviewEntrance, Boolean bool3, Boolean bool4) {
            this.eligible = bool;
            this.poiName = str;
            this.collectInfo = str2;
            this.eligibleExtraInfo = str3;
            this.hasVideoPosted = bool2;
            this.postReviewEntrance = poiReviewEntrance;
            this.poiEligible = bool3;
            this.postFrequencyControl = bool4;
        }
    }

    public static final class PoiReviewUserModel implements Serializable {

        @C09CT("avatar_168")
        public final UrlModel avatar168;

        @C09CT("avatar_300")
        public final UrlModel avatar300;

        @C09CT("avatar_larger")
        public final UrlModel avatarLarger;

        @C09CT("avatar_medium")
        public final UrlModel avatarMedium;

        @C09CT("avatar_thumb")
        public final UrlModel avatarThumb;

        @C09CT("external_url")
        public final String externalUrl;

        @C09CT("nickname")
        public final String nickname;

        @C09CT("redirect_review_center")
        public final Boolean redirectReviewCenter;

        @C09CT("review_user_source")
        public final String reviewUserSource;

        @C09CT("unique_id")
        public final String uniqueId;

        @C09CT("user_id")
        public final String userId;

        @C09CT("user_level_info")
        public final PoiReviewUserLevelInfoModel userLevelInfo;

        @C09CT("user_review_profile_frame")
        public final PoiUserReviewModel userReviewProfileFrame;

        public PoiReviewUserModel() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewUserModel)) {
                return false;
            }
            PoiReviewUserModel poiReviewUserModel = (PoiReviewUserModel) obj;
            return Intrinsics.LJFF(this.userId, poiReviewUserModel.userId) && Intrinsics.LJFF(this.nickname, poiReviewUserModel.nickname) && Intrinsics.LJFF(this.uniqueId, poiReviewUserModel.uniqueId) && Intrinsics.LJFF(this.avatarThumb, poiReviewUserModel.avatarThumb) && Intrinsics.LJFF(this.avatarMedium, poiReviewUserModel.avatarMedium) && Intrinsics.LJFF(this.avatarLarger, poiReviewUserModel.avatarLarger) && Intrinsics.LJFF(this.avatar168, poiReviewUserModel.avatar168) && Intrinsics.LJFF(this.avatar300, poiReviewUserModel.avatar300) && Intrinsics.LJFF(this.reviewUserSource, poiReviewUserModel.reviewUserSource) && Intrinsics.LJFF(this.userReviewProfileFrame, poiReviewUserModel.userReviewProfileFrame) && Intrinsics.LJFF(this.redirectReviewCenter, poiReviewUserModel.redirectReviewCenter) && Intrinsics.LJFF(this.userLevelInfo, poiReviewUserModel.userLevelInfo) && Intrinsics.LJFF(this.externalUrl, poiReviewUserModel.externalUrl);
        }

        public int hashCode() {
            String str = this.userId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.nickname;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.uniqueId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            UrlModel urlModel = this.avatarThumb;
            int iHashCode4 = (iHashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
            UrlModel urlModel2 = this.avatarMedium;
            int iHashCode5 = (iHashCode4 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
            UrlModel urlModel3 = this.avatarLarger;
            int iHashCode6 = (iHashCode5 + (urlModel3 == null ? 0 : urlModel3.hashCode())) * 31;
            UrlModel urlModel4 = this.avatar168;
            int iHashCode7 = (iHashCode6 + (urlModel4 == null ? 0 : urlModel4.hashCode())) * 31;
            UrlModel urlModel5 = this.avatar300;
            int iHashCode8 = (iHashCode7 + (urlModel5 == null ? 0 : urlModel5.hashCode())) * 31;
            String str4 = this.reviewUserSource;
            int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            PoiUserReviewModel poiUserReviewModel = this.userReviewProfileFrame;
            int iHashCode10 = (iHashCode9 + (poiUserReviewModel == null ? 0 : poiUserReviewModel.hashCode())) * 31;
            Boolean bool = this.redirectReviewCenter;
            int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
            PoiReviewUserLevelInfoModel poiReviewUserLevelInfoModel = this.userLevelInfo;
            int iHashCode12 = (iHashCode11 + (poiReviewUserLevelInfoModel == null ? 0 : poiReviewUserLevelInfoModel.hashCode())) * 31;
            String str5 = this.externalUrl;
            return iHashCode12 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "PoiReviewUserModel(userId=" + this.userId + ", nickname=" + this.nickname + ", uniqueId=" + this.uniqueId + ", avatarThumb=" + this.avatarThumb + ", avatarMedium=" + this.avatarMedium + ", avatarLarger=" + this.avatarLarger + ", avatar168=" + this.avatar168 + ", avatar300=" + this.avatar300 + ", reviewUserSource=" + this.reviewUserSource + ", userReviewProfileFrame=" + this.userReviewProfileFrame + ", redirectReviewCenter=" + this.redirectReviewCenter + ", userLevelInfo=" + this.userLevelInfo + ", externalUrl=" + this.externalUrl + ')';
        }

        public PoiReviewUserModel(String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, UrlModel urlModel5, String str4, PoiUserReviewModel poiUserReviewModel, Boolean bool, PoiReviewUserLevelInfoModel poiReviewUserLevelInfoModel, String str5) {
            this.userId = str;
            this.nickname = str2;
            this.uniqueId = str3;
            this.avatarThumb = urlModel;
            this.avatarMedium = urlModel2;
            this.avatarLarger = urlModel3;
            this.avatar168 = urlModel4;
            this.avatar300 = urlModel5;
            this.reviewUserSource = str4;
            this.userReviewProfileFrame = poiUserReviewModel;
            this.redirectReviewCenter = bool;
            this.userLevelInfo = poiReviewUserLevelInfoModel;
            this.externalUrl = str5;
        }
    }

    public static final class PoiReviewSummaryModel implements Serializable {

        @C09CT("brand_logo")
        public final UrlModel brandLogo;

        @C09CT("brand_display_text")
        public final String brandName;

        @C09CT("dark_mode_brand_logo")
        public final UrlModel darkModeBrandLogo;

        @C09CT("display_type")
        public final int displayType;

        @C09CT("eligible_extra_info_str")
        public final String eligibleExtraInfo;

        @C09CT("external_url")
        public final String externalUrl;

        @C09CT("max_score")
        public final Double maxScore;

        @C09CT("no_rating")
        public final Boolean noRating;

        @C09CT("review_summary_authors")
        public final List<PoiReviewUserModel> reviewSummaryAuthors;

        @C09CT("score")
        public final Double score;

        @C09CT("score_breakdown")
        public final List<PoiReviewScoreModel> scoreBreakdown;

        @C09CT("score_range_display")
        public final String scoreRangeDisplay;

        @C09CT("review_source")
        public final Integer source;

        @C09CT("total_count")
        public final Long totalCount;

        @C09CT("total_count_display")
        public final String totalCountDisplay;

        @C09CT("track_info")
        public final String trackInfo;

        public PoiReviewSummaryModel() {
            this(null, null, null, null, null, null, null, null, null, null, EnumC1156320gCE.POI_REVIEW_SUMMARY_DISPLAY_TYPE_UNKNOWN.getValue(), null, null, null, null, null);
        }

        public final PoiReviewSummaryModel copy(Long l, Double d, Double d2, List<PoiReviewScoreModel> list, Integer num, String str, String str2, UrlModel urlModel, UrlModel urlModel2, String str3, int i, String str4, Boolean bool, List<PoiReviewUserModel> list2, String str5, String str6) {
            return new PoiReviewSummaryModel(l, d, d2, list, num, str, str2, urlModel, urlModel2, str3, i, str4, bool, list2, str5, str6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReviewSummaryModel)) {
                return false;
            }
            PoiReviewSummaryModel poiReviewSummaryModel = (PoiReviewSummaryModel) obj;
            return Intrinsics.LJFF(this.totalCount, poiReviewSummaryModel.totalCount) && Intrinsics.LJFF(this.score, poiReviewSummaryModel.score) && Intrinsics.LJFF(this.maxScore, poiReviewSummaryModel.maxScore) && Intrinsics.LJFF(this.scoreBreakdown, poiReviewSummaryModel.scoreBreakdown) && Intrinsics.LJFF(this.source, poiReviewSummaryModel.source) && Intrinsics.LJFF(this.brandName, poiReviewSummaryModel.brandName) && Intrinsics.LJFF(this.externalUrl, poiReviewSummaryModel.externalUrl) && Intrinsics.LJFF(this.brandLogo, poiReviewSummaryModel.brandLogo) && Intrinsics.LJFF(this.darkModeBrandLogo, poiReviewSummaryModel.darkModeBrandLogo) && Intrinsics.LJFF(this.trackInfo, poiReviewSummaryModel.trackInfo) && this.displayType == poiReviewSummaryModel.displayType && Intrinsics.LJFF(this.eligibleExtraInfo, poiReviewSummaryModel.eligibleExtraInfo) && Intrinsics.LJFF(this.noRating, poiReviewSummaryModel.noRating) && Intrinsics.LJFF(this.reviewSummaryAuthors, poiReviewSummaryModel.reviewSummaryAuthors) && Intrinsics.LJFF(this.totalCountDisplay, poiReviewSummaryModel.totalCountDisplay) && Intrinsics.LJFF(this.scoreRangeDisplay, poiReviewSummaryModel.scoreRangeDisplay);
        }

        public int hashCode() {
            Long l = this.totalCount;
            int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
            Double d = this.score;
            int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
            Double d2 = this.maxScore;
            int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
            List<PoiReviewScoreModel> list = this.scoreBreakdown;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.source;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.brandName;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.externalUrl;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            UrlModel urlModel = this.brandLogo;
            int iHashCode8 = (iHashCode7 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
            UrlModel urlModel2 = this.darkModeBrandLogo;
            int iHashCode9 = (iHashCode8 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
            String str3 = this.trackInfo;
            int iHashCode10 = (((iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.displayType) * 31;
            String str4 = this.eligibleExtraInfo;
            int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.noRating;
            int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
            List<PoiReviewUserModel> list2 = this.reviewSummaryAuthors;
            int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str5 = this.totalCountDisplay;
            int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.scoreRangeDisplay;
            return iHashCode14 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "PoiReviewSummaryModel(totalCount=" + this.totalCount + ", score=" + this.score + ", maxScore=" + this.maxScore + ", scoreBreakdown=" + this.scoreBreakdown + ", source=" + this.source + ", brandName=" + this.brandName + ", externalUrl=" + this.externalUrl + ", brandLogo=" + this.brandLogo + ", darkModeBrandLogo=" + this.darkModeBrandLogo + ", trackInfo=" + this.trackInfo + ", displayType=" + this.displayType + ", eligibleExtraInfo=" + this.eligibleExtraInfo + ", noRating=" + this.noRating + ", reviewSummaryAuthors=" + this.reviewSummaryAuthors + ", totalCountDisplay=" + this.totalCountDisplay + ", scoreRangeDisplay=" + this.scoreRangeDisplay + ')';
        }

        public PoiReviewSummaryModel(Long l, Double d, Double d2, List<PoiReviewScoreModel> list, Integer num, String str, String str2, UrlModel urlModel, UrlModel urlModel2, String str3, int i, String str4, Boolean bool, List<PoiReviewUserModel> list2, String str5, String str6) {
            this.totalCount = l;
            this.score = d;
            this.maxScore = d2;
            this.scoreBreakdown = list;
            this.source = num;
            this.brandName = str;
            this.externalUrl = str2;
            this.brandLogo = urlModel;
            this.darkModeBrandLogo = urlModel2;
            this.trackInfo = str3;
            this.displayType = i;
            this.eligibleExtraInfo = str4;
            this.noRating = bool;
            this.reviewSummaryAuthors = list2;
            this.totalCountDisplay = str5;
            this.scoreRangeDisplay = str6;
        }
    }
}
