package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class SrcLiveVideoInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<SrcLiveVideoInfo> CREATOR = new Parcelable.Creator<SrcLiveVideoInfo>() { // from class: X.0MfO
        @Override // android.os.Parcelable.Creator
        public final SrcLiveVideoInfo createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string2 = parcel.readString();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            LivePhotoPreviewMode livePhotoPreviewModeCreateFromParcel = LivePhotoPreviewMode.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new SrcLiveVideoInfo(string, i, i2, string2, i3, i4, livePhotoPreviewModeCreateFromParcel, z);
        }

        @Override // android.os.Parcelable.Creator
        public final SrcLiveVideoInfo[] newArray(int i) {
            return new SrcLiveVideoInfo[i];
        }
    };

    @C09CT("alternate_text")
    public String altText;

    @C09CT("output_duration")
    public int duration;

    @C09CT("has_user_clicked_icon")
    public boolean hasUserClickedIcon;

    @C09CT("height")
    public int height;

    @C09CT("live_photo_preview_mode")
    public LivePhotoPreviewMode livePhotoPreviewMode;

    @InterfaceC2270908v5
    @C09CT("path")
    @C0MY0
    public final String path;

    @C09CT("src_duration")
    public int srcDuration;

    @C09CT("width")
    public int width;

    public SrcLiveVideoInfo() {
        this("", 0, 0, null, 0, 0, LivePhotoPreviewMode.LIVE_PHOTO, false);
    }

    public final SrcLiveVideoInfo copy(String str, int i, int i2, String str2, int i3, int i4, LivePhotoPreviewMode livePhotoPreviewMode, boolean z) {
        return new SrcLiveVideoInfo(str, i, i2, str2, i3, i4, livePhotoPreviewMode, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SrcLiveVideoInfo)) {
            return false;
        }
        SrcLiveVideoInfo srcLiveVideoInfo = (SrcLiveVideoInfo) obj;
        return Intrinsics.LJFF(this.path, srcLiveVideoInfo.path) && this.height == srcLiveVideoInfo.height && this.width == srcLiveVideoInfo.width && Intrinsics.LJFF(this.altText, srcLiveVideoInfo.altText) && this.duration == srcLiveVideoInfo.duration && this.srcDuration == srcLiveVideoInfo.srcDuration && this.livePhotoPreviewMode == srcLiveVideoInfo.livePhotoPreviewMode && this.hasUserClickedIcon == srcLiveVideoInfo.hasUserClickedIcon;
    }

    public int hashCode() {
        int iHashCode = ((((this.path.hashCode() * 31) + this.height) * 31) + this.width) * 31;
        String str = this.altText;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.duration) * 31) + this.srcDuration) * 31) + this.livePhotoPreviewMode.hashCode()) * 31) + C786410Ut5.Z2(this.hasUserClickedIcon);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SrcLiveVideoInfo(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", altText=");
        sbLIZ.append(this.altText);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", srcDuration=");
        sbLIZ.append(this.srcDuration);
        sbLIZ.append(", livePhotoPreviewMode=");
        sbLIZ.append(this.livePhotoPreviewMode);
        sbLIZ.append(", hasUserClickedIcon=");
        sbLIZ.append(this.hasUserClickedIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
        parcel.writeString(this.altText);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.srcDuration);
        this.livePhotoPreviewMode.writeToParcel(parcel, i);
        parcel.writeInt(this.hasUserClickedIcon ? 1 : 0);
    }

    public final String getAltText() {
        return this.altText;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final boolean getHasUserClickedIcon() {
        return this.hasUserClickedIcon;
    }

    public final int getHeight() {
        return this.height;
    }

    public final LivePhotoPreviewMode getLivePhotoPreviewMode() {
        return this.livePhotoPreviewMode;
    }

    public final String getPath() {
        return this.path;
    }

    public final int getSrcDuration() {
        return this.srcDuration;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setAltText(String str) {
        this.altText = str;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setHasUserClickedIcon(boolean z) {
        this.hasUserClickedIcon = z;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setLivePhotoPreviewMode(LivePhotoPreviewMode livePhotoPreviewMode) {
        this.livePhotoPreviewMode = livePhotoPreviewMode;
    }

    public final void setSrcDuration(int i) {
        this.srcDuration = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public SrcLiveVideoInfo(String str, int i, int i2, String str2, int i3, int i4, LivePhotoPreviewMode livePhotoPreviewMode, boolean z) {
        this.path = str;
        this.height = i;
        this.width = i2;
        this.altText = str2;
        this.duration = i3;
        this.srcDuration = i4;
        this.livePhotoPreviewMode = livePhotoPreviewMode;
        this.hasUserClickedIcon = z;
    }
}
