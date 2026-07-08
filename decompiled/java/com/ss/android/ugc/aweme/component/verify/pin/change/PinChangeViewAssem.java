package com.ss.android.ugc.aweme.component.verify.pin.change;

import X.AbstractC738140SxQ;
import X.C098200Yq;
import X.C0OM1;
import X.C1251150ifB;
import X.C1390130mHL;
import X.C13LE;
import X.C1559260qg8;
import X.C1716310ulR;
import X.C1717560unS;
import X.C1718120uoM;
import X.C1718420uoq;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C723590SZx;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.component.verify.PinApi;
import com.ss.android.ugc.aweme.component.verify.pin.BasePinUIAssem;
import com.ss.android.ugc.aweme.component.verify.pin.model.PinChangeConsultResult;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class PinChangeViewAssem extends BasePinUIAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public TuxNavBar LLJ;
    public C1749280vcc LLJI;
    public final AssemVMLazy LLJIJIL;
    public final C1559260qg8 LLJILJIL;
    public PinChangeConsultResult LLJILJILJ;
    public long LLJILLL;
    public long LLJJ;
    public String LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PinChangeViewAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/component/verify/pin/change/PinChangeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final TuxNavBar Go() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c5g) : null;
            this.LLJ = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public final C1749280vcc Ho() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c63) : null;
            this.LLJI = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final C1718420uoq Jo() {
        return (C1718420uoq) this.LLJILJIL.getValue();
    }

    public final PinChangeViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (PinChangeViewModel) assemVMLazy.getValue();
    }

    public PinChangeViewAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PinChangeViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 965);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(122);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((AbstractC738140SxQ) this, 966), aFwS268S0000000_26, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJIJIL = assemVMLazy;
        this.LLJILJIL = new C1559260qg8(new C723590SZx(this, C1718420uoq.class, "KEY_CHANGE_DATA"), checkSupervisorPrepared());
        this.LLJJI = "";
    }

    public final void No(String str) {
        Object c098200Yq;
        try {
            C1718120uoM c1718120uoM = C1718120uoM.LIZ;
            String str2 = Jo().LLILZIL;
            String str3 = Jo().LLJ;
            String str4 = this.LLJJI;
            String str5 = Jo().LLIZ;
            String str6 = Jo().LLIZLLLIL;
            c1718120uoM.getClass();
            C1718120uoM.LJIIIIZZ(str2, str3, str4, str, "begin", "", "", str5, str6);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // com.ss.android.ugc.aweme.verify.ThemedContextUIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        PinChangeViewModel pinChangeViewModelLo = Lo();
        C1718420uoq c1718420uoqJo = Jo();
        pinChangeViewModelLo.LLILLJJLI = c1718420uoqJo;
        if (c1718420uoqJo.LLILLL.length() == 0) {
            C1716310ulR c1716310ulR = C1716310ulR.LIZ;
            String str = c1718420uoqJo.LLILZIL;
            String str2 = c1718420uoqJo.LLILLJJLI;
            String str3 = c1718420uoqJo.LLJ;
            c1716310ulR.getClass();
            C1716310ulR.LJII(str, "bnpl_pin_change", str2, str3);
        }
        C1717560unS c1717560unS = PinApi.LIZ;
        String str4 = c1718420uoqJo.LLILLL;
        String str5 = c1718420uoqJo.LLILZ;
        String str6 = c1718420uoqJo.LLILZIL;
        c1717560unS.getClass();
        pinChangeViewModelLo.LLILLL = C1717560unS.LIZ(str4, str5, str6);
        C1749280vcc c1749280vcc = (C1749280vcc) LJJIJL().findViewById(R.id.c63);
        if (c1749280vcc != null) {
            c1749280vcc.setStatus(new C1722300uv6());
            c1749280vcc.LIZIZ(new C1390130mHL(c1749280vcc.getContext(), null, 6));
        }
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0up3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718630upB) obj).LLILLL;
            }
        }, null, new AwS640S0100000_26(this, 93), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0up5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718630upB) obj).LLILLJJLI;
            }
        }, null, new AwS640S0100000_26(this, 94), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0up7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718630upB) obj).LL;
            }
        }, null, new AwS640S0100000_26(this, 95), 6);
        C736680Sv4.LJIIIZ(this, Lo(), new C2217381BqS() { // from class: X.0up8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718630upB) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0upF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718630upB) obj).LLILZIL;
            }
        }, null, new AwS675S0100000_26(this, 23), 12);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0up2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1718630upB) obj).LLILZLL);
            }
        }, null, new AwS640S0100000_26(this, 92), 6);
        No("consult");
        Lo().vQ2();
        C786410Ut5.LLLLZLLLI(Go(), 8);
        TuxNavBar tuxNavBarGo = Go();
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZJ(0);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1304));
        c0om1.LJ(c1251150ifB);
        tuxNavBarGo.setNavActions(c0om1);
    }

    public final void Oo(String str, String str2, String str3) {
        Object c098200Yq;
        try {
            C1718120uoM c1718120uoM = C1718120uoM.LIZ;
            String str4 = Jo().LLILZIL;
            String str5 = Jo().LLJ;
            String str6 = this.LLJJI;
            String str7 = Jo().LLIZ;
            String str8 = Jo().LLIZLLLIL;
            c1718120uoM.getClass();
            C1718120uoM.LJIIIIZZ(str4, str5, str6, str, "result", str2, str3, str7, str8);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }
}
