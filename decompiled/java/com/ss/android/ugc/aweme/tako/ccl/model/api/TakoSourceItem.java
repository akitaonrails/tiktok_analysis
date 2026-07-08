package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSourceItem {

    @C09CT("good")
    public final TakoProductItem goods;

    @C09CT("link")
    public TakoLinkItem link;

    @C09CT("rank")
    public final int rank;

    @C09CT("source_type")
    public final int type;

    @C09CT("user")
    public final TakoUserItem user;

    @C09CT("item")
    public TakoVideoItem video;

    public TakoSourceItem() {
        this(0, -1, null, null, null, null);
    }

    public TakoSourceItem(int i, int i2, TakoLinkItem takoLinkItem, TakoVideoItem takoVideoItem, TakoUserItem takoUserItem, TakoProductItem takoProductItem) {
        this.rank = i;
        this.type = i2;
        this.link = takoLinkItem;
        this.video = takoVideoItem;
        this.user = takoUserItem;
        this.goods = takoProductItem;
    }
}
