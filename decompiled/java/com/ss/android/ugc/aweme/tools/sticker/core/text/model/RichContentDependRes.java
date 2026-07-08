package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.RichContentDependRes;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class RichContentDependRes implements Parcelable, Serializable {

    @InterfaceC2270908v5
    @C09CT("path")
    public final String path;

    @C09CT("urs")
    public final String urs;
    public static final Parcelable.Creator<RichContentDependRes> CREATOR = new Parcelable.Creator<RichContentDependRes>() { // from class: X.0EKE
        @Override // android.os.Parcelable.Creator
        public final RichContentDependRes createFromParcel(Parcel parcel) {
            return new RichContentDependRes(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RichContentDependRes[] newArray(int i) {
            return new RichContentDependRes[i];
        }
    };
    public static final int $stable = 8;

    public final RichContentDependRes copy(String str, String str2) {
        return new RichContentDependRes(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichContentDependRes)) {
            return false;
        }
        RichContentDependRes richContentDependRes = (RichContentDependRes) obj;
        return Intrinsics.LJFF(this.urs, richContentDependRes.urs) && Intrinsics.LJFF(this.path, richContentDependRes.path);
    }

    public int hashCode() {
        String str = this.urs;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.path;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RichContentDependRes(urs=");
        sbLIZ.append(this.urs);
        sbLIZ.append(", path=");
        sbLIZ.append(this.path);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.urs);
        parcel.writeString(this.path);
    }

    public final String getPath() {
        return this.path;
    }

    public final String getUrs() {
        return this.urs;
    }

    public RichContentDependRes(String str, String str2) {
        this.urs = str;
        this.path = str2;
    }
}
