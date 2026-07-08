package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoLanguageStyleOption implements Serializable {

    @C09CT("demo_answer")
    public String languageStyleDemoAnswer;

    @C09CT("demo_query")
    public String languageStyleDemoQuery;

    @C09CT("description")
    public String languageStyleDescription;

    @C09CT("name")
    public String languageStyleName;

    @C09CT("type")
    public int languageStyleType;

    public TakoLanguageStyleOption() {
        this(0, "", "", "", "");
    }

    public final void setLanguageStyleDemoAnswer(String str) {
        this.languageStyleDemoAnswer = str;
    }

    public final void setLanguageStyleDemoQuery(String str) {
        this.languageStyleDemoQuery = str;
    }

    public final void setLanguageStyleDescription(String str) {
        this.languageStyleDescription = str;
    }

    public final void setLanguageStyleName(String str) {
        this.languageStyleName = str;
    }

    public final void setLanguageStyleType(int i) {
        this.languageStyleType = i;
    }

    public TakoLanguageStyleOption(int i, String str, String str2, String str3, String str4) {
        this.languageStyleType = i;
        this.languageStyleName = str;
        this.languageStyleDescription = str2;
        this.languageStyleDemoQuery = str3;
        this.languageStyleDemoAnswer = str4;
    }
}
