package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C7900036s;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerCountdown;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerTextV3;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistJumpSchema;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BannerComponent implements Parcelable {

    @C09CT("banner_countdown")
    public final BannerCountdown bannerCountdown;

    @C09CT("banner_text")
    public final LinkRichText bannerText;

    @C09CT("banner_text_ec_richtext")
    public final ECRichText bannerTextECRichText;

    @C09CT("banner_text_ec_richtext__v2")
    public final List<ECRichText> bannerTextECRichTextV2;

    @C09CT("banner_text_v2")
    public final List<LinkRichText> bannerTextV2;

    @C09CT("banner_text_v3")
    public final List<BannerTextV3> bannerTextV3;

    @C09CT("btm_code")
    public final String btmCode;

    @C09CT("component_type")
    public final int componentType;

    @C09CT("suffix_icon")
    public final Icon endSuffixIcon;

    @C09CT("jump_schema")
    public final WaistJumpSchema jumpSchema;

    @C09CT("prefix_icon_inner_border_color")
    public final String prefixIconInnerBorderColor;

    @C09CT("prefix_icon_inner_border_transparency")
    public final Float prefixIconInnerBorderTransparency;

    @C09CT("reminder_button")
    public final ReminderButton reminderButton;

    @C09CT("top_offset")
    public final Integer topOffset;
    public static final C7900036s Companion = new Object() { // from class: X.036s
    };
    public static final Parcelable.Creator<BannerComponent> CREATOR = new Parcelable.Creator<BannerComponent>() { // from class: X.036r
        @Override // android.os.Parcelable.Creator
        public final BannerComponent createFromParcel(Parcel parcel) {
            LinkRichText linkRichTextCreateFromParcel;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            BannerCountdown bannerCountdownCreateFromParcel;
            ReminderButton reminderButtonCreateFromParcel;
            Float fValueOf;
            WaistJumpSchema waistJumpSchemaCreateFromParcel;
            int i = parcel.readInt();
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                linkRichTextCreateFromParcel = null;
            } else {
                linkRichTextCreateFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            LinkRichText linkRichText = linkRichTextCreateFromParcel;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(BannerComponent.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(LinkRichText.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i4 = parcel.readInt();
                arrayList2 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList2.add(BannerTextV3.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i6 = parcel.readInt();
                arrayList3 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList3.add(parcel.readParcelable(BannerComponent.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 0) {
                bannerCountdownCreateFromParcel = null;
            } else {
                bannerCountdownCreateFromParcel = BannerCountdown.CREATOR.createFromParcel(parcel);
            }
            BannerCountdown bannerCountdown = bannerCountdownCreateFromParcel;
            if (parcel.readInt() == 0) {
                reminderButtonCreateFromParcel = null;
            } else {
                reminderButtonCreateFromParcel = ReminderButton.CREATOR.createFromParcel(parcel);
            }
            ReminderButton reminderButton = reminderButtonCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                waistJumpSchemaCreateFromParcel = null;
            } else {
                waistJumpSchemaCreateFromParcel = WaistJumpSchema.CREATOR.createFromParcel(parcel);
            }
            WaistJumpSchema waistJumpSchema = waistJumpSchemaCreateFromParcel;
            String string2 = parcel.readString();
            Icon icon = (Icon) parcel.readParcelable(BannerComponent.class.getClassLoader());
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new BannerComponent(i, linkRichText, eCRichText, arrayList, arrayList2, arrayList3, bannerCountdown, reminderButton, string, fValueOf, waistJumpSchema, string2, icon, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BannerComponent[] newArray(int i) {
            return new BannerComponent[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerComponent)) {
            return false;
        }
        BannerComponent bannerComponent = (BannerComponent) obj;
        return this.componentType == bannerComponent.componentType && Intrinsics.LJFF(this.bannerText, bannerComponent.bannerText) && Intrinsics.LJFF(this.bannerTextECRichText, bannerComponent.bannerTextECRichText) && Intrinsics.LJFF(this.bannerTextV2, bannerComponent.bannerTextV2) && Intrinsics.LJFF(this.bannerTextV3, bannerComponent.bannerTextV3) && Intrinsics.LJFF(this.bannerTextECRichTextV2, bannerComponent.bannerTextECRichTextV2) && Intrinsics.LJFF(this.bannerCountdown, bannerComponent.bannerCountdown) && Intrinsics.LJFF(this.reminderButton, bannerComponent.reminderButton) && Intrinsics.LJFF(this.prefixIconInnerBorderColor, bannerComponent.prefixIconInnerBorderColor) && Intrinsics.LJFF(this.prefixIconInnerBorderTransparency, bannerComponent.prefixIconInnerBorderTransparency) && Intrinsics.LJFF(this.jumpSchema, bannerComponent.jumpSchema) && Intrinsics.LJFF(this.btmCode, bannerComponent.btmCode) && Intrinsics.LJFF(this.endSuffixIcon, bannerComponent.endSuffixIcon) && Intrinsics.LJFF(this.topOffset, bannerComponent.topOffset);
    }

    public final int hashCode() {
        int i = this.componentType * 31;
        LinkRichText linkRichText = this.bannerText;
        int iHashCode = (i + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        ECRichText eCRichText = this.bannerTextECRichText;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        List<LinkRichText> list = this.bannerTextV2;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BannerTextV3> list2 = this.bannerTextV3;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ECRichText> list3 = this.bannerTextECRichTextV2;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        BannerCountdown bannerCountdown = this.bannerCountdown;
        int iHashCode6 = (iHashCode5 + (bannerCountdown == null ? 0 : bannerCountdown.hashCode())) * 31;
        ReminderButton reminderButton = this.reminderButton;
        int iHashCode7 = (iHashCode6 + (reminderButton == null ? 0 : reminderButton.hashCode())) * 31;
        String str = this.prefixIconInnerBorderColor;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.prefixIconInnerBorderTransparency;
        int iHashCode9 = (iHashCode8 + (f == null ? 0 : f.hashCode())) * 31;
        WaistJumpSchema waistJumpSchema = this.jumpSchema;
        int iHashCode10 = (iHashCode9 + (waistJumpSchema == null ? 0 : waistJumpSchema.hashCode())) * 31;
        String str2 = this.btmCode;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Icon icon = this.endSuffixIcon;
        int iHashCode12 = (iHashCode11 + (icon == null ? 0 : icon.hashCode())) * 31;
        Integer num = this.topOffset;
        return iHashCode12 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "BannerComponent(componentType=" + this.componentType + ", bannerText=" + this.bannerText + ", bannerTextECRichText=" + this.bannerTextECRichText + ", bannerTextV2=" + this.bannerTextV2 + ", bannerTextV3=" + this.bannerTextV3 + ", bannerTextECRichTextV2=" + this.bannerTextECRichTextV2 + ", bannerCountdown=" + this.bannerCountdown + ", reminderButton=" + this.reminderButton + ", prefixIconInnerBorderColor=" + this.prefixIconInnerBorderColor + ", prefixIconInnerBorderTransparency=" + this.prefixIconInnerBorderTransparency + ", jumpSchema=" + this.jumpSchema + ", btmCode=" + this.btmCode + ", endSuffixIcon=" + this.endSuffixIcon + ", topOffset=" + this.topOffset + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.componentType);
        LinkRichText linkRichText = this.bannerText;
        if (linkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.bannerTextECRichText, i);
        List<LinkRichText> list = this.bannerTextV2;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<LinkRichText> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<BannerTextV3> list2 = this.bannerTextV3;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<BannerTextV3> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        List<ECRichText> list3 = this.bannerTextECRichTextV2;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<ECRichText> it4 = list3.iterator();
            while (it4.hasNext()) {
                parcel.writeParcelable(it4.next(), i);
            }
        }
        BannerCountdown bannerCountdown = this.bannerCountdown;
        if (bannerCountdown == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bannerCountdown.writeToParcel(parcel, i);
        }
        ReminderButton reminderButton = this.reminderButton;
        if (reminderButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reminderButton.writeToParcel(parcel, i);
        }
        parcel.writeString(this.prefixIconInnerBorderColor);
        Float f = this.prefixIconInnerBorderTransparency;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        WaistJumpSchema waistJumpSchema = this.jumpSchema;
        if (waistJumpSchema == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            waistJumpSchema.writeToParcel(parcel, i);
        }
        parcel.writeString(this.btmCode);
        parcel.writeParcelable(this.endSuffixIcon, i);
        Integer num = this.topOffset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public static BannerComponent LIZ(BannerComponent bannerComponent) {
        int i = bannerComponent.componentType;
        LinkRichText linkRichText = bannerComponent.bannerText;
        ECRichText eCRichText = bannerComponent.bannerTextECRichText;
        List<LinkRichText> list = bannerComponent.bannerTextV2;
        List<BannerTextV3> list2 = bannerComponent.bannerTextV3;
        List<ECRichText> list3 = bannerComponent.bannerTextECRichTextV2;
        BannerCountdown bannerCountdown = bannerComponent.bannerCountdown;
        String str = bannerComponent.prefixIconInnerBorderColor;
        Float f = bannerComponent.prefixIconInnerBorderTransparency;
        WaistJumpSchema waistJumpSchema = bannerComponent.jumpSchema;
        String str2 = bannerComponent.btmCode;
        Icon icon = bannerComponent.endSuffixIcon;
        Integer num = bannerComponent.topOffset;
        bannerComponent.getClass();
        return new BannerComponent(i, linkRichText, eCRichText, list, list2, list3, bannerCountdown, null, str, f, waistJumpSchema, str2, icon, num);
    }

    public BannerComponent(int i, LinkRichText linkRichText, ECRichText eCRichText, List<LinkRichText> list, List<BannerTextV3> list2, List<ECRichText> list3, BannerCountdown bannerCountdown, ReminderButton reminderButton, String str, Float f, WaistJumpSchema waistJumpSchema, String str2, Icon icon, Integer num) {
        this.componentType = i;
        this.bannerText = linkRichText;
        this.bannerTextECRichText = eCRichText;
        this.bannerTextV2 = list;
        this.bannerTextV3 = list2;
        this.bannerTextECRichTextV2 = list3;
        this.bannerCountdown = bannerCountdown;
        this.reminderButton = reminderButton;
        this.prefixIconInnerBorderColor = str;
        this.prefixIconInnerBorderTransparency = f;
        this.jumpSchema = waistJumpSchema;
        this.btmCode = str2;
        this.endSuffixIcon = icon;
        this.topOffset = num;
    }
}
