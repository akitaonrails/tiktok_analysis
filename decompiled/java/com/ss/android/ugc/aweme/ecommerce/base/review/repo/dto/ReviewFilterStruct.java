package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C04IX;
import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ReviewFilterStruct implements Parcelable {

    @C09CT("count")
    public final Integer count;

    @C09CT("count_str")
    public final String countStr;

    @C09CT("filter_id")
    public final String filterId;

    @C09CT("name")
    public final String name;

    @C09CT("name_en")
    public final String nameEng;

    @C09CT("name_mapping")
    public final String nameMapping;

    @C09CT("sentiment")
    public final Integer sentimentType;

    @C09CT("type")
    public final Integer type;
    public static final C04IX Companion = new Object() { // from class: X.04IX
    };
    public static final Parcelable.Creator<ReviewFilterStruct> CREATOR = new Parcelable.Creator<ReviewFilterStruct>() { // from class: X.04IP
        @Override // android.os.Parcelable.Creator
        public final ReviewFilterStruct createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf3 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new ReviewFilterStruct(string, string2, string3, numValueOf, string4, numValueOf2, string5, numValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewFilterStruct[] newArray(int i) {
            return new ReviewFilterStruct[i];
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
        if (!(obj instanceof ReviewFilterStruct)) {
            return false;
        }
        ReviewFilterStruct reviewFilterStruct = (ReviewFilterStruct) obj;
        return Intrinsics.LJFF(this.filterId, reviewFilterStruct.filterId) && Intrinsics.LJFF(this.name, reviewFilterStruct.name) && Intrinsics.LJFF(this.countStr, reviewFilterStruct.countStr) && Intrinsics.LJFF(this.type, reviewFilterStruct.type) && Intrinsics.LJFF(this.nameEng, reviewFilterStruct.nameEng) && Intrinsics.LJFF(this.count, reviewFilterStruct.count) && Intrinsics.LJFF(this.nameMapping, reviewFilterStruct.nameMapping) && Intrinsics.LJFF(this.sentimentType, reviewFilterStruct.sentimentType);
    }

    public final int hashCode() {
        String str = this.filterId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countStr;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.type;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.nameEng;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.count;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.nameMapping;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.sentimentType;
        return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewFilterStruct(filterId=");
        sbLIZ.append(this.filterId);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", countStr=");
        sbLIZ.append(this.countStr);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", nameEng=");
        sbLIZ.append(this.nameEng);
        sbLIZ.append(", count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", nameMapping=");
        sbLIZ.append(this.nameMapping);
        sbLIZ.append(", sentimentType=");
        sbLIZ.append(this.sentimentType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.filterId);
        parcel.writeString(this.name);
        parcel.writeString(this.countStr);
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.nameEng);
        Integer num2 = this.count;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.nameMapping);
        Integer num3 = this.sentimentType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public ReviewFilterStruct(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3) {
        this.filterId = str;
        this.name = str2;
        this.countStr = str3;
        this.type = num;
        this.nameEng = str4;
        this.count = num2;
        this.nameMapping = str5;
        this.sentimentType = num3;
    }
}
