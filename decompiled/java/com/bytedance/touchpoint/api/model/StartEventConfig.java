package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class StartEventConfig {

    @C09CT("show_bubble_type")
    public Integer showBubbleType;

    public StartEventConfig() {
        this(0);
    }

    public StartEventConfig(Integer num) {
        this.showBubbleType = num;
    }
}
