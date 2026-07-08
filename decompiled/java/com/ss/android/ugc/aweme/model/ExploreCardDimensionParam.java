package com.ss.android.ugc.aweme.model;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.model.ExploreCardDimensionParam;

/* JADX INFO: loaded from: classes12.dex */
public final class ExploreCardDimensionParam implements Parcelable {
    public static final Parcelable.Creator<ExploreCardDimensionParam> CREATOR = new Parcelable.Creator<ExploreCardDimensionParam>() { // from class: X.0SWl
        @Override // android.os.Parcelable.Creator
        public final ExploreCardDimensionParam createFromParcel(Parcel parcel) {
            boolean z;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new ExploreCardDimensionParam(i, i2, i3, i4, i5, z);
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreCardDimensionParam[] newArray(int i) {
            return new ExploreCardDimensionParam[i];
        }
    };
    public final int animDuration;
    public final boolean darkBackground;
    public final int height;
    public final int left;
    public final int top;
    public final int width;

    /* JADX WARN: Illegal instructions before constructor call */
    public ExploreCardDimensionParam() {
        int i = 0;
        this(i, i, i, i, 63);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreCardDimensionParam)) {
            return false;
        }
        ExploreCardDimensionParam exploreCardDimensionParam = (ExploreCardDimensionParam) obj;
        return this.animDuration == exploreCardDimensionParam.animDuration && this.top == exploreCardDimensionParam.top && this.left == exploreCardDimensionParam.left && this.width == exploreCardDimensionParam.width && this.height == exploreCardDimensionParam.height && this.darkBackground == exploreCardDimensionParam.darkBackground;
    }

    public final int hashCode() {
        return (((((((((this.animDuration * 31) + this.top) * 31) + this.left) * 31) + this.width) * 31) + this.height) * 31) + C786410Ut5.Z2(this.darkBackground);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreCardDimensionParam(animDuration=");
        sbLIZ.append(this.animDuration);
        sbLIZ.append(", top=");
        sbLIZ.append(this.top);
        sbLIZ.append(", left=");
        sbLIZ.append(this.left);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", darkBackground=");
        sbLIZ.append(this.darkBackground);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.animDuration);
        parcel.writeInt(this.top);
        parcel.writeInt(this.left);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.darkBackground ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ExploreCardDimensionParam(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i4;
        int i8 = i3;
        int i9 = i2;
        int i10 = i;
        if ((i5 & 1) != 0) {
            i6 = 350;
        } else {
            i6 = 0;
        }
        this(i6, (i5 & 2) != 0 ? 0 : i10, (i5 & 4) != 0 ? 0 : i9, (i5 & 8) != 0 ? 0 : i8, (i5 & 16) != 0 ? 0 : i7, false);
    }

    public ExploreCardDimensionParam(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.animDuration = i;
        this.top = i2;
        this.left = i3;
        this.width = i4;
        this.height = i5;
        this.darkBackground = z;
    }
}
