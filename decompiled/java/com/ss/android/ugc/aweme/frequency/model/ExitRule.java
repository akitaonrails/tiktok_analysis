package com.ss.android.ugc.aweme.frequency.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC822840WPq;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class ExitRule implements InterfaceC822840WPq, Serializable {

    @C09CT("block_window")
    public final RuleWindow blockWindow;

    @C09CT("control_scope")
    public final String controlScope;

    @C09CT("negative_behaviors")
    public final List<DetectBehavior> detectBehaviors;

    @C09CT("rule_id")
    public final String ruleId;

    @C09CT("rule_type")
    public final String ruleType;

    @C09CT("window")
    public final RuleWindow window;

    public ExitRule() {
        this(null, null, null, null, "exit", "single");
    }

    public final ExitRule copy(String str, RuleWindow ruleWindow, List<DetectBehavior> list, RuleWindow ruleWindow2, String str2, String str3) {
        return new ExitRule(str, ruleWindow, list, ruleWindow2, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExitRule)) {
            return false;
        }
        ExitRule exitRule = (ExitRule) obj;
        return Intrinsics.LJFF(this.ruleId, exitRule.ruleId) && Intrinsics.LJFF(this.window, exitRule.window) && Intrinsics.LJFF(this.detectBehaviors, exitRule.detectBehaviors) && Intrinsics.LJFF(this.blockWindow, exitRule.blockWindow) && Intrinsics.LJFF(this.ruleType, exitRule.ruleType) && Intrinsics.LJFF(this.controlScope, exitRule.controlScope);
    }

    public int hashCode() {
        String str = this.ruleId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RuleWindow ruleWindow = this.window;
        int iHashCode2 = (iHashCode + (ruleWindow == null ? 0 : ruleWindow.hashCode())) * 31;
        List<DetectBehavior> list = this.detectBehaviors;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        RuleWindow ruleWindow2 = this.blockWindow;
        return ((((iHashCode3 + (ruleWindow2 != null ? ruleWindow2.hashCode() : 0)) * 31) + this.ruleType.hashCode()) * 31) + this.controlScope.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExitRule(ruleId=");
        sbLIZ.append(this.ruleId);
        sbLIZ.append(", window=");
        sbLIZ.append(this.window);
        sbLIZ.append(", detectBehaviors=");
        sbLIZ.append(this.detectBehaviors);
        sbLIZ.append(", blockWindow=");
        sbLIZ.append(this.blockWindow);
        sbLIZ.append(", ruleType=");
        sbLIZ.append(this.ruleType);
        sbLIZ.append(", controlScope=");
        sbLIZ.append(this.controlScope);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final RuleWindow getBlockWindow() {
        return this.blockWindow;
    }

    @Override // X.InterfaceC822840WPq
    public String getControlScope() {
        return this.controlScope;
    }

    public final List<DetectBehavior> getDetectBehaviors() {
        return this.detectBehaviors;
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

    public ExitRule(String str, RuleWindow ruleWindow, List<DetectBehavior> list, RuleWindow ruleWindow2, String str2, String str3) {
        this.ruleId = str;
        this.window = ruleWindow;
        this.detectBehaviors = list;
        this.blockWindow = ruleWindow2;
        this.ruleType = str2;
        this.controlScope = str3;
    }
}
