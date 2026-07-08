package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.DebugResult;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class NetworkResponse<T> implements Parcelable {

    @C09CT("block_reload")
    public boolean blockReload;

    @C09CT("data")
    public final T data;

    @C09CT("dataSourceDiskCache")
    public boolean dataSourceFromDiskCache;

    @C09CT("debug_result")
    public DebugResult debugResult;

    @C09CT("errorCode")
    public Integer errorCode;

    @C09CT("net_code")
    public String netCode;

    @C09CT("net_error")
    public String netError;
    public static final Parcelable.Creator<NetworkResponse<?>> CREATOR = new Parcelable.Creator<NetworkResponse<?>>() { // from class: X.0iMd
        @Override // android.os.Parcelable.Creator
        public final NetworkResponse<?> createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            Object value = parcel.readValue(NetworkResponse.class.getClassLoader());
            DebugResult debugResultCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                debugResultCreateFromParcel = DebugResult.CREATOR.createFromParcel(parcel);
            }
            DebugResult debugResult = debugResultCreateFromParcel;
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new NetworkResponse<>(value, numValueOf, z, debugResult, z2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NetworkResponse<?>[] newArray(int i) {
            return new NetworkResponse[i];
        }
    };
    public static final int $stable = 8;

    public NetworkResponse() {
        this(null, null, false, null, false, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkResponse)) {
            return false;
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        return Intrinsics.LJFF(this.data, networkResponse.data) && Intrinsics.LJFF(this.errorCode, networkResponse.errorCode) && this.dataSourceFromDiskCache == networkResponse.dataSourceFromDiskCache && Intrinsics.LJFF(this.debugResult, networkResponse.debugResult) && this.blockReload == networkResponse.blockReload && Intrinsics.LJFF(this.netCode, networkResponse.netCode) && Intrinsics.LJFF(this.netError, networkResponse.netError);
    }

    public final int hashCode() {
        T t = this.data;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        Integer num = this.errorCode;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.dataSourceFromDiskCache)) * 31;
        DebugResult debugResult = this.debugResult;
        int iHashCode3 = (((iHashCode2 + (debugResult == null ? 0 : debugResult.hashCode())) * 31) + C786410Ut5.Z2(this.blockReload)) * 31;
        String str = this.netCode;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.netError;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", dataSourceFromDiskCache=");
        sbLIZ.append(this.dataSourceFromDiskCache);
        sbLIZ.append(", debugResult=");
        sbLIZ.append(this.debugResult);
        sbLIZ.append(", blockReload=");
        sbLIZ.append(this.blockReload);
        sbLIZ.append(", netCode=");
        sbLIZ.append(this.netCode);
        sbLIZ.append(", netError=");
        sbLIZ.append(this.netError);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.data);
        Integer num = this.errorCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.dataSourceFromDiskCache ? 1 : 0);
        DebugResult debugResult = this.debugResult;
        if (debugResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            debugResult.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.blockReload ? 1 : 0);
        parcel.writeString(this.netCode);
        parcel.writeString(this.netError);
    }

    public NetworkResponse(T t, Integer num, boolean z, DebugResult debugResult, boolean z2, String str, String str2) {
        this.data = t;
        this.errorCode = num;
        this.dataSourceFromDiskCache = z;
        this.debugResult = debugResult;
        this.blockReload = z2;
        this.netCode = str;
        this.netError = str2;
    }
}
