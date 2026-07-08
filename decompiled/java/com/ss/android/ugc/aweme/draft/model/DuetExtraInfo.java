package com.ss.android.ugc.aweme.draft.model;

import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class DuetExtraInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<DuetExtraInfo> CREATOR = new Parcelable.Creator<DuetExtraInfo>() { // from class: X.0Mb3
        @Override // android.os.Parcelable.Creator
        public final DuetExtraInfo createFromParcel(Parcel parcel) {
            return new DuetExtraInfo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DuetExtraInfo[] newArray(int i) {
            return new DuetExtraInfo[i];
        }
    };

    @C09CT("duet_audio_path")
    @C0MY0
    public final String duetAudioPath;

    @C09CT("duet_layout_direction")
    public final int duetLayoutDirection;

    @C09CT("duet_layout_mode")
    public final String duetLayoutMode;

    @C09CT("duet_video_height")
    public final int duetVideoHeight;

    @C09CT("duet_video_path")
    @C0MY0
    public final String duetVideoPath;

    @C09CT("duet_video_width")
    public final int duetVideoWidth;

    public final DuetExtraInfo copy(String str, String str2, int i, int i2, String str3, int i3) {
        return new DuetExtraInfo(str, str2, i, i2, str3, i3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetExtraInfo)) {
            return false;
        }
        DuetExtraInfo duetExtraInfo = (DuetExtraInfo) obj;
        return Intrinsics.LJFF(this.duetVideoPath, duetExtraInfo.duetVideoPath) && Intrinsics.LJFF(this.duetAudioPath, duetExtraInfo.duetAudioPath) && this.duetVideoWidth == duetExtraInfo.duetVideoWidth && this.duetVideoHeight == duetExtraInfo.duetVideoHeight && Intrinsics.LJFF(this.duetLayoutMode, duetExtraInfo.duetLayoutMode) && this.duetLayoutDirection == duetExtraInfo.duetLayoutDirection;
    }

    public int hashCode() {
        return (((((((((this.duetVideoPath.hashCode() * 31) + this.duetAudioPath.hashCode()) * 31) + this.duetVideoWidth) * 31) + this.duetVideoHeight) * 31) + this.duetLayoutMode.hashCode()) * 31) + this.duetLayoutDirection;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DuetExtraInfo(duetVideoPath=");
        sbLIZ.append(this.duetVideoPath);
        sbLIZ.append(", duetAudioPath=");
        sbLIZ.append(this.duetAudioPath);
        sbLIZ.append(", duetVideoWidth=");
        sbLIZ.append(this.duetVideoWidth);
        sbLIZ.append(", duetVideoHeight=");
        sbLIZ.append(this.duetVideoHeight);
        sbLIZ.append(", duetLayoutMode=");
        sbLIZ.append(this.duetLayoutMode);
        sbLIZ.append(", duetLayoutDirection=");
        sbLIZ.append(this.duetLayoutDirection);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.duetVideoPath);
        parcel.writeString(this.duetAudioPath);
        parcel.writeInt(this.duetVideoWidth);
        parcel.writeInt(this.duetVideoHeight);
        parcel.writeString(this.duetLayoutMode);
        parcel.writeInt(this.duetLayoutDirection);
    }

    public DuetExtraInfo() {
        this("", "", 0, 0, "", 0);
    }

    public final String getDuetAudioPath() {
        return this.duetAudioPath;
    }

    public final int getDuetLayoutDirection() {
        return this.duetLayoutDirection;
    }

    public final String getDuetLayoutMode() {
        return this.duetLayoutMode;
    }

    public final int getDuetVideoHeight() {
        return this.duetVideoHeight;
    }

    public final String getDuetVideoPath() {
        return this.duetVideoPath;
    }

    public final int getDuetVideoWidth() {
        return this.duetVideoWidth;
    }

    public DuetExtraInfo(String str, String str2, int i, int i2, String str3, int i3) {
        this.duetVideoPath = str;
        this.duetAudioPath = str2;
        this.duetVideoWidth = i;
        this.duetVideoHeight = i2;
        this.duetLayoutMode = str3;
        this.duetLayoutDirection = i3;
    }
}
