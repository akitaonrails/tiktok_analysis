package com.ss.android.ugc.aweme.tako.botpage.bottombox.speech;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SpeechResultAddition {

    @C09CT("fixed_prefix_result")
    public final String fixedPrefixResult;

    @C09CT("log_id")
    public final String logId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeechResultAddition)) {
            return false;
        }
        SpeechResultAddition speechResultAddition = (SpeechResultAddition) obj;
        return Intrinsics.LJFF(this.logId, speechResultAddition.logId) && Intrinsics.LJFF(this.fixedPrefixResult, speechResultAddition.fixedPrefixResult);
    }

    public final int hashCode() {
        return (this.logId.hashCode() * 31) + this.fixedPrefixResult.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpeechResultAddition(logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(", fixedPrefixResult=");
        sbLIZ.append(this.fixedPrefixResult);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SpeechResultAddition() {
        this("", "");
    }

    public SpeechResultAddition(String str, String str2) {
        this.logId = str;
        this.fixedPrefixResult = str2;
    }
}
