package com.ss.android.ugc.aweme.ecommerce.search.vision.repo;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DailyHistoryModel {

    @C09CT("group_key")
    public final String groupName;

    @C09CT("products")
    public final List<HistoryProduct> products;

    public DailyHistoryModel(String str, List<HistoryProduct> list) {
        this.groupName = str;
        this.products = list;
    }
}
