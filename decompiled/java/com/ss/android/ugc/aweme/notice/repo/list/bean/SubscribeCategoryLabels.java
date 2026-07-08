package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class SubscribeCategoryLabels {

    @C09CT("action")
    public final int isSubscribe;

    @C09CT("label")
    public final int label;

    public SubscribeCategoryLabels() {
        this(0, 0);
    }

    public SubscribeCategoryLabels(int i, int i2) {
        this.label = i;
        this.isSubscribe = i2;
    }
}
