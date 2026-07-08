package com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.common.ui;

import X.C1591860rWi;
import X.C418040GaI;
import X.EnumC656860Ppc;
import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes11.dex */
public final class AggregatedVideoBottomAssem extends SearchCardBottomBarAssem {
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem
    public final EnumC656860Ppc yp() {
        return EnumC656860Ppc.NONE;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Integer num = 0;
        if (num.intValue() > 0) {
            num.intValue();
            View viewFindViewById = view.findViewById(R.id.fmz);
            if (viewFindViewById != null) {
                C1591860rWi.LJFF((int) C418040GaI.LIZ(4), viewFindViewById);
            }
        }
    }
}
