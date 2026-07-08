package com.ss.android.ugc.aweme.chatdetail.redesign.operation.changename.assem;

import X.C01GW;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1383370m6R;
import X.C1509305vX;
import X.C723580SZw;
import X.C910030Zmz;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class EditGroupNameNavAssem extends UIContentAssem {
    public final C01GW LLIZLLLIL;

    public EditGroupNameNavAssem() {
        checkSupervisorPrepared();
        new C723580SZw(this, C910030Zmz.class, null);
        this.LLIZLLLIL = C1509305vX.LIZ(new AwS546S0100000_2(this, 65));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((TuxNavBar) this.LLIZLLLIL.getValue()).setNavActions(new C0OM1());
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLIZLLLIL.getValue();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS546S0100000_2(this, 1195));
        tuxNavBar.LIZ(c1251150ifB);
        TuxNavBar tuxNavBar2 = (TuxNavBar) this.LLIZLLLIL.getValue();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = C1383370m6R.LJIIJ(2131831394);
        tuxNavBar2.LJIJJ(c1250250idj);
    }
}
