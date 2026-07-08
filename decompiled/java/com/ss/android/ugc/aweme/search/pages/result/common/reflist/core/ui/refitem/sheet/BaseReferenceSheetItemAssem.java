package com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.sheet;

import X.AbstractC434530H2d;
import X.C01GW;
import X.C427690Gpr;
import X.C452501pT;
import X.C786410Ut5;
import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.BaseReferenceItemAssem;
import irm.AkS78S0100000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseReferenceSheetItemAssem<T extends AbstractC434530H2d> extends BaseReferenceItemAssem<T> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS550S0100000_6((BaseReferenceSheetItemAssem) this, 566));
    public View LLJL;

    public abstract View sp(View view);

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C427690Gpr.LJ(view, 0.0f);
        C786410Ut5.I7(new AkS78S0100000_6(this, 21), view);
        this.LLJL = sp(view);
    }

    public final void tp(T t) {
        op(t);
        View view = this.LLJL;
        if (view != null) {
            int i = 0;
            if (t.getIndex() >= t.getItemCount() - 1) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }
}
