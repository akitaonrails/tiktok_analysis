package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm;

import X.C004I;
import X.C044L;
import X.C047F;
import X.C10366043o;
import X.C7735030j;
import X.C786410Ut5;
import X.C953503o5;
import X.EnumC10383044f;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CutPriceSKUPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.SeaPdpSellingPointsGroup;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.CounterDescription;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuHeaderTopLabelsGroup;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaSkuPanelWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuState implements C004I, InterfaceC0148002o {
    public static final int $stable = 8;
    public AddToCartButton addToCartButton;
    public final Map<String, String> buttonDynamicData;
    public final BuyButton buyButton;
    public final String buyButtonInterestId;
    public final List<String> checkedSkuArray;
    public final CounterDescription counterDescription;
    public final Image currentImage;
    public final int currentImagePosition;
    public final InstallmentPlan currentInstallmentPlan;
    public final C953503o5 currentPriceData;
    public final Pair<Integer, C044L> currentQuantity;
    public final C7735030j currentQuantityLimit;
    public final CutPriceSKUPanel cutPriceSkuPanel;
    public final ExceptionUX exceptionUX;
    public final Object forceRefresh;
    public final String hidePriceTip;
    public final boolean isQuantityEditable;
    public final Boolean keyBoardVisibility;
    public final List<SaleProp> localSizeSalePropList;
    public final ProductPackStruct originalProductPackStruct;
    public final PdpPaymentModule paymentModule;
    public final PreOrderInfo preOrderInfo;
    public final PromotionLabelVO promotionDealVO;
    public final String purchaseNotice;
    public final boolean showLoadingView;
    public final C047F showToast;
    public final EnumC10383044f skuDataState;
    public final boolean skuFragmentClosed;
    public final SkuHeaderTopLabelsGroup skuHeaderTopLabels;
    public final SeaPdpSellingPointsGroup skuPanelSellingPoints;
    public final SeaSkuPanelWaistBanner skuPanelWaistBanner;
    public final C10366043o skuStockInfo;
    public final Boolean slideToBnpl;
    public final String specifications;
    public final Integer topOutsideWidgetVisibleHeight;

    public SkuState() {
        this(null, null, null, null, null, null, null, null, null, null, null, "", new C7735030j(1, 200), new Pair(1, new C044L(false, 3)), 0, null, null, false, EnumC10383044f.INIT, null, null, false, new C10366043o(null, null), new Object(), null, null, true, null, null, null, null, null, null, null, null);
    }

    public final SkuState copy(List<String> list, C047F c047f, Image image, BuyButton buyButton, String str, Map<String, String> map, PreOrderInfo preOrderInfo, C953503o5 c953503o5, String str2, String str3, PromotionLabelVO promotionLabelVO, String str4, C7735030j c7735030j, Pair<Integer, C044L> pair, int i, InstallmentPlan installmentPlan, Boolean bool, boolean z, EnumC10383044f enumC10383044f, AddToCartButton addToCartButton, PdpPaymentModule pdpPaymentModule, boolean z2, C10366043o c10366043o, Object obj, ProductPackStruct productPackStruct, List<SaleProp> list2, boolean z3, Boolean bool2, ExceptionUX exceptionUX, CounterDescription counterDescription, Integer num, CutPriceSKUPanel cutPriceSKUPanel, SeaSkuPanelWaistBanner seaSkuPanelWaistBanner, SeaPdpSellingPointsGroup seaPdpSellingPointsGroup, SkuHeaderTopLabelsGroup skuHeaderTopLabelsGroup) {
        return new SkuState(list, c047f, image, buyButton, str, map, preOrderInfo, c953503o5, str2, str3, promotionLabelVO, str4, c7735030j, pair, i, installmentPlan, bool, z, enumC10383044f, addToCartButton, pdpPaymentModule, z2, c10366043o, obj, productPackStruct, list2, z3, bool2, exceptionUX, counterDescription, num, cutPriceSKUPanel, seaSkuPanelWaistBanner, seaPdpSellingPointsGroup, skuHeaderTopLabelsGroup);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuState)) {
            return false;
        }
        SkuState skuState = (SkuState) obj;
        return Intrinsics.LJFF(this.checkedSkuArray, skuState.checkedSkuArray) && Intrinsics.LJFF(this.showToast, skuState.showToast) && Intrinsics.LJFF(this.currentImage, skuState.currentImage) && Intrinsics.LJFF(this.buyButton, skuState.buyButton) && Intrinsics.LJFF(this.buyButtonInterestId, skuState.buyButtonInterestId) && Intrinsics.LJFF(this.buttonDynamicData, skuState.buttonDynamicData) && Intrinsics.LJFF(this.preOrderInfo, skuState.preOrderInfo) && Intrinsics.LJFF(this.currentPriceData, skuState.currentPriceData) && Intrinsics.LJFF(this.hidePriceTip, skuState.hidePriceTip) && Intrinsics.LJFF(this.purchaseNotice, skuState.purchaseNotice) && Intrinsics.LJFF(this.promotionDealVO, skuState.promotionDealVO) && Intrinsics.LJFF(this.specifications, skuState.specifications) && Intrinsics.LJFF(this.currentQuantityLimit, skuState.currentQuantityLimit) && Intrinsics.LJFF(this.currentQuantity, skuState.currentQuantity) && this.currentImagePosition == skuState.currentImagePosition && Intrinsics.LJFF(this.currentInstallmentPlan, skuState.currentInstallmentPlan) && Intrinsics.LJFF(this.keyBoardVisibility, skuState.keyBoardVisibility) && this.skuFragmentClosed == skuState.skuFragmentClosed && this.skuDataState == skuState.skuDataState && Intrinsics.LJFF(this.addToCartButton, skuState.addToCartButton) && Intrinsics.LJFF(this.paymentModule, skuState.paymentModule) && this.showLoadingView == skuState.showLoadingView && Intrinsics.LJFF(this.skuStockInfo, skuState.skuStockInfo) && Intrinsics.LJFF(this.forceRefresh, skuState.forceRefresh) && Intrinsics.LJFF(this.originalProductPackStruct, skuState.originalProductPackStruct) && Intrinsics.LJFF(this.localSizeSalePropList, skuState.localSizeSalePropList) && this.isQuantityEditable == skuState.isQuantityEditable && Intrinsics.LJFF(this.slideToBnpl, skuState.slideToBnpl) && Intrinsics.LJFF(this.exceptionUX, skuState.exceptionUX) && Intrinsics.LJFF(this.counterDescription, skuState.counterDescription) && Intrinsics.LJFF(this.topOutsideWidgetVisibleHeight, skuState.topOutsideWidgetVisibleHeight) && Intrinsics.LJFF(this.cutPriceSkuPanel, skuState.cutPriceSkuPanel) && Intrinsics.LJFF(this.skuPanelWaistBanner, skuState.skuPanelWaistBanner) && Intrinsics.LJFF(this.skuPanelSellingPoints, skuState.skuPanelSellingPoints) && Intrinsics.LJFF(this.skuHeaderTopLabels, skuState.skuHeaderTopLabels);
    }

    public int hashCode() {
        List<String> list = this.checkedSkuArray;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        C047F c047f = this.showToast;
        int iHashCode2 = (iHashCode + (c047f == null ? 0 : c047f.hashCode())) * 31;
        Image image = this.currentImage;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        BuyButton buyButton = this.buyButton;
        int iHashCode4 = (iHashCode3 + (buyButton == null ? 0 : buyButton.hashCode())) * 31;
        String str = this.buyButtonInterestId;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.buttonDynamicData;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        PreOrderInfo preOrderInfo = this.preOrderInfo;
        int iHashCode7 = (iHashCode6 + (preOrderInfo == null ? 0 : preOrderInfo.hashCode())) * 31;
        C953503o5 c953503o5 = this.currentPriceData;
        int iHashCode8 = (iHashCode7 + (c953503o5 == null ? 0 : c953503o5.hashCode())) * 31;
        String str2 = this.hidePriceTip;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.purchaseNotice;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PromotionLabelVO promotionLabelVO = this.promotionDealVO;
        int iHashCode11 = (((((((((iHashCode10 + (promotionLabelVO == null ? 0 : promotionLabelVO.hashCode())) * 31) + this.specifications.hashCode()) * 31) + this.currentQuantityLimit.hashCode()) * 31) + this.currentQuantity.hashCode()) * 31) + this.currentImagePosition) * 31;
        InstallmentPlan installmentPlan = this.currentInstallmentPlan;
        int iHashCode12 = (iHashCode11 + (installmentPlan == null ? 0 : installmentPlan.hashCode())) * 31;
        Boolean bool = this.keyBoardVisibility;
        int iHashCode13 = (((((iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.skuFragmentClosed)) * 31) + this.skuDataState.hashCode()) * 31;
        AddToCartButton addToCartButton = this.addToCartButton;
        int iHashCode14 = (iHashCode13 + (addToCartButton == null ? 0 : addToCartButton.hashCode())) * 31;
        PdpPaymentModule pdpPaymentModule = this.paymentModule;
        int iHashCode15 = (((((((iHashCode14 + (pdpPaymentModule == null ? 0 : pdpPaymentModule.hashCode())) * 31) + C786410Ut5.Z2(this.showLoadingView)) * 31) + this.skuStockInfo.hashCode()) * 31) + this.forceRefresh.hashCode()) * 31;
        ProductPackStruct productPackStruct = this.originalProductPackStruct;
        int iHashCode16 = (iHashCode15 + (productPackStruct == null ? 0 : productPackStruct.hashCode())) * 31;
        List<SaleProp> list2 = this.localSizeSalePropList;
        int iHashCode17 = (((iHashCode16 + (list2 == null ? 0 : list2.hashCode())) * 31) + C786410Ut5.Z2(this.isQuantityEditable)) * 31;
        Boolean bool2 = this.slideToBnpl;
        int iHashCode18 = (iHashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        int iHashCode19 = (iHashCode18 + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        CounterDescription counterDescription = this.counterDescription;
        int iHashCode20 = (iHashCode19 + (counterDescription == null ? 0 : counterDescription.hashCode())) * 31;
        Integer num = this.topOutsideWidgetVisibleHeight;
        int iHashCode21 = (iHashCode20 + (num == null ? 0 : num.hashCode())) * 31;
        CutPriceSKUPanel cutPriceSKUPanel = this.cutPriceSkuPanel;
        int iHashCode22 = (iHashCode21 + (cutPriceSKUPanel == null ? 0 : cutPriceSKUPanel.hashCode())) * 31;
        SeaSkuPanelWaistBanner seaSkuPanelWaistBanner = this.skuPanelWaistBanner;
        int iHashCode23 = (iHashCode22 + (seaSkuPanelWaistBanner == null ? 0 : seaSkuPanelWaistBanner.hashCode())) * 31;
        SeaPdpSellingPointsGroup seaPdpSellingPointsGroup = this.skuPanelSellingPoints;
        int iHashCode24 = (iHashCode23 + (seaPdpSellingPointsGroup == null ? 0 : seaPdpSellingPointsGroup.hashCode())) * 31;
        SkuHeaderTopLabelsGroup skuHeaderTopLabelsGroup = this.skuHeaderTopLabels;
        return iHashCode24 + (skuHeaderTopLabelsGroup != null ? skuHeaderTopLabelsGroup.hashCode() : 0);
    }

    public String toString() {
        return "SkuState(checkedSkuArray=" + this.checkedSkuArray + ", showToast=" + this.showToast + ", currentImage=" + this.currentImage + ", buyButton=" + this.buyButton + ", buyButtonInterestId=" + this.buyButtonInterestId + ", buttonDynamicData=" + this.buttonDynamicData + ", preOrderInfo=" + this.preOrderInfo + ", currentPriceData=" + this.currentPriceData + ", hidePriceTip=" + this.hidePriceTip + ", purchaseNotice=" + this.purchaseNotice + ", promotionDealVO=" + this.promotionDealVO + ", specifications=" + this.specifications + ", currentQuantityLimit=" + this.currentQuantityLimit + ", currentQuantity=" + this.currentQuantity + ", currentImagePosition=" + this.currentImagePosition + ", currentInstallmentPlan=" + this.currentInstallmentPlan + ", keyBoardVisibility=" + this.keyBoardVisibility + ", skuFragmentClosed=" + this.skuFragmentClosed + ", skuDataState=" + this.skuDataState + ", addToCartButton=" + this.addToCartButton + ", paymentModule=" + this.paymentModule + ", showLoadingView=" + this.showLoadingView + ", skuStockInfo=" + this.skuStockInfo + ", forceRefresh=" + this.forceRefresh + ", originalProductPackStruct=" + this.originalProductPackStruct + ", localSizeSalePropList=" + this.localSizeSalePropList + ", isQuantityEditable=" + this.isQuantityEditable + ", slideToBnpl=" + this.slideToBnpl + ", exceptionUX=" + this.exceptionUX + ", counterDescription=" + this.counterDescription + ", topOutsideWidgetVisibleHeight=" + this.topOutsideWidgetVisibleHeight + ", cutPriceSkuPanel=" + this.cutPriceSkuPanel + ", skuPanelWaistBanner=" + this.skuPanelWaistBanner + ", skuPanelSellingPoints=" + this.skuPanelSellingPoints + ", skuHeaderTopLabels=" + this.skuHeaderTopLabels + ')';
    }

    public final AddToCartButton getAddToCartButton() {
        return this.addToCartButton;
    }

    public final Map<String, String> getButtonDynamicData() {
        return this.buttonDynamicData;
    }

    public final BuyButton getBuyButton() {
        return this.buyButton;
    }

    public final String getBuyButtonInterestId() {
        return this.buyButtonInterestId;
    }

    public final List<String> getCheckedSkuArray() {
        return this.checkedSkuArray;
    }

    public final CounterDescription getCounterDescription() {
        return this.counterDescription;
    }

    public final Image getCurrentImage() {
        return this.currentImage;
    }

    public final int getCurrentImagePosition() {
        return this.currentImagePosition;
    }

    public final InstallmentPlan getCurrentInstallmentPlan() {
        return this.currentInstallmentPlan;
    }

    public final C953503o5 getCurrentPriceData() {
        return this.currentPriceData;
    }

    public final Pair<Integer, C044L> getCurrentQuantity() {
        return this.currentQuantity;
    }

    public final C7735030j getCurrentQuantityLimit() {
        return this.currentQuantityLimit;
    }

    public final CutPriceSKUPanel getCutPriceSkuPanel() {
        return this.cutPriceSkuPanel;
    }

    public final ExceptionUX getExceptionUX() {
        return this.exceptionUX;
    }

    public final Object getForceRefresh() {
        return this.forceRefresh;
    }

    public final String getHidePriceTip() {
        return this.hidePriceTip;
    }

    public final Boolean getKeyBoardVisibility() {
        return this.keyBoardVisibility;
    }

    public final List<SaleProp> getLocalSizeSalePropList() {
        return this.localSizeSalePropList;
    }

    public final ProductPackStruct getOriginalProductPackStruct() {
        return this.originalProductPackStruct;
    }

    public final PdpPaymentModule getPaymentModule() {
        return this.paymentModule;
    }

    public final PreOrderInfo getPreOrderInfo() {
        return this.preOrderInfo;
    }

    public final PromotionLabelVO getPromotionDealVO() {
        return this.promotionDealVO;
    }

    public final String getPurchaseNotice() {
        return this.purchaseNotice;
    }

    public final boolean getShowLoadingView() {
        return this.showLoadingView;
    }

    public final C047F getShowToast() {
        return this.showToast;
    }

    public final EnumC10383044f getSkuDataState() {
        return this.skuDataState;
    }

    public final boolean getSkuFragmentClosed() {
        return this.skuFragmentClosed;
    }

    public final SkuHeaderTopLabelsGroup getSkuHeaderTopLabels() {
        return this.skuHeaderTopLabels;
    }

    public final SeaPdpSellingPointsGroup getSkuPanelSellingPoints() {
        return this.skuPanelSellingPoints;
    }

    public final SeaSkuPanelWaistBanner getSkuPanelWaistBanner() {
        return this.skuPanelWaistBanner;
    }

    public final C10366043o getSkuStockInfo() {
        return this.skuStockInfo;
    }

    public final Boolean getSlideToBnpl() {
        return this.slideToBnpl;
    }

    public final String getSpecifications() {
        return this.specifications;
    }

    public final Integer getTopOutsideWidgetVisibleHeight() {
        return this.topOutsideWidgetVisibleHeight;
    }

    public final boolean isQuantityEditable() {
        return this.isQuantityEditable;
    }

    public final void setAddToCartButton(AddToCartButton addToCartButton) {
        this.addToCartButton = addToCartButton;
    }

    public SkuState(List<String> list, C047F c047f, Image image, BuyButton buyButton, String str, Map<String, String> map, PreOrderInfo preOrderInfo, C953503o5 c953503o5, String str2, String str3, PromotionLabelVO promotionLabelVO, String str4, C7735030j c7735030j, Pair<Integer, C044L> pair, int i, InstallmentPlan installmentPlan, Boolean bool, boolean z, EnumC10383044f enumC10383044f, AddToCartButton addToCartButton, PdpPaymentModule pdpPaymentModule, boolean z2, C10366043o c10366043o, Object obj, ProductPackStruct productPackStruct, List<SaleProp> list2, boolean z3, Boolean bool2, ExceptionUX exceptionUX, CounterDescription counterDescription, Integer num, CutPriceSKUPanel cutPriceSKUPanel, SeaSkuPanelWaistBanner seaSkuPanelWaistBanner, SeaPdpSellingPointsGroup seaPdpSellingPointsGroup, SkuHeaderTopLabelsGroup skuHeaderTopLabelsGroup) {
        this.checkedSkuArray = list;
        this.showToast = c047f;
        this.currentImage = image;
        this.buyButton = buyButton;
        this.buyButtonInterestId = str;
        this.buttonDynamicData = map;
        this.preOrderInfo = preOrderInfo;
        this.currentPriceData = c953503o5;
        this.hidePriceTip = str2;
        this.purchaseNotice = str3;
        this.promotionDealVO = promotionLabelVO;
        this.specifications = str4;
        this.currentQuantityLimit = c7735030j;
        this.currentQuantity = pair;
        this.currentImagePosition = i;
        this.currentInstallmentPlan = installmentPlan;
        this.keyBoardVisibility = bool;
        this.skuFragmentClosed = z;
        this.skuDataState = enumC10383044f;
        this.addToCartButton = addToCartButton;
        this.paymentModule = pdpPaymentModule;
        this.showLoadingView = z2;
        this.skuStockInfo = c10366043o;
        this.forceRefresh = obj;
        this.originalProductPackStruct = productPackStruct;
        this.localSizeSalePropList = list2;
        this.isQuantityEditable = z3;
        this.slideToBnpl = bool2;
        this.exceptionUX = exceptionUX;
        this.counterDescription = counterDescription;
        this.topOutsideWidgetVisibleHeight = num;
        this.cutPriceSkuPanel = cutPriceSKUPanel;
        this.skuPanelWaistBanner = seaSkuPanelWaistBanner;
        this.skuPanelSellingPoints = seaPdpSellingPointsGroup;
        this.skuHeaderTopLabels = skuHeaderTopLabelsGroup;
    }
}
