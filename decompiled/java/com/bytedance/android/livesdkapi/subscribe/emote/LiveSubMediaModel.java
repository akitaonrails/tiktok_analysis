package com.bytedance.android.livesdkapi.subscribe.emote;

import X.C1017903yT;
import X.C20188313yz;
import X.C207221166x;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveSubMediaModel implements Serializable, Parcelable {
    public static final C20188313yz CREATOR = new Parcelable.Creator<LiveSubMediaModel>() { // from class: X.13yz
        @Override // android.os.Parcelable.Creator
        public final LiveSubMediaModel createFromParcel(Parcel parcel) {
            return new LiveSubMediaModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LiveSubMediaModel[] newArray(int i) {
            return new LiveSubMediaModel[i];
        }
    };
    public C207221166x emoteEditFinishParams;
    public String fileLocalUriPath;
    public String fileName;
    public int height;
    public final String uuidStr;
    public int width;
    public int withTextSticker;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LiveSubMediaModel() {
        String strLIZ = C1017903yT.LIZ();
        strLIZ.toString();
        this.uuidStr = strLIZ;
    }

    public final C207221166x getEmoteEditFinishParams() {
        return this.emoteEditFinishParams;
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

    public final String getUuidStr() {
        return this.uuidStr;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getWithTextSticker() {
        return this.withTextSticker;
    }

    public LiveSubMediaModel(Parcel parcel) {
        this();
        this.fileLocalUriPath = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.fileName = parcel.readString();
        this.withTextSticker = parcel.readInt();
    }

    public final void setEmoteEditFinishParams(C207221166x c207221166x) {
        this.emoteEditFinishParams = c207221166x;
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

    public final void setWithTextSticker(int i) {
        this.withTextSticker = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fileLocalUriPath);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.fileName);
        parcel.writeInt(this.withTextSticker);
    }
}
