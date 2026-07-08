package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropToolTip;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SalePropValue implements Parcelable {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("extended_images")
    public List<Image> extendedImages;

    @C09CT("image")
    public Image image;

    @C09CT("is_default_selected")
    public Boolean isDefaultSelected;

    @C09CT("prop_tool_tip")
    public SalePropToolTip propToolTip;

    @C09CT("prop_value")
    public String propValue;

    @C09CT("prop_value_display_price")
    public String propValueDisplayPrice;

    @C09CT("prop_value_id")
    public String propValueId;

    @C09CT("tag")
    public SalePropTag salePropTag;
    public static final Parcelable.Creator<SalePropValue> CREATOR = new Parcelable.Creator<SalePropValue>() { // from class: X.02lT
        @Override // android.os.Parcelable.Creator
        public final SalePropValue createFromParcel(Parcel parcel) {
            SalePropToolTip salePropToolTipCreateFromParcel;
            SalePropTag salePropTagCreateFromParcel;
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(SalePropValue.class.getClassLoader());
            String string3 = parcel.readString();
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                salePropToolTipCreateFromParcel = null;
            } else {
                salePropToolTipCreateFromParcel = SalePropToolTip.CREATOR.createFromParcel(parcel);
            }
            SalePropToolTip salePropToolTip = salePropToolTipCreateFromParcel;
            if (parcel.readInt() == 0) {
                salePropTagCreateFromParcel = null;
            } else {
                salePropTagCreateFromParcel = SalePropTag.CREATOR.createFromParcel(parcel);
            }
            SalePropTag salePropTag = salePropTagCreateFromParcel;
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
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(SalePropValue.class.getClassLoader()));
                }
            }
            return new SalePropValue(string, string2, image, string3, salePropToolTip, salePropTag, boolValueOf, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SalePropValue[] newArray(int i) {
            return new SalePropValue[i];
        }
    };
    public static final int $stable = 8;

    public SalePropValue() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SalePropValue)) {
            return false;
        }
        SalePropValue salePropValue = (SalePropValue) obj;
        return Intrinsics.LJFF(this.propValueId, salePropValue.propValueId) && Intrinsics.LJFF(this.propValue, salePropValue.propValue) && Intrinsics.LJFF(this.image, salePropValue.image) && Intrinsics.LJFF(this.propValueDisplayPrice, salePropValue.propValueDisplayPrice) && Intrinsics.LJFF(this.propToolTip, salePropValue.propToolTip) && Intrinsics.LJFF(this.salePropTag, salePropValue.salePropTag) && Intrinsics.LJFF(this.isDefaultSelected, salePropValue.isDefaultSelected) && Intrinsics.LJFF(this.extendedImages, salePropValue.extendedImages) && Intrinsics.LJFF(this.daInfo, salePropValue.daInfo);
    }

    public final int hashCode() {
        String str = this.propValueId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.propValue;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.image;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str3 = this.propValueDisplayPrice;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SalePropToolTip salePropToolTip = this.propToolTip;
        int iHashCode5 = (iHashCode4 + (salePropToolTip == null ? 0 : salePropToolTip.hashCode())) * 31;
        SalePropTag salePropTag = this.salePropTag;
        int iHashCode6 = (iHashCode5 + (salePropTag == null ? 0 : salePropTag.hashCode())) * 31;
        Boolean bool = this.isDefaultSelected;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Image> list = this.extendedImages;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.daInfo;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SalePropValue(propValueId=");
        sbLIZ.append(this.propValueId);
        sbLIZ.append(", propValue=");
        sbLIZ.append(this.propValue);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", propValueDisplayPrice=");
        sbLIZ.append(this.propValueDisplayPrice);
        sbLIZ.append(", propToolTip=");
        sbLIZ.append(this.propToolTip);
        sbLIZ.append(", salePropTag=");
        sbLIZ.append(this.salePropTag);
        sbLIZ.append(", isDefaultSelected=");
        sbLIZ.append(this.isDefaultSelected);
        sbLIZ.append(", extendedImages=");
        sbLIZ.append(this.extendedImages);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static SalePropValue LIZ(SalePropValue salePropValue) {
        String str = salePropValue.propValueId;
        String str2 = salePropValue.propValue;
        Image image = salePropValue.image;
        String str3 = salePropValue.propValueDisplayPrice;
        SalePropToolTip salePropToolTip = salePropValue.propToolTip;
        SalePropTag salePropTag = salePropValue.salePropTag;
        List<Image> list = salePropValue.extendedImages;
        String str4 = salePropValue.daInfo;
        salePropValue.getClass();
        return new SalePropValue(str, str2, image, str3, salePropToolTip, salePropTag, null, list, str4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.propValueId);
        parcel.writeString(this.propValue);
        parcel.writeParcelable(this.image, i);
        parcel.writeString(this.propValueDisplayPrice);
        SalePropToolTip salePropToolTip = this.propToolTip;
        if (salePropToolTip == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(salePropToolTip.richText, i);
        }
        SalePropTag salePropTag = this.salePropTag;
        if (salePropTag == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            salePropTag.writeToParcel(parcel, i);
        }
        Boolean bool = this.isDefaultSelected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<Image> list = this.extendedImages;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Image> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeString(this.daInfo);
    }

    public SalePropValue(String str, String str2, Image image, String str3, SalePropToolTip salePropToolTip, SalePropTag salePropTag, Boolean bool, List<Image> list, String str4) {
        this.propValueId = str;
        this.propValue = str2;
        this.image = image;
        this.propValueDisplayPrice = str3;
        this.propToolTip = salePropToolTip;
        this.salePropTag = salePropTag;
        this.isDefaultSelected = bool;
        this.extendedImages = list;
        this.daInfo = str4;
    }
}
