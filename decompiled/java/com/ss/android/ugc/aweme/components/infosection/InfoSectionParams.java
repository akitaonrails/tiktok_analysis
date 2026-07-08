package com.ss.android.ugc.aweme.components.infosection;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoSectionParams {

    @C09CT("image")
    public final InfoSectionImage image;

    @C09CT("schema")
    public final String schema;

    @C09CT("subtitle")
    public final String subtitle;

    @C09CT("title")
    public final String title;

    public InfoSectionParams() {
        this(null, null, null, null);
    }

    public InfoSectionParams(InfoSectionImage infoSectionImage, String str, String str2, String str3) {
        this.image = infoSectionImage;
        this.title = str;
        this.subtitle = str2;
        this.schema = str3;
    }
}
