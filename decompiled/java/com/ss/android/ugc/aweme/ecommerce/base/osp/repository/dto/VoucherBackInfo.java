package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: loaded from: classes2.dex */
public final class VoucherBackInfo {

    @C09CT("desc")
    public ECRichText desc;

    public VoucherBackInfo() {
    }

    public VoucherBackInfo(ECRichText eCRichText) {
        this.desc = eCRichText;
    }
}
