package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PODisplayInfo {

    @C09CT("checkout_button_info")
    public final TextIconUrlInfo checkoutButtonInfo;

    @C09CT("payment_option_icon")
    public final POIcon icon;

    @C09CT("icon_list")
    public final List<POIcon> iconList;

    @C09CT("payment_option_name")
    public final String name;

    @C09CT("payment_promotions")
    public final List<POPromotion> paymentPromotions;

    @C09CT("payment_option_name_popup_info")
    public final PopupInfo popupInfo;

    @C09CT("selection_style")
    public final POSelectStyle selectStyle;

    @C09CT("text_info")
    public final TextInfo textInfo;

    @C09CT("payment_option_tips")
    public List<POTip> tips;

    public PODisplayInfo() {
        this("", null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PODisplayInfo)) {
            return false;
        }
        PODisplayInfo pODisplayInfo = (PODisplayInfo) obj;
        return Intrinsics.LJFF(this.name, pODisplayInfo.name) && Intrinsics.LJFF(this.icon, pODisplayInfo.icon) && Intrinsics.LJFF(this.textInfo, pODisplayInfo.textInfo) && Intrinsics.LJFF(this.iconList, pODisplayInfo.iconList) && Intrinsics.LJFF(this.paymentPromotions, pODisplayInfo.paymentPromotions) && Intrinsics.LJFF(this.tips, pODisplayInfo.tips) && Intrinsics.LJFF(this.checkoutButtonInfo, pODisplayInfo.checkoutButtonInfo) && Intrinsics.LJFF(this.popupInfo, pODisplayInfo.popupInfo) && this.selectStyle == pODisplayInfo.selectStyle;
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        POIcon pOIcon = this.icon;
        int iHashCode2 = (iHashCode + (pOIcon == null ? 0 : pOIcon.hashCode())) * 31;
        TextInfo textInfo = this.textInfo;
        int iHashCode3 = (iHashCode2 + (textInfo == null ? 0 : textInfo.hashCode())) * 31;
        List<POIcon> list = this.iconList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<POPromotion> list2 = this.paymentPromotions;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<POTip> list3 = this.tips;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        TextIconUrlInfo textIconUrlInfo = this.checkoutButtonInfo;
        int iHashCode7 = (iHashCode6 + (textIconUrlInfo == null ? 0 : textIconUrlInfo.hashCode())) * 31;
        PopupInfo popupInfo = this.popupInfo;
        int iHashCode8 = (iHashCode7 + (popupInfo == null ? 0 : popupInfo.hashCode())) * 31;
        POSelectStyle pOSelectStyle = this.selectStyle;
        return iHashCode8 + (pOSelectStyle != null ? pOSelectStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PODisplayInfo(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", textInfo=");
        sbLIZ.append(this.textInfo);
        sbLIZ.append(", iconList=");
        sbLIZ.append(this.iconList);
        sbLIZ.append(", paymentPromotions=");
        sbLIZ.append(this.paymentPromotions);
        sbLIZ.append(", tips=");
        sbLIZ.append(this.tips);
        sbLIZ.append(", checkoutButtonInfo=");
        sbLIZ.append(this.checkoutButtonInfo);
        sbLIZ.append(", popupInfo=");
        sbLIZ.append(this.popupInfo);
        sbLIZ.append(", selectStyle=");
        sbLIZ.append(this.selectStyle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class PopupInfo {

        @C09CT("payment_option_name")
        public final POPopupInfo optionName;

        public PopupInfo() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PopupInfo) && Intrinsics.LJFF(this.optionName, ((PopupInfo) obj).optionName);
        }

        public final int hashCode() {
            POPopupInfo pOPopupInfo = this.optionName;
            if (pOPopupInfo == null) {
                return 0;
            }
            return pOPopupInfo.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PopupInfo(optionName=");
            sbLIZ.append(this.optionName);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PopupInfo(POPopupInfo pOPopupInfo) {
            this.optionName = pOPopupInfo;
        }
    }

    public static final class TextIconUrlInfo {

        @C09CT("background_color")
        public final POColor backgroundColor;

        @C09CT("icon")
        public final POIcon icon;

        public TextIconUrlInfo() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextIconUrlInfo)) {
                return false;
            }
            TextIconUrlInfo textIconUrlInfo = (TextIconUrlInfo) obj;
            return Intrinsics.LJFF(this.icon, textIconUrlInfo.icon) && Intrinsics.LJFF(this.backgroundColor, textIconUrlInfo.backgroundColor);
        }

        public final int hashCode() {
            POIcon pOIcon = this.icon;
            int iHashCode = (pOIcon == null ? 0 : pOIcon.hashCode()) * 31;
            POColor pOColor = this.backgroundColor;
            return iHashCode + (pOColor != null ? pOColor.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TextIconUrlInfo(icon=");
            sbLIZ.append(this.icon);
            sbLIZ.append(", backgroundColor=");
            sbLIZ.append(this.backgroundColor);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public TextIconUrlInfo(POIcon pOIcon, POColor pOColor) {
            this.icon = pOIcon;
            this.backgroundColor = pOColor;
        }
    }

    public static final class TextInfo {

        @C09CT("cvv_popup_subtitle")
        public final String cvvPopupSubtitle;

        @C09CT("cvv_popup_title")
        public final String cvvPopupTitle;

        @C09CT("payment_amount_display_text")
        public final String paymentAmountDisplayText;

        public TextInfo() {
            this(null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextInfo)) {
                return false;
            }
            TextInfo textInfo = (TextInfo) obj;
            return Intrinsics.LJFF(this.paymentAmountDisplayText, textInfo.paymentAmountDisplayText) && Intrinsics.LJFF(this.cvvPopupTitle, textInfo.cvvPopupTitle) && Intrinsics.LJFF(this.cvvPopupSubtitle, textInfo.cvvPopupSubtitle);
        }

        public final int hashCode() {
            String str = this.paymentAmountDisplayText;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cvvPopupTitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cvvPopupSubtitle;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TextInfo(paymentAmountDisplayText=");
            sbLIZ.append(this.paymentAmountDisplayText);
            sbLIZ.append(", cvvPopupTitle=");
            sbLIZ.append(this.cvvPopupTitle);
            sbLIZ.append(", cvvPopupSubtitle=");
            sbLIZ.append(this.cvvPopupSubtitle);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public TextInfo(String str, String str2, String str3) {
            this.paymentAmountDisplayText = str;
            this.cvvPopupTitle = str2;
            this.cvvPopupSubtitle = str3;
        }
    }

    public PODisplayInfo(String str, POIcon pOIcon, TextInfo textInfo, List<POIcon> list, List<POPromotion> list2, List<POTip> list3, TextIconUrlInfo textIconUrlInfo, PopupInfo popupInfo, POSelectStyle pOSelectStyle) {
        this.name = str;
        this.icon = pOIcon;
        this.textInfo = textInfo;
        this.iconList = list;
        this.paymentPromotions = list2;
        this.tips = list3;
        this.checkoutButtonInfo = textIconUrlInfo;
        this.popupInfo = popupInfo;
        this.selectStyle = pOSelectStyle;
    }
}
