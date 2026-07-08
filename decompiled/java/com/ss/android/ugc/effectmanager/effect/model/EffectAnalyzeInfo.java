package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class EffectAnalyzeInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<EffectAnalyzeInfo> CREATOR = new Creator();

    @C09CT("requirements")
    public final String requirements;

    @C09CT("sdk_extra")
    public final String sdk_extra;

    @C09CT("sdk_version")
    public final String sdk_version;

    @C09CT("system_list")
    public final String system_list;

    public static final class Creator implements Parcelable.Creator<EffectAnalyzeInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EffectAnalyzeInfo createFromParcel(Parcel parcel) {
            return new EffectAnalyzeInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EffectAnalyzeInfo[] newArray(int i) {
            return new EffectAnalyzeInfo[i];
        }
    }

    public final EffectAnalyzeInfo copy(String str, String str2, String str3, String str4) {
        return new EffectAnalyzeInfo(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectAnalyzeInfo)) {
            return false;
        }
        EffectAnalyzeInfo effectAnalyzeInfo = (EffectAnalyzeInfo) obj;
        return Intrinsics.LJFF(this.sdk_version, effectAnalyzeInfo.sdk_version) && Intrinsics.LJFF(this.sdk_extra, effectAnalyzeInfo.sdk_extra) && Intrinsics.LJFF(this.system_list, effectAnalyzeInfo.system_list) && Intrinsics.LJFF(this.requirements, effectAnalyzeInfo.requirements);
    }

    public int hashCode() {
        String str = this.sdk_version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sdk_extra;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.system_list;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.requirements;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectAnalyzeInfo(sdk_version=");
        sbLIZ.append(this.sdk_version);
        sbLIZ.append(", sdk_extra=");
        sbLIZ.append(this.sdk_extra);
        sbLIZ.append(", system_list=");
        sbLIZ.append(this.system_list);
        sbLIZ.append(", requirements=");
        sbLIZ.append(this.requirements);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sdk_version);
        parcel.writeString(this.sdk_extra);
        parcel.writeString(this.system_list);
        parcel.writeString(this.requirements);
    }

    public final String getRequirements() {
        return this.requirements;
    }

    public final String getSdk_extra() {
        return this.sdk_extra;
    }

    public final String getSdk_version() {
        return this.sdk_version;
    }

    public final String getSystem_list() {
        return this.system_list;
    }

    public EffectAnalyzeInfo(String str, String str2, String str3, String str4) {
        this.sdk_version = str;
        this.sdk_extra = str2;
        this.system_list = str3;
        this.requirements = str4;
    }
}
