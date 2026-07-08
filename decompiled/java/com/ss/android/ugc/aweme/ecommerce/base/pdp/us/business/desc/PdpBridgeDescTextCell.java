package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc;

import X.C1406720mi6;
import X.C1752140vhE;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpBridgeDescTextCell extends PdpBridgeBaseCell<C1406720mi6, ProductDescTextViewHolderV2> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.aug;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        if (getCurrentFragment() != null) {
            return new ProductDescTextViewHolderV2((ViewGroup) LJJIJL(), view, new C1752140vhE(this));
        }
        throw new IllegalStateException("Fragment not found for PdpBridgeDescTextCell. Ensure PowerList is properly attached to a Fragment.");
    }
}
