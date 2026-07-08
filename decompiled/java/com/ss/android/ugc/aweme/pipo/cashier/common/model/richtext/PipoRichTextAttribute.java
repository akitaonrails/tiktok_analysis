package com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoRichTextAttribute;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoTextAttribute;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoRichTextAttribute implements Parcelable {
    public static final Parcelable.Creator<PipoRichTextAttribute> CREATOR = new Parcelable.Creator<PipoRichTextAttribute>() { // from class: X.0ulZ
        @Override // android.os.Parcelable.Creator
        public final PipoRichTextAttribute createFromParcel(Parcel parcel) {
            PipoTextAttribute pipoTextAttributeCreateFromParcel;
            if (parcel.readInt() == 0) {
                pipoTextAttributeCreateFromParcel = null;
            } else {
                pipoTextAttributeCreateFromParcel = PipoTextAttribute.CREATOR.createFromParcel(parcel);
            }
            return new PipoRichTextAttribute(pipoTextAttributeCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PipoRichTextAttribute[] newArray(int i) {
            return new PipoRichTextAttribute[i];
        }
    };

    @C09CT("text_attribute")
    public final PipoTextAttribute textAttribute;

    public PipoRichTextAttribute() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PipoRichTextAttribute) && Intrinsics.LJFF(this.textAttribute, ((PipoRichTextAttribute) obj).textAttribute);
    }

    public final int hashCode() {
        PipoTextAttribute pipoTextAttribute = this.textAttribute;
        if (pipoTextAttribute == null) {
            return 0;
        }
        return pipoTextAttribute.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoRichTextAttribute(textAttribute=");
        sbLIZ.append(this.textAttribute);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PipoTextAttribute pipoTextAttribute = this.textAttribute;
        if (pipoTextAttribute == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pipoTextAttribute.writeToParcel(parcel, i);
        }
    }

    public PipoRichTextAttribute(PipoTextAttribute pipoTextAttribute) {
        this.textAttribute = pipoTextAttribute;
    }
}
