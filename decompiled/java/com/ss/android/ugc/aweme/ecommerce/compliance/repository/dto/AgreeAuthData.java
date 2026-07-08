package com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class AgreeAuthData {

    @C09CT("auth_target")
    public final Integer authTarget;

    @C09CT("success")
    public final Boolean isSuccess;

    public AgreeAuthData() {
        this(null, null);
    }

    public AgreeAuthData(Boolean bool, Integer num) {
        this.isSuccess = bool;
        this.authTarget = num;
    }
}
