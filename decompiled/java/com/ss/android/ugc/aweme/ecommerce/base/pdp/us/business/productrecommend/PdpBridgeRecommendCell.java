package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpBridgeRecommendCell extends PdpBridgeBaseCell<ProductRecommendVO, PdpProductRecommendVH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.asw;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        if (getCurrentFragment() != null) {
            return new PdpProductRecommendVH((ViewGroup) LJJIJL(), view);
        }
        throw new IllegalStateException("Fragment not found for PdpBridgeRecommendCell. Ensure PowerList is properly attached to a Fragment.");
    }
}
