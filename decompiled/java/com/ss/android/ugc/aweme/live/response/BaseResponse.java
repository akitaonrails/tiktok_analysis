package com.ss.android.ugc.aweme.live.response;

import X.C09CT;
import com.ss.android.ugc.aweme.live.response.Extra;

/* JADX INFO: loaded from: classes17.dex */
public class BaseResponse<T, R extends Extra> {

    @C09CT("data")
    public T data;

    @C09CT("extra")
    public R extra;

    @C09CT("status_code")
    public int statusCode;
}
