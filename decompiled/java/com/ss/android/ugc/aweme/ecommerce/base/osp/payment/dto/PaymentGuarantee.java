package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDescBlock;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentGuarantee {

    @C09CT("block_list")
    public List<UserRightDescBlock> blockList;

    @C09CT("title")
    public String title;

    public PaymentGuarantee() {
    }

    public PaymentGuarantee(String str, List<UserRightDescBlock> list) {
        this.title = str;
        this.blockList = list;
    }
}
