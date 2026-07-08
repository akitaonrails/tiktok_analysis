package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class AddOnWriteImpressionResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("code")
    public final Integer code;

    @C09CT("message")
    public final String message;

    public AddOnWriteImpressionResponse(Integer num, String str) {
        this.code = num;
        this.message = str;
    }
}
