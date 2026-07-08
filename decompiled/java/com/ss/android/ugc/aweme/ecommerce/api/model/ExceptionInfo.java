package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ExceptionInfo implements Parcelable {
    public static final Parcelable.Creator<ExceptionInfo> CREATOR = new Parcelable.Creator<ExceptionInfo>() { // from class: X.02kc
        @Override // android.os.Parcelable.Creator
        public final ExceptionInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ExceptionInfo(numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExceptionInfo[] newArray(int i) {
            return new ExceptionInfo[i];
        }
    };

    @C09CT("error_code")
    public Integer errorCode;

    @C09CT("error_reason")
    public String errorReason;

    public ExceptionInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExceptionInfo)) {
            return false;
        }
        ExceptionInfo exceptionInfo = (ExceptionInfo) obj;
        return Intrinsics.LJFF(this.errorCode, exceptionInfo.errorCode) && Intrinsics.LJFF(this.errorReason, exceptionInfo.errorReason);
    }

    public final int hashCode() {
        Integer num = this.errorCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.errorReason;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExceptionInfo(errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", errorReason=");
        sbLIZ.append(this.errorReason);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.errorCode;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.errorReason);
    }

    public ExceptionInfo(Integer num, String str) {
        this.errorCode = num;
        this.errorReason = str;
    }
}
