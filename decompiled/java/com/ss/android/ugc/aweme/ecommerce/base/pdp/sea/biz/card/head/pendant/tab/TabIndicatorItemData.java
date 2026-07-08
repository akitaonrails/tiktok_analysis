package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.pendant.tab;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class TabIndicatorItemData {

    @C09CT("da_info")
    public final Map<String, Object> daInfo;

    @C09CT("detail_page")
    public final DetailPage detailPage;

    @C09CT("group")
    public final String group;

    @C09CT("items")
    public final List<String> items;

    public TabIndicatorItemData(String str, List<String> list, DetailPage detailPage, Map<String, ? extends Object> map) {
        this.group = str;
        this.items = list;
        this.detailPage = detailPage;
        this.daInfo = map;
    }
}
