package com.ss.android.ugc.aweme.lemon8;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class Lemon8AnchorConfig {

    @C09CT("lemon8_campaign_deeplink")
    public final Lemon8CampaignDeeplink campaignDeeplink;

    @C09CT("lemon8_campaign_pid_map")
    public final Map<String, String> campaignPidMap;

    @C09CT("lemon8_general_pid_map")
    public final Map<String, String> generalPidMap;

    public Lemon8AnchorConfig() {
        this(null, null, null, 7, null);
    }

    public Lemon8AnchorConfig(Map<String, String> map, Map<String, String> map2, Lemon8CampaignDeeplink lemon8CampaignDeeplink) {
        this.campaignPidMap = map;
        this.generalPidMap = map2;
        this.campaignDeeplink = lemon8CampaignDeeplink;
    }

    public Lemon8AnchorConfig(Map map, Map map2, Lemon8CampaignDeeplink lemon8CampaignDeeplink, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("skintest2022", "skintest2022_TikTok"), new Pair("FacialAnalysis", "FacialAnalysis_TikTok"), new Pair("bodyshapetest", "bodyshapetest_TikTok"), new Pair("aiportrait", "aiportrait_TikTok")) : map, (i & 2) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("lemon8_general_sdk_share", "tiktok_lemon8"), new Pair("lemon8_general_pick", "tiktok_lemon8"), new Pair("lemon8_general_create_post", "tiktok_create")) : map2, (i & 4) != 0 ? new Lemon8CampaignDeeplink("campaign", "") : lemon8CampaignDeeplink);
    }
}
