package com.ss.android.ugc.aweme.poi.quiz.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class RetainButtonModel implements Serializable {

    @C09CT("action")
    public final Integer action;

    @C09CT("text")
    public final String text;

    public RetainButtonModel() {
        this(null, null);
    }

    public RetainButtonModel(String str, Integer num) {
        this.text = str;
        this.action = num;
    }
}
