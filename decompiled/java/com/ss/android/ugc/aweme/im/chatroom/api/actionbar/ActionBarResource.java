package com.ss.android.ugc.aweme.im.chatroom.api.actionbar;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ActionBarResource {

    @C09CT("md5")
    public final String md5;

    @C09CT("resource_url")
    public final String resourceUrl;

    @C09CT("version")
    public final Long version;

    public ActionBarResource() {
        this(null, null, null);
    }

    public ActionBarResource(Long l, String str, String str2) {
        this.version = l;
        this.md5 = str;
        this.resourceUrl = str2;
    }
}
