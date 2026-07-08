package com.ss.android.ugc.aweme.creative.model.edit;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.CameraPhotoInfo;
import com.ss.android.ugc.aweme.sticker.model.NewGreenScreenEffectModel;
import dmt.av.video.SingleImageCoverBitmapData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CameraPhotoInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<CameraPhotoInfo> CREATOR = new Parcelable.Creator<CameraPhotoInfo>() { // from class: X.0MHr
        @Override // android.os.Parcelable.Creator
        public final CameraPhotoInfo createFromParcel(Parcel parcel) {
            SingleImageCoverBitmapData singleImageCoverBitmapDataCreateFromParcel;
            boolean z;
            long j = parcel.readLong();
            NewGreenScreenEffectModel newGreenScreenEffectModel = (NewGreenScreenEffectModel) parcel.readParcelable(CameraPhotoInfo.class.getClassLoader());
            if (parcel.readInt() == 0) {
                singleImageCoverBitmapDataCreateFromParcel = null;
            } else {
                singleImageCoverBitmapDataCreateFromParcel = SingleImageCoverBitmapData.CREATOR.createFromParcel(parcel);
            }
            SingleImageCoverBitmapData singleImageCoverBitmapData = singleImageCoverBitmapDataCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new CameraPhotoInfo(j, newGreenScreenEffectModel, singleImageCoverBitmapData, z);
        }

        @Override // android.os.Parcelable.Creator
        public final CameraPhotoInfo[] newArray(int i) {
            return new CameraPhotoInfo[i];
        }
    };

    @C09CT("new_green_screen_effect_model")
    public NewGreenScreenEffectModel newGreenScreenEffectModel;

    @C040H
    public boolean receivedFirstFrame;

    @C040H
    public final SingleImageCoverBitmapData singleImageCoverBitmapData;

    @C09CT("take_photo_start_time")
    public final long takePhotoStartTime;

    public CameraPhotoInfo() {
        this(0L, null, null, false);
    }

    public final CameraPhotoInfo copy(long j, NewGreenScreenEffectModel newGreenScreenEffectModel, SingleImageCoverBitmapData singleImageCoverBitmapData, boolean z) {
        return new CameraPhotoInfo(j, newGreenScreenEffectModel, singleImageCoverBitmapData, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPhotoInfo)) {
            return false;
        }
        CameraPhotoInfo cameraPhotoInfo = (CameraPhotoInfo) obj;
        return this.takePhotoStartTime == cameraPhotoInfo.takePhotoStartTime && Intrinsics.LJFF(this.newGreenScreenEffectModel, cameraPhotoInfo.newGreenScreenEffectModel) && Intrinsics.LJFF(this.singleImageCoverBitmapData, cameraPhotoInfo.singleImageCoverBitmapData) && this.receivedFirstFrame == cameraPhotoInfo.receivedFirstFrame;
    }

    public int hashCode() {
        int iY2 = C786410Ut5.Y2(this.takePhotoStartTime) * 31;
        NewGreenScreenEffectModel newGreenScreenEffectModel = this.newGreenScreenEffectModel;
        int iHashCode = (iY2 + (newGreenScreenEffectModel == null ? 0 : newGreenScreenEffectModel.hashCode())) * 31;
        SingleImageCoverBitmapData singleImageCoverBitmapData = this.singleImageCoverBitmapData;
        return ((iHashCode + (singleImageCoverBitmapData != null ? singleImageCoverBitmapData.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.receivedFirstFrame);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraPhotoInfo(takePhotoStartTime=");
        sbLIZ.append(this.takePhotoStartTime);
        sbLIZ.append(", newGreenScreenEffectModel=");
        sbLIZ.append(this.newGreenScreenEffectModel);
        sbLIZ.append(", singleImageCoverBitmapData=");
        sbLIZ.append(this.singleImageCoverBitmapData);
        sbLIZ.append(", receivedFirstFrame=");
        sbLIZ.append(this.receivedFirstFrame);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.takePhotoStartTime);
        parcel.writeParcelable(this.newGreenScreenEffectModel, i);
        SingleImageCoverBitmapData singleImageCoverBitmapData = this.singleImageCoverBitmapData;
        if (singleImageCoverBitmapData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            singleImageCoverBitmapData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.receivedFirstFrame ? 1 : 0);
    }

    public final NewGreenScreenEffectModel getNewGreenScreenEffectModel() {
        return this.newGreenScreenEffectModel;
    }

    public final boolean getReceivedFirstFrame() {
        return this.receivedFirstFrame;
    }

    public final SingleImageCoverBitmapData getSingleImageCoverBitmapData() {
        return this.singleImageCoverBitmapData;
    }

    public final long getTakePhotoStartTime() {
        return this.takePhotoStartTime;
    }

    public final void setNewGreenScreenEffectModel(NewGreenScreenEffectModel newGreenScreenEffectModel) {
        this.newGreenScreenEffectModel = newGreenScreenEffectModel;
    }

    public final void setReceivedFirstFrame(boolean z) {
        this.receivedFirstFrame = z;
    }

    public CameraPhotoInfo(long j, NewGreenScreenEffectModel newGreenScreenEffectModel, SingleImageCoverBitmapData singleImageCoverBitmapData, boolean z) {
        this.takePhotoStartTime = j;
        this.newGreenScreenEffectModel = newGreenScreenEffectModel;
        this.singleImageCoverBitmapData = singleImageCoverBitmapData;
        this.receivedFirstFrame = z;
    }
}
