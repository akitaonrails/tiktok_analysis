package com.ss.android.vesdk.settings;

import X.C1466660oGm;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes23.dex */
public class VideoInvisibleWatermarkSettings implements Parcelable {
    public static final Parcelable.Creator<VideoInvisibleWatermarkSettings> CREATOR = new C1466660oGm(14);
    public int algoVersion;
    public String algorithmName;
    public boolean enableDelayInit;
    public long endWaterDuration;
    public int memLazyload;
    public String modelPath;
    public String modelPathSec;
    public int pFlag;
    public int watermarkInterval;
    public String watermarkStr;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VideoInvisibleWatermarkSettings() {
        this.algorithmName = "anti_cut_resize_0";
        this.watermarkInterval = 40;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoInvisibleWatermarkSettings watermarkStr:");
        sbLIZ.append(this.watermarkStr);
        sbLIZ.append(", algorithmName:");
        sbLIZ.append(this.algorithmName);
        sbLIZ.append(", watermarkInterval:");
        sbLIZ.append(this.watermarkInterval);
        sbLIZ.append(", modelPath:");
        sbLIZ.append(this.modelPath);
        sbLIZ.append(", modelPathSec:");
        sbLIZ.append(this.modelPathSec);
        sbLIZ.append(", algoVersion:");
        sbLIZ.append(this.algoVersion);
        sbLIZ.append(", endWaterDuration:");
        sbLIZ.append(this.endWaterDuration);
        sbLIZ.append(", enableDelayInit:");
        sbLIZ.append(this.enableDelayInit);
        sbLIZ.append(", pFlag:");
        sbLIZ.append(this.pFlag);
        sbLIZ.append(", memLazyload:");
        sbLIZ.append(this.memLazyload);
        sbLIZ.append(super.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoInvisibleWatermarkSettings(Parcel parcel) {
        boolean z;
        this.algorithmName = "anti_cut_resize_0";
        this.watermarkInterval = 40;
        this.watermarkStr = parcel.readString();
        this.algorithmName = parcel.readString();
        this.watermarkInterval = parcel.readInt();
        this.modelPath = parcel.readString();
        this.modelPathSec = parcel.readString();
        this.algoVersion = parcel.readInt();
        this.endWaterDuration = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.enableDelayInit = z;
        this.pFlag = parcel.readInt();
        this.memLazyload = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.watermarkStr);
        parcel.writeString(this.algorithmName);
        parcel.writeInt(this.watermarkInterval);
        parcel.writeString(this.modelPath);
        parcel.writeString(this.modelPathSec);
        parcel.writeInt(this.algoVersion);
        parcel.writeLong(this.endWaterDuration);
        parcel.writeByte(this.enableDelayInit ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.pFlag);
        parcel.writeInt(this.memLazyload);
    }
}
