package com.ss.android.ugc.aweme.share.base.model;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class TargetClassItem {

    @C09CT("share_mode")
    public final int shareMode;

    @C09CT("target_class_name")
    public final String targetClassName;

    public TargetClassItem(String str, int i) {
        this.targetClassName = str;
        this.shareMode = i;
    }
}
