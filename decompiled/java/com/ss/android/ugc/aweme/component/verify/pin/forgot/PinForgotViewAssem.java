package com.ss.android.ugc.aweme.component.verify.pin.forgot;

import X.AbstractC738140SxQ;
import X.C098200Yq;
import X.C0OM1;
import X.C1158360gFW;
import X.C1251150ifB;
import X.C1390130mHL;
import X.C13LE;
import X.C1559260qg8;
import X.C1707070uWX;
import X.C1716310ulR;
import X.C1717560unS;
import X.C1718120uoM;
import X.C1718430uor;
import X.C1718440uos;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C723590SZx;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1707080uWY;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.biz.ab.PipoPinManageVcConnectSettings;
import com.ss.android.ugc.aweme.component.verify.PinApi;
import com.ss.android.ugc.aweme.component.verify.pin.model.PinForgotConsultResult;
import com.ss.android.ugc.aweme.verify.ThemedContextUIContentAssem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS656S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PinForgotViewAssem extends ThemedContextUIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public TuxNavBar LLJ;
    public C1749280vcc LLJI;
    public final AssemVMLazy LLJIJIL;
    public final C1559260qg8 LLJILJIL;
    public String LLJILJILJ;
    public PinForgotConsultResult LLJILLL;
    public String LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PinForgotViewAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/component/verify/pin/forgot/PinForgotViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        if (C1158360gFW.LIZ()) {
            try {
                C1718440uos.LIZ(Jo().LLJILJILJ, Jo().LLIZLLLIL, Jo().LLILLL);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0upE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718620upA) obj).LL;
            }
        }, null, new AwS640S0100000_26(this, 99), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0up4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718620upA) obj).LLILLL;
            }
        }, null, new AwS640S0100000_26(this, 100), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0up6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718620upA) obj).LLILLJJLI;
            }
        }, null, new AwS640S0100000_26(this, 101), 6);
        C736680Sv4.LJIIIZ(this, Lo(), new C2217381BqS() { // from class: X.0up9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718620upA) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0up0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718620upA) obj).LLILZLL;
            }
        }, null, new AwS656S0100000_7(this, 2), 12);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0up1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1718620upA) obj).LLIZ);
            }
        }, null, new AwS638S0100000_24(this, 166), 6);
        Zo("consult");
        Lo().vQ2();
        C1749280vcc c1749280vcc = (C1749280vcc) LJJIJL().findViewById(R.id.c63);
        if (c1749280vcc != null) {
            c1749280vcc.setStatus(new C1722300uv6());
            c1749280vcc.LIZIZ(new C1390130mHL(c1749280vcc.getContext(), null, 6));
        }
        TuxNavBar tuxNavBarGo = Go();
        if (tuxNavBarGo != null) {
            C786410Ut5.LLLLZLLLI(tuxNavBarGo, 8);
        }
        TuxNavBar tuxNavBarGo2 = Go();
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZJ(0);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1325));
        c0om1.LJ(c1251150ifB);
        tuxNavBarGo2.setNavActions(c0om1);
    }

    public final TuxNavBar Go() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c5k) : null;
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

    public final C1718430uor Jo() {
        return (C1718430uor) this.LLJILJIL.getValue();
    }

    public final PinForgotViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (PinForgotViewModel) assemVMLazy.getValue();
    }

    public PinForgotViewAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PinForgotViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 254);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(128);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((AbstractC738140SxQ) this, 255), aFwS268S0000000_26, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJIJIL = assemVMLazy;
        this.LLJILJIL = new C1559260qg8(new C723590SZx(this, C1718430uor.class, "KEY_FORGOT_DATA"), checkSupervisorPrepared());
        this.LLJILJILJ = "";
        this.LLJJ = "";
    }

    public static void Oo() {
        if (C1158360gFW.LIZ() && C1718440uos.LIZJ()) {
            if (C1718440uos.LIZ) {
                C1718440uos.LJI.compareAndSet(false, true);
            }
            C1718440uos.LIZIZ();
        }
    }

    public static void So() {
        if (C1158360gFW.LIZ() && C1718440uos.LIZJ()) {
            C1718440uos.LJII = true;
            C1718440uos.LIZIZ();
        }
    }

    public final void No() {
        Boolean bool;
        if (C1158360gFW.LIZ() && C1718440uos.LIZJ() && !C1718440uos.LJII && C1718440uos.LIZ && C1718440uos.LJI.compareAndSet(false, true)) {
            try {
                if (C1158360gFW.LIZ()) {
                    C1158360gFW.LIZ.getClass();
                    PipoPinManageVcConnectSettings.PipoPinManageVcConnectModel pipoPinManageVcConnectModelLIZIZ = C1158360gFW.LIZIZ();
                    if (pipoPinManageVcConnectModelLIZIZ == null || (bool = pipoPinManageVcConnectModelLIZIZ.enableCancelReport) == null || bool.booleanValue()) {
                        C1718120uoM c1718120uoM = C1718120uoM.LIZ;
                        String str = Jo().LLILZ;
                        String str2 = Jo().LLJI;
                        try {
                            String str3 = this.LLJJ;
                            String str4 = C1718440uos.LJ;
                            String str5 = Jo().LLILZLL;
                            String str6 = Jo().LLIZ;
                            Long lValueOf = C1718440uos.LJFF <= 0 ? null : Long.valueOf(System.currentTimeMillis() - C1718440uos.LJFF);
                            c1718120uoM.getClass();
                            C1718120uoM.LJIIIZ(str, str2, str3, str4, "result", "user_cancel", "", str5, str6, lValueOf);
                        } catch (Throwable th) {
                            th = th;
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                }
                Vo(false);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                th = th2;
            }
            C1718440uos.LIZIZ();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C19EG c19egLIZ;
        if (C1158360gFW.LIZ() && C1718440uos.LIZJ() && !C1718440uos.LJII && !Intrinsics.LJFF(C1718440uos.LJ, "set_pin") && (c19egLIZ = C724240Sb0.LIZ(this)) != null && c19egLIZ.isFinishing()) {
            No();
        }
        super.onDestroy();
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        PinForgotViewModel pinForgotViewModelLo = Lo();
        C1718430uor c1718430uorJo = Jo();
        pinForgotViewModelLo.LLILLJJLI = c1718430uorJo;
        if (c1718430uorJo.LLILLJJLI.length() == 0) {
            C1716310ulR c1716310ulR = C1716310ulR.LIZ;
            String str = c1718430uorJo.LLILZ;
            String str2 = c1718430uorJo.LL;
            String str3 = c1718430uorJo.LLJI;
            c1716310ulR.getClass();
            C1716310ulR.LJII(str, "bnpl_pin_forgot", str2, str3);
        }
        C1717560unS c1717560unS = PinApi.LIZ;
        String str4 = c1718430uorJo.LLILLJJLI;
        String str5 = c1718430uorJo.LLILLL;
        String str6 = c1718430uorJo.LLILZ;
        c1717560unS.getClass();
        pinForgotViewModelLo.LLILLL = C1717560unS.LIZ(str4, str5, str6);
    }

    public static void Vo(boolean z) {
        Boolean bool;
        if (C1158360gFW.LIZ()) {
            C1158360gFW.LIZ.getClass();
            PipoPinManageVcConnectSettings.PipoPinManageVcConnectModel pipoPinManageVcConnectModelLIZIZ = C1158360gFW.LIZIZ();
            if (pipoPinManageVcConnectModelLIZIZ == null || (bool = pipoPinManageVcConnectModelLIZIZ.enableFlowEndNotification) == null || bool.booleanValue()) {
                String str = C1718440uos.LIZIZ;
                if (str.length() == 0) {
                    return;
                }
                Iterator<InterfaceC1707080uWY> it2 = C1707070uWX.LIZ.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().LIZ(str);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
        }
    }

    public final void Zo(String str) {
        Object c098200Yq;
        if (C1158360gFW.LIZ()) {
            C1718440uos.LJ = str;
        }
        try {
            C1718120uoM c1718120uoM = C1718120uoM.LIZ;
            String str2 = Jo().LLILZ;
            String str3 = Jo().LLJI;
            String str4 = this.LLJJ;
            String str5 = Jo().LLILZLL;
            String str6 = Jo().LLIZ;
            c1718120uoM.getClass();
            C1718120uoM.LJIIIZ(str2, str3, str4, str, "begin", "", "", str5, str6, null);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public final void ap(Long l, String str, String str2, String str3) {
        Object c098200Yq;
        C1718120uoM c1718120uoM;
        String str4;
        String str5;
        try {
            c1718120uoM = C1718120uoM.LIZ;
            str4 = Jo().LLILZ;
            str5 = Jo().LLJI;
        } catch (Throwable th) {
            th = th;
        }
        try {
            String str6 = this.LLJJ;
            String str7 = Jo().LLILZLL;
            String str8 = Jo().LLIZ;
            c1718120uoM.getClass();
            C1718120uoM.LJIIIZ(str4, str5, str6, str, "result", str2, str3, str7, str8, l);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }
}
