package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMinis implements Serializable {

    @C09CT("card_text_list")
    public final List<CardText> cardTextList;

    @C09CT("minis_card_title")
    public final String minisCardTitle;

    @C09CT("minis_list")
    public final List<SearchMinisItem> minisItems;

    public SearchMinis() {
        this(null, null, null, 7, null);
    }

    public SearchMinis(String str, List<SearchMinisItem> list, List<CardText> list2) {
        this.minisCardTitle = str;
        this.minisItems = list;
        this.cardTextList = list2;
    }

    public SearchMinis(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
