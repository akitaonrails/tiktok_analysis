package com.bytedance.android.livesdk.condition;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes32.dex */
public final class Condition {

    @C09CT("duration")
    public Integer duration;

    @C09CT("name")
    public final String name;

    @C09CT("operator")
    public String operator;

    @C09CT("params")
    public String params;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Condition(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", params=");
        sbLIZ.append(this.params);
        sbLIZ.append(", operator=");
        sbLIZ.append(this.operator);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setDuration(Integer num) {
        this.duration = num;
    }

    public final void setOperator(String str) {
        this.operator = str;
    }

    public final void setParams(String str) {
        this.params = str;
    }

    public Condition(String str, String str2, String str3, Integer num) {
        this.name = str;
        this.params = str2;
        this.operator = str3;
        this.duration = num;
    }
}
