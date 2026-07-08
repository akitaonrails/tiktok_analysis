package com.ss.android.ugc.aweme.specact.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class UniversalActivityVideoResource {

    @C09CT("activity_id")
    public final String activityId;

    @C09CT("resource_md5")
    public final String resourceMd5;

    @C09CT("resource_url")
    public final String resourceUrl;

    public UniversalActivityVideoResource() {
        this("", "", "");
    }

    public UniversalActivityVideoResource(String str, String str2, String str3) {
        this.activityId = str;
        this.resourceUrl = str2;
        this.resourceMd5 = str3;
    }
}
