package com.ss.android.ugc.aweme.service.earlyfeedback;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class QuestionnaireData {

    @C09CT("skip_count")
    public final int skipCount;

    @C09CT("type")
    public final String type;

    public QuestionnaireData() {
        this("", 0);
    }

    public QuestionnaireData(String str, int i) {
        this.type = str;
        this.skipCount = i;
    }
}
