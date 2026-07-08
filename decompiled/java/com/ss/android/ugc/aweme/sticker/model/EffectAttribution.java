package com.ss.android.ugc.aweme.sticker.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class EffectAttribution implements Serializable {

    @C09CT("author")
    public final String author;

    @C09CT("creator")
    public final String creator;

    @C09CT("license")
    public final String license;

    @C09CT("title")
    public final String name;

    public EffectAttribution(String str, String str2, String str3, String str4) {
        this.name = str;
        this.creator = str2;
        this.author = str3;
        this.license = str4;
    }
}
