package com.ss.android.ugc.aweme.specact.api;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class MesEntraSetting {

    @C09CT("activity_id")
    public final String activityId;

    @C09CT("background_image_url")
    public final String bgImgUrl;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("title_image_url")
    public final String titleImgUrl;

    public MesEntraSetting(String str, String str2, String str3, String str4) {
        this.activityId = str;
        this.bgImgUrl = str2;
        this.titleImgUrl = str3;
        this.schemaUrl = str4;
    }
}
