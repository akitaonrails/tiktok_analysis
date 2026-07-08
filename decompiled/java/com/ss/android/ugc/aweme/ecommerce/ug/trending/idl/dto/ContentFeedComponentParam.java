package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class ContentFeedComponentParam implements Serializable {

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("exposure_item_list")
    public final List<Feed> exposureItemList;

    @C09CT("size")
    public final Integer size;

    public ContentFeedComponentParam() {
        this(null, null, null);
    }

    public ContentFeedComponentParam(Integer num, Integer num2, List<Feed> list) {
        this.size = num;
        this.cursor = num2;
        this.exposureItemList = list;
    }
}
