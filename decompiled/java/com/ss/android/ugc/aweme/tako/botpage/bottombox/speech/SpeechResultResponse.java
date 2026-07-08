package com.ss.android.ugc.aweme.tako.botpage.bottombox.speech;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.InterfaceC0189004d;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SpeechResultResponse implements InterfaceC0189004d {

    @C09CT("code")
    public final int code;

    @C09CT("message")
    public final String message;

    @C09CT("reqid")
    public final String requestId;

    @C09CT("result")
    public final List<SpeechResult> result;

    @C09CT("sequence")
    public final int sequence;

    public SpeechResultResponse() {
        this(null, 0, null, 0, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeechResultResponse)) {
            return false;
        }
        SpeechResultResponse speechResultResponse = (SpeechResultResponse) obj;
        return Intrinsics.LJFF(this.requestId, speechResultResponse.requestId) && this.code == speechResultResponse.code && Intrinsics.LJFF(this.message, speechResultResponse.message) && this.sequence == speechResultResponse.sequence && Intrinsics.LJFF(this.result, speechResultResponse.result);
    }

    public final int hashCode() {
        return (((((((this.requestId.hashCode() * 31) + this.code) * 31) + this.message.hashCode()) * 31) + this.sequence) * 31) + this.result.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpeechResultResponse(requestId=");
        sbLIZ.append(this.requestId);
        sbLIZ.append(", code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", sequence=");
        sbLIZ.append(this.sequence);
        sbLIZ.append(", result=");
        sbLIZ.append(this.result);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC0189004d
    public final String getRequestId() {
        return this.requestId;
    }

    @Override // X.InterfaceC0189004d
    public final List<SpeechResult> getResultList() {
        return this.result;
    }

    public SpeechResultResponse(String str, int i, String str2, int i2, List<SpeechResult> list) {
        this.requestId = str;
        this.code = i;
        this.message = str2;
        this.sequence = i2;
        this.result = list;
    }

    public SpeechResultResponse(String str, int i, String str2, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? str2 : "", (i3 & 8) == 0 ? i2 : 0, (i3 & 16) != 0 ? C13BV.INSTANCE : list);
    }
}
