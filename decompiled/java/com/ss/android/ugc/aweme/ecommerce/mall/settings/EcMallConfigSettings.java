package com.ss.android.ugc.aweme.ecommerce.mall.settings;

import X.C09CT;
import X.C2188811AlT;
import X.C2341109Fh;
import X.InterfaceC1294060jmO;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMallConfigSettings {
    public static final EcMallConfigSettings INSTANCE = new EcMallConfigSettings();
    public static final EcMallConfigModel DEFAULT_GROUP = new EcMallConfigModel("sslocal://lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_mall%2Fpages%2Frecommend.js&use_spark=1&__live_platform__=webcast&thread_strategy=2&business_from=ecom&target_handler=webcast", "sslocal://lynxview?use_new_container=1&url=https%3A%2F%2Flf21-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_mall%2Fpages%2Foperation.js&use_spark=1&__live_platform__=webcast&trans_status_bar=1&hide_nav_bar=1&previous_page=mall&enter_from=mall&business_from=ecom&target_handler=webcast", false, false, false, Boolean.TRUE, "sslocal://lynxview?use_new_container=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_ttmall%2Fpages%2Fhome.js&use_spark=1&__live_platform__=webcast&trans_status_bar=1&hide_nav_bar=1&previous_page=mall&enter_from=mall&business_from=ecom&target_handler=webcast", "", "sslocal://lynxview?use_new_container=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_ttmall_v3%2Fpages%2Fhome.js&use_spark=1&__live_platform__=webcast&trans_status_bar=1&hide_nav_bar=1&previous_page=mall&enter_from=mall&business_from=ecom&target_handler=webcast&enable_code_cache=1&ab_params=ec_mall_card_hypothesis_order,ttmall_feed_use_global_exposure,ec_mall_appear_directly,ec_mall_old_user_base_layout_height_type");

    @InterfaceC1294060jmO
    public static /* synthetic */ void getMARKETING_SCHEMA$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getRECOMMEND_SCHEMA$annotations() {
    }

    public static final EcMallConfigModel getValue() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcMallConfigModel ecMallConfigModel = DEFAULT_GROUP;
        EcMallConfigModel ecMallConfigModel2 = (EcMallConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ec_mall_config", EcMallConfigModel.class, ecMallConfigModel);
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("mall settings = " + ecMallConfigModel2);
        return ecMallConfigModel2 != null ? ecMallConfigModel2 : ecMallConfigModel;
    }

    public static final class EcMallConfigModel {

        @C09CT("enable_prefetch")
        public final boolean enablePrefetch;

        @C09CT("full_page_card_schema")
        public final String fullPageCardSchema;

        @C09CT("unity_card_schema")
        public final String homeSchema;

        @C09CT("marketing_card_schema")
        public final String marketingCardSchema;

        @C09CT("recommend_card_schema")
        public final String recommendCardSchema;

        @C09CT("use_unity_cache")
        public final Boolean useCache;

        @C09CT("use_marketing_cache")
        public final boolean useMarketingCache;

        @C09CT("use_recommend_cache")
        public final boolean useRecommendCache;

        @C09CT("recommend_video_scene")
        public final String videoScene;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EcMallConfigModel(recommendCardSchema=");
            sbLIZ.append(this.recommendCardSchema);
            sbLIZ.append(", marketingCardSchema=");
            sbLIZ.append(this.marketingCardSchema);
            sbLIZ.append(", enablePrefetch=");
            sbLIZ.append(this.enablePrefetch);
            sbLIZ.append(", useRecommendCache=");
            sbLIZ.append(this.useRecommendCache);
            sbLIZ.append(", useMarketingCache=");
            sbLIZ.append(this.useMarketingCache);
            sbLIZ.append(", useCache=");
            sbLIZ.append(this.useCache);
            sbLIZ.append(", homeSchema=");
            sbLIZ.append(this.homeSchema);
            sbLIZ.append(", videoScene=");
            sbLIZ.append(this.videoScene);
            sbLIZ.append(", fullPageCardSchema=");
            sbLIZ.append(this.fullPageCardSchema);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public EcMallConfigModel(String str, String str2, boolean z, boolean z2, boolean z3, Boolean bool, String str3, String str4, String str5) {
            this.recommendCardSchema = str;
            this.marketingCardSchema = str2;
            this.enablePrefetch = z;
            this.useRecommendCache = z2;
            this.useMarketingCache = z3;
            this.useCache = bool;
            this.homeSchema = str3;
            this.videoScene = str4;
            this.fullPageCardSchema = str5;
        }
    }
}
