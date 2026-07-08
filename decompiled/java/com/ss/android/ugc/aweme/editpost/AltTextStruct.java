package com.ss.android.ugc.aweme.editpost;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class AltTextStruct {

    @C09CT("alternate_text")
    public final String altText;

    @C09CT("uri")
    public final String uri;

    public AltTextStruct() {
        this("", "");
    }

    public AltTextStruct(String str, String str2) {
        this.uri = str;
        this.altText = str2;
    }
}
