package com.ss.android.ugc.aweme.compliance.business.gatekeeper;

import X.C01GW;
import X.C0CCZ;
import X.C0N0M;
import X.C0NR2;
import X.C0VZ0;
import X.C1697810uHb;
import X.C1916550zyP;
import X.C1916630zyX;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS1S1000000_3;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService;
import com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class ComplianceBackgroundLegoTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ComplianceBackgroundLegoTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1916550zyP.LIZ.getClass();
        List<? extends C0NR2> listLJIILJJIL = C1697810uHb.LJIILJJIL(new C1916630zyX(), new C0NR2() { // from class: X.0zyU
            public final Set<String> LIZ;

            @Override // X.C0NR2
            public final String LIZ(Bundle bundle) {
                return "AgeGateBanGatekeeperTask";
            }

            {
                Set<String> setLJ = C093Y.LJ("UserUpdate", "WindowFocusChanged");
                this.LIZ = setLJ;
                if (C288670BTd.LIZ()) {
                    setLJ.remove("WindowFocusChanged");
                }
            }

            @Override // X.C0NR2
            public final Set<String> LIZJ() {
                return this.LIZ;
            }

            @Override // X.C0NR2
            public final C0NR1 LIZIZ(Bundle bundle) {
                return new C0NR1() { // from class: X.0zyV
                    @Override // X.C0NR1
                    public final void LIZ() {
                    }

                    @Override // X.C0NR1
                    public final int LIZJ() {
                        return 1;
                    }

                    @Override // X.C0NR1
                    public final Map<String, String> LIZLLL() {
                        return null;
                    }

                    @Override // X.C0NR1
                    public final String getTaskKey() {
                        return "AgeGateBanGatekeeperTask";
                    }

                    @Override // X.C0NR1
                    public final C0NRC category() {
                        return C0NRC.BLOCKING;
                    }

                    @Override // X.C0NR1
                    public final void LIZIZ(Bundle bundle2, C0NR0 c0nr0) {
                        C19EG c19eg;
                        Activity activityLJFF = C2214201BlK.LJFF();
                        if (activityLJFF instanceof C19EG) {
                            c19eg = (C19EG) activityLJFF;
                        } else {
                            c19eg = null;
                        }
                        if (C294570Bgd.LIZ()) {
                            PopupManager.LJIIZILJ(new C1916950zz3(c19eg, c0nr0), new C1668306g5("pns_compliance_age_gate_ban_trigger"));
                        } else {
                            PopupManager.LJIJI(new C1916950zz3(c19eg, c0nr0), true);
                        }
                    }

                    @Override // X.C0NR1
                    public final boolean LJ(Bundle bundle2, String str) {
                        IComplianceDependService iComplianceDependServiceLIZ;
                        if (C288670BTd.LIZ()) {
                            return true;
                        }
                        if ((!Intrinsics.LJFF(str, "WindowFocusChanged") || bundle2.getBoolean("has_focus")) && C10EU.LJIIIZ() && ((iComplianceDependServiceLIZ = C1110504Vz.LIZ()) == null || !iComplianceDependServiceLIZ.LIZ())) {
                            return true;
                        }
                        return false;
                    }
                };
            }
        }, new C0NR2() { // from class: X.0XQi
            public final Set<String> LIZ = Collections.singleton("UserUpdate");

            @Override // X.C0NR2
            public final String LIZ(Bundle bundle) {
                return "AgeGateGatekeeperTask";
            }

            @Override // X.C0NR2
            public final Set<String> LIZJ() {
                return this.LIZ;
            }

            @Override // X.C0NR2
            public final C0NR1 LIZIZ(Bundle bundle) {
                return new C0NR1() { // from class: X.0XQh
                    @Override // X.C0NR1
                    public final void LIZ() {
                    }

                    @Override // X.C0NR1
                    public final int LIZJ() {
                        return 1;
                    }

                    @Override // X.C0NR1
                    public final Map<String, String> LIZLLL() {
                        return null;
                    }

                    @Override // X.C0NR1
                    public final String getTaskKey() {
                        return "AgeGateGatekeeperTask";
                    }

                    @Override // X.C0NR1
                    public final C0NRC category() {
                        return C0NRC.BLOCKING;
                    }

                    @Override // X.C0NR1
                    public final void LIZIZ(Bundle bundle2, C0NR0 c0nr0) {
                        User user;
                        Serializable serializable = bundle2.getSerializable("user");
                        if ((serializable instanceof User) && (user = (User) serializable) != null) {
                            Activity activityLJFF = C2214201BlK.LJFF();
                            ComplianceServiceProvider.LIZLLL().LJIILIIL(activityLJFF, new C0X53(c0nr0, activityLJFF));
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LIZJ(user.getAgeGateAction(), "age_gate_action");
                            C20684815ws.LJIILLIIL("age_gate_need_pop", c2344009Gk.LIZ);
                        }
                    }

                    @Override // X.C0NR1
                    public final boolean LJ(Bundle bundle2, String str) {
                        User user;
                        Serializable serializable = bundle2.getSerializable("user");
                        if (serializable instanceof User) {
                            user = (User) serializable;
                        } else {
                            user = null;
                        }
                        if (user == null || user.getAgeGateAction() == EnumC191814102i.PASS.getValue()) {
                            return false;
                        }
                        return true;
                    }
                };
            }
        });
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("user_notice_gatekeeper_task", false)) {
            listLJIILJJIL.add(new C0NR2() { // from class: X.0zw6
                @Override // X.C0NR2
                public final String LIZ(Bundle bundle) {
                    return "UserNoticeGatekeeperTask";
                }

                @Override // X.C0NR2
                public final Set<String> LIZJ() {
                    return Collections.singleton("FeedReadyForNoticeSignal");
                }

                @Override // X.C0NR2
                public final C0NR1 LIZIZ(Bundle bundle) {
                    return new C0NR1() { // from class: X.0zw5
                        public final DecisionMakerNetworkApi.EligibilityModel LIZ;
                        public DecisionMakerNetworkApi.PPFActionModel LIZIZ;
                        public final EnumC1915260zwK LIZJ;

                        @Override // X.C0NR1
                        public final void LIZ() {
                        }

                        @Override // X.C0NR1
                        public final int LIZJ() {
                            return 1;
                        }

                        @Override // X.C0NR1
                        public final Map<String, String> LIZLLL() {
                            return null;
                        }

                        @Override // X.C0NR1
                        public final String getTaskKey() {
                            return "UserNoticeGatekeeperTask";
                        }

                        {
                            IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
                            this.LIZ = iGatekeeperService != null ? iGatekeeperService.LIZ("user_notice") : null;
                            this.LIZJ = EnumC1915260zwK.PNS_NULL;
                        }

                        @Override // X.C0NR1
                        public final C0NRC category() {
                            return C0NRC.BLOCKING;
                        }

                        @Override // X.C0NR1
                        public final void LIZIZ(Bundle bundle2, C0NR0 c0nr0) {
                            Activity activityLIZIZ;
                            DecisionMakerNetworkApi.PPFActionModel pPFActionModel = this.LIZIZ;
                            if (pPFActionModel != null) {
                                CollectConsentParam collectConsentParamLJ = null;
                                IPNSConsentCollectorService iPNSConsentCollectorService = (IPNSConsentCollectorService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentCollectorService.class, false, false, false, 14, null);
                                String strOptString = "";
                                if (iPNSConsentCollectorService != null) {
                                    String str = pPFActionModel.actionParams;
                                    if (str == null) {
                                        str = "";
                                    }
                                    collectConsentParamLJ = iPNSConsentCollectorService.LJ(str);
                                }
                                try {
                                    String str2 = pPFActionModel.actionParams;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    strOptString = new JSONObject(str2).optString("popup_id", "");
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                                if (abstractC1387200mCcLIZIZ != null && abstractC1387200mCcLIZIZ.LIZIZ() != null && collectConsentParamLJ != null) {
                                    TTKUserCommunicationService tTKUserCommunicationService = (TTKUserCommunicationService) PluggableExtentionKt.pluggableSpi$default(TTKUserCommunicationService.class, false, false, false, 14, null);
                                    if (tTKUserCommunicationService != null) {
                                        tTKUserCommunicationService.LJIIIIZZ();
                                    }
                                    AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
                                    if (abstractC1387200mCcLIZIZ2 != null && (activityLIZIZ = abstractC1387200mCcLIZIZ2.LIZIZ()) != null) {
                                        IPolicyNoticeService iPolicyNoticeService = (IPolicyNoticeService) PluggableExtentionKt.pluggableSpi$default(IPolicyNoticeService.class, false, false, false, 14, null);
                                        if (iPolicyNoticeService != null) {
                                            iPolicyNoticeService.LIZ();
                                        }
                                        IPNSConsentCollectorService iPNSConsentCollectorService2 = (IPNSConsentCollectorService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentCollectorService.class, false, false, false, 14, null);
                                        if (iPNSConsentCollectorService2 != null) {
                                            iPNSConsentCollectorService2.LIZJ(activityLIZIZ, collectConsentParamLJ, strOptString, null);
                                        }
                                    }
                                    DecisionMakerNetworkApi.EligibilityModel eligibilityModel = this.LIZ;
                                    if (eligibilityModel != null) {
                                        if (C0C64.LJIILLIIL().LJIIIZ(31744, "au_u16_disappear_after_confirm", true, false)) {
                                            eligibilityModel.setEligible(false);
                                        }
                                        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
                                        if (iGatekeeperService != null) {
                                            iGatekeeperService.LJIIJJI(eligibilityModel);
                                        }
                                    }
                                }
                            }
                        }

                        @Override // X.C0NR1
                        public final boolean LJ(Bundle bundle2, String str) {
                            DecisionMakerNetworkApi.EligibilityModel eligibilityModel;
                            List<DecisionMakerNetworkApi.PPFActionModel> list;
                            boolean zIsEligible;
                            DecisionMakerNetworkApi.PPFActionModel pPFActionModel;
                            List<DecisionMakerNetworkApi.PPFActionModel> list2;
                            DecisionMakerNetworkApi.PPFActionModel next;
                            String string = bundle2.getString("pnsPageId");
                            String str2 = "";
                            if (string == null) {
                                string = "";
                            }
                            String string2 = bundle2.getString("pnsWebPageUrl");
                            if (string2 != null) {
                                str2 = string2;
                            }
                            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "enable_au_u16_experience", true, false) || (eligibilityModel = this.LIZ) == null || ((list = eligibilityModel.actionList) != null && list.isEmpty())) {
                                return false;
                            }
                            DecisionMakerNetworkApi.EligibilityModel eligibilityModel2 = this.LIZ;
                            if (eligibilityModel2 != null) {
                                zIsEligible = eligibilityModel2.isEligible();
                            } else {
                                zIsEligible = false;
                            }
                            if (zIsEligible) {
                                DecisionMakerNetworkApi.EligibilityModel eligibilityModel3 = this.LIZ;
                                if (eligibilityModel3 != null && (list2 = eligibilityModel3.actionList) != null) {
                                    Iterator<DecisionMakerNetworkApi.PPFActionModel> it2 = list2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            if (Intrinsics.LJFF(next.actionId, "ConsentCollectProcessor")) {
                                                break;
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    pPFActionModel = next;
                                } else {
                                    pPFActionModel = null;
                                }
                                this.LIZIZ = pPFActionModel;
                            }
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJ(Boolean.valueOf(zIsEligible), "should_show_user_notice");
                            String str3 = C1019070ccr.LIZ;
                            C1019070ccr.LIZ = null;
                            if (str3 == null) {
                                str3 = "others";
                            }
                            c2344009Gk.LJIIIIZZ("reason_for_notice", str3);
                            c2344009Gk.LJIIIIZZ("handle_result", this.LIZJ.getValue());
                            c2344009Gk.LJIIIIZZ("handle_result_reason", null);
                            c2344009Gk.LJIIIIZZ("current_page_name", string);
                            c2344009Gk.LJIIIIZZ("current_web_page_url", str2);
                            C20684815ws.LJIILLIIL("user_notice_check", c2344009Gk.LIZ);
                            if (this.LIZIZ != null) {
                                return true;
                            }
                            return false;
                        }
                    };
                }
            });
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_tx_u18_consent_guarding_flag", false)) {
            listLJIILJJIL.add(new C0NR2() { // from class: X.0zyO
                @Override // X.C0NR2
                public final String LIZ(Bundle bundle) {
                    return "UserConsentReportGatekeeperTask";
                }

                @Override // X.C0NR2
                public final Set<String> LIZJ() {
                    return Collections.singleton("AppStart");
                }

                @Override // X.C0NR2
                public final C0NR1 LIZIZ(Bundle bundle) {
                    return new C0NR1() { // from class: X.0zyQ
                        public final DecisionMakerNetworkApi.EligibilityModel LIZ;
                        public final C01GW LIZIZ;

                        @Override // X.C0NR1
                        public final void LIZ() {
                        }

                        @Override // X.C0NR1
                        public final int LIZJ() {
                            return 1;
                        }

                        @Override // X.C0NR1
                        public final Map<String, String> LIZLLL() {
                            return null;
                        }

                        @Override // X.C0NR1
                        public final String getTaskKey() {
                            return "UserConsentReportGatekeeperTask";
                        }

                        {
                            IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
                            this.LIZ = iGatekeeperService != null ? iGatekeeperService.LIZ("tx_third_party_consent_go_rule") : null;
                            this.LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(592));
                        }

                        @Override // X.C0NR1
                        public final C0NRC category() {
                            return C0NRC.BLOCKING;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v3, types: [X.07zN] */
                        @Override // X.C0NR1
                        public final void LIZIZ(Bundle bundle2, C0NR0 c0nr0) {
                            Activity activityLIZIZ;
                            IAgeGateService iAgeGateService;
                            IPNSAgeFromStoreService iPNSAgeFromStoreServiceLJIJJ;
                            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (iAgeGateService = (IAgeGateService) PluggableExtentionKt.pluggableSpi$default(IAgeGateService.class, false, false, false, 14, null)) != null && (iPNSAgeFromStoreServiceLJIJJ = iAgeGateService.LJIJJ()) != 0) {
                                iPNSAgeFromStoreServiceLJIJJ.LJI(activityLIZIZ, new C10W6() { // from class: X.07zN
                                    @Override // X.C10W6
                                    public final void onFailure() {
                                    }

                                    @Override // X.C10W6
                                    public final void onSuccess(String str) {
                                        EnumC2042807zO next;
                                        if (str != null && !a0.LJJJIL(str)) {
                                            try {
                                                int i = CastIntegerProtector.parseInt(str);
                                                EnumC2042807zO.Companion.getClass();
                                                Iterator<EnumC2042807zO> it2 = EnumC2042807zO.getEntries().iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next = it2.next();
                                                        if (next.getValue() == i) {
                                                            break;
                                                        }
                                                    } else {
                                                        next = null;
                                                        break;
                                                    }
                                                }
                                                EnumC2042807zO enumC2042807zO = next;
                                                if (enumC2042807zO == null) {
                                                    enumC2042807zO = EnumC2042807zO.UNKNOWN;
                                                }
                                                str = enumC2042807zO.name();
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                            }
                                            if (C0RZ5.LJI()) {
                                                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS1S1000000_3(str, 5));
                                            }
                                        }
                                    }
                                });
                            }
                        }

                        @Override // X.C0NR1
                        public final boolean LJ(Bundle bundle2, String str) {
                            String str2;
                            if (this.LIZ != null) {
                                SettingsManager.LIZLLL().getClass();
                                if (SettingsManager.LIZ("enable_tx_u18_consent_settings", false)) {
                                    DecisionMakerNetworkApi.EligibilityModel eligibilityModel = this.LIZ;
                                    if (eligibilityModel != null) {
                                        str2 = eligibilityModel.decisionCode;
                                    } else {
                                        str2 = null;
                                    }
                                    return Intrinsics.LJFF("tx_u18_third_party_consent_required", str2);
                                }
                            }
                            return false;
                        }
                    };
                }
            });
        }
        listLJIILJJIL.add(new C0NR2() { // from class: X.0XJq
            public final Set<String> LIZ = Collections.singleton("AppAccessSignal");

            @Override // X.C0NR2
            public final String LIZ(Bundle bundle) {
                return "AppAccessGatekeeperTask";
            }

            @Override // X.C0NR2
            public final Set<String> LIZJ() {
                return this.LIZ;
            }

            @Override // X.C0NR2
            public final C0NR1 LIZIZ(Bundle bundle) {
                return new C0NR1() { // from class: X.0XJp
                    public static List<? extends Object> LIZIZ;
                    public static boolean LIZJ;

                    @Override // X.C0NR1
                    public final void LIZ() {
                        LIZJ = false;
                    }

                    @Override // X.C0NR1
                    public final int LIZJ() {
                        return 1;
                    }

                    @Override // X.C0NR1
                    public final Map<String, String> LIZLLL() {
                        return null;
                    }

                    @Override // X.C0NR1
                    public final String getTaskKey() {
                        return "AppAccessGatekeeperTask";
                    }

                    @Override // X.C0NR1
                    public final C0NRC category() {
                        return C0NRC.BLOCKING;
                    }

                    @Override // X.C0NR1
                    public final void LIZIZ(Bundle bundle2, C0NR0 c0nr0) {
                        List<? extends Object> list = LIZIZ;
                        if (list == null) {
                            return;
                        }
                        LIZJ = true;
                        TTKUserCommunicationService tTKUserCommunicationService = (TTKUserCommunicationService) PluggableExtentionKt.pluggableSpi$default(TTKUserCommunicationService.class, false, false, false, 14, null);
                        if (tTKUserCommunicationService != null) {
                            tTKUserCommunicationService.LJIIIZ(list, C2097908Jt.LIZJ(new Pair("enter_from", "ppf_app_access")));
                        }
                    }

                    @Override // X.C0NR1
                    public final boolean LJ(Bundle bundle2, String str) {
                        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
                        if (LIZJ) {
                            return false;
                        }
                        C20684815ws.LJIILLIIL("gate_keeper_app_access_task_triggered", C2097608Jq.LJIIIIZZ(new Pair("key", "inside_feature_task"), new Pair("signal", "should_show_handler")));
                        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
                        if (iGatekeeperService == null || (eligibilityModelLIZ = iGatekeeperService.LIZ("app_access")) == null) {
                            return false;
                        }
                        LIZIZ = C13LP.LLIIII(eligibilityModelLIZ.actionList);
                        return !eligibilityModelLIZ.isEligible();
                    }
                };
            }
        });
        C01GW c01gw = C1916550zyP.LIZIZ;
        IGatekeeperService iGatekeeperService = (IGatekeeperService) c01gw.getValue();
        if (iGatekeeperService != null) {
            iGatekeeperService.LJ(listLJIILJJIL);
        }
        IGatekeeperService iGatekeeperService2 = (IGatekeeperService) c01gw.getValue();
        if (iGatekeeperService2 != null) {
            iGatekeeperService2.LJI(new C0N0M() { // from class: X.0zwv
                public final C01GW LIZ = C452501pT.LIZIZ(new C1915640zww());

                @Override // X.C0N0M
                public final String getTaskKey() {
                    return "NonPersonalizedTask";
                }

                @Override // X.C0N0M
                public final void execute() {
                    IGatekeeperService iGatekeeperService3 = (IGatekeeperService) this.LIZ.getValue();
                    DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ = iGatekeeperService3 != null ? iGatekeeperService3.LIZ("ca_no_personalized_go_rule") : null;
                    IGatekeeperService iGatekeeperService4 = (IGatekeeperService) this.LIZ.getValue();
                    DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ2 = iGatekeeperService4 != null ? iGatekeeperService4.LIZ("personalized_feeds") : null;
                    if (eligibilityModelLIZ == null) {
                        if (eligibilityModelLIZ2 == null) {
                            C1915520zwk.LL.LIZLLL(null);
                            return;
                        }
                    } else if (eligibilityModelLIZ2 == null) {
                        C1915520zwk.LL.LIZLLL(eligibilityModelLIZ);
                        return;
                    }
                    C1915520zwk.LL.LIZLLL(eligibilityModelLIZ2);
                }
            });
        }
        IGatekeeperService iGatekeeperService3 = (IGatekeeperService) c01gw.getValue();
        if (iGatekeeperService3 != null) {
            iGatekeeperService3.LJI(new C0N0M() { // from class: X.0XJr
                public final C01GW LIZ = C452501pT.LIZIZ(new C846780XJs());

                @Override // X.C0N0M
                public final String getTaskKey() {
                    return "app_access";
                }

                @Override // X.C0N0M
                public final void execute() {
                    DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
                    IGatekeeperService iGatekeeperService4;
                    IGatekeeperService iGatekeeperService5 = (IGatekeeperService) this.LIZ.getValue();
                    if (iGatekeeperService5 == null || (eligibilityModelLIZ = iGatekeeperService5.LIZ("app_access")) == null || eligibilityModelLIZ.isEligible() || (iGatekeeperService4 = (IGatekeeperService) this.LIZ.getValue()) == null) {
                        return;
                    }
                    iGatekeeperService4.LJIIIIZZ("AppAccessSignal", new Bundle(), null);
                }
            });
        }
    }
}
