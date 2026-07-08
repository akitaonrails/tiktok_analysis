package com.ss.android.ugc.aweme.voiceconversion.model;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class VoiceConversionDetailsResponse {

    @C09CT("vc_filter_info")
    public final VoiceConversionStruct info;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("vc_filter_videolist")
    public final VoiceConversionStruct videoDetail;

    public VoiceConversionDetailsResponse() {
        this(0, "", null, null);
    }

    public VoiceConversionDetailsResponse(Integer num, String str, VoiceConversionStruct voiceConversionStruct, VoiceConversionStruct voiceConversionStruct2) {
        this.statusCode = num;
        this.statusMsg = str;
        this.info = voiceConversionStruct;
        this.videoDetail = voiceConversionStruct2;
    }
}
