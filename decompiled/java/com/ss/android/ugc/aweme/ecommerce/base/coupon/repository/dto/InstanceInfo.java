package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InstanceInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class InstanceInfo implements Parcelable, Serializable {

    @C09CT("instance_key")
    public String instanceKey;
    public static final Parcelable.Creator<InstanceInfo> CREATOR = new Parcelable.Creator<InstanceInfo>() { // from class: X.02le
        @Override // android.os.Parcelable.Creator
        public final InstanceInfo createFromParcel(Parcel parcel) {
            return new InstanceInfo(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InstanceInfo[] newArray(int i) {
            return new InstanceInfo[i];
        }
    };
    public static final int $stable = 8;

    public InstanceInfo() {
        this(null);
    }

    public final InstanceInfo copy(String str) {
        return new InstanceInfo(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstanceInfo) && Intrinsics.LJFF(this.instanceKey, ((InstanceInfo) obj).instanceKey);
    }

    public int hashCode() {
        String str = this.instanceKey;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InstanceInfo(instanceKey=");
        sbLIZ.append(this.instanceKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.instanceKey);
    }

    public final String getInstanceKey() {
        return this.instanceKey;
    }

    public InstanceInfo(String str) {
        this.instanceKey = str;
    }
}
