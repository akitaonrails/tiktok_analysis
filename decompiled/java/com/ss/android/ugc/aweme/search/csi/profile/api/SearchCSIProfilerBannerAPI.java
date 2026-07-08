package com.ss.android.ugc.aweme.search.csi.profile.api;

import X.C01GW;
import X.C054G;
import X.C09A1;
import X.C09CT;
import X.C09U0;
import X.C13BV;
import X.C13LE;
import X.C1500770p9n;
import X.C1807670x8n;
import X.C19720512Dr;
import X.C2217381BqS;
import X.C2296808zG;
import X.C2296908zH;
import X.C23119094b;
import X.C23250099c;
import X.C2379209Ty;
import X.C452501pT;
import X.EnumC2193121AsQ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2217461Bqa;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.photomode.inspiration.InspirationInfo;
import com.ss.android.ugc.aweme.creative.model.photomode.inspiration.InspirationTag;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class SearchCSIProfilerBannerAPI {
    public static final SearchCSIProfilerBannerAPI LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C01GW LIZLLL;
    public static final C054G LJ;
    public volatile C09U0 LIZ;

    public interface API {
        @InterfaceC1501160pAQ("/tiktok/v1/inspiration/profile_banner/list")
        Object bannerList(@InterfaceC1501130pAN Map<String, String> map, InterfaceC1364105Vn<? super SearchCSIBannerResponse> interfaceC1364105Vn);

        @InterfaceC1501170pAR("/tiktok/v1/inspiration/profile_banner/action_report")
        Object impression(@InterfaceC1485405rg ImpressionRequest impressionRequest, InterfaceC1364105Vn<? super C1500770p9n<Unit>> interfaceC1364105Vn);
    }

    /* JADX INFO: loaded from: classes35.dex */
    public static final class SearchCSIBannerResponse {

        @C09CT("cache_expiry_timestamp")
        public final Long cacheExpiryTimestamp;

        @C09CT("freq_controled")
        public final Boolean freqControled;

        @C09CT("multi_banner_display_info")
        public final List<SearchCSIBannerItem> multiBannerDisplayInfo;

        @C09CT("must_next_max_pull_refresh")
        public final Integer mustNextMaxPullRefresh;

        @C09CT("must_next_max_switch_tab")
        public final Integer mustNextMaxSwitchTab;

        @C09CT("must_req_every_n")
        public final Integer mustReqEveryN;

        @C09CT("inspiration_reco_id")
        public final String recoId;

        public final List<C19720512Dr> LIZ() {
            C19720512Dr c19720512Dr;
            List<SearchCSIBannerItem> list = this.multiBannerDisplayInfo;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (SearchCSIBannerItem searchCSIBannerItem : list) {
                String str = this.recoId;
                String str2 = searchCSIBannerItem.uri;
                if (str2 == null || str2.length() == 0) {
                    c19720512Dr = null;
                } else {
                    String str3 = searchCSIBannerItem.title;
                    String str4 = searchCSIBannerItem.description;
                    String str5 = searchCSIBannerItem.uri;
                    String str6 = searchCSIBannerItem.bannerUri;
                    String str7 = searchCSIBannerItem.searchTopicId;
                    String str8 = searchCSIBannerItem.debugInfoJson;
                    UrlModel urlModel = searchCSIBannerItem.imageUrl;
                    String str9 = searchCSIBannerItem.buttonText;
                    List<String> list2 = searchCSIBannerItem.scenes;
                    Integer num = searchCSIBannerItem.topicType;
                    String str10 = searchCSIBannerItem.coverUri;
                    InspirationInfo inspirationInfo = new InspirationInfo(searchCSIBannerItem.description, searchCSIBannerItem.inspirationTag);
                    String str11 = searchCSIBannerItem.activityName;
                    String str12 = searchCSIBannerItem.searchExtra;
                    String str13 = searchCSIBannerItem.primaryScene;
                    Integer num2 = searchCSIBannerItem.iconType;
                    c19720512Dr = new C19720512Dr(str3, str4, str5, str6, str7, str8, urlModel, str9, str, list2, num, inspirationInfo, str10, 0L, str11, str12, str13, "", Integer.valueOf(num2 != null ? num2.intValue() : 1), searchCSIBannerItem.businessInfo);
                }
                if (c19720512Dr != null) {
                    arrayList.add(c19720512Dr);
                }
            }
            return arrayList;
        }

        public SearchCSIBannerResponse(Long l, Boolean bool, Integer num, Integer num2, Integer num3, String str, List<SearchCSIBannerItem> list) {
            this.cacheExpiryTimestamp = l;
            this.freqControled = bool;
            this.mustNextMaxPullRefresh = num;
            this.mustNextMaxSwitchTab = num2;
            this.mustReqEveryN = num3;
            this.recoId = str;
            this.multiBannerDisplayInfo = list;
        }
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchCSIProfilerBannerAPI.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        SearchCSIProfilerBannerAPI searchCSIProfilerBannerAPI = new SearchCSIProfilerBannerAPI();
        LIZIZ = searchCSIProfilerBannerAPI;
        LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(534));
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C09U0 c09u0 = searchCSIProfilerBannerAPI.LIZ;
        if (c09u0 == null) {
            synchronized (searchCSIProfilerBannerAPI) {
                c09u0 = searchCSIProfilerBannerAPI.LIZ;
                if (c09u0 == null) {
                    c09u0 = (C09U0) C1807670x8n.p();
                    searchCSIProfilerBannerAPI.LIZ = c09u0;
                }
            }
        }
        LJ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, c09u0.LIZ));
    }

    public static final class ImpressionRequest {

        @C09CT("action_type")
        public final int actionType;

        @C09CT("activity_name")
        public final String activityName;

        @C09CT("frame_version")
        public final String frameVersion;

        @C09CT("inspiration_id")
        public final String inspirationId;

        @C09CT("item_id")
        public final String itemId;

        @C09CT("position")
        public final String position;

        @C09CT("primary_scene")
        public final String primaryScene;

        @C09CT("topic_type")
        public final Integer topicType;

        public ImpressionRequest(String str, int i, String str2, String str3, Integer num, String str4, String str5, String str6) {
            this.inspirationId = str;
            this.actionType = i;
            this.itemId = str2;
            this.primaryScene = str3;
            this.topicType = num;
            this.activityName = str4;
            this.frameVersion = str5;
            this.position = str6;
        }
    }

    public static void LIZ(String str, EnumC2193121AsQ enumC2193121AsQ, String str2, String str3, Integer num, String str4, String str5, String str6) {
        if (str == null) {
            return;
        }
        C23250099c.LIZLLL(LJ, null, null, new C2379209Ty(str, enumC2193121AsQ, str2, str3, num, str4, str5, str6, null), 3);
    }

    /* JADX INFO: loaded from: classes35.dex */
    public static final class SearchCSIBannerItem {

        @C09CT("activity_name")
        public final String activityName;

        @C09CT("banner_uri")
        public final String bannerUri;

        @C09CT("business_info")
        public final String businessInfo;

        @C09CT("button_text")
        public final String buttonText;

        @C09CT("cover_uri")
        public final String coverUri;

        @C09CT("debug_info_json")
        public final String debugInfoJson;

        @C09CT("description")
        public final String description;

        @C09CT("icon_type")
        public final Integer iconType;

        @C09CT("top_image_post_cover")
        public final UrlModel imageUrl;

        @C09CT("inspiration_tag")
        public final InspirationTag[] inspirationTag;

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

        @C09CT("uri")
        public final String uri;

        public SearchCSIBannerItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, UrlModel urlModel, Integer num, List<String> list, InspirationTag[] inspirationTagArr, String str8, String str9, String str10, String str11, Integer num2, String str12) {
            this.debugInfoJson = str;
            this.title = str2;
            this.description = str3;
            this.uri = str4;
            this.bannerUri = str5;
            this.searchTopicId = str6;
            this.buttonText = str7;
            this.imageUrl = urlModel;
            this.topicType = num;
            this.scenes = list;
            this.inspirationTag = inspirationTagArr;
            this.coverUri = str8;
            this.activityName = str9;
            this.searchExtra = str10;
            this.primaryScene = str11;
            this.iconType = num2;
            this.businessInfo = str12;
        }

        public SearchCSIBannerItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, UrlModel urlModel, Integer num, List list, InspirationTag[] inspirationTagArr, String str8, String str9, String str10, String str11, Integer num2, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", urlModel, (i & 256) != 0 ? null : num, (i & 512) != 0 ? C13BV.INSTANCE : list, (i & 1024) == 0 ? inspirationTagArr : null, str8, str9, str10, str11, (i & 32768) != 0 ? 1 : num2, str12);
        }
    }
}
