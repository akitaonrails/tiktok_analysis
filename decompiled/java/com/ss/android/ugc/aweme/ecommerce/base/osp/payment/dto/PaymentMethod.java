package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C03MT;
import X.C03OY;
import X.C03OZ;
import X.C03PE;
import X.C03PI;
import X.C03Q4;
import X.C03QB;
import X.C03QI;
import X.C03S0;
import X.C03S8;
import X.C03SY;
import X.C098200Yq;
import X.C09CT;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C1697810uHb;
import X.C1725790v0j;
import X.C189200o6;
import X.C2188811AlT;
import X.C756302xN;
import X.C770702zh;
import X.C7767031p;
import X.C786410Ut5;
import X.C835503Of;
import X.C837203Ow;
import X.C864803Zm;
import X.C870903al;
import X.C899503fN;
import X.C959003oy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeStatement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPaymentPromotionMergeModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.AwS86S1000000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentMethod {
    public PaymentMethod LIZ;
    public final boolean LIZIZ;
    public boolean LIZJ;
    public final String LIZLLL;
    public Long LJ;
    public final C7767031p LJFF;
    public C835503Of LJI;
    public final C835503Of LJII;
    public String LJIIIIZZ;
    public final String LJIIIZ;
    public Boolean LJIIJ;
    public Boolean LJIIJJI;
    public C03OY LJIIL;
    public C03OZ LJIILIIL;
    public String LJIILJJIL;
    public Boolean LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public InstallmentPlan LJIJJ;
    public Boolean LJIJJLI;
    public Availability LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public Availability LJJII;

    @C09CT("additional_clarification")
    public String additionalClarification;

    @C09CT("additional_tips")
    public List<PaymentTip> additionalTips;

    @C09CT("anchored_payment_info")
    public HybridPaymentInfo anchoredPaymentInfo;

    @C09CT("appeal_id")
    public String appealId;

    @C09CT("appeal_status")
    public AppealStatus appealStatus;

    @C09CT("availability")
    public Availability availability;

    @C09CT("balance")
    public String balance;

    @C09CT("balance_amount")
    public Amount balanceAmount;

    @C09CT("binding_tip")
    public List<String> bindCardTips;

    @C09CT("bind_info")
    public BindInfo bindInfo;

    @C09CT("can_appeal")
    public Boolean canAppeal;

    @C09CT("card_bin")
    public String cardBin;

    @C09CT("cashier_sheet")
    public List<CashierSheet> cashierSheet;

    @C09CT("ccdc_card_tip")
    public String ccdcCardTip;

    @C09CT("ccdc_icon_urls")
    public List<CCDCIcon> ccdcIconUrls;

    @C09CT("ccdc_safe_tip")
    public PaymentCertification ccdcSafeTip;

    @C09CT("checkout_button_icon_color")
    public String checkoutButtonColor;

    @C09CT("checkout_button_icon_url")
    public String checkoutButtonImage;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("dark_checkout_button_icon_color")
    public String darkCheckoutButtonColor;

    @C09CT("dark_checkout_button_icon_url")
    public String darkCheckoutButtonImage;

    @C09CT("default_save")
    public Boolean defaultSave;

    @C09CT("disable_braintree_sdk")
    public Boolean disableBraintreeSdk;

    @C09CT("display_name")
    public String displayName;

    @C09CT("elements")
    public List<ElementDTO> elementDTOS;

    @C09CT("events_for_client")
    public String eventsForClient;

    @C09CT("exception")
    public ExceptionUX exceptionUX;

    @C09CT("explanation_url")
    public String explanationUrl;

    @C09CT("extra_fee_statement")
    public ExtraFeeStatement extraFeeStatement;

    @C09CT("extra_info")
    public String extraInfo;

    @C09CT("payment_method_first_type")
    public String firstType;

    @C09CT("half_screen_title_key")
    public String halfScreenTitle;

    @C09CT("is_need_install_app")
    public Boolean hideIfNotInstall;

    @C09CT("hybrid_payment_info")
    public HybridPaymentInfo hybridPaymentInfo;

    @C09CT("icon_url")
    public String iconUrl;

    @C09CT("icon_url_dark")
    public String iconUrlDark;

    @C09CT("payment_method_id")
    public String id;

    @C09CT("installation_tips")
    public String installationTips;

    @C09CT("installment_info")
    public InstallmentInfo installmentInfo;

    @C09CT("installment_info_list")
    public List<InstallmentInfo> installmentInfoList;

    @C09CT("bnpl_and_hybrid_payment_interaction_style")
    public Integer interactionStyle;

    @C09CT("is_choose_recommend")
    public Boolean isChooseRecommend;

    @C09CT("is_client_bind")
    public Boolean isClientBind;

    @C09CT("is_deeplink")
    public Boolean isDeepLink;

    @C09CT("is_expand")
    public Boolean isExpand;

    @C09CT("is_installment")
    public Boolean isInstallment;

    @C09CT("is_primary")
    public Boolean isPrimary;

    @C09CT("last_four")
    public String lastFour;

    @C09CT("masked_identity")
    public String maskedIdentity;

    @C09CT("missing_elements")
    public List<ElementDTO> missingElements;

    @C09CT("needed_cvv")
    public Boolean neededCVV;

    @C09CT("needed_elements")
    public List<ElementDTO> neededElementDTOS;

    @C09CT("needs_independent_pricing")
    public Boolean needsIndependentPricing;

    @C09CT("needs_secondary_query_installment")
    public Boolean needsSecondaryQueryInstallment;

    @C09CT("new_bind_card_flow")
    public Boolean newBindCardFlow;

    @C09CT("new_payment_method_title")
    public String newPaymentMethodTitle;

    @C09CT("order_payment_tips")
    public String orderPaymentTips;

    @C09CT("package_name")
    public String packageName;

    @C09CT("page_button_info")
    public PaymentButtonInfo pageButtonInfo;

    @C09CT("pay_redirect_nav_bar")
    public PayRedirectNavBar payRedirectNavBar;

    @C09CT("payment_banner")
    public PaymentBanner paymentBanner;

    @C09CT("payment_label")
    public PaymentLabel paymentLabel;

    @C09CT("payment_price_version_id")
    public String paymentPriceVersionId;

    @C09CT("payment_service_fee_info")
    public PaymentServiceFeeInfo paymentServiceFeeInfo;

    @C09CT("payment_subtitle")
    public String paymentSubTitle;

    @C09CT("payment_tips")
    public PaymentTip paymentTip;

    @C09CT("tooltip")
    public PaymentTooltip paymentTooltip;

    @C09CT("payment_unit_id")
    public String paymentUnitId;

    @C09CT("pci_sensitive")
    public Boolean pciSensitive;

    @C09CT("popup_info")
    public PopupInfo popupInfo;

    @C09CT("pop_up_needed_elements")
    public List<ElementDTO> popupNeededElements;

    @C09CT("promotion_info")
    public List<PaymentPromotion> promotionInfo;

    @C09CT("prompt")
    public String prompt;

    @C09CT("recovery_marketing_info")
    public RecoveryMarketingInfo recoveryMarketingInfo;

    @C09CT("recurring_payment_info")
    public RecurringPaymentInfo recurringPaymentInfo;

    @C09CT("remain_amount_tips")
    public PaymentTip remainAmountTips;

    @C09CT("save_display_text")
    public String saveDisplayText;

    @C09CT("save_notification_url")
    public String saveNotificationUrl;

    @C09CT("save_security_info")
    public List<SaveSecurityBlock> saveSecurityInfo;

    @C09CT("save_security_section")
    public List<SaveSecuritySection> saveSecuritySection;

    @C09CT("schema")
    public String schema;

    @C09CT("payment_method_second_type")
    public String secondType;

    @C09CT("should_reload_billinfo")
    public Boolean shouldReloadBillInfo;

    @C09CT("sub_display_name")
    public ECRichText subDisplayName;

    @C09CT("sub_icon_urls")
    public List<CCDCIcon> subIconUrls;

    @C09CT("sub_payment_methods")
    public List<PaymentMethod> subPaymentMethods;

    @C09CT("support_card_list")
    public List<String> supportCardList;

    @C09CT("support_donation")
    public Boolean supportDonation;

    @C09CT("supported_pay_commute_types")
    public List<CommuteInfo> supportedPayCommuteTypes;

    @C09CT("payment_method_token")
    public String token;

    @C09CT("unfold_strategy")
    public UnfoldStrategy unfoldStrategy;

    public PaymentMethod() {
    }

    public final PaymentPromotion LJIILLIIL() {
        List listLJI = LJI(this, false, 3);
        if (!(!((ArrayList) listLJI).isEmpty()) || listLJI == null) {
            return null;
        }
        return (PaymentPromotion) ListProtector.get(listLJI, 0);
    }

    public final String LJIIZILJ() {
        List listLJI = LJI(this, false, 3);
        if (!(!((ArrayList) listLJI).isEmpty()) || listLJI == null) {
            return null;
        }
        return ((PaymentPromotion) ListProtector.get(listLJI, 0)).getAmount();
    }

    public final String LJIJ() {
        List listLJI = LJI(this, false, 3);
        if (!(!((ArrayList) listLJI).isEmpty()) || listLJI == null) {
            return null;
        }
        return ((PaymentPromotion) ListProtector.get(listLJI, 0)).getPromotionBatchId();
    }

    public final String LJIJI() {
        List listLJI = LJI(this, false, 3);
        if (!(!((ArrayList) listLJI).isEmpty()) || listLJI == null) {
            return null;
        }
        return ((PaymentPromotion) ListProtector.get(listLJI, 0)).getPromotionCurrency();
    }

    public final String LJIJJLI() {
        List listLJI = LJI(this, false, 3);
        if (!(!((ArrayList) listLJI).isEmpty()) || listLJI == null) {
            return null;
        }
        return ((PaymentPromotion) ListProtector.get(listLJI, 0)).getDescInEditStatus();
    }

    public final boolean LJJJJLL() {
        List listLJI = LJI(this, false, 3);
        if (!(!((ArrayList) listLJI).isEmpty()) || listLJI == null) {
            return false;
        }
        return Intrinsics.LJFF(((PaymentPromotion) ListProtector.get(listLJI, 0)).isNotMeetPromotionThreshold(), Boolean.TRUE);
    }

    public final boolean LJJJJZI() {
        return C770702zh.LIZIZ(LJIJJ(false)) || C770702zh.LIZIZ(LJJII()) || C770702zh.LIZIZ(LJJIJIIJIL(false));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        return Intrinsics.LJFF(this.id, paymentMethod.id) && Intrinsics.LJFF(this.displayName, paymentMethod.displayName) && Intrinsics.LJFF(this.firstType, paymentMethod.firstType) && Intrinsics.LJFF(this.secondType, paymentMethod.secondType) && Intrinsics.LJFF(this.iconUrl, paymentMethod.iconUrl) && Intrinsics.LJFF(this.elementDTOS, paymentMethod.elementDTOS) && Intrinsics.LJFF(this.pciSensitive, paymentMethod.pciSensitive) && Intrinsics.LJFF(this.subPaymentMethods, paymentMethod.subPaymentMethods) && Intrinsics.LJFF(this.isDeepLink, paymentMethod.isDeepLink) && Intrinsics.LJFF(this.packageName, paymentMethod.packageName) && Intrinsics.LJFF(this.schema, paymentMethod.schema) && Intrinsics.LJFF(this.hideIfNotInstall, paymentMethod.hideIfNotInstall) && Intrinsics.LJFF(this.extraInfo, paymentMethod.extraInfo) && Intrinsics.LJFF(this.promotionInfo, paymentMethod.promotionInfo) && Intrinsics.LJFF(this.saveDisplayText, paymentMethod.saveDisplayText) && Intrinsics.LJFF(this.maskedIdentity, paymentMethod.maskedIdentity) && Intrinsics.LJFF(this.isPrimary, paymentMethod.isPrimary) && Intrinsics.LJFF(this.token, paymentMethod.token) && Intrinsics.LJFF(this.saveNotificationUrl, paymentMethod.saveNotificationUrl) && Intrinsics.LJFF(this.neededElementDTOS, paymentMethod.neededElementDTOS) && Intrinsics.LJFF(this.balance, paymentMethod.balance) && Intrinsics.LJFF(this.availability, paymentMethod.availability) && Intrinsics.LJFF(this.bindInfo, paymentMethod.bindInfo) && Intrinsics.LJFF(this.exceptionUX, paymentMethod.exceptionUX) && Intrinsics.LJFF(this.supportedPayCommuteTypes, paymentMethod.supportedPayCommuteTypes) && Intrinsics.LJFF(this.orderPaymentTips, paymentMethod.orderPaymentTips) && Intrinsics.LJFF(this.prompt, paymentMethod.prompt) && Intrinsics.LJFF(this.LIZ, paymentMethod.LIZ) && this.unfoldStrategy == paymentMethod.unfoldStrategy && Intrinsics.LJFF(this.installmentInfo, paymentMethod.installmentInfo) && Intrinsics.LJFF(this.supportCardList, paymentMethod.supportCardList) && Intrinsics.LJFF(this.isChooseRecommend, paymentMethod.isChooseRecommend) && Intrinsics.LJFF(this.shouldReloadBillInfo, paymentMethod.shouldReloadBillInfo) && Intrinsics.LJFF(this.explanationUrl, paymentMethod.explanationUrl) && Intrinsics.LJFF(this.paymentLabel, paymentMethod.paymentLabel) && Intrinsics.LJFF(this.extraFeeStatement, paymentMethod.extraFeeStatement) && Intrinsics.LJFF(this.paymentTip, paymentMethod.paymentTip) && Intrinsics.LJFF(this.additionalTips, paymentMethod.additionalTips) && Intrinsics.LJFF(this.ccdcCardTip, paymentMethod.ccdcCardTip) && Intrinsics.LJFF(this.paymentBanner, paymentMethod.paymentBanner) && Intrinsics.LJFF(this.ccdcIconUrls, paymentMethod.ccdcIconUrls) && Intrinsics.LJFF(this.ccdcSafeTip, paymentMethod.ccdcSafeTip) && this.LIZIZ == paymentMethod.LIZIZ && this.LIZJ == paymentMethod.LIZJ && Intrinsics.LJFF(this.LIZLLL, paymentMethod.LIZLLL) && Intrinsics.LJFF(this.LJ, paymentMethod.LJ) && Intrinsics.LJFF(this.LJFF, paymentMethod.LJFF) && Intrinsics.LJFF(this.missingElements, paymentMethod.missingElements) && Intrinsics.LJFF(this.installmentInfoList, paymentMethod.installmentInfoList) && Intrinsics.LJFF(this.paymentSubTitle, paymentMethod.paymentSubTitle) && Intrinsics.LJFF(this.LJI, paymentMethod.LJI) && Intrinsics.LJFF(this.cashierSheet, paymentMethod.cashierSheet) && Intrinsics.LJFF(this.saveSecurityInfo, paymentMethod.saveSecurityInfo) && Intrinsics.LJFF(this.saveSecuritySection, paymentMethod.saveSecuritySection) && Intrinsics.LJFF(this.LJII, paymentMethod.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, paymentMethod.LJIIIIZZ) && Intrinsics.LJFF(this.defaultSave, paymentMethod.defaultSave) && Intrinsics.LJFF(this.checkoutButtonImage, paymentMethod.checkoutButtonImage) && Intrinsics.LJFF(this.darkCheckoutButtonImage, paymentMethod.darkCheckoutButtonImage) && Intrinsics.LJFF(this.checkoutButtonColor, paymentMethod.checkoutButtonColor) && Intrinsics.LJFF(this.darkCheckoutButtonColor, paymentMethod.darkCheckoutButtonColor) && Intrinsics.LJFF(this.eventsForClient, paymentMethod.eventsForClient) && Intrinsics.LJFF(this.installationTips, paymentMethod.installationTips) && Intrinsics.LJFF(this.paymentServiceFeeInfo, paymentMethod.paymentServiceFeeInfo) && Intrinsics.LJFF(this.newPaymentMethodTitle, paymentMethod.newPaymentMethodTitle) && Intrinsics.LJFF(this.LJIIIZ, paymentMethod.LJIIIZ) && Intrinsics.LJFF(this.neededCVV, paymentMethod.neededCVV) && Intrinsics.LJFF(this.popupNeededElements, paymentMethod.popupNeededElements) && Intrinsics.LJFF(this.hybridPaymentInfo, paymentMethod.hybridPaymentInfo) && Intrinsics.LJFF(this.newBindCardFlow, paymentMethod.newBindCardFlow) && Intrinsics.LJFF(this.bindCardTips, paymentMethod.bindCardTips) && Intrinsics.LJFF(this.canAppeal, paymentMethod.canAppeal) && this.appealStatus == paymentMethod.appealStatus && Intrinsics.LJFF(this.LJIIJ, paymentMethod.LJIIJ) && Intrinsics.LJFF(this.subIconUrls, paymentMethod.subIconUrls) && Intrinsics.LJFF(this.halfScreenTitle, paymentMethod.halfScreenTitle) && Intrinsics.LJFF(this.subDisplayName, paymentMethod.subDisplayName) && Intrinsics.LJFF(this.payRedirectNavBar, paymentMethod.payRedirectNavBar) && Intrinsics.LJFF(this.paymentPriceVersionId, paymentMethod.paymentPriceVersionId) && Intrinsics.LJFF(this.needsIndependentPricing, paymentMethod.needsIndependentPricing) && Intrinsics.LJFF(this.paymentUnitId, paymentMethod.paymentUnitId) && Intrinsics.LJFF(this.isInstallment, paymentMethod.isInstallment) && Intrinsics.LJFF(this.disableBraintreeSdk, paymentMethod.disableBraintreeSdk) && Intrinsics.LJFF(this.cardBin, paymentMethod.cardBin) && Intrinsics.LJFF(this.LJIIJJI, paymentMethod.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, paymentMethod.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, paymentMethod.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, paymentMethod.LJIILJJIL) && Intrinsics.LJFF(this.needsSecondaryQueryInstallment, paymentMethod.needsSecondaryQueryInstallment) && Intrinsics.LJFF(this.LJIILL, paymentMethod.LJIILL) && Intrinsics.LJFF(this.paymentTooltip, paymentMethod.paymentTooltip) && Intrinsics.LJFF(this.lastFour, paymentMethod.lastFour) && Intrinsics.LJFF(this.isClientBind, paymentMethod.isClientBind) && Intrinsics.LJFF(this.supportDonation, paymentMethod.supportDonation) && Intrinsics.LJFF(this.isExpand, paymentMethod.isExpand) && Intrinsics.LJFF(this.additionalClarification, paymentMethod.additionalClarification) && Intrinsics.LJFF(this.pageButtonInfo, paymentMethod.pageButtonInfo) && Intrinsics.LJFF(this.anchoredPaymentInfo, paymentMethod.anchoredPaymentInfo) && Intrinsics.LJFF(this.appealId, paymentMethod.appealId) && Intrinsics.LJFF(this.interactionStyle, paymentMethod.interactionStyle) && Intrinsics.LJFF(this.remainAmountTips, paymentMethod.remainAmountTips) && Intrinsics.LJFF(this.recurringPaymentInfo, paymentMethod.recurringPaymentInfo) && Intrinsics.LJFF(this.popupInfo, paymentMethod.popupInfo) && Intrinsics.LJFF(this.daInfo, paymentMethod.daInfo) && Intrinsics.LJFF(this.recoveryMarketingInfo, paymentMethod.recoveryMarketingInfo) && Intrinsics.LJFF(this.iconUrlDark, paymentMethod.iconUrlDark) && Intrinsics.LJFF(this.balanceAmount, paymentMethod.balanceAmount);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<ElementDTO> list = this.elementDTOS;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.pciSensitive;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<PaymentMethod> list2 = this.subPaymentMethods;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.isDeepLink;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.packageName;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.schema;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool3 = this.hideIfNotInstall;
        int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str8 = this.extraInfo;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<PaymentPromotion> list3 = this.promotionInfo;
        int iHashCode14 = (iHashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str9 = this.saveDisplayText;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.maskedIdentity;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool4 = this.isPrimary;
        int iHashCode17 = (iHashCode16 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str11 = this.token;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.saveNotificationUrl;
        int iHashCode19 = (iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List<ElementDTO> list4 = this.neededElementDTOS;
        int iHashCode20 = (iHashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str13 = this.balance;
        int iHashCode21 = (iHashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Availability availability = this.availability;
        int iHashCode22 = (iHashCode21 + (availability == null ? 0 : availability.hashCode())) * 31;
        BindInfo bindInfo = this.bindInfo;
        int iHashCode23 = (iHashCode22 + (bindInfo == null ? 0 : bindInfo.hashCode())) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        int iHashCode24 = (iHashCode23 + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        List<CommuteInfo> list5 = this.supportedPayCommuteTypes;
        int iHashCode25 = (iHashCode24 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str14 = this.orderPaymentTips;
        int iHashCode26 = (iHashCode25 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.prompt;
        int iHashCode27 = (iHashCode26 + (str15 == null ? 0 : str15.hashCode())) * 31;
        PaymentMethod paymentMethod = this.LIZ;
        int iHashCode28 = (iHashCode27 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        UnfoldStrategy unfoldStrategy = this.unfoldStrategy;
        int iHashCode29 = (iHashCode28 + (unfoldStrategy == null ? 0 : unfoldStrategy.hashCode())) * 31;
        InstallmentInfo installmentInfo = this.installmentInfo;
        int iHashCode30 = (iHashCode29 + (installmentInfo == null ? 0 : installmentInfo.hashCode())) * 31;
        List<String> list6 = this.supportCardList;
        int iHashCode31 = (iHashCode30 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Boolean bool5 = this.isChooseRecommend;
        int iHashCode32 = (iHashCode31 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.shouldReloadBillInfo;
        int iHashCode33 = (iHashCode32 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str16 = this.explanationUrl;
        int iHashCode34 = (iHashCode33 + (str16 == null ? 0 : str16.hashCode())) * 31;
        PaymentLabel paymentLabel = this.paymentLabel;
        int iHashCode35 = (iHashCode34 + (paymentLabel == null ? 0 : paymentLabel.hashCode())) * 31;
        ExtraFeeStatement extraFeeStatement = this.extraFeeStatement;
        int iHashCode36 = (iHashCode35 + (extraFeeStatement == null ? 0 : extraFeeStatement.hashCode())) * 31;
        PaymentTip paymentTip = this.paymentTip;
        int iHashCode37 = (iHashCode36 + (paymentTip == null ? 0 : paymentTip.hashCode())) * 31;
        List<PaymentTip> list7 = this.additionalTips;
        int iHashCode38 = (iHashCode37 + (list7 == null ? 0 : list7.hashCode())) * 31;
        String str17 = this.ccdcCardTip;
        int iHashCode39 = (iHashCode38 + (str17 == null ? 0 : str17.hashCode())) * 31;
        PaymentBanner paymentBanner = this.paymentBanner;
        int iHashCode40 = (iHashCode39 + (paymentBanner == null ? 0 : paymentBanner.hashCode())) * 31;
        List<CCDCIcon> list8 = this.ccdcIconUrls;
        int iHashCode41 = (iHashCode40 + (list8 == null ? 0 : list8.hashCode())) * 31;
        PaymentCertification paymentCertification = this.ccdcSafeTip;
        int iHashCode42 = (((((iHashCode41 + (paymentCertification == null ? 0 : paymentCertification.hashCode())) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str18 = this.LIZLLL;
        int iHashCode43 = (iHashCode42 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Long l = this.LJ;
        int iHashCode44 = (iHashCode43 + (l == null ? 0 : l.hashCode())) * 31;
        C7767031p c7767031p = this.LJFF;
        int iHashCode45 = (iHashCode44 + (c7767031p == null ? 0 : c7767031p.hashCode())) * 31;
        List<ElementDTO> list9 = this.missingElements;
        int iHashCode46 = (iHashCode45 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<InstallmentInfo> list10 = this.installmentInfoList;
        int iHashCode47 = (iHashCode46 + (list10 == null ? 0 : list10.hashCode())) * 31;
        String str19 = this.paymentSubTitle;
        int iHashCode48 = (iHashCode47 + (str19 == null ? 0 : str19.hashCode())) * 31;
        C835503Of c835503Of = this.LJI;
        int iHashCode49 = (iHashCode48 + (c835503Of == null ? 0 : c835503Of.hashCode())) * 31;
        List<CashierSheet> list11 = this.cashierSheet;
        int iHashCode50 = (iHashCode49 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<SaveSecurityBlock> list12 = this.saveSecurityInfo;
        int iHashCode51 = (iHashCode50 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<SaveSecuritySection> list13 = this.saveSecuritySection;
        int iHashCode52 = (iHashCode51 + (list13 == null ? 0 : list13.hashCode())) * 31;
        C835503Of c835503Of2 = this.LJII;
        int iHashCode53 = (iHashCode52 + (c835503Of2 == null ? 0 : c835503Of2.hashCode())) * 31;
        String str20 = this.LJIIIIZZ;
        int iHashCode54 = (iHashCode53 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Boolean bool7 = this.defaultSave;
        int iHashCode55 = (iHashCode54 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str21 = this.checkoutButtonImage;
        int iHashCode56 = (iHashCode55 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.darkCheckoutButtonImage;
        int iHashCode57 = (iHashCode56 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.checkoutButtonColor;
        int iHashCode58 = (iHashCode57 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.darkCheckoutButtonColor;
        int iHashCode59 = (iHashCode58 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.eventsForClient;
        int iHashCode60 = (iHashCode59 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.installationTips;
        int iHashCode61 = (iHashCode60 + (str26 == null ? 0 : str26.hashCode())) * 31;
        PaymentServiceFeeInfo paymentServiceFeeInfo = this.paymentServiceFeeInfo;
        int iHashCode62 = (iHashCode61 + (paymentServiceFeeInfo == null ? 0 : paymentServiceFeeInfo.hashCode())) * 31;
        String str27 = this.newPaymentMethodTitle;
        int iHashCode63 = (iHashCode62 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.LJIIIZ;
        int iHashCode64 = (iHashCode63 + (str28 == null ? 0 : str28.hashCode())) * 31;
        Boolean bool8 = this.neededCVV;
        int iHashCode65 = (iHashCode64 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        List<ElementDTO> list14 = this.popupNeededElements;
        int iHashCode66 = (iHashCode65 + (list14 == null ? 0 : list14.hashCode())) * 31;
        HybridPaymentInfo hybridPaymentInfo = this.hybridPaymentInfo;
        int iHashCode67 = (iHashCode66 + (hybridPaymentInfo == null ? 0 : hybridPaymentInfo.hashCode())) * 31;
        Boolean bool9 = this.newBindCardFlow;
        int iHashCode68 = (iHashCode67 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        List<String> list15 = this.bindCardTips;
        int iHashCode69 = (iHashCode68 + (list15 == null ? 0 : list15.hashCode())) * 31;
        Boolean bool10 = this.canAppeal;
        int iHashCode70 = (iHashCode69 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        AppealStatus appealStatus = this.appealStatus;
        int iHashCode71 = (iHashCode70 + (appealStatus == null ? 0 : appealStatus.hashCode())) * 31;
        Boolean bool11 = this.LJIIJ;
        int iHashCode72 = (iHashCode71 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        List<CCDCIcon> list16 = this.subIconUrls;
        int iHashCode73 = (iHashCode72 + (list16 == null ? 0 : list16.hashCode())) * 31;
        String str29 = this.halfScreenTitle;
        int iHashCode74 = (iHashCode73 + (str29 == null ? 0 : str29.hashCode())) * 31;
        ECRichText eCRichText = this.subDisplayName;
        int iHashCode75 = (iHashCode74 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        PayRedirectNavBar payRedirectNavBar = this.payRedirectNavBar;
        int iHashCode76 = (iHashCode75 + (payRedirectNavBar == null ? 0 : payRedirectNavBar.hashCode())) * 31;
        String str30 = this.paymentPriceVersionId;
        int iHashCode77 = (iHashCode76 + (str30 == null ? 0 : str30.hashCode())) * 31;
        Boolean bool12 = this.needsIndependentPricing;
        int iHashCode78 = (iHashCode77 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        String str31 = this.paymentUnitId;
        int iHashCode79 = (iHashCode78 + (str31 == null ? 0 : str31.hashCode())) * 31;
        Boolean bool13 = this.isInstallment;
        int iHashCode80 = (iHashCode79 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.disableBraintreeSdk;
        int iHashCode81 = (iHashCode80 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        String str32 = this.cardBin;
        int iHashCode82 = (iHashCode81 + (str32 == null ? 0 : str32.hashCode())) * 31;
        Boolean bool15 = this.LJIIJJI;
        int iHashCode83 = (iHashCode82 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        C03OY c03oy = this.LJIIL;
        int iHashCode84 = (iHashCode83 + (c03oy == null ? 0 : c03oy.hashCode())) * 31;
        C03OZ c03oz = this.LJIILIIL;
        int iHashCode85 = (iHashCode84 + (c03oz == null ? 0 : c03oz.hashCode())) * 31;
        String str33 = this.LJIILJJIL;
        int iHashCode86 = (iHashCode85 + (str33 == null ? 0 : str33.hashCode())) * 31;
        Boolean bool16 = this.needsSecondaryQueryInstallment;
        int iHashCode87 = (iHashCode86 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.LJIILL;
        int iHashCode88 = (iHashCode87 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        PaymentTooltip paymentTooltip = this.paymentTooltip;
        int iHashCode89 = (iHashCode88 + (paymentTooltip == null ? 0 : paymentTooltip.hashCode())) * 31;
        String str34 = this.lastFour;
        int iHashCode90 = (iHashCode89 + (str34 == null ? 0 : str34.hashCode())) * 31;
        Boolean bool18 = this.isClientBind;
        int iHashCode91 = (iHashCode90 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.supportDonation;
        int iHashCode92 = (iHashCode91 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.isExpand;
        int iHashCode93 = (iHashCode92 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        String str35 = this.additionalClarification;
        int iHashCode94 = (iHashCode93 + (str35 == null ? 0 : str35.hashCode())) * 31;
        PaymentButtonInfo paymentButtonInfo = this.pageButtonInfo;
        int iHashCode95 = (iHashCode94 + (paymentButtonInfo == null ? 0 : paymentButtonInfo.hashCode())) * 31;
        HybridPaymentInfo hybridPaymentInfo2 = this.anchoredPaymentInfo;
        int iHashCode96 = (iHashCode95 + (hybridPaymentInfo2 == null ? 0 : hybridPaymentInfo2.hashCode())) * 31;
        String str36 = this.appealId;
        int iHashCode97 = (iHashCode96 + (str36 == null ? 0 : str36.hashCode())) * 31;
        Integer num = this.interactionStyle;
        int iHashCode98 = (iHashCode97 + (num == null ? 0 : num.hashCode())) * 31;
        PaymentTip paymentTip2 = this.remainAmountTips;
        int iHashCode99 = (iHashCode98 + (paymentTip2 == null ? 0 : paymentTip2.hashCode())) * 31;
        RecurringPaymentInfo recurringPaymentInfo = this.recurringPaymentInfo;
        int iHashCode100 = (iHashCode99 + (recurringPaymentInfo == null ? 0 : recurringPaymentInfo.hashCode())) * 31;
        PopupInfo popupInfo = this.popupInfo;
        int iHashCode101 = (iHashCode100 + (popupInfo == null ? 0 : popupInfo.hashCode())) * 31;
        String str37 = this.daInfo;
        int iHashCode102 = (iHashCode101 + (str37 == null ? 0 : str37.hashCode())) * 31;
        RecoveryMarketingInfo recoveryMarketingInfo = this.recoveryMarketingInfo;
        int iHashCode103 = (iHashCode102 + (recoveryMarketingInfo == null ? 0 : recoveryMarketingInfo.hashCode())) * 31;
        String str38 = this.iconUrlDark;
        int iHashCode104 = (iHashCode103 + (str38 == null ? 0 : str38.hashCode())) * 31;
        Amount amount = this.balanceAmount;
        return iHashCode104 + (amount != null ? amount.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentMethod(id=" + this.id + ", displayName=" + this.displayName + ", firstType=" + this.firstType + ", secondType=" + this.secondType + ", iconUrl=" + this.iconUrl + ", elementDTOS=" + this.elementDTOS + ", pciSensitive=" + this.pciSensitive + ", subPaymentMethods=" + this.subPaymentMethods + ", isDeepLink=" + this.isDeepLink + ", packageName=" + this.packageName + ", schema=" + this.schema + ", hideIfNotInstall=" + this.hideIfNotInstall + ", extraInfo=" + this.extraInfo + ", promotionInfo=" + this.promotionInfo + ", saveDisplayText=" + this.saveDisplayText + ", maskedIdentity=" + this.maskedIdentity + ", isPrimary=" + this.isPrimary + ", token=" + this.token + ", saveNotificationUrl=" + this.saveNotificationUrl + ", neededElementDTOS=" + this.neededElementDTOS + ", balance=" + this.balance + ", availability=" + this.availability + ", bindInfo=" + this.bindInfo + ", exceptionUX=" + this.exceptionUX + ", supportedPayCommuteTypes=" + this.supportedPayCommuteTypes + ", orderPaymentTips=" + this.orderPaymentTips + ", prompt=" + this.prompt + ", selectedSubPaymentMethod=" + this.LIZ + ", unfoldStrategy=" + this.unfoldStrategy + ", installmentInfo=" + this.installmentInfo + ", supportCardList=" + this.supportCardList + ", isChooseRecommend=" + this.isChooseRecommend + ", shouldReloadBillInfo=" + this.shouldReloadBillInfo + ", explanationUrl=" + this.explanationUrl + ", paymentLabel=" + this.paymentLabel + ", extraFeeStatement=" + this.extraFeeStatement + ", paymentTip=" + this.paymentTip + ", additionalTips=" + this.additionalTips + ", ccdcCardTip=" + this.ccdcCardTip + ", paymentBanner=" + this.paymentBanner + ", ccdcIconUrls=" + this.ccdcIconUrls + ", ccdcSafeTip=" + this.ccdcSafeTip + ", newCard=" + this.LIZIZ + ", prepaid=" + this.LIZJ + ", _extraKey=" + this.LIZLLL + ", refreshFlag=" + this.LJ + ", hybridInfo=" + this.LJFF + ", missingElements=" + this.missingElements + ", installmentInfoList=" + this.installmentInfoList + ", paymentSubTitle=" + this.paymentSubTitle + ", bindAndPaySubItemConfig=" + this.LJI + ", cashierSheet=" + this.cashierSheet + ", saveSecurityInfo=" + this.saveSecurityInfo + ", saveSecuritySection=" + this.saveSecuritySection + ", displayBindAndPaySubItems=" + this.LJII + ", deviceData=" + this.LJIIIIZZ + ", defaultSave=" + this.defaultSave + ", checkoutButtonImage=" + this.checkoutButtonImage + ", darkCheckoutButtonImage=" + this.darkCheckoutButtonImage + ", checkoutButtonColor=" + this.checkoutButtonColor + ", darkCheckoutButtonColor=" + this.darkCheckoutButtonColor + ", eventsForClient=" + this.eventsForClient + ", installationTips=" + this.installationTips + ", paymentServiceFeeInfo=" + this.paymentServiceFeeInfo + ", newPaymentMethodTitle=" + this.newPaymentMethodTitle + ", bankCode=" + this.LJIIIZ + ", neededCVV=" + this.neededCVV + ", popupNeededElements=" + this.popupNeededElements + ", hybridPaymentInfo=" + this.hybridPaymentInfo + ", newBindCardFlow=" + this.newBindCardFlow + ", bindCardTips=" + this.bindCardTips + ", canAppeal=" + this.canAppeal + ", appealStatus=" + this.appealStatus + ", cciSupportInstallment=" + this.LJIIJ + ", subIconUrls=" + this.subIconUrls + ", halfScreenTitle=" + this.halfScreenTitle + ", subDisplayName=" + this.subDisplayName + ", payRedirectNavBar=" + this.payRedirectNavBar + ", paymentPriceVersionId=" + this.paymentPriceVersionId + ", needsIndependentPricing=" + this.needsIndependentPricing + ", paymentUnitId=" + this.paymentUnitId + ", isInstallment=" + this.isInstallment + ", disableBraintreeSdk=" + this.disableBraintreeSdk + ", cardBin=" + this.cardBin + ", isChooseSave=" + this.LJIIJJI + ", extraPaymentData=" + this.LJIIL + ", independentPaymentData=" + this.LJIILIIL + ", independentBankCode=" + this.LJIILJJIL + ", needsSecondaryQueryInstallment=" + this.needsSecondaryQueryInstallment + ", isAnchorPaymentMethod=" + this.LJIILL + ", paymentTooltip=" + this.paymentTooltip + ", lastFour=" + this.lastFour + ", isClientBind=" + this.isClientBind + ", supportDonation=" + this.supportDonation + ", isExpand=" + this.isExpand + ", additionalClarification=" + this.additionalClarification + ", pageButtonInfo=" + this.pageButtonInfo + ", anchoredPaymentInfo=" + this.anchoredPaymentInfo + ", appealId=" + this.appealId + ", interactionStyle=" + this.interactionStyle + ", remainAmountTips=" + this.remainAmountTips + ", recurringPaymentInfo=" + this.recurringPaymentInfo + ", popupInfo=" + this.popupInfo + ", daInfo=" + this.daInfo + ", recoveryMarketingInfo=" + this.recoveryMarketingInfo + ", iconUrlDark=" + this.iconUrlDark + ", balanceAmount=" + this.balanceAmount + ')';
    }

    public final boolean LIZ() {
        int i;
        List<PaymentMethod> list = this.subPaymentMethods;
        if (list == null || list.isEmpty()) {
            C03QI.LIZ.getClass();
            if (LJJIIJ(C03QI.LIZ().enableOptimize) == null) {
                return false;
            }
            BindInfo bindInfo = this.bindInfo;
            if (bindInfo != null && bindInfo.supportedBindCommuteTypes != null && LJII(C03QI.LIZ().enableOptimize) == null) {
                return false;
            }
        } else {
            List<PaymentMethod> list2 = this.subPaymentMethods;
            if (list2 != null) {
                Iterator<PaymentMethod> it2 = list2.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (!it2.next().LIZ()) {
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            List<PaymentMethod> list3 = this.subPaymentMethods;
            if (list3 != null && list3.size() == i) {
                return false;
            }
        }
        return true;
    }

    public final Map<String, Object> LIZIZ() {
        Object obj;
        String str = this.daInfo;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = new JSONObject(this.daInfo);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt != null && !Intrinsics.LJFF(objOpt, JSONObject.NULL)) {
                    linkedHashMap.put(next, objOpt);
                }
            }
            C189200o6.m2constructorimpl(linkedHashMap);
            obj = linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        return (Map) (C189200o6.m7isFailureimpl(obj) ? null : obj);
    }

    public final boolean LIZLLL() {
        EcomPaymentPromotionMergeModel ecomPaymentPromotionMergeModel = C03S0.LIZ;
        return C03S0.LIZ(this.id) && this.LJIIL != null;
    }

    public final List<ElementDTO> LJFF() {
        List<ElementDTO> list;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) C13LQ.LJIJI(new List[]{this.elementDTOS, this.neededElementDTOS})).iterator();
        while (it2.hasNext()) {
            arrayList.addAll((Collection) it2.next());
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ecom_piclip_switch", true) && (list = this.missingElements) != null) {
            for (ElementDTO elementDTO : list) {
                if (!arrayList.contains(elementDTO)) {
                    arrayList.add(elementDTO);
                }
            }
        }
        return arrayList;
    }

    public final List<BindInfoReqInfo> LJIIIIZZ() {
        String str;
        C03QI.LIZ.getClass();
        CommuteInfo commuteInfoLJII = LJII(C03QI.LIZ().enableOptimize);
        if ((commuteInfoLJII != null ? commuteInfoLJII.commuteType : null) == CommuteType.INAPP_BROWSER) {
            C03PI.LJIJI.getClass();
            str = C03PI.LJJI;
        } else {
            C03PI.LJIJI.getClass();
            str = C03PI.LJJ;
        }
        BindInfoReqInfo[] bindInfoReqInfoArr = new BindInfoReqInfo[1];
        String str2 = this.id;
        String str3 = this.token;
        String strLJ = LJ();
        CommuteInfo commuteInfoLJII2 = LJII(false);
        bindInfoReqInfoArr[0] = new BindInfoReqInfo(str2, str3, strLJ, commuteInfoLJII2 != null ? commuteInfoLJII2.commuteType : null, str, null);
        return C1697810uHb.LJ(bindInfoReqInfoArr);
    }

    public final List<ElementDTO> LJIIJJI() {
        List<ElementDTO> list = this.elementDTOS;
        if (list == null && (list = this.neededElementDTOS) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ElementDTO elementDTO : list) {
            if (!C03S8.LJIILL(elementDTO.id)) {
                arrayList.add(elementDTO);
            }
        }
        return arrayList;
    }

    public final PaymentPromotion LJIIL() {
        PaymentPromotion paymentPromotion;
        List<PaymentPromotion> list = this.promotionInfo;
        if (list == null || (paymentPromotion = (PaymentPromotion) C13LP.LJJJLL(list)) == null || !Intrinsics.LJFF(paymentPromotion.isBonusTypePromotion(), Boolean.TRUE)) {
            return null;
        }
        return paymentPromotion;
    }

    public final InstallmentInfo LJIILJJIL() {
        InstallmentInfo installmentInfo = this.installmentInfo;
        if (installmentInfo != null) {
            return installmentInfo;
        }
        List<InstallmentInfo> list = this.installmentInfoList;
        if (list != null) {
            return (InstallmentInfo) C13LP.LJJJLL(list);
        }
        return null;
    }

    public final InstallmentPlan LJIILL() {
        List<InstallmentPlan> list;
        List<InstallmentInfo> list2;
        InstallmentInfo installmentInfo = this.installmentInfo;
        if ((installmentInfo == null && ((list2 = this.installmentInfoList) == null || (installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list2)) == null)) || (list = installmentInfo.installmentPlans) == null) {
            return null;
        }
        return (InstallmentPlan) C13LP.LJJJLL(list);
    }

    public final String LJIL() {
        List<PaymentMethod> list = this.subPaymentMethods;
        if (list != null && (list.isEmpty() ^ true)) {
            return null;
        }
        List listLJI = LJI(this, false, 3);
        if (!(true ^ ((ArrayList) listLJI).isEmpty()) || listLJI == null) {
            return null;
        }
        return ((PaymentPromotion) ListProtector.get(listLJI, 0)).getPromotionLink();
    }

    public final boolean LJJIFFI() {
        PaymentCacheHelper paymentCacheHelper = PaymentCacheHelper.LIZ;
        String strLJIIJ = LJIIJ();
        paymentCacheHelper.getClass();
        Boolean boolLJIIIZ = PaymentCacheHelper.LJIIIZ(strLJIIJ);
        if (boolLJIIIZ != null) {
            return boolLJIIIZ.booleanValue();
        }
        List<ElementDTO> list = this.missingElements;
        return list != null && (list.isEmpty() ^ true);
    }

    public final String LJJII() {
        InterestFeePromotion interestFeePromotion;
        String str;
        InstallmentInfo installmentInfo = this.installmentInfo;
        if (installmentInfo != null && (interestFeePromotion = installmentInfo.interestFeePromotion) != null && (str = interestFeePromotion.desc) != null && C770702zh.LIZIZ(str)) {
            return str;
        }
        InstallmentInfo installmentInfo2 = this.installmentInfo;
        if (installmentInfo2 != null) {
            return installmentInfo2.interestFeePromotionDesc;
        }
        return null;
    }

    public final List<ElementDTO> LJJIII() {
        List<ElementDTO> list = this.neededElementDTOS;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ElementDTO elementDTO : list) {
            if (!C03S8.LJIILL(elementDTO.id)) {
                arrayList.add(elementDTO);
            }
        }
        return arrayList;
    }

    public final String LJJIIZ() {
        String str = this.secondType;
        return (((!((str == null || str.length() == 0) ^ true) || str == null) && (str = this.firstType) == null) || str.length() == 0 || str == null) ? "unknown" : str;
    }

    public final String LJJIJ() {
        ArrayList arrayList = new ArrayList();
        if (LJIILLIIL() != null) {
            arrayList.add("instant_discount");
        }
        if (LJJII() != null) {
            arrayList.add("interest_fee");
        }
        if (!arrayList.isEmpty()) {
            return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        }
        return null;
    }

    public final CashierSheetContent LJJIJIIJI() {
        CashierSheet next;
        List<CashierSheet> list = this.cashierSheet;
        if (list == null) {
            return null;
        }
        Iterator<CashierSheet> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            Integer num = next.scene;
            if (num != null && num.intValue() == 1) {
                break;
            }
        }
        CashierSheet cashierSheet = next;
        if (cashierSheet != null) {
            return cashierSheet.popup;
        }
        return null;
    }

    public final boolean LJJIL() {
        List<InstallmentPlan> list;
        InstallmentInfo installmentInfo = this.installmentInfo;
        if (installmentInfo == null || (list = installmentInfo.installmentPlans) == null || list.isEmpty()) {
            return false;
        }
        Iterator<InstallmentPlan> it2 = list.iterator();
        while (it2.hasNext()) {
            InterestFeePromotion interestFeePromotion = it2.next().interestFeePromotion;
            if (C770702zh.LIZIZ(interestFeePromotion != null ? interestFeePromotion.desc : null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJJIZ() {
        InstallmentInfo installmentInfo = this.installmentInfo;
        if (installmentInfo != null) {
            return Intrinsics.LJFF(installmentInfo.noPreselectTenure, Boolean.TRUE);
        }
        return false;
    }

    public final boolean LJJJ() {
        List<InstallmentPlan> list;
        PaymentPromotion paymentPromotion;
        InstallmentInfo installmentInfo = this.installmentInfo;
        if (installmentInfo == null) {
            List<InstallmentInfo> list2 = this.installmentInfoList;
            installmentInfo = list2 != null ? (InstallmentInfo) C13LP.LJJJLL(list2) : null;
        }
        if (installmentInfo == null || (list = installmentInfo.installmentPlans) == null || list.isEmpty()) {
            return false;
        }
        Iterator<InstallmentPlan> it2 = list.iterator();
        while (it2.hasNext()) {
            PaymentServiceFeeInfo paymentServiceFeeInfo = it2.next().paymentServiceFeeInfo;
            if (C770702zh.LIZIZ((paymentServiceFeeInfo == null || (paymentPromotion = paymentServiceFeeInfo.paymentPromotionInfo) == null) ? null : paymentPromotion.getDesc())) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJJJI() {
        return Intrinsics.LJFF(this.LJIILL, Boolean.TRUE);
    }

    public final boolean LJJJJ() {
        Availability availability = this.availability;
        if (availability == null || !Intrinsics.LJFF(availability.isAvailable(), Boolean.FALSE)) {
            return false;
        }
        BindInfo bindInfo = this.bindInfo;
        return !Intrinsics.LJFF(bindInfo != null ? bindInfo.bindStatus : null, "16");
    }

    public final boolean LJJJJI() {
        InstallmentInfo installmentInfo;
        return Intrinsics.LJFF(this.id, "pm_pi_ins_pipobnpl_c_d") && (installmentInfo = this.installmentInfo) != null && Intrinsics.LJFF(installmentInfo.hasFinancing, Boolean.TRUE) && C03PE.LIZ().enableUsBnpl;
    }

    public final boolean LJJJJIZL() {
        String str = this.id;
        return str != null && u.LJJIIJZLJL(str, "pm_pi_cci_", false);
    }

    public final boolean LJJJJJ() {
        List<InstallmentInfo> list;
        if (!this.LIZIZ) {
            return true;
        }
        InstallmentInfo installmentInfo = this.installmentInfo;
        List<InstallmentPlan> list2 = null;
        if (installmentInfo != null || ((list = this.installmentInfoList) != null && (installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list)) != null)) {
            list2 = installmentInfo.installmentPlans;
        }
        return !Intrinsics.LJFF(this.LJIIJ, Boolean.FALSE) && C756302xN.LIZ(list2);
    }

    public final boolean LJJJJJL() {
        BindInfo bindInfo = this.bindInfo;
        return Intrinsics.LJFF(bindInfo != null ? bindInfo.bindStatus : null, CardStruct.IStatusCode.DEFAULT);
    }

    public final boolean LJJJJL() {
        List<InstallmentPlan> list;
        List<PaymentPromotion> list2;
        List<InstallmentPlan> list3;
        List<InstallmentInfo> list4;
        List<String> list5 = C864803Zm.LIZ;
        if (!C13LP.LJJJJ(this.id, C864803Zm.LIZ)) {
            return false;
        }
        InstallmentInfo installmentInfo = this.installmentInfo;
        if ((installmentInfo == null && ((list4 = this.installmentInfoList) == null || (installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list4)) == null)) || (list = installmentInfo.installmentPlans) == null || list.isEmpty() || (list2 = this.promotionInfo) == null || list2.isEmpty() || (list3 = installmentInfo.installmentPlans) == null || list3.isEmpty()) {
            return false;
        }
        for (InstallmentPlan installmentPlan : list3) {
            MarketingTool marketingTool = installmentPlan.marketingTool;
            if (!C770702zh.LIZIZ(marketingTool != null ? marketingTool.text : null)) {
                PaymentPromotion paymentPromotion = installmentPlan.promotionInfo;
                if (C770702zh.LIZIZ(paymentPromotion != null ? paymentPromotion.getDesc() : null)) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean LJJJLZIJ() {
        if (!Intrinsics.LJFF(this.id, "pm_pi_ins_pipobnpl_c_d")) {
            return false;
        }
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("ec_payment_support_ttpl", false);
    }

    public final boolean LJJJZ() {
        Availability availability = this.availability;
        if (availability == null || !Intrinsics.LJFF(availability.isAvailable(), Boolean.FALSE)) {
            return false;
        }
        Availability availability2 = this.availability;
        return Intrinsics.LJFF(availability2 != null ? availability2.statusCode : null, "9990");
    }

    public final boolean LJJL() {
        EcomPaymentPromotionMergeModel ecomPaymentPromotionMergeModel = C03S0.LIZ;
        if (!C03S0.LIZ(this.id) || this.LJIIL == null) {
            return false;
        }
        Boolean bool = this.LJIIJJI;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            return true;
        }
        return this.LJIIJJI == null && C770702zh.LIZIZ(this.saveDisplayText) && Intrinsics.LJFF(this.defaultSave, bool2);
    }

    public final boolean LJJLI() {
        C7767031p c7767031p = this.LJFF;
        return Intrinsics.LJFF(c7767031p != null ? c7767031p.LJIIIIZZ : null, "hybrid");
    }

    public final void LJJLIIIJ() {
        Boolean bool = this.LJIJJLI;
        if (bool != null) {
            this.LJIIJ = Boolean.valueOf(bool.booleanValue());
        }
    }

    public final void LJJLIIIJILLIZJL() {
        this.availability = this.LJJII;
    }

    public final boolean LJJLIIIJJIZ() {
        BnplUpgradeData bnplUpgradeData;
        InstallmentInfo installmentInfo = this.installmentInfo;
        return C770702zh.LIZIZ((installmentInfo == null || (bnplUpgradeData = installmentInfo.bnplUpgradeData) == null) ? null : bnplUpgradeData.bnplUpgradeEntranceSchema);
    }

    public final List<PaymentElement> LJJLIIIJL() {
        ArrayList arrayList = new ArrayList();
        List<ElementDTO> list = this.neededElementDTOS;
        if (list != null) {
            Iterator<ElementDTO> it2 = list.iterator();
            while (it2.hasNext()) {
                List<ElementDTO> listLIZJ = it2.next().LIZJ();
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
                for (ElementDTO elementDTO : listLIZJ) {
                    arrayList2.add(new PaymentElement(elementDTO.id, elementDTO.paramName, null, elementDTO.needEncryption, Boolean.FALSE));
                }
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public final boolean LJJLIIIJLLLLLLLZ() {
        if (!Intrinsics.LJFF(this.id, "pm_pi_ccdc_all")) {
            C03SY c03sy = C03SY.LIZ;
            String str = this.id;
            c03sy.getClass();
            if (!C03SY.LJIIZILJ(str)) {
                return false;
            }
        }
        return C03MT.LIZ();
    }

    public final String LJ() {
        String string = UUID.randomUUID().toString();
        this.LJIILLIIL = string;
        return string;
    }

    public final List<String> LJIIIZ() {
        if (C870903al.LIZ() && C756302xN.LIZ(this.ccdcIconUrls)) {
            List<CCDCIcon> list = this.ccdcIconUrls;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<CCDCIcon> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next().lightIconUrl;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            return C13LP.LL(arrayList, 10);
        }
        List<PaymentMethod> list2 = this.subPaymentMethods;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<PaymentMethod> it3 = list2.iterator();
        while (it3.hasNext()) {
            String str2 = it3.next().iconUrl;
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        return C13LP.LL(arrayList2, 10);
    }

    public final String LJIIJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.id);
        sbLIZ.append(this.token);
        String str = this.LIZLLL;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LJJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = this.id;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        String str2 = this.token;
        sbLIZ.append(str2 != null ? str2 : "");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LJJJJLI() {
        return LJJJJI() || LJJJLZIJ();
    }

    public static boolean LJJJLIIL(PaymentMethod paymentMethod) {
        CommuteType commuteType;
        if (!paymentMethod.LIZ()) {
            return true;
        }
        CommuteInfo commuteInfoLJJIIJ = paymentMethod.LJJIIJ(true);
        CommuteType commuteType2 = null;
        if (commuteInfoLJJIIJ != null) {
            commuteType = commuteInfoLJJIIJ.commuteType;
        } else {
            commuteType = null;
        }
        CommuteType commuteType3 = CommuteType.APP_DISPLAY_TIPS_IF_NOT_INSTALL;
        if (commuteType == commuteType3) {
            return true;
        }
        CommuteInfo commuteInfoLJII = paymentMethod.LJII(true);
        if (commuteInfoLJII != null) {
            commuteType2 = commuteInfoLJII.commuteType;
        }
        if (commuteType2 == commuteType3) {
            return true;
        }
        return false;
    }

    public static boolean LJJLIIIIJ(CommuteInfo commuteInfo) {
        CommuteType commuteType = commuteInfo.commuteType;
        if (commuteType != CommuteType.APP && commuteType != CommuteType.APP_LINK && commuteType != CommuteType.WAP_TO_APP && commuteType != CommuteType.WAP_FILTER_APP && commuteType != CommuteType.SECRET_FREE_APP && commuteType != CommuteType.APP_NO_FILTER && commuteType != CommuteType.BROWSER_TO_APP) {
            return false;
        }
        return true;
    }

    public final CommuteInfo LJII(boolean z) {
        List<CommuteInfo> list;
        BindInfo bindInfo = this.bindInfo;
        CommuteInfo commuteInfo = null;
        if (bindInfo == null || (list = bindInfo.supportedBindCommuteTypes) == null) {
            return null;
        }
        for (CommuteInfo commuteInfo2 : list) {
            if (!LJJLIIIIJ(commuteInfo2) || LJJJIL(z)) {
                commuteInfo = commuteInfo2;
                break;
            }
        }
        return commuteInfo;
    }

    public final String LJIILIIL(boolean z) {
        PaymentPromotion paymentPromotionLJIIL = LJIIL();
        String selectedDescByCondition = null;
        if (paymentPromotionLJIIL != null) {
            if (z && !Intrinsics.LJFF(paymentPromotionLJIIL.isNotMeetPromotionThreshold(), Boolean.TRUE)) {
                selectedDescByCondition = paymentPromotionLJIIL.getSelectedDescByCondition();
                if (selectedDescByCondition == null || !C770702zh.LIZIZ(selectedDescByCondition)) {
                    return paymentPromotionLJIIL.getDescByCondition();
                }
            } else {
                return paymentPromotionLJIIL.getDescByCondition();
            }
        }
        return selectedDescByCondition;
    }

    public final String LJIJJ(boolean z) {
        List listLJI = LJI(this, false, 3);
        String selectedDescByCondition = null;
        if ((!((ArrayList) listLJI).isEmpty()) && listLJI != null) {
            if (z && !LJJJJLL()) {
                selectedDescByCondition = ((PaymentPromotion) ListProtector.get(listLJI, 0)).getSelectedDescByCondition();
                if (selectedDescByCondition == null || !C770702zh.LIZIZ(selectedDescByCondition)) {
                    return ((PaymentPromotion) ListProtector.get(listLJI, 0)).getDescByCondition();
                }
            } else {
                return ((PaymentPromotion) ListProtector.get(listLJI, 0)).getDescByCondition();
            }
        }
        return selectedDescByCondition;
    }

    public final String LJJ(boolean z) {
        if (z) {
            String str = this.iconUrlDark;
            if (str == null) {
                return this.iconUrl;
            }
            return str;
        }
        return this.iconUrl;
    }

    public final CommuteInfo LJJIIJ(boolean z) {
        List<CommuteInfo> list = this.supportedPayCommuteTypes;
        CommuteInfo commuteInfo = null;
        if (list == null) {
            return null;
        }
        for (CommuteInfo commuteInfo2 : list) {
            if (!LJJLIIIIJ(commuteInfo2) || LJJJIL(z)) {
                commuteInfo = commuteInfo2;
                break;
            }
        }
        return commuteInfo;
    }

    public final String LJJIIZI(boolean z) {
        if (LJJJI()) {
            return "primary";
        }
        if (z) {
            return "secondary";
        }
        return null;
    }

    public final String LJJIJIIJIL(boolean z) {
        PaymentPromotion paymentPromotion;
        PaymentServiceFeeInfo paymentServiceFeeInfo = this.paymentServiceFeeInfo;
        if (paymentServiceFeeInfo == null || (paymentPromotion = paymentServiceFeeInfo.paymentPromotionInfo) == null) {
            return null;
        }
        if (z && !LJJJJLL()) {
            String selectedDescByCondition = paymentPromotion.getSelectedDescByCondition();
            if (selectedDescByCondition == null) {
                return paymentPromotion.getDescByCondition();
            }
            return selectedDescByCondition;
        }
        return paymentPromotion.getDescByCondition();
    }

    public final String LJJIJIL(boolean z) {
        if (z) {
            PaymentLabel paymentLabel = this.paymentLabel;
            if (paymentLabel == null) {
                return null;
            }
            return paymentLabel.darkBackgroundColor;
        }
        PaymentLabel paymentLabel2 = this.paymentLabel;
        if (paymentLabel2 == null) {
            return null;
        }
        return paymentLabel2.backgroundColor;
    }

    public final String LJJIJL(boolean z) {
        if (z) {
            PaymentLabel paymentLabel = this.paymentLabel;
            if (paymentLabel == null) {
                return null;
            }
            return paymentLabel.darkFontColor;
        }
        PaymentLabel paymentLabel2 = this.paymentLabel;
        if (paymentLabel2 == null) {
            return null;
        }
        return paymentLabel2.fontColor;
    }

    public final List<Pair<String, String>> LJJIJLIJ(C03QB c03qb) {
        List<CardBinPromotion> cardBinPromos;
        String str;
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        new LinkedHashSet();
        List<PaymentMethod> list = this.subPaymentMethods;
        if (list != null) {
            for (PaymentMethod paymentMethod : list) {
                PaymentMethod paymentMethodLJIIJJI = C03Q4.LIZ.LJIIJJI(paymentMethod, c03qb, "getUniquePromotionRules");
                if (paymentMethodLJIIJJI == null) {
                    paymentMethodLJIIJJI = paymentMethod;
                }
                List<PaymentPromotion> list2 = paymentMethodLJIIJJI.promotionInfo;
                if (list2 != null) {
                    for (PaymentPromotion paymentPromotion : list2) {
                        CardBinPromotionInfo cardBinPromotionInfo = paymentPromotion.getCardBinPromotionInfo();
                        if (cardBinPromotionInfo != null && (cardBinPromos = cardBinPromotionInfo.getCardBinPromos()) != null && (!cardBinPromos.isEmpty())) {
                            for (CardBinPromotion cardBinPromotion : cardBinPromos) {
                                String str2 = cardBinPromotion.desc;
                                if (str2 != null) {
                                    String str3 = cardBinPromotion.promotionUniqueKey;
                                    if (str3 != null) {
                                        str2 = str3;
                                    }
                                    if (!linkedHashSet.contains(str2)) {
                                        BankMeta bankMeta = cardBinPromotion.bankMeta;
                                        if (bankMeta != null) {
                                            str = bankMeta.iconUrl;
                                        } else {
                                            str = null;
                                        }
                                        arrayList.add(new Pair(str, cardBinPromotion.desc));
                                        String str4 = cardBinPromotion.promotionUniqueKey;
                                        if (str4 == null) {
                                            str4 = cardBinPromotion.desc;
                                        }
                                        linkedHashSet.add(str4);
                                    }
                                }
                            }
                        } else {
                            String desc = paymentPromotion.getDesc();
                            if (desc != null && C770702zh.LIZIZ(desc)) {
                                arrayList.add(new Pair(paymentMethod.iconUrl, desc));
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean LJJJIL(boolean z) {
        boolean zLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.id);
        sbLIZ.append('|');
        sbLIZ.append(this.packageName);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            if (this.id != null) {
                PaymentCacheHelper.LIZ.getClass();
                Object objLIZ = C959003oy.LIZ(PaymentCacheHelper.LJIIJJI, new AwS86S1000000_1(strLIZIZ, 7));
                if (C189200o6.m7isFailureimpl(objLIZ)) {
                    objLIZ = null;
                }
                Boolean bool = (Boolean) objLIZ;
                if (bool != null) {
                    return bool.booleanValue();
                }
            }
            synchronized (this) {
                try {
                    System.currentTimeMillis();
                    C1725790v0j c1725790v0j = C1725790v0j.LIZ;
                    String str = this.packageName;
                    String str2 = this.schema;
                    c1725790v0j.getClass();
                    zLIZIZ = C1725790v0j.LIZIZ(str, str2);
                    System.currentTimeMillis();
                    PaymentCacheHelper.LIZ.getClass();
                    C959003oy.LIZ(PaymentCacheHelper.LJIIJJI, new C837203Ow(strLIZIZ, zLIZIZ));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return zLIZIZ;
        }
        System.currentTimeMillis();
        C1725790v0j c1725790v0j2 = C1725790v0j.LIZ;
        String str3 = this.packageName;
        String str4 = this.schema;
        c1725790v0j2.getClass();
        boolean zLIZIZ2 = C1725790v0j.LIZIZ(str3, str4);
        System.currentTimeMillis();
        return zLIZIZ2;
    }

    public final boolean LJJJJZ(PaymentMethod paymentMethod) {
        List<PaymentMethod> list;
        if (paymentMethod == null || (list = this.subPaymentMethods) == null) {
            return false;
        }
        for (PaymentMethod paymentMethod2 : list) {
            if (C899503fN.LIZIZ(paymentMethod2, paymentMethod)) {
                if (paymentMethod2 == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean LJJJLL(List<PaymentMethod> list) {
        String str = this.id;
        if ((str == null || !u.LJJIIJZLJL(str, "pm_pi_ccdc_", false)) && !C03S8.LJIILJJIL(this.id)) {
            C03SY c03sy = C03SY.LIZ;
            String str2 = this.id;
            c03sy.getClass();
            if (C03SY.LJIJI(str2) || C03S8.LJJIFFI(this.id, false, true)) {
                return false;
            }
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((PaymentMethod) it2.next()).id, this.id)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final void LJJLIIIJJI(String str) {
        Availability availability = this.availability;
        this.LJJII = availability;
        if (availability != null) {
            this.availability = availability.copy(Boolean.FALSE, availability.unavailableCode, availability.unavailableReason, availability.unavailablePopupTitle, "9990");
            this.installationTips = str;
        }
    }

    public final void LJJLIIIJLJLI(PaymentMethod paymentMethod) {
        List<PaymentPromotion> list;
        CardBinPromotionInfo cardBinPromotionInfo;
        List<CardBinPromotion> cardBinPromos;
        String str;
        ArrayList arrayList = null;
        if (paymentMethod != null && (list = paymentMethod.promotionInfo) != null) {
            ArrayList<PaymentPromotion> arrayList2 = new ArrayList();
            CardBinPromotion cardBinPromotion = null;
            for (PaymentPromotion paymentPromotion : list) {
                CardBinPromotionInfo cardBinPromotionInfo2 = paymentPromotion.getCardBinPromotionInfo();
                if (cardBinPromotionInfo2 != null && (cardBinPromos = cardBinPromotionInfo2.getCardBinPromos()) != null) {
                    Iterator<CardBinPromotion> it2 = cardBinPromos.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            CardBinPromotion next = it2.next();
                            cardBinPromotion = next;
                            String str2 = cardBinPromotion.cardBin;
                            if (str2 != null && (str = this.LIZLLL) != null && u.LJJIIJZLJL(str, str2, false)) {
                                if (next != null) {
                                    arrayList2.add(paymentPromotion);
                                }
                            }
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                for (PaymentPromotion paymentPromotion2 : arrayList2) {
                    if (cardBinPromotion != null) {
                        cardBinPromotionInfo = new CardBinPromotionInfo(Collections.singletonList(cardBinPromotion));
                    } else {
                        cardBinPromotionInfo = null;
                    }
                    arrayList3.add(paymentPromotion2.copy(paymentPromotion2.desc, paymentPromotion2.selectedDesc, paymentPromotion2.amount, paymentPromotion2.descInEditStatus, cardBinPromotionInfo, paymentPromotion2.promotionId, paymentPromotion2.promotionAmountValue, paymentPromotion2.promotionCurrency, paymentPromotion2.promotionLink, paymentPromotion2.promotionDescHeader, paymentPromotion2.isNotMeetPromotionThreshold, paymentPromotion2.promotionBatchId, paymentPromotion2.notDeductableOnMarketingBindPaymentMethod, paymentPromotion2.hideMarketingAmount, paymentPromotion2.couponDimensions, paymentPromotion2.isCardBindPromotion, paymentPromotion2.cardBindPromotionPopupInfo, paymentPromotion2.cashierBindPiPromoDesc, paymentPromotion2.cashierBindPiPromoDescSelected, paymentPromotion2.daInfo, paymentPromotion2.promotionFormat, paymentPromotion2.isBonusTypePromotion));
                }
                arrayList = arrayList3;
            }
        }
        this.promotionInfo = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJI(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r26, boolean r27, int r28) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod.LJI(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, boolean, int):java.util.List");
    }

    public static PaymentMethod LIZJ(PaymentMethod paymentMethod, String str, String str2, List list, List list2, String str3, String str4, Availability availability, InstallmentInfo installmentInfo, PaymentTip paymentTip, boolean z, String str5, C7767031p c7767031p, PaymentServiceFeeInfo paymentServiceFeeInfo, String str6, HybridPaymentInfo hybridPaymentInfo, Boolean bool, int i, int i2, int i3) {
        String str7;
        String str8;
        String str9;
        List<ElementDTO> list3;
        Boolean bool2;
        Boolean bool3;
        String str10;
        String str11;
        Boolean bool4;
        String str12;
        String str13;
        Boolean bool5;
        String str14;
        String str15;
        List<ElementDTO> list4;
        BindInfo bindInfo;
        ExceptionUX exceptionUX;
        List<CommuteInfo> list5;
        String str16;
        String str17;
        PaymentMethod paymentMethod2;
        UnfoldStrategy unfoldStrategy;
        List<String> list6;
        Boolean bool6;
        Boolean bool7;
        String str18;
        PaymentLabel paymentLabel;
        ExtraFeeStatement extraFeeStatement;
        List<PaymentTip> list7;
        String str19;
        PaymentBanner paymentBanner;
        List<CCDCIcon> list8;
        PaymentCertification paymentCertification;
        boolean z2;
        Long l;
        int i4;
        List<ElementDTO> list9;
        List<InstallmentInfo> list10;
        int i5;
        String str20;
        int i6;
        C835503Of c835503Of;
        int i7;
        List<CashierSheet> list11;
        int i8;
        List<SaveSecurityBlock> list12;
        int i9;
        List<SaveSecuritySection> list13;
        int i10;
        C835503Of c835503Of2;
        int i11;
        String str21;
        int i12;
        Boolean bool8;
        int i13;
        String str22;
        int i14;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        Boolean bool9;
        List<ElementDTO> list14;
        Boolean bool10;
        List<String> list15;
        Boolean bool11;
        AppealStatus appealStatus;
        List<CCDCIcon> list16;
        String str29;
        ECRichText eCRichText;
        PayRedirectNavBar payRedirectNavBar;
        String str30;
        Boolean bool12;
        String str31;
        int i15;
        Boolean bool13;
        int i16;
        Boolean bool14;
        int i17;
        String str32;
        int i18;
        Boolean bool15;
        int i19;
        C03OY c03oy;
        int i20;
        C03OZ c03oz;
        int i21;
        String str33;
        int i22;
        Boolean bool16;
        int i23;
        Boolean bool17;
        int i24;
        PaymentTooltip paymentTooltip;
        String str34;
        Boolean bool18;
        Boolean bool19;
        Boolean bool20;
        String str35;
        Boolean bool21 = bool;
        String str36 = str6;
        PaymentServiceFeeInfo paymentServiceFeeInfo2 = paymentServiceFeeInfo;
        C7767031p c7767031p2 = c7767031p;
        String str37 = str3;
        String str38 = str4;
        PaymentTip paymentTip2 = paymentTip;
        String str39 = str5;
        InstallmentInfo installmentInfo2 = installmentInfo;
        List list17 = list2;
        List list18 = list;
        HybridPaymentInfo hybridPaymentInfo2 = hybridPaymentInfo;
        String str40 = str;
        boolean z3 = z;
        String str41 = str2;
        Availability availability2 = availability;
        if ((i & 1) != 0) {
            str7 = paymentMethod.id;
        } else {
            str7 = null;
        }
        if ((i & 2) != 0) {
            str40 = paymentMethod.displayName;
        }
        if ((i & 4) != 0) {
            str8 = paymentMethod.firstType;
        } else {
            str8 = null;
        }
        if ((i & 8) != 0) {
            str9 = paymentMethod.secondType;
        } else {
            str9 = null;
        }
        if ((i & 16) != 0) {
            str41 = paymentMethod.iconUrl;
        }
        if ((i & 32) != 0) {
            list3 = paymentMethod.elementDTOS;
        } else {
            list3 = null;
        }
        if ((i & 64) != 0) {
            bool2 = paymentMethod.pciSensitive;
        } else {
            bool2 = null;
        }
        if ((i & 128) != 0) {
            list18 = paymentMethod.subPaymentMethods;
        }
        if ((i & 256) != 0) {
            bool3 = paymentMethod.isDeepLink;
        } else {
            bool3 = null;
        }
        if ((i & 512) != 0) {
            str10 = paymentMethod.packageName;
        } else {
            str10 = null;
        }
        if ((i & 1024) != 0) {
            str11 = paymentMethod.schema;
        } else {
            str11 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool4 = paymentMethod.hideIfNotInstall;
        } else {
            bool4 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str12 = paymentMethod.extraInfo;
        } else {
            str12 = null;
        }
        if ((i & 8192) != 0) {
            list17 = paymentMethod.promotionInfo;
        }
        if ((i & 16384) != 0) {
            str37 = paymentMethod.saveDisplayText;
        }
        if ((i & 32768) != 0) {
            str13 = paymentMethod.maskedIdentity;
        } else {
            str13 = null;
        }
        if ((65536 & i) != 0) {
            bool5 = paymentMethod.isPrimary;
        } else {
            bool5 = null;
        }
        if ((i & 131072) != 0) {
            str14 = paymentMethod.token;
        } else {
            str14 = null;
        }
        if ((262144 & i) != 0) {
            str15 = paymentMethod.saveNotificationUrl;
        } else {
            str15 = null;
        }
        if ((524288 & i) != 0) {
            list4 = paymentMethod.neededElementDTOS;
        } else {
            list4 = null;
        }
        if ((1048576 & i) != 0) {
            str38 = paymentMethod.balance;
        }
        if ((2097152 & i) != 0) {
            availability2 = paymentMethod.availability;
        }
        if ((4194304 & i) != 0) {
            bindInfo = paymentMethod.bindInfo;
        } else {
            bindInfo = null;
        }
        if ((8388608 & i) != 0) {
            exceptionUX = paymentMethod.exceptionUX;
        } else {
            exceptionUX = null;
        }
        if ((16777216 & i) != 0) {
            list5 = paymentMethod.supportedPayCommuteTypes;
        } else {
            list5 = null;
        }
        if ((33554432 & i) != 0) {
            str16 = paymentMethod.orderPaymentTips;
        } else {
            str16 = null;
        }
        if ((67108864 & i) != 0) {
            str17 = paymentMethod.prompt;
        } else {
            str17 = null;
        }
        if ((134217728 & i) != 0) {
            paymentMethod2 = paymentMethod.LIZ;
        } else {
            paymentMethod2 = null;
        }
        if ((268435456 & i) != 0) {
            unfoldStrategy = paymentMethod.unfoldStrategy;
        } else {
            unfoldStrategy = null;
        }
        if ((536870912 & i) != 0) {
            installmentInfo2 = paymentMethod.installmentInfo;
        }
        if ((1073741824 & i) != 0) {
            list6 = paymentMethod.supportCardList;
        } else {
            list6 = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            bool6 = paymentMethod.isChooseRecommend;
        } else {
            bool6 = null;
        }
        if ((i2 & 1) != 0) {
            bool7 = paymentMethod.shouldReloadBillInfo;
        } else {
            bool7 = null;
        }
        if ((i2 & 2) != 0) {
            str18 = paymentMethod.explanationUrl;
        } else {
            str18 = null;
        }
        if ((i2 & 4) != 0) {
            paymentLabel = paymentMethod.paymentLabel;
        } else {
            paymentLabel = null;
        }
        if ((i2 & 8) != 0) {
            extraFeeStatement = paymentMethod.extraFeeStatement;
        } else {
            extraFeeStatement = null;
        }
        if ((i2 & 16) != 0) {
            paymentTip2 = paymentMethod.paymentTip;
        }
        if ((i2 & 32) != 0) {
            list7 = paymentMethod.additionalTips;
        } else {
            list7 = null;
        }
        if ((i2 & 64) != 0) {
            str19 = paymentMethod.ccdcCardTip;
        } else {
            str19 = null;
        }
        if ((i2 & 128) != 0) {
            paymentBanner = paymentMethod.paymentBanner;
        } else {
            paymentBanner = null;
        }
        if ((i2 & 256) != 0) {
            list8 = paymentMethod.ccdcIconUrls;
        } else {
            list8 = null;
        }
        if ((i2 & 512) != 0) {
            paymentCertification = paymentMethod.ccdcSafeTip;
        } else {
            paymentCertification = null;
        }
        if ((i2 & 1024) != 0) {
            z3 = paymentMethod.LIZIZ;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z2 = paymentMethod.LIZJ;
        } else {
            z2 = false;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str39 = paymentMethod.LIZLLL;
        }
        if ((i2 & 8192) != 0) {
            l = paymentMethod.LJ;
        } else {
            l = null;
        }
        if ((i2 & 16384) != 0) {
            c7767031p2 = paymentMethod.LJFF;
        }
        if ((i2 & 32768) != 0) {
            list9 = paymentMethod.missingElements;
            i4 = 65536;
        } else {
            i4 = 65536;
            list9 = null;
        }
        if ((i4 & i2) != 0) {
            list10 = paymentMethod.installmentInfoList;
        } else {
            list10 = null;
        }
        if ((i2 & 131072) != 0) {
            str20 = paymentMethod.paymentSubTitle;
            i5 = 262144;
        } else {
            i5 = 262144;
            str20 = null;
        }
        if ((i5 & i2) != 0) {
            c835503Of = paymentMethod.LJI;
            i6 = 524288;
        } else {
            i6 = 524288;
            c835503Of = null;
        }
        if ((i6 & i2) != 0) {
            list11 = paymentMethod.cashierSheet;
            i7 = 1048576;
        } else {
            i7 = 1048576;
            list11 = null;
        }
        if ((i7 & i2) != 0) {
            list12 = paymentMethod.saveSecurityInfo;
            i8 = 2097152;
        } else {
            i8 = 2097152;
            list12 = null;
        }
        if ((i8 & i2) != 0) {
            list13 = paymentMethod.saveSecuritySection;
            i9 = 4194304;
        } else {
            i9 = 4194304;
            list13 = null;
        }
        if ((i9 & i2) != 0) {
            c835503Of2 = paymentMethod.LJII;
            i10 = 8388608;
        } else {
            i10 = 8388608;
            c835503Of2 = null;
        }
        if ((i10 & i2) != 0) {
            str21 = paymentMethod.LJIIIIZZ;
            i11 = 16777216;
        } else {
            i11 = 16777216;
            str21 = null;
        }
        if ((i11 & i2) != 0) {
            bool8 = paymentMethod.defaultSave;
            i12 = 33554432;
        } else {
            i12 = 33554432;
            bool8 = null;
        }
        if ((i12 & i2) != 0) {
            str22 = paymentMethod.checkoutButtonImage;
            i13 = 67108864;
        } else {
            i13 = 67108864;
            str22 = null;
        }
        if ((i13 & i2) != 0) {
            str23 = paymentMethod.darkCheckoutButtonImage;
            i14 = 134217728;
        } else {
            i14 = 134217728;
            str23 = null;
        }
        if ((i14 & i2) != 0) {
            str24 = paymentMethod.checkoutButtonColor;
        } else {
            str24 = null;
        }
        if ((268435456 & i2) != 0) {
            str25 = paymentMethod.darkCheckoutButtonColor;
        } else {
            str25 = null;
        }
        if ((536870912 & i2) != 0) {
            str26 = paymentMethod.eventsForClient;
        } else {
            str26 = null;
        }
        if ((1073741824 & i2) != 0) {
            str27 = paymentMethod.installationTips;
        } else {
            str27 = null;
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            paymentServiceFeeInfo2 = paymentMethod.paymentServiceFeeInfo;
        }
        if ((i3 & 1) != 0) {
            str28 = paymentMethod.newPaymentMethodTitle;
        } else {
            str28 = null;
        }
        if ((i3 & 2) != 0) {
            str36 = paymentMethod.LJIIIZ;
        }
        if ((i3 & 4) != 0) {
            bool9 = paymentMethod.neededCVV;
        } else {
            bool9 = null;
        }
        if ((i3 & 8) != 0) {
            list14 = paymentMethod.popupNeededElements;
        } else {
            list14 = null;
        }
        if ((i3 & 16) != 0) {
            hybridPaymentInfo2 = paymentMethod.hybridPaymentInfo;
        }
        if ((i3 & 32) != 0) {
            bool10 = paymentMethod.newBindCardFlow;
        } else {
            bool10 = null;
        }
        if ((i3 & 64) != 0) {
            list15 = paymentMethod.bindCardTips;
        } else {
            list15 = null;
        }
        if ((i3 & 128) != 0) {
            bool11 = paymentMethod.canAppeal;
        } else {
            bool11 = null;
        }
        if ((i3 & 256) != 0) {
            appealStatus = paymentMethod.appealStatus;
        } else {
            appealStatus = null;
        }
        if ((i3 & 512) != 0) {
            bool21 = paymentMethod.LJIIJ;
        }
        if ((i3 & 1024) != 0) {
            list16 = paymentMethod.subIconUrls;
        } else {
            list16 = null;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str29 = paymentMethod.halfScreenTitle;
        } else {
            str29 = null;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            eCRichText = paymentMethod.subDisplayName;
        } else {
            eCRichText = null;
        }
        if ((i3 & 8192) != 0) {
            payRedirectNavBar = paymentMethod.payRedirectNavBar;
        } else {
            payRedirectNavBar = null;
        }
        if ((i3 & 16384) != 0) {
            str30 = paymentMethod.paymentPriceVersionId;
        } else {
            str30 = null;
        }
        if ((32768 & i3) != 0) {
            bool12 = paymentMethod.needsIndependentPricing;
        } else {
            bool12 = null;
        }
        if ((65536 & i3) != 0) {
            str31 = paymentMethod.paymentUnitId;
        } else {
            str31 = null;
        }
        if ((i3 & 131072) != 0) {
            bool13 = paymentMethod.isInstallment;
            i15 = 262144;
        } else {
            i15 = 262144;
            bool13 = null;
        }
        if ((i15 & i3) != 0) {
            bool14 = paymentMethod.disableBraintreeSdk;
            i16 = 524288;
        } else {
            i16 = 524288;
            bool14 = null;
        }
        if ((i16 & i3) != 0) {
            str32 = paymentMethod.cardBin;
            i17 = 1048576;
        } else {
            i17 = 1048576;
            str32 = null;
        }
        if ((i17 & i3) != 0) {
            bool15 = paymentMethod.LJIIJJI;
            i18 = 2097152;
        } else {
            i18 = 2097152;
            bool15 = null;
        }
        if ((i18 & i3) != 0) {
            c03oy = paymentMethod.LJIIL;
            i19 = 4194304;
        } else {
            i19 = 4194304;
            c03oy = null;
        }
        if ((i19 & i3) != 0) {
            c03oz = paymentMethod.LJIILIIL;
            i20 = 8388608;
        } else {
            i20 = 8388608;
            c03oz = null;
        }
        if ((i20 & i3) != 0) {
            str33 = paymentMethod.LJIILJJIL;
            i21 = 16777216;
        } else {
            i21 = 16777216;
            str33 = null;
        }
        if ((i21 & i3) != 0) {
            bool16 = paymentMethod.needsSecondaryQueryInstallment;
            i22 = 33554432;
        } else {
            i22 = 33554432;
            bool16 = null;
        }
        if ((i22 & i3) != 0) {
            bool17 = paymentMethod.LJIILL;
            i23 = 67108864;
        } else {
            i23 = 67108864;
            bool17 = null;
        }
        if ((i23 & i3) != 0) {
            paymentTooltip = paymentMethod.paymentTooltip;
            i24 = 134217728;
        } else {
            i24 = 134217728;
            paymentTooltip = null;
        }
        if ((i24 & i3) != 0) {
            str34 = paymentMethod.lastFour;
        } else {
            str34 = null;
        }
        if ((268435456 & i3) != 0) {
            bool18 = paymentMethod.isClientBind;
        } else {
            bool18 = null;
        }
        if ((536870912 & i3) != 0) {
            bool19 = paymentMethod.supportDonation;
        } else {
            bool19 = null;
        }
        if ((1073741824 & i3) != 0) {
            bool20 = paymentMethod.isExpand;
        } else {
            bool20 = null;
        }
        if ((i3 & Integer.MIN_VALUE) != 0) {
            str35 = paymentMethod.additionalClarification;
        } else {
            str35 = null;
        }
        PaymentButtonInfo paymentButtonInfo = paymentMethod.pageButtonInfo;
        HybridPaymentInfo hybridPaymentInfo3 = paymentMethod.anchoredPaymentInfo;
        String str42 = paymentMethod.appealId;
        Integer num = paymentMethod.interactionStyle;
        PaymentTip paymentTip3 = paymentMethod.remainAmountTips;
        RecurringPaymentInfo recurringPaymentInfo = paymentMethod.recurringPaymentInfo;
        PopupInfo popupInfo = paymentMethod.popupInfo;
        String str43 = paymentMethod.daInfo;
        RecoveryMarketingInfo recoveryMarketingInfo = paymentMethod.recoveryMarketingInfo;
        String str44 = paymentMethod.iconUrlDark;
        Amount amount = paymentMethod.balanceAmount;
        paymentMethod.getClass();
        return new PaymentMethod(str7, str40, str8, str9, str41, list3, bool2, list18, bool3, str10, str11, bool4, str12, list17, str37, str13, bool5, str14, str15, list4, str38, availability2, bindInfo, exceptionUX, list5, str16, str17, paymentMethod2, unfoldStrategy, installmentInfo2, list6, bool6, bool7, str18, paymentLabel, extraFeeStatement, paymentTip2, list7, str19, paymentBanner, list8, paymentCertification, z3, z2, str39, l, c7767031p2, list9, list10, str20, c835503Of, list11, list12, list13, c835503Of2, str21, bool8, str22, str23, str24, str25, str26, str27, paymentServiceFeeInfo2, str28, str36, bool9, list14, hybridPaymentInfo2, bool10, list15, bool11, appealStatus, bool21, list16, str29, eCRichText, payRedirectNavBar, str30, bool12, str31, bool13, bool14, str32, bool15, c03oy, c03oz, str33, bool16, bool17, paymentTooltip, str34, bool18, bool19, bool20, str35, paymentButtonInfo, hybridPaymentInfo3, str42, num, paymentTip3, recurringPaymentInfo, popupInfo, str43, recoveryMarketingInfo, str44, amount);
    }

    public PaymentMethod(String str, String str2, String str3, String str4, String str5, List<ElementDTO> list, Boolean bool, List<PaymentMethod> list2, Boolean bool2, String str6, String str7, Boolean bool3, String str8, List<PaymentPromotion> list3, String str9, String str10, Boolean bool4, String str11, String str12, List<ElementDTO> list4, String str13, Availability availability, BindInfo bindInfo, ExceptionUX exceptionUX, List<CommuteInfo> list5, String str14, String str15, PaymentMethod paymentMethod, UnfoldStrategy unfoldStrategy, InstallmentInfo installmentInfo, List<String> list6, Boolean bool5, Boolean bool6, String str16, PaymentLabel paymentLabel, ExtraFeeStatement extraFeeStatement, PaymentTip paymentTip, List<PaymentTip> list7, String str17, PaymentBanner paymentBanner, List<CCDCIcon> list8, PaymentCertification paymentCertification, boolean z, boolean z2, String str18, Long l, C7767031p c7767031p, List<ElementDTO> list9, List<InstallmentInfo> list10, String str19, C835503Of c835503Of, List<CashierSheet> list11, List<SaveSecurityBlock> list12, List<SaveSecuritySection> list13, C835503Of c835503Of2, String str20, Boolean bool7, String str21, String str22, String str23, String str24, String str25, String str26, PaymentServiceFeeInfo paymentServiceFeeInfo, String str27, String str28, Boolean bool8, List<ElementDTO> list14, HybridPaymentInfo hybridPaymentInfo, Boolean bool9, List<String> list15, Boolean bool10, AppealStatus appealStatus, Boolean bool11, List<CCDCIcon> list16, String str29, ECRichText eCRichText, PayRedirectNavBar payRedirectNavBar, String str30, Boolean bool12, String str31, Boolean bool13, Boolean bool14, String str32, Boolean bool15, C03OY c03oy, C03OZ c03oz, String str33, Boolean bool16, Boolean bool17, PaymentTooltip paymentTooltip, String str34, Boolean bool18, Boolean bool19, Boolean bool20, String str35, PaymentButtonInfo paymentButtonInfo, HybridPaymentInfo hybridPaymentInfo2, String str36, Integer num, PaymentTip paymentTip2, RecurringPaymentInfo recurringPaymentInfo, PopupInfo popupInfo, String str37, RecoveryMarketingInfo recoveryMarketingInfo, String str38, Amount amount) {
        this.id = str;
        this.displayName = str2;
        this.firstType = str3;
        this.secondType = str4;
        this.iconUrl = str5;
        this.elementDTOS = list;
        this.pciSensitive = bool;
        this.subPaymentMethods = list2;
        this.isDeepLink = bool2;
        this.packageName = str6;
        this.schema = str7;
        this.hideIfNotInstall = bool3;
        this.extraInfo = str8;
        this.promotionInfo = list3;
        this.saveDisplayText = str9;
        this.maskedIdentity = str10;
        this.isPrimary = bool4;
        this.token = str11;
        this.saveNotificationUrl = str12;
        this.neededElementDTOS = list4;
        this.balance = str13;
        this.availability = availability;
        this.bindInfo = bindInfo;
        this.exceptionUX = exceptionUX;
        this.supportedPayCommuteTypes = list5;
        this.orderPaymentTips = str14;
        this.prompt = str15;
        this.LIZ = paymentMethod;
        this.unfoldStrategy = unfoldStrategy;
        this.installmentInfo = installmentInfo;
        this.supportCardList = list6;
        this.isChooseRecommend = bool5;
        this.shouldReloadBillInfo = bool6;
        this.explanationUrl = str16;
        this.paymentLabel = paymentLabel;
        this.extraFeeStatement = extraFeeStatement;
        this.paymentTip = paymentTip;
        this.additionalTips = list7;
        this.ccdcCardTip = str17;
        this.paymentBanner = paymentBanner;
        this.ccdcIconUrls = list8;
        this.ccdcSafeTip = paymentCertification;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = str18;
        this.LJ = l;
        this.LJFF = c7767031p;
        this.missingElements = list9;
        this.installmentInfoList = list10;
        this.paymentSubTitle = str19;
        this.LJI = c835503Of;
        this.cashierSheet = list11;
        this.saveSecurityInfo = list12;
        this.saveSecuritySection = list13;
        this.LJII = c835503Of2;
        this.LJIIIIZZ = str20;
        this.defaultSave = bool7;
        this.checkoutButtonImage = str21;
        this.darkCheckoutButtonImage = str22;
        this.checkoutButtonColor = str23;
        this.darkCheckoutButtonColor = str24;
        this.eventsForClient = str25;
        this.installationTips = str26;
        this.paymentServiceFeeInfo = paymentServiceFeeInfo;
        this.newPaymentMethodTitle = str27;
        this.LJIIIZ = str28;
        this.neededCVV = bool8;
        this.popupNeededElements = list14;
        this.hybridPaymentInfo = hybridPaymentInfo;
        this.newBindCardFlow = bool9;
        this.bindCardTips = list15;
        this.canAppeal = bool10;
        this.appealStatus = appealStatus;
        this.LJIIJ = bool11;
        this.subIconUrls = list16;
        this.halfScreenTitle = str29;
        this.subDisplayName = eCRichText;
        this.payRedirectNavBar = payRedirectNavBar;
        this.paymentPriceVersionId = str30;
        this.needsIndependentPricing = bool12;
        this.paymentUnitId = str31;
        this.isInstallment = bool13;
        this.disableBraintreeSdk = bool14;
        this.cardBin = str32;
        this.LJIIJJI = bool15;
        this.LJIIL = c03oy;
        this.LJIILIIL = c03oz;
        this.LJIILJJIL = str33;
        this.needsSecondaryQueryInstallment = bool16;
        this.LJIILL = bool17;
        this.paymentTooltip = paymentTooltip;
        this.lastFour = str34;
        this.isClientBind = bool18;
        this.supportDonation = bool19;
        this.isExpand = bool20;
        this.additionalClarification = str35;
        this.pageButtonInfo = paymentButtonInfo;
        this.anchoredPaymentInfo = hybridPaymentInfo2;
        this.appealId = str36;
        this.interactionStyle = num;
        this.remainAmountTips = paymentTip2;
        this.recurringPaymentInfo = recurringPaymentInfo;
        this.popupInfo = popupInfo;
        this.daInfo = str37;
        this.recoveryMarketingInfo = recoveryMarketingInfo;
        this.iconUrlDark = str38;
        this.balanceAmount = amount;
        this.LJIILLIIL = "";
    }
}
