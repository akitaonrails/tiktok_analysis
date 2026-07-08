package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class FollowInfo {

    @C09CT("after_click_text")
    public final Title afterClickText;

    public FollowInfo() {
        this(null);
    }

    public FollowInfo(Title title) {
        this.afterClickText = title;
    }
}
