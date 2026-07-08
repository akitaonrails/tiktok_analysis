package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FrequencyRule implements Serializable {

    @C09CT("biz_id")
    public final String bizId;

    @C09CT("exit_rule_config")
    public final FrequencyExitConfig exitRuleConfig;

    @C09CT("exit_rule_data")
    public final ExitRuleData exitRuleData;

    @C09CT("frequency_rule_config")
    public final FrequencyRuleConfig frequencyRuleConfig;

    public FrequencyRule() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyRule)) {
            return false;
        }
        FrequencyRule frequencyRule = (FrequencyRule) obj;
        return Intrinsics.LJFF(this.bizId, frequencyRule.bizId) && Intrinsics.LJFF(this.frequencyRuleConfig, frequencyRule.frequencyRuleConfig) && Intrinsics.LJFF(this.exitRuleConfig, frequencyRule.exitRuleConfig) && Intrinsics.LJFF(this.exitRuleData, frequencyRule.exitRuleData);
    }

    public int hashCode() {
        String str = this.bizId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        FrequencyRuleConfig frequencyRuleConfig = this.frequencyRuleConfig;
        int iHashCode2 = (iHashCode + (frequencyRuleConfig == null ? 0 : frequencyRuleConfig.hashCode())) * 31;
        FrequencyExitConfig frequencyExitConfig = this.exitRuleConfig;
        int iHashCode3 = (iHashCode2 + (frequencyExitConfig == null ? 0 : frequencyExitConfig.hashCode())) * 31;
        ExitRuleData exitRuleData = this.exitRuleData;
        return iHashCode3 + (exitRuleData != null ? exitRuleData.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyRule(bizId=");
        sbLIZ.append(this.bizId);
        sbLIZ.append(", frequencyRuleConfig=");
        sbLIZ.append(this.frequencyRuleConfig);
        sbLIZ.append(", exitRuleConfig=");
        sbLIZ.append(this.exitRuleConfig);
        sbLIZ.append(", exitRuleData=");
        sbLIZ.append(this.exitRuleData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrequencyRule(String str, FrequencyRuleConfig frequencyRuleConfig, FrequencyExitConfig frequencyExitConfig, ExitRuleData exitRuleData) {
        this.bizId = str;
        this.frequencyRuleConfig = frequencyRuleConfig;
        this.exitRuleConfig = frequencyExitConfig;
        this.exitRuleData = exitRuleData;
    }
}
