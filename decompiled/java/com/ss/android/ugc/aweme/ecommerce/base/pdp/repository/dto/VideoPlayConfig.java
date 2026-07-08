package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VideoPlayConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class VideoPlayConfig implements Parcelable {

    @C09CT("end_loop_time")
    public final Long endLoopTime;

    @C09CT("loop")
    public final Boolean loop;

    @C09CT("mute")
    public final Boolean mute;

    @C09CT("start_loop_time")
    public final Long startLoopTime;
    public static final Parcelable.Creator<VideoPlayConfig> CREATOR = new Parcelable.Creator<VideoPlayConfig>() { // from class: X.0vU5
        @Override // android.os.Parcelable.Creator
        public final VideoPlayConfig createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Long lValueOf;
            boolean z2 = true;
            Long lValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            return new VideoPlayConfig(boolValueOf, boolValueOf2, lValueOf, lValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoPlayConfig[] newArray(int i) {
            return new VideoPlayConfig[i];
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
        if (!(obj instanceof VideoPlayConfig)) {
            return false;
        }
        VideoPlayConfig videoPlayConfig = (VideoPlayConfig) obj;
        return Intrinsics.LJFF(this.mute, videoPlayConfig.mute) && Intrinsics.LJFF(this.loop, videoPlayConfig.loop) && Intrinsics.LJFF(this.startLoopTime, videoPlayConfig.startLoopTime) && Intrinsics.LJFF(this.endLoopTime, videoPlayConfig.endLoopTime);
    }

    public final int hashCode() {
        Boolean bool = this.mute;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.loop;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.startLoopTime;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endLoopTime;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoPlayConfig(mute=");
        sbLIZ.append(this.mute);
        sbLIZ.append(", loop=");
        sbLIZ.append(this.loop);
        sbLIZ.append(", startLoopTime=");
        sbLIZ.append(this.startLoopTime);
        sbLIZ.append(", endLoopTime=");
        sbLIZ.append(this.endLoopTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.mute;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.loop;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Long l = this.startLoopTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.endLoopTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public VideoPlayConfig(Boolean bool, Boolean bool2, Long l, Long l2) {
        this.mute = bool;
        this.loop = bool2;
        this.startLoopTime = l;
        this.endLoopTime = l2;
    }
}
