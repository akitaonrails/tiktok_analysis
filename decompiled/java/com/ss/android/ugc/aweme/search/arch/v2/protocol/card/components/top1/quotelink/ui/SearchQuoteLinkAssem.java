package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.quotelink.ui;

import X.C01GW;
import X.C1558520qew;
import X.C452501pT;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchUIComponentScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchUIComponentService$QuoteLinkAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchQuoteLinkAssem extends UISlotAssem implements SearchUIComponentService$QuoteLinkAbility {
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 538));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.f2r;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1558520qew.LJI(this, SearchUIComponentScope.class, this, SearchUIComponentService$QuoteLinkAbility.class, null, null);
    }
}
