package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import X.InterfaceC2270808v4;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class SrcImageInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<SrcImageInfo> CREATOR = new Parcelable.Creator<SrcImageInfo>() { // from class: X.0nLC
        @Override // android.os.Parcelable.Creator
        public final SrcImageInfo createFromParcel(Parcel parcel) {
            return new SrcImageInfo(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SrcImageInfo[] newArray(int i) {
            return new SrcImageInfo[i];
        }
    };

    @C09CT("alternate_text")
    public String altText;

    @C09CT("height")
    public int height;

    @InterfaceC2270908v5
    @InterfaceC2270808v4
    @C09CT("path")
    @C0MY0
    public final String path;

    @C09CT("remote_uri")
    public String remoteUri;

    @C09CT("width")
    public int width;

    public final SrcImageInfo copy(String str, int i, int i2, String str2, String str3) {
        return new SrcImageInfo(str, i, i2, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SrcImageInfo)) {
            return false;
        }
        SrcImageInfo srcImageInfo = (SrcImageInfo) obj;
        return Intrinsics.LJFF(this.path, srcImageInfo.path) && this.height == srcImageInfo.height && this.width == srcImageInfo.width && Intrinsics.LJFF(this.altText, srcImageInfo.altText) && Intrinsics.LJFF(this.remoteUri, srcImageInfo.remoteUri);
    }

    public int hashCode() {
        int iHashCode = ((((this.path.hashCode() * 31) + this.height) * 31) + this.width) * 31;
        String str = this.altText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.remoteUri;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SrcImageInfo(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", altText=");
        sbLIZ.append(this.altText);
        sbLIZ.append(", remoteUri=");
        sbLIZ.append(this.remoteUri);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
        parcel.writeString(this.altText);
        parcel.writeString(this.remoteUri);
    }

    public final SrcImageInfo copy() {
        return new SrcImageInfo(this.path, this.height, this.width, this.altText, this.remoteUri);
    }

    public final float getImageRatio() {
        return this.width / this.height;
    }

    public final String getAltText() {
        return this.altText;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getRemoteUri() {
        return this.remoteUri;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setAltText(String str) {
        this.altText = str;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setRemoteUri(String str) {
        this.remoteUri = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public SrcImageInfo(String str, int i, int i2, String str2, String str3) {
        this.path = str;
        this.height = i;
        this.width = i2;
        this.altText = str2;
        this.remoteUri = str3;
    }

    public /* synthetic */ SrcImageInfo(String str, int i, int i2, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 8) != 0 ? null : str2, (i3 & 16) == 0 ? str3 : null);
    }
}
