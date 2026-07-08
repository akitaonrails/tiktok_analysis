package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CelebrationInfo implements Serializable, Parcelable {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer celebration_status;

    @C09CT("placement_scene")
    public final String placement_scene;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<CelebrationInfo> CREATOR = new Creator();

    public static final class Companion {
    }

    public static final class Creator implements Parcelable.Creator<CelebrationInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CelebrationInfo createFromParcel(Parcel parcel) {
            return new CelebrationInfo(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CelebrationInfo[] newArray(int i) {
            return new CelebrationInfo[i];
        }
    }

    public CelebrationInfo() {
        this(null, null);
    }

    public final CelebrationInfo copy(String str, Integer num) {
        return new CelebrationInfo(str, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CelebrationInfo)) {
            return false;
        }
        CelebrationInfo celebrationInfo = (CelebrationInfo) obj;
        return Intrinsics.LJFF(this.placement_scene, celebrationInfo.placement_scene) && Intrinsics.LJFF(this.celebration_status, celebrationInfo.celebration_status);
    }

    public int hashCode() {
        String str = this.placement_scene;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.celebration_status;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CelebrationInfo(placement_scene=");
        sbLIZ.append(this.placement_scene);
        sbLIZ.append(", celebration_status=");
        sbLIZ.append(this.celebration_status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.placement_scene);
        Integer num = this.celebration_status;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public final boolean isInActivity() {
        Integer num = this.celebration_status;
        return num != null && num.intValue() == 1;
    }

    public final Integer getCelebration_status() {
        return this.celebration_status;
    }

    public final String getPlacement_scene() {
        return this.placement_scene;
    }

    public CelebrationInfo(String str, Integer num) {
        this.placement_scene = str;
        this.celebration_status = num;
    }
}
