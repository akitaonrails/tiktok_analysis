package com.ss.android.ugc.aweme.component.verify.pin.set;

import X.AbstractC738140SxQ;
import X.C0OM1;
import X.C1251150ifB;
import X.C13LE;
import X.C1559260qg8;
import X.C1602160rnK;
import X.C1714690uip;
import X.C1717580unU;
import X.C1718120uoM;
import X.C1719180uq4;
import X.C1719200uq6;
import X.C1719460uqW;
import X.C1948507kB;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C20642515q3;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C23250099c;
import X.C452070Ho5;
import X.C723590SZx;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1717460unI;
import X.InterfaceC1719490uqZ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS160S0100000_26;
import Y.ARunnableS126S0100000_26;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.component.verify.pin.BasePinUIAssem;
import com.ss.android.ugc.aweme.component.verify.pin.set.PinConfirmViewAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.foundation.network.PipoAccountApi;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS290S0000000_7;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class PinConfirmViewAssem extends BasePinUIAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public TuxNavBar LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public C1719460uqW LLJILJIL;
    public C197039127h LLJILJILJ;
    public View LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public final AssemVMLazy LLJJIII;
    public final C1559260qg8 LLJJIJI;
    public String LLJJIJIIJIL;
    public InputMethodManager LLJJIJIL;
    public long LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PinConfirmViewAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/component/verify/pin/set/PinConfirmViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C1719460uqW Go() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c5w) : null;
            this.LLJILJIL = (C1719460uqW) viewFindViewById;
        }
        return (C1719460uqW) viewFindViewById;
    }

    public final TuxTextView Ho() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c5y) : null;
            this.LLJIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C197039127h Jo() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c60) : null;
            this.LLJILJILJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final TuxTextView Lo() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c64) : null;
            this.LLJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C1719180uq4 No() {
        return (C1719180uq4) this.LLJJIJI.getValue();
    }

    public final PinConfirmViewModel Oo() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (PinConfirmViewModel) assemVMLazy.getValue();
    }

    public PinConfirmViewAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PinConfirmViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 968);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(136);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((AbstractC738140SxQ) this, 969), aFwS268S0000000_26, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJIII = assemVMLazy;
        this.LLJJIJI = new C1559260qg8(new C723590SZx(this, C1719180uq4.class, "KEY_CONFIRM_DATA"), checkSupervisorPrepared());
        this.LLJJIJIIJIL = "";
    }

    public final String So() {
        return (No().LLILLJJLI == EnumC1717460unI.FORGOT || No().LLILLJJLI == EnumC1717460unI.CHANGE) ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.component.verify.pin.BasePinUIAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Window window;
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        Object objJ2 = c19egLIZ2 != null ? C786410Ut5.J2(c19egLIZ2, "input_method") : null;
        this.LLJJIJIL = objJ2 instanceof InputMethodManager ? (InputMethodManager) objJ2 : null;
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        PinConfirmViewModel pinConfirmViewModelOo = Oo();
        C1719180uq4 c1719180uq4No = No();
        pinConfirmViewModelOo.LLILLJJLI = c1719180uq4No;
        C1717580unU c1717580unU = PipoAccountApi.LIZ;
        String str = c1719180uq4No.LLILZLL;
        c1717580unU.getClass();
        pinConfirmViewModelOo.LLILLL = C1717580unU.LIZ(str);
        PinConfirmViewModel pinConfirmViewModelOo2 = Oo();
        String str2 = No().LLIZ;
        PipoAccountApi pipoAccountApi = pinConfirmViewModelOo2.LLILLL;
        if (pipoAccountApi != null) {
            C23250099c.LIZLLL(pinConfirmViewModelOo2.getAssemVMScope(), null, null, new C1719200uq6(pinConfirmViewModelOo2, pipoAccountApi, str2, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.verify.ThemedContextUIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0uqA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1719210uq7) obj).LL;
            }
        }, null, new AwS640S0100000_26(this, 111), 6);
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0uqB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1719210uq7) obj).LLILLJJLI;
            }
        }, null, AFwS290S0000000_7.get$arr$(23), 6);
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0uq9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1719210uq7) obj).LLILZ;
            }
        }, null, AFwS313S0000000_26.get$arr$(36), 6);
        if (C1714690uip.LIZ(No().LLJJI)) {
            C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0ql1
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1719210uq7) obj).LLILZIL);
                }
            }, null, AFwS310S0000000_24.get$arr$(68), 6);
        }
        this.LLJJJ = System.currentTimeMillis();
        View viewFindViewById = this.LLJ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.c5z);
            } else {
                viewFindViewById = null;
            }
            this.LLJ = (TuxNavBar) viewFindViewById;
        }
        C786410Ut5.LLLLZLLLI((TuxNavBar) viewFindViewById, 0);
        C786410Ut5.LLLLZLL(Lo(), 0);
        C786410Ut5.LLLLZLL(Ho(), 0);
        C1719460uqW c1719460uqWGo = Go();
        int visibility = c1719460uqWGo.getVisibility();
        c1719460uqWGo.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c1719460uqWGo);
        C197039127h c197039127hJo = Jo();
        if (c197039127hJo != null) {
            C786410Ut5.LLLLLLJ(c197039127hJo, 0);
        }
        Jo().setButtonVariant(0);
        View viewFindViewById3 = this.LLJ;
        if (viewFindViewById3 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById3 = viewLJJIJL2.findViewById(R.id.c5z);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJ = (TuxNavBar) viewFindViewById3;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById3;
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZJ(0);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1405));
        c0om1.LJ(c1251150ifB);
        c0om1.LIZJ(0);
        c0om1.LIZLLL = false;
        if (C1948507kB.LIZ(No().LLJJIII)) {
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_question_mark_circle_ltr;
            c1251150ifB2.LIZJ(new AwS570S0100000_26(this, 1406));
            c0om1.LIZIZ(c1251150ifB2);
        }
        tuxNavBar.setNavActions(c0om1);
        Go().setDimOnComplete(false);
        Go().setInputCallback(new InterfaceC1719490uqZ() { // from class: X.0uq8
            @Override // X.InterfaceC1719490uqZ
            public final void LIZIZ(int i) {
            }

            @Override // X.InterfaceC1719490uqZ
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1719490uqZ
            public final void LIZJ() {
                C197039127h c197039127hJo2 = this.LIZ.Jo();
                if (c197039127hJo2 != null) {
                    c197039127hJo2.setEnabled(false);
                }
            }

            @Override // X.InterfaceC1719490uqZ
            public final void LIZ(String str) {
                PinConfirmViewAssem pinConfirmViewAssem = this.LIZ;
                pinConfirmViewAssem.LLJJIJIIJIL = str;
                C197039127h c197039127hJo2 = pinConfirmViewAssem.Jo();
                if (c197039127hJo2 != null) {
                    c197039127hJo2.setEnabled(true);
                }
            }
        });
        if (C1948507kB.LIZ(No().LLJILJIL)) {
            Lo().setText(No().LLJILJIL);
        } else {
            Lo().setText(2131840455);
        }
        if (C1948507kB.LIZ(No().LLJILJILJ)) {
            Ho().setText(No().LLJILJILJ);
        } else {
            Ho().setText(2131840453);
        }
        if (C1948507kB.LIZ(No().LLJJ)) {
            View viewFindViewById4 = this.LLJILLL;
            if (viewFindViewById4 == null) {
                View viewLJJIJL3 = LJJIJL();
                if (viewLJJIJL3 != null) {
                    viewFindViewById4 = viewLJJIJL3.findViewById(R.id.c4p);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJILLL = viewFindViewById4;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById4);
            View viewFindViewById5 = this.LLJJ;
            if (viewFindViewById5 == null) {
                View viewLJJIJL4 = LJJIJL();
                if (viewLJJIJL4 != null) {
                    viewFindViewById5 = viewLJJIJL4.findViewById(R.id.qi2);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLJJ = (TuxTextView) viewFindViewById5;
            }
            ((TextView) viewFindViewById5).setText(No().LLJJ);
        }
        if (C1948507kB.LIZ(No().LLJILLL)) {
            C197039127h c197039127hJo2 = Jo();
            if (c197039127hJo2 != null) {
                c197039127hJo2.setText(No().LLJILLL);
            }
        } else {
            C197039127h c197039127hJo3 = Jo();
            if (c197039127hJo3 != null) {
                c197039127hJo3.setText(C20642515q3.LJI(2131840452));
            }
        }
        C197039127h c197039127hJo4 = Jo();
        if (c197039127hJo4 != null) {
            C786410Ut5.U8(c197039127hJo4, new ACListenerS160S0100000_26(this, 58));
        }
        HandlerHook.viewPost(Go(), new ARunnableS126S0100000_26(this, 90));
        if (C1714690uip.LIZ(No().LLJJI)) {
            View viewFindViewById6 = this.LLJJI;
            if (viewFindViewById6 == null) {
                View viewLJJIJL5 = LJJIJL();
                if (viewLJJIJL5 != null) {
                    viewFindViewById6 = viewLJJIJL5.findViewById(R.id.c66);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLJJI = (TuxTextView) viewFindViewById6;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById6, 0);
            View view2 = this.LLJJI;
            if (view2 == null) {
                View viewLJJIJL6 = LJJIJL();
                if (viewLJJIJL6 != null) {
                    viewFindViewById2 = viewLJJIJL6.findViewById(R.id.c66);
                }
                this.LLJJI = (TuxTextView) viewFindViewById2;
                view2 = viewFindViewById2;
            }
            C786410Ut5.h9((TuxTextView) view2, new ACListenerS160S0100000_26(this, 59));
        }
        C1718120uoM c1718120uoM = C1718120uoM.LIZ;
        String str = No().LLILZ;
        String str2 = No().LLILLL;
        String str3 = No().LLILZIL;
        String str4 = No().LLIZLLLIL;
        String str5 = No().LLJ;
        String str6 = No().LLJI;
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("is_reset", So()));
        c1718120uoM.getClass();
        C1718120uoM.LJI(str, "bnpl_pin_set", str4, str5, str2, 0L, "confirm_pin_second", str3, str6, mapLIZJ);
    }
}
