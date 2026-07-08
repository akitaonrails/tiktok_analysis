package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselSparkInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.SparkPageControlColor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CarouselSparkInfo implements Parcelable {

    @C09CT("passthrough_data")
    public final String data;

    @C09CT("dynamic_cell_type")
    public final Integer dynamicCellType;

    @C09CT("page_control_color")
    public final SparkPageControlColor pageControlColor;

    @C09CT("schema")
    public String schema;
    public static final Parcelable.Creator<CarouselSparkInfo> CREATOR = new Parcelable.Creator<CarouselSparkInfo>() { // from class: X.0vx0
        @Override // android.os.Parcelable.Creator
        public final CarouselSparkInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            SparkPageControlColor sparkPageControlColorCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                sparkPageControlColorCreateFromParcel = SparkPageControlColor.CREATOR.createFromParcel(parcel);
            }
            return new CarouselSparkInfo(numValueOf, string, string2, sparkPageControlColorCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CarouselSparkInfo[] newArray(int i) {
            return new CarouselSparkInfo[i];
        }
    };
    public static final int $stable = 8;

    public CarouselSparkInfo() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselSparkInfo)) {
            return false;
        }
        CarouselSparkInfo carouselSparkInfo = (CarouselSparkInfo) obj;
        return Intrinsics.LJFF(this.dynamicCellType, carouselSparkInfo.dynamicCellType) && Intrinsics.LJFF(this.schema, carouselSparkInfo.schema) && Intrinsics.LJFF(this.data, carouselSparkInfo.data) && Intrinsics.LJFF(this.pageControlColor, carouselSparkInfo.pageControlColor);
    }

    public final int hashCode() {
        Integer num = this.dynamicCellType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.schema;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.data;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SparkPageControlColor sparkPageControlColor = this.pageControlColor;
        return iHashCode3 + (sparkPageControlColor != null ? sparkPageControlColor.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselSparkInfo(dynamicCellType=");
        sbLIZ.append(this.dynamicCellType);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", pageControlColor=");
        sbLIZ.append(this.pageControlColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.dynamicCellType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.schema);
        parcel.writeString(this.data);
        SparkPageControlColor sparkPageControlColor = this.pageControlColor;
        if (sparkPageControlColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sparkPageControlColor.writeToParcel(parcel, i);
        }
    }

    public CarouselSparkInfo(Integer num, String str, String str2, SparkPageControlColor sparkPageControlColor) {
        this.dynamicCellType = num;
        this.schema = str;
        this.data = str2;
        this.pageControlColor = sparkPageControlColor;
    }
}
