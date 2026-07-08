package com.bytedance.incentive.track;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class IncentiveEvent {

    @C09CT("name")
    public final String name;

    @C09CT("params")
    public final String params;

    public IncentiveEvent() {
        this("", null);
    }

    public IncentiveEvent(String str, String str2) {
        this.name = str;
        this.params = str2;
    }
}
