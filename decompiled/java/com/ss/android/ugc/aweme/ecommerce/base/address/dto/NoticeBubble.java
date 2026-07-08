package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.NoticeBubble;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class NoticeBubble implements Parcelable {

    @C09CT("key")
    public final String key;

    @C09CT("need_location")
    public final Boolean needLocation;

    @C09CT("text")
    public final String text;
    public static final Parcelable.Creator<NoticeBubble> CREATOR = new Parcelable.Creator<NoticeBubble>() { // from class: X.036z
        @Override // android.os.Parcelable.Creator
        public final NoticeBubble createFromParcel(Parcel parcel) {
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
            return new NoticeBubble(string, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final NoticeBubble[] newArray(int i) {
            return new NoticeBubble[i];
        }
    };
    public static final int $stable = 8;

    public NoticeBubble() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeBubble)) {
            return false;
        }
        NoticeBubble noticeBubble = (NoticeBubble) obj;
        return Intrinsics.LJFF(this.key, noticeBubble.key) && Intrinsics.LJFF(this.text, noticeBubble.text) && Intrinsics.LJFF(this.needLocation, noticeBubble.needLocation);
    }

    public final int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.needLocation;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoticeBubble(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", needLocation=");
        sbLIZ.append(this.needLocation);
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
        parcel.writeString(this.key);
        parcel.writeString(this.text);
        Boolean bool = this.needLocation;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public NoticeBubble(String str, String str2, Boolean bool) {
        this.key = str;
        this.text = str2;
        this.needLocation = bool;
    }
}
