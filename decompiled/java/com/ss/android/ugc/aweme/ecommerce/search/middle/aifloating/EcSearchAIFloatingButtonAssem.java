package com.ss.android.ugc.aweme.ecommerce.search.middle.aifloating;

import X.AnonymousClass0378;
import X.C03IJ;
import X.C0QPH;
import X.C0QPI;
import X.C0QUT;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1766860w4y;
import X.C1906580ziK;
import X.C19659111vp;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C674500Qcy;
import X.C674510Qcz;
import X.C674520Qd0;
import X.C674540Qd2;
import X.C674570Qd5;
import X.C674580Qd6;
import X.C674620QdA;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1164530gPT;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC674600Qd8;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.middle.aifloating.EcSearchAIFloatingButtonAssem;
import com.ss.android.ugc.aweme.ecommerce.search.middle.aifloating.EcSearchAIFloatingButtonVM;
import com.ss.android.ugc.aweme.ecommerce.search.page.state.IEcSearchPageStateObserveAbility;
import com.ss.android.ugc.aweme.ecommerce.search.utils.EcSearchKeyboardMonitor;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import g1c.AjS42S0200000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS25S0010000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchAIFloatingButtonAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C0QPI.class, null), checkSupervisorPrepared());
    public InterfaceC420801kM LLJ;
    public final AssemVMLazy LLJI;
    public View LLJIJIL;
    public EcSearchKeyboardMonitor LLJILJIL;
    public C674510Qcz LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final C674520Qd0 LLJJI;
    public final C674540Qd2 LLJJIII;
    public final C674500Qcy LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EcSearchAIFloatingButtonAssem.class, "floatingButtonVM", "getFloatingButtonVM()Lcom/ss/android/ugc/aweme/ecommerce/search/middle/aifloating/EcSearchAIFloatingButtonVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Qd0] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0Qd2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0Qcy] */
    public EcSearchAIFloatingButtonAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EcSearchAIFloatingButtonVM.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 39), AFwS241S0000000_10.get$arr$(45), null, true);
        this.LLJJI = new C0QPH() { // from class: X.0Qd0
            @Override // X.C0QPH
            public final void q8(C0QUT c0qut, C0QUT c0qut2, SearchResultParam searchResultParam) {
            }

            @Override // X.C0QPH
            public final void pc(C0QUT c0qut, C0QUT c0qut2) {
                EcSearchAIFloatingButtonVM ecSearchAIFloatingButtonVMGo = this.LL.Go();
                if (ecSearchAIFloatingButtonVMGo.LLILLJJLI != c0qut2) {
                    ecSearchAIFloatingButtonVMGo.setStateImmediate(new AwS25S0010000_10(ecSearchAIFloatingButtonVMGo.LL.contains(c0qut2), 18));
                    ecSearchAIFloatingButtonVMGo.LLILLJJLI = c0qut2;
                }
            }
        };
        this.LLJJIII = new InterfaceC674600Qd8() { // from class: X.0Qd2
            @Override // X.InterfaceC674600Qd8
            public final void LIZ() {
            }

            @Override // X.InterfaceC674600Qd8
            public final void LIZIZ(int i) {
            }

            @Override // X.InterfaceC674600Qd8
            public final void onHide(int i) {
                this.LIZ.Go().vQ2(i);
            }

            @Override // X.InterfaceC674600Qd8
            public final void onShow(int i) {
                this.LIZ.Go().vQ2(i);
            }
        };
        this.LLJJIJI = new InterfaceC1164530gPT() { // from class: X.0Qcy
            @Override // X.InterfaceC1164530gPT
            public final void onEvent(String str, String str2) {
                Object c098200Yq;
                try {
                    c098200Yq = new JSONObject(str2);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                String str3 = null;
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                JSONObject jSONObject = (JSONObject) c098200Yq;
                if (jSONObject != null) {
                    EcSearchAIFloatingButtonAssem ecSearchAIFloatingButtonAssem = this.LL;
                    C674510Qcz c674510Qcz = ecSearchAIFloatingButtonAssem.LLJILJILJ;
                    if (c674510Qcz != null) {
                        str3 = c674510Qcz.LIZ;
                    }
                    if (Intrinsics.LJFF(str3, jSONObject.optString("ai_session_id"))) {
                        String strOptString = jSONObject.optString("session_id");
                        C674510Qcz c674510Qcz2 = ecSearchAIFloatingButtonAssem.LLJILJILJ;
                        if (c674510Qcz2 != null) {
                            c674510Qcz2.LIZJ = strOptString;
                        }
                    }
                }
            }
        };
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final EcSearchAIFloatingButtonVM Go() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (EcSearchAIFloatingButtonVM) assemVMLazy.getValue();
    }

    public final IEcSearchPageStateObserveAbility Ho() {
        return (IEcSearchPageStateObserveAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IEcSearchPageStateObserveAbility.class, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        AnonymousClass0378.LIZ().LIZLLL("update_ai_session_info", this.LLJJIJI);
        C1766860w4y.LIZ.getClass();
        String strLIZIZ = C1766860w4y.LIZIZ("ec_search_session_id");
        if (strLIZIZ != null) {
            this.LLJILJILJ = new C674510Qcz(strLIZIZ);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0378.LIZ().LIZJ("update_ai_session_info", this.LLJJIJI);
        this.LLJILJILJ = null;
        InterfaceC420801kM interfaceC420801kM = this.LLJ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LLJ = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        View view;
        super.onStart();
        if (this.LLJILLL && (view = this.LLJIJIL) != null && view.getVisibility() == 0) {
            if (this.LLJJ) {
                C674510Qcz c674510Qcz = this.LLJILJILJ;
                if (c674510Qcz != null) {
                    c674510Qcz.LIZIZ = true;
                }
            } else {
                C674510Qcz c674510Qcz2 = this.LLJILJILJ;
                if (c674510Qcz2 != null) {
                    c674510Qcz2.LIZIZ = false;
                    c674510Qcz2.LIZJ = null;
                }
            }
            IEcSearchPageStateObserveAbility iEcSearchPageStateObserveAbilityHo = Ho();
            C0QUT c0qutBo2 = iEcSearchPageStateObserveAbilityHo != null ? iEcSearchPageStateObserveAbilityHo.bo2() : null;
            C674510Qcz c674510Qcz3 = this.LLJILJILJ;
            C674620QdA.LIZ(c0qutBo2, c674510Qcz3 != null ? c674510Qcz3.LIZ() : null);
        }
        this.LLJILLL = false;
        this.LLJJ = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        if (C1906580ziK.LJI()) {
            return;
        }
        this.LLJILLL = true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewStub viewStub;
        super.onViewCreated(view);
        View viewLJLLLL = null;
        if ((view instanceof ViewStub) && (viewStub = (ViewStub) view) != null) {
            viewStub.setLayoutResource(R.layout.bqd);
            viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        }
        this.LLJIJIL = viewLJLLLL;
        if (viewLJLLLL != null) {
            Context context = viewLJLLLL.getContext();
            if (context != null) {
                C19659111vp c19659111vp = new C19659111vp();
                c19659111vp.LIZ = C418440Gaw.LIZIZ(Integer.valueOf(R.dimen.bs));
                C786410Ut5.Ld(viewLJLLLL, C418440Gaw.LIZIZ(6));
                c19659111vp.LIZLLL = C418440Gaw.LIZIZ(24);
                c19659111vp.LJ = Integer.valueOf(R.attr.ar7);
                viewLJLLLL.setBackground(c19659111vp.LIZ(context));
            }
            View viewFindViewById = viewLJLLLL.findViewById(R.id.anu);
            if (viewFindViewById != null) {
                C786410Ut5.I7(new AjS42S0200000_10(viewFindViewById, this, 5), viewFindViewById);
            }
            C674540Qd2 c674540Qd2 = this.LLJJIII;
            LifecycleRegistry lifecycle = getLifecycle();
            EcSearchKeyboardMonitor ecSearchKeyboardMonitor = new EcSearchKeyboardMonitor(viewLJLLLL, c674540Qd2, lifecycle);
            this.LLJILJIL = ecSearchKeyboardMonitor;
            lifecycle.addObserver(ecSearchKeyboardMonitor);
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0Qd3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C674530Qd1) obj).LLILLJJLI;
            }
        }, null, new AwS624S0100000_10(this, 144), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0Qd4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C674530Qd1) obj).LL;
            }
        }, null, new AwS624S0100000_10(this, 145), 6);
        IEcSearchPageStateObserveAbility iEcSearchPageStateObserveAbilityHo = Ho();
        if (iEcSearchPageStateObserveAbilityHo != null) {
            InterfaceC420801kM interfaceC420801kM = this.LLJ;
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
            this.LLJ = iEcSearchPageStateObserveAbilityHo.fp0(this.LLJJI);
            C0QUT c0qutBo2 = iEcSearchPageStateObserveAbilityHo.bo2();
            if (c0qutBo2 != null) {
                EcSearchAIFloatingButtonVM ecSearchAIFloatingButtonVMGo = Go();
                if (ecSearchAIFloatingButtonVMGo.LLILLJJLI != c0qutBo2) {
                    ecSearchAIFloatingButtonVMGo.setStateImmediate(new AwS25S0010000_10(ecSearchAIFloatingButtonVMGo.LL.contains(c0qutBo2), 18));
                    ecSearchAIFloatingButtonVMGo.LLILLJJLI = c0qutBo2;
                }
            }
        }
        EcSearchKeyboardMonitor ecSearchKeyboardMonitor2 = this.LLJILJIL;
        if (ecSearchKeyboardMonitor2 != null) {
            C674570Qd5 c674570Qd5LIZ = C674580Qd6.LIZ(ecSearchKeyboardMonitor2.LL);
            if (c674570Qd5LIZ.LIZ) {
                Go().vQ2(c674570Qd5LIZ.LIZIZ);
            }
        }
    }
}
