package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes34.dex */
public final class PdpBridgeSESSellerCell extends PdpBridgeBaseCell<USSESSellerModuleVO, AbsFullSpanVH<USSESSellerModuleVO>> {
    public int LLIZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        switch (this.LLIZ) {
            case 55002:
                return R.layout.atu;
            case 55003:
                return R.layout.atv;
            default:
                return R.layout.att;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH<USSESSellerModuleVO> R5(View view) {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            switch (this.LLIZ) {
                case 55002:
                    return new USSESSellerModuleV2VH((ViewGroup) LJJIJL(), (ECBaseFragment) currentFragment, view);
                case 55003:
                    return new USSESSellerModuleV3VH((ViewGroup) LJJIJL(), (ECBaseFragment) currentFragment, view);
                default:
                    return new USSESSellerModuleVH((ViewGroup) LJJIJL(), (ECBaseFragment) currentFragment, view);
            }
        }
        throw new IllegalStateException("Fragment not found for PdpBridgeSESSellerCell. Ensure PowerList is properly attached to a Fragment.");
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup, int i) {
        this.LLIZ = i;
        return onCreateItemView(viewGroup);
    }
}
