package com.ss.android.ugc.aweme.poi.quiz.data;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizHomePageModel implements Serializable {

    @C09CT("all_finish_description")
    public final String allFinishDescription;

    @C09CT("bottom_btn_text")
    public final String bottomBtnText;

    @C09CT("first_start_description")
    public final List<PoiQuizFirstStartStepModel> firstStartDescription;

    @C09CT("page_style")
    public final String pageStyle;

    @C09CT("partial_finish_description")
    public final PoiQuizPartialFinishStepModel partialFinishDescription;

    @C09CT("title_info")
    public final PoiQuizTitleInfoModel titleInfo;

    public PoiQuizHomePageModel() {
        this(null, null, null, null, null, null);
    }

    public PoiQuizHomePageModel(String str, PoiQuizTitleInfoModel poiQuizTitleInfoModel, List<PoiQuizFirstStartStepModel> list, PoiQuizPartialFinishStepModel poiQuizPartialFinishStepModel, String str2, String str3) {
        this.pageStyle = str;
        this.titleInfo = poiQuizTitleInfoModel;
        this.firstStartDescription = list;
        this.partialFinishDescription = poiQuizPartialFinishStepModel;
        this.allFinishDescription = str2;
        this.bottomBtnText = str3;
    }
}
