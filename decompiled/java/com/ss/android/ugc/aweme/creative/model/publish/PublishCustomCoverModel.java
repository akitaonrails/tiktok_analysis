package com.ss.android.ugc.aweme.creative.model.publish;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.PublishCustomCoverModel;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishCustomCoverModel implements Parcelable {
    public static final Parcelable.Creator<PublishCustomCoverModel> CREATOR = new Parcelable.Creator<PublishCustomCoverModel>() { // from class: X.0mcF
        @Override // android.os.Parcelable.Creator
        public final PublishCustomCoverModel createFromParcel(Parcel parcel) {
            return new PublishCustomCoverModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PublishCustomCoverModel[] newArray(int i) {
            return new PublishCustomCoverModel[i];
        }
    };

    @C09CT("enter_method")
    public String enterMethod;

    @C09CT("is_cover_add_text")
    public int isCoverAddText;

    @C09CT("is_cover_change_frame")
    public int isCoverChangeFrame;

    @C09CT("is_cover_crop")
    public int isCoverCrop;

    @C09CT("is_cover_edit")
    public int isCoverEdit;

    @C09CT("is_cover_upload")
    public int isCoverUpload;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isCoverEdit);
        parcel.writeInt(this.isCoverUpload);
        parcel.writeInt(this.isCoverCrop);
        parcel.writeInt(this.isCoverAddText);
        parcel.writeInt(this.isCoverChangeFrame);
        parcel.writeString(this.enterMethod);
    }

    public PublishCustomCoverModel() {
        this(0, 0, 0, 0, 0, "select_type");
    }

    public PublishCustomCoverModel(int i, int i2, int i3, int i4, int i5, String str) {
        this.isCoverEdit = i;
        this.isCoverUpload = i2;
        this.isCoverCrop = i3;
        this.isCoverAddText = i4;
        this.isCoverChangeFrame = i5;
        this.enterMethod = str;
    }
}
