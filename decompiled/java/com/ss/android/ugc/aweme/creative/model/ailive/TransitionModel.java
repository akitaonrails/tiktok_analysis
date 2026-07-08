package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ailive.TransitionModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TransitionModel implements Parcelable {
    public static final Parcelable.Creator<TransitionModel> CREATOR = new Parcelable.Creator<TransitionModel>() { // from class: X.0MCO
        @Override // android.os.Parcelable.Creator
        public final TransitionModel createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new TransitionModel(string, string2, string3, z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TransitionModel[] newArray(int i) {
            return new TransitionModel[i];
        }
    };

    @C09CT("effect_id")
    public String effectId;

    @C09CT("is_overlap")
    public boolean isOverlap;

    @C09CT("name")
    public String name;

    @InterfaceC2270908v5
    @C09CT("unzip_path")
    public String path;

    @C09CT("resource_id")
    public String resourceId;

    public TransitionModel() {
        this(null, null, null, true, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionModel)) {
            return false;
        }
        TransitionModel transitionModel = (TransitionModel) obj;
        return Intrinsics.LJFF(this.resourceId, transitionModel.resourceId) && Intrinsics.LJFF(this.effectId, transitionModel.effectId) && Intrinsics.LJFF(this.name, transitionModel.name) && this.isOverlap == transitionModel.isOverlap && Intrinsics.LJFF(this.path, transitionModel.path);
    }

    public final int hashCode() {
        String str = this.resourceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.effectId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Z2(this.isOverlap)) * 31;
        String str4 = this.path;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TransitionModel(resourceId=");
        sbLIZ.append(this.resourceId);
        sbLIZ.append(", effectId=");
        sbLIZ.append(this.effectId);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", isOverlap=");
        sbLIZ.append(this.isOverlap);
        sbLIZ.append(", path=");
        sbLIZ.append(this.path);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.resourceId);
        parcel.writeString(this.effectId);
        parcel.writeString(this.name);
        parcel.writeInt(this.isOverlap ? 1 : 0);
        parcel.writeString(this.path);
    }

    public TransitionModel(String str, String str2, String str3, boolean z, String str4) {
        this.resourceId = str;
        this.effectId = str2;
        this.name = str3;
        this.isOverlap = z;
        this.path = str4;
    }
}
