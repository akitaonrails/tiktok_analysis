package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class SurveyInfo {
    public static final int $stable = 0;

    @C09CT("biz_params")
    public final PushParams bizParams;

    @C09CT("content_scope")
    public final String contentScope;

    public SurveyInfo() {
        this("", null);
    }

    public SurveyInfo(String str, PushParams pushParams) {
        this.contentScope = str;
        this.bizParams = pushParams;
    }
}
