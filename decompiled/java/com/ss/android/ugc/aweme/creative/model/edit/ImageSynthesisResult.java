package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageSynthesisResult implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageSynthesisResult> CREATOR = new Parcelable.Creator<ImageSynthesisResult>() { // from class: X.0mns
        @Override // android.os.Parcelable.Creator
        public final ImageSynthesisResult createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Float fValueOf;
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ImageSynthesisResult imageSynthesisResultCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() != 0) {
                imageSynthesisResultCreateFromParcel = ImageSynthesisResult.CREATOR.createFromParcel(parcel);
            }
            return new ImageSynthesisResult(string, i, i2, numValueOf, string2, fValueOf, imageSynthesisResultCreateFromParcel, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageSynthesisResult[] newArray(int i) {
            return new ImageSynthesisResult[i];
        }
    };

    @C09CT("compile_level")
    public Integer compileLevel;

    @C09CT("duration")
    public final Float duration;

    @C09CT("height")
    public final int height;

    @C09CT("key")
    public String key;

    @C09CT("subImage")
    public final ImageSynthesisResult liveVideo;

    @C09CT("path")
    public final String path;

    @C09CT("remote_uri")
    public String remoteUri;

    @C09CT("water_mark_path")
    public String watermarkPath;

    @C09CT("width")
    public final int width;

    public final ImageSynthesisResult copy(String str, int i, int i2, Integer num, String str2, Float f, ImageSynthesisResult imageSynthesisResult, String str3, String str4) {
        return new ImageSynthesisResult(str, i, i2, num, str2, f, imageSynthesisResult, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageSynthesisResult)) {
            return false;
        }
        ImageSynthesisResult imageSynthesisResult = (ImageSynthesisResult) obj;
        return Intrinsics.LJFF(this.path, imageSynthesisResult.path) && this.width == imageSynthesisResult.width && this.height == imageSynthesisResult.height && Intrinsics.LJFF(this.compileLevel, imageSynthesisResult.compileLevel) && Intrinsics.LJFF(this.key, imageSynthesisResult.key) && Intrinsics.LJFF(this.duration, imageSynthesisResult.duration) && Intrinsics.LJFF(this.liveVideo, imageSynthesisResult.liveVideo) && Intrinsics.LJFF(this.remoteUri, imageSynthesisResult.remoteUri) && Intrinsics.LJFF(this.watermarkPath, imageSynthesisResult.watermarkPath);
    }

    public int hashCode() {
        int iHashCode = ((((this.path.hashCode() * 31) + this.width) * 31) + this.height) * 31;
        Integer num = this.compileLevel;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.key;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.duration;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        ImageSynthesisResult imageSynthesisResult = this.liveVideo;
        int iHashCode5 = (iHashCode4 + (imageSynthesisResult == null ? 0 : imageSynthesisResult.hashCode())) * 31;
        String str2 = this.remoteUri;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.watermarkPath;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        Integer num = this.compileLevel;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.key);
        Float f = this.duration;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        ImageSynthesisResult imageSynthesisResult = this.liveVideo;
        if (imageSynthesisResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageSynthesisResult.writeToParcel(parcel, i);
        }
        parcel.writeString(this.remoteUri);
        parcel.writeString(this.watermarkPath);
    }

    public final float getImageRatio() {
        int i = this.height;
        if (i == 0) {
            return 0.0f;
        }
        return this.width / i;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("width: ");
        sbLIZ.append(this.width);
        sbLIZ.append(", height: ");
        sbLIZ.append(this.height);
        sbLIZ.append(", compileLevel: ");
        sbLIZ.append(this.compileLevel);
        sbLIZ.append(", path: ");
        sbLIZ.append(this.path);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getCompileLevel() {
        return this.compileLevel;
    }

    public final Float getDuration() {
        return this.duration;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getKey() {
        return this.key;
    }

    public final ImageSynthesisResult getLiveVideo() {
        return this.liveVideo;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getRemoteUri() {
        return this.remoteUri;
    }

    public final String getWatermarkPath() {
        return this.watermarkPath;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setCompileLevel(Integer num) {
        this.compileLevel = num;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setRemoteUri(String str) {
        this.remoteUri = str;
    }

    public final void setWatermarkPath(String str) {
        this.watermarkPath = str;
    }

    public ImageSynthesisResult(String str, int i, int i2, Integer num, String str2, Float f, ImageSynthesisResult imageSynthesisResult, String str3, String str4) {
        this.path = str;
        this.width = i;
        this.height = i2;
        this.compileLevel = num;
        this.key = str2;
        this.duration = f;
        this.liveVideo = imageSynthesisResult;
        this.remoteUri = str3;
        this.watermarkPath = str4;
    }

    public /* synthetic */ ImageSynthesisResult(String str, int i, int i2, Integer num, String str2, Float f, ImageSynthesisResult imageSynthesisResult, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 8) != 0 ? 0 : num, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : f, (i3 & 64) != 0 ? null : imageSynthesisResult, (i3 & 128) != 0 ? null : str3, (i3 & 256) == 0 ? str4 : null);
    }
}
