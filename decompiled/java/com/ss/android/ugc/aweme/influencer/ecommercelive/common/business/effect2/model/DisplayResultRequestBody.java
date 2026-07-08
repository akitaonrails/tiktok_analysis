package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayResultRequestBody {

    @C09CT("author_id")
    public final String authorId;

    @C09CT("billboard_id_list")
    public final List<String> billboardIdList;

    @C09CT("billboard_type")
    public final int billboardType;

    @C09CT("result_type")
    public final int resultType;

    public DisplayResultRequestBody(String str, List<String> list, int i, int i2) {
        this.authorId = str;
        this.billboardIdList = list;
        this.billboardType = i;
        this.resultType = i2;
    }
}
