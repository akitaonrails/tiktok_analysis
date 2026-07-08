package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Rule implements Parcelable {

    @C09CT("error")
    public String error;

    @C09CT("match_type")
    public String matchType;

    @C09CT("regex")
    public String regex;

    @C09CT("starling_key")
    public String starlingKey;
    public static final Parcelable.Creator<Rule> CREATOR = new Parcelable.Creator<Rule>() { // from class: X.02xv
        @Override // android.os.Parcelable.Creator
        public final Rule createFromParcel(Parcel parcel) {
            return new Rule(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Rule[] newArray(int i) {
            return new Rule[i];
        }
    };
    public static final int $stable = 8;

    public Rule() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rule)) {
            return false;
        }
        Rule rule = (Rule) obj;
        return Intrinsics.LJFF(this.error, rule.error) && Intrinsics.LJFF(this.regex, rule.regex) && Intrinsics.LJFF(this.matchType, rule.matchType) && Intrinsics.LJFF(this.starlingKey, rule.starlingKey);
    }

    public final int hashCode() {
        String str = this.error;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.regex;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.matchType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.starlingKey;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Rule(error=");
        sbLIZ.append(this.error);
        sbLIZ.append(", regex=");
        sbLIZ.append(this.regex);
        sbLIZ.append(", matchType=");
        sbLIZ.append(this.matchType);
        sbLIZ.append(", starlingKey=");
        sbLIZ.append(this.starlingKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.error);
        parcel.writeString(this.regex);
        parcel.writeString(this.matchType);
        parcel.writeString(this.starlingKey);
    }

    public Rule(String str, String str2, String str3, String str4) {
        this.error = str;
        this.regex = str2;
        this.matchType = str3;
        this.starlingKey = str4;
    }
}
