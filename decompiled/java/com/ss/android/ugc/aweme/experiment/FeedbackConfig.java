package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes26.dex */
public final class FeedbackConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("cache_version")
    public final int cacheVersion;

    @C09CT("enable_cache")
    public final boolean enableCache;

    @C09CT("enable_native_opt")
    public final boolean enableOpt;

    @C09CT("enable_topic_list_search")
    public final boolean enableTopicListSearch;

    @C09CT("faq_detail")
    public final String faqDetail;

    @C09CT("max_cache_day")
    public final float maxCacheDay;

    @C09CT("rap_button_default_config")
    public final RapButtonConfig rapButtonDefaultConfig;

    @C09CT("search")
    public final String search;

    @C09CT("search_form_topiclist")
    public final String searchFormTopiclist;

    @C09CT("session_list")
    public final String sessionList;

    public FeedbackConfig() {
        this(false, "https://feedback.tiktokv.com/feedback/offline/session_list?hide_nav_bar=1&container_color_auto_dark=1&use_spark=1&trans_status_bar=1&_pia_=1&enter_from=rap_main_na&entrance=rap_main&version=1.0.0&disable_ttnet_proxy=0&bdhm_bid=csp_im_inapp_hybrid", "https://feedback.tiktokv.com/feedback/offline/faq_detail?hide_nav_bar=1&container_color_auto_dark=1&use_spark=1&trans_status_bar=1&_pia_=1&enter_from=rap_main_na&entrance=rap_main&version=1.0.0&disable_ttnet_proxy=0&bdhm_bid=csp_im_inapp_hybrid", "https://feedback.tiktokv.com/feedback/offline/search?hide_nav_bar=1&container_color_auto_dark=1&use_spark=1&trans_status_bar=1&_pia_=1&enter_from=rap_main_na&entrance=rap_main&version=1.0.0&disable_ttnet_proxy=0&bdhm_bid=csp_im_inapp_hybrid", "https://feedback.tiktokv.com/feedback/offline/search?hide_nav_bar=1&container_color_auto_dark=1&use_spark=1&trans_status_bar=1&_pia_=1&version=1.0.0&disable_ttnet_proxy=0&bdhm_bid=csp_im_inapp_hybrid", false, true, 1, 1.0f, new RapButtonConfig("", "", "Chat with us", "aweme://webview?url=https%3A%2F%2Ffeedback.tiktokv.com%2Ffeedback%2Fim%2Fchat%3Fdisable_ttnet_proxy%3D0%26trans_status_bar%3D1%26hide_nav_bar%3D1%26use_spark%3D1%26container_color_auto_dark%3D1%26_pia_%3D1%26version%3D1.0.0%26bdhm_bid%3Dcsp_im_inapp_hybrid%26is_bot%3Dtrue%26entrance%3Drap_main_na%26enter_from%3Drap_main_na", "sticky"));
    }

    public FeedbackConfig(boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3, int i, float f, RapButtonConfig rapButtonConfig) {
        this.enableOpt = z;
        this.sessionList = str;
        this.faqDetail = str2;
        this.search = str3;
        this.searchFormTopiclist = str4;
        this.enableTopicListSearch = z2;
        this.enableCache = z3;
        this.cacheVersion = i;
        this.maxCacheDay = f;
        this.rapButtonDefaultConfig = rapButtonConfig;
    }
}
