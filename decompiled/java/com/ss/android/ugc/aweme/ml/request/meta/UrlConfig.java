package com.ss.android.ugc.aweme.ml.request.meta;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class UrlConfig {

    @C09CT("change_type")
    public final int changeType;

    @C09CT("params_key")
    public final String paramsKey;

    @C09CT("position_type")
    public final int positionType;

    @C09CT("re_write_field")
    public final boolean reWriteField;

    @C09CT("url")
    public final String url;

    public UrlConfig() {
        this("", 0, "", 0, false);
    }

    public UrlConfig(String str, int i, String str2, int i2, boolean z) {
        this.url = str;
        this.changeType = i;
        this.paramsKey = str2;
        this.positionType = i2;
        this.reWriteField = z;
    }
}
