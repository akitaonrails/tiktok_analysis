package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StaticSellingPoint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StaticSellingPoint implements Parcelable {

    @C09CT("background_color")
    public final CommonColor backgroundColor;

    @C09CT("button_type")
    public final String buttonType;

    @C09CT("description")
    public final String description;

    @C09CT("icon")
    public final Icon icon;

    @C09CT("label_color")
    public final CommonColor labelColor;

    @C09CT("position")
    public final Integer position;

    @C09CT("title")
    public final String title;
    public static final Parcelable.Creator<StaticSellingPoint> CREATOR = new Parcelable.Creator<StaticSellingPoint>() { // from class: X.03zN
        @Override // android.os.Parcelable.Creator
        public final StaticSellingPoint createFromParcel(Parcel parcel) {
            CommonColor commonColorCreateFromParcel;
            Integer numValueOf;
            Icon icon = (Icon) parcel.readParcelable(StaticSellingPoint.class.getClassLoader());
            String string = parcel.readString();
            CommonColor commonColorCreateFromParcel2 = null;
            if (parcel.readInt() == 0) {
                commonColorCreateFromParcel = null;
            } else {
                commonColorCreateFromParcel = CommonColor.CREATOR.createFromParcel(parcel);
            }
            CommonColor commonColor = commonColorCreateFromParcel;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                commonColorCreateFromParcel2 = CommonColor.CREATOR.createFromParcel(parcel);
            }
            return new StaticSellingPoint(icon, string, commonColor, string2, string3, numValueOf, commonColorCreateFromParcel2);
        }

        @Override // android.os.Parcelable.Creator
        public final StaticSellingPoint[] newArray(int i) {
            return new StaticSellingPoint[i];
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
        if (!(obj instanceof StaticSellingPoint)) {
            return false;
        }
        StaticSellingPoint staticSellingPoint = (StaticSellingPoint) obj;
        return Intrinsics.LJFF(this.icon, staticSellingPoint.icon) && Intrinsics.LJFF(this.title, staticSellingPoint.title) && Intrinsics.LJFF(this.backgroundColor, staticSellingPoint.backgroundColor) && Intrinsics.LJFF(this.description, staticSellingPoint.description) && Intrinsics.LJFF(this.buttonType, staticSellingPoint.buttonType) && Intrinsics.LJFF(this.position, staticSellingPoint.position) && Intrinsics.LJFF(this.labelColor, staticSellingPoint.labelColor);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CommonColor commonColor = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonType;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.position;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        CommonColor commonColor2 = this.labelColor;
        return iHashCode6 + (commonColor2 != null ? commonColor2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StaticSellingPoint(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", buttonType=");
        sbLIZ.append(this.buttonType);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(", labelColor=");
        sbLIZ.append(this.labelColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.icon, i);
        parcel.writeString(this.title);
        CommonColor commonColor = this.backgroundColor;
        if (commonColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonColor.writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
        parcel.writeString(this.buttonType);
        Integer num = this.position;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        CommonColor commonColor2 = this.labelColor;
        if (commonColor2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonColor2.writeToParcel(parcel, i);
        }
    }

    public StaticSellingPoint(Icon icon, String str, CommonColor commonColor, String str2, String str3, Integer num, CommonColor commonColor2) {
        this.icon = icon;
        this.title = str;
        this.backgroundColor = commonColor;
        this.description = str2;
        this.buttonType = str3;
        this.position = num;
        this.labelColor = commonColor2;
    }
}
