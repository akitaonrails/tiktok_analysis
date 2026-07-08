package com.ss.android.ugc.aweme.image.thumbnail;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.thumbnail.MediaMetadata;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class MediaMetadata implements Parcelable, Serializable {

    @C09CT("aigc_type")
    public int aigcType;

    @C09CT("c2pa")
    public int c2pa;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;
    public static final Parcelable.Creator<MediaMetadata> CREATOR = new Parcelable.Creator<MediaMetadata>() { // from class: X.0L1D
        @Override // android.os.Parcelable.Creator
        public final MediaMetadata createFromParcel(Parcel parcel) {
            return new MediaMetadata(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MediaMetadata[] newArray(int i) {
            return new MediaMetadata[i];
        }
    };
    public static final int $stable = 8;

    public final MediaMetadata copy(String str, int i, int i2) {
        return new MediaMetadata(str, i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMetadata)) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return Intrinsics.LJFF(this.id, mediaMetadata.id) && this.aigcType == mediaMetadata.aigcType && this.c2pa == mediaMetadata.c2pa;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.aigcType) * 31) + this.c2pa;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaMetadata(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", aigcType=");
        sbLIZ.append(this.aigcType);
        sbLIZ.append(", c2pa=");
        sbLIZ.append(this.c2pa);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeInt(this.aigcType);
        parcel.writeInt(this.c2pa);
    }

    public MediaMetadata() {
        this("", -1, 0);
    }

    public final int getAigcType() {
        return this.aigcType;
    }

    public final int getC2pa() {
        return this.c2pa;
    }

    public final String getId() {
        return this.id;
    }

    public final void setAigcType(int i) {
        this.aigcType = i;
    }

    public final void setC2pa(int i) {
        this.c2pa = i;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public MediaMetadata(String str, int i, int i2) {
        this.id = str;
        this.aigcType = i;
        this.c2pa = i2;
    }
}
