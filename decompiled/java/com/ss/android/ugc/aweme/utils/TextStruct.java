package com.ss.android.ugc.aweme.utils;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class TextStruct implements Serializable {
    public static final int $stable = 0;

    @C09CT("plain_text")
    public final String plainText;

    public TextStruct(String str) {
        this.plainText = str;
    }
}
