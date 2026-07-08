package com.ss.android.ugc.aweme.portrait.model;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC550140Lhs;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.model.GenerateFailedInfo;

/* JADX INFO: loaded from: classes9.dex */
public final class GenerateFailedInfo implements Parcelable {
    public static final Parcelable.Creator<GenerateFailedInfo> CREATOR = new Parcelable.Creator<GenerateFailedInfo>() { // from class: X.0Lht
        @Override // android.os.Parcelable.Creator
        public final GenerateFailedInfo createFromParcel(Parcel parcel) {
            EnumC550140Lhs enumC550140LhsValueOf;
            if (parcel.readInt() == 0) {
                enumC550140LhsValueOf = null;
            } else {
                enumC550140LhsValueOf = EnumC550140Lhs.valueOf(parcel.readString());
            }
            return new GenerateFailedInfo(enumC550140LhsValueOf, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final GenerateFailedInfo[] newArray(int i) {
            return new GenerateFailedInfo[i];
        }
    };

    @C09CT("arch_result_code")
    public final int archResultCode;

    @C09CT("failed_type")
    public EnumC550140Lhs failedType;

    public GenerateFailedInfo() {
        this(null, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenerateFailedInfo)) {
            return false;
        }
        GenerateFailedInfo generateFailedInfo = (GenerateFailedInfo) obj;
        return this.failedType == generateFailedInfo.failedType && this.archResultCode == generateFailedInfo.archResultCode;
    }

    public final int hashCode() {
        EnumC550140Lhs enumC550140Lhs = this.failedType;
        return ((enumC550140Lhs == null ? 0 : enumC550140Lhs.hashCode()) * 31) + this.archResultCode;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenerateFailedInfo(failedType=");
        sbLIZ.append(this.failedType);
        sbLIZ.append(", archResultCode=");
        sbLIZ.append(this.archResultCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        EnumC550140Lhs enumC550140Lhs = this.failedType;
        if (enumC550140Lhs == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC550140Lhs.name());
        }
        parcel.writeInt(this.archResultCode);
    }

    public GenerateFailedInfo(EnumC550140Lhs enumC550140Lhs, int i) {
        this.failedType = enumC550140Lhs;
        this.archResultCode = i;
    }
}
