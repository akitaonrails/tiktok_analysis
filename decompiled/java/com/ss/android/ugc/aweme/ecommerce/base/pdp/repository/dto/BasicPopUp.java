package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUpExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LynxInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpMynaBannerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaistBannerBackground;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.pendant.model.SeaPdpPendantData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.popup.model.SeaPdpPopupData;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextContainer;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Spacing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class BasicPopUp implements Parcelable {

    @C09CT("background")
    public final PromotionWaistBannerBackground background;

    @C09CT("pdp_myna_banner_info")
    public final PdpMynaBannerInfo bottomMynaBannerInfo;

    @C09CT("buttons")
    public final List<PopUpButton> buttons;

    @C09CT("content")
    public final List<ECRichTextContainer> content;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("display_duration_sec")
    public final Integer displayDurationSec;

    @C09CT("extra_info")
    public final BasicPopUpExtraInfo extraInfo;

    @C09CT("icon")
    public final Icon icon;

    @C09CT("is_dismissable")
    public final Boolean isDismissable;

    @C09CT("is_icon_size_dynamic")
    public final Boolean isIconSizeDynamic;

    @C09CT("is_title_fixed_to_top")
    public final Boolean isTitleFixedToTop;

    @C09CT("lynx_info")
    public final LynxInfo lynxInfo;

    @C09CT("page_padding")
    public final Spacing pagePadding;

    @C09CT("pendant_config")
    public final SeaPdpPendantData pendantData;

    @C09CT("pop_up_type")
    public final Integer popUpType;

    @C09CT("popup_config")
    public final SeaPdpPopupData popupData;

    @C09CT("style")
    public final Integer style;

    @C09CT("subtitle")
    public final ECRichText subtitle;

    @C09CT("title")
    public final ECRichText title;
    public static final Parcelable.Creator<BasicPopUp> CREATOR = new Parcelable.Creator<BasicPopUp>() { // from class: X.0mgk
        @Override // android.os.Parcelable.Creator
        public final BasicPopUp createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            Integer numValueOf2;
            boolean z2;
            Boolean boolValueOf2;
            Integer numValueOf3;
            BasicPopUpExtraInfo basicPopUpExtraInfoCreateFromParcel;
            LynxInfo lynxInfoCreateFromParcel;
            boolean z3;
            Boolean boolValueOf3;
            SeaPdpPopupData seaPdpPopupDataCreateFromParcel;
            SeaPdpPendantData seaPdpPendantDataCreateFromParcel;
            PdpMynaBannerInfo pdpMynaBannerInfoCreateFromParcel;
            PromotionWaistBannerBackground promotionWaistBannerBackgroundCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            Icon icon = (Icon) parcel.readParcelable(BasicPopUp.class.getClassLoader());
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
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(BasicPopUp.class.getClassLoader());
            ECRichText eCRichText2 = (ECRichText) parcel.readParcelable(BasicPopUp.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(BasicPopUp.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(PopUpButton.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                basicPopUpExtraInfoCreateFromParcel = null;
            } else {
                basicPopUpExtraInfoCreateFromParcel = BasicPopUpExtraInfo.CREATOR.createFromParcel(parcel);
            }
            BasicPopUpExtraInfo basicPopUpExtraInfo = basicPopUpExtraInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                lynxInfoCreateFromParcel = null;
            } else {
                lynxInfoCreateFromParcel = LynxInfo.CREATOR.createFromParcel(parcel);
            }
            LynxInfo lynxInfo = lynxInfoCreateFromParcel;
            Spacing spacing = (Spacing) parcel.readParcelable(BasicPopUp.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            if (parcel.readInt() == 0) {
                seaPdpPopupDataCreateFromParcel = null;
            } else {
                seaPdpPopupDataCreateFromParcel = SeaPdpPopupData.CREATOR.createFromParcel(parcel);
            }
            SeaPdpPopupData seaPdpPopupData = seaPdpPopupDataCreateFromParcel;
            if (parcel.readInt() == 0) {
                seaPdpPendantDataCreateFromParcel = null;
            } else {
                seaPdpPendantDataCreateFromParcel = SeaPdpPendantData.CREATOR.createFromParcel(parcel);
            }
            SeaPdpPendantData seaPdpPendantData = seaPdpPendantDataCreateFromParcel;
            if (parcel.readInt() == 0) {
                pdpMynaBannerInfoCreateFromParcel = null;
            } else {
                pdpMynaBannerInfoCreateFromParcel = PdpMynaBannerInfo.CREATOR.createFromParcel(parcel);
            }
            PdpMynaBannerInfo pdpMynaBannerInfo = pdpMynaBannerInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                promotionWaistBannerBackgroundCreateFromParcel = null;
            } else {
                promotionWaistBannerBackgroundCreateFromParcel = PromotionWaistBannerBackground.CREATOR.createFromParcel(parcel);
            }
            return new BasicPopUp(numValueOf, icon, boolValueOf, eCRichText, eCRichText2, arrayList, arrayList2, numValueOf2, boolValueOf2, numValueOf3, string, basicPopUpExtraInfo, lynxInfo, spacing, boolValueOf3, seaPdpPopupData, seaPdpPendantData, pdpMynaBannerInfo, promotionWaistBannerBackgroundCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BasicPopUp[] newArray(int i) {
            return new BasicPopUp[i];
        }
    };
    public static final int $stable = 8;

    public BasicPopUp() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicPopUp)) {
            return false;
        }
        BasicPopUp basicPopUp = (BasicPopUp) obj;
        return Intrinsics.LJFF(this.style, basicPopUp.style) && Intrinsics.LJFF(this.icon, basicPopUp.icon) && Intrinsics.LJFF(this.isIconSizeDynamic, basicPopUp.isIconSizeDynamic) && Intrinsics.LJFF(this.title, basicPopUp.title) && Intrinsics.LJFF(this.subtitle, basicPopUp.subtitle) && Intrinsics.LJFF(this.content, basicPopUp.content) && Intrinsics.LJFF(this.buttons, basicPopUp.buttons) && Intrinsics.LJFF(this.displayDurationSec, basicPopUp.displayDurationSec) && Intrinsics.LJFF(this.isDismissable, basicPopUp.isDismissable) && Intrinsics.LJFF(this.popUpType, basicPopUp.popUpType) && Intrinsics.LJFF(this.daInfo, basicPopUp.daInfo) && Intrinsics.LJFF(this.extraInfo, basicPopUp.extraInfo) && Intrinsics.LJFF(this.lynxInfo, basicPopUp.lynxInfo) && Intrinsics.LJFF(this.pagePadding, basicPopUp.pagePadding) && Intrinsics.LJFF(this.isTitleFixedToTop, basicPopUp.isTitleFixedToTop) && Intrinsics.LJFF(this.popupData, basicPopUp.popupData) && Intrinsics.LJFF(this.pendantData, basicPopUp.pendantData) && Intrinsics.LJFF(this.bottomMynaBannerInfo, basicPopUp.bottomMynaBannerInfo) && Intrinsics.LJFF(this.background, basicPopUp.background);
    }

    public final int hashCode() {
        Integer num = this.style;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Icon icon = this.icon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        Boolean bool = this.isIconSizeDynamic;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        ECRichText eCRichText = this.title;
        int iHashCode4 = (iHashCode3 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        ECRichText eCRichText2 = this.subtitle;
        int iHashCode5 = (iHashCode4 + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        List<ECRichTextContainer> list = this.content;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<PopUpButton> list2 = this.buttons;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num2 = this.displayDurationSec;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.isDismissable;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.popUpType;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.daInfo;
        int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        BasicPopUpExtraInfo basicPopUpExtraInfo = this.extraInfo;
        int iHashCode12 = (iHashCode11 + (basicPopUpExtraInfo == null ? 0 : basicPopUpExtraInfo.hashCode())) * 31;
        LynxInfo lynxInfo = this.lynxInfo;
        int iHashCode13 = (iHashCode12 + (lynxInfo == null ? 0 : lynxInfo.hashCode())) * 31;
        Spacing spacing = this.pagePadding;
        int iHashCode14 = (iHashCode13 + (spacing == null ? 0 : spacing.hashCode())) * 31;
        Boolean bool3 = this.isTitleFixedToTop;
        int iHashCode15 = (iHashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        SeaPdpPopupData seaPdpPopupData = this.popupData;
        int iHashCode16 = (iHashCode15 + (seaPdpPopupData == null ? 0 : seaPdpPopupData.hashCode())) * 31;
        SeaPdpPendantData seaPdpPendantData = this.pendantData;
        int iHashCode17 = (iHashCode16 + (seaPdpPendantData == null ? 0 : seaPdpPendantData.hashCode())) * 31;
        PdpMynaBannerInfo pdpMynaBannerInfo = this.bottomMynaBannerInfo;
        int iHashCode18 = (iHashCode17 + (pdpMynaBannerInfo == null ? 0 : pdpMynaBannerInfo.hashCode())) * 31;
        PromotionWaistBannerBackground promotionWaistBannerBackground = this.background;
        return iHashCode18 + (promotionWaistBannerBackground != null ? promotionWaistBannerBackground.hashCode() : 0);
    }

    public final String toString() {
        return "BasicPopUp(style=" + this.style + ", icon=" + this.icon + ", isIconSizeDynamic=" + this.isIconSizeDynamic + ", title=" + this.title + ", subtitle=" + this.subtitle + ", content=" + this.content + ", buttons=" + this.buttons + ", displayDurationSec=" + this.displayDurationSec + ", isDismissable=" + this.isDismissable + ", popUpType=" + this.popUpType + ", daInfo=" + this.daInfo + ", extraInfo=" + this.extraInfo + ", lynxInfo=" + this.lynxInfo + ", pagePadding=" + this.pagePadding + ", isTitleFixedToTop=" + this.isTitleFixedToTop + ", popupData=" + this.popupData + ", pendantData=" + this.pendantData + ", bottomMynaBannerInfo=" + this.bottomMynaBannerInfo + ", background=" + this.background + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.style;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeParcelable(this.icon, i);
        Boolean bool = this.isIconSizeDynamic;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.title, i);
        parcel.writeParcelable(this.subtitle, i);
        List<ECRichTextContainer> list = this.content;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ECRichTextContainer> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        List<PopUpButton> list2 = this.buttons;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<PopUpButton> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        Integer num2 = this.displayDurationSec;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool2 = this.isDismissable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num3 = this.popUpType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.daInfo);
        BasicPopUpExtraInfo basicPopUpExtraInfo = this.extraInfo;
        if (basicPopUpExtraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basicPopUpExtraInfo.writeToParcel(parcel, i);
        }
        LynxInfo lynxInfo = this.lynxInfo;
        if (lynxInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lynxInfo.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.pagePadding, i);
        Boolean bool3 = this.isTitleFixedToTop;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        SeaPdpPopupData seaPdpPopupData = this.popupData;
        if (seaPdpPopupData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaPdpPopupData.writeToParcel(parcel, i);
        }
        SeaPdpPendantData seaPdpPendantData = this.pendantData;
        if (seaPdpPendantData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaPdpPendantData.writeToParcel(parcel, i);
        }
        PdpMynaBannerInfo pdpMynaBannerInfo = this.bottomMynaBannerInfo;
        if (pdpMynaBannerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pdpMynaBannerInfo.writeToParcel(parcel, i);
        }
        PromotionWaistBannerBackground promotionWaistBannerBackground = this.background;
        if (promotionWaistBannerBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotionWaistBannerBackground.writeToParcel(parcel, i);
        }
    }

    public BasicPopUp(Integer num, Icon icon, Boolean bool, ECRichText eCRichText, ECRichText eCRichText2, List<ECRichTextContainer> list, List<PopUpButton> list2, Integer num2, Boolean bool2, Integer num3, String str, BasicPopUpExtraInfo basicPopUpExtraInfo, LynxInfo lynxInfo, Spacing spacing, Boolean bool3, SeaPdpPopupData seaPdpPopupData, SeaPdpPendantData seaPdpPendantData, PdpMynaBannerInfo pdpMynaBannerInfo, PromotionWaistBannerBackground promotionWaistBannerBackground) {
        this.style = num;
        this.icon = icon;
        this.isIconSizeDynamic = bool;
        this.title = eCRichText;
        this.subtitle = eCRichText2;
        this.content = list;
        this.buttons = list2;
        this.displayDurationSec = num2;
        this.isDismissable = bool2;
        this.popUpType = num3;
        this.daInfo = str;
        this.extraInfo = basicPopUpExtraInfo;
        this.lynxInfo = lynxInfo;
        this.pagePadding = spacing;
        this.isTitleFixedToTop = bool3;
        this.popupData = seaPdpPopupData;
        this.pendantData = seaPdpPendantData;
        this.bottomMynaBannerInfo = pdpMynaBannerInfo;
        this.background = promotionWaistBannerBackground;
    }
}
