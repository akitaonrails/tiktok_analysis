package com.ss.android.ugc.aweme.minis.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class TtmgCoreConfigModel {

    @C09CT("md5")
    public final String md5;

    @C09CT("url")
    public final String url;

    public TtmgCoreConfigModel() {
        this("", "");
    }

    public TtmgCoreConfigModel(String str, String str2) {
        this.url = str;
        this.md5 = str2;
    }
}
