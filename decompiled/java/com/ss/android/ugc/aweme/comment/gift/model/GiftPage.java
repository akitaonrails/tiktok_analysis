package com.ss.android.ugc.aweme.comment.gift.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class GiftPage {
    public static final int $stable = 8;

    @C09CT("gifts")
    public final List<GiftStruct> giftList;

    @C09CT("page_type")
    public final int giftPageType;

    @C09CT("page_name")
    public final String pageName;

    public GiftPage(String str, List<GiftStruct> list, int i) {
        this.pageName = str;
        this.giftList = list;
        this.giftPageType = i;
    }
}
