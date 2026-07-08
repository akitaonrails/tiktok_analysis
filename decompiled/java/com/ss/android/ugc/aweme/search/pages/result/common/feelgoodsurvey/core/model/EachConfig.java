package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EachConfig implements Serializable {

    @C09CT(alternate = {"is_selected"}, value = "isSelected")
    public final Boolean isSelected;

    @C09CT(alternate = {"logic_type"}, value = "logicType")
    public final Integer logicType;

    @C09CT(alternate = {"option_key_list"}, value = "optionKeyList")
    public final List<String> optionKeyList;

    @C09CT(alternate = {"question_key"}, value = "questionKey")
    public final String questionKey;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EachConfig(isSelected=");
        sbLIZ.append(this.isSelected);
        sbLIZ.append(", questionKey=");
        sbLIZ.append(this.questionKey);
        sbLIZ.append(", logicType=");
        sbLIZ.append(this.logicType);
        sbLIZ.append(", optionKeyList=");
        sbLIZ.append(this.optionKeyList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public EachConfig(Boolean bool, String str, Integer num, List<String> list) {
        this.isSelected = bool;
        this.questionKey = str;
        this.logicType = num;
        this.optionKeyList = list;
    }
}
