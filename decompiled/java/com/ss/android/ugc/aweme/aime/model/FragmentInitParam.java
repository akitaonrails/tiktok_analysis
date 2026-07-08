package com.ss.android.ugc.aweme.aime.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class FragmentInitParam implements Serializable {
    public static final int $stable = 0;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("source_id")
    public final String styleId;

    public FragmentInitParam(String str, String str2) {
        this.styleId = str;
        this.enterFrom = str2;
    }
}
