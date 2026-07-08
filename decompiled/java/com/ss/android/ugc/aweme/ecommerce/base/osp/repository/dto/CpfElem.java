package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class CpfElem {

    @C09CT("encrypt_code")
    public String encryptCode;

    @C09CT("hash_id")
    public Long hashId;

    @C09CT("mask_code")
    public String maskCode;

    public CpfElem() {
    }

    public CpfElem(String str, String str2, Long l) {
        this.encryptCode = str;
        this.maskCode = str2;
        this.hashId = l;
    }
}
