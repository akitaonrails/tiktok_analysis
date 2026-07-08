package com.ss.android.ugc.aweme.multi.maker;

import android.os.Bundle;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpCustomPreloadTask;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class ShopWindowAnchorCustomPreloadTask extends AbsFcpCustomPreloadTask {
    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public String componentKey() {
        return "anchor_complex_shop";
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public List<String> urlList() {
        return Collections.singletonList("/api/v1/shop/item/product_info/get");
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask, X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        boolean z;
        if (bundle != null) {
            z = bundle.getBoolean("is_single_anchor");
        } else {
            z = false;
        }
        return !z;
    }
}
