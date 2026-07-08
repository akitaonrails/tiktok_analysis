package com.ss.android.ugc.aweme.shortvideo.upload;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.upload.StoryPublishNetworkInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class StoryPublishNetworkInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<StoryPublishNetworkInfo> CREATOR = new Parcelable.Creator<StoryPublishNetworkInfo>() { // from class: X.0mf7
        @Override // android.os.Parcelable.Creator
        public final StoryPublishNetworkInfo createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new StoryPublishNetworkInfo(z, j, j2, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final StoryPublishNetworkInfo[] newArray(int i) {
            return new StoryPublishNetworkInfo[i];
        }
    };
    public final boolean isWeakNetwork;
    public final long speedToGetEncodeSetting;
    public boolean successResetBitrate;
    public final long uploadProbeSpeed;

    public final StoryPublishNetworkInfo copy(boolean z, long j, long j2, boolean z2) {
        return new StoryPublishNetworkInfo(z, j, j2, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryPublishNetworkInfo)) {
            return false;
        }
        StoryPublishNetworkInfo storyPublishNetworkInfo = (StoryPublishNetworkInfo) obj;
        return this.isWeakNetwork == storyPublishNetworkInfo.isWeakNetwork && this.uploadProbeSpeed == storyPublishNetworkInfo.uploadProbeSpeed && this.speedToGetEncodeSetting == storyPublishNetworkInfo.speedToGetEncodeSetting && this.successResetBitrate == storyPublishNetworkInfo.successResetBitrate;
    }

    public int hashCode() {
        return (((((C786410Ut5.Z2(this.isWeakNetwork) * 31) + C786410Ut5.Y2(this.uploadProbeSpeed)) * 31) + C786410Ut5.Y2(this.speedToGetEncodeSetting)) * 31) + C786410Ut5.Z2(this.successResetBitrate);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryPublishNetworkInfo(isWeakNetwork=");
        sbLIZ.append(this.isWeakNetwork);
        sbLIZ.append(", uploadProbeSpeed=");
        sbLIZ.append(this.uploadProbeSpeed);
        sbLIZ.append(", speedToGetEncodeSetting=");
        sbLIZ.append(this.speedToGetEncodeSetting);
        sbLIZ.append(", successResetBitrate=");
        sbLIZ.append(this.successResetBitrate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isWeakNetwork ? 1 : 0);
        parcel.writeLong(this.uploadProbeSpeed);
        parcel.writeLong(this.speedToGetEncodeSetting);
        parcel.writeInt(this.successResetBitrate ? 1 : 0);
    }

    public final long getSpeedToGetEncodeSetting() {
        return this.speedToGetEncodeSetting;
    }

    public final boolean getSuccessResetBitrate() {
        return this.successResetBitrate;
    }

    public final long getUploadProbeSpeed() {
        return this.uploadProbeSpeed;
    }

    public final boolean isWeakNetwork() {
        return this.isWeakNetwork;
    }

    public final void setSuccessResetBitrate(boolean z) {
        this.successResetBitrate = z;
    }

    public StoryPublishNetworkInfo(boolean z, long j, long j2, boolean z2) {
        this.isWeakNetwork = z;
        this.uploadProbeSpeed = j;
        this.speedToGetEncodeSetting = j2;
        this.successResetBitrate = z2;
    }
}
