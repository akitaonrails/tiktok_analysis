package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class CreativeTemplateTag {

    @C09CT("background_rgb")
    public final String color;

    @C09CT("text")
    public final String text;

    public CreativeTemplateTag() {
        this("", "");
    }

    public CreativeTemplateTag(String str, String str2) {
        this.text = str;
        this.color = str2;
    }
}
