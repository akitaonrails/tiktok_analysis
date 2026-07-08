package com.ss.android.ugc.aweme.localservice.live.common.api.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class ProductDelRequest implements Serializable {

    @C09CT("product_id_list")
    public final List<String> productIdList;

    @C09CT("room_id")
    public final String roomId;

    @C09CT("select_all")
    public final Boolean selectAll;

    @C09CT("UserId")
    public final String userId;

    public ProductDelRequest() {
        this(null, null, null, null);
    }

    public ProductDelRequest(String str, List<String> list, Boolean bool, String str2) {
        this.roomId = str;
        this.productIdList = list;
        this.selectAll = bool;
        this.userId = str2;
    }
}
