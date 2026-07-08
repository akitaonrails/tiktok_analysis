package com.ss.android.ugc.aweme.compliance.api;

import X.C01GW;
import X.C04TD;
import X.C052U;
import X.C1216090hkd;
import X.C452501pT;
import X.EnumC452301pR;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.compliance.api.constants.audiencecontrol.IComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.FeedLynxOverlayConfig;
import com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig;
import com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import com.ss.android.ugc.aweme.compliance.api.model.ScheduleBreakSettings;
import com.ss.android.ugc.aweme.compliance.api.model.ScreenTimeManagementDaySetting;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourConfigSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourServerDrivenConfig;
import com.ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo;
import com.ss.android.ugc.aweme.compliance.api.model.UserDetailsInfoBean;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.AgeAppealService;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.AgsWarningInfo;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.ComplianceBusinessServiceEmptyImpl;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.edm.IPnsEdmConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService;
import com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService;
import com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.BanAppealServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.PnsEdmConsentServiceImpl;
import com.ss.android.ugc.aweme.compliance.consent.serviceimpl.ConsentServiceImpl;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivateAccountServiceImpl;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.AntiAddictionServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService;
import com.ss.android.ugc.aweme.pns.agegate.NativeStoreVariables;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.survey.PNSSurveyService;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS265S0300000_21;
import kotlin.jvm.internal.AwS557S0100000_13;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class ComplianceServiceProvider implements IComplianceServiceProvider {
    public static IReportService LIZJ;
    public static IAntiAddictionService LIZLLL;
    public static IBanAppealService LJ;
    public static IComplianceBusinessService LJFF;
    public static IComplianceService LJI;
    public static IAgeGateService LJII;
    public static IPrivateAccountService LJIIIIZZ;
    public static IComplianceSettingsService LJIIIZ;
    public static ITermsConsentService LJIIJ;
    public static IConsentService LJIIJJI;
    public static IComplianceMonitorService LJIIL;
    public static IPolicyNoticeService LJIILIIL;
    public static IProtectionService LJIILJJIL;
    public static IFamilyPairingService LJIILL;
    public static IChildModeService LJIILLIIL;
    public static ITpcConsentService LJIIZILJ;
    public static IPrivacyService LJIJ;
    public static IShareWarningInfoService LJIJI;
    public static AgeAppealService LJIJJ;
    public static ICompliancePolicyService LJIJJLI;
    public static final ComplianceServiceProvider LIZIZ = new ComplianceServiceProvider();
    public static final C01GW LJIL = C452501pT.LIZIZ(new C052U());
    public static final C01GW LJJ = C452501pT.LIZIZ(new C1216090hkd());
    public static final C01GW LJJI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(109));
    public static final C01GW LJJIFFI = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS217S0000000_28.get$arr$(108));
    public static final C01GW LJJII = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(107));

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Service implements IComplianceServiceProvider {
        public final /* synthetic */ ComplianceServiceProvider LIZIZ = ComplianceServiceProvider.LIZIZ;

        @Override // com.ss.android.ugc.aweme.compliance.api.constants.audiencecontrol.IComplianceServiceProvider
        public final boolean LIZ() {
            return this.LIZIZ.LIZ();
        }

        @Override // com.ss.android.ugc.aweme.compliance.api.constants.audiencecontrol.IComplianceServiceProvider
        public final IReportService LIZIZ() {
            this.LIZIZ.getClass();
            return ComplianceServiceProvider.LJJ();
        }
    }

    public static AgeAppealService LIZJ() {
        AgeAppealService ageAppealService = LJIJJ;
        if (ageAppealService != null) {
            return ageAppealService;
        }
        AgeAppealService ageAppealService2 = (AgeAppealService) PluggableExtentionKt.pluggableSpi$default(AgeAppealService.class, false, false, false, 14, null);
        LJIJJ = ageAppealService2;
        return ageAppealService2;
    }

    public static final IAgeGateService LIZLLL() {
        IAgeGateService iAgeGateService = LJII;
        if (iAgeGateService != null) {
            return iAgeGateService;
        }
        IAgeGateService iAgeGateService2 = (IAgeGateService) PluggableExtentionKt.pluggableSpi$default(IAgeGateService.class, false, false, false, 14, null);
        LJII = iAgeGateService2;
        if (iAgeGateService2 == null) {
            LJII = new IAgeGateService() { // from class: X.10To
                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final String LIZIZ() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final boolean LJFF() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final boolean LJI() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final int LJII() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final void LJIIIIZZ(Activity activity, InterfaceC19256710Vh interfaceC19256710Vh, String str) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final void LJIIIZ(String str) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final boolean LJIIJJI(C19249810Sq c19249810Sq, boolean z) {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final boolean LJIIL() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final void LJIILIIL(Activity activity, C0X53 c0x53) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final void LJIILJJIL(Activity activity) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final void LJIILL(String str) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final void LJIJ(C19EG c19eg, ViewGroup viewGroup, C0TGX c0tgx) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final void LJIJJLI(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, C1238590iKv c1238590iKv, String str, int i, String str2, int i2, String str3, String str4, String str5, int i3, String str6, int i4, int i5, boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final void dismiss() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final void displayFeedback(PNSFeedbackModel pNSFeedbackModel) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final boolean isFtcForRegistration() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final void refreshUiModel() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final IPNSAgeFromStoreService LJIJJ() {
                    return new IPNSAgeFromStoreService() { // from class: X.10Tn
                        @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService
                        public final void LIZ(Context context, int i, C19251710Tj c19251710Tj) {
                        }

                        @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService
                        public final void LIZIZ(int i, int i2, int i3, int i4) {
                        }

                        @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService
                        public final void LIZJ() {
                        }

                        @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService
                        public final void LIZLLL(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
                        }

                        @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService
                        public final Object LJ(Context context, InterfaceC1364105Vn<? super C19258510Vz> interfaceC1364105Vn) {
                            return null;
                        }

                        @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService
                        public final void LJI(Context context, C2042707zN c2042707zN) {
                        }

                        @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService
                        public final NativeStoreVariables LJII() {
                            return null;
                        }

                        @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService
                        public final C19258510Vz LJFF() {
                            return C19252310Tp.LIZ();
                        }
                    };
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final EnumC191814102i LIZ() {
                    return EnumC191814102i.PASS;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final Class<Object> LJIIJ() {
                    return Object.class;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final Class LJIILLIIL() {
                    return Object.class;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final Class<Object> LJIIZILJ() {
                    return Object.class;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
                public final C19257210Vm LJIJI() {
                    return C19257210Vm.LIZ;
                }
            };
        }
        return LJII;
    }

    public static final IAntiAddictionService LJ() {
        IAntiAddictionService iAntiAddictionService;
        IAntiAddictionService iAntiAddictionService2 = LIZLLL;
        if (iAntiAddictionService2 != null) {
            return iAntiAddictionService2;
        }
        Object objLIZ = C04TD.LIZ(IAntiAddictionService.class, false);
        if (objLIZ != null) {
            iAntiAddictionService = (IAntiAddictionService) objLIZ;
        } else {
            if (C04TD.LLLLLL == null) {
                synchronized (IAntiAddictionService.class) {
                    if (C04TD.LLLLLL == null) {
                        C04TD.LLLLLL = new AntiAddictionServiceImpl();
                    }
                }
            }
            iAntiAddictionService = C04TD.LLLLLL;
        }
        LIZLLL = iAntiAddictionService;
        if (iAntiAddictionService == null) {
            LIZLLL = new IAntiAddictionService() { // from class: X.1ELX
                @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
                @InterfaceC1294060jmO
                public final boolean LIZJ() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
                public final void LIZLLL() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
                public final String LJ() {
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
                public final String LJI() {
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
                public final boolean LJII() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
                public final C1BNA LIZIZ() {
                    return new C1BNA() { // from class: X.1ELY
                        @Override // X.C1BNA
                        public final void LIZ() {
                        }

                        @Override // X.C1BNA
                        public final void LIZIZ() {
                        }
                    };
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
                public final C1BNA LJFF() {
                    return new C1BNA() { // from class: X.1ELZ
                        @Override // X.C1BNA
                        public final void LIZ() {
                        }

                        @Override // X.C1BNA
                        public final void LIZIZ() {
                        }
                    };
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
                public final Boolean LIZ() {
                    return Boolean.FALSE;
                }
            };
        }
        return LIZLLL;
    }

    public static final IBanAppealService LJFF() {
        IBanAppealService iBanAppealService = LJ;
        if (iBanAppealService != null) {
            return iBanAppealService;
        }
        IBanAppealService iBanAppealServiceLJIILJJIL = BanAppealServiceImpl.LJIILJJIL();
        LJ = iBanAppealServiceLJIILJJIL;
        if (iBanAppealServiceLJIILJJIL == null) {
            LJ = new IBanAppealService() { // from class: X.0zzT
                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final void LIZ(C19EG c19eg) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final void LIZIZ(String str) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final boolean LIZJ(int i) {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final void LIZLLL() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final AgsWarningInfo LJ() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final boolean LJFF() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final void LJI() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final boolean LJII() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final boolean LJIIIIZZ() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final long LJIIIZ() {
                    return 0L;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final void LJIIJ(C19EG c19eg) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final String LJIIJJI() {
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final void LJIIL() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final boolean LJIILIIL() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final void jumpToAgsStatusPage(Context context, String str) {
                }
            };
        }
        return LJ;
    }

    public static final IComplianceBusinessService LJI() {
        IComplianceBusinessService iComplianceBusinessService = LJFF;
        if (iComplianceBusinessService != null) {
            return iComplianceBusinessService;
        }
        IComplianceBusinessService iComplianceBusinessService2 = (IComplianceBusinessService) ServiceManager.get().getService(IComplianceBusinessService.class);
        LJFF = iComplianceBusinessService2;
        if (iComplianceBusinessService2 == null) {
            LJFF = new ComplianceBusinessServiceEmptyImpl();
        }
        return LJFF;
    }

    public static final IChildModeService LJII() {
        IChildModeService iChildModeService = LJIILLIIL;
        if (iChildModeService != null) {
            return iChildModeService;
        }
        IChildModeService iChildModeService2 = (IChildModeService) PluggableExtentionKt.pluggableSpi$default(IChildModeService.class, false, false, false, 14, null);
        LJIILLIIL = iChildModeService2;
        if (iChildModeService2 == null) {
            LJIILLIIL = new IChildModeService() { // from class: X.0X1Q
                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final boolean LIZLLL() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final boolean LJ() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final void LJI(boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final boolean LJII() {
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final boolean LJIIIIZZ() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final boolean LJIIIZ(HeaderParamConfig headerParamConfig, String str) {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final void LJIIJ(InterfaceC842850X4p interfaceC842850X4p, String str, boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final HeaderParamConfig LJIIJJI() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final void LJIIL(Context context) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final void LJIILIIL() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final void LJIILJJIL(C0X4O c0x4o, boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final void LJIILL(Context context) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final void LJIILLIIL() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final void LJIJ(AwS557S0100000_13 awS557S0100000_13) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final void LJIL() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final void LJJ(C19EG c19eg) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final void LJJI(Context context) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final void LJJIFFI(C0X1N c0x1n) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final C0X0V LJFF() {
                    return new C0X1R();
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final C0X0V LJIIZILJ() {
                    return new C0X1R();
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final C0X0V LJIJI() {
                    return new C0X1R();
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final C0X0V LJIJJLI() {
                    return new C0X1R();
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final List<String> LIZJ() {
                    return C13BV.INSTANCE;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService
                public final Set<String> LJIJJ() {
                    return C08CX.INSTANCE;
                }
            };
        }
        return LJIILLIIL;
    }

    public static final ICompliancePolicyService LJIIIIZZ() {
        ICompliancePolicyService iCompliancePolicyService = LJIJJLI;
        if (iCompliancePolicyService != null) {
            return iCompliancePolicyService;
        }
        ICompliancePolicyService iCompliancePolicyService2 = (ICompliancePolicyService) PluggableExtentionKt.pluggableSpi$default(ICompliancePolicyService.class, false, false, false, 14, null);
        LJIJJLI = iCompliancePolicyService2;
        if (iCompliancePolicyService2 == null) {
            LJIJJLI = new ICompliancePolicyService() { // from class: X.102I
                @Override // com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService
                public final void LIZ(C1913610ztf c1913610ztf, InterfaceC1913620ztg interfaceC1913620ztg) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService
                public final void LIZIZ(String str, C1913610ztf c1913610ztf, InterfaceC1913620ztg interfaceC1913620ztg) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService
                public final String LIZJ(C1913610ztf c1913610ztf) {
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService
                public final void LIZLLL() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService
                public final void LJ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService
                public final void LJFF(C1913610ztf c1913610ztf) {
                }
            };
        }
        return LJIJJLI;
    }

    public static final IPNSConsentConfigService LJIIIZ() {
        return (IPNSConsentConfigService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentConfigService.class, false, false, false, 14, null);
    }

    public static IConsentService LJIIJ() {
        IConsentService iConsentService;
        IConsentService iConsentService2 = LJIIJJI;
        if (iConsentService2 != null) {
            return iConsentService2;
        }
        Object objLIZ = C04TD.LIZ(IConsentService.class, false);
        if (objLIZ != null) {
            iConsentService = (IConsentService) objLIZ;
        } else {
            if (C04TD.LLLLLIL == null) {
                synchronized (IConsentService.class) {
                    if (C04TD.LLLLLIL == null) {
                        C04TD.LLLLLIL = new ConsentServiceImpl();
                    }
                }
            }
            iConsentService = C04TD.LLLLLIL;
        }
        LJIIJJI = iConsentService;
        if (iConsentService == null) {
            LJIIJJI = new IConsentService() { // from class: X.04eh
                @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService
                public final C0CCZ LIZ() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService
                public final C13IQ<? extends UISlotAssem> LIZIZ() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService
                public final void LIZJ(String str) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService
                public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
                    return C13BV.INSTANCE;
                }
            };
        }
        return LJIIJJI;
    }

    public static final IFamilyPairingService LJIIJJI() {
        IFamilyPairingService iFamilyPairingService = LJIILL;
        if (iFamilyPairingService != null) {
            return iFamilyPairingService;
        }
        IFamilyPairingService iFamilyPairingService2 = (IFamilyPairingService) ServiceManager.get().getService(IFamilyPairingService.class);
        LJIILL = iFamilyPairingService2;
        return iFamilyPairingService2;
    }

    public static final IFamilyPairingService LJIIL() {
        IFamilyPairingService iFamilyPairingService = LJIILL;
        if (iFamilyPairingService != null) {
            return iFamilyPairingService;
        }
        IFamilyPairingService iFamilyPairingService2 = (IFamilyPairingService) PluggableExtentionKt.pluggableSpi$default(IFamilyPairingService.class, false, false, false, 14, null);
        LJIILL = iFamilyPairingService2;
        return iFamilyPairingService2;
    }

    public static final IComplianceService LJIILIIL() {
        IComplianceService iComplianceService = LJI;
        if (iComplianceService != null) {
            return iComplianceService;
        }
        IComplianceService iComplianceService2 = (IComplianceService) ServiceManager.get().getService(IComplianceService.class);
        LJI = iComplianceService2;
        if (iComplianceService2 == null) {
            LJI = new IComplianceService() { // from class: X.0TOU
                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final int LIZIZ() {
                    return 0;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJ() {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final void LJFF(JSONObject jSONObject) {
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final void LJI(boolean z) {
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJII() {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJIIIIZZ() {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final void LJIIIZ(String str, String str2, C1917100zzI c1917100zzI, C19EG c19eg) {
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final void LJIIJ(C19EG c19eg, AwemeRawAd awemeRawAd, String str) {
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJIIJJI() {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJIIL() {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final InterfaceC1009590cNZ LJIILIIL() {
                    return null;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJIILJJIL() {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final int LJIILL() {
                    return 0;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final Object LJIILLIIL() {
                    return null;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final void LJIIZILJ(C19EG c19eg, C20656615sK c20656615sK) {
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final void LJIJ() {
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJIJI() {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final String LJIJJ() {
                    return "";
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJIJJLI() {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final Object LJIL(Object obj) {
                    return null;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final Object LJJ() {
                    return null;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final void LJJI(C19EG c19eg, C1917080zzG c1917080zzG) {
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final void LJJIFFI(C19EG c19eg, AwemeRawAd awemeRawAd, String str) {
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final void LJJII(JSONObject jSONObject) {
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJJIIJ() {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJJIIJZLJL() {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJJIIZ(PickYourAdPlanPage pickYourAdPlanPage, int i) {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final String LJJIIZI(Context context) {
                    return "";
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final void LJJIJIIJI(C19EG c19eg, C20656615sK c20656615sK) {
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final void LJJIJIIJIL(Context context, C746210TOx c746210TOx) {
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJJIJIL() {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final void LJJIJL(Context context, String str) {
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final String LJJIJLIJ(Context context) {
                    return "";
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final void LJJIL(Context context, String str) {
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final String LJJIZ() {
                    return "";
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJJJ(Aweme aweme) {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJJJI() {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final void LJJJIL() {
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final void LJJJJ(Context context, Aweme aweme) {
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJJJJI() {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJJJJIZL() {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final C0TPB LJJJJJ() {
                    return null;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJJJJJL() {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final TuxSheet LJJJJLI(C19EG c19eg, Aweme aweme, boolean z, AwS265S0300000_21 awS265S0300000_21, AwS265S0300000_21 awS265S0300000_212) {
                    return null;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJJJJLL() {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final void LJJJJZ(C19EG c19eg, C20656615sK c20656615sK) {
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final boolean LJJJJZI() {
                    return false;
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final View LJJIJ(Context context) {
                    return new View(context);
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final Fragment LJJIII(C1917110zzJ c1917110zzJ, PickYourAdPlanPage pickYourAdPlanPage) {
                    return new Fragment();
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
                public final Fragment LJJJJL(C1917120zzK c1917120zzK, AdFreeTrialPageInfo adFreeTrialPageInfo) {
                    return new Fragment();
                }
            };
        }
        return LJI;
    }

    public static final IPNSDeviceConsentService LJIILJJIL() {
        return (IPNSDeviceConsentService) LJIL.getValue();
    }

    public static final IFundraiserService LJIILL() {
        return (IFundraiserService) LJJ.getValue();
    }

    public static final IComplianceMonitorService LJIIZILJ() {
        IComplianceMonitorService iComplianceMonitorService = LJIIL;
        if (iComplianceMonitorService != null) {
            return iComplianceMonitorService;
        }
        IComplianceMonitorService iComplianceMonitorService2 = (IComplianceMonitorService) ServiceManager.get().getService(IComplianceMonitorService.class);
        LJIIL = iComplianceMonitorService2;
        if (iComplianceMonitorService2 == null) {
            LJIIL = new IComplianceMonitorService() { // from class: X.0X1J
                @Override // com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
                public final void LIZ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
                public final InterfaceControlSettings LIZIZ() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
                public final void LIZJ(C19EG c19eg) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
                public final void LIZLLL(C0X1C c0x1c) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
                public final C11NZ LJ(C11NZ c11nz) {
                    return c11nz;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
                public final void sendEvent(String str, Map<String, String> map) {
                }
            };
        }
        return LJIIL;
    }

    public static final IPnsEdmConsentService LJIJ() {
        Object objLIZ = C04TD.LIZ(IPnsEdmConsentService.class, false);
        if (objLIZ != null) {
            return (IPnsEdmConsentService) objLIZ;
        }
        if (C04TD.LLLLILI == null) {
            synchronized (IPnsEdmConsentService.class) {
                if (C04TD.LLLLILI == null) {
                    C04TD.LLLLILI = new PnsEdmConsentServiceImpl();
                }
            }
        }
        return C04TD.LLLLILI;
    }

    public static final IPolicyNoticeService LJIJI() {
        IPolicyNoticeService iPolicyNoticeService = LJIILIIL;
        if (iPolicyNoticeService != null) {
            return iPolicyNoticeService;
        }
        IPolicyNoticeService iPolicyNoticeService2 = (IPolicyNoticeService) PluggableExtentionKt.pluggableSpi$default(IPolicyNoticeService.class, false, false, false, 14, null);
        LJIILIIL = iPolicyNoticeService2;
        if (iPolicyNoticeService2 == null) {
            LJIILIIL = new IPolicyNoticeService() { // from class: X.0X1m
                @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
                public final C1914170zuZ LIZ() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
                public final void LIZIZ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
                public final Object LIZJ() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
                public final void LIZLLL() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
                public final void LJ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
                public final void LJFF(Context context) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
                public final C0CCZ LJI() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
                public final void LJII(String str, String str2, String str3, String str4, Integer num, Integer num2, Boolean bool, Function0<Unit> function0, Function0<Unit> function02) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
                public final String getBusiness() {
                    return null;
                }
            };
        }
        return LJIILIIL;
    }

    public static final IPrivacyService LJIJJ() {
        IPrivacyService iPrivacyService = LJIJ;
        if (iPrivacyService != null) {
            return iPrivacyService;
        }
        IPrivacyService iPrivacyService2 = (IPrivacyService) PluggableExtentionKt.pluggableSpi$default(IPrivacyService.class, false, false, false, 14, null);
        LJIJ = iPrivacyService2;
        return iPrivacyService2 == null ? new IPrivacyService() { // from class: X.0mFP
            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final void LIZ(Context context, FragmentManager fragmentManager, String str) {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final InterfaceC742660TBg LIZIZ() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final boolean LIZJ() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final void LIZLLL(C19EG c19eg) {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final boolean LJ() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final boolean LJFF() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final C0CCZ LJI() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final boolean LJII() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final PrivacyUserSettingsV2 LJIIIIZZ() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final PrivacySettingsRestrictionItem LJIIIZ(int i, String str) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final boolean LJIIJ() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final boolean LJIIJJI() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final C106C LJIIL(String str) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final void LJIILIIL(String str, ViewGroup viewGroup) {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final void LJIILJJIL() {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final void LJIILL(JSONObject jSONObject) {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final void LJIIZILJ(Context context, LifecycleOwner lifecycleOwner, JSONObject jSONObject) {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final void LJIJ(String str) {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final void LJIJI(Integer num, String str, Map map) {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final void LJIJJ(Context context, String str, Function0<Unit> function0) {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final void LJIJJLI(JSONObject jSONObject) {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final boolean LJIL() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final boolean LJJ() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final void LJJI(String str) {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final boolean LJJIFFI() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final void LJJII(C19EG c19eg) {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final boolean LJJIII() {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final void LJJIIJ(String str) {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final void LJJIIJZLJL(String str) {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final boolean LJJIIZ() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final void LJJIIZI(Aweme aweme, Collection<? extends Comment> collection) {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final PrivacySettingsAgreementRecord LJJIJ(String str) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final boolean LJJIJIIJI() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final void LJJIJIIJIL() {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final void LJJIJIL(List<C1381570m3X> list) {
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
                return C13BV.INSTANCE;
            }

            @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
            public final List LJIILLIIL(Context context, AbsSceneAdaptationScene absSceneAdaptationScene, AbsSceneAdaptationScene absSceneAdaptationScene2) {
                return C13BV.INSTANCE;
            }
        } : iPrivacyService2;
    }

    public static final IPrivateAccountService LJIJJLI() {
        IPrivateAccountService iPrivateAccountService;
        IPrivateAccountService iPrivateAccountService2 = LJIIIIZZ;
        if (iPrivateAccountService2 != null) {
            return iPrivateAccountService2;
        }
        Object objLIZ = C04TD.LIZ(IPrivateAccountService.class, false);
        if (objLIZ != null) {
            iPrivateAccountService = (IPrivateAccountService) objLIZ;
        } else {
            if (C04TD.LLLLLJLJLL == null) {
                synchronized (IPrivateAccountService.class) {
                    if (C04TD.LLLLLJLJLL == null) {
                        C04TD.LLLLLJLJLL = new PrivateAccountServiceImpl();
                    }
                }
            }
            iPrivateAccountService = C04TD.LLLLLJLJLL;
        }
        LJIIIIZZ = iPrivateAccountService;
        if (iPrivateAccountService == null) {
            LJIIIIZZ = new IPrivateAccountService() { // from class: X.102K
                @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
                public final int LIZIZ() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
                public final void LIZJ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
                public final boolean LIZLLL() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
                public final int LJ() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
                public final boolean LJFF() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
                public final void LJI(C19EG c19eg, String str, String str2, Function0 function0, Function0 function02) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
                public final Object LJII() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
                public final void LJIIIIZZ(C19EG c19eg) {
                }
            };
        }
        return LJIIIIZZ;
    }

    public static final IProtectionService LJIL() {
        IProtectionService iProtectionService = LJIILJJIL;
        if (iProtectionService != null) {
            return iProtectionService;
        }
        IProtectionService iProtectionService2 = (IProtectionService) ServiceManager.get().getService(IProtectionService.class);
        LJIILJJIL = iProtectionService2;
        if (iProtectionService2 == null) {
            LJIILJJIL = new IProtectionService() { // from class: X.15YV
                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final ScheduleBreakSettings LIZ() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final boolean LIZIZ() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LIZJ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LIZLLL(int i, int i2) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final boolean LJFF() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJI(int i, int i2) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final boolean LJII() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final int LJIIIIZZ() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final int LJIIIZ() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJIIJ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJIIJJI() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final boolean LJIIL() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final boolean LJIILIIL() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final String LJIILJJIL() {
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJIILL(FeedLynxOverlayConfig feedLynxOverlayConfig) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final List<InterfaceC1051730dTX> LJIILLIIL(C1051660dTQ c1051660dTQ) {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJIIZILJ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJIJ(String str) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJIJI(C19EG c19eg, int i, boolean z, int i2, int i3, List<ScreenTimeManagementDaySetting> list) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJIJJ(boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final int LJIJJLI() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final boolean LJIL() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJJ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final boolean LJJI() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJJIFFI() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final UserDetailsInfoBean LJJII() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJJIII(boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJJIIJ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJJIIJZLJL(SleepHourConfigSettings sleepHourConfigSettings) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJJIIZ(Activity activity) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final int LJJIIZI() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final boolean LJJIJ() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final int LJJIJIIJI() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final boolean LJJIJIIJIL() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final SleepHourConfigSettings LJJIJIL() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJJIJL(C15YK c15yk, String str) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJJIJLIJ(String str) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final boolean LJJIL() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJJIZ(Bundle bundle) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final C13IQ<? extends UISlotAssem> LJJJI() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final int LJJJIL() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJJJJ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJJJJI() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final List<ScreenTimeManagementDaySetting> LJJJJIZL() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJJJJJ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final boolean LJJJJJL(long j) {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJJJJL(SleepHourServerDrivenConfig sleepHourServerDrivenConfig) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final InterfaceC1586340rNo LJJJJLI() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final int LJJJJLL() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJJJJZ(List<String> list) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final boolean LJJJJZI() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final int LJJJLIIL() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final InterfaceC1051730dTX LJJJLL(C1051660dTQ c1051660dTQ, String str) {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final int Ve() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
                public final void LJJJ(Context context, Runnable runnable, String str) {
                    runnable.run();
                }
            };
        }
        return LJIILJJIL;
    }

    public static final IReportService LJJ() {
        IReportService iReportService = LIZJ;
        if (iReportService != null) {
            return iReportService;
        }
        IReportService iReportService2 = (IReportService) ServiceManager.get().getService(IReportService.class);
        LIZJ = iReportService2;
        if (iReportService2 == null) {
            LIZJ = new IReportService() { // from class: X.06oY
                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                public final void LIZ(String str, String str2, String str3, String str4, String str5, String str6) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                @InterfaceC1294060jmO
                public final void LIZIZ(Activity activity, Uri.Builder builder) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                @InterfaceC1294060jmO
                public final void LIZJ(Activity activity, Uri.Builder builder) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                public final String LIZLLL(Aweme aweme) {
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                @InterfaceC1294060jmO
                public final void LJ(Activity activity, Aweme aweme, String str) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                public final void LJFF(Map<String, String> map) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                public final String LJI(String str) {
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                public final void LJII(String str, String str2, String str3, String str4, String str5, String str6, Aweme aweme, String str7, String str8, String str9, Context context, String str10, int i, String str11) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                @InterfaceC1294060jmO
                public final void report(Activity activity, Uri.Builder builder, Bundle bundle) {
                }
            };
        }
        return LIZJ;
    }

    public static final IComplianceSettingsService LJJI() {
        IComplianceSettingsService iComplianceSettingsService = LJIIIZ;
        if (iComplianceSettingsService != null) {
            return iComplianceSettingsService;
        }
        IComplianceSettingsService iComplianceSettingsService2 = (IComplianceSettingsService) ServiceManager.get().getService(IComplianceSettingsService.class);
        LJIIIZ = iComplianceSettingsService2;
        if (iComplianceSettingsService2 == null) {
            LJIIIZ = new IComplianceSettingsService() { // from class: X.102N
                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final String LIZJ() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final String LIZLLL() {
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final String LJ() {
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final boolean LJFF() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final String LJII() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final boolean LJIIIIZZ() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final void LJIIIZ(ComplianceSetting complianceSetting) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final void LJIIJ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final boolean LJIIJJI() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final AdPersonalitySettings LJIIL() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final void LJIILIIL() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final boolean LJIILJJIL() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final void LJIILL(C19260610Wu c19260610Wu) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final ComplianceSetting LJIILLIIL() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final boolean LJIIZILJ() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final void LJIJ(String str, InterfaceC191808102c interfaceC191808102c) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final boolean LJIJI() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final void LJIJJ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final void LJIJJLI(C100F c100f, int i) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final boolean LJIL() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final boolean LJJ() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final void LJJI(boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final void LJJIFFI(String str, C0TON c0ton) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final boolean LJJII() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final boolean LJJIII() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final void LJJIIJ(ComplianceSetting complianceSetting) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final int LJJIIJZLJL() {
                    return 0;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final void LJJIIZI(int i, Integer num, String str, String str2, Map map) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final void LJJIJIIJI(int i) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final boolean LJJIJIIJIL() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final EnumC191814102i LIZ() {
                    return EnumC191814102i.PASS;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final List<PolicyBodyLinkList> LIZIZ() {
                    return C13BV.INSTANCE;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final List<String> LJI() {
                    return C13BV.INSTANCE;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final EnumC1915270zwL LJJIJ() {
                    return EnumC1915270zwL.UNKNOWN;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
                public final SpannableStringBuilder LJJIIZ(Context context, String str, List<PolicyBodyLinkList> list) {
                    return new SpannableStringBuilder("");
                }
            };
        }
        return LJIIIZ;
    }

    public static final IShareWarningInfoService LJJIFFI() {
        IShareWarningInfoService iShareWarningInfoService = LJIJI;
        if (iShareWarningInfoService != null) {
            return iShareWarningInfoService;
        }
        IShareWarningInfoService iShareWarningInfoService2 = (IShareWarningInfoService) PluggableExtentionKt.pluggableSpi$default(IShareWarningInfoService.class, false, false, false, 14, null);
        LJIJI = iShareWarningInfoService2;
        if (iShareWarningInfoService2 == null) {
            LJIJI = new IShareWarningInfoService() { // from class: X.0T5o
                @Override // com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService
                public final void LIZ(Aweme aweme) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService
                public final boolean LIZIZ(Context context, Aweme aweme, Bundle bundle, Function0<Unit> function0) {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService
                public final boolean LIZJ(Context context, Aweme aweme, Bundle bundle, Function0<Unit> function0) {
                    return false;
                }
            };
        }
        return LJIJI;
    }

    public static final ITermsConsentService LJJII() {
        ITermsConsentService iTermsConsentService = LJIIJ;
        if (iTermsConsentService != null) {
            return iTermsConsentService;
        }
        ITermsConsentService iTermsConsentService2 = (ITermsConsentService) PluggableExtentionKt.pluggableSpi$default(ITermsConsentService.class, false, false, false, 14, null);
        LJIIJ = iTermsConsentService2;
        if (iTermsConsentService2 == null) {
            LJIIJ = new ITermsConsentService() { // from class: X.102L
                @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
                public final TermsConsentInfo LIZ() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
                public final TermsConsentInfo LIZIZ() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
                public final boolean LIZJ() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
                public final void LIZLLL(boolean z) {
                }
            };
        }
        return LJIIJ;
    }

    public static final ITpcConsentService LJJIII() {
        ITpcConsentService iTpcConsentService = LJIIZILJ;
        if (iTpcConsentService != null) {
            return iTpcConsentService;
        }
        ITpcConsentService iTpcConsentService2 = (ITpcConsentService) PluggableExtentionKt.pluggableSpi$default(ITpcConsentService.class, false, false, false, 14, null);
        LJIIZILJ = iTpcConsentService2;
        if (iTpcConsentService2 == null) {
            LJIIZILJ = new ITpcConsentService() { // from class: X.102M
                @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
                public final void LIZ(String str) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
                public final void LIZIZ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
                public final boolean LIZJ() {
                    return true;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
                public final void LIZLLL() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
                public final boolean LJ() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
                public final void initialize() {
                }
            };
        }
        return LJIIZILJ;
    }

    public static final PNSSurveyService LJIILLIIL() {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_pns_survey_anr_fix", true)) {
            LIZIZ.getClass();
            return (PNSSurveyService) LJJIFFI.getValue();
        }
        LIZIZ.getClass();
        return (PNSSurveyService) LJJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.constants.audiencecontrol.IComplianceServiceProvider
    public final boolean LIZ() {
        return LJIJJ().LJII();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.constants.audiencecontrol.IComplianceServiceProvider
    public final IReportService LIZIZ() {
        return LJJ();
    }
}
