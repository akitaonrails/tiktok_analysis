package com.ss.android.ugc.aweme.ecommerce.search.cart.repo;

import X.C11NZ;
import X.C683400QrK;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.ecommerce.search.cart.model.SearchCartEntry;

/* JADX INFO: loaded from: classes11.dex */
public interface SearchCartApi {
    public static final C683400QrK LIZ = C683400QrK.LIZ;

    @InterfaceC1501160pAQ("/aweme/v1/search/cart_entry/ecom/")
    C11NZ<SearchCartEntry> searchCartEntryEcom(@InterfaceC1501070pAH("search_channel") String str);
}
