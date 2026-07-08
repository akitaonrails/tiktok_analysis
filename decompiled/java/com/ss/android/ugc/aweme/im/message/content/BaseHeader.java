package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class BaseHeader implements Serializable {

    @C09CT("text")
    public final BaseText text;

    public BaseHeader() {
        this(null);
    }

    public int hashCode() {
        BaseText baseText = this.text;
        if (baseText == null) {
            return 0;
        }
        return baseText.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseHeader(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BaseHeader(BaseText baseText) {
        this.text = baseText;
    }
}
