package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.skeleton;

import X.C747502vx;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpBridgeSkeletonCell extends PdpBridgeBaseCell<C747502vx, PdpGlobalSkeletonVH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ath;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        return new PdpGlobalSkeletonVH(view, (ViewGroup) LJJIJL());
    }
}
