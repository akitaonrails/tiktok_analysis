package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.bundledeal;

import X.C04A0;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpBundleDealCell extends PdpBridgeBaseCell<C04A0, PdpBundleDealVH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ar8;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        return new PdpBundleDealVH(view, (ViewGroup) LJJIJL());
    }
}
