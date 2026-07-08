package com.ss.android.ugc.aweme.biz.wallet.network.model;

import X.AnonymousClass0922;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.biz.wallet.network.model.PhoneRule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PhoneRule implements Parcelable {
    public static final AnonymousClass0922 CREATOR = new Parcelable.Creator<PhoneRule>() { // from class: X.0922
        @Override // android.os.Parcelable.Creator
        public final PhoneRule createFromParcel(Parcel parcel) {
            return new PhoneRule(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneRule[] newArray(int i) {
            return new PhoneRule[i];
        }
    };

    @C09CT("error_code")
    public final long errorCode;

    @C09CT("error_msg")
    public final String errorMsg;

    @C09CT("priority")
    public final long priority;

    @C09CT("regex")
    public final String regex;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneRule)) {
            return false;
        }
        PhoneRule phoneRule = (PhoneRule) obj;
        return this.priority == phoneRule.priority && Intrinsics.LJFF(this.regex, phoneRule.regex) && this.errorCode == phoneRule.errorCode && Intrinsics.LJFF(this.errorMsg, phoneRule.errorMsg);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.priority) * 31;
        String str = this.regex;
        int iHashCode = (((iY2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.errorCode)) * 31;
        String str2 = this.errorMsg;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhoneRule(priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(", regex=");
        sbLIZ.append(this.regex);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.errorMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PhoneRule(Parcel parcel) {
        this(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.priority);
        parcel.writeString(this.regex);
        parcel.writeLong(this.errorCode);
        parcel.writeString(this.errorMsg);
    }

    public PhoneRule(long j, String str, long j2, String str2) {
        this.priority = j;
        this.regex = str;
        this.errorCode = j2;
        this.errorMsg = str2;
    }
}
