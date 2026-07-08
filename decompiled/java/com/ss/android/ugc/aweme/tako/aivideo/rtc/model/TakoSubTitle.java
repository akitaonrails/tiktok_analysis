package com.ss.android.ugc.aweme.tako.aivideo.rtc.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TakoSubTitle {

    @C09CT("definite")
    public final boolean definite;

    @C09CT("end_time")
    public final long endTime;

    @C09CT("language")
    public final String language;

    @C09CT("round_id")
    public final long roundId;

    @C09CT("sequence")
    public final long sequence;

    @C09CT("speech_rate")
    public final int speechRate;

    @C09CT("start_time")
    public final long startTime;

    @C09CT("text")
    public final String text;

    @C09CT("text_src")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoSubTitle)) {
            return false;
        }
        TakoSubTitle takoSubTitle = (TakoSubTitle) obj;
        return Intrinsics.LJFF(this.type, takoSubTitle.type) && Intrinsics.LJFF(this.text, takoSubTitle.text) && Intrinsics.LJFF(this.language, takoSubTitle.language) && this.roundId == takoSubTitle.roundId && this.sequence == takoSubTitle.sequence && this.definite == takoSubTitle.definite && this.startTime == takoSubTitle.startTime && this.endTime == takoSubTitle.endTime && this.speechRate == takoSubTitle.speechRate;
    }

    public final int hashCode() {
        return (((((((((((((((this.type.hashCode() * 31) + this.text.hashCode()) * 31) + this.language.hashCode()) * 31) + C786410Ut5.Y2(this.roundId)) * 31) + C786410Ut5.Y2(this.sequence)) * 31) + C786410Ut5.Z2(this.definite)) * 31) + C786410Ut5.Y2(this.startTime)) * 31) + C786410Ut5.Y2(this.endTime)) * 31) + this.speechRate;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSubTitle(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", language=");
        sbLIZ.append(this.language);
        sbLIZ.append(", roundId=");
        sbLIZ.append(this.roundId);
        sbLIZ.append(", sequence=");
        sbLIZ.append(this.sequence);
        sbLIZ.append(", definite=");
        sbLIZ.append(this.definite);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", speechRate=");
        sbLIZ.append(this.speechRate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoSubTitle() {
        this("", "", "", -1L, -1L, false, -1L, -1L, -1);
    }

    public TakoSubTitle(String str, String str2, String str3, long j, long j2, boolean z, long j3, long j4, int i) {
        this.type = str;
        this.text = str2;
        this.language = str3;
        this.roundId = j;
        this.sequence = j2;
        this.definite = z;
        this.startTime = j3;
        this.endTime = j4;
        this.speechRate = i;
    }
}
