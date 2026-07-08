package com.ss.android.ugc.aweme.choosemusic.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class CMLTipsConfig {

    @C09CT("cml_tip_suffix")
    public String suffix;

    @C09CT("cml_tip_text")
    public String text;

    public CMLTipsConfig() {
        this(null, null);
    }

    public CMLTipsConfig(String str, String str2) {
        this.text = str;
        this.suffix = str2;
    }
}
