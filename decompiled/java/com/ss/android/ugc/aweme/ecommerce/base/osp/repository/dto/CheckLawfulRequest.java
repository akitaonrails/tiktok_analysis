package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckLawfulRequest {

    @C09CT("phone_credit")
    public final PhoneCredit phoneCredit;

    @C09CT("type")
    public final Integer type;

    public CheckLawfulRequest(Integer num, PhoneCredit phoneCredit) {
        this.type = num;
        this.phoneCredit = phoneCredit;
    }
}
