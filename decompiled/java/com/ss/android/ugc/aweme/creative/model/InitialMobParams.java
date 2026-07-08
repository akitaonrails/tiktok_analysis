package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.InitialMobParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class InitialMobParams implements Parcelable {
    public static final Parcelable.Creator<InitialMobParams> CREATOR = new Parcelable.Creator<InitialMobParams>() { // from class: X.0mbj
        @Override // android.os.Parcelable.Creator
        public final InitialMobParams createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
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
            return new InitialMobParams(string, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final InitialMobParams[] newArray(int i) {
            return new InitialMobParams[i];
        }
    };

    @C09CT("enter_type")
    public final String enterType;

    @C09CT("is_upload_direct_enter")
    public Boolean isUploadDirectEnter;

    public InitialMobParams() {
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
        if (!(obj instanceof InitialMobParams)) {
            return false;
        }
        InitialMobParams initialMobParams = (InitialMobParams) obj;
        return Intrinsics.LJFF(this.enterType, initialMobParams.enterType) && Intrinsics.LJFF(this.isUploadDirectEnter, initialMobParams.isUploadDirectEnter);
    }

    public final int hashCode() {
        String str = this.enterType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isUploadDirectEnter;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitialMobParams(enterType=");
        sbLIZ.append(this.enterType);
        sbLIZ.append(", isUploadDirectEnter=");
        sbLIZ.append(this.isUploadDirectEnter);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.enterType);
        Boolean bool = this.isUploadDirectEnter;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public InitialMobParams(String str, Boolean bool) {
        this.enterType = str;
        this.isUploadDirectEnter = bool;
    }
}
