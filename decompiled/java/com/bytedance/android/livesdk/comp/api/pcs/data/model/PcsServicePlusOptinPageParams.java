package com.bytedance.android.livesdk.comp.api.pcs.data.model;

import X.C1822250xWJ;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServicePlusOptinPageParams implements Parcelable, Serializable {
    public static final long serialVersionUID = 1;
    public String anchorId;
    public long clickGoLiveBtnTimeStamp;
    public HashMap<String, String> extra;
    public String pcsTrackContext;
    public String secAnchorId;
    public String showEntrance;
    public static final C1822250xWJ Companion = new Object() { // from class: X.0xWJ
    };
    public static final Parcelable.Creator<PcsServicePlusOptinPageParams> CREATOR = new Parcelable.Creator<PcsServicePlusOptinPageParams>() { // from class: X.0JON
        @Override // android.os.Parcelable.Creator
        public final PcsServicePlusOptinPageParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            long j = parcel.readLong();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            HashMap map = new HashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                map.put(parcel.readString(), parcel.readString());
            }
            return new PcsServicePlusOptinPageParams(string, string2, string3, j, string4, map);
        }

        @Override // android.os.Parcelable.Creator
        public final PcsServicePlusOptinPageParams[] newArray(int i) {
            return new PcsServicePlusOptinPageParams[i];
        }
    };

    public final PcsServicePlusOptinPageParams copy(String str, String str2, String str3, long j, String str4, HashMap<String, String> map) {
        return new PcsServicePlusOptinPageParams(str, str2, str3, j, str4, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PcsServicePlusOptinPageParams)) {
            return false;
        }
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams = (PcsServicePlusOptinPageParams) obj;
        return Intrinsics.LJFF(this.anchorId, pcsServicePlusOptinPageParams.anchorId) && Intrinsics.LJFF(this.secAnchorId, pcsServicePlusOptinPageParams.secAnchorId) && Intrinsics.LJFF(this.showEntrance, pcsServicePlusOptinPageParams.showEntrance) && this.clickGoLiveBtnTimeStamp == pcsServicePlusOptinPageParams.clickGoLiveBtnTimeStamp && Intrinsics.LJFF(this.pcsTrackContext, pcsServicePlusOptinPageParams.pcsTrackContext) && Intrinsics.LJFF(this.extra, pcsServicePlusOptinPageParams.extra);
    }

    public int hashCode() {
        return (((((((((this.anchorId.hashCode() * 31) + this.secAnchorId.hashCode()) * 31) + this.showEntrance.hashCode()) * 31) + C786410Ut5.Y2(this.clickGoLiveBtnTimeStamp)) * 31) + this.pcsTrackContext.hashCode()) * 31) + this.extra.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsServicePlusOptinPageParams(anchorId=");
        sbLIZ.append(this.anchorId);
        sbLIZ.append(", secAnchorId=");
        sbLIZ.append(this.secAnchorId);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(this.showEntrance);
        sbLIZ.append(", clickGoLiveBtnTimeStamp=");
        sbLIZ.append(this.clickGoLiveBtnTimeStamp);
        sbLIZ.append(", pcsTrackContext=");
        sbLIZ.append(this.pcsTrackContext);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.anchorId);
        parcel.writeString(this.secAnchorId);
        parcel.writeString(this.showEntrance);
        parcel.writeLong(this.clickGoLiveBtnTimeStamp);
        parcel.writeString(this.pcsTrackContext);
        HashMap<String, String> map = this.extra;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public PcsServicePlusOptinPageParams() {
        this("", "", "", 0L, "", new HashMap());
    }

    public final String getAnchorId() {
        return this.anchorId;
    }

    public final long getClickGoLiveBtnTimeStamp() {
        return this.clickGoLiveBtnTimeStamp;
    }

    public final HashMap<String, String> getExtra() {
        return this.extra;
    }

    public final String getPcsTrackContext() {
        return this.pcsTrackContext;
    }

    public final String getSecAnchorId() {
        return this.secAnchorId;
    }

    public final String getShowEntrance() {
        return this.showEntrance;
    }

    public final void setAnchorId(String str) {
        this.anchorId = str;
    }

    public final void setClickGoLiveBtnTimeStamp(long j) {
        this.clickGoLiveBtnTimeStamp = j;
    }

    public final void setExtra(HashMap<String, String> map) {
        this.extra = map;
    }

    public final void setPcsTrackContext(String str) {
        this.pcsTrackContext = str;
    }

    public final void setSecAnchorId(String str) {
        this.secAnchorId = str;
    }

    public final void setShowEntrance(String str) {
        this.showEntrance = str;
    }

    public PcsServicePlusOptinPageParams(String str, String str2, String str3, long j, String str4, HashMap<String, String> map) {
        this.anchorId = str;
        this.secAnchorId = str2;
        this.showEntrance = str3;
        this.clickGoLiveBtnTimeStamp = j;
        this.pcsTrackContext = str4;
        this.extra = map;
    }
}
