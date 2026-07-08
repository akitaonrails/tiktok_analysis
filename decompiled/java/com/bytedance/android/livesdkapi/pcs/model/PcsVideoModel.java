package com.bytedance.android.livesdkapi.pcs.model;

import X.C530770Krj;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.pcs.model.PcsVideoModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class PcsVideoModel implements Serializable, Parcelable {
    public static final C530770Krj CREATOR = new Parcelable.Creator<PcsVideoModel>() { // from class: X.0Krj
        @Override // android.os.Parcelable.Creator
        public final PcsVideoModel createFromParcel(Parcel parcel) {
            return new PcsVideoModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PcsVideoModel[] newArray(int i) {
            return new PcsVideoModel[i];
        }
    };
    public long duration;
    public String fileLocalUriPath;
    public String fileName;
    public int height;
    public int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PcsVideoModel() {
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getFileLocalUriPath() {
        return this.fileLocalUriPath;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public PcsVideoModel(Parcel parcel) {
        this();
        this.fileLocalUriPath = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.fileName = parcel.readString();
        this.duration = parcel.readLong();
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setFileLocalUriPath(String str) {
        this.fileLocalUriPath = str;
    }

    public final void setFileName(String str) {
        this.fileName = str;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fileLocalUriPath);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.fileName);
        parcel.writeLong(this.duration);
    }
}
