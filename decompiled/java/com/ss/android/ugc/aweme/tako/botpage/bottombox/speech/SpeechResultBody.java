package com.ss.android.ugc.aweme.tako.botpage.bottombox.speech;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SpeechResultBody {

    @C09CT("additions")
    public final SpeechResultAddition additions;

    @C09CT("text")
    public final String text;

    @C09CT("utterances")
    public final List<SpeechUtterance> utterances;

    public SpeechResultBody() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeechResultBody)) {
            return false;
        }
        SpeechResultBody speechResultBody = (SpeechResultBody) obj;
        return Intrinsics.LJFF(this.additions, speechResultBody.additions) && Intrinsics.LJFF(this.text, speechResultBody.text) && Intrinsics.LJFF(this.utterances, speechResultBody.utterances);
    }

    public final int hashCode() {
        SpeechResultAddition speechResultAddition = this.additions;
        return ((((speechResultAddition == null ? 0 : speechResultAddition.hashCode()) * 31) + this.text.hashCode()) * 31) + this.utterances.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpeechResultBody(additions=");
        sbLIZ.append(this.additions);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", utterances=");
        sbLIZ.append(this.utterances);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SpeechResultBody(SpeechResultAddition speechResultAddition, String str, List<SpeechUtterance> list) {
        this.additions = speechResultAddition;
        this.text = str;
        this.utterances = list;
    }

    public SpeechResultBody(SpeechResultAddition speechResultAddition, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : speechResultAddition, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
