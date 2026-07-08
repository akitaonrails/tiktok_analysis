package com.ss.android.ugc.aweme.transcript;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class IMVoiceTranscribeModel {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("hints")
    public final List<Hints> hints;

    @C09CT("transcript")
    public final String transcript;

    public static final class Hints {

        @C09CT("end_index")
        public final long endIndex;

        @C09CT("end_time_ms")
        public final long endTimeMs;

        @C09CT("start_index")
        public final long startIndex;

        @C09CT("start_time_ms")
        public final long startTimeMs;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Hints)) {
                return false;
            }
            Hints hints = (Hints) obj;
            return this.startTimeMs == hints.startTimeMs && this.endTimeMs == hints.endTimeMs && this.startIndex == hints.startIndex && this.endIndex == hints.endIndex;
        }

        public final int hashCode() {
            return (((((C786410Ut5.Y2(this.startTimeMs) * 31) + C786410Ut5.Y2(this.endTimeMs)) * 31) + C786410Ut5.Y2(this.startIndex)) * 31) + C786410Ut5.Y2(this.endIndex);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Hints(startTimeMs=");
            sbLIZ.append(this.startTimeMs);
            sbLIZ.append(", endTimeMs=");
            sbLIZ.append(this.endTimeMs);
            sbLIZ.append(", startIndex=");
            sbLIZ.append(this.startIndex);
            sbLIZ.append(", endIndex=");
            sbLIZ.append(this.endIndex);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Hints() {
            this(0L, 0L, 0L, 0L);
        }

        public Hints(long j, long j2, long j3, long j4) {
            this.startTimeMs = j;
            this.endTimeMs = j2;
            this.startIndex = j3;
            this.endIndex = j4;
        }
    }

    public IMVoiceTranscribeModel() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMVoiceTranscribeModel)) {
            return false;
        }
        IMVoiceTranscribeModel iMVoiceTranscribeModel = (IMVoiceTranscribeModel) obj;
        return Intrinsics.LJFF(this.transcript, iMVoiceTranscribeModel.transcript) && Intrinsics.LJFF(this.hints, iMVoiceTranscribeModel.hints);
    }

    public final int hashCode() {
        return (this.transcript.hashCode() * 31) + this.hints.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMVoiceTranscribeModel(transcript=");
        sbLIZ.append(this.transcript);
        sbLIZ.append(", hints=");
        sbLIZ.append(this.hints);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMVoiceTranscribeModel(String str, List<Hints> list) {
        this.transcript = str;
        this.hints = list;
    }

    public IMVoiceTranscribeModel(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
