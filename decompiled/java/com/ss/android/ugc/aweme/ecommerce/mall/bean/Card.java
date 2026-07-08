package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Card {

    @C09CT("style")
    public String style;

    @C09CT("tip_list")
    public List<CardTip> tipList;

    @C09CT("type")
    public int type;

    public Card(int i, String str, List<CardTip> list) {
        this.type = i;
        this.style = str;
        this.tipList = list;
    }
}
