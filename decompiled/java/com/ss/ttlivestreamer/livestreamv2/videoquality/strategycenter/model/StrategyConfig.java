package com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes36.dex */
public class StrategyConfig {
    public String LIZ;

    @C09CT("resolution_list_key")
    public String bitrateConfigListIndex = "default";

    @C09CT("default_level")
    public int defaultLevel;

    @C09CT("gearshift_rule")
    public String gearShiftRule;

    @C09CT("gearshift_type")
    public int gearShiftType;

    @C09CT("priority")
    public int priority;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrategyConfig{name='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(", bitrateConfigListIndex=");
        sbLIZ.append(this.bitrateConfigListIndex);
        sbLIZ.append(", defaultLevel=");
        sbLIZ.append(this.defaultLevel);
        sbLIZ.append(", gearShiftRule='");
        sbLIZ.append(this.gearShiftRule);
        sbLIZ.append('\'');
        sbLIZ.append(", gearShiftType=");
        sbLIZ.append(this.gearShiftType);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
