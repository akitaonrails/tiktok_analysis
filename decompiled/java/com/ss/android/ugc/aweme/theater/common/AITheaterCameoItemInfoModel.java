package com.ss.android.ugc.aweme.theater.common;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.theater.common.AITheaterCameoImageModel;
import com.ss.android.ugc.aweme.theater.common.AITheaterCameoItemInfoModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AITheaterCameoItemInfoModel implements Serializable, Parcelable {
    public static final Parcelable.Creator<AITheaterCameoItemInfoModel> CREATOR = new Parcelable.Creator<AITheaterCameoItemInfoModel>() { // from class: X.02yl
        @Override // android.os.Parcelable.Creator
        public final AITheaterCameoItemInfoModel createFromParcel(Parcel parcel) {
            AITheaterCameoImageModel aITheaterCameoImageModelCreateFromParcel;
            boolean z;
            String string = parcel.readString();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                aITheaterCameoImageModelCreateFromParcel = null;
            } else {
                aITheaterCameoImageModelCreateFromParcel = AITheaterCameoImageModel.CREATOR.createFromParcel(parcel);
            }
            AITheaterCameoImageModel aITheaterCameoImageModel = aITheaterCameoImageModelCreateFromParcel;
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new AITheaterCameoItemInfoModel(string, aITheaterCameoImageModel, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AITheaterCameoItemInfoModel[] newArray(int i) {
            return new AITheaterCameoItemInfoModel[i];
        }
    };

    @C09CT("cameo_id")
    public final String cameoId;

    @C09CT("cameo_image")
    public final AITheaterCameoImageModel cameoImage;

    @C09CT("deleted")
    public final Boolean deleted;

    public AITheaterCameoItemInfoModel() {
        this(null, null, null);
    }

    public final AITheaterCameoItemInfoModel copy(String str, AITheaterCameoImageModel aITheaterCameoImageModel, Boolean bool) {
        return new AITheaterCameoItemInfoModel(str, aITheaterCameoImageModel, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITheaterCameoItemInfoModel)) {
            return false;
        }
        AITheaterCameoItemInfoModel aITheaterCameoItemInfoModel = (AITheaterCameoItemInfoModel) obj;
        return Intrinsics.LJFF(this.cameoId, aITheaterCameoItemInfoModel.cameoId) && Intrinsics.LJFF(this.cameoImage, aITheaterCameoItemInfoModel.cameoImage) && Intrinsics.LJFF(this.deleted, aITheaterCameoItemInfoModel.deleted);
    }

    public int hashCode() {
        String str = this.cameoId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AITheaterCameoImageModel aITheaterCameoImageModel = this.cameoImage;
        int iHashCode2 = (iHashCode + (aITheaterCameoImageModel == null ? 0 : aITheaterCameoImageModel.hashCode())) * 31;
        Boolean bool = this.deleted;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterCameoItemInfoModel(cameoId=");
        sbLIZ.append(this.cameoId);
        sbLIZ.append(", cameoImage=");
        sbLIZ.append(this.cameoImage);
        sbLIZ.append(", deleted=");
        sbLIZ.append(this.deleted);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cameoId);
        AITheaterCameoImageModel aITheaterCameoImageModel = this.cameoImage;
        if (aITheaterCameoImageModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aITheaterCameoImageModel.writeToParcel(parcel, i);
        }
        Boolean bool = this.deleted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public final String getCameoId() {
        return this.cameoId;
    }

    public final AITheaterCameoImageModel getCameoImage() {
        return this.cameoImage;
    }

    public final Boolean getDeleted() {
        return this.deleted;
    }

    public AITheaterCameoItemInfoModel(String str, AITheaterCameoImageModel aITheaterCameoImageModel, Boolean bool) {
        this.cameoId = str;
        this.cameoImage = aITheaterCameoImageModel;
        this.deleted = bool;
    }
}
