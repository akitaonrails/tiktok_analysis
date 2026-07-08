package com.ss.android.ugc.aweme.im.message.template.service;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.service.BatchDynamicRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BatchDynamicRequest implements Parcelable {
    public static final Parcelable.Creator<BatchDynamicRequest> CREATOR = new Parcelable.Creator<BatchDynamicRequest>() { // from class: X.06Ca
        @Override // android.os.Parcelable.Creator
        public final BatchDynamicRequest createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new BatchDynamicRequest(string, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BatchDynamicRequest[] newArray(int i) {
            return new BatchDynamicRequest[i];
        }
    };
    public final String id;
    public final Integer type;

    public BatchDynamicRequest() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchDynamicRequest)) {
            return false;
        }
        BatchDynamicRequest batchDynamicRequest = (BatchDynamicRequest) obj;
        return Intrinsics.LJFF(this.id, batchDynamicRequest.id) && Intrinsics.LJFF(this.type, batchDynamicRequest.type);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.type;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchDynamicRequest(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.id);
        Integer num = this.type;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public BatchDynamicRequest(String str, Integer num) {
        this.id = str;
        this.type = num;
    }
}
