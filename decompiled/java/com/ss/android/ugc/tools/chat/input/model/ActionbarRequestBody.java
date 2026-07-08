package com.ss.android.ugc.tools.chat.input.model;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class ActionbarRequestBody {

    @C09CT("conv_ctx")
    public final ConvContext contxt;

    @C09CT("extra")
    public final String extra;

    public ActionbarRequestBody(ConvContext convContext, String str) {
        this.contxt = convContext;
        this.extra = str;
    }
}
