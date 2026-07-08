package com.ss.android.ugc.aweme.ecommerce.anchor.api;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class DetectVideoRequest {

    @C09CT("resolution")
    public final String resolution;

    @C09CT("uri")
    public final String uri;

    @C09CT("version")
    public final int version;

    public DetectVideoRequest(String str, int i, String str2) {
        this.uri = str;
        this.version = i;
        this.resolution = str2;
    }
}
