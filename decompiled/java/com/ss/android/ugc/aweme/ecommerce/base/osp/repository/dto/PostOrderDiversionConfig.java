package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PostOrderDiversionConfig {

    @C09CT("post_order_diversion_schema")
    public final String postOrderDiversionSchema;

    @C09CT("post_order_diversion_type")
    public final Integer postOrderDiversionType;

    public PostOrderDiversionConfig(Integer num, String str) {
        this.postOrderDiversionType = num;
        this.postOrderDiversionSchema = str;
    }
}
