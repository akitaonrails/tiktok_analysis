package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class ConsentInfo {

    @C09CT("collection_flow")
    public String collectionFlow;

    @C09CT("collection_point")
    public String collectionPoint;

    @C09CT("key")
    public String key;

    public ConsentInfo() {
    }

    public ConsentInfo(String str, String str2, String str3) {
        this.key = str;
        this.collectionFlow = str2;
        this.collectionPoint = str3;
    }
}
