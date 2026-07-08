package com.ss.android.ugc.aweme.social.creation.mediapicker.data;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class SocMediaResource implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SocMediaResource> CREATOR = new Parcelable.Creator<SocMediaResource>() { // from class: X.09M8
        @Override // android.os.Parcelable.Creator
        public final SocMediaResource createFromParcel(Parcel parcel) {
            return new SocMediaResource(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), (TikTokMediaModel) parcel.readParcelable(SocMediaResource.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SocMediaResource[] newArray(int i) {
            return new SocMediaResource[i];
        }
    };
    public final String albumName;
    public final long durationMs;
    public final String id;
    public final String mimeType;
    public final String name;
    public final String path;
    public Integer rotation;
    public final TikTokMediaModel tiktokMediaModel;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocMediaResource)) {
            return false;
        }
        SocMediaResource socMediaResource = (SocMediaResource) obj;
        return Intrinsics.LJFF(this.id, socMediaResource.id) && Intrinsics.LJFF(this.albumName, socMediaResource.albumName) && Intrinsics.LJFF(this.path, socMediaResource.path) && Intrinsics.LJFF(this.name, socMediaResource.name) && this.durationMs == socMediaResource.durationMs && Intrinsics.LJFF(this.mimeType, socMediaResource.mimeType) && Intrinsics.LJFF(this.tiktokMediaModel, socMediaResource.tiktokMediaModel);
    }

    public final int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.albumName.hashCode()) * 31) + this.path.hashCode()) * 31) + this.name.hashCode()) * 31) + C786410Ut5.Y2(this.durationMs)) * 31) + this.mimeType.hashCode()) * 31) + this.tiktokMediaModel.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocMediaResource(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", albumName=");
        sbLIZ.append(this.albumName);
        sbLIZ.append(", path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.durationMs);
        sbLIZ.append(", mimeType=");
        sbLIZ.append(this.mimeType);
        sbLIZ.append(", tiktokMediaModel=");
        sbLIZ.append(this.tiktokMediaModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.albumName);
        parcel.writeString(this.path);
        parcel.writeString(this.name);
        parcel.writeLong(this.durationMs);
        parcel.writeString(this.mimeType);
        parcel.writeParcelable(this.tiktokMediaModel, i);
    }

    public final String LIZ() {
        return this.tiktokMediaModel.LJFF();
    }

    public final long LIZIZ() {
        TikTokMediaModel tikTokMediaModel = this.tiktokMediaModel;
        return (((long) Float.floatToRawIntBits(tikTokMediaModel.width)) << 32) | (((long) Float.floatToRawIntBits(tikTokMediaModel.height)) & 4294967295L);
    }

    public final boolean LIZJ() {
        return u.LJJIIJZLJL(this.mimeType, "image/", false);
    }

    public final boolean LIZLLL() {
        return u.LJJIIJZLJL(this.mimeType, "video/", false);
    }

    public SocMediaResource(String str, String str2, String str3, String str4, long j, String str5, TikTokMediaModel tikTokMediaModel) {
        this.id = str;
        this.albumName = str2;
        this.path = str3;
        this.name = str4;
        this.durationMs = j;
        this.mimeType = str5;
        this.tiktokMediaModel = tikTokMediaModel;
    }
}
