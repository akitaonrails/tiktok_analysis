package com.ss.android.ugc.aweme.tools.sticker.core.text.util;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class NewTextTemplateRichText {

    @C09CT("styles")
    public List<Style> styles;

    @C09CT("text")
    public String text;

    public NewTextTemplateRichText() {
        this(null, null);
    }

    public NewTextTemplateRichText(List<Style> list, String str) {
        this.styles = list;
        this.text = str;
    }
}
