package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class ScanCommonResponseData {

    @C09CT("captcha")
    public final String captcha;

    @C09CT("desc_url")
    public final String descUrl;

    @C09CT("description")
    public final String description;

    @C09CT("error_code")
    public final Integer errorCode;

    public ScanCommonResponseData() {
        this("", "", "", null);
    }

    public ScanCommonResponseData(String str, String str2, String str3, Integer num) {
        this.captcha = str;
        this.descUrl = str2;
        this.description = str3;
        this.errorCode = num;
    }
}
