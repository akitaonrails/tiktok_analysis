package com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model;

import X.C09CT;
import X.C2188811AlT;
import X.C746080TOk;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class Gender implements Serializable {

    @C09CT("gender_content")
    public String genderContent;

    @C09CT("gender_source")
    public String genderSource;

    @C09CT("gender_type")
    public String genderType;
    public int labelType;
    public static final C746080TOk Companion = new Object() { // from class: X.0TOk
    };
    public static final int $stable = 8;

    public Gender() {
        this(null, null, null, -1);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Gender(genderSource=");
        sbLIZ.append(this.genderSource);
        sbLIZ.append(", genderType=");
        sbLIZ.append(this.genderType);
        sbLIZ.append(", genderContent=");
        sbLIZ.append(this.genderContent);
        sbLIZ.append(", labelType=");
        sbLIZ.append(this.labelType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setGenderContent(String str) {
        this.genderContent = str;
    }

    public final void setGenderSource(String str) {
        this.genderSource = str;
    }

    public final void setGenderType(String str) {
        this.genderType = str;
    }

    public final void setLabelType(int i) {
        this.labelType = i;
    }

    public Gender(String str, String str2, String str3, int i) {
        this.genderSource = str;
        this.genderType = str2;
        this.genderContent = str3;
        this.labelType = i;
    }
}
