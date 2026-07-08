package com.ss.android.ugc.aweme.mediachoose.helper;

import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LivePhotoInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<LivePhotoInfo> CREATOR = new Parcelable.Creator<LivePhotoInfo>() { // from class: X.0Kj8
        @Override // android.os.Parcelable.Creator
        public final LivePhotoInfo createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            long j = parcel.readLong();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new LivePhotoInfo(string, j, string2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final LivePhotoInfo[] newArray(int i) {
            return new LivePhotoInfo[i];
        }
    };

    @C09CT("has_user_clicked_icon")
    public boolean hasUserClickedIcon;

    @C09CT("live_photo_preview_mode_str")
    public String livePhotoPreviewModeStr;

    @C09CT("video_duration")
    public long videoDuration;

    @C09CT("video_path")
    @C0MY0
    public String videoPath;

    public final LivePhotoInfo copy(String str, long j, String str2, boolean z) {
        return new LivePhotoInfo(str, j, str2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivePhotoInfo)) {
            return false;
        }
        LivePhotoInfo livePhotoInfo = (LivePhotoInfo) obj;
        return Intrinsics.LJFF(this.videoPath, livePhotoInfo.videoPath) && this.videoDuration == livePhotoInfo.videoDuration && Intrinsics.LJFF(this.livePhotoPreviewModeStr, livePhotoInfo.livePhotoPreviewModeStr) && this.hasUserClickedIcon == livePhotoInfo.hasUserClickedIcon;
    }

    public int hashCode() {
        return (((((this.videoPath.hashCode() * 31) + C786410Ut5.Y2(this.videoDuration)) * 31) + this.livePhotoPreviewModeStr.hashCode()) * 31) + C786410Ut5.Z2(this.hasUserClickedIcon);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LivePhotoInfo(videoPath=");
        sbLIZ.append(this.videoPath);
        sbLIZ.append(", videoDuration=");
        sbLIZ.append(this.videoDuration);
        sbLIZ.append(", livePhotoPreviewModeStr=");
        sbLIZ.append(this.livePhotoPreviewModeStr);
        sbLIZ.append(", hasUserClickedIcon=");
        sbLIZ.append(this.hasUserClickedIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoPath);
        parcel.writeLong(this.videoDuration);
        parcel.writeString(this.livePhotoPreviewModeStr);
        parcel.writeInt(this.hasUserClickedIcon ? 1 : 0);
    }

    public LivePhotoInfo() {
        this("", 0L, "LIVE_PHOTO", false);
    }

    public final boolean getHasUserClickedIcon() {
        return this.hasUserClickedIcon;
    }

    public final String getLivePhotoPreviewMode() {
        return this.livePhotoPreviewModeStr;
    }

    public final String getLivePhotoPreviewModeStr() {
        return this.livePhotoPreviewModeStr;
    }

    public final long getVideoDuration() {
        return this.videoDuration;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final void setHasUserClickedIcon(boolean z) {
        this.hasUserClickedIcon = z;
    }

    public final void setLivePhotoPreviewMode(String str) {
        this.livePhotoPreviewModeStr = str;
    }

    public final void setLivePhotoPreviewModeStr(String str) {
        this.livePhotoPreviewModeStr = str;
    }

    public final void setVideoDuration(long j) {
        this.videoDuration = j;
    }

    public final void setVideoPath(String str) {
        this.videoPath = str;
    }

    public LivePhotoInfo(String str, long j, String str2, boolean z) {
        this.videoPath = str;
        this.videoDuration = j;
        this.livePhotoPreviewModeStr = str2;
        this.hasUserClickedIcon = z;
    }
}
