package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc;

import X.C1406010mgx;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpAboutThisProductHeaderCell extends PdpBridgeBaseCell<C1406010mgx, AboutThisProductHeaderVH> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b30;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeBaseCell
    public final AbsFullSpanVH R5(View view) {
        if (getCurrentFragment() != null) {
            return new AboutThisProductHeaderVH((ViewGroup) LJJIJL(), view);
        }
        throw new IllegalStateException("Fragment not found for PdpAboutThisProductHeaderCell. Ensure PowerList is properly attached to a Fragment.");
    }
}
