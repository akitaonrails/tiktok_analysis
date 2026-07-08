package com.ss.android.ugc.aweme.sticker.model;

import X.C09CT;
import X.C0MY0;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class BackgroundVideo implements Serializable, Parcelable {
    public static final Parcelable.Creator<BackgroundVideo> CREATOR = new Parcelable.Creator<BackgroundVideo>() { // from class: X.0Moh
        @Override // android.os.Parcelable.Creator
        public final BackgroundVideo createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new BackgroundVideo(string, string2, j, z, z2, parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BackgroundVideo[] newArray(int i) {
            return new BackgroundVideo[i];
        }
    };

    @InterfaceC2270908v5
    @C09CT("audioPath")
    @C0MY0
    public final String audioPath;

    @C09CT("endTime")
    public long endTime;

    @C09CT("isDefaultBgVideo")
    public final boolean isDefaultBgVideo;

    @C09CT("isMultiBgVideo")
    public final boolean isMultiBgVideo;

    @C09CT("maxDuration")
    public final long maxDuration;

    @C09CT("uid")
    public final String uid;

    @InterfaceC2270908v5
    @C09CT("videoPath")
    @C0MY0
    public final String videoPath;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoPath);
        parcel.writeString(this.audioPath);
        parcel.writeLong(this.maxDuration);
        parcel.writeInt(this.isMultiBgVideo ? 1 : 0);
        parcel.writeInt(this.isDefaultBgVideo ? 1 : 0);
        parcel.writeLong(this.endTime);
        parcel.writeString(this.uid);
    }

    public int hashCode() {
        return this.videoPath.hashCode();
    }

    public final String getAudioPath() {
        return this.audioPath;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getMaxDuration() {
        return this.maxDuration;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final boolean isDefaultBgVideo() {
        return this.isDefaultBgVideo;
    }

    public final boolean isMultiBgVideo() {
        return this.isMultiBgVideo;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BackgroundVideo)) {
            return false;
        }
        BackgroundVideo backgroundVideo = (BackgroundVideo) obj;
        if (!Intrinsics.LJFF(this.videoPath, backgroundVideo.videoPath) || !Intrinsics.LJFF(this.audioPath, backgroundVideo.audioPath)) {
            return false;
        }
        return true;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public BackgroundVideo(String str, String str2, long j, boolean z, boolean z2, long j2, String str3) {
        this.videoPath = str;
        this.audioPath = str2;
        this.maxDuration = j;
        this.isMultiBgVideo = z;
        this.isDefaultBgVideo = z2;
        this.endTime = j2;
        this.uid = str3;
    }
}
