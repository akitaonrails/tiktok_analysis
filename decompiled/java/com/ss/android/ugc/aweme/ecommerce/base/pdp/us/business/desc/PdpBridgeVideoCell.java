package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc;

import X.C1406570mhr;
import X.C1752100vhA;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpBridgeVideoCell extends PdpBridgeBaseCell<C1406570mhr, ProductDescVideoViewHolder> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.asj;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            return new ProductDescVideoViewHolder((ViewGroup) LJJIJL(), (ECBaseFragment) currentFragment, view, new C1752100vhA(this));
        }
        throw new IllegalStateException("Fragment not found for PdpBridgeVideoCell. Ensure PowerList is properly attached to a Fragment.");
    }
}
