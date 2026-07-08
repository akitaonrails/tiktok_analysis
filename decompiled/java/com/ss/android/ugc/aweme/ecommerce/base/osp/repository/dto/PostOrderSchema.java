package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PostOrderSchema {

    @C09CT("page_type")
    public final Integer pageType;

    @C09CT("schema")
    public final String schema;

    public PostOrderSchema(Integer num, String str) {
        this.pageType = num;
        this.schema = str;
    }
}
