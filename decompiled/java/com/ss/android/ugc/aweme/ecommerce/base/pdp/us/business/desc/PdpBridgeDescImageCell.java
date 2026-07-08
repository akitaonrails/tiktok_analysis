package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc;

import X.C1406700mi4;
import X.C1752130vhD;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpBridgeDescImageCell extends PdpBridgeBaseCell<C1406700mi4, ProductDescImageViewHolderV2> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.aue;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        if (getCurrentFragment() != null) {
            return new ProductDescImageViewHolderV2((ViewGroup) LJJIJL(), view, new C1752130vhD(this));
        }
        throw new IllegalStateException("Fragment not found for PdpBridgeDescTextCell. Ensure PowerList is properly attached to a Fragment.");
    }
}
