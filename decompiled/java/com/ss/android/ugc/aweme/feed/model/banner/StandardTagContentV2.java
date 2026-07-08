package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardTagContentV2 implements Serializable {

    @C09CT("text")
    public String text;

    @C09CT("text_color")
    public String textColor;

    public StandardTagContentV2() {
        this(null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StandardTagContentV2(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StandardTagContentV2(String str, String str2) {
        this.text = str;
        this.textColor = str2;
    }
}
