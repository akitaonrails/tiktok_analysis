package com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetByIdRequestBody {

    @C09CT("author_id")
    public final String authorId;

    @C09CT("billboard_id_list")
    public final List<String> billboardIdList;

    @C09CT("billboard_type")
    public final Integer billboardType;

    public GetByIdRequestBody() {
        this(null, null, null);
    }

    public GetByIdRequestBody(String str, List<String> list, Integer num) {
        this.authorId = str;
        this.billboardIdList = list;
        this.billboardType = num;
    }
}
