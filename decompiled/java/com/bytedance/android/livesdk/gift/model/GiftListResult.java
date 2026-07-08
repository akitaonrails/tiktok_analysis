package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.Gift;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class GiftListResult {

    @C09CT("beacon_bubble_priorities")
    public Map<Long, Long> beaconBubblePriorities;

    @C09CT("doodle_templates")
    public List<DoodleTemplate> doodleTemplates;

    @C09CT("dynamic_restriction")
    public DynamicRestriction dynamicRestriction;

    @C09CT("exclusive_recommend_infos")
    public Map<Long, GiftRecommendInfo> exclusiveRecommendInfos;

    @C09CT("gift_configs")
    public GiftConfigs giftConfigs;

    @C09CT("gift_label_priorities")
    public Map<Long, Long> giftLabelPriorities;

    @C09CT("gifts")
    public List<Gift> giftList;

    @C09CT("gift_name_group_map")
    public Map<Long, String> giftNameGroupMap;

    @C09CT("pages")
    public List<GiftPage> giftPages;

    @C09CT("gift_resource_group_map")
    public Map<Long, String> giftResourceGroupMap;

    @C09CT("gifts_info")
    public GiftsInfo giftsInfo;

    @C09CT("hot_fields")
    public List<String> hotFields;

    @C09CT("is_full_gift_data")
    public boolean isFullGiftData;

    @C09CT("panel_refresh_data")
    public PanelRefreshData panelRefreshData;

    @C09CT("pannel_refresh")
    public int refreshStatus;

    @C09CT("hash")
    public String responseHash;

    @C09CT("strategy_data")
    public GiftStrategyData strategyData;

    @C09CT("tags")
    public List<Integer> tags;

    @C09CT("strategy_token")
    public String strategyToken = "";

    @C09CT("realtime_server_passthrough")
    public String realtimeServerPassthrough = "";

    @C09CT("cold_gift_hash")
    public String coldGiftHash = "";
}
