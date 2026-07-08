package com.ss.android.ugc.aweme.mvtheme;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.mvtheme.MVTransitionParam;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class MVTransitionParam implements Serializable, Parcelable {
    public static final Parcelable.Creator<MVTransitionParam> CREATOR = new Parcelable.Creator<MVTransitionParam>() { // from class: X.0Mbn
        @Override // android.os.Parcelable.Creator
        public final MVTransitionParam createFromParcel(Parcel parcel) {
            Long lValueOf;
            boolean z;
            String string = parcel.readString();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new MVTransitionParam(string, lValueOf, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MVTransitionParam[] newArray(int i) {
            return new MVTransitionParam[i];
        }
    };

    @C09CT("trans_dur")
    public final Long duration;

    @C09CT("effect_id")
    public final String effectId;

    @C09CT("is_overlap")
    public final Boolean isOverlap;

    @C09CT("mv_transition_path")
    public final String transitionPath;

    public final MVTransitionParam copy(String str, Long l, Boolean bool, String str2) {
        return new MVTransitionParam(str, l, bool, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MVTransitionParam)) {
            return false;
        }
        MVTransitionParam mVTransitionParam = (MVTransitionParam) obj;
        return Intrinsics.LJFF(this.transitionPath, mVTransitionParam.transitionPath) && Intrinsics.LJFF(this.duration, mVTransitionParam.duration) && Intrinsics.LJFF(this.isOverlap, mVTransitionParam.isOverlap) && Intrinsics.LJFF(this.effectId, mVTransitionParam.effectId);
    }

    public int hashCode() {
        String str = this.transitionPath;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.duration;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.isOverlap;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.effectId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MVTransitionParam(transitionPath=");
        sbLIZ.append(this.transitionPath);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", isOverlap=");
        sbLIZ.append(this.isOverlap);
        sbLIZ.append(", effectId=");
        sbLIZ.append(this.effectId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.transitionPath);
        Long l = this.duration;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool = this.isOverlap;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.effectId);
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getTransitionPath() {
        return this.transitionPath;
    }

    public final Boolean isOverlap() {
        return this.isOverlap;
    }

    public MVTransitionParam(String str, Long l, Boolean bool, String str2) {
        this.transitionPath = str;
        this.duration = l;
        this.isOverlap = bool;
        this.effectId = str2;
    }
}
