package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BattleBonusConfig {

    @C09CT("preview_start_time")
    public long previewStartTime;

    @C09CT("preview_start_timestamp")
    public long previewStartTimestamp;

    @C09CT("reward_config")
    public RewardPeriodConfig rewardPeriodConfig;

    @C09CT("target_config")
    public TaskPeriodConfig taskPeriodConfig;

    @C09CT("preview_config")
    public List<PreviewPeriod> previewPeriodConfig = new ArrayList();

    @C09CT("gift_amount_guide")
    public Map<Long, BattleTaskGiftAmountGuide> taskGiftGuide = new LinkedHashMap();

    @C09CT("preview_click_action_schema_url")
    public String previewClickActionSchemaUrl = "";
}
