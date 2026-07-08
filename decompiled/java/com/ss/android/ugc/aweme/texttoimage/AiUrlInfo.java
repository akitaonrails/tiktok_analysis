package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class AiUrlInfo {

    @C09CT("err_code")
    public final Integer errCode;

    @C09CT("status_code")
    public final Integer status;

    @C09CT("url")
    public final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public AiUrlInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public AiUrlInfo(String str, Integer num, Integer num2) {
        this.url = str;
        this.errCode = num;
        this.status = num2;
    }

    public /* synthetic */ AiUrlInfo(String str, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
