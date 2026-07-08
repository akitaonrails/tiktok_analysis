package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomCheckoutAnchoredPaymentMethodConfigModel {

    @C09CT("add_anchor_methods_for_remote_methods_update_check")
    public final boolean checkAnchorMethodsForUpdate;

    @C09CT("check_availability")
    public final boolean checkAvailability;

    @C09CT("disable_subscribe_summary")
    public final boolean disableSubscribeSummary;

    @C09CT("do_not_select_parent_method_directly")
    public final boolean doNotSelectParentMethodDirectly;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_clear_anchor_payment_info")
    public final boolean enableClearAnchorPaymentInfo;

    @C09CT("enable_close_combine_page")
    public final boolean enableCloseCombinePage;

    @C09CT("enable_fill_installment_info_params")
    public final boolean enableFillInstallmentInfoParams;

    @C09CT("enable_find_summary_for_anchor_with_only_installment_plan")
    public final boolean enableFindSummary;

    @C09CT("enable_fix_installment_plan_default_selection")
    public final boolean enableFixInstallmentPlanDefaultSelection;

    @C09CT("enable_get_sub_payment_method")
    public final boolean enableGetSubPaymentMethod;

    @C09CT("enable_multi_instance_identifier")
    public final boolean enableIdentifier;

    @C09CT("enable_use_new_sheet_container")
    public final boolean enableNewContainer;

    @C09CT("enable_osp_button_log")
    public final boolean enableOspButtonLog;

    @C09CT("enable_osp_payment_summary")
    public final boolean enableOspPaymentSummary;

    @C09CT("enable_resort_payment_methods")
    public final boolean enableResort;

    @C09CT("enable_selection_default_installment_plan")
    public final boolean enableSelectionDefaultInstallmentPlan;

    @C09CT("enable_separate_installment_plan_selection")
    public final boolean enableSeparateSelection;

    @C09CT("enable_summary_simple_mode")
    public final boolean enableSummarySimpleMode;

    @C09CT("enable_update_amount_when_select_sub_payment_method")
    public final boolean enableUpdateAmountWhenSelectSubPaymentMethod;

    @C09CT("enable_update_payment_method_data_for_enter_params")
    public final boolean enableUpdateEnterParams;

    @C09CT("enable_update_installment_plan_when_select")
    public final boolean enableUpdateInstallmentPlanWhenSelect;

    @C09CT("enable_update_summary")
    public final boolean enableUpdateSummary;

    @C09CT("ensure_identifier_as_same")
    public final boolean ensureIdentifierAsSame;

    @C09CT("fix_promotion_update")
    public final boolean fixPromotionUpdate;

    @C09CT("hide_payment_method_promotion_tag")
    public final boolean hidePaymentMethodPromotionTag;

    @C09CT("recommend_payment_methods")
    public final List<String> methods;

    @C09CT("new_sheet_container_max_height_ratio")
    public final float newSheetContainerMaxHeightRatio;

    @C09CT("new_sheet_container_peek_height_ratio")
    public final float newSheetContainerPeekHeightRatio;

    @C09CT("enable_refresh_anchor_payment_info")
    public final boolean refreshPaymentInfo;

    @C09CT("enable_select_recommend_method_for_anchor")
    public final boolean selectRecommendMethodForAnchor;

    @C09CT("enable_cached_card_info_update_after_page_close")
    public final int updateCacheInfo;

    @C09CT("use_independent_pricing_fields_first")
    public final boolean useIndependentPricingFieldsFirst;

    public EcomCheckoutAnchoredPaymentMethodConfigModel() {
        this(true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, C1697810uHb.LJIIJJI("pm_pi_ew_pipocredit_c_d", "pm_pi_ew_pipowallet_c_d"), true, true, true, 3, true, 0.73f, 0.9f, true, true, true, true, true, true, true, true, true, true);
    }

    public EcomCheckoutAnchoredPaymentMethodConfigModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List<String> list, boolean z16, boolean z17, boolean z18, int i, boolean z19, float f, float f2, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29) {
        this.enable = z;
        this.checkAvailability = z2;
        this.enableSeparateSelection = z3;
        this.enableIdentifier = z4;
        this.enableUpdateEnterParams = z5;
        this.enableOspPaymentSummary = z6;
        this.enableUpdateSummary = z7;
        this.enableCloseCombinePage = z8;
        this.enableSummarySimpleMode = z9;
        this.enableClearAnchorPaymentInfo = z10;
        this.doNotSelectParentMethodDirectly = z11;
        this.refreshPaymentInfo = z12;
        this.checkAnchorMethodsForUpdate = z13;
        this.enableResort = z14;
        this.fixPromotionUpdate = z15;
        this.methods = list;
        this.enableOspButtonLog = z16;
        this.disableSubscribeSummary = z17;
        this.selectRecommendMethodForAnchor = z18;
        this.updateCacheInfo = i;
        this.enableNewContainer = z19;
        this.newSheetContainerPeekHeightRatio = f;
        this.newSheetContainerMaxHeightRatio = f2;
        this.enableFillInstallmentInfoParams = z20;
        this.enableFixInstallmentPlanDefaultSelection = z21;
        this.enableFindSummary = z22;
        this.enableUpdateInstallmentPlanWhenSelect = z23;
        this.enableSelectionDefaultInstallmentPlan = z24;
        this.hidePaymentMethodPromotionTag = z25;
        this.enableGetSubPaymentMethod = z26;
        this.useIndependentPricingFieldsFirst = z27;
        this.enableUpdateAmountWhenSelectSubPaymentMethod = z28;
        this.ensureIdentifierAsSame = z29;
    }
}
