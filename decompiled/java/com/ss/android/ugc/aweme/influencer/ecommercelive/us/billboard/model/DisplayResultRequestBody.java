package com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayResultRequestBody {

    @C09CT("author_id")
    public final String authorId;

    @C09CT("billboard_id_list")
    public final List<String> billboardIdList;

    @C09CT("billboard_type")
    public final Integer billboardType;

    @C09CT("result_type")
    public final Integer resultType;

    public DisplayResultRequestBody() {
        this(null, null, null, null);
    }

    public DisplayResultRequestBody(String str, List<String> list, Integer num, Integer num2) {
        this.authorId = str;
        this.billboardIdList = list;
        this.billboardType = num;
        this.resultType = num2;
    }
}
