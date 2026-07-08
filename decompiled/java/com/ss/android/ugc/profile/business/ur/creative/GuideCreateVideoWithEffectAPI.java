package com.ss.android.ugc.profile.business.ur.creative;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501350pAj;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class GuideCreateVideoWithEffectAPI {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2192));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2191));

    public interface API {
        @InterfaceC1501160pAQ("/tiktok/v1/inspiration/profile_banner/card_list")
        Object cardList(@InterfaceC1501350pAj("tt-effect-sdk-version") String str, @InterfaceC1501130pAN Map<String, String> map, InterfaceC1364105Vn<? super CardListResponse> interfaceC1364105Vn);
    }

    public static final class ResponseExtra {

        @C09CT("logid")
        public final String logid;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResponseExtra) && Intrinsics.LJFF(this.logid, ((ResponseExtra) obj).logid);
        }

        public final int hashCode() {
            String str = this.logid;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ResponseExtra(logid=");
            sbLIZ.append(this.logid);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ResponseExtra(String str) {
            this.logid = str;
        }
    }

    public static final class CardListResponse {

        @C09CT("cache_expiry_timestamp")
        public final Long cacheExpiryTimestamp;

        @C09CT("card_list")
        public final List<CardItem> cardList;

        @C09CT("extra")
        public final ResponseExtra extra;

        @C09CT("inspiration_reco_id")
        public final String inspirationRecoId;

        @C09CT("must_next_max_pull_refresh")
        public final Integer mustNextMaxPullRefresh;

        @C09CT("must_next_max_switch_tab")
        public final Integer mustNextMaxSwitchTab;

        public CardListResponse() {
            this(null, 0L, 0, 0, "", null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardListResponse)) {
                return false;
            }
            CardListResponse cardListResponse = (CardListResponse) obj;
            return Intrinsics.LJFF(this.cardList, cardListResponse.cardList) && Intrinsics.LJFF(this.cacheExpiryTimestamp, cardListResponse.cacheExpiryTimestamp) && Intrinsics.LJFF(this.mustNextMaxPullRefresh, cardListResponse.mustNextMaxPullRefresh) && Intrinsics.LJFF(this.mustNextMaxSwitchTab, cardListResponse.mustNextMaxSwitchTab) && Intrinsics.LJFF(this.inspirationRecoId, cardListResponse.inspirationRecoId) && Intrinsics.LJFF(this.extra, cardListResponse.extra);
        }

        public final int hashCode() {
            List<CardItem> list = this.cardList;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            Long l = this.cacheExpiryTimestamp;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            Integer num = this.mustNextMaxPullRefresh;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.mustNextMaxSwitchTab;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.inspirationRecoId;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            ResponseExtra responseExtra = this.extra;
            return iHashCode5 + (responseExtra != null ? responseExtra.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CardListResponse(cardList=");
            sbLIZ.append(this.cardList);
            sbLIZ.append(", cacheExpiryTimestamp=");
            sbLIZ.append(this.cacheExpiryTimestamp);
            sbLIZ.append(", mustNextMaxPullRefresh=");
            sbLIZ.append(this.mustNextMaxPullRefresh);
            sbLIZ.append(", mustNextMaxSwitchTab=");
            sbLIZ.append(this.mustNextMaxSwitchTab);
            sbLIZ.append(", inspirationRecoId=");
            sbLIZ.append(this.inspirationRecoId);
            sbLIZ.append(", extra=");
            sbLIZ.append(this.extra);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CardListResponse(List<CardItem> list, Long l, Integer num, Integer num2, String str, ResponseExtra responseExtra) {
            this.cardList = list;
            this.cacheExpiryTimestamp = l;
            this.mustNextMaxPullRefresh = num;
            this.mustNextMaxSwitchTab = num2;
            this.inspirationRecoId = str;
            this.extra = responseExtra;
        }
    }

    /* JADX INFO: loaded from: classes30.dex */
    public static final class CardItem {

        @C09CT("activity_name")
        public final String activityName;

        @C09CT("business_info")
        public final String businessInfo;

        @C09CT("button_text")
        public final String buttonText;

        @C09CT("cover_url")
        public final String coverUrl;

        @C09CT("debug_info_json")
        public final String debugInfoJson;

        @C09CT("description")
        public final String description;

        @C09CT("primary_scene")
        public final String primaryScene;

        @C09CT("scenes")
        public final List<String> scenes;

        @C09CT("search_extra")
        public final String searchExtra;

        @C09CT("search_topic_id")
        public final String searchTopicId;

        @C09CT("title")
        public final String title;

        @C09CT("topic_type")
        public final Integer topicType;

        public CardItem() {
            this("", "", "", "", "", null, null, null, null, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardItem)) {
                return false;
            }
            CardItem cardItem = (CardItem) obj;
            return Intrinsics.LJFF(this.searchTopicId, cardItem.searchTopicId) && Intrinsics.LJFF(this.title, cardItem.title) && Intrinsics.LJFF(this.description, cardItem.description) && Intrinsics.LJFF(this.buttonText, cardItem.buttonText) && Intrinsics.LJFF(this.primaryScene, cardItem.primaryScene) && Intrinsics.LJFF(this.scenes, cardItem.scenes) && Intrinsics.LJFF(this.topicType, cardItem.topicType) && Intrinsics.LJFF(this.activityName, cardItem.activityName) && Intrinsics.LJFF(this.coverUrl, cardItem.coverUrl) && Intrinsics.LJFF(this.businessInfo, cardItem.businessInfo) && Intrinsics.LJFF(this.searchExtra, cardItem.searchExtra) && Intrinsics.LJFF(this.debugInfoJson, cardItem.debugInfoJson);
        }

        public final int hashCode() {
            String str = this.searchTopicId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.description;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buttonText;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.primaryScene;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            List<String> list = this.scenes;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.topicType;
            int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            String str6 = this.activityName;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.coverUrl;
            int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.businessInfo;
            int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.searchExtra;
            int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.debugInfoJson;
            return iHashCode11 + (str10 != null ? str10.hashCode() : 0);
        }

        public final String toString() {
            return "CardItem(searchTopicId=" + this.searchTopicId + ", title=" + this.title + ", description=" + this.description + ", buttonText=" + this.buttonText + ", primaryScene=" + this.primaryScene + ", scenes=" + this.scenes + ", topicType=" + this.topicType + ", activityName=" + this.activityName + ", coverUrl=" + this.coverUrl + ", businessInfo=" + this.businessInfo + ", searchExtra=" + this.searchExtra + ", debugInfoJson=" + this.debugInfoJson + ')';
        }

        public CardItem(String str, String str2, String str3, String str4, String str5, List<String> list, Integer num, String str6, String str7, String str8, String str9, String str10) {
            this.searchTopicId = str;
            this.title = str2;
            this.description = str3;
            this.buttonText = str4;
            this.primaryScene = str5;
            this.scenes = list;
            this.topicType = num;
            this.activityName = str6;
            this.coverUrl = str7;
            this.businessInfo = str8;
            this.searchExtra = str9;
            this.debugInfoJson = str10;
        }
    }
}
