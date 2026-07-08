package com.ss.android.ugc.aweme.tako.botpage.bottombox.speech;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SpeechUtterance {

    @C09CT("additions")
    public final SpeechResultAddition additions;

    @C09CT("definite")
    public final boolean definite;

    @C09CT("end_time")
    public final long endTime;

    @C09CT("start_time")
    public final long startTime;

    @C09CT("text")
    public final String text;

    @C09CT("words")
    public final List<Object> words;

    public SpeechUtterance() {
        this(null, false, 0L, 0L, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeechUtterance)) {
            return false;
        }
        SpeechUtterance speechUtterance = (SpeechUtterance) obj;
        return Intrinsics.LJFF(this.additions, speechUtterance.additions) && this.definite == speechUtterance.definite && this.endTime == speechUtterance.endTime && this.startTime == speechUtterance.startTime && Intrinsics.LJFF(this.text, speechUtterance.text) && Intrinsics.LJFF(this.words, speechUtterance.words);
    }

    public final int hashCode() {
        SpeechResultAddition speechResultAddition = this.additions;
        return ((((((((((speechResultAddition == null ? 0 : speechResultAddition.hashCode()) * 31) + C786410Ut5.Z2(this.definite)) * 31) + C786410Ut5.Y2(this.endTime)) * 31) + C786410Ut5.Y2(this.startTime)) * 31) + this.text.hashCode()) * 31) + this.words.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpeechUtterance(additions=");
        sbLIZ.append(this.additions);
        sbLIZ.append(", definite=");
        sbLIZ.append(this.definite);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", words=");
        sbLIZ.append(this.words);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SpeechUtterance(SpeechResultAddition speechResultAddition, boolean z, long j, long j2, String str, List<Object> list) {
        this.additions = speechResultAddition;
        this.definite = z;
        this.endTime = j;
        this.startTime = j2;
        this.text = str;
        this.words = list;
    }

    public SpeechUtterance(SpeechResultAddition speechResultAddition, boolean z, long j, long j2, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : speechResultAddition, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0L : j, (i & 8) == 0 ? j2 : 0L, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? C13BV.INSTANCE : list);
    }
}
