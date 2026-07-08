package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShopOrderStarling {

    @C09CT("express_edt_placeholder")
    public BillStarlingText expressEdtPlaceholder;

    @C09CT("order_notes_title")
    public BillStarlingText oderNotesTitle;

    @C09CT("order_message_header")
    public BillStarlingText orderMessageHeader;

    @C09CT("order_notes_edit")
    public BillStarlingText orderNotesEdit;

    @C09CT("order_notes_hint")
    public BillStarlingText orderNotesHint;

    @C09CT("order_notes_text")
    public BillStarlingText orderNotesText;

    @C09CT("shipping_method_select_text")
    public BillStarlingText shippingMethodSelectText;

    public ShopOrderStarling() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopOrderStarling)) {
            return false;
        }
        ShopOrderStarling shopOrderStarling = (ShopOrderStarling) obj;
        return Intrinsics.LJFF(this.orderNotesText, shopOrderStarling.orderNotesText) && Intrinsics.LJFF(this.orderNotesHint, shopOrderStarling.orderNotesHint) && Intrinsics.LJFF(this.orderMessageHeader, shopOrderStarling.orderMessageHeader) && Intrinsics.LJFF(this.orderNotesEdit, shopOrderStarling.orderNotesEdit) && Intrinsics.LJFF(this.shippingMethodSelectText, shopOrderStarling.shippingMethodSelectText) && Intrinsics.LJFF(this.expressEdtPlaceholder, shopOrderStarling.expressEdtPlaceholder) && Intrinsics.LJFF(this.oderNotesTitle, shopOrderStarling.oderNotesTitle);
    }

    public final int hashCode() {
        BillStarlingText billStarlingText = this.orderNotesText;
        int iHashCode = (billStarlingText == null ? 0 : billStarlingText.hashCode()) * 31;
        BillStarlingText billStarlingText2 = this.orderNotesHint;
        int iHashCode2 = (iHashCode + (billStarlingText2 == null ? 0 : billStarlingText2.hashCode())) * 31;
        BillStarlingText billStarlingText3 = this.orderMessageHeader;
        int iHashCode3 = (iHashCode2 + (billStarlingText3 == null ? 0 : billStarlingText3.hashCode())) * 31;
        BillStarlingText billStarlingText4 = this.orderNotesEdit;
        int iHashCode4 = (iHashCode3 + (billStarlingText4 == null ? 0 : billStarlingText4.hashCode())) * 31;
        BillStarlingText billStarlingText5 = this.shippingMethodSelectText;
        int iHashCode5 = (iHashCode4 + (billStarlingText5 == null ? 0 : billStarlingText5.hashCode())) * 31;
        BillStarlingText billStarlingText6 = this.expressEdtPlaceholder;
        int iHashCode6 = (iHashCode5 + (billStarlingText6 == null ? 0 : billStarlingText6.hashCode())) * 31;
        BillStarlingText billStarlingText7 = this.oderNotesTitle;
        return iHashCode6 + (billStarlingText7 != null ? billStarlingText7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopOrderStarling(orderNotesText=");
        sbLIZ.append(this.orderNotesText);
        sbLIZ.append(", orderNotesHint=");
        sbLIZ.append(this.orderNotesHint);
        sbLIZ.append(", orderMessageHeader=");
        sbLIZ.append(this.orderMessageHeader);
        sbLIZ.append(", orderNotesEdit=");
        sbLIZ.append(this.orderNotesEdit);
        sbLIZ.append(", shippingMethodSelectText=");
        sbLIZ.append(this.shippingMethodSelectText);
        sbLIZ.append(", expressEdtPlaceholder=");
        sbLIZ.append(this.expressEdtPlaceholder);
        sbLIZ.append(", oderNotesTitle=");
        sbLIZ.append(this.oderNotesTitle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShopOrderStarling(BillStarlingText billStarlingText, BillStarlingText billStarlingText2, BillStarlingText billStarlingText3, BillStarlingText billStarlingText4, BillStarlingText billStarlingText5, BillStarlingText billStarlingText6, BillStarlingText billStarlingText7) {
        this.orderNotesText = billStarlingText;
        this.orderNotesHint = billStarlingText2;
        this.orderMessageHeader = billStarlingText3;
        this.orderNotesEdit = billStarlingText4;
        this.shippingMethodSelectText = billStarlingText5;
        this.expressEdtPlaceholder = billStarlingText6;
        this.oderNotesTitle = billStarlingText7;
    }
}
