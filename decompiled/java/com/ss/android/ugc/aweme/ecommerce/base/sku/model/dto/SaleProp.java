package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C683002lY;
import X.InterfaceC1053604Ac;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SaleProp implements InterfaceC1053604Ac, Parcelable {

    @C09CT("available_prop_type_display")
    public String availablePropTypeDisplay;

    @C09CT("has_extended_images")
    public Boolean hasExtendImages;

    @C09CT("has_image")
    public Boolean hasImage;

    @C09CT("is_top_sku")
    public Boolean isTopSku;

    @C09CT("prop_id")
    public String propId;

    @C09CT("prop_name")
    public String propName;

    @C09CT("prop_tool_tip_schema")
    public String propToolTipSchema;

    @C09CT("sale_prop_info")
    public ECRichText salePropInfo;

    @C09CT("sale_prop_type")
    public Integer salePropType;

    @C09CT("sale_prop_values")
    public List<SalePropValue> salePropValueList;

    @C09CT("size_show_type")
    public int showType;
    public static final C683002lY ShowType = new Object() { // from class: X.02lY
    };
    public static final Parcelable.Creator<SaleProp> CREATOR = new Parcelable.Creator<SaleProp>() { // from class: X.02lW
        @Override // android.os.Parcelable.Creator
        public final SaleProp createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            ArrayList arrayList;
            Integer numValueOf;
            boolean z2;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z3 = true;
            Boolean boolValueOf3 = null;
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
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SalePropValue.CREATOR.createFromParcel(parcel));
                }
            }
            int i3 = parcel.readInt();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string4 = parcel.readString();
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
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            return new SaleProp(string, string2, boolValueOf, string3, arrayList, i3, numValueOf, string4, boolValueOf2, boolValueOf3, (ECRichText) parcel.readParcelable(SaleProp.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SaleProp[] newArray(int i) {
            return new SaleProp[i];
        }
    };
    public static final int $stable = 8;

    public SaleProp() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaleProp)) {
            return false;
        }
        SaleProp saleProp = (SaleProp) obj;
        return Intrinsics.LJFF(this.propId, saleProp.propId) && Intrinsics.LJFF(this.propName, saleProp.propName) && Intrinsics.LJFF(this.hasImage, saleProp.hasImage) && Intrinsics.LJFF(this.propToolTipSchema, saleProp.propToolTipSchema) && Intrinsics.LJFF(this.salePropValueList, saleProp.salePropValueList) && this.showType == saleProp.showType && Intrinsics.LJFF(this.salePropType, saleProp.salePropType) && Intrinsics.LJFF(this.availablePropTypeDisplay, saleProp.availablePropTypeDisplay) && Intrinsics.LJFF(this.hasExtendImages, saleProp.hasExtendImages) && Intrinsics.LJFF(this.isTopSku, saleProp.isTopSku) && Intrinsics.LJFF(this.salePropInfo, saleProp.salePropInfo);
    }

    public final int hashCode() {
        String str = this.propId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.propName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasImage;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.propToolTipSchema;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<SalePropValue> list = this.salePropValueList;
        int iHashCode5 = (((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31) + this.showType) * 31;
        Integer num = this.salePropType;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.availablePropTypeDisplay;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.hasExtendImages;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isTopSku;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        ECRichText eCRichText = this.salePropInfo;
        return iHashCode9 + (eCRichText != null ? eCRichText.hashCode() : 0);
    }

    public final String toString() {
        return "SaleProp(propId=" + this.propId + ", propName=" + this.propName + ", hasImage=" + this.hasImage + ", propToolTipSchema=" + this.propToolTipSchema + ", salePropValueList=" + this.salePropValueList + ", showType=" + this.showType + ", salePropType=" + this.salePropType + ", availablePropTypeDisplay=" + this.availablePropTypeDisplay + ", hasExtendImages=" + this.hasExtendImages + ", isTopSku=" + this.isTopSku + ", salePropInfo=" + this.salePropInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.propId);
        parcel.writeString(this.propName);
        Boolean bool = this.hasImage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.propToolTipSchema);
        List<SalePropValue> list = this.salePropValueList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SalePropValue> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.showType);
        Integer num = this.salePropType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.availablePropTypeDisplay);
        Boolean bool2 = this.hasExtendImages;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isTopSku;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.salePropInfo, i);
    }

    @Override // X.InterfaceC1053604Ac
    public final Integer LIZ() {
        return this.salePropType;
    }

    @Override // X.InterfaceC1053604Ac
    public final Boolean LIZIZ() {
        return this.hasImage;
    }

    @Override // X.InterfaceC1053604Ac
    public final List<SalePropValue> LIZJ() {
        return this.salePropValueList;
    }

    public final SaleProp LJ(SaleProp saleProp) {
        ArrayList arrayList = new ArrayList();
        List<SalePropValue> list = this.salePropValueList;
        if (list != null) {
            for (SalePropValue salePropValue : list) {
                List<SalePropValue> list2 = saleProp.salePropValueList;
                SalePropValue salePropValue2 = null;
                if (list2 != null) {
                    Iterator<SalePropValue> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        SalePropValue next = it2.next();
                        if (Intrinsics.LJFF(next.propValueId, salePropValue.propValueId)) {
                            salePropValue2 = next;
                            break;
                        }
                    }
                    SalePropValue salePropValue3 = salePropValue2;
                    if (salePropValue3 != null) {
                        salePropValue.getClass();
                        String str = salePropValue3.propValueId;
                        if (str == null) {
                            str = salePropValue.propValueId;
                        }
                        String str2 = salePropValue3.propValue;
                        if (str2 == null) {
                            str2 = salePropValue.propValue;
                        }
                        Image image = salePropValue3.image;
                        if (image == null) {
                            image = salePropValue.image;
                        }
                        String str3 = salePropValue3.propValueDisplayPrice;
                        if (str3 == null) {
                            str3 = salePropValue.propValueDisplayPrice;
                        }
                        SalePropToolTip salePropToolTip = salePropValue3.propToolTip;
                        if (salePropToolTip == null) {
                            salePropToolTip = salePropValue.propToolTip;
                        }
                        SalePropTag salePropTag = salePropValue3.salePropTag;
                        if (salePropTag == null) {
                            salePropTag = salePropValue.salePropTag;
                        }
                        Boolean bool = salePropValue3.isDefaultSelected;
                        if (bool == null) {
                            bool = salePropValue.isDefaultSelected;
                        }
                        List<Image> list3 = salePropValue3.extendedImages;
                        if (list3 == null) {
                            list3 = salePropValue.extendedImages;
                        }
                        String str4 = salePropValue3.daInfo;
                        if (str4 == null) {
                            str4 = salePropValue.daInfo;
                        }
                        salePropValue = new SalePropValue(str, str2, image, str3, salePropToolTip, salePropTag, bool, list3, str4);
                    }
                }
                arrayList.add(salePropValue);
            }
        }
        String str5 = saleProp.propId;
        if (str5 == null) {
            str5 = this.propId;
        }
        String str6 = saleProp.propName;
        if (str6 == null) {
            str6 = this.propName;
        }
        Boolean bool2 = saleProp.hasImage;
        if (bool2 == null) {
            bool2 = this.hasImage;
        }
        String str7 = saleProp.propToolTipSchema;
        if (str7 == null) {
            str7 = this.propToolTipSchema;
        }
        int i = saleProp.showType;
        Integer num = saleProp.salePropType;
        if (num == null) {
            num = this.salePropType;
        }
        String str8 = saleProp.availablePropTypeDisplay;
        if (str8 == null) {
            str8 = this.availablePropTypeDisplay;
        }
        Boolean bool3 = saleProp.hasExtendImages;
        if (bool3 == null) {
            bool3 = this.hasExtendImages;
        }
        Boolean bool4 = saleProp.isTopSku;
        if (bool4 == null) {
            bool4 = this.isTopSku;
        }
        ECRichText eCRichText = saleProp.salePropInfo;
        if (eCRichText == null) {
            eCRichText = this.salePropInfo;
        }
        return new SaleProp(str5, str6, bool2, str7, arrayList, i, num, str8, bool3, bool4, eCRichText);
    }

    public static SaleProp LIZLLL(SaleProp saleProp, List list, int i, int i2) {
        String str;
        String str2;
        Boolean bool;
        String str3;
        Integer num;
        String str4;
        Boolean bool2;
        Boolean bool3;
        int i3 = i;
        List list2 = list;
        ECRichText eCRichText = null;
        if ((i2 & 1) != 0) {
            str = saleProp.propId;
        } else {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = saleProp.propName;
        } else {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            bool = saleProp.hasImage;
        } else {
            bool = null;
        }
        if ((i2 & 8) != 0) {
            str3 = saleProp.propToolTipSchema;
        } else {
            str3 = null;
        }
        if ((i2 & 16) != 0) {
            list2 = saleProp.salePropValueList;
        }
        if ((i2 & 32) != 0) {
            i3 = saleProp.showType;
        }
        if ((i2 & 64) != 0) {
            num = saleProp.salePropType;
        } else {
            num = null;
        }
        if ((i2 & 128) != 0) {
            str4 = saleProp.availablePropTypeDisplay;
        } else {
            str4 = null;
        }
        if ((i2 & 256) != 0) {
            bool2 = saleProp.hasExtendImages;
        } else {
            bool2 = null;
        }
        if ((i2 & 512) != 0) {
            bool3 = saleProp.isTopSku;
        } else {
            bool3 = null;
        }
        if ((i2 & 1024) != 0) {
            eCRichText = saleProp.salePropInfo;
        }
        return new SaleProp(str, str2, bool, str3, list2, i3, num, str4, bool2, bool3, eCRichText);
    }

    public SaleProp(String str, String str2, Boolean bool, String str3, List<SalePropValue> list, int i, Integer num, String str4, Boolean bool2, Boolean bool3, ECRichText eCRichText) {
        this.propId = str;
        this.propName = str2;
        this.hasImage = bool;
        this.propToolTipSchema = str3;
        this.salePropValueList = list;
        this.showType = i;
        this.salePropType = num;
        this.availablePropTypeDisplay = str4;
        this.hasExtendImages = bool2;
        this.isTopSku = bool3;
        this.salePropInfo = eCRichText;
    }
}
