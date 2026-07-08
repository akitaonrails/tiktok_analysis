package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.aigc.asynctask.net.Scope;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Scope implements Parcelable {

    @C09CT("business")
    public final Integer business;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    @C09CT("tenant")
    public final String tenant;
    public static final Parcelable.Creator<Scope> CREATOR = new Parcelable.Creator<Scope>() { // from class: X.0LuY
        @Override // android.os.Parcelable.Creator
        public final Scope createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new Scope(string, numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final Scope[] newArray(int i) {
            return new Scope[i];
        }
    };
    public static final int $stable = 8;

    public Scope() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        Scope scope = (Scope) obj;
        return Intrinsics.LJFF(this.tenant, scope.tenant) && Intrinsics.LJFF(this.business, scope.business) && Intrinsics.LJFF(this.scene, scope.scene);
    }

    public final int hashCode() {
        String str = this.tenant;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.business;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.scene;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scope(tenant=");
        sbLIZ.append(this.tenant);
        sbLIZ.append(", business=");
        sbLIZ.append(this.business);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tenant);
        Integer num = this.business;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.scene;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public Scope(String str, Integer num, Integer num2) {
        this.tenant = str;
        this.business = num;
        this.scene = num2;
    }
}
