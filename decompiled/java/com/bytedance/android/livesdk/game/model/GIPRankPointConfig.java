package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GIPRankPointConfig {

    @C09CT("custom_point_config")
    public GIPRankCustomPointConfig customPointConfig;

    @C09CT("indicator_point_configs")
    public List<IndicatorPointConfig> indicatorPointConfigs = new ArrayList();

    @C09CT("rule_type")
    public int ruleType;
}
