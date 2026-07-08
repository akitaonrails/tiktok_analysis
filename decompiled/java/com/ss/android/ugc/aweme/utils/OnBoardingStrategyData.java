package com.ss.android.ugc.aweme.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class OnBoardingStrategyData {

    @C09CT("abgroup")
    public final String abGroup;

    @C09CT("default_url")
    public final String defaultUrl;

    @C09CT("ecomm_url")
    public final String ecommUrl;

    @C09CT("vid")
    public final String vid;

    public OnBoardingStrategyData() {
        this(null, null, null, null);
    }

    public OnBoardingStrategyData(String str, String str2, String str3, String str4) {
        this.ecommUrl = str;
        this.vid = str2;
        this.abGroup = str3;
        this.defaultUrl = str4;
    }
}
