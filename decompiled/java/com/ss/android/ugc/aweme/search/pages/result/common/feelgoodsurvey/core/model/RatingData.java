package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RatingData implements Serializable {

    @C09CT(alternate = {"is_required"}, value = "isRequired")
    public final Boolean isRequired;

    @C09CT(alternate = {"option_list"}, value = "optionList")
    public final List<FeelgoodOptionData> optionList;

    @C09CT("style")
    public final Integer style;

    @C09CT(alternate = {"title_text"}, value = "titleText")
    public final String titleText;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RatingData(isRequired=");
        sbLIZ.append(this.isRequired);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", titleText=");
        sbLIZ.append(this.titleText);
        sbLIZ.append(", optionList=");
        sbLIZ.append(this.optionList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isRequired() {
        return this.isRequired;
    }

    public RatingData(Boolean bool, Integer num, String str, List<FeelgoodOptionData> list) {
        this.isRequired = bool;
        this.style = num;
        this.titleText = str;
        this.optionList = list;
    }
}
