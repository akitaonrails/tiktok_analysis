package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class FeelgoodOptionData implements Serializable {

    @C09CT(alternate = {"option_key"}, value = "optionKey")
    public final String optionKey;

    @C09CT(alternate = {"relation_input"}, value = "relationInput")
    public final RelationInput relationInput;

    @C09CT("score")
    public final String score;

    @C09CT("text")
    public final String text;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeelgoodOptionData(optionKey=");
        sbLIZ.append(this.optionKey);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", score=");
        sbLIZ.append(this.score);
        sbLIZ.append(", relationInput=");
        sbLIZ.append(this.relationInput);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeelgoodOptionData(String str, String str2, String str3, RelationInput relationInput) {
        this.optionKey = str;
        this.text = str2;
        this.score = str3;
        this.relationInput = relationInput;
    }
}
