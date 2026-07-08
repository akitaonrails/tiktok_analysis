package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.spotlight.SpotlightVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.spotlight.SpotlightVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpBridgeSpotlightCell extends PdpBridgeBaseCell<SpotlightVO, SpotlightVH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ay8;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        return new SpotlightVH(view, (ViewGroup) LJJIJL());
    }
}
