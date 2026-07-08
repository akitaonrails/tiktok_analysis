package com.ss.android.ugc.aweme.tako.botpage.bottombox.speech;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes.dex */
public final class SpeechAudioInfo {

    @C09CT("duration")
    public final long duration;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpeechAudioInfo) && this.duration == ((SpeechAudioInfo) obj).duration;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.duration);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpeechAudioInfo(duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SpeechAudioInfo() {
        this(0L);
    }

    public SpeechAudioInfo(long j) {
        this.duration = j;
    }
}
