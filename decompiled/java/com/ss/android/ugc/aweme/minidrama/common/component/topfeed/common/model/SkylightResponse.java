package com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightResponse {

    @C09CT("skylight_model")
    public final SkylightBlocks skylightBlocks;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public SkylightResponse(Integer num, String str, SkylightBlocks skylightBlocks) {
        this.statusCode = num;
        this.statusMsg = str;
        this.skylightBlocks = skylightBlocks;
    }
}
