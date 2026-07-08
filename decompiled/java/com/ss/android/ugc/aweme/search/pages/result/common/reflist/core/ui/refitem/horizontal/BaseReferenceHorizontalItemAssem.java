package com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.horizontal;

import X.C21565319aV;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C786410Ut5;
import X.InterfaceC434580H2i;
import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.BaseReferenceItemAssem;
import irm.AkS78S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseReferenceHorizontalItemAssem<T extends InterfaceC434580H2i> extends BaseReferenceItemAssem<T> {
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C427690Gpr.LJ(view, 0.0f);
        C786410Ut5.I7(new AkS78S0100000_6(this, 21), view);
        C21565319aV.LIZIZ(view, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
        C427690Gpr.LJ(view, C418440Gaw.LIZIZ(8));
    }
}
