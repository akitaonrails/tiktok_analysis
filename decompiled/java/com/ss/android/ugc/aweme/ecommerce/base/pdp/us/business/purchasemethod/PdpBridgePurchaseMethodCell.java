package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.purchasemethod;

import X.C1024203zU;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpBridgePurchaseMethodCell extends PdpBridgeBaseCell<C1024203zU, PdpPurchaseMethodVH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.at0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            return new PdpPurchaseMethodVH((ViewGroup) LJJIJL(), (ECBaseFragment) currentFragment, view);
        }
        throw new IllegalStateException("Fragment not found for PdpBridgePurchaseMethodCell. Ensure PowerList is properly attached to a Fragment.");
    }
}
