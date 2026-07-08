package com.ss.android.ugc.aweme.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.data.IconListPageConfig;

/* JADX INFO: loaded from: classes27.dex */
public final class IconListPageConfig implements Parcelable {
    public static final Parcelable.Creator<IconListPageConfig> CREATOR = new Parcelable.Creator<IconListPageConfig>() { // from class: X.0vL3
        @Override // android.os.Parcelable.Creator
        public final IconListPageConfig createFromParcel(Parcel parcel) {
            return new IconListPageConfig(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final IconListPageConfig[] newArray(int i) {
            return new IconListPageConfig[i];
        }
    };
    public final int spanCount;
    public final int uiMode;

    /* JADX WARN: Illegal instructions before constructor call */
    public IconListPageConfig() {
        int i = 0;
        this(i, 3, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconListPageConfig)) {
            return false;
        }
        IconListPageConfig iconListPageConfig = (IconListPageConfig) obj;
        return this.uiMode == iconListPageConfig.uiMode && this.spanCount == iconListPageConfig.spanCount;
    }

    public final int hashCode() {
        return (this.uiMode * 31) + this.spanCount;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IconListPageConfig(uiMode=");
        sbLIZ.append(this.uiMode);
        sbLIZ.append(", spanCount=");
        sbLIZ.append(this.spanCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.uiMode);
        parcel.writeInt(this.spanCount);
    }

    public IconListPageConfig(int i, int i2) {
        this.uiMode = i;
        this.spanCount = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ IconListPageConfig(int i, int i2, int i3) {
        int i4;
        i = (i2 & 1) != 0 ? 16 : i;
        if ((i2 & 2) != 0) {
            i4 = 3;
        } else {
            i4 = 0;
        }
        this(i, i4);
    }
}
