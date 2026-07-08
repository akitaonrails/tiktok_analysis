package com.ss.android.ugc.aweme.fangroup.model;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class FanGroupRequestBody {

    @C09CT("creator_id")
    public final String creatorId;

    @C09CT("options")
    public final FanGroupListOption options;

    public FanGroupRequestBody() {
        this("", null);
    }

    public FanGroupRequestBody(String str, FanGroupListOption fanGroupListOption) {
        this.creatorId = str;
        this.options = fanGroupListOption;
    }
}
