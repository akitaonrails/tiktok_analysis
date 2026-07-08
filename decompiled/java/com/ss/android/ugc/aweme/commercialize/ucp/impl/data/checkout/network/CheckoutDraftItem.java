package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutDraftItem {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("title")
    public final String title;

    public CheckoutDraftItem() {
        this(null, null, null);
    }

    public CheckoutDraftItem(String str, String str2, String str3) {
        this.id = str;
        this.title = str2;
        this.imageUrl = str3;
    }
}
