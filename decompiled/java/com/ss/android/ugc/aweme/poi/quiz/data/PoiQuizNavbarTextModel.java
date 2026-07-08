package com.ss.android.ugc.aweme.poi.quiz.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizNavbarTextModel implements Serializable {

    @C09CT("answer_question_page")
    public final String answerQuestionPage;

    @C09CT("home_page")
    public final String homePage;

    @C09CT("pick_poi_page")
    public final String pickPoiPage;

    public PoiQuizNavbarTextModel() {
        this(null, null, null);
    }

    public PoiQuizNavbarTextModel(String str, String str2, String str3) {
        this.homePage = str;
        this.pickPoiPage = str2;
        this.answerQuestionPage = str3;
    }
}
