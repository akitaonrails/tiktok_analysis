package com.ss.android.ugc.aweme.component.verify.pin.offline;

import X.C01D1;
import X.C098200Yq;
import X.C0OM1;
import X.C1238130iKB;
import X.C1251150ifB;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1716310ulR;
import X.C1717560unS;
import X.C1718120uoM;
import X.C1718710upJ;
import X.C1718820upU;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C1AF0;
import X.C20642515q3;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS128S0200000_26;
import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.component.verify.PinApi;
import com.ss.android.ugc.aweme.component.verify.pin.model.HintPageMsg;
import com.ss.android.ugc.aweme.verify.ThemedContextUIContentAssem;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class PinOfflineViewAssem extends ThemedContextUIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public C197039127h LLJ;
    public TuxNavBar LLJI;
    public ScrollView LLJIJIL;
    public C197039127h LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public final C1559260qg8 LLJJIJIL = new C1559260qg8(new C723590SZx(this, C1718710upJ.class, "KEY_OFFLINE_DATA"), checkSupervisorPrepared());
    public final AssemVMLazy LLJJJ;
    public long LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PinOfflineViewAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/component/verify/pin/offline/PinOffineViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PinOfflineViewAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PinOffineViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 967), AFwS268S0000000_26.get$arr$(134), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        if (Jo().LLILZLL.length() == 0) {
            C1716310ulR c1716310ulR = C1716310ulR.LIZ;
            String str = Jo().LLILLJJLI;
            String str2 = Jo().LL;
            String str3 = Jo().LLJI;
            c1716310ulR.getClass();
            C1716310ulR.LJII(str, "bnpl_pin_offline", str2, str3);
            Context context = this.LLIZLLLIL;
            if (context != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LIZ(2131835079);
                C1238130iKB.LIZ(c1397580mTM, new AwS598S0100000_19(this, 130));
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
        }
        PinOffineViewModel pinOffineViewModelLo = Lo();
        C1718710upJ c1718710upJJo = Jo();
        pinOffineViewModelLo.LL = c1718710upJJo;
        C1717560unS c1717560unS = PinApi.LIZ;
        String str4 = c1718710upJJo.LLILZLL;
        String str5 = c1718710upJJo.LLIZ;
        String str6 = c1718710upJJo.LLILLJJLI;
        c1717560unS.getClass();
        pinOffineViewModelLo.LLILLJJLI = C1717560unS.LIZ(str4, str5, str6);
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c5k) : null;
            this.LLJI = (TuxNavBar) viewFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZJ(0);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1390));
        c0om1.LJ(c1251150ifB);
        ((TuxNavBar) viewFindViewById).setNavActions(c0om1);
        No();
        HintPageMsg hintPageMsg = Jo().LLJIJIL;
        if (hintPageMsg != null && hintPageMsg.LIZ()) {
            C1718820upU c1718820upU = C1718820upU.LIZ;
            Context context2 = getContext();
            C1718710upJ c1718710upJJo2 = Jo();
            String str7 = Jo().LLJILJIL;
            AwS392S0200000_26 awS392S0200000_26 = new AwS392S0200000_26(this, hintPageMsg, 143);
            c1718820upU.getClass();
            try {
                new AwS154S0400000_26(context2, hintPageMsg, c1718710upJJo2, str7, awS392S0200000_26, 23).invoke();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
        }
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0upM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718730upL) obj).LLILLJJLI;
            }
        }, null, new AwS640S0100000_26(this, 104), 6);
        C736680Sv4.LJIIIZ(this, Lo(), new C2217381BqS() { // from class: X.0upN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718730upL) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0upO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718730upL) obj).LLILLL;
            }
        }, null, new AwS675S0100000_26(this, 27), 12);
        C736680Sv4.LJIIIZ(this, Lo(), new C2217381BqS() { // from class: X.0upP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718730upL) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0upQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1718730upL) obj).LLILZ;
            }
        }, null, new AwS675S0100000_26(this, 28), 12);
    }

    public final C197039127h Go() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c5i) : null;
            this.LLJILJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h Ho() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c5j) : null;
            this.LLJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C1718710upJ Jo() {
        return (C1718710upJ) this.LLJJIJIL.getValue();
    }

    public final PinOffineViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (PinOffineViewModel) assemVMLazy.getValue();
    }

    public final void No() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.c5l) : null;
            this.LLJIJIL = (ScrollView) viewFindViewById;
        }
        C786410Ut5.LLIILII((ScrollView) viewFindViewById, 0);
        C786410Ut5.LLLLLLJ(Ho(), 0);
        C786410Ut5.LLLLLLJ(Go(), 0);
        Ho().setButtonVariant(0);
        Context context = getContext();
        if (context != null) {
            View viewFindViewById2 = this.LLJILJILJ;
            if (viewFindViewById2 == null) {
                View viewLJJIJL2 = LJJIJL();
                viewFindViewById2 = viewLJJIJL2 != null ? viewLJJIJL2.findViewById(R.id.c5v) : null;
                this.LLJILJILJ = (TuxTextView) viewFindViewById2;
            }
            ((TextView) viewFindViewById2).setText(2131840402);
            View viewFindViewById3 = this.LLJILLL;
            if (viewFindViewById3 == null) {
                View viewLJJIJL3 = LJJIJL();
                viewFindViewById3 = viewLJJIJL3 != null ? viewLJJIJL3.findViewById(R.id.c5o) : null;
                this.LLJILLL = (TuxTextView) viewFindViewById3;
            }
            ((TextView) viewFindViewById3).setText(2131840397);
            View viewFindViewById4 = this.LLJJ;
            if (viewFindViewById4 == null) {
                View viewLJJIJL4 = LJJIJL();
                viewFindViewById4 = viewLJJIJL4 != null ? viewLJJIJL4.findViewById(R.id.c5n) : null;
                this.LLJJ = (TuxTextView) viewFindViewById4;
            }
            ((TextView) viewFindViewById4).setText(2131840396);
            View viewFindViewById5 = this.LLJJI;
            if (viewFindViewById5 == null) {
                View viewLJJIJL5 = LJJIJL();
                viewFindViewById5 = viewLJJIJL5 != null ? viewLJJIJL5.findViewById(R.id.c5r) : null;
                this.LLJJI = (TuxTextView) viewFindViewById5;
            }
            ((TextView) viewFindViewById5).setText(2131840401);
            View viewFindViewById6 = this.LLJJIII;
            if (viewFindViewById6 == null) {
                View viewLJJIJL6 = LJJIJL();
                viewFindViewById6 = viewLJJIJL6 != null ? viewLJJIJL6.findViewById(R.id.c5q) : null;
                this.LLJJIII = (TuxTextView) viewFindViewById6;
            }
            ((TextView) viewFindViewById6).setText(2131840400);
            View viewFindViewById7 = this.LLJJIJI;
            if (viewFindViewById7 == null) {
                View viewLJJIJL7 = LJJIJL();
                viewFindViewById7 = viewLJJIJL7 != null ? viewLJJIJL7.findViewById(R.id.c5u) : null;
                this.LLJJIJI = (TuxTextView) viewFindViewById7;
            }
            ((TextView) viewFindViewById7).setText(2131840399);
            View view = this.LLJJIJIIJIL;
            if (view == null) {
                View viewLJJIJL8 = LJJIJL();
                View viewFindViewById8 = viewLJJIJL8 != null ? viewLJJIJL8.findViewById(R.id.c5t) : null;
                this.LLJJIJIIJIL = (TuxTextView) viewFindViewById8;
                view = viewFindViewById8;
            }
            ((TextView) view).setText(2131840398);
            Ho().setText(C20642515q3.LJI(2131840390));
            C786410Ut5.U8(Ho(), new ACListenerS128S0200000_26(this, context, 4));
            Go().setText(C20642515q3.LJI(2131840391));
            C786410Ut5.U8(Go(), new ACListenerS160S0100000_26(this, 20));
            this.LLJJJIL = System.currentTimeMillis();
            C1718120uoM c1718120uoM = C1718120uoM.LIZ;
            String str = Jo().LLILLJJLI;
            String str2 = Jo().LL;
            String str3 = Jo().LLILLL;
            String str4 = Jo().LLIZLLLIL;
            String str5 = Jo().LLJ;
            String str6 = Jo().LLJI;
            Map mapLJ = C2097608Jq.LJ();
            c1718120uoM.getClass();
            C1718120uoM.LJI(str, "bnpl_pin_forgot", str4, str5, str2, 0L, "", str3, str6, mapLJ);
        }
    }

    public final void Oo(String str) {
        Object c098200Yq;
        try {
            C1718120uoM c1718120uoM = C1718120uoM.LIZ;
            String str2 = Jo().LLILLJJLI;
            String str3 = Jo().LLJI;
            String str4 = Jo().LLIZLLLIL;
            String str5 = Jo().LLJ;
            c1718120uoM.getClass();
            C1718120uoM.LJIIIIZZ(str2, str3, "offline", str, "begin", "", "", str4, str5);
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
