package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoLanguageStyleSetting implements Serializable {

    @C09CT("options")
    public List<TakoLanguageStyleOption> languageStyleOptions;

    @C09CT("selected")
    public int selectedLanguageStyle;

    public TakoLanguageStyleSetting() {
        this(0, null);
    }

    public final TakoLanguageStyleSetting copy(int i, List<TakoLanguageStyleOption> list) {
        return new TakoLanguageStyleSetting(i, list);
    }

    public final void setLanguageStyleOptions(List<TakoLanguageStyleOption> list) {
        this.languageStyleOptions = list;
    }

    public final void setSelectedLanguageStyle(int i) {
        this.selectedLanguageStyle = i;
    }

    public TakoLanguageStyleSetting(int i, List<TakoLanguageStyleOption> list) {
        this.selectedLanguageStyle = i;
        this.languageStyleOptions = list;
    }
}
