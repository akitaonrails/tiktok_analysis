package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku;

import X.C1003703wB;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpBridgeSkuCell extends PdpBridgeBaseCell<C1003703wB, UsSkuVH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b3a;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            return new UsSkuVH(view, (ECBaseFragment) currentFragment);
        }
        throw new IllegalStateException("Fragment not found for PdpBridgeSkuCell. Ensure PowerList is properly attached to a Fragment.");
    }
}
