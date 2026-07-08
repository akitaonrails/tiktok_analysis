package com.ss.android.ugc.aweme.comment.audio.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentASRResponse extends BaseResponse {

    @C09CT("asr_lang")
    public final String asrLang;

    @C09CT("asr_status")
    public final Integer asrStatus;

    @C09CT("asr_text")
    public final String asrText;

    public CommentASRResponse() {
        this(null, null, null);
    }

    public CommentASRResponse(Integer num, String str, String str2) {
        this.asrStatus = num;
        this.asrText = str;
        this.asrLang = str2;
    }
}
