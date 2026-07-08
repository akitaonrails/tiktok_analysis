package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.divider;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.divider.DividerVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.divider.DividerVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpBridgeDividerCell extends PdpBridgeBaseCell<DividerVO, DividerVH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.arg;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        ViewGroup viewGroup = (ViewGroup) LJJIJL();
        getCurrentFragment();
        return new DividerVH(viewGroup, view);
    }
}
