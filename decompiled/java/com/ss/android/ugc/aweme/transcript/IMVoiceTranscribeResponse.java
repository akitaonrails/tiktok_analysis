package com.ss.android.ugc.aweme.transcript;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class IMVoiceTranscribeResponse extends BaseResponse {

    @C09CT("hints")
    public final List<ServerTranscriptHints> hints;

    @C09CT("transcript")
    public final String transcript;

    public IMVoiceTranscribeResponse() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMVoiceTranscribeResponse)) {
            return false;
        }
        IMVoiceTranscribeResponse iMVoiceTranscribeResponse = (IMVoiceTranscribeResponse) obj;
        return Intrinsics.LJFF(this.transcript, iMVoiceTranscribeResponse.transcript) && Intrinsics.LJFF(this.hints, iMVoiceTranscribeResponse.hints);
    }

    public final int hashCode() {
        return (this.transcript.hashCode() * 31) + this.hints.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMVoiceTranscribeResponse(transcript=");
        sbLIZ.append(this.transcript);
        sbLIZ.append(", hints=");
        sbLIZ.append(this.hints);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMVoiceTranscribeResponse(String str, List<ServerTranscriptHints> list) {
        this.transcript = str;
        this.hints = list;
    }

    public IMVoiceTranscribeResponse(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
