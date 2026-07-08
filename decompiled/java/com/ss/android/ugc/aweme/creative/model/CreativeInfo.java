package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C0DMI;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CreativeInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<CreativeInfo> CREATOR = new Parcelable.Creator<CreativeInfo>() { // from class: X.0F2O
        @Override // android.os.Parcelable.Creator
        public final CreativeInfo createFromParcel(Parcel parcel) {
            return new CreativeInfo(parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CreativeInfo[] newArray(int i) {
            return new CreativeInfo[i];
        }
    };

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("version")
    public final int version;

    /* JADX WARN: Multi-variable type inference failed */
    public CreativeInfo() {
        this(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreativeInfo(String str) {
        this(str, 0, null, 6, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreativeInfo(String str, int i) {
        this(str, i, null, 4, 0 == true ? 1 : 0);
    }

    public final CreativeInfo copy(String str, int i, String str2) {
        return new CreativeInfo(str, i, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreativeInfo)) {
            return false;
        }
        CreativeInfo creativeInfo = (CreativeInfo) obj;
        return Intrinsics.LJFF(this.creationId, creativeInfo.creationId) && this.version == creativeInfo.version && Intrinsics.LJFF(this.sessionId, creativeInfo.sessionId);
    }

    public int hashCode() {
        int iHashCode = ((this.creationId.hashCode() * 31) + this.version) * 31;
        String str = this.sessionId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreativeInfo(creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.sessionId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.creationId);
        parcel.writeInt(this.version);
        parcel.writeString(this.sessionId);
    }

    public final boolean isValid() {
        return this.creationId.length() > 0;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getVersion() {
        return this.version;
    }

    public CreativeInfo(String str, int i, String str2) {
        this.creationId = str;
        this.version = i;
        this.sessionId = str2;
    }

    public /* synthetic */ CreativeInfo(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C0DMI.LIZ() : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str2);
    }
}
