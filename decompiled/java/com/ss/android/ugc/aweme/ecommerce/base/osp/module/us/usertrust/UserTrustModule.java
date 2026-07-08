package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class UserTrustModule {

    @C09CT("items")
    public List<UserTrustItem> userTrustItems;

    public UserTrustModule() {
        this(null);
    }

    public UserTrustModule(List<UserTrustItem> list) {
        this.userTrustItems = list;
    }
}
