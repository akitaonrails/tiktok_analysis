package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AwemeBubbleToastInfo {

    @C09CT("toast_count")
    public final int toastCount;

    @C09CT("toast_type")
    public final String toastType;

    public AwemeBubbleToastInfo(String str, int i) {
        this.toastType = str;
        this.toastCount = i;
    }
}
