package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PopupButton;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BillItem implements Parcelable {

    @C09CT("before_icon")
    public Icon beforeIcon;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("has_divider")
    public Boolean hasDivider;

    @C09CT("has_popup")
    public Boolean hasPopup;

    @C09CT("item_explain")
    public String itemExplain;

    @C09CT("item_name")
    public String itemName;

    @C09CT("item_name_en")
    public String itemNameEn;

    @C09CT("item_name_rich_text")
    public ECRichText itemNameRichText;

    @C09CT("item_price")
    public Price itemPrice;

    @C09CT("item_text")
    public String itemText;

    @C09CT("item_text_color")
    public Integer itemTextColor;

    @C09CT("item_text_font")
    public Integer itemTextFont;

    @C09CT("item_type")
    public Integer itemType;

    @C09CT("logo")
    public Icon logo;

    @C09CT("item_original_price")
    public Price originalPrice;

    @C09CT("popup_banner")
    public List<Icon> popupBanner;

    @C09CT("popup_button")
    public PopupButton popupButton;

    @C09CT("popup_explain")
    public ECRichText popupExplain;

    @C09CT("popup_style")
    public Integer popupStyle;

    @C09CT("rich_text_item_name")
    public ECRichText richTextItemName;

    @C09CT("sub_items")
    public List<BillItem> subItems;
    public static final Parcelable.Creator<BillItem> CREATOR = new Parcelable.Creator<BillItem>() { // from class: X.02iH
        @Override // android.os.Parcelable.Creator
        public final BillItem createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Price priceCreateFromParcel;
            Integer numValueOf2;
            Integer numValueOf3;
            ArrayList arrayList;
            PopupButton popupButtonCreateFromParcel;
            boolean z;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ArrayList arrayList2;
            Price priceCreateFromParcel2;
            Integer numValueOf4;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                priceCreateFromParcel = null;
            } else {
                priceCreateFromParcel = Price.CREATOR.createFromParcel(parcel);
            }
            Price price = priceCreateFromParcel;
            Icon icon = (Icon) parcel.readParcelable(BillItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(BillItem.CREATOR.createFromParcel(parcel));
                }
            }
            String string3 = parcel.readString();
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(BillItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                popupButtonCreateFromParcel = null;
            } else {
                popupButtonCreateFromParcel = PopupButton.CREATOR.createFromParcel(parcel);
            }
            PopupButton popupButton = popupButtonCreateFromParcel;
            ECRichText eCRichText2 = (ECRichText) parcel.readParcelable(BillItem.class.getClassLoader());
            boolean z2 = true;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(BillItem.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 0) {
                priceCreateFromParcel2 = null;
            } else {
                priceCreateFromParcel2 = Price.CREATOR.createFromParcel(parcel);
            }
            Price price2 = priceCreateFromParcel2;
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            return new BillItem(numValueOf, string, price, icon, numValueOf2, numValueOf3, string2, arrayList, string3, eCRichText, popupButton, eCRichText2, boolValueOf, boolValueOf2, arrayList2, price2, numValueOf4, parcel.readString(), parcel.readString(), (ECRichText) parcel.readParcelable(BillItem.class.getClassLoader()), (Icon) parcel.readParcelable(BillItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BillItem[] newArray(int i) {
            return new BillItem[i];
        }
    };
    public static final int $stable = 8;

    public BillItem() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillItem)) {
            return false;
        }
        BillItem billItem = (BillItem) obj;
        return Intrinsics.LJFF(this.itemType, billItem.itemType) && Intrinsics.LJFF(this.itemName, billItem.itemName) && Intrinsics.LJFF(this.itemPrice, billItem.itemPrice) && Intrinsics.LJFF(this.logo, billItem.logo) && Intrinsics.LJFF(this.itemTextColor, billItem.itemTextColor) && Intrinsics.LJFF(this.itemTextFont, billItem.itemTextFont) && Intrinsics.LJFF(this.itemText, billItem.itemText) && Intrinsics.LJFF(this.subItems, billItem.subItems) && Intrinsics.LJFF(this.itemExplain, billItem.itemExplain) && Intrinsics.LJFF(this.popupExplain, billItem.popupExplain) && Intrinsics.LJFF(this.popupButton, billItem.popupButton) && Intrinsics.LJFF(this.richTextItemName, billItem.richTextItemName) && Intrinsics.LJFF(this.hasDivider, billItem.hasDivider) && Intrinsics.LJFF(this.hasPopup, billItem.hasPopup) && Intrinsics.LJFF(this.popupBanner, billItem.popupBanner) && Intrinsics.LJFF(this.originalPrice, billItem.originalPrice) && Intrinsics.LJFF(this.popupStyle, billItem.popupStyle) && Intrinsics.LJFF(this.daInfo, billItem.daInfo) && Intrinsics.LJFF(this.itemNameEn, billItem.itemNameEn) && Intrinsics.LJFF(this.itemNameRichText, billItem.itemNameRichText) && Intrinsics.LJFF(this.beforeIcon, billItem.beforeIcon);
    }

    public final int hashCode() {
        Integer num = this.itemType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.itemName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Price price = this.itemPrice;
        int iHashCode3 = (iHashCode2 + (price == null ? 0 : price.hashCode())) * 31;
        Icon icon = this.logo;
        int iHashCode4 = (iHashCode3 + (icon == null ? 0 : icon.hashCode())) * 31;
        Integer num2 = this.itemTextColor;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.itemTextFont;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.itemText;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BillItem> list = this.subItems;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.itemExplain;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ECRichText eCRichText = this.popupExplain;
        int iHashCode10 = (iHashCode9 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        PopupButton popupButton = this.popupButton;
        int iHashCode11 = (iHashCode10 + (popupButton == null ? 0 : popupButton.hashCode())) * 31;
        ECRichText eCRichText2 = this.richTextItemName;
        int iHashCode12 = (iHashCode11 + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        Boolean bool = this.hasDivider;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasPopup;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<Icon> list2 = this.popupBanner;
        int iHashCode15 = (iHashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Price price2 = this.originalPrice;
        int iHashCode16 = (iHashCode15 + (price2 == null ? 0 : price2.hashCode())) * 31;
        Integer num4 = this.popupStyle;
        int iHashCode17 = (iHashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.daInfo;
        int iHashCode18 = (iHashCode17 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.itemNameEn;
        int iHashCode19 = (iHashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ECRichText eCRichText3 = this.itemNameRichText;
        int iHashCode20 = (iHashCode19 + (eCRichText3 == null ? 0 : eCRichText3.hashCode())) * 31;
        Icon icon2 = this.beforeIcon;
        return iHashCode20 + (icon2 != null ? icon2.hashCode() : 0);
    }

    public final String toString() {
        return "BillItem(itemType=" + this.itemType + ", itemName=" + this.itemName + ", itemPrice=" + this.itemPrice + ", logo=" + this.logo + ", itemTextColor=" + this.itemTextColor + ", itemTextFont=" + this.itemTextFont + ", itemText=" + this.itemText + ", subItems=" + this.subItems + ", itemExplain=" + this.itemExplain + ", popupExplain=" + this.popupExplain + ", popupButton=" + this.popupButton + ", richTextItemName=" + this.richTextItemName + ", hasDivider=" + this.hasDivider + ", hasPopup=" + this.hasPopup + ", popupBanner=" + this.popupBanner + ", originalPrice=" + this.originalPrice + ", popupStyle=" + this.popupStyle + ", daInfo=" + this.daInfo + ", itemNameEn=" + this.itemNameEn + ", itemNameRichText=" + this.itemNameRichText + ", beforeIcon=" + this.beforeIcon + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.itemType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.itemName);
        Price price = this.itemPrice;
        if (price == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            price.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.logo, i);
        Integer num2 = this.itemTextColor;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.itemTextFont;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.itemText);
        List<BillItem> list = this.subItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<BillItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.itemExplain);
        parcel.writeParcelable(this.popupExplain, i);
        PopupButton popupButton = this.popupButton;
        if (popupButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            popupButton.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.richTextItemName, i);
        Boolean bool = this.hasDivider;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.hasPopup;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        List<Icon> list2 = this.popupBanner;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Icon> it3 = list2.iterator();
            while (it3.hasNext()) {
                parcel.writeParcelable(it3.next(), i);
            }
        }
        Price price2 = this.originalPrice;
        if (price2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            price2.writeToParcel(parcel, i);
        }
        Integer num4 = this.popupStyle;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.daInfo);
        parcel.writeString(this.itemNameEn);
        parcel.writeParcelable(this.itemNameRichText, i);
        parcel.writeParcelable(this.beforeIcon, i);
    }

    public BillItem(Integer num, String str, Price price, Icon icon, Integer num2, Integer num3, String str2, List<BillItem> list, String str3, ECRichText eCRichText, PopupButton popupButton, ECRichText eCRichText2, Boolean bool, Boolean bool2, List<Icon> list2, Price price2, Integer num4, String str4, String str5, ECRichText eCRichText3, Icon icon2) {
        this.itemType = num;
        this.itemName = str;
        this.itemPrice = price;
        this.logo = icon;
        this.itemTextColor = num2;
        this.itemTextFont = num3;
        this.itemText = str2;
        this.subItems = list;
        this.itemExplain = str3;
        this.popupExplain = eCRichText;
        this.popupButton = popupButton;
        this.richTextItemName = eCRichText2;
        this.hasDivider = bool;
        this.hasPopup = bool2;
        this.popupBanner = list2;
        this.originalPrice = price2;
        this.popupStyle = num4;
        this.daInfo = str4;
        this.itemNameEn = str5;
        this.itemNameRichText = eCRichText3;
        this.beforeIcon = icon2;
    }
}
