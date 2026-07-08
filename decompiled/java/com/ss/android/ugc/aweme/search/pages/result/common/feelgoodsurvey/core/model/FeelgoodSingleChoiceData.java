package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FeelgoodSingleChoiceData implements Serializable {

    @C09CT(alternate = {"option_list"}, value = "optionList")
    public final List<FeelgoodOptionData> optionList;

    @C09CT(alternate = {"title_text"}, value = "titleText")
    public final String titleText;

    public FeelgoodSingleChoiceData(List<FeelgoodOptionData> list, String str) {
        this.optionList = list;
        this.titleText = str;
    }
}
