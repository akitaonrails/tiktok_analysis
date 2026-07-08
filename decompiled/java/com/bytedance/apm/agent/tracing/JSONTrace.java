package com.bytedance.apm.agent.tracing;

import com.bytedance.apm.agent.filter.ISendFilter;

/* JADX INFO: loaded from: classes36.dex */
public class JSONTrace implements ISendFilter {
    @Override // com.bytedance.apm.agent.filter.ISendFilter
    public boolean isSend() {
        return false;
    }
}
