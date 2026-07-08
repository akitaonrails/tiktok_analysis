package com.ss.android.ugc.aweme.pipo.auth;

import X.C01D1;
import X.C01GW;
import X.C0PEM;
import X.C1389890mGx;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1723250uwd;
import X.C1723260uwe;
import X.C1776200wK2;
import X.C1954707lB;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736820SvI;
import X.DialogInterfaceOnCancelListenerC1775850wJT;
import X.InterfaceC1547650qNP;
import X.InterfaceC1723340uwm;
import X.InterfaceC2217461Bqa;
import android.app.Dialog;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoAuthAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C1559260qg8 LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PipoAuthAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/pipo/auth/PipoAuthViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PipoAuthAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PipoAuthViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 833), AFwS268S0000000_26.get$arr$(393), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 832));
        this.LLJI = new C1559260qg8(new C723580SZw(this, C1723260uwe.class, "HIERARCHY_KEY_PIPO_AUTH"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            ((InterfaceC1723340uwm) ((InterfaceC1547650qNP) C1954707lB.LIZLLL(InterfaceC1723340uwm.class))).LJI(c19egLIZ);
        }
        Dialog dialog = (Dialog) this.LLJ.getValue();
        if (dialog != null) {
            dialog.setOnCancelListener(new DialogInterfaceOnCancelListenerC1775850wJT(this, 3));
        }
        PipoAuthViewModel pipoAuthViewModelGo = Go();
        selectSubscribe(pipoAuthViewModelGo, new C2217381BqS() { // from class: X.0uwj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1723270uwf) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0uwi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1723270uwf) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0uwl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1723270uwf) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0uwk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1723270uwf) obj).LLILZ;
            }
        }, C736820SvI.LIZIZ(pipoAuthViewModelGo.usedInReusedScene), null, new C1776200wK2(this, 4));
        super.onCreate();
        PipoAuthViewModel pipoAuthViewModelGo2 = Go();
        pipoAuthViewModelGo2.withState(new AwS605S0100000_26(pipoAuthViewModelGo2, 920));
        C23250099c.LIZLLL(pipoAuthViewModelGo2.getAssemVMScope(), C0PEM.LIZJ, null, new C1723250uwd(pipoAuthViewModelGo2, null), 2);
    }

    public final PipoAuthViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (PipoAuthViewModel) assemVMLazy.getValue();
    }

    public final void bu(String str) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            if (str == null || str.length() == 0) {
                str = c19egLIZ.getString(2131848597);
            }
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
    }
}
