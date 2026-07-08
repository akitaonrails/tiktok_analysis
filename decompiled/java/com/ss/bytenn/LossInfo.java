package com.ss.bytenn;

import X.C1554390qYH;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes24.dex */
public class LossInfo implements Parcelable {
    public static final Parcelable.Creator<LossInfo> CREATOR = new C1554390qYH(5);
    public String[] bottomLayers;
    public String extraInfo;
    public String lossName;
    public String lossType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LossInfo() {
        this.lossType = "";
        this.lossName = "";
        this.extraInfo = "";
    }

    public String[] getBottomLayers() {
        return this.bottomLayers;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public String getLossName() {
        return this.lossName;
    }

    public String getLossType() {
        return this.lossType;
    }

    public LossInfo(Parcel parcel) {
        parcel.readStringArray(this.bottomLayers);
        this.lossType = parcel.readString();
        this.lossName = parcel.readString();
        this.extraInfo = parcel.readString();
    }

    public void setBottomLayers(String[] strArr) {
        if (strArr != null) {
            this.bottomLayers = strArr;
        } else {
            this.bottomLayers = new String[0];
        }
    }

    public void setExtraInfo(String str) {
        this.extraInfo = str;
    }

    public void setLossName(String str) {
        this.lossName = str;
    }

    public void setLossType(String str) {
        this.lossType = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.bottomLayers);
        parcel.writeString(this.lossType);
        parcel.writeString(this.lossName);
        parcel.writeString(this.extraInfo);
    }

    public void init(String[] strArr, String str, String str2, String str3) {
        if (strArr != null) {
            this.bottomLayers = strArr;
        } else {
            this.bottomLayers = new String[0];
        }
        this.lossType = str;
        this.lossName = str2;
        this.extraInfo = str3;
    }
}
