package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class FcpTooltipConfig {

    @C09CT("tooltip_bind_configs")
    public final List<TooltipBindConfig> tooltipBindConfigs;

    @C09CT("tooltip_entity_configs")
    public final List<TooltipEntityConfig> tooltipEntityConfigs;

    @C09CT("tooltip_rule_config")
    public final TooltipRuleConfig tooltipRuleConfig;

    public FcpTooltipConfig() {
        this(null, null, null, 7, null);
    }

    public FcpTooltipConfig(TooltipRuleConfig tooltipRuleConfig, List<TooltipBindConfig> list, List<TooltipEntityConfig> list2) {
        this.tooltipRuleConfig = tooltipRuleConfig;
        this.tooltipBindConfigs = list;
        this.tooltipEntityConfigs = list2;
    }

    public FcpTooltipConfig(TooltipRuleConfig tooltipRuleConfig, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tooltipRuleConfig, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
