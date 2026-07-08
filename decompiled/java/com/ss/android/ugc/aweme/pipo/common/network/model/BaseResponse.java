package com.ss.android.ugc.aweme.pipo.common.network.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class BaseResponse<T> {

    @C09CT("data")
    public T data;

    @C09CT("error_code")
    public String errorCode;

    @C09CT("error_content")
    public String errorContent;

    @C09CT("error_message")
    public String errorMessage;

    @C09CT("interface_version")
    public String interfaceVersion;

    @C09CT("pipo_error_action")
    public final String pipoErrorAction;

    @C09CT("result_code")
    public String resultCode;

    public final boolean LIZ() {
        return Intrinsics.LJFF(this.resultCode, "success");
    }
}
