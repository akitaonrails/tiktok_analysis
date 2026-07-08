package com.bytedance.ies.ugc.aweme.commercialize.compliance.service;

import X.AbstractC848400XPy;
import X.C06MM;
import X.C0C64;
import X.C0RF0;
import X.C0SHX;
import X.C0TA1;
import X.C0TO4;
import X.C0TOD;
import X.C0TOM;
import X.C0TOS;
import X.C0TOV;
import X.C0TOX;
import X.C0TPB;
import X.C0TPE;
import X.C0TPF;
import X.C0TPG;
import X.C0TQ7;
import X.C0XQ7;
import X.C1017070cZd;
import X.C1238130iKB;
import X.C12ES;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1389880mGw;
import X.C1390920mIc;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LP;
import X.C1917080zzG;
import X.C1917100zzI;
import X.C1917110zzJ;
import X.C1917120zzK;
import X.C19259110Wf;
import X.C19EG;
import X.C20515215Pi;
import X.C20656615sK;
import X.C20684815ws;
import X.C207189165r;
import X.C2211631BhB;
import X.C2214201BlK;
import X.C2230608oa;
import X.C2344009Gk;
import X.C256400A3a;
import X.C259800zU;
import X.C690090R5b;
import X.C740860T4i;
import X.C745980TOa;
import X.C746020TOe;
import X.C746040TOg;
import X.C746100TOm;
import X.C746210TOx;
import X.C746350TPl;
import X.C746400TPq;
import X.C786260Usq;
import X.C786410Ut5;
import X.C844470XAv;
import X.C985403tE;
import X.DialogInterfaceOnDismissListenerC786080UsY;
import X.InterfaceC1009590cNZ;
import X.InterfaceC2211711BhJ;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.StaticAdExplainDialog;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.feed.adentry.AdEntryShareSheetFragment;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ProductInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.PersonalizationAdPromptSheet;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.PersonalizationAdPromptSheetExperiment;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.PersonalizationAdPromptSheetExperimentFive;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.FreeTrialPage;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionAdPageActivity;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionPage;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.AdFreeSubscriptionFragment;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.PickYourPlanPageFragment;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.feedcard.TTPlusFeedCardViewHolder;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.model.AboutAdInfo;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo;
import com.ss.android.ugc.aweme.compliance.api.model.PopUpCopyWriting;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS221S0300000_12;
import kotlin.jvm.internal.AwS265S0300000_21;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class ComplianceServiceImpl implements IComplianceService {
    public final String LIZ = "ComplianceServiceImpl";
    public final MutableLiveData<IapProductDetail> LIZIZ = new MutableLiveData<>();

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJ() {
        Boolean boolIsNpUser;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ == null || (boolIsNpUser = adPersonalitySettingsLIZIZ.isNpUser()) == null) {
            return false;
        }
        return boolIsNpUser.booleanValue();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJII() {
        Integer num;
        SubscriptionStatusInfo subscriptionStatusInfo;
        Integer num2;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        AdFreeSubscription adFreeSubscription = adPersonalitySettingsLIZIZ != null ? adPersonalitySettingsLIZIZ.subscription : null;
        if (adFreeSubscription == null) {
            return false;
        }
        Integer num3 = adFreeSubscription.productLine;
        if (num3 == null || num3.intValue() != 1) {
            Integer num4 = adFreeSubscription.subscriptionMode;
            if (num4 != null && num4.intValue() == 0) {
                return false;
            }
        } else {
            Integer num5 = adFreeSubscription.subscriptionMode;
            if (num5 == null || num5.intValue() != 1) {
                return false;
            }
            Integer num6 = adFreeSubscription.subscriptionStatus;
            if ((num6 == null || num6.intValue() != 2) && ((num = adFreeSubscription.subscriptionStatus) == null || num.intValue() != 1 || (subscriptionStatusInfo = adFreeSubscription.subscriptionStatusInfo) == null || (num2 = subscriptionStatusInfo.subscriptionPhase) == null || num2.intValue() != 6)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJIIIIZZ() {
        Integer num;
        Integer num2;
        SubscriptionStatusInfo subscriptionStatusInfo;
        Integer num3;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        AdFreeSubscription adFreeSubscription = adPersonalitySettingsLIZIZ != null ? adPersonalitySettingsLIZIZ.subscription : null;
        return (adFreeSubscription == null || (num = adFreeSubscription.productLine) == null || num.intValue() != 1 || (num2 = adFreeSubscription.subscriptionStatus) == null || num2.intValue() != 1 || (subscriptionStatusInfo = adFreeSubscription.subscriptionStatusInfo) == null || (num3 = subscriptionStatusInfo.subscriptionPhase) == null || num3.intValue() != 6) ? false : true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJIIJJI() {
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ != null) {
            return Intrinsics.LJFF(adPersonalitySettingsLIZIZ.isShowSettings(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJIIL() {
        return ((Boolean) C256400A3a.LIZ.getValue()).booleanValue();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final int LJIILL() {
        C0TOM.LIZ.getClass();
        return C0TOM.LIZ();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final Object LJIILLIIL() {
        return new C0TPG() { // from class: X.0TOf
            @Override // X.C0TRR
            public final int LIZ() {
                return 59;
            }

            @Override // X.C0TRR
            public final int LIZIZ() {
                return 1;
            }

            @Override // X.C0TPG
            public final int LIZLLL() {
                return 1;
            }
        };
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJIJ() {
        Boolean boolIsFollowSystemConfig;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ == null || (boolIsFollowSystemConfig = adPersonalitySettingsLIZIZ.isFollowSystemConfig()) == null || !boolIsFollowSystemConfig.booleanValue()) {
            return;
        }
        C19259110Wf c19259110Wf = C746350TPl.LIZ;
        if (c19259110Wf.LJJI == null) {
            c19259110Wf.LJJI = new C2230608oa<>("opt_out_google_personzalized_ads", Boolean.FALSE);
        }
        if (c19259110Wf.LJJI.LIZ().booleanValue() && C0TOM.LIZ() == 1) {
            C0TOM.LJIIJJI("", false);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJIJI() {
        AdFreeSubscription adFreeSubscription;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ == null || (adFreeSubscription = adPersonalitySettingsLIZIZ.subscription) == null) {
            return false;
        }
        Integer num = adFreeSubscription.productLine;
        return (num == null || num.intValue() != 1) && Intrinsics.LJFF(adFreeSubscription.needPopUpSubscriptionPage, Boolean.TRUE);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final String LJIJJ() {
        String strLJI;
        try {
            SettingsManager.LIZLLL().getClass();
            strLJI = SettingsManager.LJI("ad_report_base_url", "https://inapp.tiktokv.com/falcon/communitysafety/page/reasons_ad/index.html");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return strLJI != null ? strLJI : "https://inapp.tiktokv.com/falcon/communitysafety/page/reasons_ad/index.html";
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJIJJLI() {
        AdFreeSubscription adFreeSubscription;
        Integer num;
        Integer num2;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        return (adPersonalitySettingsLIZIZ == null || (adFreeSubscription = adPersonalitySettingsLIZIZ.subscription) == null || (num = adFreeSubscription.subscriptionMode) == null || num.intValue() != 2 || (num2 = adFreeSubscription.subscriptionStatus) == null || num2.intValue() != 2) ? false : true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final Object LJJ() {
        return new C0TPG() { // from class: X.0TOd
            @Override // X.C0TRR
            public final int LIZ() {
                return 42;
            }

            @Override // X.C0TRR
            public final int LIZIZ() {
                return 0;
            }

            @Override // X.C0TPG
            public final int LIZLLL() {
                return 0;
            }
        };
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJJIIJ() {
        AdFreeSubscription adFreeSubscription;
        Integer num;
        Integer num2;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        return (adPersonalitySettingsLIZIZ == null || (adFreeSubscription = adPersonalitySettingsLIZIZ.subscription) == null || (num = adFreeSubscription.subscriptionMode) == null || num.intValue() != 1 || (num2 = adFreeSubscription.subscriptionStatus) == null || num2.intValue() != 2) ? false : true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJJIJIL() {
        C0TOS.LIZ.getClass();
        return C0TOS.LIZLLL();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJJJI() {
        AdFreeSubscription adFreeSubscription;
        Integer num;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        return (adPersonalitySettingsLIZIZ == null || (adFreeSubscription = adPersonalitySettingsLIZIZ.subscription) == null || (num = adFreeSubscription.productLine) == null || num.intValue() != 1 || !Intrinsics.LJFF(adFreeSubscription.isShowFreeTrialPopUp(), Boolean.TRUE) || adFreeSubscription.adFreeTrialPageInfo == null) ? false : true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJJJIL() {
        SubscriptionStatusInfo subscriptionStatusInfo;
        SubscriptionInfo subscriptionInfo;
        OfferInfo offerInfo;
        C0TOM.LIZ.getClass();
        AdFreeSubscription adFreeSubscriptionLJ = C0TOM.LJ();
        ProductInfo productInfo = (adFreeSubscriptionLJ == null || (subscriptionStatusInfo = adFreeSubscriptionLJ.subscriptionStatusInfo) == null || (subscriptionInfo = subscriptionStatusInfo.subscriptionInfo) == null || (offerInfo = subscriptionInfo.offerInfo) == null) ? null : offerInfo.productInfo;
        C0TOS c0tos = C0TOS.LIZ;
        String str = productInfo != null ? productInfo.merchantId : null;
        MutableLiveData<IapProductDetail> mutableLiveData = this.LIZIZ;
        c0tos.getClass();
        C0TOS.LIZIZ(str, productInfo, mutableLiveData, 1);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJJJJI() {
        AdFreeSubscription adFreeSubscription;
        Integer num;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        return (adPersonalitySettingsLIZIZ == null || (adFreeSubscription = adPersonalitySettingsLIZIZ.subscription) == null || (num = adFreeSubscription.productLine) == null || num.intValue() != 1 || !Intrinsics.LJFF(adFreeSubscription.needPopUpSubscriptionPage, Boolean.TRUE)) ? false : true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJJJJIZL() {
        AdFreeSubscription adFreeSubscription;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ == null || (adFreeSubscription = adPersonalitySettingsLIZIZ.subscription) == null) {
            return false;
        }
        Integer num = adFreeSubscription.productLine;
        if (num != null && num.intValue() == 1) {
            return false;
        }
        if (Intrinsics.LJFF(adFreeSubscription.isShowFreeTrialPopUp(), Boolean.TRUE)) {
            if (adFreeSubscription.adFreeTrialPageInfo == null) {
            }
            return true;
        }
        if (adFreeSubscription == null) {
            return false;
        }
        if (!Intrinsics.LJFF(adFreeSubscription.isShowStandardScheduledPopUp(), Boolean.TRUE)) {
            if (adFreeSubscription == null) {
                return false;
            }
            if (!Intrinsics.LJFF(adFreeSubscription.needPopUpOnHoldExpirePrompt, Boolean.TRUE)) {
                if (adFreeSubscription == null) {
                    return false;
                }
                if (adFreeSubscription.testEndPromptPayload == null) {
                    if (adFreeSubscription == null) {
                        return false;
                    }
                    if (adFreeSubscription.tiktokPlusOnHoldPromptPayload == null && (adFreeSubscription == null || !Intrinsics.LJFF(adFreeSubscription.needPopUpIntroPages, Boolean.TRUE))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJJJJJL() {
        AdFreeSubscription adFreeSubscription;
        Integer num;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        return (adPersonalitySettingsLIZIZ == null || (adFreeSubscription = adPersonalitySettingsLIZIZ.subscription) == null || (num = adFreeSubscription.productLine) == null || num.intValue() != 1 || adFreeSubscription.tiktokPlusOnHoldPromptPayload == null) ? false : true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJJJJLL() {
        AdFreeSubscription adFreeSubscription;
        Integer num;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        return (adPersonalitySettingsLIZIZ == null || (adFreeSubscription = adPersonalitySettingsLIZIZ.subscription) == null || (num = adFreeSubscription.productLine) == null || num.intValue() != 1 || !Intrinsics.LJFF(adFreeSubscription.isShowStandardScheduledPopUp(), Boolean.TRUE)) ? false : true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJJJJZI() {
        C844470XAv.LIZ.getClass();
        return !TextUtils.equals(C844470XAv.LJIILL, "amazon_int");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final int LIZIZ() {
        if (LJJIIJ()) {
            return 1;
        }
        return LJIJJLI() ? 2 : 0;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final InterfaceC1009590cNZ LJIILIIL() {
        AdFreeSubscription adFreeSubscription;
        Integer num;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return null;
        }
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ == null || (adFreeSubscription = adPersonalitySettingsLIZIZ.subscription) == null || (((num = adFreeSubscription.subscriptionMode) != null && num.intValue() == 0) || adFreeSubscription.feedCardConfig == null)) {
            return null;
        }
        C0TOS.LIZ.getClass();
        if (!C0TOS.LJ() && C746020TOe.LIZ().LIZIZ().getBoolean(C0TPF.LIZ("enable_ad_record"), true)) {
            return C0TPE.LIZ;
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJJIIJZLJL() {
        CommerceUserInfo commerceUserInfo;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (!(adPersonalitySettingsLIZIZ != null ? Intrinsics.LJFF(adPersonalitySettingsLIZIZ.isShowSettings(), Boolean.TRUE) : false)) {
            if (curUser == null) {
                return false;
            }
            CommerceUserInfo commerceUserInfo2 = curUser.getCommerceUserInfo();
            if ((commerceUserInfo2 == null || !commerceUserInfo2.isHasAdFeedbackEntry()) && ((commerceUserInfo = curUser.getCommerceUserInfo()) == null || !commerceUserInfo.isHasAdExperienceEntry())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final String LJJIZ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJI("commercial_content_library_url", "");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJIILJJIL() {
        return C746040TOg.LIZ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final C0TPB LJJJJJ() {
        return C0TOD.LIZ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJFF(JSONObject jSONObject) {
        AdFreeSubscriptionFragment adFreeSubscriptionFragment;
        C19EG activity;
        SubscriptionAdPageActivity subscriptionAdPageActivity;
        AdFreeSubscriptionFragment adFreeSubscriptionFragment2;
        C20515215Pi c20515215Pi;
        SubscriptionAdPageActivity subscriptionAdPageActivity2;
        C20515215Pi c20515215Pi2;
        AdFreeSubscriptionFragment adFreeSubscriptionFragment3;
        SubscriptionAdPageActivity subscriptionAdPageActivity3;
        C0TOS.LIZ.getClass();
        String strOptString = jSONObject.optString("surveyID");
        if (Intrinsics.LJFF(strOptString, "7348393326598504450") || Intrinsics.LJFF(strOptString, "7611121816473042960")) {
            WeakReference<SubscriptionAdPageActivity> weakReference = C0TOS.LIZJ;
            if (weakReference != null && (subscriptionAdPageActivity3 = weakReference.get()) != null) {
                C1389880mGw c1389880mGw = new C1389880mGw(subscriptionAdPageActivity3);
                c1389880mGw.LJ(R.raw.icon_tick);
                c1389880mGw.LJI(R.attr.a1h);
                c1389880mGw.LJIIIIZZ(2131821669);
                c1389880mGw.LJIIJ();
            }
            WeakReference<AdFreeSubscriptionFragment> weakReference2 = C0TOS.LIZLLL;
            if (weakReference2 != null && (adFreeSubscriptionFragment3 = weakReference2.get()) != null) {
                C1389880mGw c1389880mGw2 = new C1389880mGw(adFreeSubscriptionFragment3);
                c1389880mGw2.LJ(R.raw.icon_tick);
                c1389880mGw2.LJI(R.attr.a1h);
                c1389880mGw2.LJIIIIZZ(2131821669);
                c1389880mGw2.LJIIJ();
            }
            WeakReference<SubscriptionAdPageActivity> weakReference3 = C0TOS.LIZJ;
            if (weakReference3 != null && (subscriptionAdPageActivity2 = weakReference3.get()) != null && (c20515215Pi2 = subscriptionAdPageActivity2.LLJZ) != null) {
                c20515215Pi2.LIZIZ();
            }
            WeakReference<AdFreeSubscriptionFragment> weakReference4 = C0TOS.LIZLLL;
            if (weakReference4 != null && (adFreeSubscriptionFragment2 = weakReference4.get()) != null && (c20515215Pi = adFreeSubscriptionFragment2.LLJJIJIIJIL) != null) {
                c20515215Pi.LIZIZ();
            }
            WeakReference<SubscriptionAdPageActivity> weakReference5 = C0TOS.LIZJ;
            if (weakReference5 != null && (subscriptionAdPageActivity = weakReference5.get()) != null) {
                C0TQ7.LIZ(subscriptionAdPageActivity).yQ2(4, 3);
            }
            WeakReference<AdFreeSubscriptionFragment> weakReference6 = C0TOS.LIZLLL;
            if (weakReference6 != null && (adFreeSubscriptionFragment = weakReference6.get()) != null && (activity = adFreeSubscriptionFragment.getActivity()) != null) {
                C0TQ7.LIZ(activity).yQ2(4, 3);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJI(boolean z) {
        Activity activityLJFF;
        C19EG c19egLIZIZ;
        C746040TOg.LIZ = z;
        if (!z) {
            C690090R5b.LIZ.getClass();
            if (!C690090R5b.LIZ() && (activityLJFF = C2214201BlK.LJFF()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLJFF)) != null) {
                ComplianceServiceProvider.LJIIZILJ().LIZJ(c19egLIZIZ);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final Object LJIL(Object obj) {
        if (!(obj instanceof C0RF0) || obj == null) {
            return null;
        }
        return new TTPlusFeedCardViewHolder((C0RF0) obj);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJJII(JSONObject jSONObject) {
        AdFreeSubscriptionFragment adFreeSubscriptionFragment;
        C19EG activity;
        AdFreeSubscriptionFragment adFreeSubscriptionFragment2;
        SubscriptionAdPageActivity subscriptionAdPageActivity;
        int i;
        SubscriptionAdPageActivity subscriptionAdPageActivity2;
        C0TOS.LIZ.getClass();
        String strOptString = jSONObject.optString("surveyID");
        if (Intrinsics.LJFF(strOptString, "7348393326598504450") || Intrinsics.LJFF(strOptString, "7611121816473042960")) {
            WeakReference<SubscriptionAdPageActivity> weakReference = C0TOS.LIZJ;
            int i2 = 4;
            if (weakReference != null && (subscriptionAdPageActivity = weakReference.get()) != null) {
                SubscriptionVM subscriptionVMLIZ = C0TQ7.LIZ(subscriptionAdPageActivity);
                WeakReference<SubscriptionAdPageActivity> weakReference2 = C0TOS.LIZJ;
                if (weakReference2 != null && (subscriptionAdPageActivity2 = weakReference2.get()) != null) {
                    i = subscriptionAdPageActivity2.LLJZIJLIL;
                } else {
                    i = 4;
                }
                subscriptionVMLIZ.yQ2(i, 2);
            }
            WeakReference<AdFreeSubscriptionFragment> weakReference3 = C0TOS.LIZLLL;
            if (weakReference3 != null && (adFreeSubscriptionFragment = weakReference3.get()) != null && (activity = adFreeSubscriptionFragment.getActivity()) != null) {
                SubscriptionVM subscriptionVMLIZ2 = C0TQ7.LIZ(activity);
                WeakReference<AdFreeSubscriptionFragment> weakReference4 = C0TOS.LIZLLL;
                if (weakReference4 != null && (adFreeSubscriptionFragment2 = weakReference4.get()) != null) {
                    i2 = adFreeSubscriptionFragment2.LLJJIJIL;
                }
                subscriptionVMLIZ2.yQ2(i2, 2);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final String LJJIIZI(Context context) {
        AdFreeSubscription adFreeSubscription;
        SubscriptionStatusInfo subscriptionStatusInfo;
        Integer num;
        Integer num2;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ != null) {
            adFreeSubscription = adPersonalitySettingsLIZIZ.subscription;
        } else {
            adFreeSubscription = null;
        }
        if (adFreeSubscription != null && (num2 = adFreeSubscription.productLine) != null && num2.intValue() == 1) {
            return context.getString(2131847653);
        }
        if (!LJJIIJ() && !LJIJJLI()) {
            if (adFreeSubscription != null && (subscriptionStatusInfo = adFreeSubscription.subscriptionStatusInfo) != null && (num = subscriptionStatusInfo.subscriptionPhase) != null && num.intValue() == 6) {
                return context.getString(2131847655);
            }
            return context.getString(2131847652);
        }
        return context.getString(2131822634);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final View LJJIJ(Context context) {
        return new C207189165r(context, null, 0);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final String LJJIJLIJ(Context context) {
        AdFreeSubscription adFreeSubscription;
        Integer num;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ != null) {
            adFreeSubscription = adPersonalitySettingsLIZIZ.subscription;
        } else {
            adFreeSubscription = null;
        }
        if (LJJJJZI() && adFreeSubscription != null && ((num = adFreeSubscription.subscriptionMode) == null || num.intValue() != 0)) {
            return context.getString(2131847651);
        }
        return context.getString(2131836902);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJJJ(Aweme aweme) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ads_transparency_center_enable", true, false) && !((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJIIIZ(aweme)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0424  */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(X.C19EG r17, X.C20656615sK r18) {
        /*
            Method dump skipped, instruction units count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.service.ComplianceServiceImpl.LJIIZILJ(X.19EG, X.15sK):void");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJJI(C19EG c19eg, C1917080zzG c1917080zzG) {
        AdFreeSubscription adFreeSubscription;
        Boolean boolIsContinuePay;
        int i;
        FragmentManager supportFragmentManager;
        TuxSheet tuxSheet;
        PickYourAdPlanPage pickYourAdPlanPage;
        Integer num;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ != null) {
            adFreeSubscription = adPersonalitySettingsLIZIZ.subscription;
        } else {
            adFreeSubscription = null;
        }
        if (adFreeSubscription != null && (num = adFreeSubscription.productLine) != null && num.intValue() == 1) {
            return;
        }
        AdFreeSubscription adFreeSubscriptionLJ = C0TOM.LJ();
        if (adFreeSubscriptionLJ != null && (pickYourAdPlanPage = adFreeSubscriptionLJ.pickYourAdPlanPage) != null) {
            boolIsContinuePay = pickYourAdPlanPage.isContinuePay();
        } else {
            boolIsContinuePay = null;
        }
        if (Intrinsics.LJFF(boolIsContinuePay, Boolean.TRUE)) {
            try {
                i = CastIntegerProtector.parseInt(AdFreeSubscriptionSettingsSettings.LIZ().paymentPopUpBlockPeriod);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                i = 600;
            }
            if (System.currentTimeMillis() - C745980TOa.LIZ.getLong("ad_free_subscription_submission_timestamp", 0L) < i * LSPassThroughRecordSizeConfig.DEFAULT) {
                return;
            }
        }
        SubscriptionPage subscriptionPageLIZ = C0TO4.LIZ(2, c1917080zzG, null);
        subscriptionPageLIZ.LLILLJJLI = c19eg;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJI = subscriptionPageLIZ;
        tuxSheet2.LLJJIJIIJIL = false;
        tuxSheet2.LLJLILLLLZIIL = false;
        tuxSheet2.LLILLL = false;
        tuxSheet2.LLJLLIL = false;
        c1390920mIc.LJIIIIZZ(1);
        C0TOS.LIZ.getClass();
        int iLJIIIIZZ = (int) (0.8d * ((double) C12ES.LJIIIIZZ(C06MM.LIZ(c19eg))));
        TuxSheet tuxSheet3 = c1390920mIc.LIZ;
        tuxSheet3.LLJJL = iLJIIIIZZ;
        tuxSheet3.LLJLL = true;
        tuxSheet3.LLJLLL = false;
        SubscriptionPage.LLJJJIL = tuxSheet3;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19eg);
        if (c19egLIZIZ == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null || (tuxSheet = SubscriptionPage.LLJJJIL) == null) {
            return;
        }
        tuxSheet.show(supportFragmentManager, "SubscriptionPage");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final Fragment LJJIII(C1917110zzJ c1917110zzJ, PickYourAdPlanPage pickYourAdPlanPage) {
        return C0TO4.LIZ(1, c1917110zzJ, pickYourAdPlanPage);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final boolean LJJIIZ(PickYourAdPlanPage pickYourAdPlanPage, int i) {
        AdFreeSubscription adFreeSubscription;
        PickYourAdPlanPage pickYourAdPlanPage2;
        List<OfferInfo> offerInfo;
        PickYourAdPlanPage pickYourAdPlanPage3;
        List<OfferInfo> offerInfo2;
        List<OfferInfo> offerInfo3;
        List<OfferInfo> offerInfo4;
        if (i == 1) {
            if (pickYourAdPlanPage == null || (offerInfo3 = pickYourAdPlanPage.getOfferInfo()) == null || C13LP.LJJJLZIJ(0, offerInfo3) == null || (offerInfo4 = pickYourAdPlanPage.getOfferInfo()) == null || C13LP.LJJJLZIJ(1, offerInfo4) == null) {
                return false;
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ == null || (adFreeSubscription = adPersonalitySettingsLIZIZ.subscription) == null || (pickYourAdPlanPage2 = adFreeSubscription.pickYourAdPlanPage) == null || (offerInfo = pickYourAdPlanPage2.getOfferInfo()) == null || C13LP.LJJJLZIJ(0, offerInfo) == null || (pickYourAdPlanPage3 = adFreeSubscription.pickYourAdPlanPage) == null || (offerInfo2 = pickYourAdPlanPage3.getOfferInfo()) == null || C13LP.LJJJLZIJ(1, offerInfo2) == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJJIJIIJI(C19EG c19eg, final C20656615sK c20656615sK) {
        AdFreeSubscription adFreeSubscription;
        Integer num;
        final boolean zLJFF;
        FragmentManager supportFragmentManager;
        PickYourAdPlanPage pickYourAdPlanPage;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ != null && (adFreeSubscription = adPersonalitySettingsLIZIZ.subscription) != null && (num = adFreeSubscription.productLine) != null && num.intValue() == 1) {
            final PickYourPlanPageFragment pickYourPlanPageFragment = new PickYourPlanPageFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("enter_from", 0);
            pickYourPlanPageFragment.setArguments(bundle);
            AdFreeSubscription adFreeSubscriptionLJ = C0TOM.LJ();
            if (adFreeSubscriptionLJ != null && (pickYourAdPlanPage = adFreeSubscriptionLJ.pickYourAdPlanPage) != null) {
                zLJFF = Intrinsics.LJFF(pickYourAdPlanPage.isSkippable(), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = pickYourPlanPageFragment;
            tuxSheet.LLJJIJIIJIL = true;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJLILLLLZIIL = false;
            tuxSheet2.LLILLL = false;
            tuxSheet2.LLJLLIL = zLJFF;
            tuxSheet2.LLJLLL = zLJFF;
            tuxSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0TNy
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Integer preTickingSelection;
                    if (zLJFF && pickYourPlanPageFragment.LLJJJJJIL) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        int iIntValue = 0;
                        c2344009Gk.LIZJ(0, "enter_from");
                        c2344009Gk.LIZJ(2, "click_value");
                        c2344009Gk.LIZLLL(System.currentTimeMillis() - pickYourPlanPageFragment.LLJJJ, "stay_time");
                        c2344009Gk.LJ(Boolean.TRUE, "is_skippable");
                        PickYourAdPlanPage pickYourAdPlanPage2 = pickYourPlanPageFragment.LLJ;
                        if (pickYourAdPlanPage2 != null && (preTickingSelection = pickYourAdPlanPage2.getPreTickingSelection()) != null) {
                            iIntValue = preTickingSelection.intValue();
                        }
                        c2344009Gk.LIZJ(iIntValue, "design_type");
                        c2344009Gk.LIZJ(pickYourPlanPageFragment.LLIZLLLIL, "prompt_type");
                        C20684815ws.LJIILLIIL("exit_ttadfree_pickplan", c2344009Gk.LIZ);
                    }
                    C20656615sK c20656615sK2 = c20656615sK;
                    if (c20656615sK2 != null) {
                        c20656615sK2.LIZ();
                    }
                }
            };
            pickYourPlanPageFragment.LLJJLIIIJLLLLLLLZ = tuxSheet2;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19eg);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                tuxSheet2.show(supportFragmentManager, "NotificationPromptManager");
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJJIJIIJIL(Context context, C746210TOx c746210TOx) {
        C0TOV.LIZ.getClass();
        C0TOV.LIZ(context, c746210TOx);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001e  */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJL(android.content.Context r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.service.ComplianceServiceImpl.LJJIJL(android.content.Context, java.lang.String):void");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJJIL(Context context, String str) {
        String str2;
        if (context == null) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//privacy/setting/ad_personalization");
        smartRouteBuildRoute.withParam("enter_from", "privacy_and_safety_settings");
        smartRouteBuildRoute.open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "privacy_and_safety_settings");
        C20684815ws.LJIILLIIL("enter_personalize_data", c2344009Gk.LIZ);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", "settings");
        C20684815ws.LJIILLIIL("enter_personalize_data", c2344009Gk2.LIZ);
        C0TOM.LIZ.getClass();
        if (!C0TOM.LJIIIIZZ() ? C0TOM.LIZJ() == 0 : C0TOM.LIZ() == 0) {
            str2 = "off";
        } else {
            str2 = "on";
        }
        C2344009Gk c2344009Gk3 = new C2344009Gk();
        c2344009Gk3.LJIIIIZZ("initial_status", str2);
        C20684815ws.LJIILLIIL("show_personalization_status", c2344009Gk3.LIZ);
        C2344009Gk c2344009Gk4 = new C2344009Gk();
        if (str == null) {
            str = "settings";
        }
        c2344009Gk4.LJIIIIZZ("refer", str);
        c2344009Gk4.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid());
        C20684815ws.LJIILLIIL("click_settings_ads", c2344009Gk4.LIZ);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJJJJ(Context context, Aweme aweme) {
        SubscriptionInfo subscriptionInfo;
        SubscriptionVM subscriptionVMLIZ;
        String str;
        C19EG c19egLIZIZ;
        SubscriptionStatusInfo subscriptionStatusInfo;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(2, "entry_type");
        c2344009Gk.LIZJ(0, "click_value");
        C20684815ws.LJIILLIIL("ttplus_entry_click", c2344009Gk.LIZ);
        LJJJIL();
        C0TOM.LIZ.getClass();
        AdFreeSubscription adFreeSubscriptionLJ = C0TOM.LJ();
        String str2 = null;
        if (adFreeSubscriptionLJ != null && (subscriptionStatusInfo = adFreeSubscriptionLJ.subscriptionStatusInfo) != null) {
            subscriptionInfo = subscriptionStatusInfo.subscriptionInfo;
        } else {
            subscriptionInfo = null;
        }
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            subscriptionVMLIZ = C0TQ7.LIZ(c19egLIZIZ);
        } else {
            subscriptionVMLIZ = null;
        }
        C0TOS c0tos = C0TOS.LIZ;
        IapProductDetail value = this.LIZIZ.getValue();
        if (subscriptionInfo != null) {
            str = subscriptionInfo.learnMoreUrl;
            str2 = subscriptionInfo.midPageInfo;
        } else {
            str = null;
        }
        C0TOS.LJIIIIZZ(c0tos, context, value, subscriptionVMLIZ, null, aweme, str, str2, 2, 8);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final Fragment LJJJJL(C1917120zzK c1917120zzK, AdFreeTrialPageInfo adFreeTrialPageInfo) {
        FreeTrialPage freeTrialPage = new FreeTrialPage();
        FreeTrialPage.LLJILJILJ = c1917120zzK;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "page_data", adFreeTrialPageInfo);
        bundle.putInt("enter_from", 1);
        freeTrialPage.setArguments(bundle);
        return freeTrialPage;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [T, X.0T4i, X.1BhJ] */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJJJJZ(C19EG c19eg, C20656615sK c20656615sK) {
        boolean z;
        CopyWritingInfo copyWritingInfo;
        CopyWritingInfo copyWritingInfo2;
        Integer num;
        Integer num2;
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        FragmentManager supportFragmentManager3;
        PopUpCopyWriting popUpCopyWriting;
        Integer num3;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ != null && (num3 = adPersonalitySettingsLIZIZ.popUpStyle) != null && num3.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str = CardStruct.IStatusCode.DEFAULT;
        TuxSheet tuxSheet = null;
        if (!z) {
            AdPersonalitySettings adPersonalitySettingsLIZIZ2 = C0TOM.LIZIZ();
            if (adPersonalitySettingsLIZIZ2 != null) {
                num2 = adPersonalitySettingsLIZIZ2.popUpStyle;
                if (num2 != null && (num2.intValue() == 1 || num2.intValue() == 2 || num2.intValue() == 3)) {
                    C0TOV.LIZ.getClass();
                    AdPersonalitySettings adPersonalitySettingsLIZIZ3 = C0TOM.LIZIZ();
                    if (adPersonalitySettingsLIZIZ3 != null && (popUpCopyWriting = adPersonalitySettingsLIZIZ3.abCopyWriting) != null) {
                        C746100TOm c746100TOm = C746100TOm.LIZ;
                        String description = popUpCopyWriting.getDescription();
                        List<String> policyList = popUpCopyWriting.getPolicyList();
                        List<String> policyLinkList = popUpCopyWriting.getPolicyLinkList();
                        c746100TOm.getClass();
                        SpannableStringBuilder spannableStringBuilderLIZ = C746100TOm.LIZ(c19eg, description, policyList, policyLinkList);
                        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
                        c1397580mTM.LJI(popUpCopyWriting.getTitle());
                        c1397580mTM.LIZIZ(spannableStringBuilderLIZ);
                        c1397580mTM.LJII = false;
                        C985403tE.LIZ(c1397580mTM, new AwS378S0200000_12(popUpCopyWriting, c20656615sK, 73));
                        C0TOV.LIZIZ = System.currentTimeMillis();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        if (C0TOM.LJI() != 1) {
                            str = "1";
                        }
                        c2344009Gk.LJIIIIZZ("age_status", str);
                        C20684815ws.LJIILLIIL("display_equally_balanced_pa_prompt", c2344009Gk.LIZ);
                        new C1397510mTF(c1397580mTM).LJ();
                        return;
                    }
                    return;
                }
            } else {
                num2 = null;
            }
            if (num2 != null) {
                if (num2.intValue() != 4 && num2.intValue() != 5 && num2.intValue() != 6 && num2.intValue() != 7) {
                    if (num2.intValue() != 9 && num2.intValue() != 10 && num2.intValue() != 11 && num2.intValue() != 12) {
                        if (num2.intValue() == 8 || num2.intValue() == 13 || num2.intValue() == 14 || num2.intValue() == 15 || num2.intValue() == 16 || num2.intValue() == 17) {
                            PersonalizationAdPromptSheetExperiment personalizationAdPromptSheetExperiment = new PersonalizationAdPromptSheetExperiment();
                            personalizationAdPromptSheetExperiment.LLJJIJI = c19eg;
                            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                            tuxSheet2.LLJJIJI = personalizationAdPromptSheetExperiment;
                            tuxSheet2.LLJJIJIIJIL = true;
                            tuxSheet2.LLILLJJLI = new DialogInterfaceOnDismissListenerC786080UsY(c20656615sK, 12);
                            c1390920mIc.LJIIIIZZ(1);
                            TuxSheet tuxSheet3 = c1390920mIc.LIZ;
                            tuxSheet3.LLJLILLLLZIIL = true;
                            tuxSheet3.LLILLL = false;
                            tuxSheet3.LLJLLIL = false;
                            tuxSheet3.LLJLLL = false;
                            PersonalizationAdPromptSheetExperiment.LLJJIJIL = tuxSheet3;
                            C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19eg);
                            if (c19egLIZIZ != null && (supportFragmentManager3 = c19egLIZIZ.getSupportFragmentManager()) != null) {
                                TuxSheet tuxSheet4 = PersonalizationAdPromptSheetExperiment.LLJJIJIL;
                                if (tuxSheet4 != null) {
                                    tuxSheet = tuxSheet4;
                                }
                                tuxSheet.show(supportFragmentManager3, "PersonalizationAdPromptSheet");
                                return;
                            }
                            return;
                        }
                    } else {
                        PersonalizationAdPromptSheetExperimentFive personalizationAdPromptSheetExperimentFive = new PersonalizationAdPromptSheetExperimentFive();
                        personalizationAdPromptSheetExperimentFive.LLJILLL = c19eg;
                        C1390920mIc c1390920mIc2 = new C1390920mIc(false, 0);
                        TuxSheet tuxSheet5 = c1390920mIc2.LIZ;
                        tuxSheet5.LLJJIJI = personalizationAdPromptSheetExperimentFive;
                        tuxSheet5.LLJJIJIIJIL = true;
                        tuxSheet5.LLILLJJLI = new DialogInterfaceOnDismissListenerC786080UsY(c20656615sK, 13);
                        c1390920mIc2.LJIIIIZZ(1);
                        int iLJIIIIZZ = C12ES.LJIIIIZZ(C06MM.LIZ(c19eg));
                        TuxSheet tuxSheet6 = c1390920mIc2.LIZ;
                        tuxSheet6.LLJJL = iLJIIIIZZ;
                        tuxSheet6.LLJLILLLLZIIL = true;
                        tuxSheet6.LLILLL = false;
                        tuxSheet6.LLJLLIL = false;
                        tuxSheet6.LLJLLL = false;
                        PersonalizationAdPromptSheetExperimentFive.LLJJI = tuxSheet6;
                        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(c19eg);
                        if (c19egLIZIZ2 != null && (supportFragmentManager2 = c19egLIZIZ2.getSupportFragmentManager()) != null) {
                            TuxSheet tuxSheet7 = PersonalizationAdPromptSheetExperimentFive.LLJJI;
                            if (tuxSheet7 != null) {
                                tuxSheet = tuxSheet7;
                            }
                            tuxSheet.show(supportFragmentManager2, "PersonalizationAdPromptSheet");
                            return;
                        }
                        return;
                    }
                } else {
                    PersonalizationAdPromptSheet personalizationAdPromptSheet = new PersonalizationAdPromptSheet();
                    personalizationAdPromptSheet.LLJILJILJ = c19eg;
                    C1390920mIc c1390920mIc3 = new C1390920mIc(false, 0);
                    TuxSheet tuxSheet8 = c1390920mIc3.LIZ;
                    tuxSheet8.LLJJIJI = personalizationAdPromptSheet;
                    tuxSheet8.LLJJIJIIJIL = true;
                    tuxSheet8.LLILLJJLI = new DialogInterfaceOnDismissListenerC786080UsY(c20656615sK, 11);
                    c1390920mIc3.LJIIIIZZ(1);
                    TuxSheet tuxSheet9 = c1390920mIc3.LIZ;
                    tuxSheet9.LLJLILLLLZIIL = true;
                    tuxSheet9.LLILLL = false;
                    tuxSheet9.LLJLLIL = false;
                    tuxSheet9.LLJLLL = false;
                    PersonalizationAdPromptSheet.LLJJI = tuxSheet9;
                    C19EG c19egLIZIZ3 = C1388190mED.LIZIZ(c19eg);
                    if (c19egLIZIZ3 != null && (supportFragmentManager = c19egLIZIZ3.getSupportFragmentManager()) != null) {
                        TuxSheet tuxSheet10 = PersonalizationAdPromptSheet.LLJJI;
                        if (tuxSheet10 != null) {
                            tuxSheet = tuxSheet10;
                        }
                        tuxSheet.show(supportFragmentManager, "PersonalizationAdPromptSheet");
                        return;
                    }
                    return;
                }
            }
        }
        if (C0TOM.LJIIIIZZ() && !C0TOM.LJIIIZ()) {
            C0TOV.LIZ.getClass();
            AdPersonalitySettings adPersonalitySettingsLIZIZ4 = C0TOM.LIZIZ();
            if (adPersonalitySettingsLIZIZ4 != null && (copyWritingInfo2 = adPersonalitySettingsLIZIZ4.copyWriting) != null) {
                C746100TOm.LIZ.getClass();
                SpannableStringBuilder spannableStringBuilderLIZJ = C746100TOm.LIZJ(c19eg, copyWritingInfo2, null);
                C1397580mTM c1397580mTM2 = new C1397580mTM(c19eg);
                String str2 = copyWritingInfo2.title;
                if (str2 == null) {
                    str2 = "";
                }
                c1397580mTM2.LJI(str2);
                c1397580mTM2.LIZIZ(spannableStringBuilderLIZJ);
                c1397580mTM2.LJII = false;
                C1238130iKB.LIZ(c1397580mTM2, new AwS221S0300000_12(c19eg, c20656615sK, copyWritingInfo2, 20));
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("enter_from", "homepage_hot");
                C20684815ws.LJIILLIIL("ads_notify_show", c2344009Gk2.LIZ);
                AdPersonalitySettings adPersonalitySettingsLIZIZ5 = C0TOM.LIZIZ();
                if (adPersonalitySettingsLIZIZ5 != null && (num = adPersonalitySettingsLIZIZ5.promptStyle) != null && num.intValue() == 1) {
                    C20684815ws.LJIILLIIL("revised_PA_old_prompt_EU_show", new C2344009Gk().LIZ);
                }
                C259800zU c259800zU = new C259800zU();
                c1397580mTM2.LIZLLL(new AwS591S0100000_12(c259800zU, (C259800zU<C740860T4i>) 912));
                C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM2);
                ?? r0 = new InterfaceC2211711BhJ(c1397510mTF) { // from class: X.0T4i
                    public final C1397510mTF LL;

                    @Override // X.InterfaceC2211711BhJ
                    public final boolean RO() {
                        return true;
                    }

                    @Override // X.InterfaceC2211711BhJ, X.InterfaceC1740760vOs
                    public String getBtmPageCode() {
                        return "b2111";
                    }

                    @Override // X.InterfaceC1740760vOs
                    public final Map<String, String> r9() {
                        return null;
                    }

                    @Override // X.InterfaceC2211711BhJ, X.InterfaceC1740760vOs
                    public final String w3() {
                        return C739940T0u.LIZ(this);
                    }

                    @Override // X.InterfaceC2211711BhJ
                    public final Object LLFZ() {
                        return this.LL;
                    }

                    {
                        this.LL = c1397510mTF;
                    }
                };
                c259800zU.element = r0;
                C2211631BhB.LJIILJJIL(r0);
                c1397510mTF.LJ();
                return;
            }
            return;
        }
        C0TOV.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ6 = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ6 != null && (copyWritingInfo = adPersonalitySettingsLIZIZ6.copyWriting) != null) {
            C746100TOm.LIZ.getClass();
            SpannableStringBuilder spannableStringBuilderLIZJ2 = C746100TOm.LIZJ(c19eg, copyWritingInfo, null);
            C1397580mTM c1397580mTM3 = new C1397580mTM(c19eg);
            c1397580mTM3.LJI(copyWritingInfo.title);
            c1397580mTM3.LIZIZ(spannableStringBuilderLIZJ2);
            c1397580mTM3.LJII = false;
            C985403tE.LIZ(c1397580mTM3, new AwS221S0300000_12(c19eg, c20656615sK, copyWritingInfo, 21));
            C0TOV.LIZIZ = System.currentTimeMillis();
            C2344009Gk c2344009Gk3 = new C2344009Gk();
            if (C0TOM.LJI() != 1) {
                str = "1";
            }
            c2344009Gk3.LJIIIIZZ("age_status", str);
            C20684815ws.LJIILLIIL("display_equally_balanced_pa_prompt", c2344009Gk3.LIZ);
            new C1397510mTF(c1397580mTM3).LJ();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJIIJ(C19EG c19eg, AwemeRawAd awemeRawAd, String str) {
        StaticAdExplainDialog staticAdExplainDialog = new StaticAdExplainDialog();
        staticAdExplainDialog.LLILLL = awemeRawAd;
        staticAdExplainDialog.LLILZ = str;
        staticAdExplainDialog.LLILZIL = c19eg;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = staticAdExplainDialog;
        tuxSheet.LLJJIJIIJIL = false;
        c1390920mIc.LJIIIIZZ(1);
        int iLJIIIIZZ = (int) (((double) C12ES.LJIIIIZZ(C06MM.LIZ(c19eg))) * 0.73d);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJL = iLJIIIIZZ;
        tuxSheet2.LLILLJJLI = new DialogInterfaceOnDismissListenerC786080UsY(c19eg, 10);
        StaticAdExplainDialog.LLILZLL = tuxSheet2;
        tuxSheet2.show(c19eg.getSupportFragmentManager(), "FeedAdExplainDialog");
        C0SHX.LIZ(c19eg, null).LJIIJJI("ad_explain_static_dynamic", true, new C0TA1() { // from class: X.0TOW
            @Override // X.C0TA1
            public final void LIZ() {
                TuxSheet tuxSheet3 = StaticAdExplainDialog.LLILZLL;
                if (tuxSheet3 == null) {
                    tuxSheet3 = null;
                }
                tuxSheet3.dismiss();
            }
        });
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJJIFFI(C19EG c19eg, AwemeRawAd awemeRawAd, String str) {
        String geoId;
        String countryCode;
        AboutAdInfo aboutThisAd = awemeRawAd.getAboutThisAd();
        if (aboutThisAd != null) {
            geoId = aboutThisAd.getGeoId();
        } else {
            geoId = null;
        }
        if (TextUtils.isEmpty(geoId)) {
            AboutAdInfo aboutThisAd2 = awemeRawAd.getAboutThisAd();
            if (aboutThisAd2 != null) {
                countryCode = aboutThisAd2.getCountryCode();
            } else {
                countryCode = null;
            }
            if (TextUtils.isEmpty(countryCode) && TextUtils.isEmpty(awemeRawAd.getAboutThisAd().getAudienceTags())) {
                C0TOX.LIZ(c19eg, awemeRawAd, str, 0, null).show();
                return;
            }
        }
        C746400TPq.LIZ(c19eg).wQ2(c19eg, awemeRawAd, str);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final void LJIIIZ(String str, String str2, C1917100zzI c1917100zzI, C19EG c19eg) {
        SubscriptionVM subscriptionVMLIZ = C0TQ7.LIZ(c19eg);
        subscriptionVMLIZ.getClass();
        try {
            subscriptionVMLIZ.LL.registerUserForExp(str, str2).enqueue(new C786260Usq(c1917100zzI, 12));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c1917100zzI.onFail();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService
    public final TuxSheet LJJJJLI(C19EG c19eg, Aweme aweme, boolean z, AwS265S0300000_21 awS265S0300000_21, AwS265S0300000_21 awS265S0300000_212) {
        Long adId;
        AdEntryShareSheetFragment adEntryShareSheetFragment = new AdEntryShareSheetFragment();
        adEntryShareSheetFragment.LLILZIL = c19eg;
        adEntryShareSheetFragment.LL = aweme;
        adEntryShareSheetFragment.LLILLJJLI = z;
        adEntryShareSheetFragment.LLILLL = awS265S0300000_21;
        adEntryShareSheetFragment.LLILZ = awS265S0300000_212;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = adEntryShareSheetFragment;
        tuxSheet.LLJJIJIIJIL = false;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, c19eg);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJI = numLIZJ;
        tuxSheet2.show(c19eg.getSupportFragmentManager(), "AdEntryShareSheetFragment");
        C2344009Gk c2344009Gk = new C2344009Gk();
        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
        if (awemeRawAdLJJIJLIJ != null) {
            adId = awemeRawAdLJJIJLIJ.getAdId();
        } else {
            adId = null;
        }
        c2344009Gk.LJ(adId, "ad_id");
        C20684815ws.LJIILLIIL("ads_transparency_center_entry", c2344009Gk.LIZ);
        return tuxSheet2;
    }
}
