package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.quotelink.ui;

import X.C01GW;
import X.C07E5;
import X.C1558520qew;
import X.C452501pT;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchUIComponentScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchUIComponentService$QuoteLinkAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchQuoteLinkReusedAssem extends ReusedUISlotAssem<SearchQuoteLinkReusedAssem> implements SearchUIComponentService$QuoteLinkAbility {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 539));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
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

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }
}
