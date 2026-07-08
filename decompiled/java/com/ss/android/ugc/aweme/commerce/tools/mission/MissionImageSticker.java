package com.ss.android.ugc.aweme.commerce.tools.mission;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.mission.MissionImageSticker;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class MissionImageSticker implements Serializable, Parcelable {
    public static final Parcelable.Creator<MissionImageSticker> CREATOR = new Parcelable.Creator<MissionImageSticker>() { // from class: X.11Be
        @Override // android.os.Parcelable.Creator
        public final MissionImageSticker createFromParcel(Parcel parcel) {
            return new MissionImageSticker(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MissionImageSticker[] newArray(int i) {
            return new MissionImageSticker[i];
        }
    };

    @C09CT("image_height")
    public final int imageHeight;

    @C09CT("image_width")
    public final int imageWidth;

    @C09CT("logo_image_url")
    public final String logoImageUrl;

    public final MissionImageSticker copy(String str, int i, int i2) {
        return new MissionImageSticker(str, i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionImageSticker)) {
            return false;
        }
        MissionImageSticker missionImageSticker = (MissionImageSticker) obj;
        return Intrinsics.LJFF(this.logoImageUrl, missionImageSticker.logoImageUrl) && this.imageWidth == missionImageSticker.imageWidth && this.imageHeight == missionImageSticker.imageHeight;
    }

    public int hashCode() {
        return (((this.logoImageUrl.hashCode() * 31) + this.imageWidth) * 31) + this.imageHeight;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MissionImageSticker(logoImageUrl=");
        sbLIZ.append(this.logoImageUrl);
        sbLIZ.append(", imageWidth=");
        sbLIZ.append(this.imageWidth);
        sbLIZ.append(", imageHeight=");
        sbLIZ.append(this.imageHeight);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.logoImageUrl);
        parcel.writeInt(this.imageWidth);
        parcel.writeInt(this.imageHeight);
    }

    public MissionImageSticker() {
        this("", 0, 0);
    }

    public final int getImageHeight() {
        return this.imageHeight;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    public final String getLogoImageUrl() {
        return this.logoImageUrl;
    }

    public MissionImageSticker(String str, int i, int i2) {
        this.logoImageUrl = str;
        this.imageWidth = i;
        this.imageHeight = i2;
    }
}
