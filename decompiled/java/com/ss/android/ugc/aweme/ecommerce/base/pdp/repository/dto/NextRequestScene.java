package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NextRequestScene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class NextRequestScene implements Parcelable {

    @C09CT("scene_key")
    public Integer sceneKey;

    @C09CT("scene_value")
    public String sceneValue;
    public static final Parcelable.Creator<NextRequestScene> CREATOR = new Parcelable.Creator<NextRequestScene>() { // from class: X.02o9
        @Override // android.os.Parcelable.Creator
        public final NextRequestScene createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new NextRequestScene(numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NextRequestScene[] newArray(int i) {
            return new NextRequestScene[i];
        }
    };
    public static final int $stable = 8;

    public NextRequestScene() {
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
        if (!(obj instanceof NextRequestScene)) {
            return false;
        }
        NextRequestScene nextRequestScene = (NextRequestScene) obj;
        return Intrinsics.LJFF(this.sceneKey, nextRequestScene.sceneKey) && Intrinsics.LJFF(this.sceneValue, nextRequestScene.sceneValue);
    }

    public final int hashCode() {
        Integer num = this.sceneKey;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.sceneValue;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NextRequestScene(sceneKey=");
        sbLIZ.append(this.sceneKey);
        sbLIZ.append(", sceneValue=");
        sbLIZ.append(this.sceneValue);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.sceneKey;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.sceneValue);
    }

    public NextRequestScene(Integer num, String str) {
        this.sceneKey = num;
        this.sceneValue = str;
    }
}
