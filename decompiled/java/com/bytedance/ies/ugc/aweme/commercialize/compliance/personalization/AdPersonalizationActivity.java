package com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization;

import X.C01GW;
import X.C0TOM;
import X.C0TOV;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C10EU;
import X.C11G4;
import X.C127K;
import X.C1308910kAL;
import X.C1390410mHn;
import X.C1697810uHb;
import X.C20684815ws;
import X.C2344009Gk;
import X.C238400w2;
import X.C259800zU;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C746060TOi;
import X.C746100TOm;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC191808102c;
import X.InterfaceC745990TOb;
import Y.ACListenerS147S0100000_12;
import Y.ACListenerS22S0200100_12;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.TherePartyDataControlModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model.Gender;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class AdPersonalizationActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9PSIvZy4kLSgpZyw8JSgpOyw6KSklMyp9KyohOSM6HELIOSKSsvLGEjLTc/JiEyJCw2KDs6JytiCCsDLTc/JiEyJCw2KDs6JysNKjs6Piw4MA==";
    public TuxNavBar LL;
    public AdFreeSubscription LLILLJJLI;
    public ConstraintLayout LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;
    public TuxTextView LLILZLL;
    public View LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public C127K LLJI;
    public TuxTextView LLJIJIL;
    public C127K LLJILJIL;
    public C127K LLJILJILJ;
    public C127K LLJILLL;
    public C127K LLJJIII;
    public Gender LLJJIJI;
    public C746060TOi LLJJIJIIJIL;
    public C127K LLJJJ;
    public C127K LLJJJIL;
    public TuxTextView LLJJJJ;
    public C127K LLJJJJJIL;
    public C127K LLJJJJLIIL;
    public TuxTextView LLJJL;
    public C127K LLJJLIIIJLLLLLLLZ;
    public C127K LLJL;
    public C1390410mHn LLJLIL;
    public C127K LLJLILLLLZIIL;
    public User LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public boolean LLLF;
    public boolean LLLFF;
    public final C01GW LLLFFI;
    public boolean LLLFZ;
    public ComplianceVM LLLI;
    public String LLJJ = "-1";
    public String LLJJI = "-1";
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 346));
    public String LLJZIJLIL = "";
    public String LLL = "";

    /* JADX WARN: Removed duplicated region for block: B:198:0x0399  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZLLIL() {
        /*
            Method dump skipped, instruction units count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.AdPersonalizationActivity.LLLLZLLIL():void");
    }

    public static Integer LLLLZIL() {
        C0TOM.LIZ.getClass();
        return Integer.valueOf(C0TOM.LJIIIIZZ() ? C0TOM.LIZ() : C0TOM.LIZJ());
    }

    public final PersonalizationViewModel LLLLZLL() {
        return (PersonalizationViewModel) this.LLLFFI.getValue();
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Activity activity;
        if (this.LLJZ) {
            if (this.LLJLLIL) {
                Intent intent = new Intent();
                intent.putExtra("result", 0);
                C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YsGxLrjrnefn6WusZG+tByEQn5Gk7b5KDAr4PDVf68ippxa9pyuiM7bIK1Drt899Pl0e0Vi5Arv31teIPdsDi2tVOr2ZyKtmrsu7PjQ==", null);
                C0WST c0wst = new C0WST();
                Object[] objArr = {10, intent};
                C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/bytedance/ies/ugc/aweme/commercialize/compliance/personalization/AdPersonalizationActivity", "setResult", this, objArr, "void", c0wzw);
                if (c0wsuLIZIZ.LIZ) {
                    c0wst.LIZ(11071, "com/bytedance/ies/ugc/aweme/commercialize/compliance/personalization/AdPersonalizationActivity", "setResult", null, objArr, this, c0wzw, false);
                } else {
                    Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                    if (objArr2 != null) {
                        Object obj = objArr2[0];
                        activity = obj != null ? (Activity) obj : this;
                        Object obj2 = objArr2[1];
                        iIntValue = obj2 != null ? ((Integer) obj2).intValue() : 10;
                        Object obj3 = c0wsuLIZIZ.LIZJ[2];
                        if (obj3 != null) {
                            intent = (Intent) obj3;
                        }
                    } else {
                        activity = this;
                    }
                    activity.setResult(iIntValue, intent);
                    c0wst.LIZ(11071, "com/bytedance/ies/ugc/aweme/commercialize/compliance/personalization/AdPersonalizationActivity", "setResult", null, objArr, activity, c0wzw, true);
                }
            } else {
                C0TOM.LIZ.getClass();
                LLLLLZL(C0TOM.LIZ() == 1);
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_to", this.LLL);
            c2344009Gk.LJ(LLLLZIL(), "pa_toggle_final_status");
            C20684815ws.LJIILLIIL("exit_personalize_data", c2344009Gk.LIZ);
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_to", "privacy_and_safety_settings");
        c2344009Gk2.LJ(LLLLZIL(), "pa_toggle_final_status");
        C20684815ws.LJIILLIIL("exit_personalize_data", c2344009Gk2.LIZ);
        finish();
    }

    public AdPersonalizationActivity() {
        C0TOM.LIZ.getClass();
        this.LLLFF = C0TOM.LJII();
        this.LLLFFI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 347));
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        Boolean bool;
        Boolean boolIsFollowSystemConfig;
        int i;
        super.onResume();
        if (!TextUtils.isEmpty(this.LLJZIJLIL)) {
            C0TOM c0tom = C0TOM.LIZ;
            c0tom.getClass();
            if (C0TOM.LJIIIIZZ()) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", this.LLJZIJLIL);
                c2344009Gk.LJ(LLLLZIL(), "pa_toggle_initial_status");
                C20684815ws.LJIILLIIL("show_personalize_data", c2344009Gk.LIZ);
            } else {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("enter_from", this.LLL);
                if (this.LLJLLL) {
                    i = -1;
                } else {
                    c0tom.getClass();
                    i = C0TOM.LIZJ() == 0 ? 0 : 1;
                }
                c2344009Gk2.LIZJ(i, "toggle_initial_status");
                C20684815ws.LJIILLIIL("show_personalized_data_revamped", c2344009Gk2.LIZ);
            }
            this.LLJZIJLIL = "";
        }
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ != null && (boolIsFollowSystemConfig = adPersonalitySettingsLIZIZ.isFollowSystemConfig()) != null && boolIsFollowSystemConfig.booleanValue()) {
            C0TOV c0tov = C0TOV.LIZ;
            InterfaceC745990TOb interfaceC745990TOb = new InterfaceC745990TOb() { // from class: X.0TOQ
                @Override // X.InterfaceC745990TOb
                public final void LIZ(boolean z) {
                    C127K c127k = null;
                    if (z) {
                        C0TOM.LIZ.getClass();
                        if (C0TOM.LJIIIIZZ() && C0TOM.LIZ() == 1) {
                            this.LIZ.LLLLLZL(false);
                        }
                        if (!C0TOM.LJIIIIZZ() && C0TOM.LIZJ() == 1) {
                            this.LIZ.LLLLLZL(false);
                        }
                        C127K c127k2 = this.LIZ.LLJILJIL;
                        if (c127k2 != null) {
                            c127k = c127k2;
                        }
                        c127k.setCellEnabled(false);
                        this.LIZ.LLJLLL = true;
                        return;
                    }
                    C127K c127k3 = this.LIZ.LLJILJIL;
                    if (c127k3 != null) {
                        c127k = c127k3;
                    }
                    c127k.setCellEnabled(true);
                    this.LIZ.LLJLLL = false;
                }
            };
            c0tov.getClass();
            C0TOV.LIZ(this, interfaceC745990TOb);
            return;
        }
        AdPersonalitySettings adPersonalitySettingsLIZIZ2 = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ2 == null || (bool = adPersonalitySettingsLIZIZ2.enableToggleDecoupling) == null || !bool.booleanValue()) {
            return;
        }
        C0TOV.LIZ.getClass();
        C0TOV.LIZ(this, null);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("entry_stage", this.LLJJ);
        c2344009Gk.LJIIIIZZ("exit_stage", this.LLJJI);
        c2344009Gk.LJIIIIZZ("if_stage_has_changed", Intrinsics.LJFF(this.LLJJ, this.LLJJI) ? CardStruct.IStatusCode.DEFAULT : "1");
        C20684815ws.LJIILLIIL("exit_personalize_data_v2", c2344009Gk.LIZ);
        this.LLJJ = this.LLJJI;
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

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, java.lang.Object] */
    public final void LLLLLZL(boolean z) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        final PersonalizationViewModel personalizationViewModelLLLLZLL = LLLLZLL();
        final Integer numValueOf = Integer.valueOf(z ? 1 : 0);
        personalizationViewModelLLLLZLL.getClass();
        if (!C10EU.LJIILIIL()) {
            final C259800zU c259800zU = new C259800zU();
            final C259800zU c259800zU2 = new C259800zU();
            JSONArray jSONArray = new JSONArray();
            if (numValueOf != null) {
                C0TOM.LIZ.getClass();
                String str5 = "on";
                if (C0TOM.LJIIIIZZ()) {
                    jSONArray.put(new JSONObject().put("field", "pers_ad_main_mode").put("value", numValueOf.toString()));
                    c259800zU.element = personalizationViewModelLLLLZLL.wQ2().getValue();
                    personalizationViewModelLLLLZLL.wQ2().setValue(numValueOf);
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    if (numValueOf.intValue() != 1) {
                        str2 = "on";
                    } else {
                        str2 = "off";
                    }
                    c2344009Gk.LJIIIIZZ("initial_status", str2);
                    if (numValueOf.intValue() == 1) {
                        str3 = "on";
                    } else {
                        str3 = "off";
                    }
                    c2344009Gk.LJIIIIZZ("final_status", str3);
                    C20684815ws.LJIILLIIL("change_personalization_status", c2344009Gk.LIZ);
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    if (numValueOf.intValue() != 1) {
                        str4 = "on";
                    } else {
                        str4 = "off";
                    }
                    c2344009Gk2.LJIIIIZZ("initial_status", str4);
                    if (numValueOf.intValue() != 1) {
                        str5 = "off";
                    }
                    c2344009Gk2.LJIIIIZZ("final_status", str5);
                    C20684815ws.LJIILLIIL("click_pa_settings_toggle", c2344009Gk2.LIZ);
                    if (numValueOf.intValue() == 1) {
                        C2344009Gk c2344009Gk3 = new C2344009Gk();
                        c2344009Gk3.LJIIIIZZ("enter_from", "personalization_data");
                        C20684815ws.LJIILLIIL("personalized_ads_on", c2344009Gk3.LIZ);
                    } else {
                        C2344009Gk c2344009Gk4 = new C2344009Gk();
                        c2344009Gk4.LJIIIIZZ("enter_from", "personalization_data");
                        C20684815ws.LJIILLIIL("personalized_ads_off", c2344009Gk4.LIZ);
                    }
                } else {
                    jSONArray.put(new JSONObject().put("field", "pers_ad_unified_mode").put("value", numValueOf.toString()));
                    c259800zU2.element = ((LiveData) personalizationViewModelLLLLZLL.LLILLL.getValue()).getValue();
                    ((LiveData) personalizationViewModelLLLLZLL.LLILLL.getValue()).setValue(numValueOf);
                    C2344009Gk c2344009Gk5 = new C2344009Gk();
                    int i2 = 0;
                    if (numValueOf.intValue() != 1) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    c2344009Gk5.LIZJ(i, "initial_status");
                    if (numValueOf.intValue() == 1) {
                        i2 = 1;
                    }
                    c2344009Gk5.LIZJ(i2, "final_status");
                    C20684815ws.LJIILLIIL("change_personalized_status_revamped", c2344009Gk5.LIZ);
                    C2344009Gk c2344009Gk6 = new C2344009Gk();
                    if (numValueOf.intValue() != 1) {
                        str = "on";
                    } else {
                        str = "off";
                    }
                    c2344009Gk6.LJIIIIZZ("initial_status", str);
                    if (numValueOf.intValue() != 1) {
                        str5 = "off";
                    }
                    c2344009Gk6.LJIIIIZZ("final_status", str5);
                    C20684815ws.LJIILLIIL("click_pa_settings_toggle", c2344009Gk6.LIZ);
                }
            }
            personalizationViewModelLLLLZLL.vQ2().LJIJ(jSONArray.toString(), new InterfaceC191808102c() { // from class: X.0TOK
                @Override // X.InterfaceC191808102c
                public final void onSuccess() {
                    AdPersonalitySettings adPersonalitySettingsCopy;
                    ComplianceSetting complianceSetting;
                    AdPersonalitySettings adPersonalitySettingsCopy2;
                    ComplianceSetting complianceSetting2;
                    C0TOM.LIZ.getClass();
                    AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
                    if (C0TOM.LJIIIIZZ()) {
                        AdPersonalitySettings adPersonalitySettingsLIZIZ2 = C0TOM.LIZIZ();
                        if (adPersonalitySettingsLIZIZ2 != null) {
                            Integer num = numValueOf;
                            if (num == null) {
                                num = adPersonalitySettingsLIZIZ != null ? adPersonalitySettingsLIZIZ.mode : null;
                            }
                            adPersonalitySettingsCopy2 = adPersonalitySettingsLIZIZ2.copy(num, adPersonalitySettingsLIZIZ2.needPopUp, adPersonalitySettingsLIZIZ2.isFollowSystemConfig, adPersonalitySettingsLIZIZ2.description, adPersonalitySettingsLIZIZ2.title, adPersonalitySettingsLIZIZ2.copyWriting, adPersonalitySettingsLIZIZ2.isShowSettings, adPersonalitySettingsLIZIZ2.showInterestLabel, adPersonalitySettingsLIZIZ2.showInterestItemType, adPersonalitySettingsLIZIZ2.lat, adPersonalitySettingsLIZIZ2.promptStyle, adPersonalitySettingsLIZIZ2.isNpUser, adPersonalitySettingsLIZIZ2.unifiedMode, adPersonalitySettingsLIZIZ2.isTeenagerMode, adPersonalitySettingsLIZIZ2.isNewUser, adPersonalitySettingsLIZIZ2.PARevisingSwitch, adPersonalitySettingsLIZIZ2.unifiedModeTextData, adPersonalitySettingsLIZIZ2.isShowResetEntry, adPersonalitySettingsLIZIZ2.reset, adPersonalitySettingsLIZIZ2.isUseBalancePrompt, adPersonalitySettingsLIZIZ2.isShowAdvertiserSettings, adPersonalitySettingsLIZIZ2.popUpStyle, adPersonalitySettingsLIZIZ2.contentType, adPersonalitySettingsLIZIZ2.abCopyWriting, adPersonalitySettingsLIZIZ2.subscription, adPersonalitySettingsLIZIZ2.thirdPartyAdConsentPromptConfig, adPersonalitySettingsLIZIZ2.enableToggleDecoupling, adPersonalitySettingsLIZIZ2.hitDisconnectAdvExperiment);
                        } else {
                            adPersonalitySettingsCopy2 = null;
                        }
                        IComplianceSettingsService iComplianceSettingsServiceVQ2 = personalizationViewModelLLLLZLL.vQ2();
                        ComplianceSetting complianceSettingLJIILLIIL = personalizationViewModelLLLLZLL.vQ2().LJIILLIIL();
                        if (complianceSettingLJIILLIIL == null || (complianceSetting2 = complianceSettingLJIILLIIL.copy(complianceSettingLJIILLIIL.blackSetting, complianceSettingLJIILLIIL.enableImpressum, complianceSettingLJIILLIIL.impressumUrl, complianceSettingLJIILLIIL.privacyPolicyUrl, adPersonalitySettingsCopy2, complianceSettingLJIILLIIL.notifyPrivateAccount, complianceSettingLJIILLIIL.forcePrivateAccount, complianceSettingLJIILLIIL.addTermsConsentForRegister, complianceSettingLJIILLIIL.enableTermsConsentPopup, complianceSettingLJIILLIIL.termsConsentInfo, complianceSettingLJIILLIIL.termConsentInfoNewUsers, complianceSettingLJIILLIIL.complianceEncrypt, complianceSettingLJIILLIIL.ageGateInfo, complianceSettingLJIILLIIL.logPb, complianceSettingLJIILLIIL.legalEntityChangeInfo, complianceSettingLJIILLIIL.afSharingBlock, complianceSettingLJIILLIIL.interfaceControlSettingsString, complianceSettingLJIILLIIL.deviceLimitRegisterExpiredTime, complianceSettingLJIILLIIL.privacyHighlightsForTeensLink, complianceSettingLJIILLIIL.privacyHighlightsType, complianceSettingLJIILLIIL.privateAccountPrompt, complianceSettingLJIILLIIL.privateAccountPromptType, complianceSettingLJIILLIIL.isMixedAge, complianceSettingLJIILLIIL.preferenceSettings, complianceSettingLJIILLIIL.ageVerificationAction, complianceSettingLJIILLIIL.notifyParentsWithEmail, complianceSettingLJIILLIIL.ageGraduationScenes, complianceSettingLJIILLIIL.stopAutoPlayTimesThreshold)) == null) {
                            complianceSetting2 = new ComplianceSetting(null, 0, null, null, adPersonalitySettingsCopy2, 0, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, Boolean.FALSE, null, 0L, "", 0, 0, 0, 0, null, false, false, new LinkedHashMap(), 0);
                        }
                        iComplianceSettingsServiceVQ2.LJJIIJ(complianceSetting2);
                    } else {
                        AdPersonalitySettings adPersonalitySettingsLIZIZ3 = C0TOM.LIZIZ();
                        if (adPersonalitySettingsLIZIZ3 != null) {
                            Integer num2 = numValueOf;
                            if (num2 == null) {
                                num2 = adPersonalitySettingsLIZIZ != null ? adPersonalitySettingsLIZIZ.unifiedMode : null;
                            }
                            adPersonalitySettingsCopy = adPersonalitySettingsLIZIZ3.copy(adPersonalitySettingsLIZIZ3.mode, adPersonalitySettingsLIZIZ3.needPopUp, adPersonalitySettingsLIZIZ3.isFollowSystemConfig, adPersonalitySettingsLIZIZ3.description, adPersonalitySettingsLIZIZ3.title, adPersonalitySettingsLIZIZ3.copyWriting, adPersonalitySettingsLIZIZ3.isShowSettings, adPersonalitySettingsLIZIZ3.showInterestLabel, adPersonalitySettingsLIZIZ3.showInterestItemType, adPersonalitySettingsLIZIZ3.lat, adPersonalitySettingsLIZIZ3.promptStyle, adPersonalitySettingsLIZIZ3.isNpUser, num2, adPersonalitySettingsLIZIZ3.isTeenagerMode, adPersonalitySettingsLIZIZ3.isNewUser, adPersonalitySettingsLIZIZ3.PARevisingSwitch, adPersonalitySettingsLIZIZ3.unifiedModeTextData, adPersonalitySettingsLIZIZ3.isShowResetEntry, adPersonalitySettingsLIZIZ3.reset, adPersonalitySettingsLIZIZ3.isUseBalancePrompt, adPersonalitySettingsLIZIZ3.isShowAdvertiserSettings, adPersonalitySettingsLIZIZ3.popUpStyle, adPersonalitySettingsLIZIZ3.contentType, adPersonalitySettingsLIZIZ3.abCopyWriting, adPersonalitySettingsLIZIZ3.subscription, adPersonalitySettingsLIZIZ3.thirdPartyAdConsentPromptConfig, adPersonalitySettingsLIZIZ3.enableToggleDecoupling, adPersonalitySettingsLIZIZ3.hitDisconnectAdvExperiment);
                        } else {
                            adPersonalitySettingsCopy = null;
                        }
                        IComplianceSettingsService iComplianceSettingsServiceVQ22 = personalizationViewModelLLLLZLL.vQ2();
                        ComplianceSetting complianceSettingLJIILLIIL2 = personalizationViewModelLLLLZLL.vQ2().LJIILLIIL();
                        if (complianceSettingLJIILLIIL2 == null || (complianceSetting = complianceSettingLJIILLIIL2.copy(complianceSettingLJIILLIIL2.blackSetting, complianceSettingLJIILLIIL2.enableImpressum, complianceSettingLJIILLIIL2.impressumUrl, complianceSettingLJIILLIIL2.privacyPolicyUrl, adPersonalitySettingsCopy, complianceSettingLJIILLIIL2.notifyPrivateAccount, complianceSettingLJIILLIIL2.forcePrivateAccount, complianceSettingLJIILLIIL2.addTermsConsentForRegister, complianceSettingLJIILLIIL2.enableTermsConsentPopup, complianceSettingLJIILLIIL2.termsConsentInfo, complianceSettingLJIILLIIL2.termConsentInfoNewUsers, complianceSettingLJIILLIIL2.complianceEncrypt, complianceSettingLJIILLIIL2.ageGateInfo, complianceSettingLJIILLIIL2.logPb, complianceSettingLJIILLIIL2.legalEntityChangeInfo, complianceSettingLJIILLIIL2.afSharingBlock, complianceSettingLJIILLIIL2.interfaceControlSettingsString, complianceSettingLJIILLIIL2.deviceLimitRegisterExpiredTime, complianceSettingLJIILLIIL2.privacyHighlightsForTeensLink, complianceSettingLJIILLIIL2.privacyHighlightsType, complianceSettingLJIILLIIL2.privateAccountPrompt, complianceSettingLJIILLIIL2.privateAccountPromptType, complianceSettingLJIILLIIL2.isMixedAge, complianceSettingLJIILLIIL2.preferenceSettings, complianceSettingLJIILLIIL2.ageVerificationAction, complianceSettingLJIILLIIL2.notifyParentsWithEmail, complianceSettingLJIILLIIL2.ageGraduationScenes, complianceSettingLJIILLIIL2.stopAutoPlayTimesThreshold)) == null) {
                            complianceSetting = new ComplianceSetting(null, 0, null, null, adPersonalitySettingsCopy, 0, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, Boolean.FALSE, null, 0L, "", 0, 0, 0, 0, null, false, false, new LinkedHashMap(), 0);
                        }
                        iComplianceSettingsServiceVQ22.LJJIIJ(complianceSetting);
                    }
                    Activity activityLJFF = C2214201BlK.LJFF();
                    if (activityLJFF != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
                        c1389890mGx.LJIIIZ(2131845034);
                        c1389890mGx.LJIIJJI();
                    }
                }

                @Override // X.InterfaceC191808102c
                public final void LIZJ() {
                    Activity activityLJFF = C2214201BlK.LJFF();
                    if (activityLJFF != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
                        c1389890mGx.LJIIIZ(2131834365);
                        c1389890mGx.LJIIJJI();
                    }
                    if (c259800zU.element != null) {
                        personalizationViewModelLLLLZLL.wQ2().setValue(c259800zU.element);
                    }
                    if (c259800zU2.element != null) {
                        ((LiveData) personalizationViewModelLLLLZLL.LLILLL.getValue()).setValue(c259800zU2.element);
                    }
                }
            });
        }
    }

    public final void LLLLZI(TherePartyDataControlModel therePartyDataControlModel) {
        if (Intrinsics.LJFF(therePartyDataControlModel.getShouldShow3PDataControl(), Boolean.FALSE)) {
            return;
        }
        C127K c127k = this.LLJJLIIIJLLLLLLLZ;
        String string = null;
        if (c127k == null) {
            c127k = null;
        }
        C786410Ut5.LLZLL(c127k, 0);
        if (Intrinsics.LJFF(therePartyDataControlModel.isSubmitted(), Boolean.TRUE) && therePartyDataControlModel.getLastSubmittedTime() != null) {
            C127K c127k2 = this.LLJJLIIIJLLLLLLLZ;
            if (c127k2 == null) {
                c127k2 = null;
            }
            c127k2.setCellEnabled(false);
            Integer lastSubmittedTime = therePartyDataControlModel.getLastSubmittedTime();
            if (lastSubmittedTime != null) {
                int iIntValue = lastSubmittedTime.intValue();
                C127K c127k3 = this.LLJL;
                if (c127k3 == null) {
                    c127k3 = null;
                }
                C746100TOm c746100TOm = C746100TOm.LIZ;
                String string2 = getString(2131847759);
                c746100TOm.getClass();
                c127k3.setTitle(C746100TOm.LJ(this, iIntValue, string2, "{date}"));
            }
            C127K c127k4 = this.LLJL;
            if (c127k4 == null) {
                c127k4 = null;
            }
            C786410Ut5.LLZLL(c127k4, 0);
        }
        C127K c127k5 = this.LLJJLIIIJLLLLLLLZ;
        if (c127k5 == null) {
            c127k5 = null;
        }
        ((C11G4) c127k5.getAccessory()).LJIILL(new ACListenerS22S0200100_12(new C238400w2(), 400L, new ACListenerS147S0100000_12(this, 239), 0));
        if (this.LLLFF) {
            C127K c127k6 = this.LLJJLIIIJLLLLLLLZ;
            if (c127k6 == null) {
                c127k6 = null;
            }
            Resources resources = getResources();
            if (resources != null) {
                string = resources.getString(2131847758);
            }
            c127k6.setSubtitle(string);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0601 A[PHI: r2
      0x0601: PHI (r2v33 com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo) = 
      (r2v32 com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo)
      (r2v45 com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo)
      (r2v45 com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo)
     binds: [B:322:0x0600, B:211:0x04a7, B:213:0x04ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0609 A[PHI: r8
      0x0609: PHI (r8v11 com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionInfo) = 
      (r8v10 com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionInfo)
      (r8v13 com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionInfo)
     binds: [B:325:0x0605, B:205:0x0494] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x07c3  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instruction units count: 2132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.AdPersonalizationActivity.onCreate(android.os.Bundle):void");
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
}
