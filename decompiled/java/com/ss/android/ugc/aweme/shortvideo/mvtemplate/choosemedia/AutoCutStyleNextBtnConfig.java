package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AutoCutStyleNextBtnConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class AutoCutStyleNextBtnConfig implements Parcelable {
    public final int height;
    public final float textSize;
    public static final Parcelable.Creator<AutoCutStyleNextBtnConfig> CREATOR = new Parcelable.Creator<AutoCutStyleNextBtnConfig>() { // from class: X.0JEV
        @Override // android.os.Parcelable.Creator
        public final AutoCutStyleNextBtnConfig createFromParcel(Parcel parcel) {
            return new AutoCutStyleNextBtnConfig(parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoCutStyleNextBtnConfig[] newArray(int i) {
            return new AutoCutStyleNextBtnConfig[i];
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
        if (!(obj instanceof AutoCutStyleNextBtnConfig)) {
            return false;
        }
        AutoCutStyleNextBtnConfig autoCutStyleNextBtnConfig = (AutoCutStyleNextBtnConfig) obj;
        return Float.compare(this.textSize, autoCutStyleNextBtnConfig.textSize) == 0 && this.height == autoCutStyleNextBtnConfig.height;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutStyleNextBtnConfig(textSize=");
        sbLIZ.append(this.textSize);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.textSize);
        parcel.writeInt(this.height);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.textSize) * 31) + this.height;
    }

    public AutoCutStyleNextBtnConfig(float f, int i) {
        this.textSize = f;
        this.height = i;
    }
}
