package com.ss.android.ugc.aweme;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class IMTranslationTextData {

    @C09CT("language")
    public final String language;

    @C09CT("text")
    public final String text;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMTranslationTextData(language=");
        sbLIZ.append(this.language);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMTranslationTextData(String str, String str2) {
        this.language = str;
        this.text = str2;
    }
}
