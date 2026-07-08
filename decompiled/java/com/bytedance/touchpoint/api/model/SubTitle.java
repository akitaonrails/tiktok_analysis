package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class SubTitle {

    @C09CT("content")
    public Content content;

    @C09CT("expire_time")
    public Long expireTime;

    @C09CT("icon_name")
    public String iconName;

    public SubTitle(Content content, Long l, String str) {
        this.content = content;
        this.expireTime = l;
        this.iconName = str;
    }
}
