package com.ss.android.ugc.aweme.aiuikit.impl.voicebox.speech;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SpeechResult {

    @C09CT("text")
    public final String text;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpeechResult) && Intrinsics.LJFF(this.text, ((SpeechResult) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpeechResult(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SpeechResult() {
        this("");
    }

    public SpeechResult(String str) {
        this.text = str;
    }
}
