package com.ss.android.ugc.aweme.image.switchmode.payload;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.image.switchmode.payload.MixEditingMaterialItemPayload;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MixEditingMaterialItemPayload implements Parcelable {
    public static final Parcelable.Creator<MixEditingMaterialItemPayload> CREATOR = new Parcelable.Creator<MixEditingMaterialItemPayload>() { // from class: X.0mqy
        @Override // android.os.Parcelable.Creator
        public final MixEditingMaterialItemPayload createFromParcel(Parcel parcel) {
            boolean z;
            MixEditingMaterialType mixEditingMaterialType = (MixEditingMaterialType) parcel.readParcelable(MixEditingMaterialItemPayload.class.getClassLoader());
            String string = parcel.readString();
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            Asset asset = (Asset) parcel.readParcelable(MixEditingMaterialItemPayload.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new MixEditingMaterialItemPayload(mixEditingMaterialType, string, urlModel, asset, z);
        }

        @Override // android.os.Parcelable.Creator
        public final MixEditingMaterialItemPayload[] newArray(int i) {
            return new MixEditingMaterialItemPayload[i];
        }
    };
    public final boolean fromRecommend;
    public final UrlModel icon;
    public String name;
    public final Asset originAsset;
    public final MixEditingMaterialType type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixEditingMaterialItemPayload)) {
            return false;
        }
        MixEditingMaterialItemPayload mixEditingMaterialItemPayload = (MixEditingMaterialItemPayload) obj;
        return this.type == mixEditingMaterialItemPayload.type && Intrinsics.LJFF(this.name, mixEditingMaterialItemPayload.name) && Intrinsics.LJFF(this.icon, mixEditingMaterialItemPayload.icon) && Intrinsics.LJFF(this.originAsset, mixEditingMaterialItemPayload.originAsset) && this.fromRecommend == mixEditingMaterialItemPayload.fromRecommend;
    }

    public final int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + this.name.hashCode()) * 31;
        UrlModel urlModel = this.icon;
        int iHashCode2 = (iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Asset asset = this.originAsset;
        return ((iHashCode2 + (asset != null ? asset.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.fromRecommend);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixEditingMaterialItemPayload(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", originAsset=");
        sbLIZ.append(this.originAsset);
        sbLIZ.append(", fromRecommend=");
        sbLIZ.append(this.fromRecommend);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.type, i);
        parcel.writeString(this.name);
        parcel.writeSerializable(this.icon);
        parcel.writeParcelable(this.originAsset, i);
        parcel.writeInt(this.fromRecommend ? 1 : 0);
    }

    public MixEditingMaterialItemPayload() {
        this(MixEditingMaterialType.UNKNOWN_TYPE, "", null, null, true);
    }

    public MixEditingMaterialItemPayload(MixEditingMaterialType mixEditingMaterialType, String str, UrlModel urlModel, Asset asset, boolean z) {
        this.type = mixEditingMaterialType;
        this.name = str;
        this.icon = urlModel;
        this.originAsset = asset;
        this.fromRecommend = z;
    }
}
