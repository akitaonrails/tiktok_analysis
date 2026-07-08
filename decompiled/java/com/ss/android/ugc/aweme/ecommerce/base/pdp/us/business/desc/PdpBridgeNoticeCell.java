package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc;

import X.C1406500mhk;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpBridgeNoticeCell extends PdpBridgeBaseCell<C1406500mhk, ProductNoticeViewHolderV2> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.auf;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            return new ProductNoticeViewHolderV2((ViewGroup) LJJIJL(), (ECBaseFragment) currentFragment, view);
        }
        throw new IllegalStateException("Fragment not found for PdpBridgeNoticeCell. Ensure PowerList is properly attached to a Fragment.");
    }
}
