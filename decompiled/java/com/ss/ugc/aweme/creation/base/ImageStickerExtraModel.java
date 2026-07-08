package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.ImageStickerExtraModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class ImageStickerExtraModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageStickerExtraModel> CREATOR = new Parcelable.Creator<ImageStickerExtraModel>() { // from class: X.0Mhi
        @Override // android.os.Parcelable.Creator
        public final ImageStickerExtraModel createFromParcel(Parcel parcel) {
            return new ImageStickerExtraModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageStickerExtraModel[] newArray(int i) {
            return new ImageStickerExtraModel[i];
        }
    };

    @C09CT("download_url")
    public String downloadUrl;

    @C09CT("path")
    public String path;

    public ImageStickerExtraModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.downloadUrl);
        parcel.writeString(this.path);
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getPath() {
        return this.path;
    }

    public final void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public ImageStickerExtraModel(String str, String str2) {
        this.downloadUrl = str;
        this.path = str2;
    }
}
