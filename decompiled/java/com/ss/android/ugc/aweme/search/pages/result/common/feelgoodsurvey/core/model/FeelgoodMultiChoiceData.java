package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FeelgoodMultiChoiceData implements Serializable {

    @C09CT(alternate = {"is_required"}, value = "isRequired")
    public final Boolean isRequired;

    @C09CT(alternate = {"max_cnt"}, value = "maxCnt")
    public final Integer maxCnt;

    @C09CT(alternate = {"option_list"}, value = "optionList")
    public final List<FeelgoodOptionData> optionList;

    @C09CT(alternate = {"title_text"}, value = "titleText")
    public final String titleText;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeelgoodMultiChoiceData(isRequired=");
        sbLIZ.append(this.isRequired);
        sbLIZ.append(", optionList=");
        sbLIZ.append(this.optionList);
        sbLIZ.append(", titleText=");
        sbLIZ.append(this.titleText);
        sbLIZ.append(", maxCnt=");
        sbLIZ.append(this.maxCnt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isRequired() {
        return this.isRequired;
    }

    public FeelgoodMultiChoiceData(Boolean bool, List<FeelgoodOptionData> list, String str, Integer num) {
        this.isRequired = bool;
        this.optionList = list;
        this.titleText = str;
        this.maxCnt = num;
    }
}
