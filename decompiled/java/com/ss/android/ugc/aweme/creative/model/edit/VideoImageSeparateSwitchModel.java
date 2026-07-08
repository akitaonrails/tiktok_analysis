package com.ss.android.ugc.aweme.creative.model.edit;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.VideoImageSeparateSwitchModel;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoImageSeparateSwitchModel implements Parcelable {
    public static final Parcelable.Creator<VideoImageSeparateSwitchModel> CREATOR = new Parcelable.Creator<VideoImageSeparateSwitchModel>() { // from class: X.0MmI
        @Override // android.os.Parcelable.Creator
        public final VideoImageSeparateSwitchModel createFromParcel(Parcel parcel) {
            boolean z;
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new VideoImageSeparateSwitchModel(j, j2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoImageSeparateSwitchModel[] newArray(int i) {
            return new VideoImageSeparateSwitchModel[i];
        }
    };

    @C040H
    public final long clickSwitchUITimeStamp;

    @C040H
    public final boolean hasUserCanceledMusic;

    @C040H
    public final long processDoneTimestamp;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.clickSwitchUITimeStamp);
        parcel.writeLong(this.processDoneTimestamp);
        parcel.writeInt(this.hasUserCanceledMusic ? 1 : 0);
    }

    public VideoImageSeparateSwitchModel() {
        this(-1L, -1L, false);
    }

    public VideoImageSeparateSwitchModel(long j, long j2, boolean z) {
        this.clickSwitchUITimeStamp = j;
        this.processDoneTimestamp = j2;
        this.hasUserCanceledMusic = z;
    }
}
