package com.bytedance.i18n.region.network.model;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class LocationSdkRequestModel {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("model")
    public final int model;

    @C09CT("token")
    public final String token;

    @C09CT("version")
    public final String version;

    public LocationSdkRequestModel(String str, String str2, int i) {
        this.version = str;
        this.token = str2;
        this.model = i;
    }
}
