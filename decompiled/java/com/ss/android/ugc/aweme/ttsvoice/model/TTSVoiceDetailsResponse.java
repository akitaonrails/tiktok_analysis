package com.ss.android.ugc.aweme.ttsvoice.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class TTSVoiceDetailsResponse {

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("tts_voices")
    public final List<TTSVoiceStruct> ttsVoiceStruct;

    public TTSVoiceDetailsResponse() {
        this(null, null, null, 7, null);
    }

    public TTSVoiceDetailsResponse(Integer num, String str, List<TTSVoiceStruct> list) {
        this.statusCode = num;
        this.statusMsg = str;
        this.ttsVoiceStruct = list;
    }

    public TTSVoiceDetailsResponse(Integer num, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
