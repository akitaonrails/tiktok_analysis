package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class AntiCheatingInfo {

    @C09CT("process_info")
    public String processInfo;

    @C09CT("reason")
    public Integer reason;

    @C09CT("risk_type")
    public Integer riskType;

    public AntiCheatingInfo() {
        this(null, null, null);
    }

    public AntiCheatingInfo(Integer num, Integer num2, String str) {
        this.riskType = num;
        this.reason = num2;
        this.processInfo = str;
    }
}
