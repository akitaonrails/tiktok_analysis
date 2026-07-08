package com.ss.android.ugc.aweme.compliance.api.services.policy;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class PolicyMeta {

    @C09CT("cmsKey")
    public final String cmsKey;

    @C09CT("link")
    public final String url;

    public PolicyMeta() {
        this("", "");
    }

    public PolicyMeta(String str, String str2) {
        this.cmsKey = str;
        this.url = str2;
    }
}
