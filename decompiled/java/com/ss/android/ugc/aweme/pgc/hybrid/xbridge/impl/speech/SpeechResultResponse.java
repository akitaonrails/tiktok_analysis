package com.ss.android.ugc.aweme.pgc.hybrid.xbridge.impl.speech;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class SpeechResultResponse {

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
