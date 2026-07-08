package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop;

import X.C703602os;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpBridgeSESShopPerfCell extends PdpBridgeBaseCell<C703602os, USSESShopPerfVH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.atw;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        return new USSESShopPerfVH(view, (ViewGroup) LJJIJL());
    }
}
