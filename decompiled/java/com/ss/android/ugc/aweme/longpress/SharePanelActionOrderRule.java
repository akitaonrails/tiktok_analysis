package com.ss.android.ugc.aweme.longpress;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelActionOrderRule {

    @C09CT("action")
    public final String action;

    @C09CT("after_action")
    public final String afterAction;

    @C09CT("order")
    public Integer order;

    public SharePanelActionOrderRule() {
        this(null, null, null);
    }

    public SharePanelActionOrderRule(String str, Integer num, String str2) {
        this.action = str;
        this.order = num;
        this.afterAction = str2;
    }
}
