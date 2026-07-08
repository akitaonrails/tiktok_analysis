package com.ss.android.ugc.aweme.publicgroup.assem.groupcreation;

import X.C1228470i4b;
import X.C1228650i4t;
import X.C123100dR;
import X.C1527305yR;
import X.C1559260qg8;
import X.C2217381BqS;
import X.C337180DJs;
import X.C723580SZw;
import X.C736680Sv4;
import X.C736820SvI;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS70S1000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupCreationEditNameAssem extends BaseGroupCreationEditAssem {
    public final C1559260qg8 LLJJJJ = new C1559260qg8(new C723580SZw(this, C1527305yR.class, null), checkSupervisorPrepared());
    public final int LLJJJJJIL = R.id.sf6;
    public final int LLJJJJLIIL = 2131831459;
    public final int LLJJL = 30;
    public final Integer LLJJLIIIJLLLLLLLZ = Integer.valueOf(R.id.sf4);

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cje;
    }

    @Override // com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.BaseGroupCreationEditAssem
    public final void up() {
        super.up();
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0i9d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1228870i5F) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 70), 4);
    }

    @Override // com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.BaseGroupCreationEditAssem
    public final String kp() {
        C1228470i4b c1228470i4b;
        C1228650i4t c1228650i4t;
        String str;
        C1527305yR c1527305yR = (C1527305yR) this.LLJJJJ.getValue();
        if (c1527305yR == null || (c1228470i4b = c1527305yR.LL) == null || (c1228650i4t = c1228470i4b.LIZ) == null || (str = c1228650i4t.LJJIII) == null || !C123100dR.LIZ(str)) {
            return null;
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.BaseGroupCreationEditAssem
    public final Integer hp() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.BaseGroupCreationEditAssem
    public final int ip() {
        return this.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.BaseGroupCreationEditAssem
    public final int lp() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.BaseGroupCreationEditAssem
    public final int op() {
        return this.LLJJJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.BaseGroupCreationEditAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) throws Throwable {
        C1228470i4b c1228470i4b;
        C1228650i4t c1228650i4t;
        super.onViewCreated(view);
        C1527305yR c1527305yR = (C1527305yR) this.LLJJJJ.getValue();
        if (c1527305yR != null && (c1228470i4b = c1527305yR.LL) != null && (c1228650i4t = c1228470i4b.LIZ) != null && !c1228650i4t.LJJIIJ) {
            C337180DJs.LIZ(view.findViewById(R.id.sf5));
        }
    }

    @Override // com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.BaseGroupCreationEditAssem
    public final void tp(String str) {
        zp();
        sp().setState(new AwS70S1000000_19(str, 11));
    }
}
