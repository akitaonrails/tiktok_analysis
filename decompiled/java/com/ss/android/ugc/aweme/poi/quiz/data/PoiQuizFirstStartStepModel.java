package com.ss.android.ugc.aweme.poi.quiz.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizFirstStartStepModel implements Serializable {

    @C09CT("subtitle")
    public final String subTitle;

    @C09CT("title")
    public final String title;

    public PoiQuizFirstStartStepModel() {
        this(null, null);
    }

    public PoiQuizFirstStartStepModel(String str, String str2) {
        this.title = str;
        this.subTitle = str2;
    }
}
