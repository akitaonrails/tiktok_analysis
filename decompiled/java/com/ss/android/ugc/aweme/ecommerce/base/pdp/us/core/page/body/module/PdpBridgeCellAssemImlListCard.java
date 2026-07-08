package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module;

import X.C1753050vih;
import X.InterfaceC1891350zJl;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpBridgeCellAssemImlListCard<ITEM extends InterfaceC1891350zJl, VH extends AbsFullSpanVH<ITEM>> extends PdpBridgeCellAssemListCard<PdpBridgeCellAssemImlListCard<ITEM, VH>, ITEM> {
    public final int LLLFZ;
    public final Function1<View, VH> LLLI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return this.LLLFZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeCellAssemListCard
    public final AbsFullSpanVH<ITEM> zp(View view) {
        return this.LLLI.invoke(view);
    }

    public PdpBridgeCellAssemImlListCard(int i, C1753050vih c1753050vih) {
        this.LLLFZ = i;
        this.LLLI = c1753050vih;
    }
}
