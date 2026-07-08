package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoWaitingListCard implements Serializable {
    public static final int $stable = 0;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("tako_user_amount")
    public final String takoUserAmount;

    public TakoWaitingListCard(String str, String str2) {
        this.takoUserAmount = str;
        this.imageUrl = str2;
    }
}
