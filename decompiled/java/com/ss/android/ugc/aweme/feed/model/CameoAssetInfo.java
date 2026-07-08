package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CameoAssetInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<CameoAssetInfo> CREATOR = new Creator();

    @C09CT("cameo_id")
    public String cameoId;

    @C09CT("is_virtual")
    public Boolean isVirtual;

    public static final class Creator implements Parcelable.Creator<CameoAssetInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CameoAssetInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CameoAssetInfo(string, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CameoAssetInfo[] newArray(int i) {
            return new CameoAssetInfo[i];
        }
    }

    public final CameoAssetInfo copy(String str, Boolean bool) {
        return new CameoAssetInfo(str, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameoAssetInfo)) {
            return false;
        }
        CameoAssetInfo cameoAssetInfo = (CameoAssetInfo) obj;
        return Intrinsics.LJFF(this.cameoId, cameoAssetInfo.cameoId) && Intrinsics.LJFF(this.isVirtual, cameoAssetInfo.isVirtual);
    }

    public int hashCode() {
        String str = this.cameoId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isVirtual;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameoAssetInfo(cameoId=");
        sbLIZ.append(this.cameoId);
        sbLIZ.append(", isVirtual=");
        sbLIZ.append(this.isVirtual);
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
        parcel.writeString(this.cameoId);
        Boolean bool = this.isVirtual;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public CameoAssetInfo() {
        this("", Boolean.FALSE);
    }

    public final String getCameoId() {
        return this.cameoId;
    }

    public final Boolean isVirtual() {
        return this.isVirtual;
    }

    public CameoAssetInfo(String str, Boolean bool) {
        this.cameoId = str;
        this.isVirtual = bool;
    }
}
