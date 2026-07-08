package com.ss.android.ugc.aweme.publicgroup.assem.groupcreation;

import X.C019F;
import X.C01GW;
import X.C1228470i4b;
import X.C1228650i4t;
import X.C13LE;
import X.C1527305yR;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337180DJs;
import X.C452501pT;
import X.C459080HzO;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.publicgroup.vm.PublicGroupCreationVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS633S0100000_19;
import wh6.AbS700S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupCreationAccessCriteriaAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupCreationAccessCriteriaAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publicgroup/vm/PublicGroupCreationVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupCreationAccessCriteriaAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PublicGroupCreationVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 758), AFwS257S0000000_19.get$arr$(254), null, true);
        this.LLJJIII = new C1559260qg8(new C723580SZw(this, C1527305yR.class, null), checkSupervisorPrepared());
        this.LLJJIJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 757));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1686));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1685));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cjc;
    }

    public final View hp() {
        return (View) this.LLJJIJI.getValue();
    }

    public final PublicGroupCreationVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (PublicGroupCreationVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numValueOf;
        C1228470i4b c1228470i4b;
        C1228650i4t c1228650i4t;
        C1228470i4b c1228470i4b2;
        C1228650i4t c1228650i4t2;
        super.onViewCreated(view);
        C1527305yR c1527305yR = (C1527305yR) this.LLJJIII.getValue();
        if (c1527305yR != null && (c1228470i4b2 = c1527305yR.LL) != null && (c1228650i4t2 = c1228470i4b2.LIZ) != null && !c1228650i4t2.LJJIIJ) {
            C337180DJs.LIZ(view.findViewById(R.id.sej));
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0i5I
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1228870i5F) obj).LLJ;
            }
        }, null, new AwS633S0100000_19(this, 265), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0i5H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1228870i5F) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 139), 4);
        View viewHp = hp();
        Context context = hp().getContext();
        C1527305yR c1527305yR2 = (C1527305yR) this.LLJJIII.getValue();
        if (c1527305yR2 != null && (c1228470i4b = c1527305yR2.LL) != null && (c1228650i4t = c1228470i4b.LIZ) != null) {
            numValueOf = Integer.valueOf(c1228650i4t.LJIJ);
        } else {
            numValueOf = null;
        }
        viewHp.setBackground(C459080HzO.LIZLLL(context, numValueOf));
        C786410Ut5.I7(new AbS700S0100000_19(this, 11), hp());
    }
}
