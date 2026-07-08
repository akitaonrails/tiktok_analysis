package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class HintsConfig implements Serializable {

    @C09CT("short_hints")
    public final List<String> shortHints;

    @C09CT("ask_question")
    public final String textChain;

    @C09CT("title")
    public final String title;

    public HintsConfig() {
        this(null, null, null);
    }

    public final List<String> getShortHints() {
        return this.shortHints;
    }

    public final String getTextChain() {
        return this.textChain;
    }

    public final String getTitle() {
        return this.title;
    }

    public HintsConfig(String str, String str2, List<String> list) {
        this.title = str;
        this.textChain = str2;
        this.shortHints = list;
    }
}
