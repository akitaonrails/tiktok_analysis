package com.ss.android.ugc.aweme.ug.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class PreloadProject {

    @C09CT("campaign")
    public String campaign;

    @C09CT("df_code")
    public int dfCode;

    @C09CT("media_source")
    public String mediaSource;

    @C09CT("method")
    public Integer method;

    @C09CT("partner")
    public String partner;

    public PreloadProject() {
        this(0, null, null, null, null);
    }

    public PreloadProject(int i, String str, String str2, String str3, Integer num) {
        this.dfCode = i;
        this.mediaSource = str;
        this.campaign = str2;
        this.partner = str3;
        this.method = num;
    }
}
