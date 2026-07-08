package com.ss.android.ugc.aweme.im.b2c.actionbar;

import X.C09CT;
import com.ss.android.ugc.aweme.im.b2c.platformization.ConvContext;

/* JADX INFO: loaded from: classes3.dex */
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
