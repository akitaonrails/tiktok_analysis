package com.ss.android.ugc.aweme.frequency.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC822840WPq;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class FrequencyRule implements InterfaceC822840WPq, Serializable {

    @C09CT("control_scope")
    public final String controlScope;

    @C09CT("limit")
    public final Integer limit;

    @C09CT("rule_id")
    public final String ruleId;

    @C09CT("rule_type")
    public final String ruleType;

    @C09CT("window")
    public final RuleWindow window;

    public FrequencyRule() {
        this(null, null, null, "frequency", "single");
    }

    public final FrequencyRule copy(String str, RuleWindow ruleWindow, Integer num, String str2, String str3) {
        return new FrequencyRule(str, ruleWindow, num, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyRule)) {
            return false;
        }
        FrequencyRule frequencyRule = (FrequencyRule) obj;
        return Intrinsics.LJFF(this.ruleId, frequencyRule.ruleId) && Intrinsics.LJFF(this.window, frequencyRule.window) && Intrinsics.LJFF(this.limit, frequencyRule.limit) && Intrinsics.LJFF(this.ruleType, frequencyRule.ruleType) && Intrinsics.LJFF(this.controlScope, frequencyRule.controlScope);
    }

    public int hashCode() {
        String str = this.ruleId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RuleWindow ruleWindow = this.window;
        int iHashCode2 = (iHashCode + (ruleWindow == null ? 0 : ruleWindow.hashCode())) * 31;
        Integer num = this.limit;
        return ((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.ruleType.hashCode()) * 31) + this.controlScope.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyRule(ruleId=");
        sbLIZ.append(this.ruleId);
        sbLIZ.append(", window=");
        sbLIZ.append(this.window);
        sbLIZ.append(", limit=");
        sbLIZ.append(this.limit);
        sbLIZ.append(", ruleType=");
        sbLIZ.append(this.ruleType);
        sbLIZ.append(", controlScope=");
        sbLIZ.append(this.controlScope);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC822840WPq
    public String getControlScope() {
        return this.controlScope;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    @Override // X.InterfaceC822840WPq
    public String getRuleId() {
        return this.ruleId;
    }

    public String getRuleType() {
        return this.ruleType;
    }

    public final RuleWindow getWindow() {
        return this.window;
    }

    public FrequencyRule(String str, RuleWindow ruleWindow, Integer num, String str2, String str3) {
        this.ruleId = str;
        this.window = ruleWindow;
        this.limit = num;
        this.ruleType = str2;
        this.controlScope = str3;
    }
}
