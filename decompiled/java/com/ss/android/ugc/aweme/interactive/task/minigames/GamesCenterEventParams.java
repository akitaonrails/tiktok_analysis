package com.ss.android.ugc.aweme.interactive.task.minigames;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.interactive.task.minigames.GamesCenterEventParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class GamesCenterEventParams implements Parcelable {
    public String enterFrom;
    public final String enterMethod;
    public final Integer followStatus;
    public static final Parcelable.Creator<GamesCenterEventParams> CREATOR = new Parcelable.Creator<GamesCenterEventParams>() { // from class: X.0Zlq
        @Override // android.os.Parcelable.Creator
        public final GamesCenterEventParams createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new GamesCenterEventParams(string, string2, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final GamesCenterEventParams[] newArray(int i) {
            return new GamesCenterEventParams[i];
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
        if (!(obj instanceof GamesCenterEventParams)) {
            return false;
        }
        GamesCenterEventParams gamesCenterEventParams = (GamesCenterEventParams) obj;
        return Intrinsics.LJFF(this.enterFrom, gamesCenterEventParams.enterFrom) && Intrinsics.LJFF(this.enterMethod, gamesCenterEventParams.enterMethod) && Intrinsics.LJFF(this.followStatus, gamesCenterEventParams.followStatus);
    }

    public final int hashCode() {
        int iHashCode = ((this.enterFrom.hashCode() * 31) + this.enterMethod.hashCode()) * 31;
        Integer num = this.followStatus;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GamesCenterEventParams(enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.followStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
        Integer num = this.followStatus;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public GamesCenterEventParams(String str, String str2, Integer num) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.followStatus = num;
    }
}
