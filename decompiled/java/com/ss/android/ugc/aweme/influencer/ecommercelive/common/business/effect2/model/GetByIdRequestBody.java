package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetByIdRequestBody {

    @C09CT("author_id")
    public final String authorId;

    @C09CT("billboard_id_list")
    public final List<String> billboardIdList;

    @C09CT("billboard_type")
    public final int billboardType;

    public GetByIdRequestBody(String str, List<String> list, int i) {
        this.authorId = str;
        this.billboardIdList = list;
        this.billboardType = i;
    }
}
