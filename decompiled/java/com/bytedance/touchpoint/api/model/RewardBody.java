package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class RewardBody {

    @C09CT("subtitle")
    public Title subtitle;

    @C09CT("title")
    public Title title;

    public RewardBody(Title title, Title title2) {
        this.title = title;
        this.subtitle = title2;
    }
}
