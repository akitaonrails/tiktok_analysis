package com.ss.android.ugc.aweme.creative.model.music;

import X.C040H;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.music.UnSelectMusic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class UnSelectMusic implements Parcelable {
    public static final Parcelable.Creator<UnSelectMusic> CREATOR = new Parcelable.Creator<UnSelectMusic>() { // from class: X.0MHo
        @Override // android.os.Parcelable.Creator
        public final UnSelectMusic createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
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
            return new UnSelectMusic(string, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final UnSelectMusic[] newArray(int i) {
            return new UnSelectMusic[i];
        }
    };

    @C040H
    public Boolean changeMaterial;

    @C040H
    public String creationId;

    @C040H
    public String musicId;

    /* JADX WARN: Illegal instructions before constructor call */
    public UnSelectMusic() {
        String str = null;
        this(str, str, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnSelectMusic)) {
            return false;
        }
        UnSelectMusic unSelectMusic = (UnSelectMusic) obj;
        return Intrinsics.LJFF(this.creationId, unSelectMusic.creationId) && Intrinsics.LJFF(this.musicId, unSelectMusic.musicId) && Intrinsics.LJFF(this.changeMaterial, unSelectMusic.changeMaterial);
    }

    public final int hashCode() {
        String str = this.creationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.musicId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.changeMaterial;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnSelectMusic(creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", musicId=");
        sbLIZ.append(this.musicId);
        sbLIZ.append(", changeMaterial=");
        sbLIZ.append(this.changeMaterial);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.creationId);
        parcel.writeString(this.musicId);
        Boolean bool = this.changeMaterial;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public /* synthetic */ UnSelectMusic(String str, String str2, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Boolean.TRUE : null);
    }

    public UnSelectMusic(String str, String str2, Boolean bool) {
        this.creationId = str;
        this.musicId = str2;
        this.changeMaterial = bool;
    }
}
