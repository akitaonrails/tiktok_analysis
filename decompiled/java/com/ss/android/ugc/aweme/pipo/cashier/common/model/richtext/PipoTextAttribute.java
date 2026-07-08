package com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoTextAttribute;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoTextAttribute implements Parcelable {
    public static final Parcelable.Creator<PipoTextAttribute> CREATOR = new Parcelable.Creator<PipoTextAttribute>() { // from class: X.0ula
        @Override // android.os.Parcelable.Creator
        public final PipoTextAttribute createFromParcel(Parcel parcel) {
            return new PipoTextAttribute(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PipoTextAttribute[] newArray(int i) {
            return new PipoTextAttribute[i];
        }
    };

    @C09CT("link")
    public final String link;

    @C09CT("text")
    public final String text;

    public PipoTextAttribute() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PipoTextAttribute)) {
            return false;
        }
        PipoTextAttribute pipoTextAttribute = (PipoTextAttribute) obj;
        return Intrinsics.LJFF(this.text, pipoTextAttribute.text) && Intrinsics.LJFF(this.link, pipoTextAttribute.link);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.link;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoTextAttribute(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.link);
    }

    public PipoTextAttribute(String str, String str2) {
        this.text = str;
        this.link = str2;
    }
}
