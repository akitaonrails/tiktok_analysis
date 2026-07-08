package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class FormattedText implements Serializable {

    @C09CT("bold")
    public final String bold;

    @C09CT("text")
    public final String text;

    public FormattedText(String str, String str2) {
        this.text = str;
        this.bold = str2;
    }
}
