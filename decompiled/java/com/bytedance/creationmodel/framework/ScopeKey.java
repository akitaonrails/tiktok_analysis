package com.bytedance.creationmodel.framework;

import X.C1456050nzf;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.creationmodel.framework.ScopeKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ScopeKey implements Parcelable {
    public static final C1456050nzf CREATOR = new Parcelable.Creator<ScopeKey>() { // from class: X.0nzf
        @Override // android.os.Parcelable.Creator
        public final ScopeKey createFromParcel(Parcel parcel) {
            return new ScopeKey(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ScopeKey[] newArray(int i) {
            return new ScopeKey[i];
        }
    };
    public final String scopeId;
    public final String sessionId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScopeKey)) {
            return false;
        }
        ScopeKey scopeKey = (ScopeKey) obj;
        return Intrinsics.LJFF(this.sessionId, scopeKey.sessionId) && Intrinsics.LJFF(this.scopeId, scopeKey.scopeId);
    }

    public final int hashCode() {
        return (this.sessionId.hashCode() * 31) + this.scopeId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScopeKey(sessionId=");
        sbLIZ.append(this.sessionId);
        sbLIZ.append(", scopeId=");
        sbLIZ.append(this.scopeId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ScopeKey(String str, String str2) {
        this.sessionId = str;
        this.scopeId = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sessionId);
        parcel.writeString(this.scopeId);
    }
}
