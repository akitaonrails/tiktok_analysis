package com.ss.android.ugc.gamora.editor.sticker.inspiration.api;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class RequestLabelResponse {

    @C09CT("labels")
    public final List<String> labels;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public RequestLabelResponse(List<String> list, Integer num, String str) {
        this.labels = list;
        this.statusCode = num;
        this.statusMsg = str;
    }
}
