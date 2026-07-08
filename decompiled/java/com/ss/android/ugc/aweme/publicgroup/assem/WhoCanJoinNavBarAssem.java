package com.ss.android.ugc.aweme.publicgroup.assem;

import X.AbstractC1250290idn;
import X.C019F;
import X.C01GW;
import X.C1160340gIi;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1527905yX;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.publicgroup.vm.IMWhoCanJoinVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class WhoCanJoinNavBarAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C1559260qg8 LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WhoCanJoinNavBarAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publicgroup/vm/IMWhoCanJoinVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public WhoCanJoinNavBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IMWhoCanJoinVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2175), AFwS256S0000000_18.get$arr$(736), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2173));
        this.LLJI = new C1559260qg8(new C723580SZw(this, C1160340gIi.class, null), checkSupervisorPrepared());
        this.LLJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2174));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJ.getValue();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS562S0100000_18(this, 2571));
        tuxNavBar.LIZIZ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = LJJIJL().getContext().getString(2131827494);
        tuxNavBar.LJIJJ(c1250250idj);
        tuxNavBar.LIZ((AbstractC1250290idn) this.LLJIJIL.getValue());
        tuxNavBar.LJIIZILJ(false);
        tuxNavBar.setNavBackground(C1527905yX.LIZ(C1308910kAL.LIZJ(R.attr.a1e, LJJIJL().getContext())));
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gME
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1157150gDZ) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 266), 6);
    }
}
