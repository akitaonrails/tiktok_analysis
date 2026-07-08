package com.ss.android.ugc.aweme.comment.gift.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class GiftResult {
    public static final int $stable = 8;

    @C09CT("pages")
    public final List<GiftPage> giftPageList;

    public GiftResult(List<GiftPage> list) {
        this.giftPageList = list;
    }
}
