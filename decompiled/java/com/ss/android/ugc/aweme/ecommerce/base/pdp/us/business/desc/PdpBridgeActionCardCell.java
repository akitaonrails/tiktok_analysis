package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc;

import X.C1406490mhj;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpBridgeActionCardCell extends PdpBridgeBaseCell<C1406490mhj, ProductActionCardViewHolder> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.aud;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        return new ProductActionCardViewHolder(view, (ViewGroup) LJJIJL());
    }
}
