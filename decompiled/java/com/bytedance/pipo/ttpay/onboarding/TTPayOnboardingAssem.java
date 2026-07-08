package com.bytedance.pipo.ttpay.onboarding;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C098200Yq;
import X.C09R3;
import X.C1389890mGx;
import X.C1390130mHL;
import X.C1397510mTF;
import X.C13LE;
import X.C1716310ulR;
import X.C1717770unn;
import X.C1776190wK1;
import X.C1776210wK3;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C337180DJs;
import X.C452070Ho5;
import X.C452501pT;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736820SvI;
import X.C785410UrT;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC1717110umj;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingAssem;
import com.ss.android.ugc.aweme.component.phone.change.setting.PhoneSettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class TTPayOnboardingAssem extends BaseWalletLandingAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public String LLJJI;
    public final C01GW LLJJIII;
    public C1397510mTF LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TTPayOnboardingAssem.class, "vm", "getVm()Lcom/bytedance/pipo/ttpay/onboarding/TTPayOnBoardingViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TTPayOnboardingAssem.class, "phoneSettingVM", "getPhoneSettingVM()Lcom/ss/android/ugc/aweme/component/phone/change/setting/PhoneSettingViewModel;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final PhoneSettingViewModel Zo() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (PhoneSettingViewModel) assemVMLazy.getValue();
    }

    public final TTPayOnBoardingViewModel ap() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (TTPayOnBoardingViewModel) assemVMLazy.getValue();
    }

    public TTPayOnboardingAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TTPayOnBoardingViewModel.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 361);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(46);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS556S0100000_12, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((AbstractC738140SxQ) this, 60), aFwS268S0000000_26, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJILLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PhoneSettingViewModel.class);
        AwS556S0100000_12 awS556S0100000_122 = new AwS556S0100000_12(c19719912DlLIZ2, 362);
        AFwS268S0000000_26 aFwS268S0000000_262 = AFwS268S0000000_26.get$arr$(47);
        Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(this, c19719912DlLIZ2);
        AssemVMLazy assemVMLazy2 = new AssemVMLazy(function0LJIIJ2, awS556S0100000_122, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((AbstractC738140SxQ) this, 61), aFwS268S0000000_262, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ2, assemVMLazy2);
        this.LLJJ = assemVMLazy2;
        this.LLJJIII = C452501pT.LIZIZ(new AwS570S0100000_26(this, 59));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 360));
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        C1716310ulR.LIZ.getClass();
        C1716310ulR.LIZIZ = Long.valueOf(System.currentTimeMillis());
    }

    public final void bp(String str) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            if (str == null) {
                str = C1717770unn.LIZJ().getApplicationContext().getString(2131832569);
            }
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LIZLLL(3000L);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TTPayOnBoardingViewModel tTPayOnBoardingViewModelAp = ap();
        selectSubscribe(tTPayOnBoardingViewModelAp, new C2217381BqS() { // from class: X.0un7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717130uml) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0unB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717130uml) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0un9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717130uml) obj).LLILZLL;
            }
        }, new C2217381BqS() { // from class: X.0unC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717130uml) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0unD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717130uml) obj).LLILZ;
            }
        }, C736820SvI.LIZIZ(tTPayOnBoardingViewModelAp.usedInReusedScene), null, new C1776210wK3(this, 0));
        TTPayOnBoardingViewModel tTPayOnBoardingViewModelAp2 = ap();
        selectSubscribe(tTPayOnBoardingViewModelAp2, new C2217381BqS() { // from class: X.0un8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717130uml) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0un6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717130uml) obj).LLILZIL;
            }
        }, new C2217381BqS() { // from class: X.0unA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1717130uml) obj).LLILZLL;
            }
        }, C736820SvI.LIZIZ(tTPayOnBoardingViewModelAp2.usedInReusedScene), null, new C1776190wK1(this, 0));
        TTPayOnBoardingViewModel tTPayOnBoardingViewModelAp3 = ap();
        String str = Go().LL;
        String str2 = Go().LLILLJJLI;
        tTPayOnBoardingViewModelAp3.setState(AFwS268S0000000_26.get$arr$(536));
        tTPayOnBoardingViewModelAp3.wQ2(str, str2, true);
    }

    public final void cp(boolean z, EnumC1717110umj enumC1717110umj) {
        Object c098200Yq;
        if (z) {
            if (enumC1717110umj == EnumC1717110umj.CHANGE_PHONE) {
                DialogC1389620mGW dialogC1389620mGW = (DialogC1389620mGW) this.LLJJIJIIJIL.getValue();
                if (dialogC1389620mGW != null) {
                    dialogC1389620mGW.setCanceledOnTouchOutside(false);
                    C786410Ut5.J4(dialogC1389620mGW);
                    return;
                }
                return;
            }
            C337180DJs.LIZJ((View) this.LLJJIII.getValue());
            return;
        }
        if (enumC1717110umj == EnumC1717110umj.CHANGE_PHONE) {
            try {
                DialogC1389620mGW dialogC1389620mGW2 = (DialogC1389620mGW) this.LLJJIJIIJIL.getValue();
                if (dialogC1389620mGW2 != null) {
                    dialogC1389620mGW2.dismiss();
                    C785410UrT.LIZ(dialogC1389620mGW2);
                    c098200Yq = Unit.LIZ;
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        C786410Ut5.LLZ((C1390130mHL) this.LLJJIII.getValue(), 8);
    }
}
