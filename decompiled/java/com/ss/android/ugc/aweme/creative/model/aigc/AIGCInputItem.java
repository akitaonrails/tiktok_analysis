package com.ss.android.ugc.aweme.creative.model.aigc;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCInputItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCInputItem implements Parcelable {
    public static final Parcelable.Creator<AIGCInputItem> CREATOR = new Parcelable.Creator<AIGCInputItem>() { // from class: X.0LLq
        @Override // android.os.Parcelable.Creator
        public final AIGCInputItem createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new AIGCInputItem(string, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCInputItem[] newArray(int i) {
            return new AIGCInputItem[i];
        }
    };

    @C09CT("extra")
    public final String extra;

    @C09CT("type")
    public final Integer type;

    @C09CT("value")
    public final String value;

    public AIGCInputItem() {
        this("", 2, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCInputItem)) {
            return false;
        }
        AIGCInputItem aIGCInputItem = (AIGCInputItem) obj;
        return Intrinsics.LJFF(this.value, aIGCInputItem.value) && Intrinsics.LJFF(this.type, aIGCInputItem.type) && Intrinsics.LJFF(this.extra, aIGCInputItem.extra);
    }

    public final int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        Integer num = this.type;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.extra;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCInputItem(value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.value);
        Integer num = this.type;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.extra);
    }

    public AIGCInputItem(String str, Integer num, String str2) {
        this.value = str;
        this.type = num;
        this.extra = str2;
    }
}
