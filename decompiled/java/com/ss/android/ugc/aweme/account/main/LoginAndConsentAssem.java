package com.ss.android.ugc.aweme.account.main;

import X.AbstractC848400XPy;
import X.C013C;
import X.C01GW;
import X.C0QSJ;
import X.C0XQ7;
import X.C10R5;
import X.C10RP;
import X.C10RS;
import X.C10T2;
import X.C10T8;
import X.C10T9;
import X.C10TE;
import X.C10TF;
import X.C10TI;
import X.C10TJ;
import X.C10TV;
import X.C1150504el;
import X.C11NZ;
import X.C11S5;
import X.C1388190mED;
import X.C13LE;
import X.C1514430pVp;
import X.C19249910Sr;
import X.C19254610Um;
import X.C199B;
import X.C19EG;
import X.C2140508a3;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C259800zU;
import X.C285090BFj;
import X.C294580Bge;
import X.C452501pT;
import X.C477901tZ;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC214902198i;
import X.InterfaceC2217461Bqa;
import X.InterfaceC427710Gpt;
import X.InterfaceC497601wk;
import X.InterfaceC665370Q7z;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.INewUserJourneyAppDiffService;
import com.ss.android.ugc.aweme.journey.INewUserJourneyService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS262S0300000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class LoginAndConsentAssem extends BaseMainContainerAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static boolean LLJILLL;
    public C19EG LL;
    public boolean LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new C10TI());
    public final C01GW LLILZ = C452501pT.LIZIZ(new C10T2());
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C10T9());
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C10TF());
    public final C01GW LLIZ = C452501pT.LIZIZ(new C10TE());
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C10T8());
    public final C01GW LLJ = C452501pT.LIZIZ(new C10TJ(this));
    public volatile MainBusinessAbility LLJI;
    public InterfaceC665370Q7z LLJIJIL;
    public C0QSJ LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LoginAndConsentAssem.class, "mainBusinessAbility", "getMainBusinessAbility()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void splashOverShowMandatoryLoginPage() {
        bo(false, false);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, X.01kM] */
    public final boolean fo() {
        C19EG c19egLIZIZ;
        INewUserJourneyService iNewUserJourneyService = (INewUserJourneyService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyService.class, false, false, false, 14, null);
        if (!LLJILLL) {
            LLJILLL = true;
            if (!C1514430pVp.LIZLLL().booleanValue() && iNewUserJourneyService != null && iNewUserJourneyService.LJJIIZI()) {
                iNewUserJourneyService.LJJII();
                final InterfaceC214902198i interfaceC214902198iLJJIII = iNewUserJourneyService.LJJIII();
                Context context = getContext();
                final InterfaceC214902198i interfaceC214902198iLJIILLIIL = (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) ? null : SAFExtensionKt.LJIILLIIL(c19egLIZIZ);
                final C199B c199b = new C199B(null, null, null, true, false, null, null, 119);
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = C11NZ.LJJJJI(new Callable() { // from class: X.0hQQ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("LoginAndConsentAssem@d9ba.checkNonFirstNUJ$1$1");
                        this.LL.lo(new AwS262S0300000_18(interfaceC214902198iLJIILLIIL, c199b, interfaceC214902198iLJJIII, 1));
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("LoginAndConsentAssem@d9ba.checkNonFirstNUJ$1$1");
                        return unit;
                    }
                }).LJL(C11S5.LIZ()).LJJLJLI(new AfS181S0100000_12(c259800zU, 119));
                return true;
            }
        }
        return false;
    }

    public final C19EG getActivity() {
        C19EG c19eg = this.LL;
        if (c19eg != null) {
            return c19eg;
        }
        return null;
    }

    public final IAccountService ho() {
        return (IAccountService) this.LLIZLLLIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e A[Catch: all -> 0x003c, PHI: r1
      0x002e: PHI (r1v2 X.0QSJ) = (r1v1 X.0QSJ), (r1v4 X.0QSJ) binds: [B:10:0x0014, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:7:0x000e, B:9:0x0012, B:11:0x0016, B:13:0x001a, B:14:0x0020, B:17:0x0036, B:18:0x0038, B:16:0x002e), top: B:36:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean oi2() {
        /*
            r6 = this;
            boolean r0 = X.C297720Bli.LIZ()
            r2 = 0
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L3f
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = r6.LLJI
            if (r0 != 0) goto L57
            monitor-enter(r6)
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = r6.LLJI     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L3a
            X.0QSJ r1 = r6.LLJILJIL     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L2e
            X.0Q7z r3 = r6.LLJIJIL     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L20
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r6)     // Catch: java.lang.Throwable -> L3c
            r6.LLJIJIL = r3     // Catch: java.lang.Throwable -> L3c
        L20:
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r0 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r1[r5] = r0     // Catch: java.lang.Throwable -> L3c
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r1)     // Catch: java.lang.Throwable -> L3c
            r6.LLJILJIL = r1     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L36
        L2e:
            java.lang.Class<com.ss.android.ugc.aweme.base.MainBusinessAbility> r0 = com.ss.android.ugc.aweme.base.MainBusinessAbility.class
            java.lang.Object r2 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L3c
            com.ss.android.ugc.aweme.base.MainBusinessAbility r2 = (com.ss.android.ugc.aweme.base.MainBusinessAbility) r2     // Catch: java.lang.Throwable -> L3c
        L36:
            r6.LLJI = r2     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3c
            goto L54
        L3a:
            monitor-exit(r6)
            goto L57
        L3c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L3f:
            X.0Q7z r1 = X.C1558520qew.LJIIL(r6)
            java.lang.Class<com.ss.android.ugc.aweme.base.MainBusinessAbility> r0 = com.ss.android.ugc.aweme.base.MainBusinessAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = (com.ss.android.ugc.aweme.base.MainBusinessAbility) r0
            if (r0 == 0) goto L5e
            boolean r0 = r0.oi2()
            if (r0 != r4) goto L5e
            goto L5d
        L54:
            r0 = r2
            if (r2 == 0) goto L5e
        L57:
            boolean r0 = r0.oi2()
            if (r0 != r4) goto L5e
        L5d:
            r5 = 1
        L5e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.main.LoginAndConsentAssem.oi2():boolean");
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        IAccountService iAccountServiceHo;
        AccountUserService accountUserServiceLJIIJ;
        super.onDestroy();
        InterfaceC427710Gpt interfaceC427710Gpt = (InterfaceC427710Gpt) this.LLJ.getValue();
        if (interfaceC427710Gpt == null || (iAccountServiceHo = ho()) == null || (accountUserServiceLJIIJ = iAccountServiceHo.LJIIJ()) == null) {
            return;
        }
        accountUserServiceLJIIJ.LJIILLIIL(interfaceC427710Gpt);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            this.LL = c19egLIZ;
        } else {
            "LoginAndConsentAssem should be attach to MainActivity.".toString();
            throw new IllegalArgumentException("LoginAndConsentAssem should be attach to MainActivity.");
        }
    }

    public final void ko(String str) {
        IPNSConsentConfigService iPNSConsentConfigServiceLJIIIZ;
        IGuestModeService iGuestModeService = (IGuestModeService) this.LLIZ.getValue();
        if (iGuestModeService != null) {
            iGuestModeService.LJ();
        }
        C19254610Um c19254610Um = C19254610Um.LIZIZ;
        c19254610Um.LJJIL().LJII();
        c19254610Um.LJJIL().LIZLLL(str);
        if (C294580Bge.LIZ() && (iPNSConsentConfigServiceLJIIIZ = ComplianceServiceProvider.LJIIIZ()) != null) {
            iPNSConsentConfigServiceLJIIIZ.LJ(null, null);
        }
        if (c19254610Um.LJIIJJI().LIZ()) {
            ITpcConsentService iTpcConsentServiceLJJIII = ComplianceServiceProvider.LJJIII();
            if (iTpcConsentServiceLJJIII.LJ()) {
                mo("show_consent_box");
                iTpcConsentServiceLJJIII.LIZ("login_consent");
            }
        }
    }

    public final void lo(Function0<Unit> function0) {
        if (!C2140508a3.LIZ()) {
            C23250099c.LIZLLL((InterfaceC497601wk) this.LLILZ.getValue(), null, null, new C477901tZ(function0, null), 3);
        } else {
            function0.invoke();
        }
    }

    public final void mo(String str) {
        C19249910Sr c19249910Sr = C19249910Sr.LIZIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action", str);
        c19249910Sr.LIZIZ(c2344009Gk, "login_and_consent_launch");
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onCreate(Bundle bundle) {
        boolean z = true;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{getClass().getSimpleName(), "onCreate_with_bundle"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate(bundle);
        if (((Boolean) C285090BFj.LJJJJZ.getValue()).booleanValue() && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            fo();
        } else {
            boolean booleanExtra = getActivity().getIntent().getBooleanExtra("restart_from_logout", false);
            boolean zOi2 = oi2();
            Intent intent = getActivity().getIntent();
            if (intent == null || !intent.getBooleanExtra("from_require_login", false)) {
                z = false;
            }
            m156do(booleanExtra, zOi2, z);
            C19254610Um.LIZIZ.LJIIJJI().LIZJ();
            C10RP.LJI("");
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onNewIntent(Intent intent) {
        boolean zLJI = MethodIDManager.LJI(71871);
        super.onNewIntent(intent);
        boolean z = false;
        boolean booleanExtra = intent.getBooleanExtra("restart_from_logout", false);
        boolean zOi2 = oi2();
        if (intent.getBooleanExtra("from_require_login", false)) {
            z = true;
        }
        m156do(booleanExtra, zOi2, z);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void bo(boolean z, boolean z2) {
        boolean zShouldShowForcedLogin;
        final Boolean bool;
        boolean zLJI = MethodIDManager.LJI(72109);
        boolean z3 = false;
        if (((Keva) this.LLILLL.getValue()).getBoolean("did_launch", false) && C1514430pVp.LIZLLL().booleanValue()) {
            ((Keva) this.LLILLL.getValue()).storeBoolean("did_launch", true);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C19254610Um c19254610Um = C19254610Um.LIZIZ;
        c19254610Um.LJJIJIIJIL("login_and_consent_assem");
        boolean zLJIIIIZZ = c19254610Um.LJJIL().LJIIIIZZ();
        IGuestModeService iGuestModeService = (IGuestModeService) this.LLIZ.getValue();
        if (iGuestModeService != null && iGuestModeService.isGuestMode()) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        IMandatoryLoginService iMandatoryLoginService = (IMandatoryLoginService) this.LLILZLL.getValue();
        if (iMandatoryLoginService != null) {
            zShouldShowForcedLogin = iMandatoryLoginService.shouldShowForcedLogin(true);
        } else {
            zShouldShowForcedLogin = true;
        }
        if (z && zShouldShowForcedLogin) {
            z3 = true;
        }
        final C013C c013c = new C013C();
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        final C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = "";
        final C013C c013c2 = new C013C();
        INewUserJourneyAppDiffService iNewUserJourneyAppDiffService = (INewUserJourneyAppDiffService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyAppDiffService.class, false, false, false, 14, null);
        if (iNewUserJourneyAppDiffService != null) {
            iNewUserJourneyAppDiffService.LIZ();
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        if (z3) {
            c013c.element = true;
            c259800zU.element = "log_out";
            c259800zU2.element = "normal";
        } else {
            C10R5 c10r5 = C10R5.LJIIIIZZ;
            if (C10RS.LIZ().LIZIZ() != 2 && !this.LLILLJJLI && zShouldShowForcedLogin) {
                c013c.element = true;
                c259800zU.element = "cold_launch";
                c259800zU2.element = "normal";
                this.LLILLJJLI = true;
                c013c2.element = true;
            } else if (z2) {
                c013c.element = true;
                c259800zU.element = "deep_link";
                c013c2.element = true;
            }
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            c259800zU.element = "m2_login_silently";
            c259800zU2.element = "login_and_consent";
        }
        if (zLJIIIIZZ) {
            c013c.element = true;
            if (!z && c19254610Um.LJJIL().LIZ()) {
                c259800zU2.element = "nvv_forced_login";
            }
        }
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService != null) {
            iPluginService.subscribeInit(new C10TV() { // from class: X.10Se
                /* JADX WARN: Removed duplicated region for block: B:60:0x013c  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0188  */
                @Override // X.C10TV
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 472
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C19248610Se.LIZ():void");
                }
            });
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, X.01kM] */
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m156do(final boolean z, final boolean z2, final boolean z3) {
        if (fo()) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C11NZ.LJJJJI(new Callable() { // from class: X.10Sk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("LoginAndConsentAssem@d9ba.checkAndShowMandatoryLoginPage$1");
                C10R5 c10r5 = C10R5.LJIIIIZZ;
                if ((C10RS.LIZ().LIZIZ() != 2 && !z2) || z3 || z) {
                    this.bo(z, z3);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LoginAndConsentAssem@d9ba.checkAndShowMandatoryLoginPage$1");
                return unit;
            }
        }).LJL(C11S5.LIZ()).LJJLJLI(new AfS181S0100000_12(c259800zU, 118));
    }
}
