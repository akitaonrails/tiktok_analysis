package com.ss.android.ugc.aweme.account.login.v2.ui;

import X.AbstractActivityC1237560iJG;
import X.AbstractC851770XbD;
import X.C013C;
import X.C01GW;
import X.C093Y;
import X.C0NQH;
import X.C0XTQ;
import X.C0XVI;
import X.C0XVM;
import X.C0XX8;
import X.C1013780cUK;
import X.C1207404nw;
import X.C123100dR;
import X.C1238280iKQ;
import X.C1238730iL9;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C1913610ztf;
import X.C19285110cb;
import X.C19293810e0;
import X.C2188811AlT;
import X.C23250099c;
import X.C293980Bfg;
import X.C294580Bge;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C696310RSz;
import X.C786410Ut5;
import X.C848230XPh;
import X.C849800XVi;
import X.C851740XbA;
import X.C851800XbG;
import X.C852160Xbq;
import X.C960203pA;
import X.EnumC1913590ztd;
import X.EnumC335920DEw;
import X.EnumC851330XaV;
import X.EnumC851810XbH;
import X.EnumC852910Xd3;
import X.EnumC902550Zav;
import X.EnumC994670bzV;
import X.InterfaceC1238290iKR;
import X.InterfaceC1703520uQo;
import X.InterfaceC1913620ztg;
import X.InterfaceC1916090zxf;
import X.InterfaceC851550Xar;
import X.InterfaceC851820XbI;
import X.InterfaceC876920Yag;
import Y.ACListenerS162S0100000_28;
import Y.AObserverS176S0200000_11;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelLazy;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.hook.AfterLoginHook;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.signup.OptionalSignupStepsViewModel;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.ss.android.ugc.aweme.account.main.AgeGateAccountWrapperFragment;
import com.ss.android.ugc.aweme.changeregion.sdk.model.Country;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.InlineLink;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.TextWithInlineLink;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS222S0300000_13;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class SignUpOrLoginActivity extends AbstractActivityC1237560iJG implements InterfaceC1238290iKR, InterfaceC1916090zxf, InterfaceC876920Yag {
    public static final HashSet<Integer> LLJJJJ = C093Y.LIZJ(2013, 1039, 2100);
    public static final HashSet<Integer> LLJJJJJIL = C093Y.LIZJ(1051, 1031, 17, 1049, 1047, 1383, 2017);
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiHELIOSJSA0IStiP319PSxiGiY0JhA8Bj0fJyIlJw4wPCw6IDsq";
    public Integer LLILZIL;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public InterfaceC851550Xar LLJJI;
    public boolean LLJJIII;
    public C696310RSz LLJJIJI;
    public AgeGateAccountWrapperFragment LLJJIJIIJIL;
    public EnumC852910Xd3 LLILZLL = EnumC852910Xd3.PHONE_EMAIL_LOGIN;
    public EnumC852910Xd3 LLIZ = EnumC852910Xd3.NONE;
    public Bundle LLJI = new Bundle();
    public final IAccountService LLJILJILJ = (IAccountService) ServiceManager.get().getService(IAccountService.class);
    public final C19285110cb LLJILLL = new InterfaceC851820XbI() { // from class: X.10cb
        @Override // X.InterfaceC851820XbI
        public final void LIZIZ() {
            this.LIZ.finish();
            C1013780cUK c1013780cUK = C1013780cUK.LIZ;
            EnumC902550Zav enumC902550Zav = EnumC902550Zav.REFACTOR;
            EnumC994670bzV enumC994670bzV = EnumC994670bzV.NORMAL;
            c1013780cUK.getClass();
            C1013780cUK.LIZ(enumC902550Zav, enumC994670bzV);
        }

        @Override // X.InterfaceC851820XbI
        public final void LIZ(EnumC852910Xd3 enumC852910Xd3, Bundle bundle) {
            SignUpOrLoginActivity signUpOrLoginActivity = this.LIZ;
            signUpOrLoginActivity.getClass();
            C853670XeH.LIZ.getClass();
            AbstractActivityC1237560iJG.LLLZ(signUpOrLoginActivity, C853670XeH.LIZ(enumC852910Xd3), bundle);
            C1013780cUK c1013780cUK = C1013780cUK.LIZ;
            EnumC902550Zav enumC902550Zav = EnumC902550Zav.REFACTOR;
            c1013780cUK.getClass();
            C20684815ws.LJIILLIIL("optional_signup_page_show", C2097608Jq.LJIIIIZZ(new Pair("type", enumC902550Zav.name()), new Pair("step", enumC852910Xd3.name())));
        }
    };
    public final ViewModelLazy LLJJ = new ViewModelLazy(C13LE.LIZ(OptionalSignupStepsViewModel.class), new AwS572S0100000_28((ComponentActivity) this, 112), new AwS572S0100000_28((ComponentActivity) this, 111), new AwS429S0200000_28((Function0) null, this, 14));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 110));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 109));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 108));

    @Override // X.InterfaceC1916090zxf
    public final boolean getCanCollectConsent() {
        return false;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final OptionalSignupStepsViewModel LLLZLZ() {
        return (OptionalSignupStepsViewModel) this.LLJJ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void finish() {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity.finish():void");
    }

    @Override // X.AbstractActivityC1237560iJG, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        IPNSChangeRegionService iPNSChangeRegionService;
        ((CopyOnWriteArrayList) C1238280iKQ.LIZIZ).remove(this);
        this.LLJJIII = false;
        C696310RSz c696310RSz = this.LLJJIJI;
        if (c696310RSz != null && (iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null)) != null) {
            iPNSChangeRegionService.LJII(c696310RSz);
        }
        this.LLJJI = null;
        C851740XbA c851740XbA = LLLZLZ().LLILLJJLI;
        if (c851740XbA != null) {
            c851740XbA.LIZLLL = null;
            if (c851740XbA.LIZIZ != EnumC851810XbH.STARTED) {
                ((ArrayList) c851740XbA.LIZJ).clear();
            }
        }
        this.LLJILJILJ.LIZJ().setPostRegistrationOptionalFlowDisplayed(false);
        super.onDestroy();
    }

    @Override // X.AbstractActivityC1237560iJG, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onStart", true);
        super.onStart();
        this.LLJILJILJ.LIZJ().loginPanelDisplayedUpdate(true, C13LE.LIZ(getClass()).LJI());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onStart", false);
    }

    @Override // X.InterfaceC876920Yag
    public final List<Integer> zs() {
        return Collections.singletonList(10);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.LLJILJILJ.LIZJ().loginPanelDisplayedUpdate(false, C13LE.LIZ(getClass()).LJI());
        if (this.LLILLL) {
            finish();
        }
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.InterfaceC1238290iKR
    public final void LLJJ(int i) {
        if (i == 9) {
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    @Override // X.AbstractActivityC1237560iJG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZLLIL(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity.LLLLZLLIL(android.os.Bundle):void");
    }

    @Override // X.AbstractActivityC1237560iJG
    public final void LLLLZLLLI(Bundle bundle) {
        boolean z;
        String string;
        int i;
        this.LLIZLLLIL = true;
        BaseAccountFlowFragment baseAccountFlowFragmentLLLLZI = LLLLZI();
        if (bundle == null) {
            bundle = new Bundle();
        }
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("optional_signup_bundle_copy_rollback_android", false)) {
            bundle = new Bundle(bundle);
        }
        if (!TextUtils.isEmpty(C0XTQ.LIZIZ)) {
            C786410Ut5.LJJJI("enter_from", C0XTQ.LIZIZ, bundle);
        }
        if (!TextUtils.isEmpty(C0XTQ.LIZ)) {
            C786410Ut5.LJJJI("enter_method", C0XTQ.LIZ, bundle);
        }
        if (!TextUtils.isEmpty(C0XTQ.LIZJ)) {
            C786410Ut5.LJJJI("login_panel_type", C0XTQ.LIZJ, bundle);
        }
        if (this.LLJ) {
            try {
                SettingsManager.LIZLLL().getClass();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (SettingsManager.LIZ("fix_page_overwrite_after_age_gate", true)) {
                z = true;
            }
            z = false;
        } else {
            z = false;
        }
        if (z) {
            string = bundle.getString("page");
        } else {
            string = null;
        }
        if (z) {
            i = bundle.getInt("current_scene", -1);
        } else {
            i = -1;
        }
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                C786410Ut5.LJJIIJZLJL(bundle, extras);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (string != null && !Intrinsics.LJFF(string, bundle.getString("page"))) {
            C786410Ut5.LJJJI("page", string, bundle);
        }
        if (i != -1 && i != bundle.getInt("current_scene", -1)) {
            bundle.putInt("current_scene", i);
        }
        Integer num = this.LLILZIL;
        if (num != null) {
            bundle.putInt("kr_marketing_notification_operation", num.intValue());
        }
        ComplianceServiceProvider.LJJI().LJIJJ();
        if (baseAccountFlowFragmentLLLLZI != null) {
            baseAccountFlowFragmentLLLLZI.dk(1);
        }
        if (C0XVM.LIZ(bundle) == 0) {
            this.LLJILJIL = bundle.getBoolean("should_setup_pin");
        }
        if (C293980Bfg.LIZIZ()) {
            C848230XPh.LL.getClass();
            C849800XVi.LIZIZ(new C0XVI(bundle, C848230XPh.LLJI, false), C0NQH.LIZ(AfterLoginHook.LIZ, null, null, new C0XX8(this, baseAccountFlowFragmentLLLLZI, bundle, null), 7));
        } else {
            C849800XVi.LIZ(bundle, new AwS222S0300000_13(this, baseAccountFlowFragmentLLLLZI, bundle, 2));
        }
    }

    public final void LLZ(Bundle bundle) {
        EnumC851330XaV enumC851330XaV;
        boolean z = true;
        this.LLJ = true;
        this.LLJILJILJ.LIZJ().setPostRegistrationOptionalFlowDisplayed(true);
        C013C c013c = new C013C();
        if (LLLZLZ().LLILLJJLI == null) {
            OptionalSignupStepsViewModel optionalSignupStepsViewModelLLLZLZ = LLLZLZ();
            int iIntValue = 0;
            if (optionalSignupStepsViewModelLLLZLZ.LL.contains("optional_signup_type")) {
                Integer num = (Integer) optionalSignupStepsViewModelLLLZLZ.LL.get("optional_signup_type");
                if (num != null) {
                    iIntValue = num.intValue();
                }
                enumC851330XaV = EnumC851330XaV.values()[iIntValue];
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Restored signup type: ");
                sbLIZ.append(enumC851330XaV);
                C2188811AlT.LIZIZ(sbLIZ);
            } else {
                if (bundle.getBoolean("phone_signup", false)) {
                    enumC851330XaV = EnumC851330XaV.PHONE;
                } else if (!bundle.getBoolean("email_signup", false) && !bundle.getBoolean("email_otp_signup", false)) {
                    if (bundle.getBoolean("is_new_3p_signup")) {
                        enumC851330XaV = EnumC851330XaV.THIRD_PARTY;
                    } else {
                        z = false;
                        c013c.element = z;
                        if (z || LLLZLZ().LLILLJJLI == null) {
                            finish();
                            C1013780cUK c1013780cUK = C1013780cUK.LIZ;
                            EnumC902550Zav enumC902550Zav = EnumC902550Zav.REFACTOR;
                            EnumC994670bzV enumC994670bzV = EnumC994670bzV.INVALID;
                            c1013780cUK.getClass();
                            C1013780cUK.LIZ(enumC902550Zav, enumC994670bzV);
                            return;
                        }
                    }
                } else {
                    enumC851330XaV = EnumC851330XaV.EMAIL;
                }
                optionalSignupStepsViewModelLLLZLZ.LL.set("optional_signup_type", Integer.valueOf(enumC851330XaV.ordinal()));
            }
            C851740XbA c851740XbA = new C851740XbA(enumC851330XaV);
            optionalSignupStepsViewModelLLLZLZ.LLILLJJLI = c851740XbA;
            c851740XbA.LIZIZ(bundle);
            C851740XbA c851740XbA2 = optionalSignupStepsViewModelLLLZLZ.LLILLJJLI;
            if (c851740XbA2 != null) {
                Integer num2 = (Integer) optionalSignupStepsViewModelLLLZLZ.LL.get("optional_flow_status");
                if (num2 != null) {
                    EnumC851810XbH enumC851810XbH = EnumC851810XbH.values()[num2.intValue()];
                    c851740XbA2.LIZIZ = enumC851810XbH;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Restored flow status: ");
                    sbLIZ2.append(enumC851810XbH);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                ArrayList arrayList = (ArrayList) optionalSignupStepsViewModelLLLZLZ.LL.get("optional_steps");
                if (arrayList != null) {
                    c851740XbA2.LIZJ(arrayList);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Restored optional steps count: ");
                    sbLIZ3.append(arrayList.size());
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
            }
            c013c.element = z;
            if (z) {
            }
            finish();
            C1013780cUK c1013780cUK2 = C1013780cUK.LIZ;
            EnumC902550Zav enumC902550Zav2 = EnumC902550Zav.REFACTOR;
            EnumC994670bzV enumC994670bzV2 = EnumC994670bzV.INVALID;
            c1013780cUK2.getClass();
            C1013780cUK.LIZ(enumC902550Zav2, enumC994670bzV2);
            return;
        }
        C851740XbA c851740XbA3 = LLLZLZ().LLILLJJLI;
        if (c851740XbA3 != null) {
            c851740XbA3.LIZLLL = this.LLJILLL;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C851800XbG(c013c, this, bundle, null), 3);
    }

    public final void LLZLI(String str) {
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            iCompliancePolicyServiceLJIIIIZZ.LIZ(new C1913610ztf(EnumC1913590ztd.ACCOUNT_AGE_GATE.getValue(), str, false, true, true, null, false, 100), new InterfaceC1913620ztg() { // from class: X.10cf
                @Override // X.InterfaceC1913620ztg
                public final void onComplete() {
                }
            });
        }
    }

    public final void LLZLLLL(TuxTextView tuxTextView) {
        String storeRegion;
        IPNSConsentConfigService iPNSConsentConfigServiceLJIIIZ = ComplianceServiceProvider.LJIIIZ();
        if (C294580Bge.LIZ() && iPNSConsentConfigServiceLJIIIZ != null) {
            IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
            if (iPNSChangeRegionService != null) {
                storeRegion = iPNSChangeRegionService.getStoreRegion();
            } else {
                storeRegion = null;
            }
            iPNSConsentConfigServiceLJIIIZ.LJ(storeRegion, new AwS377S0200000_11(this, tuxTextView, 13));
            return;
        }
        LLZZ(tuxTextView);
    }

    public final void LLZZ(TuxTextView tuxTextView) {
        int iLJFF;
        TextWithInlineLink textWithInlineLinkLJIIIIZZ;
        String strLJFF;
        if (C294580Bge.LIZ()) {
            IPNSConsentConfigService iPNSConsentConfigServiceLJIIIZ = ComplianceServiceProvider.LJIIIZ();
            CharSequence charSequenceLIZ = null;
            if (iPNSConsentConfigServiceLJIIIZ != null) {
                IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
                if (iPNSChangeRegionService != null && iPNSChangeRegionService.LJIIJJI()) {
                    textWithInlineLinkLJIIIIZZ = iPNSConsentConfigServiceLJIIIZ.LIZIZ();
                    if (textWithInlineLinkLJIIIIZZ != null) {
                        if (iPNSChangeRegionService == null || (strLJFF = iPNSChangeRegionService.LJFF()) == null) {
                            strLJFF = "";
                        }
                        if (strLJFF.length() != 0) {
                            List listSingletonList = Collections.singletonList(new InlineLink(strLJFF, "aweme://change_region"));
                            Iterable iterable = textWithInlineLinkLJIIIIZZ.links;
                            if (iterable == null) {
                                iterable = C13BV.INSTANCE;
                            }
                            textWithInlineLinkLJIIIIZZ = textWithInlineLinkLJIIIIZZ.copy(textWithInlineLinkLJIIIIZZ.text, C13LP.LJLIL(iterable, listSingletonList));
                        }
                    }
                } else {
                    textWithInlineLinkLJIIIIZZ = iPNSConsentConfigServiceLJIIIZ.LJIIIIZZ();
                }
                if (textWithInlineLinkLJIIIIZZ != null) {
                    charSequenceLIZ = iPNSConsentConfigServiceLJIIIZ.LIZ(this, textWithInlineLinkLJIIIIZZ, EnumC1913590ztd.ACCOUNT_AGE_GATE.getValue(), C960203pA.LIZ(R.attr.a1h, this), 82);
                }
            }
            if (charSequenceLIZ != null) {
                if (iPNSConsentConfigServiceLJIIIZ != null) {
                    iPNSConsentConfigServiceLJIIIZ.LIZLLL("consent_label");
                }
                tuxTextView.setText(charSequenceLIZ);
                tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            if (iPNSConsentConfigServiceLJIIIZ != null) {
                iPNSConsentConfigServiceLJIIIZ.LJIIIZ("consent_label");
            }
        }
        ACListenerS162S0100000_28 aCListenerS162S0100000_28 = new ACListenerS162S0100000_28(this, 31);
        ACListenerS162S0100000_28 aCListenerS162S0100000_282 = new ACListenerS162S0100000_28(this, 32);
        ACListenerS162S0100000_28 aCListenerS162S0100000_283 = new ACListenerS162S0100000_28(this, 33);
        if (C19293810e0.LJIIL()) {
            iLJFF = 2131857295;
        } else {
            iLJFF = C19293810e0.LJFF();
        }
        C19293810e0.LIZ(this, tuxTextView, aCListenerS162S0100000_28, aCListenerS162S0100000_282, aCListenerS162S0100000_283, iLJFF, EnumC1913590ztd.ACCOUNT_AGE_GATE.getValue(), false, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0RSz, X.0uQo] */
    public final void LLZZLLIL(ViewGroup viewGroup) {
        int iIntValue;
        LiveData<? extends C1238730iL9> liveDataLJI;
        final TuxTextView tuxTextView = new TuxTextView(this, null, 6, 0);
        tuxTextView.setTuxFont(71);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, this);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setGravity(17);
        C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-1, -2));
        viewGroup.addView(tuxTextView);
        C786410Ut5.LJLZ(0, viewGroup);
        LLZZ(tuxTextView);
        if (!this.LLJJIII) {
            this.LLJJIII = true;
            if (C1207404nw.LIZ()) {
                IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
                if (iPNSChangeRegionService != null && (liveDataLJI = iPNSChangeRegionService.LJI()) != null) {
                    liveDataLJI.observe(this, new AObserverS176S0200000_11(this, tuxTextView, 1));
                    return;
                }
                return;
            }
            ?? r1 = new InterfaceC1703520uQo() { // from class: X.0RSz
                @Override // X.InterfaceC1703520uQo
                public final void LIZ(Country country) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new C696300RSy(this.LIZ, tuxTextView, null), 3);
                }
            };
            this.LLJJIJI = r1;
            IPNSChangeRegionService iPNSChangeRegionService2 = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
            if (iPNSChangeRegionService2 == 0) {
                return;
            }
            iPNSChangeRegionService2.LJIIIIZZ(r1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    @Override // X.AbstractActivityC1237560iJG, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        String string = bundle.getString("birthday");
        if (string != null) {
            String strLIZIZ = ComplianceServiceProvider.LIZLLL().LIZIZ();
            if (strLIZIZ == null || strLIZIZ.length() == 0) {
                ComplianceServiceProvider.LIZLLL().LJIILL(string);
            }
            getIntent().putExtra("birthday", string);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        String stringExtra;
        if (C123100dR.LIZ(ComplianceServiceProvider.LIZLLL().LIZIZ())) {
            stringExtra = ComplianceServiceProvider.LIZLLL().LIZIZ();
        } else {
            try {
                stringExtra = getIntent().getStringExtra("birthday");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        }
        C786410Ut5.LJJJI("birthday", stringExtra, bundle);
        OptionalSignupStepsViewModel optionalSignupStepsViewModelLLLZLZ = LLLZLZ();
        C851740XbA c851740XbA = optionalSignupStepsViewModelLLLZLZ.LLILLJJLI;
        if (c851740XbA != null) {
            optionalSignupStepsViewModelLLLZLZ.LL.set("optional_flow_status", Integer.valueOf(c851740XbA.LIZIZ.ordinal()));
            List<AbstractC851770XbD> list = c851740XbA.LIZJ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((AbstractC851770XbD) it2.next()).LLJJLIIIJLLLLLLLZ().getValue()));
            }
            optionalSignupStepsViewModelLLLZLZ.LL.set("optional_steps", arrayList);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Saved flow status: ");
            sbLIZ.append(c851740XbA.LIZIZ);
            sbLIZ.append(", steps: ");
            sbLIZ.append(arrayList);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZIL(com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment r4, android.os.Bundle r5) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L6
            r4.dk(r2)
        L6:
            java.lang.String r0 = "finish_activity_after_signup_login"
            boolean r0 = r5.getBoolean(r0, r2)
            if (r0 == 0) goto L20
            X.01GW r0 = X.C0XGY.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L20
            r3.finish()
            return
        L20:
            java.lang.String r0 = "phone_signup"
            boolean r0 = r5.getBoolean(r0)
            r1 = 1
            if (r0 != 0) goto L42
            java.lang.String r0 = "email_signup"
            boolean r0 = r5.getBoolean(r0)
            if (r0 != 0) goto L42
            java.lang.String r0 = "email_otp_signup"
            boolean r0 = r5.getBoolean(r0)
            if (r0 != 0) goto L42
            boolean r0 = X.C10EU.LJIIIIZZ()
            if (r0 == 0) goto L7a
            r3.LLILLL = r2
        L41:
            return
        L42:
            boolean r0 = X.C0XQ5.LJFF()
            if (r0 == 0) goto L60
            java.util.Set<java.lang.String> r0 = X.C1260730iud.LIZ
            boolean r0 = X.C851730Xb9.LIZ()
            if (r0 == 0) goto L76
            java.lang.String r0 = "age_gate_login"
            boolean r0 = r5.getBoolean(r0)
            if (r0 != 0) goto L76
            java.lang.String r0 = "req_verification_email_signup"
            boolean r0 = r5.getBoolean(r0)
            if (r0 != 0) goto L76
        L60:
            java.util.Set<java.lang.String> r0 = X.C1260730iud.LIZ
            boolean r0 = X.C851730Xb9.LIZ()
            if (r0 == 0) goto L41
            boolean r0 = X.C19285410ce.LIZ()
            if (r0 != 0) goto L76
            java.lang.String r0 = "is_need_verify_email"
            boolean r0 = r5.getBoolean(r0, r2)
            if (r0 != r1) goto L41
        L76:
            r3.LLZ(r5)
            return
        L7a:
            android.content.Intent r0 = r3.getIntent()
            boolean r0 = X.C784500Uq0.LIZIZ(r0)
            if (r0 == 0) goto L87
            r3.LLILLL = r1
            return
        L87:
            r3.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity.LLLZIL(com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, android.os.Bundle):void");
    }

    public final void LLLZZIL(EnumC852910Xd3 enumC852910Xd3, boolean z) {
        if (C852160Xbq.LIZ[enumC852910Xd3.ordinal()] == 9) {
            Bundle bundle = new Bundle();
            bundle.putInt("next_page", EnumC852910Xd3.FINISH.getValue());
            bundle.putInt("current_page", enumC852910Xd3.getValue());
            bundle.putInt("result_code", -99);
            LLLLZLLIL(bundle);
            return;
        }
        if (z) {
            return;
        }
        finish();
    }
}
