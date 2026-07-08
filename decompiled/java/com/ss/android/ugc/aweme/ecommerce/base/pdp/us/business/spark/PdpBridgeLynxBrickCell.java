package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark;

import X.C1752600vhy;
import X.C1752630vi1;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpBridgeLynxBrickCell extends PdpBridgeBaseCell<C1752600vhy, PdpLynxCardVH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.arf;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            return new PdpLynxCardVH((ViewGroup) LJJIJL(), currentFragment, view);
        }
        throw new IllegalStateException("Fragment not found for PdpBridgeLynxBrickCell. Ensure PowerList is properly attached to a Fragment.");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell, com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            this.LL = new C1752630vi1(viewGroup.getContext(), currentFragment);
            Sl0(LJJIJL(), this);
            return LJJIJL();
        }
        throw new IllegalStateException("Fragment not found for PdpBridgeLynxBrickCell. Ensure PowerList is properly attached to a Fragment.");
    }
}
