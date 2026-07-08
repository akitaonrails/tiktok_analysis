package com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CreatorAddCheckRequest implements Serializable {

    @C09CT("group_id")
    public final String groupId;

    @C09CT("group_type")
    public final List<Integer> groupType;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("user_id")
    public final String userId;

    public CreatorAddCheckRequest() {
        this(null, null, null, null);
    }

    public CreatorAddCheckRequest(String str, String str2, List<Integer> list, String str3) {
        this.sellerId = str;
        this.groupId = str2;
        this.groupType = list;
        this.userId = str3;
    }
}
