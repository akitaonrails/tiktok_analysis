package com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment;

import X.C1559260qg8;
import X.C1711100ud2;
import X.C1711380udU;
import X.C197039127h;
import X.C723590SZx;
import X.C724240Sb0;
import X.C786410Ut5;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import wh6.AbS705S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class AutofillSecondaryAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1711100ud2.class, null), checkSupervisorPrepared());
    public RecyclerView LLJ;
    public C197039127h LLJI;
    public C1711380udU LLJIJIL;

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        AutofillSecondaryFragment autofillSecondaryFragment;
        ArrayList arrayList;
        String str;
        AutofillApi.CardNumberList cardNumberList;
        AutofillApi.CardNumberItem cardNumberItem;
        AutofillApi.CardNumberList cardNumberList2;
        ArrayList<AutofillApi.CardNumberItem> arrayList2;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        View viewFindViewById = null;
        if (fragmentLJI instanceof AutofillSecondaryFragment) {
            autofillSecondaryFragment = (AutofillSecondaryFragment) fragmentLJI;
        } else {
            autofillSecondaryFragment = null;
        }
        this.LLJIJIL = new C1711380udU(autofillSecondaryFragment);
        View viewFindViewById2 = this.LLJ;
        if (viewFindViewById2 == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById2 = viewLJJIJL.findViewById(R.id.t0h);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJ = (RecyclerView) viewFindViewById2;
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.LLJIJIL);
            recyclerView.setItemAnimator(null);
        }
        C1711380udU c1711380udU = this.LLJIJIL;
        if (c1711380udU != null) {
            C1711100ud2 c1711100ud2 = (C1711100ud2) this.LLIZLLLIL.getValue();
            if (c1711100ud2 != null && (cardNumberList2 = c1711100ud2.LLILLL) != null && (arrayList2 = cardNumberList2.LIZIZ) != null) {
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = new ArrayList();
            }
            c1711380udU.LLILLJJLI = arrayList;
            C1711100ud2 c1711100ud22 = (C1711100ud2) this.LLIZLLLIL.getValue();
            if (c1711100ud22 == null || (cardNumberList = c1711100ud22.LLILLL) == null || (cardNumberItem = cardNumberList.LIZ) == null || (str = cardNumberItem.instrumentId) == null) {
                str = "";
            }
            c1711380udU.LLILLL = str;
        }
        View view2 = this.LLJI;
        if (view2 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById = viewLJJIJL2.findViewById(R.id.cal);
            }
            this.LLJI = (C197039127h) viewFindViewById;
            view2 = viewFindViewById;
            if (viewFindViewById == null) {
                return;
            }
        }
        C786410Ut5.I7(new AbS705S0100000_26(this, 24), view2);
    }
}
