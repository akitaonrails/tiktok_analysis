package com.ss.android.ugc.aweme.poi.quiz.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class RetainBtnInfo implements Serializable {

    @C09CT("left_button")
    public final RetainButtonModel leftBtnModel;

    @C09CT("main_title")
    public final String mainTitle;

    @C09CT("right_button")
    public final RetainButtonModel rightBtnModel;

    public RetainBtnInfo() {
        this(null, null, null);
    }

    public RetainBtnInfo(String str, RetainButtonModel retainButtonModel, RetainButtonModel retainButtonModel2) {
        this.mainTitle = str;
        this.leftBtnModel = retainButtonModel;
        this.rightBtnModel = retainButtonModel2;
    }
}
