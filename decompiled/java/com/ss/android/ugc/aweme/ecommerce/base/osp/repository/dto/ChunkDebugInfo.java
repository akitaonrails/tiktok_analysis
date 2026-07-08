package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChunkDebugInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ChunkDebugInfo implements Parcelable {

    @C09CT("chunk_time_cost")
    public final Long costTime;
    public static final Parcelable.Creator<ChunkDebugInfo> CREATOR = new Parcelable.Creator<ChunkDebugInfo>() { // from class: X.02rb
        @Override // android.os.Parcelable.Creator
        public final ChunkDebugInfo createFromParcel(Parcel parcel) {
            Long lValueOf;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new ChunkDebugInfo(lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ChunkDebugInfo[] newArray(int i) {
            return new ChunkDebugInfo[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChunkDebugInfo) && Intrinsics.LJFF(this.costTime, ((ChunkDebugInfo) obj).costTime);
    }

    public final int hashCode() {
        Long l = this.costTime;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChunkDebugInfo(costTime=");
        sbLIZ.append(this.costTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.costTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public ChunkDebugInfo(Long l) {
        this.costTime = l;
    }
}
