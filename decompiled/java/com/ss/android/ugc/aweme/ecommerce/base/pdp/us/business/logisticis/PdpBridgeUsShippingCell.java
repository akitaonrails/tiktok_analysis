package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.logisticis;

import X.C811903Fd;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpBridgeUsShippingCell extends PdpBridgeBaseCell<C811903Fd, UsShippingVH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b3_;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            return new UsShippingVH((ViewGroup) LJJIJL(), (ECBaseFragment) currentFragment, view);
        }
        throw new IllegalStateException("Fragment not found for PdpBridgeShippingCell. Ensure PowerList is properly attached to a Fragment.");
    }
}
