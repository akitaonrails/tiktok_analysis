package com.ss.android.ugc.aweme.verify.pi;

import X.C019F;
import X.C01GW;
import X.C1155580gB2;
import X.C1238130iKB;
import X.C1391190mJ3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1708530uYt;
import X.C1713570uh1;
import X.C1713680uhC;
import X.C1713690uhD;
import X.C1714040uhm;
import X.C1714180ui0;
import X.C1714230ui5;
import X.C1714660uim;
import X.C1715010ujL;
import X.C1715320ujq;
import X.C1748330vb5;
import X.C1748440vbG;
import X.C1948707kD;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C20642515q3;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C343970De7;
import X.C452501pT;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C991740bum;
import X.CountDownTimerC1775650wJ9;
import X.EnumC1714450uiR;
import X.EnumC925903jd;
import X.InterfaceC1715120ujW;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS85S0200000_16;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.verify.BaseVerifyFragment;
import com.ss.android.ugc.aweme.verify.BaseVerifyTuxSheet;
import com.ss.android.ugc.aweme.verify.ThemedContextUIContentAssem;
import com.ss.android.ugc.aweme.verify.ab.PipoVerificationRetentionPopupSettings;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class PiVerifyAssem extends ThemedContextUIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final long LLJJLIIIJLLLLLLLZ;
    public TuxNavBar LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public C197039127h LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public C1748440vbG LLJJ;
    public C1748330vb5 LLJJI;
    public SmartImageView LLJJIII;
    public TuxTextView LLJJIJI;
    public final C1559260qg8 LLJJIJIIJIL = new C1559260qg8(new C723590SZx(this, C1155580gB2.class, "data_key"), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public CountDownTimerC1775650wJ9 LLJJJJJIL;
    public boolean LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PiVerifyAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/verify/pi/VerifyViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJLIIIJLLLLLLLZ = 1000L;
    }

    public PiVerifyAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VerifyViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1484), AFwS268S0000000_26.get$arr$(486), null, true);
        this.LLJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1171));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1169));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1170));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C1713570uh1 Lo() {
        return (C1713570uh1) this.LLJJJIL.getValue();
    }

    public final C1714180ui0 No() {
        return (C1714180ui0) this.LLJJJJ.getValue();
    }

    public final SmartImageView Oo() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qia) : null;
            this.LLJJIII = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final C1748440vbG So() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qie) : null;
            this.LLJJ = (C1748440vbG) viewFindViewById;
        }
        return (C1748440vbG) viewFindViewById;
    }

    public final C1748330vb5 Vo() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qif) : null;
            this.LLJJI = (C1748330vb5) viewFindViewById;
        }
        return (C1748330vb5) viewFindViewById;
    }

    public final C197039127h Zo() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qih) : null;
            this.LLJILJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final TuxTextView ap() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qii) : null;
            this.LLJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final VerifyViewModel bp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (VerifyViewModel) assemVMLazy.getValue();
    }

    public final void LJJIL() {
        C1748440vbG c1748440vbGSo = So();
        if (c1748440vbGSo != null) {
            Object objH2 = C786410Ut5.H2(C1948707kD.LIZ().getApplicationContext(), "input_method");
            c1748440vbGSo.LJIIIIZZ(objH2 instanceof InputMethodManager ? (InputMethodManager) objH2 : null, 0);
            c1748440vbGSo.LJII();
        }
    }

    public final boolean cp() {
        C1714040uhm c1714040uhm;
        C1713570uh1 c1713570uh1Lo = Lo();
        return ((c1713570uh1Lo == null || (c1714040uhm = c1713570uh1Lo.LIZ.LIZIZ) == null) ? null : c1714040uhm.LIZ) == EnumC1714450uiR.HALF_PAGE;
    }

    public final boolean dp() {
        C1714040uhm c1714040uhm;
        C1713570uh1 c1713570uh1Lo = Lo();
        return ((c1713570uh1Lo == null || (c1714040uhm = c1713570uh1Lo.LIZ.LIZIZ) == null) ? null : c1714040uhm.LIZJ) == EnumC925903jd.MINIMAL;
    }

    public final void hp() {
        C1748440vbG c1748440vbGSo = So();
        if (!(c1748440vbGSo instanceof C1748440vbG) || c1748440vbGSo == null) {
            return;
        }
        HandlerHook.viewPostDelay(c1748440vbGSo, new ARunnableS85S0200000_16(c1748440vbGSo, (Object) null, 71), 200L);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Window window;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null) {
            window.clearFlags(8192);
        }
        super.onDestroy();
        CountDownTimerC1775650wJ9 countDownTimerC1775650wJ9 = this.LLJJJJJIL;
        if (countDownTimerC1775650wJ9 != null) {
            countDownTimerC1775650wJ9.cancel();
        }
        C1715320ujq.LIZ = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        hp();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0077 A[PHI: r6
      0x0077: PHI (r6v1 boolean) = (r6v0 boolean), (r6v4 boolean) binds: [B:49:0x0074, B:13:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go(int r13) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.verify.pi.PiVerifyAssem.Go(int):void");
    }

    public final void Ho(String str) {
        if (cp()) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                if (PipoVerificationRetentionPopupSettings.LIZ().LIZ()) {
                    BaseVerifyTuxSheet baseVerifyTuxSheet = ((BaseVerifyFragment) fragmentLJI).LLJILJIL;
                    if (baseVerifyTuxSheet != null) {
                        baseVerifyTuxSheet.SR();
                        return;
                    }
                    return;
                }
                String str2 = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
                return;
            }
            return;
        }
        C1714230ui5.LIZIZ(C724240Sb0.LIZ(this), Lo(), str);
    }

    public final void Jo(boolean z) {
        C1714180ui0 c1714180ui0No;
        C1713680uhC c1713680uhC;
        String str;
        String str2;
        C991740bum c991740bum;
        BaseVerifyFragment baseVerifyFragment;
        if (this.LLJJJJLIIL) {
            return;
        }
        this.LLJJJJLIIL = true;
        InterfaceC1715120ujW interfaceC1715120ujW = bp().getState().LL;
        String strLIZ = C1715010ujL.LIZ(interfaceC1715120ujW);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        String str3 = null;
        if ((fragmentLJI instanceof BaseVerifyFragment) && (baseVerifyFragment = (BaseVerifyFragment) fragmentLJI) != null) {
            baseVerifyFragment.bS(strLIZ);
        }
        if (Intrinsics.LJFF(strLIZ, "PASS")) {
            C1714180ui0 c1714180ui0No2 = No();
            if (c1714180ui0No2 != null) {
                c1714180ui0No2.LJFF("verify_success");
            }
            BaseVerifyTuxSheet baseVerifyTuxSheet = ((BaseVerifyFragment) C724240Sb0.LJI(this)).LLJILJIL;
            if (baseVerifyTuxSheet != null) {
                baseVerifyTuxSheet.SR();
            }
        } else if (Intrinsics.LJFF(strLIZ, "REJECT") && (c1714180ui0No = No()) != null) {
            c1714180ui0No.LJFF("verify_failed");
        }
        boolean z2 = bp().getState().LLIZ;
        C1713570uh1 c1713570uh1Lo = Lo();
        if (c1713570uh1Lo != null && (c1713680uhC = c1713570uh1Lo.LJIILIIL) != null) {
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            String strLIZ2 = C1715010ujL.LIZ(interfaceC1715120ujW);
            C1714660uim c1714660uim = (C1714660uim) this.LLJJJ.getValue();
            if (c1714660uim == null || (str = c1714660uim.LIZIZ) == null) {
                str = "";
            }
            if ((interfaceC1715120ujW instanceof C991740bum) && (c991740bum = (C991740bum) interfaceC1715120ujW) != null) {
                str3 = c991740bum.LIZ;
            }
            if (z2) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c1713680uhC.LIZ(new C1713690uhD(fragmentLJI2, strLIZ2, str, str3, (String) null, (C1708530uYt) null, C2097908Jt.LIZJ(new Pair("has_used_ocr", str2)), 104));
        }
        if (z) {
            Ho(strLIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x041f  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r20v0, types: [X.0ScH, X.0SxQ, androidx.lifecycle.LifecycleOwner, com.bytedance.assem.arch.core.UIAssem, com.ss.android.ugc.aweme.verify.ThemedContextUIContentAssem, com.ss.android.ugc.aweme.verify.pi.PiVerifyAssem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, android.view.View, com.bytedance.tux.icon.TuxIconView] */
    @Override // com.ss.android.ugc.aweme.verify.ThemedContextUIContentAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21) {
        /*
            Method dump skipped, instruction units count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.verify.pi.PiVerifyAssem.onViewCreated(android.view.View):void");
    }

    public final void ep(String str, Function0 function0, String str2, String str3) {
        C1714660uim c1714660uim = (C1714660uim) this.LLJJJ.getValue();
        if (c1714660uim != null) {
            c1714660uim.LJI(str3);
        }
        C1714180ui0 c1714180ui0No = No();
        if (c1714180ui0No != null) {
            c1714180ui0No.LJIIIIZZ("too_many_failed_attempts");
        }
        LJJIL();
        Context context = this.LLIZLLLIL;
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            if (str2 == null) {
                str2 = C20642515q3.LJI(2131848597);
            }
            c1397580mTM.LIZIZ(str2);
            c1397580mTM.LJII = false;
            C1238130iKB.LIZ(c1397580mTM, new AwS392S0200000_26(this, (PiVerifyAssem) function0, (Function0<Unit>) 189));
            if (str != null) {
                c1397580mTM.LJI(str);
            }
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }
}
