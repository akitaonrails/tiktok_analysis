package com.ss.android.ugc.aweme.mediachoose.helper;

import X.C09CT;
import X.C0L0R;
import X.C0LO4;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigc;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigcAnchor;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumAigc implements Serializable, Parcelable {

    @C09CT("ai_type")
    public final Integer aiType;

    @C09CT("aigc_anchor")
    public final AlbumAigcAnchor aigcAnchor;

    @C09CT("uuid")
    public final String uuid;
    public static final C0L0R Companion = new Object() { // from class: X.0L0R
    };
    public static final Parcelable.Creator<AlbumAigc> CREATOR = new Parcelable.Creator<AlbumAigc>() { // from class: X.0L0Q
        @Override // android.os.Parcelable.Creator
        public final AlbumAigc createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            AlbumAigcAnchor albumAigcAnchorCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                albumAigcAnchorCreateFromParcel = AlbumAigcAnchor.CREATOR.createFromParcel(parcel);
            }
            return new AlbumAigc(string, numValueOf, albumAigcAnchorCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumAigc[] newArray(int i) {
            return new AlbumAigc[i];
        }
    };

    public final AlbumAigc copy(String str, Integer num, AlbumAigcAnchor albumAigcAnchor) {
        return new AlbumAigc(str, num, albumAigcAnchor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlbumAigc)) {
            return false;
        }
        AlbumAigc albumAigc = (AlbumAigc) obj;
        return Intrinsics.LJFF(this.uuid, albumAigc.uuid) && Intrinsics.LJFF(this.aiType, albumAigc.aiType) && Intrinsics.LJFF(this.aigcAnchor, albumAigc.aigcAnchor);
    }

    public int hashCode() {
        String str = this.uuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.aiType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        AlbumAigcAnchor albumAigcAnchor = this.aigcAnchor;
        return iHashCode2 + (albumAigcAnchor != null ? albumAigcAnchor.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uuid);
        Integer num = this.aiType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        AlbumAigcAnchor albumAigcAnchor = this.aigcAnchor;
        if (albumAigcAnchor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            albumAigcAnchor.writeToParcel(parcel, i);
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{uuid=");
        sbLIZ.append(this.uuid);
        sbLIZ.append(",aiType=");
        Integer num = this.aiType;
        sbLIZ.append(num != null ? C0LO4.LIZ(num.intValue()) : null);
        sbLIZ.append(",anchor=");
        AlbumAigcAnchor albumAigcAnchor = this.aigcAnchor;
        sbLIZ.append(albumAigcAnchor != null ? albumAigcAnchor.getPropId() : null);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getAiType() {
        return this.aiType;
    }

    public final AlbumAigcAnchor getAigcAnchor() {
        return this.aigcAnchor;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public AlbumAigc(String str, Integer num, AlbumAigcAnchor albumAigcAnchor) {
        this.uuid = str;
        this.aiType = num;
        this.aigcAnchor = albumAigcAnchor;
    }
}
