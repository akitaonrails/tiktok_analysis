package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AIDubbing;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AIDubbing implements Parcelable, Serializable {
    public static final Parcelable.Creator<AIDubbing> CREATOR = new Parcelable.Creator<AIDubbing>() { // from class: X.0mo4
        @Override // android.os.Parcelable.Creator
        public final AIDubbing createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf = null;
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
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new AIDubbing(boolValueOf, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AIDubbing[] newArray(int i) {
            return new AIDubbing[i];
        }
    };

    @C09CT("enable_video_ai_translate")
    public Boolean enableVideoAIDubbing;

    @C09CT("enable_video_ai_translate_type")
    public Integer enableVideoAIDubbingType;

    public AIDubbing() {
        this(null, null);
    }

    public final AIDubbing copy(Boolean bool, Integer num) {
        return new AIDubbing(bool, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIDubbing)) {
            return false;
        }
        AIDubbing aIDubbing = (AIDubbing) obj;
        return Intrinsics.LJFF(this.enableVideoAIDubbing, aIDubbing.enableVideoAIDubbing) && Intrinsics.LJFF(this.enableVideoAIDubbingType, aIDubbing.enableVideoAIDubbingType);
    }

    public int hashCode() {
        Boolean bool = this.enableVideoAIDubbing;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.enableVideoAIDubbingType;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIDubbing(enableVideoAIDubbing=");
        sbLIZ.append(this.enableVideoAIDubbing);
        sbLIZ.append(", enableVideoAIDubbingType=");
        sbLIZ.append(this.enableVideoAIDubbingType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.enableVideoAIDubbing;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.enableVideoAIDubbingType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public final Boolean getEnableVideoAIDubbing() {
        return this.enableVideoAIDubbing;
    }

    public final Integer getEnableVideoAIDubbingType() {
        return this.enableVideoAIDubbingType;
    }

    public final void setEnableVideoAIDubbing(Boolean bool) {
        this.enableVideoAIDubbing = bool;
    }

    public final void setEnableVideoAIDubbingType(Integer num) {
        this.enableVideoAIDubbingType = num;
    }

    public AIDubbing(Boolean bool, Integer num) {
        this.enableVideoAIDubbing = bool;
        this.enableVideoAIDubbingType = num;
    }
}
