package com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.ShortAnswerFormat;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class ShortAnswerData implements Serializable {

    @C09CT("is_short_answer")
    public final Boolean isShortAnswer;

    @C09CT("short_answer_format")
    public final ShortAnswerFormat shortAnswerFormat;

    public ShortAnswerData() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortAnswerData)) {
            return false;
        }
        ShortAnswerData shortAnswerData = (ShortAnswerData) obj;
        return Intrinsics.LJFF(this.isShortAnswer, shortAnswerData.isShortAnswer) && Intrinsics.LJFF(this.shortAnswerFormat, shortAnswerData.shortAnswerFormat);
    }

    public int hashCode() {
        Boolean bool = this.isShortAnswer;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ShortAnswerFormat shortAnswerFormat = this.shortAnswerFormat;
        return iHashCode + (shortAnswerFormat != null ? shortAnswerFormat.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShortAnswerData(isShortAnswer=");
        sbLIZ.append(this.isShortAnswer);
        sbLIZ.append(", shortAnswerFormat=");
        sbLIZ.append(this.shortAnswerFormat);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isShortAnswer() {
        return this.isShortAnswer;
    }

    public ShortAnswerData(Boolean bool, ShortAnswerFormat shortAnswerFormat) {
        this.isShortAnswer = bool;
        this.shortAnswerFormat = shortAnswerFormat;
    }
}
