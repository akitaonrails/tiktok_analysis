package com.ss.android.ugc.gamora.editor.ailive.repo;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.gamora.editor.ailive.repo.LogPB;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LogPB implements Parcelable {

    @C09CT("impr_id")
    public final String imprId;
    public static final Parcelable.Creator<LogPB> CREATOR = new Parcelable.Creator<LogPB>() { // from class: X.0MD6
        @Override // android.os.Parcelable.Creator
        public final LogPB createFromParcel(Parcel parcel) {
            return new LogPB(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LogPB[] newArray(int i) {
            return new LogPB[i];
        }
    };
    public static final int $stable = 8;

    public LogPB() {
        this(null);
    }

    public final LogPB copy(String str) {
        return new LogPB(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LogPB) && Intrinsics.LJFF(this.imprId, ((LogPB) obj).imprId);
    }

    public int hashCode() {
        String str = this.imprId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogPB(imprId=");
        sbLIZ.append(this.imprId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.imprId);
    }

    public final String getImprId() {
        return this.imprId;
    }

    public LogPB(String str) {
        this.imprId = str;
    }
}
