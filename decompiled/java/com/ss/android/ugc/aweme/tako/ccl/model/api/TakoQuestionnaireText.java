package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoQuestionnaireText implements Serializable {

    @C09CT("en_text")
    public final String enText;

    @C09CT("text")
    public final String text;

    public TakoQuestionnaireText() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoQuestionnaireText)) {
            return false;
        }
        TakoQuestionnaireText takoQuestionnaireText = (TakoQuestionnaireText) obj;
        return Intrinsics.LJFF(this.text, takoQuestionnaireText.text) && Intrinsics.LJFF(this.enText, takoQuestionnaireText.enText);
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.enText;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public TakoQuestionnaireText(String str, String str2) {
        this.text = str;
        this.enText = str2;
    }
}
