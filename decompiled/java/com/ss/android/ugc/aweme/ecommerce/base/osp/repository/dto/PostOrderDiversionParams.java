package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PostOrderDiversionParams {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("post_order_diversion_type")
    public final Integer postOrderDiversionType;

    @C09CT("post_order_divert_2_mall_params")
    public final PostOrderDivert2MallParams postOrderDivert2MallParams;

    public PostOrderDiversionParams() {
        this(null, null);
    }

    public PostOrderDiversionParams(Integer num, PostOrderDivert2MallParams postOrderDivert2MallParams) {
        this.postOrderDiversionType = num;
        this.postOrderDivert2MallParams = postOrderDivert2MallParams;
    }
}
