package com.bytedance.vcloud.strategy.drm;

import X.C08FF;

/* JADX INFO: loaded from: classes14.dex */
public enum Priority {
    HIGH(0),
    NORMAL(1),
    LOW(2);

    public final int order;

    public int getOrder() {
        return this.order;
    }

    public static Priority valueOf(String str) {
        return (Priority) C08FF.LIZ(Priority.class, str);
    }

    Priority(int i) {
        this.order = i;
    }
}
