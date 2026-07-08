package com.ss.android.ugc.aweme.compliance.business.gatekeeper;

import X.C01GW;
import X.C0BXR;
import X.C0C64;
import X.C0CCZ;
import X.C0CN5;
import X.C0NR2;
import X.C0VZ0;
import X.C1697810uHb;
import X.C1916550zyP;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.pumbaa.pipeline.EventPipeline;
import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.GradientPunishWarning;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.UserCommunicationProcessorModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class ComplianceFirstFocusLegoTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ComplianceFirstFocusLegoTask";
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
        return EnumC799870VZh.FIRST_WINDOW_FOCUS;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0NR2 c0nr2;
        String strLIZ;
        C1916550zyP.LIZ.getClass();
        List<? extends C0NR2> listLJIILJJIL = C1697810uHb.LJIILJJIL(new C0NR2() { // from class: X.0zyM
            public final Set<String> LIZ = Collections.singleton("ComplianceSettingFinished");

            @Override // X.C0NR2
            public final String LIZ(Bundle bundle) {
                return "TermsConsentExistingUserGatekeeperTask";
            }

            @Override // X.C0NR2
            public final Set<String> LIZJ() {
                return this.LIZ;
            }

            @Override // X.C0NR2
            public final C0NR1 LIZIZ(Bundle bundle) {
                return new C0NR1() { // from class: X.0zyN
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
                        return "TermsConsentExistingUserGatekeeperTask";
                    }

                    @Override // X.C0NR1
                    public final C0NRC category() {
                        return C0NRC.NOTICE;
                    }

                    @Override // X.C0NR1
                    public final void LIZIZ(Bundle bundle2, final C0NR0 c0nr0) {
                        final C19EG c19eg;
                        Activity activityLJFF = C2214201BlK.LJFF();
                        if ((activityLJFF instanceof C19EG) && (c19eg = (C19EG) activityLJFF) != null) {
                            ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIJI();
                            if (C294570Bgd.LIZ()) {
                                PopupManager.LJIIZILJ(new C10GR(c19eg, c0nr0) { // from class: X.0zz7
                                    public final C19EG LL;
                                    public final C0X54 LLILLJJLI;
                                    public final int LLILLL = 130;

                                    @Override // X.InterfaceC20660415sw
                                    public final C688120Qyw i2() {
                                        C19EG c19eg2 = this.LL;
                                        return new C688120Qyw(c19eg2, c19eg2, null);
                                    }

                                    @Override // X.InterfaceC20660515sx
                                    public final int getPriority() {
                                        return this.LLILLL;
                                    }

                                    {
                                        this.LL = c19eg;
                                        this.LLILLJJLI = c0nr0;
                                    }

                                    @Override // X.InterfaceC20659015si
                                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                                        if (c19egLIZIZ != null) {
                                            SmartRouter.buildRoute(c19egLIZIZ, "//compliance/terms_consent").open();
                                        }
                                    }

                                    @Override // X.AbstractC20656215sG
                                    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                                        C0X54 c0x54;
                                        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                                        if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
                                            C0X54 c0x542 = this.LLILLJJLI;
                                            if (c0x542 != null) {
                                                c0x542.LIZIZ();
                                                return;
                                            }
                                            return;
                                        }
                                        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLJJLI) == null) {
                                            return;
                                        }
                                        c0x54.LIZ();
                                    }
                                }, new C1668306g5("pns_compliance_terms_consent_existing_user_trigger"));
                            } else {
                                PopupManager.LJIJI(new C10GR(c19eg, c0nr0) { // from class: X.0zz7
                                    public final C19EG LL;
                                    public final C0X54 LLILLJJLI;
                                    public final int LLILLL = 130;

                                    @Override // X.InterfaceC20660415sw
                                    public final C688120Qyw i2() {
                                        C19EG c19eg2 = this.LL;
                                        return new C688120Qyw(c19eg2, c19eg2, null);
                                    }

                                    @Override // X.InterfaceC20660515sx
                                    public final int getPriority() {
                                        return this.LLILLL;
                                    }

                                    {
                                        this.LL = c19eg;
                                        this.LLILLJJLI = c0nr0;
                                    }

                                    @Override // X.InterfaceC20659015si
                                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                                        if (c19egLIZIZ != null) {
                                            SmartRouter.buildRoute(c19egLIZIZ, "//compliance/terms_consent").open();
                                        }
                                    }

                                    @Override // X.AbstractC20656215sG
                                    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                                        C0X54 c0x54;
                                        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                                        if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
                                            C0X54 c0x542 = this.LLILLJJLI;
                                            if (c0x542 != null) {
                                                c0x542.LIZIZ();
                                                return;
                                            }
                                            return;
                                        }
                                        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLJJLI) == null) {
                                            return;
                                        }
                                        c0x54.LIZ();
                                    }
                                }, true);
                            }
                        }
                    }

                    @Override // X.C0NR1
                    public final boolean LJ(Bundle bundle2, String str) {
                        IComplianceDependService iComplianceDependServiceLIZ = C1110504Vz.LIZ();
                        if (iComplianceDependServiceLIZ != null && iComplianceDependServiceLIZ.LIZ()) {
                            return false;
                        }
                        return ComplianceServiceProvider.LJJI().LJJIJIIJIL();
                    }
                };
            }
        }, new C0NR2() { // from class: X.0zyL
            public final Set<String> LIZ = Collections.singleton("ComplianceSettingFinished");

            @Override // X.C0NR2
            public final String LIZ(Bundle bundle) {
                return "PersonalizedAdGatekeeperTask";
            }

            @Override // X.C0NR2
            public final Set<String> LIZJ() {
                return this.LIZ;
            }

            @Override // X.C0NR2
            public final C0NR1 LIZIZ(Bundle bundle) {
                return new C0NR1() { // from class: X.0zz1
                    public boolean LIZ;
                    public boolean LIZIZ;
                    public boolean LIZJ;
                    public boolean LIZLLL;
                    public boolean LJ;
                    public boolean LJFF;
                    public boolean LJI;
                    public final C01GW LJII = C452501pT.LIZIZ(new C1916940zz2());

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
                        return "PersonalizedAdGatekeeperTask";
                    }

                    @Override // X.C0NR1
                    public final C0NRC category() {
                        return C0NRC.NOTICE;
                    }

                    @Override // X.C0NR1
                    public final void LIZIZ(Bundle bundle2, final C0NR0 c0nr0) {
                        final C19EG c19eg;
                        Activity activityLJFF = C2214201BlK.LJFF();
                        if ((activityLJFF instanceof C19EG) && (c19eg = (C19EG) activityLJFF) != null) {
                            if (this.LIZ) {
                                ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIJI();
                                if (C294570Bgd.LIZ()) {
                                    PopupManager.LJIIZILJ(new C1917030zzB(c19eg, c0nr0), new C1668306g5("pns_compliance_personalized_ad_trigger"));
                                } else {
                                    PopupManager.LJIJI(new C1917030zzB(c19eg, c0nr0), true);
                                }
                            }
                            if (this.LIZIZ) {
                                IPipFeedService iPipFeedService = (IPipFeedService) PluggableExtentionKt.pluggableSpi$default(IPipFeedService.class, false, false, false, 14, null);
                                if (iPipFeedService != null) {
                                    iPipFeedService.LJIJI();
                                }
                                PopupManager.LJIIZILJ(new C10GR(c19eg, c0nr0) { // from class: X.0zzA
                                    public final C19EG LL;
                                    public final C0X54 LLILLJJLI;
                                    public final int LLILLL = 133;

                                    @Override // X.InterfaceC20660415sw
                                    public final C688120Qyw i2() {
                                        C19EG c19eg2 = this.LL;
                                        return new C688120Qyw(c19eg2, c19eg2, null);
                                    }

                                    @Override // X.InterfaceC20660515sx
                                    public final int getPriority() {
                                        return this.LLILLL;
                                    }

                                    {
                                        this.LL = c19eg;
                                        this.LLILLJJLI = c0nr0;
                                    }

                                    @Override // X.InterfaceC20659015si
                                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                                        if (c19egLIZIZ != null) {
                                            IComplianceService iComplianceServiceLJIILIIL = ComplianceServiceProvider.LJIILIIL();
                                            if (!iComplianceServiceLJIILIIL.LJJIIZ(null, 2)) {
                                                c20656615sK.LIZ();
                                            } else {
                                                iComplianceServiceLJIILIIL.LJJIJIIJI(c19egLIZIZ, c20656615sK);
                                            }
                                        }
                                    }

                                    @Override // X.AbstractC20656215sG
                                    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                                        C0X54 c0x54;
                                        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                                        if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
                                            C0X54 c0x542 = this.LLILLJJLI;
                                            if (c0x542 != null) {
                                                c0x542.LIZIZ();
                                                return;
                                            }
                                            return;
                                        }
                                        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLJJLI) == null) {
                                            return;
                                        }
                                        c0x54.LIZ();
                                    }
                                }, new C1668306g5("privacy_and_compliance_tiktok_adfree_pick_your_plan"));
                            }
                            if (this.LIZJ) {
                                ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIJI();
                                PopupManager.LJIJI(new C10GR(c19eg, c0nr0) { // from class: X.0zz8
                                    public final C19EG LL;
                                    public final C0X54 LLILLJJLI;
                                    public final int LLILLL = 132;

                                    @Override // X.InterfaceC20660415sw
                                    public final C688120Qyw i2() {
                                        C19EG c19eg2 = this.LL;
                                        return new C688120Qyw(c19eg2, c19eg2, null);
                                    }

                                    @Override // X.InterfaceC20660515sx
                                    public final int getPriority() {
                                        return this.LLILLL;
                                    }

                                    {
                                        this.LL = c19eg;
                                        this.LLILLJJLI = c0nr0;
                                    }

                                    @Override // X.InterfaceC20659015si
                                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                                        if (c19egLIZIZ != null) {
                                            ComplianceServiceProvider.LJIILIIL().LJIIZILJ(c19egLIZIZ, c20656615sK);
                                        }
                                    }

                                    @Override // X.AbstractC20656215sG
                                    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                                        C0X54 c0x54;
                                        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                                        if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
                                            C0X54 c0x542 = this.LLILLJJLI;
                                            if (c0x542 != null) {
                                                c0x542.LIZIZ();
                                                return;
                                            }
                                            return;
                                        }
                                        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLJJLI) == null) {
                                            return;
                                        }
                                        c0x54.LIZ();
                                    }
                                }, true);
                            }
                            if (this.LJFF) {
                                IPipFeedService iPipFeedService2 = (IPipFeedService) PluggableExtentionKt.pluggableSpi$default(IPipFeedService.class, false, false, false, 14, null);
                                if (iPipFeedService2 != null) {
                                    iPipFeedService2.LJIJI();
                                }
                                PopupManager.LJIIZILJ(new C10GR(c19eg, c0nr0) { // from class: X.0zzD
                                    public final C19EG LL;
                                    public final C0X54 LLILLJJLI;
                                    public final int LLILLL = 132;

                                    @Override // X.InterfaceC20660415sw
                                    public final C688120Qyw i2() {
                                        C19EG c19eg2 = this.LL;
                                        return new C688120Qyw(c19eg2, c19eg2, null);
                                    }

                                    @Override // X.InterfaceC20660515sx
                                    public final int getPriority() {
                                        return this.LLILLL;
                                    }

                                    {
                                        this.LL = c19eg;
                                        this.LLILLJJLI = c0nr0;
                                    }

                                    @Override // X.InterfaceC20659015si
                                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                                        if (c19egLIZIZ != null) {
                                            ComplianceServiceProvider.LJIILIIL().LJIIZILJ(c19egLIZIZ, c20656615sK);
                                        }
                                    }

                                    @Override // X.AbstractC20656215sG
                                    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                                        C0X54 c0x54;
                                        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                                        if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
                                            C0X54 c0x542 = this.LLILLJJLI;
                                            if (c0x542 != null) {
                                                c0x542.LIZIZ();
                                                return;
                                            }
                                            return;
                                        }
                                        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLJJLI) == null) {
                                            return;
                                        }
                                        c0x54.LIZ();
                                    }
                                }, new C1668306g5("privacy_and_compliance_tiktok_adfree_welcome"));
                            }
                            if (this.LJI) {
                                IPipFeedService iPipFeedService3 = (IPipFeedService) PluggableExtentionKt.pluggableSpi$default(IPipFeedService.class, false, false, false, 14, null);
                                if (iPipFeedService3 != null) {
                                    iPipFeedService3.LJIJI();
                                }
                                PopupManager.LJIIZILJ(new C10GR(c19eg, c0nr0) { // from class: X.0zz9
                                    public final C19EG LL;
                                    public final C0X54 LLILLJJLI;
                                    public final int LLILLL = 132;

                                    @Override // X.InterfaceC20660415sw
                                    public final C688120Qyw i2() {
                                        C19EG c19eg2 = this.LL;
                                        return new C688120Qyw(c19eg2, c19eg2, null);
                                    }

                                    @Override // X.InterfaceC20660515sx
                                    public final int getPriority() {
                                        return this.LLILLL;
                                    }

                                    {
                                        this.LL = c19eg;
                                        this.LLILLJJLI = c0nr0;
                                    }

                                    @Override // X.InterfaceC20659015si
                                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                                        if (c19egLIZIZ != null) {
                                            ComplianceServiceProvider.LJIILIIL().LJIIZILJ(c19egLIZIZ, c20656615sK);
                                        }
                                    }

                                    @Override // X.AbstractC20656215sG
                                    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                                        C0X54 c0x54;
                                        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                                        if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
                                            C0X54 c0x542 = this.LLILLJJLI;
                                            if (c0x542 != null) {
                                                c0x542.LIZIZ();
                                                return;
                                            }
                                            return;
                                        }
                                        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLJJLI) == null) {
                                            return;
                                        }
                                        c0x54.LIZ();
                                    }
                                }, new C1668306g5("privacy_and_compliance_tiktok_adfree_on_hold"));
                            }
                            if (this.LJ) {
                                IPipFeedService iPipFeedService4 = (IPipFeedService) PluggableExtentionKt.pluggableSpi$default(IPipFeedService.class, false, false, false, 14, null);
                                if (iPipFeedService4 != null) {
                                    iPipFeedService4.LJIJI();
                                }
                                PopupManager.LJIIZILJ(new C10GR(c19eg, c0nr0) { // from class: X.0zzC
                                    public final C19EG LL;
                                    public final C0X54 LLILLJJLI;
                                    public final int LLILLL = 132;

                                    @Override // X.InterfaceC20660415sw
                                    public final C688120Qyw i2() {
                                        C19EG c19eg2 = this.LL;
                                        return new C688120Qyw(c19eg2, c19eg2, null);
                                    }

                                    @Override // X.InterfaceC20660515sx
                                    public final int getPriority() {
                                        return this.LLILLL;
                                    }

                                    {
                                        this.LL = c19eg;
                                        this.LLILLJJLI = c0nr0;
                                    }

                                    @Override // X.InterfaceC20659015si
                                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                                        if (c19egLIZIZ != null) {
                                            ComplianceServiceProvider.LJIILIIL().LJIIZILJ(c19egLIZIZ, c20656615sK);
                                        }
                                    }

                                    @Override // X.AbstractC20656215sG
                                    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                                        C0X54 c0x54;
                                        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                                        if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
                                            C0X54 c0x542 = this.LLILLJJLI;
                                            if (c0x542 != null) {
                                                c0x542.LIZIZ();
                                                return;
                                            }
                                            return;
                                        }
                                        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLJJLI) == null) {
                                            return;
                                        }
                                        c0x54.LIZ();
                                    }
                                }, new C1668306g5("privacy_and_compliance_tiktok_adfree_standard_scheduled"));
                            }
                            if (this.LIZLLL) {
                                ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIJI();
                                if (C849850XVn.LIZIZ.LIZJ().LJJ("global_personalized_ad")) {
                                    PopupManager.LJIJ(new C1917060zzE(c19eg, c0nr0), "global_personalized_ad", new C1668306g5("global_personalized_ad_ads_ad_gatekeeper_task"));
                                } else {
                                    PopupManager.LJIJI(new C1917060zzE(c19eg, c0nr0), true);
                                }
                            }
                        }
                    }

                    @Override // X.C0NR1
                    public final boolean LJ(Bundle bundle2, String str) {
                        boolean z;
                        IComplianceSettingsService iComplianceSettingsService;
                        AdPersonalitySettings adPersonalitySettingsLJIIL;
                        IComplianceDependService iComplianceDependServiceLIZ = C1110504Vz.LIZ();
                        if (iComplianceDependServiceLIZ != null && iComplianceDependServiceLIZ.LIZ()) {
                            return false;
                        }
                        if (!ComplianceServiceProvider.LJIILIIL().LJIILJJIL() && ComplianceServiceProvider.LJIILIIL().LJJJJZI() && ComplianceServiceProvider.LJIILIIL().LJIJI()) {
                            C690090R5b.LIZ.getClass();
                            if (C690090R5b.LIZ()) {
                                return true;
                            }
                            this.LIZ = true;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (ComplianceServiceProvider.LJIILIIL().LJJJJZI() && ComplianceServiceProvider.LJIILIIL().LJJJJI()) {
                            this.LIZIZ = true;
                            z = true;
                        }
                        if (ComplianceServiceProvider.LJIILIIL().LJJJJIZL()) {
                            this.LIZJ = true;
                            z = true;
                        }
                        if (ComplianceServiceProvider.LJIILIIL().LJJJI()) {
                            this.LJFF = true;
                            z = true;
                        }
                        if (ComplianceServiceProvider.LJIILIIL().LJJJJJL()) {
                            this.LJI = true;
                            z = true;
                        }
                        if (ComplianceServiceProvider.LJIILIIL().LJJJJLL()) {
                            this.LJ = true;
                            z = true;
                        }
                        if (!ComplianceServiceProvider.LJIILIIL().LJIILJJIL() && (iComplianceSettingsService = (IComplianceSettingsService) this.LJII.getValue()) != null && (adPersonalitySettingsLJIIL = iComplianceSettingsService.LJIIL()) != null && Intrinsics.LJFF(adPersonalitySettingsLJIIL.needPopUp, Boolean.TRUE)) {
                            C690090R5b.LIZ.getClass();
                            if (C690090R5b.LIZ()) {
                                return true;
                            }
                            this.LIZLLL = true;
                            return true;
                        }
                        return z;
                    }
                };
            }
        }, new C0NR2() { // from class: X.0zyK
            public final Set<String> LIZ = Collections.singleton("ComplianceSettingFinished");

            @Override // X.C0NR2
            public final String LIZ(Bundle bundle) {
                return "GradientPunishWarningGatekeeperTask";
            }

            @Override // X.C0NR2
            public final Set<String> LIZJ() {
                return this.LIZ;
            }

            @Override // X.C0NR2
            public final C0NR1 LIZIZ(Bundle bundle) {
                return new C0NR1() { // from class: X.0zyy
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
                        return "GradientPunishWarningGatekeeperTask";
                    }

                    @Override // X.C0NR1
                    public final C0NRC category() {
                        return C0NRC.NOTICE;
                    }

                    @Override // X.C0NR1
                    public final void LIZIZ(Bundle bundle2, C0NR0 c0nr0) {
                        C19EG c19eg;
                        String enterFrom;
                        InterfaceC1603190roz interfaceC1603190roz;
                        Activity activityLJFF = C2214201BlK.LJFF();
                        if ((activityLJFF instanceof C19EG) && (c19eg = (C19EG) activityLJFF) != null) {
                            ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIJI();
                            Object objLIZIZ = C1906580ziK.LIZIZ();
                            if (!(objLIZIZ instanceof InterfaceC1603190roz) || (interfaceC1603190roz = (InterfaceC1603190roz) objLIZIZ) == null || (enterFrom = interfaceC1603190roz.getEnterFrom()) == null) {
                                enterFrom = "homepage_hot";
                            }
                            if (C294570Bgd.LIZ()) {
                                PopupManager.LJIIZILJ(new C1916960zz4(c19eg, enterFrom, c0nr0), new C1668306g5("pns_compliance_gradient_punish_warning_trigger"));
                            } else {
                                PopupManager.LJIJI(new C1916960zz4(c19eg, enterFrom, c0nr0), true);
                            }
                        }
                    }

                    @Override // X.C0NR1
                    public final boolean LJ(Bundle bundle2, String str) {
                        int i;
                        IComplianceDependService iComplianceDependServiceLIZ;
                        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                            GradientPunishWarning gradientPunishWarningLIZ = C1916910zyz.LIZ();
                            if (gradientPunishWarningLIZ != null && (i = gradientPunishWarningLIZ.warnType) != 0) {
                                if (i >= 3 && !C2105908Mv.LIZ(gradientPunishWarningLIZ.dialogMessage) && !C2105908Mv.LIZ(gradientPunishWarningLIZ.dialogButton) && !C2105908Mv.LIZ(gradientPunishWarningLIZ.detailUrl)) {
                                    String curUserId2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                                    C19633311rf c19633311rf = C1916910zyz.LIZIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("has_click_warning_dialog_");
                                    sbLIZ.append(curUserId2);
                                    if (!c19633311rf.LIZJ(C2188811AlT.LIZIZ(sbLIZ), false) && (((iComplianceDependServiceLIZ = C1110504Vz.LIZ()) == null || !iComplianceDependServiceLIZ.LIZ()) && C1916910zyz.LIZ() != null)) {
                                        return true;
                                    }
                                }
                            } else {
                                C19633311rf c19633311rf2 = C1916910zyz.LIZIZ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("has_click_warning_dialog_");
                                sbLIZ2.append(curUserId);
                                c19633311rf2.LJI(C2188811AlT.LIZIZ(sbLIZ2), false);
                                return false;
                            }
                        }
                        return false;
                    }
                };
            }
        }, new C0NR2() { // from class: X.0WhD
            public final Set<String> LIZ = Collections.singleton("FeatureAccessTaskSignal");

            @Override // X.C0NR2
            public final Set<String> LIZJ() {
                return this.LIZ;
            }

            @Override // X.C0NR2
            public final String LIZ(Bundle bundle) {
                String string;
                if (!bundle.isEmpty() && (string = bundle.getString("fid")) != null && !C830060WhI.LIZ(string)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FeatureAccessGatekeeperTask_");
                    sbLIZ.append(string);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return "FeatureAccessGatekeeperTask";
            }

            @Override // X.C0NR2
            public final C0NR1 LIZIZ(Bundle bundle) {
                String string;
                if (bundle.isEmpty() || (string = bundle.getString("fid")) == null || C830060WhI.LIZ(string)) {
                    return null;
                }
                return new C0NR1(string) { // from class: X.0WhC
                    public final String LIZ;
                    public final String LIZIZ;

                    @Override // X.C0NR1
                    public final void LIZ() {
                    }

                    @Override // X.C0NR1
                    public final int LIZJ() {
                        return 1;
                    }

                    @Override // X.C0NR1
                    public final Map<String, String> LIZLLL() {
                        return C2097908Jt.LIZJ(new Pair("fid", this.LIZ));
                    }

                    @Override // X.C0NR1
                    public final C0NRC category() {
                        return C0NRC.BLOCKING;
                    }

                    @Override // X.C0NR1
                    public final String getTaskKey() {
                        return this.LIZIZ;
                    }

                    {
                        this.LIZ = string;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("FeatureAccessGatekeeperTask_");
                        sbLIZ.append(string);
                        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.C0NR1
                    public final void LIZIZ(Bundle bundle2, C0NR0 c0nr0) {
                        c0nr0.LIZIZ();
                        c0nr0.LIZ();
                    }

                    @Override // X.C0NR1
                    public final boolean LJ(Bundle bundle2, String str) {
                        String str2;
                        boolean zLJII = ((IGatekeeperService) ServiceManager.get().getService(IGatekeeperService.class)).LJII();
                        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ = ((IGatekeeperService) ServiceManager.get().getService(IGatekeeperService.class)).LIZ(this.LIZ);
                        String string2 = bundle2.getString("feature_business", "");
                        boolean z = bundle2.getBoolean("current_status", true);
                        C2241008qG c2241008qG = new C2241008qG();
                        c2241008qG.LIZ.put("business", string2);
                        c2241008qG.LIZ.put("current_status", Boolean.valueOf(z));
                        c2241008qG.LIZ.put("feature_id", this.LIZ);
                        c2241008qG.LIZ.put("app_status", Boolean.valueOf(zLJII));
                        if (eligibilityModelLIZ == null) {
                            c2241008qG.LIZ.put("decisionCode", "000001");
                            c2241008qG.LIZ.put("ppf_status", Boolean.FALSE);
                            C20684815ws.LJIJ("pns_ppf_data_unknown", c2241008qG.LJ());
                            return false;
                        }
                        boolean zIsEligible = eligibilityModelLIZ.isEligible();
                        c2241008qG.LIZ.put("decisionCode", eligibilityModelLIZ.decisionCode);
                        c2241008qG.LIZ.put("ppf_status", Boolean.valueOf(zIsEligible));
                        JSONObject jSONObjectLJ = c2241008qG.LJ();
                        if (zIsEligible && zLJII) {
                            str2 = "pns_ppf_check_success";
                        } else {
                            str2 = "pns_ppf_check_failure";
                        }
                        C20684815ws.LJIJ(str2, jSONObjectLJ);
                        return !zIsEligible;
                    }
                };
            }
        }, new C0NR2() { // from class: X.0zw1
            public final Set<String> LIZ = Collections.singleton("FollowRequestShow");

            @Override // X.C0NR2
            public final String LIZ(Bundle bundle) {
                return "FollowRequestTransparencyGatekeeperTask";
            }

            @Override // X.C0NR2
            public final Set<String> LIZJ() {
                return this.LIZ;
            }

            @Override // X.C0NR2
            public final C0NR1 LIZIZ(Bundle bundle) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", bundle.getString("enter_from", ""));
                linkedHashMap.put("enter_method", bundle.getString("enter_method", ""));
                return new C0NR1(linkedHashMap) { // from class: X.0zw0
                    public final Map<String, String> LIZ;
                    public DecisionMakerNetworkApi.PPFActionModel LIZIZ;

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
                        return "ConsentCollectionGatekeeperTask";
                    }

                    @Override // X.C0NR1
                    public final C0NRC category() {
                        return C0NRC.BLOCKING;
                    }

                    {
                        this.LIZ = linkedHashMap;
                    }

                    @Override // X.C0NR1
                    public final void LIZIZ(Bundle bundle2, C0NR0 c0nr0) {
                        CollectConsentParam collectConsentParamLJ;
                        Activity activityLIZIZ;
                        IPNSConsentCollectorService iPNSConsentCollectorService;
                        Activity activityLIZIZ2;
                        IPNSConsentCollectorService iPNSConsentCollectorService2;
                        if (C294520BgY.LIZ()) {
                            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ2 = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (iPNSConsentCollectorService2 = (IPNSConsentCollectorService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentCollectorService.class, false, false, false, 14, null)) != null) {
                                iPNSConsentCollectorService2.LIZIZ(activityLIZIZ2, new C1915040zvy("follower_request_transparency", null, this.LIZ, 2), null);
                                return;
                            }
                            return;
                        }
                        DecisionMakerNetworkApi.PPFActionModel pPFActionModel = this.LIZIZ;
                        if (pPFActionModel == null) {
                            return;
                        }
                        IPNSConsentCollectorService iPNSConsentCollectorService3 = (IPNSConsentCollectorService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentCollectorService.class, false, false, false, 14, null);
                        String strOptString = "";
                        if (iPNSConsentCollectorService3 != null) {
                            String str = pPFActionModel.actionParams;
                            if (str == null) {
                                str = "";
                            }
                            collectConsentParamLJ = iPNSConsentCollectorService3.LJ(str);
                        } else {
                            collectConsentParamLJ = null;
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
                        if (collectConsentParamLJ != null) {
                            collectConsentParamLJ.LIZ = this.LIZ;
                        }
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ2 == null || (activityLIZIZ = abstractC1387200mCcLIZIZ2.LIZIZ()) == null || collectConsentParamLJ == null || (iPNSConsentCollectorService = (IPNSConsentCollectorService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentCollectorService.class, false, false, false, 14, null)) == null) {
                            return;
                        }
                        iPNSConsentCollectorService.LIZJ(activityLIZIZ, collectConsentParamLJ, strOptString, null);
                    }

                    @Override // X.C0NR1
                    public final boolean LJ(Bundle bundle2, String str) {
                        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
                        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
                        if (iGatekeeperService != null) {
                            eligibilityModelLIZ = iGatekeeperService.LIZ("follower_request_transparency");
                        } else {
                            eligibilityModelLIZ = null;
                        }
                        if (eligibilityModelLIZ == null || eligibilityModelLIZ.actionList.isEmpty()) {
                            return false;
                        }
                        for (DecisionMakerNetworkApi.PPFActionModel pPFActionModel : eligibilityModelLIZ.actionList) {
                            if (Intrinsics.LJFF(pPFActionModel.actionId, "ConsentCollectProcessor")) {
                                this.LIZIZ = pPFActionModel;
                            }
                        }
                        if (this.LIZIZ == null) {
                            return false;
                        }
                        return true;
                    }
                };
            }
        }, new C0NR2() { // from class: X.0pdk
            public final Set<String> LIZ = Collections.singleton("CommunicationReady");

            @Override // X.C0NR2
            public final String LIZ(Bundle bundle) {
                return "UniversalPopupGatekeeperTask2";
            }

            @Override // X.C0NR2
            public final Set<String> LIZJ() {
                return this.LIZ;
            }

            @Override // X.C0NR2
            public final C0NR1 LIZIZ(Bundle bundle) {
                return new C0NR1() { // from class: X.0pdj
                    public final String LIZ = "UniversalPopupGatekeeperTask2";

                    @Override // X.C0NR1
                    public final int LIZJ() {
                        return Integer.MAX_VALUE;
                    }

                    @Override // X.C0NR1
                    public final Map<String, String> LIZLLL() {
                        return null;
                    }

                    @Override // X.C0NR1
                    public final void LIZ() {
                        if (ComplianceServiceProvider.LJIJI().LIZ() != null) {
                            C1914170zuZ.LIZ();
                        }
                    }

                    @Override // X.C0NR1
                    public final C0NRC category() {
                        return C0NRC.BLOCKING;
                    }

                    @Override // X.C0NR1
                    public final String getTaskKey() {
                        return this.LIZ;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
                    @Override // X.C0NR1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZIZ(android.os.Bundle r13, X.C0NR0 r14) {
                        /*
                            r12 = this;
                            java.lang.Class<com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService> r0 = com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService.class
                            r1 = 0
                            r4 = 14
                            r5 = 0
                            r2 = r1
                            r3 = r1
                            java.lang.Object r10 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
                            com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService r10 = (com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService) r10
                            if (r10 == 0) goto L1a
                            X.0pdl r0 = X.C1519350pdl.LIZIZ
                            r10.LIZJ(r0)
                            X.0pd4 r0 = new X.AbstractC1519240pda() { // from class: X.0pd4
                                static {
                                    /*
                                        X.0pd4 r0 = new X.0pd4
                                        r0.<init>()
                                        
                                        // error: 0x0005: SPUT (r0 I:X.0pd4) X.0pd4.LIZIZ X.0pd4
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C1518920pd4.<clinit>():void");
                                }

                                @Override // X.AbstractC1519240pda
                                public final void LJII() {
                                    /*
                                        r1 = this;
                                        java.lang.Class<X.0yIO> r0 = X.C1852060yIO.class
                                        com.bytedance.poplayer.core.PopupManager.LIZJ(r0)
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C1518920pd4.LJII():void");
                                }

                                {
                                    /*
                                        r0 = this;
                                        r0.<init>()
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C1518920pd4.<init>():void");
                                }

                                @Override // X.AbstractC1519240pda
                                public final void LJIIIIZZ(X.C1519370pdn r7) {
                                    /*
                                        r6 = this;
                                        java.lang.Class<com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService> r0 = com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService.class
                                        r1 = 0
                                        r4 = 14
                                        r5 = 0
                                        r2 = r1
                                        r3 = r1
                                        java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
                                        com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService r2 = (com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService) r2
                                        if (r2 == 0) goto L23
                                        java.util.Map<java.lang.String, java.lang.String> r1 = r7.LIZLLL
                                        java.lang.String r0 = "uc_scene"
                                        java.lang.Object r1 = r1.get(r0)
                                        java.lang.String r1 = (java.lang.String) r1
                                        if (r1 != 0) goto L1e
                                        java.lang.String r1 = ""
                                    L1e:
                                        java.lang.String r0 = r7.LIZ
                                        r2.LJIIL(r1, r0)
                                    L23:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C1518920pd4.LJIIIIZZ(X.0pdn):void");
                                }

                                @Override // X.AbstractC1519240pda
                                public final boolean LJIIIZ(X.C1519370pdn r7) {
                                    /*
                                        r6 = this;
                                        java.lang.Class<com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService> r0 = com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService.class
                                        r1 = 0
                                        r4 = 14
                                        r5 = 0
                                        r2 = r1
                                        r3 = r1
                                        java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
                                        com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService r1 = (com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService) r1
                                        if (r1 == 0) goto L1a
                                        java.lang.String r0 = r7.LIZ
                                        java.lang.String r0 = r1.LJIILIIL(r0)
                                        if (r0 == 0) goto L1a
                                        r0 = 1
                                        return r0
                                    L1a:
                                        r0 = 0
                                        return r0
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C1518920pd4.LJIIIZ(X.0pdn):boolean");
                                }

                                @Override // X.AbstractC1519240pda
                                public final boolean LJIIJ(java.util.Map<java.lang.String, java.lang.String> r7) {
                                    /*
                                        r6 = this;
                                        java.lang.Class<com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService> r0 = com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService.class
                                        r1 = 0
                                        r4 = 14
                                        r5 = 0
                                        r2 = r1
                                        r3 = r1
                                        java.lang.Object r5 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
                                        com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService r5 = (com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService) r5
                                        java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
                                        java.lang.String r0 = "business"
                                        java.lang.Object r4 = r7.get(r0)
                                        java.lang.String r4 = (java.lang.String) r4
                                        java.lang.String r3 = ""
                                        if (r4 != 0) goto L1d
                                        r4 = r3
                                    L1d:
                                        java.lang.String r0 = "uc_scene"
                                        java.lang.Object r0 = r7.get(r0)
                                        java.lang.String r0 = (java.lang.String) r0
                                        if (r0 == 0) goto L28
                                        r3 = r0
                                    L28:
                                        r2 = 1
                                        r1 = 0
                                        if (r5 == 0) goto L42
                                        boolean r0 = r5.LJIIIZ(r4)
                                        if (r0 != r2) goto L3d
                                        java.lang.String r0 = "default_interceptor"
                                        r5.LJI(r2, r3, r4, r0)
                                        java.lang.Class<X.0yIO> r0 = X.C1852060yIO.class
                                        com.bytedance.poplayer.core.PopupManager.LIZJ(r0)
                                        return r2
                                    L3d:
                                        java.lang.String r0 = "success"
                                        r5.LJI(r1, r3, r4, r0)
                                    L42:
                                        return r1
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C1518920pd4.LJIIJ(java.util.Map):boolean");
                                }

                                @Override // X.AbstractC1519240pda
                                public final void LJI(com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction r7, X.C1519370pdn r8) {
                                    /*
                                        r6 = this;
                                        java.lang.Class<com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService> r0 = com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService.class
                                        r1 = 0
                                        r4 = 14
                                        r5 = 0
                                        r2 = r1
                                        r3 = r1
                                        java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
                                        com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService r2 = (com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService) r2
                                        if (r2 == 0) goto L17
                                        java.lang.String r1 = r8.LIZ
                                        java.lang.String r0 = r7.link
                                        r2.LJIIIIZZ(r1, r0)
                                    L17:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C1518920pd4.LJI(com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction, X.0pdn):void");
                                }
                            }
                            r10.LIZJ(r0)
                        L1a:
                            java.lang.String r9 = "scene"
                            int r11 = r13.getInt(r9)
                            java.lang.String r0 = "popup_data"
                            java.io.Serializable r4 = r13.getSerializable(r0)
                            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse
                            if (r0 == 0) goto L9b
                            com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse r4 = (com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse) r4
                            if (r4 == 0) goto L34
                            java.lang.String r5 = X.C1519120pdO.LIZ(r4)
                            if (r5 != 0) goto L36
                        L34:
                            java.lang.String r5 = ""
                        L36:
                            java.lang.String r6 = "on_nuj_or_login"
                            r8 = 0
                            int r7 = r13.getInt(r6, r8)
                            android.os.Bundle r1 = new android.os.Bundle
                            r1.<init>()
                            java.lang.String r0 = java.lang.String.valueOf(r11)
                            X.C786410Ut5.LJJJI(r9, r0, r1)
                            java.lang.String r3 = "business"
                            X.C786410Ut5.LJJJI(r3, r5, r1)
                            java.lang.String r2 = "reason"
                            java.lang.String r0 = "consent"
                            X.C786410Ut5.LJJJI(r2, r0, r1)
                            r1.putInt(r6, r7)
                            java.lang.String r0 = "pns_uc_popup_gatekeeper_task_show"
                            com.ss.android.common.lib.AppLogNewUtils.LJ(r0, r1)
                            if (r4 == 0) goto L9d
                            if (r10 == 0) goto L94
                            X.0pcT r0 = r10.LJI()
                            if (r0 == 0) goto L94
                            com.ss.android.ugc.aweme.pns.usercommunication.api.UserCommunicationProcessorModel r5 = new com.ss.android.ugc.aweme.pns.usercommunication.api.UserCommunicationProcessorModel
                            java.lang.String r1 = "PopupShowProcessorLocal"
                            r0 = 0
                            r5.<init>(r1, r4, r0)
                            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
                            r0 = 2
                            kotlin.Pair[] r3 = new kotlin.Pair[r0]
                            kotlin.Pair r2 = new kotlin.Pair
                            java.lang.String r1 = "enter_from"
                            java.lang.String r0 = "ComplianceHandler"
                            r2.<init>(r1, r0)
                            r3[r8] = r2
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
                            kotlin.Pair r1 = new kotlin.Pair
                            r1.<init>(r6, r0)
                            r0 = 1
                            r3[r0] = r1
                            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r3)
                            X.C1518550pcT.LJI(r5, r4, r0)
                        L94:
                            r14.LIZIZ()
                            r14.LIZ()
                            return
                        L9b:
                            r4 = r5
                            goto L34
                        L9d:
                            android.os.Bundle r1 = new android.os.Bundle
                            r1.<init>()
                            java.lang.String r0 = java.lang.String.valueOf(r11)
                            X.C786410Ut5.LJJJI(r9, r0, r1)
                            X.C786410Ut5.LJJJI(r3, r5, r1)
                            java.lang.String r0 = "missing_popup_data"
                            X.C786410Ut5.LJJJI(r2, r0, r1)
                            r1.putInt(r6, r7)
                            java.lang.String r0 = "pns_uc_popup_gatekeeper_task_show_skip"
                            com.ss.android.common.lib.AppLogNewUtils.LJ(r0, r1)
                            r14.LIZ()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1519330pdj.LIZIZ(android.os.Bundle, X.0NR0):void");
                    }

                    @Override // X.C0NR1
                    public final boolean LJ(Bundle bundle2, String str) {
                        boolean z;
                        String strLIZ2;
                        IComplianceDependService iComplianceDependServiceLIZ;
                        NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse;
                        if (!bundle2.getBoolean("should_show", false)) {
                            return false;
                        }
                        int i = bundle2.getInt(Scene.SCENE_SERVICE);
                        if (i == EnumC1518670pcf.SCENE_LOGIN.getValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Serializable serializable = bundle2.getSerializable("popup_data");
                        if (!(serializable instanceof NetworkUniversalPopupDispatchResponse) || (networkUniversalPopupDispatchResponse = (NetworkUniversalPopupDispatchResponse) serializable) == null || (strLIZ2 = C1519120pdO.LIZ(networkUniversalPopupDispatchResponse)) == null) {
                            strLIZ2 = "";
                        }
                        int i2 = bundle2.getInt("on_nuj_or_login", 0);
                        Bundle bundle3 = new Bundle();
                        C786410Ut5.LJJJI(Scene.SCENE_SERVICE, String.valueOf(i), bundle3);
                        C786410Ut5.LJJJI("business", strLIZ2, bundle3);
                        bundle3.putInt("on_nuj_or_login", i2);
                        AppLogNewUtils.LJ("pns_uc_popup_gatekeeper_task", bundle3);
                        if (z && (iComplianceDependServiceLIZ = C1110504Vz.LIZ()) != null && iComplianceDependServiceLIZ.LIZ()) {
                            Bundle bundle4 = new Bundle();
                            C786410Ut5.LJJJI(Scene.SCENE_SERVICE, String.valueOf(i), bundle4);
                            C786410Ut5.LJJJI("business", strLIZ2, bundle4);
                            C786410Ut5.LJJJI("reason", "switch_account", bundle4);
                            bundle4.putInt("on_nuj_or_login", i2);
                            AppLogNewUtils.LJ("pns_uc_popup_block", bundle4);
                            return false;
                        }
                        ITpcConsentService iTpcConsentService = (ITpcConsentService) PluggableExtentionKt.pluggableSpi$default(ITpcConsentService.class, false, false, false, 14, null);
                        if (iTpcConsentService == null || !iTpcConsentService.LJ()) {
                            return true;
                        }
                        Bundle bundle5 = new Bundle();
                        C786410Ut5.LJJJI(Scene.SCENE_SERVICE, String.valueOf(i), bundle5);
                        C786410Ut5.LJJJI("business", strLIZ2, bundle5);
                        C786410Ut5.LJJJI("reason", "consent", bundle5);
                        bundle5.putInt("on_nuj_or_login", i2);
                        AppLogNewUtils.LJ("pns_uc_popup_block", bundle5);
                        return false;
                    }
                };
            }
        });
        Object objLJII = ComplianceServiceProvider.LJIJJLI().LJII();
        if (objLJII != null && (objLJII instanceof C0NR2)) {
            listLJIILJJIL.add(objLJII);
        }
        if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 1, "consentbox_userlogin_experiment_android", true, false)) {
            listLJIILJJIL.add(new C0NR2() { // from class: X.0zyY
                @Override // X.C0NR2
                public final String LIZ(Bundle bundle) {
                    return "ConsentBoxGatekeeperTask";
                }

                @Override // X.C0NR2
                public final Set<String> LIZJ() {
                    return Collections.singleton("GeneralUITransitionSignal");
                }

                @Override // X.C0NR2
                public final C0NR1 LIZIZ(Bundle bundle) {
                    return new C0NR1() { // from class: X.0zya
                        public final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(588));
                        public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(590));
                        public final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(589));
                        public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(591));

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
                            return "ConsentBoxGatekeeperTask";
                        }

                        @Override // X.C0NR1
                        public final C0NRC category() {
                            return C0NRC.BLOCKING;
                        }

                        @Override // X.C0NR1
                        public final void LIZIZ(Bundle bundle2, C0NR0 c0nr0) {
                            IPNSDeviceConsentService iPNSDeviceConsentService;
                            C20684815ws.LJIILLIIL("consent_box_enforce_execute", new C2344009Gk().LIZ);
                            if (((Boolean) C282740B6i.LIZ.getValue()).booleanValue() && (iPNSDeviceConsentService = (IPNSDeviceConsentService) this.LIZIZ.getValue()) != null) {
                                C0CNO.LIZLLL(0L, new AwS572S0100000_28(iPNSDeviceConsentService, 800));
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
                        @Override // X.C0NR1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final boolean LJ(android.os.Bundle r13, java.lang.String r14) {
                            /*
                                Method dump skipped, instruction units count: 289
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1916660zya.LJ(android.os.Bundle, java.lang.String):boolean");
                        }

                        public static void LJFF(Boolean bool, String str, String str2, String str3, Boolean bool2, String str4) {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJ(bool, "login_panel_displaying");
                            c2344009Gk.LJ(bool2, "consent_status");
                            if (str == null) {
                                str = EnumC1915260zwK.PNS_NULL.getValue();
                            }
                            c2344009Gk.LJIIIIZZ("handle_result", str);
                            c2344009Gk.LJIIIIZZ("handle_result_reason", str2);
                            c2344009Gk.LJIIIIZZ("current_page_name", str3);
                            c2344009Gk.LJIIIIZZ("current_web_page_url", str4);
                            C20684815ws.LJIILLIIL("consent_box_enforce_check", c2344009Gk.LIZ);
                        }
                    };
                }
            });
            listLJIILJJIL.add(new C0NR2() { // from class: X.0zyZ
                @Override // X.C0NR2
                public final String LIZ(Bundle bundle) {
                    return "UserLoginGatekeeperTask";
                }

                @Override // X.C0NR2
                public final Set<String> LIZJ() {
                    return Collections.singleton("GeneralUITransitionSignal");
                }

                @Override // X.C0NR2
                public final C0NR1 LIZIZ(Bundle bundle) {
                    return new C1916670zyb();
                }
            });
        }
        if (C0BXR.LIZ()) {
            listLJIILJJIL.add(new C0NR2() { // from class: X.0WhA
                @Override // X.C0NR2
                public final String LIZ(Bundle bundle) {
                    return "UPCValidatorGatekeeperTask";
                }

                @Override // X.C0NR2
                public final Set<String> LIZJ() {
                    return Collections.singleton("UPCFeatureDetectorSignal");
                }

                @Override // X.C0NR2
                public final C0NR1 LIZIZ(Bundle bundle) {
                    return new C0NR1() { // from class: X.0Wh9
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
                            return "UPCValidatorGatekeeperTask";
                        }

                        @Override // X.C0NR1
                        public final C0NRC category() {
                            return C0NRC.BLOCKING;
                        }

                        @Override // X.C0NR1
                        public final void LIZIZ(Bundle bundle2, C0NR0 c0nr0) {
                            c0nr0.LIZIZ();
                            c0nr0.LIZ();
                        }

                        @Override // X.C0NR1
                        public final boolean LJ(Bundle bundle2, String str) {
                            String str2;
                            Object obj;
                            Map map;
                            String str3;
                            Object value;
                            String string = bundle2.getString(Scene.SCENE_SERVICE, "");
                            if (string.length() == 0) {
                                return false;
                            }
                            PrivacyEvent.Companion.getClass();
                            PrivacyEvent privacyEventLIZ = C0WRC.LIZ(string, "1PSDK");
                            Serializable serializable = bundle2.getSerializable("extra");
                            if ((serializable instanceof Map) && (map = (Map) serializable) != null && !map.isEmpty()) {
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    if ((key instanceof String) && (str3 = (String) key) != null && (value = entry.getValue()) != null) {
                                        if (value instanceof String) {
                                            privacyEventLIZ.addCallSiteInfo(str3, new C0WQ8(EnumC823400WRu.String, value));
                                        } else if (value instanceof Long) {
                                            privacyEventLIZ.addCallSiteInfo(str3, new C0WQ8(EnumC823400WRu.Long, value));
                                        } else if (value instanceof Boolean) {
                                            privacyEventLIZ.addCallSiteInfo(str3, new C0WQ8(EnumC823400WRu.Bool, value));
                                        } else if (value instanceof Double) {
                                            privacyEventLIZ.addCallSiteInfo(str3, new C0WQ8(EnumC823400WRu.Double, value));
                                        } else {
                                            privacyEventLIZ.addCallSiteInfo(str3, new C0WQ8(EnumC823400WRu.Any, value));
                                        }
                                    }
                                }
                            }
                            long jNanoTime = System.nanoTime();
                            long j = LSPassThroughRecordSizeConfig.DEFAULT;
                            List<C0WRN> listHandleEvent = EventPipeline.handleEvent(privacyEventLIZ, null);
                            C20684815ws.LJIILLIIL("upc_metrics_info", C2097608Jq.LJIIIIZZ(new Pair("step", "strategy_execute"), new Pair("scene_key", string), new Pair("strategy_excute_time", String.valueOf((System.nanoTime() / j) - (jNanoTime / j)))));
                            boolean z = false;
                            for (C0WRN c0wrn : listHandleEvent) {
                                String str4 = c0wrn.LIZIZ;
                                String str5 = c0wrn.LIZ.LIZIZ;
                                if (str5.length() > 0) {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (String str6 : bundle2.keySet()) {
                                        try {
                                            obj = bundle2.get(str6);
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            obj = null;
                                        } catch (OutOfMemoryError e2) {
                                            TryCatchGuardChecker.doCheck(e2);
                                            obj = null;
                                        }
                                        linkedHashMap.put(str6, obj);
                                    }
                                    Map<String, Object> map2 = c0wrn.LIZ.LIZJ;
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                                    if (str4 == null) {
                                        str2 = "";
                                    } else {
                                        str2 = str4;
                                    }
                                    linkedHashMap2.put("policy_id", str2);
                                    C1227904rF.LIZ.getClass();
                                    UserCommunicationProcessorModel userCommunicationProcessorModel = new UserCommunicationProcessorModel(str5, C1227904rF.LJI(linkedHashMap2), null);
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    Iterator<T> it2 = map2.entrySet().iterator();
                                    while (it2.hasNext()) {
                                        Map.Entry entry2 = (Map.Entry) it2.next();
                                        String str7 = (String) entry2.getKey();
                                        Object value2 = entry2.getValue();
                                        if (str7.length() > 0 && value2 != null) {
                                            linkedHashMap3.put(str7, value2);
                                        }
                                    }
                                    C1518550pcT.LIZ.getClass();
                                    C1518550pcT.LJI(userCommunicationProcessorModel, null, linkedHashMap3);
                                    if (str4 == null) {
                                        str4 = "";
                                    }
                                    C20684815ws.LJIILLIIL("upc_metrics_info", C2097608Jq.LJIIIIZZ(new Pair("step", "action_execute"), new Pair("scene_key", string), new Pair("policy_id", str4), new Pair("action_id", str5)));
                                    z = true;
                                }
                            }
                            return z;
                        }
                    };
                }
            });
        }
        C01GW c01gw = C1916550zyP.LIZIZ;
        IGatekeeperService iGatekeeperService = (IGatekeeperService) c01gw.getValue();
        if (iGatekeeperService != null) {
            iGatekeeperService.LJ(listLJIILJJIL);
        }
        ArrayList arrayList = new ArrayList();
        Object objLJII2 = ComplianceServiceProvider.LJIJJLI().LJII();
        if (objLJII2 instanceof C0NR2) {
            c0nr2 = (C0NR2) objLJII2;
        } else {
            c0nr2 = null;
        }
        if (c0nr2 != null && (strLIZ = c0nr2.LIZ(new Bundle())) != null) {
            arrayList.add(new Pair(strLIZ, "UniversalPopupGatekeeperTask2"));
        }
        arrayList.addAll(C1697810uHb.LJIIJJI(new Pair(new C0NR2() { // from class: X.0zyM
            public final Set<String> LIZ = Collections.singleton("ComplianceSettingFinished");

            @Override // X.C0NR2
            public final String LIZ(Bundle bundle) {
                return "TermsConsentExistingUserGatekeeperTask";
            }

            @Override // X.C0NR2
            public final Set<String> LIZJ() {
                return this.LIZ;
            }

            @Override // X.C0NR2
            public final C0NR1 LIZIZ(Bundle bundle) {
                return new C0NR1() { // from class: X.0zyN
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
                        return "TermsConsentExistingUserGatekeeperTask";
                    }

                    @Override // X.C0NR1
                    public final C0NRC category() {
                        return C0NRC.NOTICE;
                    }

                    @Override // X.C0NR1
                    public final void LIZIZ(Bundle bundle2, final C0NR0 c0nr0) {
                        final C19EG c19eg;
                        Activity activityLJFF = C2214201BlK.LJFF();
                        if ((activityLJFF instanceof C19EG) && (c19eg = (C19EG) activityLJFF) != null) {
                            ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIJI();
                            if (C294570Bgd.LIZ()) {
                                PopupManager.LJIIZILJ(new C10GR(c19eg, c0nr0) { // from class: X.0zz7
                                    public final C19EG LL;
                                    public final C0X54 LLILLJJLI;
                                    public final int LLILLL = 130;

                                    @Override // X.InterfaceC20660415sw
                                    public final C688120Qyw i2() {
                                        C19EG c19eg2 = this.LL;
                                        return new C688120Qyw(c19eg2, c19eg2, null);
                                    }

                                    @Override // X.InterfaceC20660515sx
                                    public final int getPriority() {
                                        return this.LLILLL;
                                    }

                                    {
                                        this.LL = c19eg;
                                        this.LLILLJJLI = c0nr0;
                                    }

                                    @Override // X.InterfaceC20659015si
                                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                                        if (c19egLIZIZ != null) {
                                            SmartRouter.buildRoute(c19egLIZIZ, "//compliance/terms_consent").open();
                                        }
                                    }

                                    @Override // X.AbstractC20656215sG
                                    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                                        C0X54 c0x54;
                                        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                                        if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
                                            C0X54 c0x542 = this.LLILLJJLI;
                                            if (c0x542 != null) {
                                                c0x542.LIZIZ();
                                                return;
                                            }
                                            return;
                                        }
                                        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLJJLI) == null) {
                                            return;
                                        }
                                        c0x54.LIZ();
                                    }
                                }, new C1668306g5("pns_compliance_terms_consent_existing_user_trigger"));
                            } else {
                                PopupManager.LJIJI(new C10GR(c19eg, c0nr0) { // from class: X.0zz7
                                    public final C19EG LL;
                                    public final C0X54 LLILLJJLI;
                                    public final int LLILLL = 130;

                                    @Override // X.InterfaceC20660415sw
                                    public final C688120Qyw i2() {
                                        C19EG c19eg2 = this.LL;
                                        return new C688120Qyw(c19eg2, c19eg2, null);
                                    }

                                    @Override // X.InterfaceC20660515sx
                                    public final int getPriority() {
                                        return this.LLILLL;
                                    }

                                    {
                                        this.LL = c19eg;
                                        this.LLILLJJLI = c0nr0;
                                    }

                                    @Override // X.InterfaceC20659015si
                                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                                        if (c19egLIZIZ != null) {
                                            SmartRouter.buildRoute(c19egLIZIZ, "//compliance/terms_consent").open();
                                        }
                                    }

                                    @Override // X.AbstractC20656215sG
                                    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                                        C0X54 c0x54;
                                        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                                        if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
                                            C0X54 c0x542 = this.LLILLJJLI;
                                            if (c0x542 != null) {
                                                c0x542.LIZIZ();
                                                return;
                                            }
                                            return;
                                        }
                                        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLJJLI) == null) {
                                            return;
                                        }
                                        c0x54.LIZ();
                                    }
                                }, true);
                            }
                        }
                    }

                    @Override // X.C0NR1
                    public final boolean LJ(Bundle bundle2, String str) {
                        IComplianceDependService iComplianceDependServiceLIZ = C1110504Vz.LIZ();
                        if (iComplianceDependServiceLIZ != null && iComplianceDependServiceLIZ.LIZ()) {
                            return false;
                        }
                        return ComplianceServiceProvider.LJJI().LJJIJIIJIL();
                    }
                };
            }
        }.LIZ(new Bundle()), "UniversalPopupGatekeeperTask2"), new Pair(new C0NR2() { // from class: X.0zyL
            public final Set<String> LIZ = Collections.singleton("ComplianceSettingFinished");

            @Override // X.C0NR2
            public final String LIZ(Bundle bundle) {
                return "PersonalizedAdGatekeeperTask";
            }

            @Override // X.C0NR2
            public final Set<String> LIZJ() {
                return this.LIZ;
            }

            @Override // X.C0NR2
            public final C0NR1 LIZIZ(Bundle bundle) {
                return new C0NR1() { // from class: X.0zz1
                    public boolean LIZ;
                    public boolean LIZIZ;
                    public boolean LIZJ;
                    public boolean LIZLLL;
                    public boolean LJ;
                    public boolean LJFF;
                    public boolean LJI;
                    public final C01GW LJII = C452501pT.LIZIZ(new C1916940zz2());

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
                        return "PersonalizedAdGatekeeperTask";
                    }

                    @Override // X.C0NR1
                    public final C0NRC category() {
                        return C0NRC.NOTICE;
                    }

                    @Override // X.C0NR1
                    public final void LIZIZ(Bundle bundle2, final C0NR0 c0nr0) {
                        final C19EG c19eg;
                        Activity activityLJFF = C2214201BlK.LJFF();
                        if ((activityLJFF instanceof C19EG) && (c19eg = (C19EG) activityLJFF) != null) {
                            if (this.LIZ) {
                                ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIJI();
                                if (C294570Bgd.LIZ()) {
                                    PopupManager.LJIIZILJ(new C1917030zzB(c19eg, c0nr0), new C1668306g5("pns_compliance_personalized_ad_trigger"));
                                } else {
                                    PopupManager.LJIJI(new C1917030zzB(c19eg, c0nr0), true);
                                }
                            }
                            if (this.LIZIZ) {
                                IPipFeedService iPipFeedService = (IPipFeedService) PluggableExtentionKt.pluggableSpi$default(IPipFeedService.class, false, false, false, 14, null);
                                if (iPipFeedService != null) {
                                    iPipFeedService.LJIJI();
                                }
                                PopupManager.LJIIZILJ(new C10GR(c19eg, c0nr0) { // from class: X.0zzA
                                    public final C19EG LL;
                                    public final C0X54 LLILLJJLI;
                                    public final int LLILLL = 133;

                                    @Override // X.InterfaceC20660415sw
                                    public final C688120Qyw i2() {
                                        C19EG c19eg2 = this.LL;
                                        return new C688120Qyw(c19eg2, c19eg2, null);
                                    }

                                    @Override // X.InterfaceC20660515sx
                                    public final int getPriority() {
                                        return this.LLILLL;
                                    }

                                    {
                                        this.LL = c19eg;
                                        this.LLILLJJLI = c0nr0;
                                    }

                                    @Override // X.InterfaceC20659015si
                                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                                        if (c19egLIZIZ != null) {
                                            IComplianceService iComplianceServiceLJIILIIL = ComplianceServiceProvider.LJIILIIL();
                                            if (!iComplianceServiceLJIILIIL.LJJIIZ(null, 2)) {
                                                c20656615sK.LIZ();
                                            } else {
                                                iComplianceServiceLJIILIIL.LJJIJIIJI(c19egLIZIZ, c20656615sK);
                                            }
                                        }
                                    }

                                    @Override // X.AbstractC20656215sG
                                    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                                        C0X54 c0x54;
                                        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                                        if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
                                            C0X54 c0x542 = this.LLILLJJLI;
                                            if (c0x542 != null) {
                                                c0x542.LIZIZ();
                                                return;
                                            }
                                            return;
                                        }
                                        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLJJLI) == null) {
                                            return;
                                        }
                                        c0x54.LIZ();
                                    }
                                }, new C1668306g5("privacy_and_compliance_tiktok_adfree_pick_your_plan"));
                            }
                            if (this.LIZJ) {
                                ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIJI();
                                PopupManager.LJIJI(new C10GR(c19eg, c0nr0) { // from class: X.0zz8
                                    public final C19EG LL;
                                    public final C0X54 LLILLJJLI;
                                    public final int LLILLL = 132;

                                    @Override // X.InterfaceC20660415sw
                                    public final C688120Qyw i2() {
                                        C19EG c19eg2 = this.LL;
                                        return new C688120Qyw(c19eg2, c19eg2, null);
                                    }

                                    @Override // X.InterfaceC20660515sx
                                    public final int getPriority() {
                                        return this.LLILLL;
                                    }

                                    {
                                        this.LL = c19eg;
                                        this.LLILLJJLI = c0nr0;
                                    }

                                    @Override // X.InterfaceC20659015si
                                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                                        if (c19egLIZIZ != null) {
                                            ComplianceServiceProvider.LJIILIIL().LJIIZILJ(c19egLIZIZ, c20656615sK);
                                        }
                                    }

                                    @Override // X.AbstractC20656215sG
                                    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                                        C0X54 c0x54;
                                        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                                        if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
                                            C0X54 c0x542 = this.LLILLJJLI;
                                            if (c0x542 != null) {
                                                c0x542.LIZIZ();
                                                return;
                                            }
                                            return;
                                        }
                                        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLJJLI) == null) {
                                            return;
                                        }
                                        c0x54.LIZ();
                                    }
                                }, true);
                            }
                            if (this.LJFF) {
                                IPipFeedService iPipFeedService2 = (IPipFeedService) PluggableExtentionKt.pluggableSpi$default(IPipFeedService.class, false, false, false, 14, null);
                                if (iPipFeedService2 != null) {
                                    iPipFeedService2.LJIJI();
                                }
                                PopupManager.LJIIZILJ(new C10GR(c19eg, c0nr0) { // from class: X.0zzD
                                    public final C19EG LL;
                                    public final C0X54 LLILLJJLI;
                                    public final int LLILLL = 132;

                                    @Override // X.InterfaceC20660415sw
                                    public final C688120Qyw i2() {
                                        C19EG c19eg2 = this.LL;
                                        return new C688120Qyw(c19eg2, c19eg2, null);
                                    }

                                    @Override // X.InterfaceC20660515sx
                                    public final int getPriority() {
                                        return this.LLILLL;
                                    }

                                    {
                                        this.LL = c19eg;
                                        this.LLILLJJLI = c0nr0;
                                    }

                                    @Override // X.InterfaceC20659015si
                                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                                        if (c19egLIZIZ != null) {
                                            ComplianceServiceProvider.LJIILIIL().LJIIZILJ(c19egLIZIZ, c20656615sK);
                                        }
                                    }

                                    @Override // X.AbstractC20656215sG
                                    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                                        C0X54 c0x54;
                                        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                                        if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
                                            C0X54 c0x542 = this.LLILLJJLI;
                                            if (c0x542 != null) {
                                                c0x542.LIZIZ();
                                                return;
                                            }
                                            return;
                                        }
                                        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLJJLI) == null) {
                                            return;
                                        }
                                        c0x54.LIZ();
                                    }
                                }, new C1668306g5("privacy_and_compliance_tiktok_adfree_welcome"));
                            }
                            if (this.LJI) {
                                IPipFeedService iPipFeedService3 = (IPipFeedService) PluggableExtentionKt.pluggableSpi$default(IPipFeedService.class, false, false, false, 14, null);
                                if (iPipFeedService3 != null) {
                                    iPipFeedService3.LJIJI();
                                }
                                PopupManager.LJIIZILJ(new C10GR(c19eg, c0nr0) { // from class: X.0zz9
                                    public final C19EG LL;
                                    public final C0X54 LLILLJJLI;
                                    public final int LLILLL = 132;

                                    @Override // X.InterfaceC20660415sw
                                    public final C688120Qyw i2() {
                                        C19EG c19eg2 = this.LL;
                                        return new C688120Qyw(c19eg2, c19eg2, null);
                                    }

                                    @Override // X.InterfaceC20660515sx
                                    public final int getPriority() {
                                        return this.LLILLL;
                                    }

                                    {
                                        this.LL = c19eg;
                                        this.LLILLJJLI = c0nr0;
                                    }

                                    @Override // X.InterfaceC20659015si
                                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                                        if (c19egLIZIZ != null) {
                                            ComplianceServiceProvider.LJIILIIL().LJIIZILJ(c19egLIZIZ, c20656615sK);
                                        }
                                    }

                                    @Override // X.AbstractC20656215sG
                                    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                                        C0X54 c0x54;
                                        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                                        if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
                                            C0X54 c0x542 = this.LLILLJJLI;
                                            if (c0x542 != null) {
                                                c0x542.LIZIZ();
                                                return;
                                            }
                                            return;
                                        }
                                        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLJJLI) == null) {
                                            return;
                                        }
                                        c0x54.LIZ();
                                    }
                                }, new C1668306g5("privacy_and_compliance_tiktok_adfree_on_hold"));
                            }
                            if (this.LJ) {
                                IPipFeedService iPipFeedService4 = (IPipFeedService) PluggableExtentionKt.pluggableSpi$default(IPipFeedService.class, false, false, false, 14, null);
                                if (iPipFeedService4 != null) {
                                    iPipFeedService4.LJIJI();
                                }
                                PopupManager.LJIIZILJ(new C10GR(c19eg, c0nr0) { // from class: X.0zzC
                                    public final C19EG LL;
                                    public final C0X54 LLILLJJLI;
                                    public final int LLILLL = 132;

                                    @Override // X.InterfaceC20660415sw
                                    public final C688120Qyw i2() {
                                        C19EG c19eg2 = this.LL;
                                        return new C688120Qyw(c19eg2, c19eg2, null);
                                    }

                                    @Override // X.InterfaceC20660515sx
                                    public final int getPriority() {
                                        return this.LLILLL;
                                    }

                                    {
                                        this.LL = c19eg;
                                        this.LLILLJJLI = c0nr0;
                                    }

                                    @Override // X.InterfaceC20659015si
                                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                                        if (c19egLIZIZ != null) {
                                            ComplianceServiceProvider.LJIILIIL().LJIIZILJ(c19egLIZIZ, c20656615sK);
                                        }
                                    }

                                    @Override // X.AbstractC20656215sG
                                    public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                                        C0X54 c0x54;
                                        super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                                        if (enumC20657015sO2 == EnumC20657015sO.SHOWED) {
                                            C0X54 c0x542 = this.LLILLJJLI;
                                            if (c0x542 != null) {
                                                c0x542.LIZIZ();
                                                return;
                                            }
                                            return;
                                        }
                                        if (enumC20657015sO2 != EnumC20657015sO.DISMISSED || (c0x54 = this.LLILLJJLI) == null) {
                                            return;
                                        }
                                        c0x54.LIZ();
                                    }
                                }, new C1668306g5("privacy_and_compliance_tiktok_adfree_standard_scheduled"));
                            }
                            if (this.LIZLLL) {
                                ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIJI();
                                if (C849850XVn.LIZIZ.LIZJ().LJJ("global_personalized_ad")) {
                                    PopupManager.LJIJ(new C1917060zzE(c19eg, c0nr0), "global_personalized_ad", new C1668306g5("global_personalized_ad_ads_ad_gatekeeper_task"));
                                } else {
                                    PopupManager.LJIJI(new C1917060zzE(c19eg, c0nr0), true);
                                }
                            }
                        }
                    }

                    @Override // X.C0NR1
                    public final boolean LJ(Bundle bundle2, String str) {
                        boolean z;
                        IComplianceSettingsService iComplianceSettingsService;
                        AdPersonalitySettings adPersonalitySettingsLJIIL;
                        IComplianceDependService iComplianceDependServiceLIZ = C1110504Vz.LIZ();
                        if (iComplianceDependServiceLIZ != null && iComplianceDependServiceLIZ.LIZ()) {
                            return false;
                        }
                        if (!ComplianceServiceProvider.LJIILIIL().LJIILJJIL() && ComplianceServiceProvider.LJIILIIL().LJJJJZI() && ComplianceServiceProvider.LJIILIIL().LJIJI()) {
                            C690090R5b.LIZ.getClass();
                            if (C690090R5b.LIZ()) {
                                return true;
                            }
                            this.LIZ = true;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (ComplianceServiceProvider.LJIILIIL().LJJJJZI() && ComplianceServiceProvider.LJIILIIL().LJJJJI()) {
                            this.LIZIZ = true;
                            z = true;
                        }
                        if (ComplianceServiceProvider.LJIILIIL().LJJJJIZL()) {
                            this.LIZJ = true;
                            z = true;
                        }
                        if (ComplianceServiceProvider.LJIILIIL().LJJJI()) {
                            this.LJFF = true;
                            z = true;
                        }
                        if (ComplianceServiceProvider.LJIILIIL().LJJJJJL()) {
                            this.LJI = true;
                            z = true;
                        }
                        if (ComplianceServiceProvider.LJIILIIL().LJJJJLL()) {
                            this.LJ = true;
                            z = true;
                        }
                        if (!ComplianceServiceProvider.LJIILIIL().LJIILJJIL() && (iComplianceSettingsService = (IComplianceSettingsService) this.LJII.getValue()) != null && (adPersonalitySettingsLJIIL = iComplianceSettingsService.LJIIL()) != null && Intrinsics.LJFF(adPersonalitySettingsLJIIL.needPopUp, Boolean.TRUE)) {
                            C690090R5b.LIZ.getClass();
                            if (C690090R5b.LIZ()) {
                                return true;
                            }
                            this.LIZLLL = true;
                            return true;
                        }
                        return z;
                    }
                };
            }
        }.LIZ(new Bundle()), "UniversalPopupGatekeeperTask2"), new Pair(new C0NR2() { // from class: X.0zyK
            public final Set<String> LIZ = Collections.singleton("ComplianceSettingFinished");

            @Override // X.C0NR2
            public final String LIZ(Bundle bundle) {
                return "GradientPunishWarningGatekeeperTask";
            }

            @Override // X.C0NR2
            public final Set<String> LIZJ() {
                return this.LIZ;
            }

            @Override // X.C0NR2
            public final C0NR1 LIZIZ(Bundle bundle) {
                return new C0NR1() { // from class: X.0zyy
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
                        return "GradientPunishWarningGatekeeperTask";
                    }

                    @Override // X.C0NR1
                    public final C0NRC category() {
                        return C0NRC.NOTICE;
                    }

                    @Override // X.C0NR1
                    public final void LIZIZ(Bundle bundle2, C0NR0 c0nr0) {
                        C19EG c19eg;
                        String enterFrom;
                        InterfaceC1603190roz interfaceC1603190roz;
                        Activity activityLJFF = C2214201BlK.LJFF();
                        if ((activityLJFF instanceof C19EG) && (c19eg = (C19EG) activityLJFF) != null) {
                            ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIJI();
                            Object objLIZIZ = C1906580ziK.LIZIZ();
                            if (!(objLIZIZ instanceof InterfaceC1603190roz) || (interfaceC1603190roz = (InterfaceC1603190roz) objLIZIZ) == null || (enterFrom = interfaceC1603190roz.getEnterFrom()) == null) {
                                enterFrom = "homepage_hot";
                            }
                            if (C294570Bgd.LIZ()) {
                                PopupManager.LJIIZILJ(new C1916960zz4(c19eg, enterFrom, c0nr0), new C1668306g5("pns_compliance_gradient_punish_warning_trigger"));
                            } else {
                                PopupManager.LJIJI(new C1916960zz4(c19eg, enterFrom, c0nr0), true);
                            }
                        }
                    }

                    @Override // X.C0NR1
                    public final boolean LJ(Bundle bundle2, String str) {
                        int i;
                        IComplianceDependService iComplianceDependServiceLIZ;
                        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                            GradientPunishWarning gradientPunishWarningLIZ = C1916910zyz.LIZ();
                            if (gradientPunishWarningLIZ != null && (i = gradientPunishWarningLIZ.warnType) != 0) {
                                if (i >= 3 && !C2105908Mv.LIZ(gradientPunishWarningLIZ.dialogMessage) && !C2105908Mv.LIZ(gradientPunishWarningLIZ.dialogButton) && !C2105908Mv.LIZ(gradientPunishWarningLIZ.detailUrl)) {
                                    String curUserId2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                                    C19633311rf c19633311rf = C1916910zyz.LIZIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("has_click_warning_dialog_");
                                    sbLIZ.append(curUserId2);
                                    if (!c19633311rf.LIZJ(C2188811AlT.LIZIZ(sbLIZ), false) && (((iComplianceDependServiceLIZ = C1110504Vz.LIZ()) == null || !iComplianceDependServiceLIZ.LIZ()) && C1916910zyz.LIZ() != null)) {
                                        return true;
                                    }
                                }
                            } else {
                                C19633311rf c19633311rf2 = C1916910zyz.LIZIZ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("has_click_warning_dialog_");
                                sbLIZ2.append(curUserId);
                                c19633311rf2.LJI(C2188811AlT.LIZIZ(sbLIZ2), false);
                                return false;
                            }
                        }
                        return false;
                    }
                };
            }
        }.LIZ(new Bundle()), "UniversalPopupGatekeeperTask2")));
        IGatekeeperService iGatekeeperService2 = (IGatekeeperService) c01gw.getValue();
        if (iGatekeeperService2 != null) {
            iGatekeeperService2.LJIILIIL(arrayList);
        }
        IGeoBlockingService iGeoBlockingService = (IGeoBlockingService) PluggableExtentionKt.pluggableSpi$default(IGeoBlockingService.class, false, false, false, 14, null);
        if (iGeoBlockingService != null) {
            iGeoBlockingService.LJIIJJI();
        }
        C0CN5.LIZJ(Long.valueOf(C0C64.LJIILLIIL().LJIJJLI(31744, 3000L, "gatekeeper_startup_delay_time", true)), new Runnable() { // from class: X.0zwS
            public static void LIZ() {
                C1913400ztK.LIZ.getClass();
                if (C1913400ztK.LIZIZ.getAndSet(false)) {
                    return;
                }
                TTKUserCommunicationService tTKUserCommunicationService = (TTKUserCommunicationService) PluggableExtentionKt.pluggableSpi$default(TTKUserCommunicationService.class, false, false, false, 14, null);
                if (tTKUserCommunicationService != null) {
                    tTKUserCommunicationService.LJIIJJI(EnumC1518670pcf.SCENE_COLD_LAUNCH.getValue(), null, null);
                }
                IGatekeeperService iGatekeeperService3 = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
                if (iGatekeeperService3 != null) {
                    iGatekeeperService3.LJIIL("applaunch");
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ComplianceFirstFocusLegoTask@4a35.run$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ComplianceFirstFocusLegoTask@4a35.run$1");
            }
        }, true);
        IGatekeeperService iGatekeeperService3 = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (iGatekeeperService3 != null) {
            iGatekeeperService3.LJIIIIZZ("AppStart", new Bundle(), null);
        }
    }
}
