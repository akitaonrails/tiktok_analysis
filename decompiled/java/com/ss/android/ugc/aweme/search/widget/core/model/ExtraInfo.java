package com.ss.android.ugc.aweme.search.widget.core.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.search.widget.core.model.ExtraInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class ExtraInfo implements Parcelable, Serializable {

    @C09CT("penetrate_info")
    public final String penetrateInfo;
    public static final Parcelable.Creator<ExtraInfo> CREATOR = new Parcelable.Creator<ExtraInfo>() { // from class: X.0QNq
        @Override // android.os.Parcelable.Creator
        public final ExtraInfo createFromParcel(Parcel parcel) {
            return new ExtraInfo(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExtraInfo[] newArray(int i) {
            return new ExtraInfo[i];
        }
    };
    public static final int $stable = 8;

    public ExtraInfo() {
        this(null);
    }

    public final ExtraInfo copy(String str) {
        return new ExtraInfo(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExtraInfo) && Intrinsics.LJFF(this.penetrateInfo, ((ExtraInfo) obj).penetrateInfo);
    }

    public int hashCode() {
        String str = this.penetrateInfo;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraInfo(penetrateInfo=");
        sbLIZ.append(this.penetrateInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.penetrateInfo);
    }

    public final String getPenetrateInfo() {
        return this.penetrateInfo;
    }

    public ExtraInfo(String str) {
        this.penetrateInfo = str;
    }
}
