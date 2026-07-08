package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.skc;

import X.C004I;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C953503o5;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class SeaPdpSkcPanelHeaderState implements C004I {
    public static final int $stable = 8;
    public final List<Image> headerImgList;
    public final String hidePriceTip;
    public final boolean keyBoardVisibility;
    public final PromotionLabelVO promotionDealVO;
    public final C953503o5 seaPdpProductPriceData;

    public SeaPdpSkcPanelHeaderState() {
        this(null, null, null, null, false);
    }

    public final SeaPdpSkcPanelHeaderState copy(List<Image> list, C953503o5 c953503o5, String str, PromotionLabelVO promotionLabelVO, boolean z) {
        return new SeaPdpSkcPanelHeaderState(list, c953503o5, str, promotionLabelVO, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpSkcPanelHeaderState)) {
            return false;
        }
        SeaPdpSkcPanelHeaderState seaPdpSkcPanelHeaderState = (SeaPdpSkcPanelHeaderState) obj;
        return Intrinsics.LJFF(this.headerImgList, seaPdpSkcPanelHeaderState.headerImgList) && Intrinsics.LJFF(this.seaPdpProductPriceData, seaPdpSkcPanelHeaderState.seaPdpProductPriceData) && Intrinsics.LJFF(this.hidePriceTip, seaPdpSkcPanelHeaderState.hidePriceTip) && Intrinsics.LJFF(this.promotionDealVO, seaPdpSkcPanelHeaderState.promotionDealVO) && this.keyBoardVisibility == seaPdpSkcPanelHeaderState.keyBoardVisibility;
    }

    public int hashCode() {
        List<Image> list = this.headerImgList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        C953503o5 c953503o5 = this.seaPdpProductPriceData;
        int iHashCode2 = (iHashCode + (c953503o5 == null ? 0 : c953503o5.hashCode())) * 31;
        String str = this.hidePriceTip;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PromotionLabelVO promotionLabelVO = this.promotionDealVO;
        return ((iHashCode3 + (promotionLabelVO != null ? promotionLabelVO.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.keyBoardVisibility);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpSkcPanelHeaderState(headerImgList=");
        sbLIZ.append(this.headerImgList);
        sbLIZ.append(", seaPdpProductPriceData=");
        sbLIZ.append(this.seaPdpProductPriceData);
        sbLIZ.append(", hidePriceTip=");
        sbLIZ.append(this.hidePriceTip);
        sbLIZ.append(", promotionDealVO=");
        sbLIZ.append(this.promotionDealVO);
        sbLIZ.append(", keyBoardVisibility=");
        sbLIZ.append(this.keyBoardVisibility);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<Image> getHeaderImgList() {
        return this.headerImgList;
    }

    public final String getHidePriceTip() {
        return this.hidePriceTip;
    }

    public final boolean getKeyBoardVisibility() {
        return this.keyBoardVisibility;
    }

    public final PromotionLabelVO getPromotionDealVO() {
        return this.promotionDealVO;
    }

    public final C953503o5 getSeaPdpProductPriceData() {
        return this.seaPdpProductPriceData;
    }

    public SeaPdpSkcPanelHeaderState(List<Image> list, C953503o5 c953503o5, String str, PromotionLabelVO promotionLabelVO, boolean z) {
        this.headerImgList = list;
        this.seaPdpProductPriceData = c953503o5;
        this.hidePriceTip = str;
        this.promotionDealVO = promotionLabelVO;
        this.keyBoardVisibility = z;
    }
}
