package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpBridgeHighlightCell extends PdpBridgeBaseCell<ProductHighlightVO, ProductHighlightVH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.arf;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        if (getCurrentFragment() != null) {
            return new ProductHighlightVH((ViewGroup) LJJIJL(), view);
        }
        throw new IllegalStateException("Fragment not found for PdpBridgeHeaderCell. Ensure PowerList is properly attached to a Fragment.");
    }
}
