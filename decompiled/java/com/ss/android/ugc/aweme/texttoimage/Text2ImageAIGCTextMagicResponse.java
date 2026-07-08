package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class Text2ImageAIGCTextMagicResponse {

    @C09CT("err_code")
    public final int errCode;

    @C09CT("status_code")
    public final Integer status;

    /* JADX WARN: Multi-variable type inference failed */
    public Text2ImageAIGCTextMagicResponse() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public Text2ImageAIGCTextMagicResponse(Integer num, int i) {
        this.status = num;
        this.errCode = i;
    }

    public /* synthetic */ Text2ImageAIGCTextMagicResponse(Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? 0 : i);
    }
}
