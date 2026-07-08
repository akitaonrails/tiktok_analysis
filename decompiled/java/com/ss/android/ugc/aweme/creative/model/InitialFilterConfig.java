package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.InitialFilterConfig;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class InitialFilterConfig implements Serializable, Parcelable {
    public static final Parcelable.Creator<InitialFilterConfig> CREATOR = new Parcelable.Creator<InitialFilterConfig>() { // from class: X.0oFE
        @Override // android.os.Parcelable.Creator
        public final InitialFilterConfig createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new InitialFilterConfig(string, string2, z, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final InitialFilterConfig[] newArray(int i) {
            return new InitialFilterConfig[i];
        }
    };

    @C040H
    public boolean appliedInImageEditPage;

    @C040H
    public boolean appliedInVideoEditPage;

    @C040H
    public boolean enableInEditPage;

    @C040H
    public final String filterId;

    @C040H
    public final String resId;

    public InitialFilterConfig() {
        this(null, null, false, false, false);
    }

    public final InitialFilterConfig copy(String str, String str2, boolean z, boolean z2, boolean z3) {
        return new InitialFilterConfig(str, str2, z, z2, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitialFilterConfig)) {
            return false;
        }
        InitialFilterConfig initialFilterConfig = (InitialFilterConfig) obj;
        return Intrinsics.LJFF(this.filterId, initialFilterConfig.filterId) && Intrinsics.LJFF(this.resId, initialFilterConfig.resId) && this.enableInEditPage == initialFilterConfig.enableInEditPage && this.appliedInImageEditPage == initialFilterConfig.appliedInImageEditPage && this.appliedInVideoEditPage == initialFilterConfig.appliedInVideoEditPage;
    }

    public int hashCode() {
        String str = this.filterId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.resId;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.enableInEditPage)) * 31) + C786410Ut5.Z2(this.appliedInImageEditPage)) * 31) + C786410Ut5.Z2(this.appliedInVideoEditPage);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitialFilterConfig(filterId=");
        sbLIZ.append(this.filterId);
        sbLIZ.append(", resId=");
        sbLIZ.append(this.resId);
        sbLIZ.append(", enableInEditPage=");
        sbLIZ.append(this.enableInEditPage);
        sbLIZ.append(", appliedInImageEditPage=");
        sbLIZ.append(this.appliedInImageEditPage);
        sbLIZ.append(", appliedInVideoEditPage=");
        sbLIZ.append(this.appliedInVideoEditPage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.filterId);
        parcel.writeString(this.resId);
        parcel.writeInt(this.enableInEditPage ? 1 : 0);
        parcel.writeInt(this.appliedInImageEditPage ? 1 : 0);
        parcel.writeInt(this.appliedInVideoEditPage ? 1 : 0);
    }

    public final boolean getAppliedInImageEditPage() {
        return this.appliedInImageEditPage;
    }

    public final boolean getAppliedInVideoEditPage() {
        return this.appliedInVideoEditPage;
    }

    public final boolean getEnableInEditPage() {
        return this.enableInEditPage;
    }

    public final String getFilterId() {
        return this.filterId;
    }

    public final String getResId() {
        return this.resId;
    }

    public final void setAppliedInImageEditPage(boolean z) {
        this.appliedInImageEditPage = z;
    }

    public final void setAppliedInVideoEditPage(boolean z) {
        this.appliedInVideoEditPage = z;
    }

    public final void setEnableInEditPage(boolean z) {
        this.enableInEditPage = z;
    }

    public InitialFilterConfig(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.filterId = str;
        this.resId = str2;
        this.enableInEditPage = z;
        this.appliedInImageEditPage = z2;
        this.appliedInVideoEditPage = z3;
    }
}
