package com.ss.android.ugc.aweme.promote;

import X.InterfaceC2126708Uv;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes15.dex */
public class PromoteProgramResponse extends BaseResponse {

    @InterfaceC2126708Uv
    public Boolean confirmed = Boolean.FALSE;

    public boolean isConfirmedSuccess() {
        Boolean bool = this.confirmed;
        return bool != null && bool.booleanValue();
    }
}
