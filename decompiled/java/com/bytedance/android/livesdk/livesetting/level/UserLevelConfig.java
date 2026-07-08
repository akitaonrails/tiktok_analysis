package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class UserLevelConfig {
    public static final TypeAdapter ADAPTER = new UserLevelConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_native_gecko_enter_room_res_config")
    public List<BarrageEnterRoomResConfig> barrageEnterRoomConfigList;

    @C09CT("live_native_gecko_source_config")
    public List<BarrageGradeResConfig> barrageResConfigList;

    @C09CT("fe_gecko_upgrade_animation_source_config")
    public List<FeResourceChannelConfig> feGeckoAnimationSourceConfigList;

    @C09CT("live_native_avatar_source_config")
    public List<GiftPanelAnimatorConfig> giftPanelAnimatorConfig;

    @C09CT("lynx_urls")
    public Map<String, String> revenueUserLevelLynxUrls;

    @C09CT("user_level_dynamic_config")
    public UserLevelDynamicConfig userLevelDynamicConfig;

    public UserLevelConfig() {
        this(null, null, null, null, null, null);
    }

    public UserLevelConfig(List<BarrageGradeResConfig> list, List<BarrageEnterRoomResConfig> list2, UserLevelDynamicConfig userLevelDynamicConfig, List<GiftPanelAnimatorConfig> list3, List<FeResourceChannelConfig> list4, Map<String, String> map) {
        this.barrageResConfigList = list;
        this.barrageEnterRoomConfigList = list2;
        this.userLevelDynamicConfig = userLevelDynamicConfig;
        this.giftPanelAnimatorConfig = list3;
        this.feGeckoAnimationSourceConfigList = list4;
        this.revenueUserLevelLynxUrls = map;
    }
}
