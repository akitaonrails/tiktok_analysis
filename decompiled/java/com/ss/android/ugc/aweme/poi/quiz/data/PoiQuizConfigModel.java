package com.ss.android.ugc.aweme.poi.quiz.data;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizConfigModel implements Serializable {

    @C09CT("poi_card_bottom_btn")
    public final PoiCardBottomBtnModel poiCardBottomBtnModel;

    @C09CT("poi_quiz_config")
    public final Integer poiQuizConfig;

    @C09CT("poi_quiz_home_page")
    public final PoiQuizHomePageModel poiQuizHomePage;

    @C09CT("poi_quiz_lynx_url")
    public final String poiQuizLynxUrl;

    @C09CT("poi_quiz_navbar_text")
    public final PoiQuizNavbarTextModel poiQuizNavbarText;

    @C09CT("poi_quiz_toast")
    public final List<PoiQuizToastModel> poiQuizToastList;

    @C09CT("retain_button_info")
    public final RetainBtnInfo retainButtonInfo;

    public PoiQuizConfigModel() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean isV1() {
        Integer num = this.poiQuizConfig;
        return num != null && num.intValue() == 1;
    }

    public final boolean isV2() {
        Integer num = this.poiQuizConfig;
        return num != null && num.intValue() == 2;
    }

    public final boolean isV3() {
        Integer num = this.poiQuizConfig;
        return num != null && num.intValue() == 3;
    }

    public PoiQuizConfigModel(Integer num, PoiQuizNavbarTextModel poiQuizNavbarTextModel, PoiQuizHomePageModel poiQuizHomePageModel, String str, RetainBtnInfo retainBtnInfo, List<PoiQuizToastModel> list, PoiCardBottomBtnModel poiCardBottomBtnModel) {
        this.poiQuizConfig = num;
        this.poiQuizNavbarText = poiQuizNavbarTextModel;
        this.poiQuizHomePage = poiQuizHomePageModel;
        this.poiQuizLynxUrl = str;
        this.retainButtonInfo = retainBtnInfo;
        this.poiQuizToastList = list;
        this.poiCardBottomBtnModel = poiCardBottomBtnModel;
    }
}
