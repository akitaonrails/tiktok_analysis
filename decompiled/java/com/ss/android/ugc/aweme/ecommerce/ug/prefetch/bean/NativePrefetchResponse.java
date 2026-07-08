package com.ss.android.ugc.aweme.ecommerce.ug.prefetch.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;

/* JADX INFO: loaded from: classes3.dex */
public final class NativePrefetchResponse<T> extends Response<T> {

    @C09CT("timestamp")
    public final Long timestamp;

    public NativePrefetchResponse(int i, String str, T t) {
        super(i, str, t, null, null);
    }
}
