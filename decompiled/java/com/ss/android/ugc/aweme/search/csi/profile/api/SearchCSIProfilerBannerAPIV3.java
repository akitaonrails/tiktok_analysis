package com.ss.android.ugc.aweme.search.csi.profile.api;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501350pAj;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.photomode.inspiration.InspirationTag;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class SearchCSIProfilerBannerAPIV3 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1766));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(535));

    public interface API {
        @InterfaceC1501160pAQ("/tiktok/v1/inspiration/profile_banner/list/v3")
        Object bannerListV3(@InterfaceC1501350pAj("tt-effect-sdk-version") String str, @InterfaceC1501130pAN Map<String, String> map, InterfaceC1364105Vn<? super BannerListResponseV3> interfaceC1364105Vn);
    }

    /* JADX INFO: loaded from: classes35.dex */
    public static final class BannerListResponseV3 {

        @C09CT("cache_expiry_timestamp")
        public final Long cacheExpiryTimestamp;

        @C09CT("extra")
        public final ResponseExtra extra;

        @C09CT("inspiration_reco_id")
        public final String inspirationRecoId;

        @C09CT("multi_banner_display_info")
        public final List<BannerItemV3> multiBannerDisplayInfo;

        @C09CT("must_next_max_pull_refresh")
        public final Integer mustNextMaxPullRefresh;

        @C09CT("must_next_max_switch_tab")
        public final Integer mustNextMaxSwitchTab;

        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<X.C19720512Dr> LIZ() {
            /*
                Method dump skipped, instruction units count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.csi.profile.api.SearchCSIProfilerBannerAPIV3.BannerListResponseV3.LIZ():java.util.List");
        }

        public BannerListResponseV3(Long l, Integer num, Integer num2, String str, List<BannerItemV3> list, ResponseExtra responseExtra) {
            this.cacheExpiryTimestamp = l;
            this.mustNextMaxPullRefresh = num;
            this.mustNextMaxSwitchTab = num2;
            this.inspirationRecoId = str;
            this.multiBannerDisplayInfo = list;
            this.extra = responseExtra;
        }
    }

    /* JADX INFO: loaded from: classes35.dex */
    public static final class ResponseExtra {

        @C09CT("logid")
        public final String logid;

        public ResponseExtra(String str) {
            this.logid = str;
        }
    }

    /* JADX INFO: loaded from: classes35.dex */
    public static final class BannerItemV3 {

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

        public static String LIZ(String str, String str2) {
            boolean z = true;
            if (a0.LJJIIZI(str, "search_extra=", true)) {
                return str;
            }
            if (str2 != null && str2.length() != 0) {
                z = false;
            }
            if (z) {
                return str;
            }
            try {
                str = UriProtector.parse(str).buildUpon().appendQueryParameter("search_extra", str2).build().toString();
                return str;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return str;
            }
        }

        public BannerItemV3(String str, String str2, String str3, String str4, String str5, String str6, UrlModel urlModel, Integer num, List<String> list, InspirationTag[] inspirationTagArr, String str7, String str8, String str9, String str10, String str11, Integer num2, String str12) {
            this.title = str;
            this.description = str2;
            this.uri = str3;
            this.bannerUri = str4;
            this.searchTopicId = str5;
            this.buttonText = str6;
            this.imageUrl = urlModel;
            this.topicType = num;
            this.scenes = list;
            this.inspirationTag = inspirationTagArr;
            this.coverUri = str7;
            this.activityName = str8;
            this.searchExtra = str9;
            this.primaryScene = str10;
            this.debugInfoJson = str11;
            this.iconType = num2;
            this.businessInfo = str12;
        }
    }
}
