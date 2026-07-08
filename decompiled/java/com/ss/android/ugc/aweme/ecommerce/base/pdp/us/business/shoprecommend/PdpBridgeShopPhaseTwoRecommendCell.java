package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shoprecommend;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpBridgeShopPhaseTwoRecommendCell extends PdpBridgeBaseCell<ShopRecommendVO, PdpShopPhaseTwoRecommendVH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.atd;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            return new PdpShopPhaseTwoRecommendVH((ViewGroup) LJJIJL(), (ECBaseFragment) currentFragment, view);
        }
        throw new IllegalStateException("Fragment not found for PdpBridgeShopPhaseTwoRecommendCell. Ensure PowerList is properly attached to a Fragment.");
    }
}
