package com.ss.android.ugc.aweme.groupcreation.assem;

import X.C01GW;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1383370m6R;
import X.C1509305vX;
import X.C1527305yR;
import X.C1559260qg8;
import X.C723590SZx;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class UnifiedCreateGroupNavAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1527305yR.class, null), checkSupervisorPrepared());
    public final C01GW LLJ = C1509305vX.LIZ(new AwS546S0100000_2(this, 231));

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        super.onViewCreated(view);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context)) != null) {
            ((TuxNavBar) this.LLJ.getValue()).setNavBackground(numLIZJ.intValue());
        }
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJ.getValue();
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS546S0100000_2(this, 912));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = C1383370m6R.LJIIJ(2131831123);
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
    }
}
