package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark;

import X.C1755400vmU;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpBridgeLynxCell extends PdpBridgeBaseCell<C1755400vmU, PdpSparkLiteCardHolder> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.arf;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        PdpSparkLiteCardHolder pdpSparkLiteCardHolder = new PdpSparkLiteCardHolder((ViewGroup) LJJIJL(), (ViewGroup) view);
        getLifecycle().addObserver(new PdpBridgeLynxCell$createViewHolder$1$1(pdpSparkLiteCardHolder));
        return pdpSparkLiteCardHolder;
    }
}
