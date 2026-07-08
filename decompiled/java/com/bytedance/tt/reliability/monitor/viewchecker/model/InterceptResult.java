package com.bytedance.tt.reliability.monitor.viewchecker.model;

import com.bytedance.tt.reliability.monitor.viewchecker.model.PopupBlockConfig;

/* JADX INFO: loaded from: classes30.dex */
public class InterceptResult {
    public boolean isIntercept;
    public String reason;
    public PopupBlockConfig.BlockRule rule;

    public String getReason() {
        return this.reason;
    }

    public PopupBlockConfig.BlockRule getRule() {
        return this.rule;
    }

    public boolean isIntercept() {
        return this.isIntercept;
    }

    public InterceptResult(boolean z, String str, PopupBlockConfig.BlockRule blockRule) {
        this.isIntercept = z;
        this.reason = str;
        this.rule = blockRule;
    }
}
