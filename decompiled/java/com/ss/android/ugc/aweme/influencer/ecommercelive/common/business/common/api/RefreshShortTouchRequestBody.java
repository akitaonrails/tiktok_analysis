package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RefreshShortTouchRequestBody {

    @C09CT("author_id")
    public final String authorId;

    @C09CT("refresh_items")
    public final List<String> refreshItems;

    @C09CT("room_id")
    public final String roomId;

    public RefreshShortTouchRequestBody(String str, String str2, List<String> list) {
        this.roomId = str;
        this.authorId = str2;
        this.refreshItems = list;
    }
}
