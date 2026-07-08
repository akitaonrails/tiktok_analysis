package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.VideoConfig;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class VideoConfig implements Parcelable {

    @C09CT("autoplay_delay")
    public final Float autoplayDelay;

    @C09CT("autoplay_enabled")
    public final Boolean autoplayEnabled;

    @C09CT("cover_image")
    public final Image coverImage;

    @C09CT("is_muted")
    public final Boolean isMuted;
    public static final Parcelable.Creator<VideoConfig> CREATOR = new Parcelable.Creator<VideoConfig>() { // from class: X.0I7d
        @Override // android.os.Parcelable.Creator
        public final VideoConfig createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            boolean z2 = true;
            Float fValueOf = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() != 0) {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            return new VideoConfig(boolValueOf, boolValueOf2, fValueOf, (Image) parcel.readParcelable(VideoConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoConfig[] newArray(int i) {
            return new VideoConfig[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoConfig)) {
            return false;
        }
        VideoConfig videoConfig = (VideoConfig) obj;
        return Intrinsics.LJFF(this.autoplayEnabled, videoConfig.autoplayEnabled) && Intrinsics.LJFF(this.isMuted, videoConfig.isMuted) && Intrinsics.LJFF(this.autoplayDelay, videoConfig.autoplayDelay) && Intrinsics.LJFF(this.coverImage, videoConfig.coverImage);
    }

    public final int hashCode() {
        Boolean bool = this.autoplayEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isMuted;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Float f = this.autoplayDelay;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Image image = this.coverImage;
        return iHashCode3 + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoConfig(autoplayEnabled=");
        sbLIZ.append(this.autoplayEnabled);
        sbLIZ.append(", isMuted=");
        sbLIZ.append(this.isMuted);
        sbLIZ.append(", autoplayDelay=");
        sbLIZ.append(this.autoplayDelay);
        sbLIZ.append(", coverImage=");
        sbLIZ.append(this.coverImage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.autoplayEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isMuted;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Float f = this.autoplayDelay;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeParcelable(this.coverImage, i);
    }

    public VideoConfig(Boolean bool, Boolean bool2, Float f, Image image) {
        this.autoplayEnabled = bool;
        this.isMuted = bool2;
        this.autoplayDelay = f;
        this.coverImage = image;
    }
}
