package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.SingleAdjustInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleAdjustInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<SingleAdjustInfo> CREATOR = new Parcelable.Creator<SingleAdjustInfo>() { // from class: X.0mdj
        @Override // android.os.Parcelable.Creator
        public final SingleAdjustInfo createFromParcel(Parcel parcel) {
            return new SingleAdjustInfo(parcel.readFloat(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SingleAdjustInfo[] newArray(int i) {
            return new SingleAdjustInfo[i];
        }
    };

    @C09CT("intensity")
    public float intensity;

    @C09CT("unzipPath")
    public String unzipPath;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.intensity);
        parcel.writeString(this.unzipPath);
    }

    public final float getIntensity() {
        return this.intensity;
    }

    public final String getUnzipPath() {
        return this.unzipPath;
    }

    public final void setIntensity(float f) {
        this.intensity = f;
    }

    public final void setUnzipPath(String str) {
        this.unzipPath = str;
    }

    public SingleAdjustInfo(float f, String str) {
        this.intensity = f;
        this.unzipPath = str;
    }
}
