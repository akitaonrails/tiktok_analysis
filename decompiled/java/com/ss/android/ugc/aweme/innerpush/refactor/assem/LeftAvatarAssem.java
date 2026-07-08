package com.ss.android.ugc.aweme.innerpush.refactor.assem;

import X.C01GW;
import X.C1308910kAL;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1340710kzd;
import X.C13LE;
import X.C1402370mb5;
import X.C1610770s1D;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20750516Hv;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C427870Gq9;
import X.C452501pT;
import X.C683100Qqq;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.vm.InnerPushLeftVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS485S0200000_21;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.AwS670S0100000_21;

/* JADX INFO: loaded from: classes32.dex */
public final class LeftAvatarAssem extends BaseInnerPushSlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public FrameLayout LLJJIJIIJIL;
    public C427870Gq9 LLJJIJIL;
    public C1610770s1D LLJJJ;
    public FrameLayout LLJJJIL;
    public C427870Gq9 LLJJJJ;
    public C427870Gq9 LLJJJJJIL;
    public final AssemVMLazy LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final int LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LeftAvatarAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/innerpush/refactor/vm/InnerPushLeftVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LeftAvatarAssem() {
        C683100Qqq c683100Qqq = C683100Qqq.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InnerPushLeftVM.class);
        this.LLJJJJLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c683100Qqq, C1637806bA.LIZ, new AwS575S0100000_31(c19719912DlLIZ, 744), AFwS276S0000000_31.get$arr$(146), null, true);
        this.LLJJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 741));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 742));
        this.LLJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 743));
        this.LLJLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 740));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 745));
        this.LLJLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 739));
        this.LLJLLIL = 6;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ct7;
    }

    public final FrameLayout kp() {
        return (FrameLayout) this.LLJJL.getValue();
    }

    public final C427870Gq9 lp() {
        return (C427870Gq9) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C1610770s1D mp() {
        return (C1610770s1D) this.LLJL.getValue();
    }

    public final InnerPushLeftVM op() {
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return (InnerPushLeftVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushSlotAssem
    public final int hp() {
        return this.LLJLLIL;
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushSlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        InnerPushLeftVM innerPushLeftVMOp = op();
        selectSubscribe(innerPushLeftVMOp, new C2217381BqS() { // from class: X.15uN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666415tu) obj).LL);
            }
        }, new C2217381BqS() { // from class: X.15uU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C20666415tu) obj).LLJIJIL);
            }
        }, new C2217381BqS() { // from class: X.15uV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C20666415tu) obj).LLJILJIL);
            }
        }, C736820SvI.LIZIZ(innerPushLeftVMOp.usedInReusedScene), null, new C1340710kzd(view, this));
        C736680Sv4.LJIIIZ(this, op(), new C2217381BqS() { // from class: X.15uW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666415tu) obj).LLJI);
            }
        }, new C2217381BqS() { // from class: X.15uX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666415tu) obj).LLJ);
            }
        }, null, new AwS485S0200000_21(view, this, 2), 12);
        InnerPushLeftVM innerPushLeftVMOp2 = op();
        selectSubscribe(innerPushLeftVMOp2, new C2217381BqS() { // from class: X.15ue
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666415tu) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.15uf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666415tu) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.15uc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666415tu) obj).LLILZIL;
            }
        }, C736820SvI.LIZIZ(innerPushLeftVMOp2.usedInReusedScene), null, new C1402370mb5(this, 0));
        InnerPushLeftVM innerPushLeftVMOp3 = op();
        selectSubscribe(innerPushLeftVMOp3, new C2217381BqS() { // from class: X.15ug
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666415tu) obj).LLIZ;
            }
        }, new C2217381BqS() { // from class: X.15uh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666415tu) obj).LLILZLL;
            }
        }, new C2217381BqS() { // from class: X.15ui
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666415tu) obj).LLILZ;
            }
        }, C736820SvI.LIZIZ(innerPushLeftVMOp3.usedInReusedScene), null, new C20750516Hv(this, 0));
        InnerPushLeftVM innerPushLeftVMOp4 = op();
        selectSubscribe(innerPushLeftVMOp4, new C2217371BqR() { // from class: X.15uj
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666415tu) obj).LLJJJJLIIL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C20666415tu) obj).LLJJJJLIIL = (View) obj2;
            }
        }, new C2217371BqR() { // from class: X.15uS
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666415tu) obj).LLJJL);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C20666415tu) obj).LLJJL = ((Number) obj2).intValue();
            }
        }, new C2217371BqR() { // from class: X.15uT
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666415tu) obj).LLJJLIIIJLLLLLLLZ);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C20666415tu) obj).LLJJLIIIJLLLLLLLZ = ((Number) obj2).intValue();
            }
        }, C736820SvI.LIZIZ(innerPushLeftVMOp4.usedInReusedScene), null, new C1402370mb5(this, 1));
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.15uY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666415tu) obj).LLJJJ);
            }
        }, null, new AwS635S0100000_21(this, 69), 6);
        C736680Sv4.LJIIIZ(this, op(), new C2217381BqS() { // from class: X.15uZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666415tu) obj).LLJJJJ);
            }
        }, new C2217381BqS() { // from class: X.15ua
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666415tu) obj).LLJJJIL);
            }
        }, null, new AwS670S0100000_21(this, 10), 12);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.15ub
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666415tu) obj).LLJJJJJIL);
            }
        }, null, new AwS635S0100000_21(this, 70), 6);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.15ud
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666415tu) obj).LLJJIJIL;
            }
        }, null, new AwS635S0100000_21(this, 71), 6);
    }

    public final void sp(int i) {
        if (i != 1) {
            if (i == 2) {
                C786410Ut5.LLLLJI(lp(), 8);
                C786410Ut5.LJZ(0, (FrameLayout) this.LLJLIL.getValue());
                return;
            }
            return;
        }
        C786410Ut5.LLLLJI(lp(), 0);
        C786410Ut5.LJZ(8, (FrameLayout) this.LLJLIL.getValue());
    }

    public final void tp(float f, float f2, Float f3) {
        int iIntValue;
        Integer numLIZJ;
        C1331070kk5 hierarchy = lp().getHierarchy();
        C1331100kk8 c1331100kk8 = hierarchy.LIZJ;
        if (c1331100kk8 == null) {
            c1331100kk8 = new C1331100kk8();
        }
        float fLIZIZ = 0.0f;
        if (f > 0.0f) {
            c1331100kk8.LIZIZ = false;
            c1331100kk8.LJII(C418440Gaw.LIZIZ(Float.valueOf(f)));
        } else if (f3 != null && f3.floatValue() >= 0.0f) {
            c1331100kk8.LIZIZ = false;
            c1331100kk8.LJII(C418440Gaw.LIZIZ(f3));
        } else {
            c1331100kk8.LIZIZ = true;
        }
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ng, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -7829368;
        }
        if (f2 >= 0.0f) {
            fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(f2));
        }
        c1331100kk8.LJ(fLIZIZ, iIntValue);
        hierarchy.LJJIII(c1331100kk8);
    }
}
