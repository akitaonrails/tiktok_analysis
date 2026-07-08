package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.PropFromGroupModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PropFromGroupModel implements Parcelable {
    public static final Parcelable.Creator<PropFromGroupModel> CREATOR = new Parcelable.Creator<PropFromGroupModel>() { // from class: X.0naJ
        @Override // android.os.Parcelable.Creator
        public final PropFromGroupModel createFromParcel(Parcel parcel) {
            return new PropFromGroupModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PropFromGroupModel[] newArray(int i) {
            return new PropFromGroupModel[i];
        }
    };

    @C09CT("from_group_id_prop_list")
    public final String fromGroupIdPropList;

    @C09CT("from_group_id_prop_resource_list")
    public final String fromGroupIdPropResourceList;

    @C09CT("from_prop_id")
    public final String fromPropId;

    @C09CT("from_prop_resource_id")
    public final String fromPropResourceId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PropFromGroupModel)) {
            return false;
        }
        PropFromGroupModel propFromGroupModel = (PropFromGroupModel) obj;
        return Intrinsics.LJFF(this.fromPropId, propFromGroupModel.fromPropId) && Intrinsics.LJFF(this.fromPropResourceId, propFromGroupModel.fromPropResourceId) && Intrinsics.LJFF(this.fromGroupIdPropList, propFromGroupModel.fromGroupIdPropList) && Intrinsics.LJFF(this.fromGroupIdPropResourceList, propFromGroupModel.fromGroupIdPropResourceList);
    }

    public final int hashCode() {
        return (((((this.fromPropId.hashCode() * 31) + this.fromPropResourceId.hashCode()) * 31) + this.fromGroupIdPropList.hashCode()) * 31) + this.fromGroupIdPropResourceList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PropFromGroupModel(fromPropId=");
        sbLIZ.append(this.fromPropId);
        sbLIZ.append(", fromPropResourceId=");
        sbLIZ.append(this.fromPropResourceId);
        sbLIZ.append(", fromGroupIdPropList=");
        sbLIZ.append(this.fromGroupIdPropList);
        sbLIZ.append(", fromGroupIdPropResourceList=");
        sbLIZ.append(this.fromGroupIdPropResourceList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fromPropId);
        parcel.writeString(this.fromPropResourceId);
        parcel.writeString(this.fromGroupIdPropList);
        parcel.writeString(this.fromGroupIdPropResourceList);
    }

    public PropFromGroupModel() {
        this("", "", "", "");
    }

    public static PropFromGroupModel LIZ(PropFromGroupModel propFromGroupModel, String str) {
        String str2 = propFromGroupModel.fromPropId;
        String str3 = propFromGroupModel.fromGroupIdPropList;
        String str4 = propFromGroupModel.fromGroupIdPropResourceList;
        propFromGroupModel.getClass();
        return new PropFromGroupModel(str2, str, str3, str4);
    }

    public PropFromGroupModel(String str, String str2, String str3, String str4) {
        this.fromPropId = str;
        this.fromPropResourceId = str2;
        this.fromGroupIdPropList = str3;
        this.fromGroupIdPropResourceList = str4;
    }
}
