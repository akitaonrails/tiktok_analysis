package com.ss.android.ugc.aweme.verify.id;

import X.C019F;
import X.C01GW;
import X.C0OM1;
import X.C0PEM;
import X.C1155560gB0;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1391190mJ3;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1713570uh1;
import X.C1713680uhC;
import X.C1714180ui0;
import X.C1714230ui5;
import X.C1714660uim;
import X.C1715030ujN;
import X.C1748330vb5;
import X.C1748440vbG;
import X.C1775980wJg;
import X.C1776190wK1;
import X.C197039127h;
import X.C19719912Dl;
import X.C2097908Jt;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C23250099c;
import X.C343970De7;
import X.C452501pT;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C958703ov;
import X.CountDownTimerC1715170ujb;
import X.EnumC1714450uiR;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS160S0100000_26;
import Y.ARunnableS85S0200000_16;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.pipo.verify.base.model.VerifyInfo;
import com.bytedance.pipo.verify.base.model.response.DoVerifyResponse;
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
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class IDVerifyAssem extends ThemedContextUIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public C1748440vbG LLJ;
    public C197039127h LLJI;
    public C1748330vb5 LLJIJIL;
    public TuxNavBar LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public final C01GW LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public CountDownTimerC1715170ujb LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IDVerifyAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/verify/id/IDVerifyVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public IDVerifyAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IDVerifyVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1481), AFwS268S0000000_26.get$arr$(477), null, true);
        this.LLJJIII = new C1559260qg8(new C723590SZx(this, C1155560gB0.class, "id_verify_data"), checkSupervisorPrepared());
        this.LLJJIJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1139));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C1714180ui0 Ho() {
        return (C1714180ui0) this.LLJJIJI.getValue();
    }

    public final C1155560gB0 Jo() {
        return (C1155560gB0) this.LLJJIII.getValue();
    }

    public final C1748440vbG Lo() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qij) : null;
            this.LLJ = (C1748440vbG) viewFindViewById;
        }
        return (C1748440vbG) viewFindViewById;
    }

    public final C1748330vb5 No() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qik) : null;
            this.LLJIJIL = (C1748330vb5) viewFindViewById;
        }
        return (C1748330vb5) viewFindViewById;
    }

    public final C197039127h Oo() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qio) : null;
            this.LLJI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final IDVerifyVM So() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (IDVerifyVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String str;
        VerifyInfo verifyInfoLJIIIZ;
        VerifyDetail verifyDetail;
        VerifyDetail verifyDetailLJIIIIZZ;
        VerifyInfo verifyInfoLJIIIZ2;
        VerifyDetail verifyDetail2;
        super.onCreate();
        C1713570uh1 c1713570uh1 = Jo().LL;
        this.LLJJIJIIJIL = (c1713570uh1 != null ? c1713570uh1.LJFF() : null) == EnumC1714450uiR.HALF_PAGE;
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZJ(0);
        c0om1.LIZLLL = false;
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(this, 1387);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(awS570S0100000_26);
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB2.LIZJ(awS570S0100000_26);
        C1713570uh1 c1713570uh12 = Jo().LL;
        if (c1713570uh12 == null || (verifyInfoLJIIIZ2 = c1713570uh12.LJIIIZ()) == null || (verifyDetail2 = verifyInfoLJIIIZ2.verifyDetail) == null || (str = verifyDetail2.title) == null) {
            str = "";
        }
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qin) : null;
            this.LLJILJIL = (TuxNavBar) viewFindViewById;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById;
        if (tuxNavBar != null) {
            if (this.LLJJIJIIJIL) {
                View viewFindViewById2 = this.LLJILJILJ;
                if (viewFindViewById2 == null) {
                    View viewLJJIJL2 = LJJIJL();
                    viewFindViewById2 = viewLJJIJL2 != null ? viewLJJIJL2.findViewById(R.id.qip) : null;
                    this.LLJILJILJ = (TuxTextView) viewFindViewById2;
                }
                C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById2, 8);
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = str;
                c0om1.LIZJ = c1250250idj;
                c0om1.LIZIZ(c1251150ifB);
            } else {
                View viewFindViewById3 = this.LLJILJILJ;
                if (viewFindViewById3 == null) {
                    View viewLJJIJL3 = LJJIJL();
                    viewFindViewById3 = viewLJJIJL3 != null ? viewLJJIJL3.findViewById(R.id.qip) : null;
                    this.LLJILJILJ = (TuxTextView) viewFindViewById3;
                }
                ((TextView) viewFindViewById3).setText(str);
                c0om1.LJ(c1251150ifB2);
            }
            tuxNavBar.setNavActions(c0om1);
        }
        View viewFindViewById4 = this.LLJILLL;
        if (viewFindViewById4 == null) {
            View viewLJJIJL4 = LJJIJL();
            viewFindViewById4 = viewLJJIJL4 != null ? viewLJJIJL4.findViewById(R.id.qim) : null;
            this.LLJILLL = (TuxTextView) viewFindViewById4;
        }
        TextView textView = (TextView) viewFindViewById4;
        C1713570uh1 c1713570uh13 = Jo().LL;
        textView.setText((c1713570uh13 == null || (verifyDetailLJIIIIZZ = c1713570uh13.LJIIIIZZ()) == null) ? null : verifyDetailLJIIIIZZ.content);
        View viewFindViewById5 = this.LLJJ;
        if (viewFindViewById5 == null) {
            View viewLJJIJL5 = LJJIJL();
            viewFindViewById5 = viewLJJIJL5 != null ? viewLJJIJL5.findViewById(R.id.qil) : null;
            this.LLJJ = (TuxTextView) viewFindViewById5;
        }
        TextView textView2 = (TextView) viewFindViewById5;
        C1713570uh1 c1713570uh14 = Jo().LL;
        textView2.setText((c1713570uh14 == null || (verifyInfoLJIIIZ = c1713570uh14.LJIIIZ()) == null || (verifyDetail = verifyInfoLJIIIZ.verifyDetail) == null) ? null : verifyDetail.textFieldTitle);
        Oo().setEnabled(false);
        C1748330vb5 c1748330vb5No = No();
        if (c1748330vb5No != null) {
            c1748330vb5No.setMessageIcon(C958703ov.LIZ);
        }
        C1748330vb5 c1748330vb5No2 = No();
        if (c1748330vb5No2 != null) {
            c1748330vb5No2.setFadeInMessage(true);
        }
        C1748330vb5 c1748330vb5No3 = No();
        if (c1748330vb5No3 != null) {
            C786410Ut5.LLLLLLLZIL(c1748330vb5No3, 0);
        }
        C1748330vb5 c1748330vb5No4 = No();
        if (c1748330vb5No4 != null) {
            c1748330vb5No4.setMessage("");
        }
        C786410Ut5.U8(Oo(), new ACListenerS160S0100000_26(this, 55));
        IDVerifyVM iDVerifyVMSo = So();
        C23250099c.LIZLLL(iDVerifyVMSo.getLifecycleScope(), C0PEM.LIZJ.plus(iDVerifyVMSo.LLILZIL), null, new C1715030ujN(iDVerifyVMSo, null), 2);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        CountDownTimerC1715170ujb countDownTimerC1715170ujb = this.LLJJJ;
        if (countDownTimerC1715170ujb != null) {
            countDownTimerC1715170ujb.cancel();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C1748440vbG c1748440vbGLo = Lo();
        HandlerHook.viewPostDelay(c1748440vbGLo, new ARunnableS85S0200000_16(c1748440vbGLo, (Object) null, 71), 200L);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        C1714180ui0 c1714180ui0Ho = Ho();
        if (c1714180ui0Ho != null) {
            c1714180ui0Ho.LIZLLL(null);
        }
        Lo().LIZ(new C1775980wJg(this, 6));
    }

    @Override // com.ss.android.ugc.aweme.verify.ThemedContextUIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1714660uim c1714660uimVR;
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0ujX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1715090ujT) obj).LL);
            }
        }, null, new AwS640S0100000_26(this, 66), 6);
        IDVerifyVM iDVerifyVMSo = So();
        selectSubscribe(iDVerifyVMSo, new C2217381BqS() { // from class: X.0ujY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1715090ujT) obj).LLILLJJLI;
            }
        }, new C2217371BqR() { // from class: X.0ujd
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1715090ujT) obj).LLILLL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1715090ujT) obj).LLILLL = (DoVerifyResponse) obj2;
            }
        }, new C2217381BqS() { // from class: X.0ujZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1715090ujT) obj).LLILZ;
            }
        }, C736820SvI.LIZIZ(iDVerifyVMSo.usedInReusedScene), null, new C1776190wK1(this, 5));
        So().LLILZ = System.currentTimeMillis();
        BaseVerifyFragment baseVerifyFragmentLIZ = C1714230ui5.LIZ(this);
        if (baseVerifyFragmentLIZ != null && (c1714660uimVR = baseVerifyFragmentLIZ.VR()) != null) {
            c1714660uimVR.LIZ("fp_sdk_bnpl_idc_show", C2097908Jt.LIZJ(new Pair("interface_return_cost", CardStruct.IStatusCode.DEFAULT)));
        }
        C1714180ui0 c1714180ui0Ho = Ho();
        if (c1714180ui0Ho != null) {
            c1714180ui0Ho.LJI(null);
        }
    }

    public final void Go(String str, String str2) {
        C1714180ui0 c1714180ui0Ho;
        C1713680uhC c1713680uhC;
        BaseVerifyFragment baseVerifyFragment;
        if (Intrinsics.LJFF(str, "PASS")) {
            C1714180ui0 c1714180ui0Ho2 = Ho();
            if (c1714180ui0Ho2 != null) {
                c1714180ui0Ho2.LJFF("verify_success");
            }
        } else if (Intrinsics.LJFF(str, "REJECT") && (c1714180ui0Ho = Ho()) != null) {
            c1714180ui0Ho.LJFF("verify_failed");
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if ((fragmentLJI2 instanceof BaseVerifyFragment) && (baseVerifyFragment = (BaseVerifyFragment) fragmentLJI2) != null) {
                baseVerifyFragment.bS(str);
            }
            C1713570uh1 c1713570uh1 = Jo().LL;
            if (c1713570uh1 != null && (c1713680uhC = c1713570uh1.LJIILIIL) != null) {
                C1714230ui5.LIZJ(c1713680uhC, fragmentLJI, str, "bnpl_idc_verify", str2, null, 48);
            }
            if (this.LLJJIJIIJIL) {
                if (PipoVerificationRetentionPopupSettings.LIZ().LIZ()) {
                    BaseVerifyTuxSheet baseVerifyTuxSheet = ((BaseVerifyFragment) C724240Sb0.LJI(this)).LLJILJIL;
                    if (baseVerifyTuxSheet != null) {
                        baseVerifyTuxSheet.SR();
                        return;
                    }
                    return;
                }
                String str3 = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
                return;
            }
            C1714230ui5.LIZIZ(C724240Sb0.LIZ(this), Jo().LL, str);
        }
    }
}
