package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.model;

import X.C09CT;
import X.EnumC035200Ak;

/* JADX INFO: loaded from: classes.dex */
public final class EcomVideoCorrectInfo {

    @C09CT("correct_keyword")
    public final String correctKeyword;

    @C09CT("correct_level")
    public final int correctLevel;

    public EcomVideoCorrectInfo() {
        this(EnumC035200Ak.NO_NEED_CORRECT.getLevel(), null);
    }

    public EcomVideoCorrectInfo(int i, String str) {
        this.correctLevel = i;
        this.correctKeyword = str;
    }
}
