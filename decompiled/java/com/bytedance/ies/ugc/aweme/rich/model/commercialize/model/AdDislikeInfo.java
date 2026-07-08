package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AdDislikeInfo implements Serializable {

    @C09CT("sub_categories")
    public final List<Object> categoryList;

    @C09CT("enable_sub_category")
    public final int enable;

    public AdDislikeInfo() {
        this(0, null);
    }

    public AdDislikeInfo(int i, List<Object> list) {
        this.enable = i;
        this.categoryList = list;
    }
}
