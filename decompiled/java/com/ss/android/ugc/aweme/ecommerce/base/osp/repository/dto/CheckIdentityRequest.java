package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckIdentityRequest {

    @C09CT("identity_info_option")
    public final IdentityInfoOption identityInfoOption;

    public CheckIdentityRequest() {
        this(null);
    }

    public CheckIdentityRequest(IdentityInfoOption identityInfoOption) {
        this.identityInfoOption = identityInfoOption;
    }
}
