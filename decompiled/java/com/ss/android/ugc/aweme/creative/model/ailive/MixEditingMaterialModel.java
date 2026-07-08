package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.ailive.MixEditingMaterialModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectMethodType;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MixEditingMaterialModel implements Parcelable {
    public static final Parcelable.Creator<MixEditingMaterialModel> CREATOR = new Parcelable.Creator<MixEditingMaterialModel>() { // from class: X.0mrY
        @Override // android.os.Parcelable.Creator
        public final MixEditingMaterialModel createFromParcel(Parcel parcel) {
            boolean z;
            SelectMethodType selectMethodTypeCreateFromParcel;
            boolean z2;
            MixEditingMaterialType mixEditingMaterialTypeCreateFromParcel = MixEditingMaterialType.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            Asset asset = (Asset) parcel.readParcelable(MixEditingMaterialModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string2 = parcel.readString();
            Parcelable.Creator<SelectMethodType> creator = SelectMethodType.CREATOR;
            SelectMethodType selectMethodTypeCreateFromParcel2 = creator.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                selectMethodTypeCreateFromParcel = null;
            } else {
                selectMethodTypeCreateFromParcel = creator.createFromParcel(parcel);
            }
            SelectMethodType selectMethodType = selectMethodTypeCreateFromParcel;
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new MixEditingMaterialModel(mixEditingMaterialTypeCreateFromParcel, string, urlModel, asset, z, string2, selectMethodTypeCreateFromParcel2, selectMethodType, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final MixEditingMaterialModel[] newArray(int i) {
            return new MixEditingMaterialModel[i];
        }
    };

    @C09CT("from_recommend")
    public boolean fromRecommend;

    @C09CT("icon")
    public final UrlModel icon;

    @C09CT("inserted_mob_as_mix_material")
    public boolean insertedMobAsMixMaterial;

    @C09CT("item_click_from")
    public String itemClickFrom;

    @C09CT("manual_select_sub_type")
    public SelectMethodType manualSelectSubType;

    @C09CT("name")
    public String name;

    @C09CT("origin_asset")
    public final Asset originAsset;

    @C09CT("select_method")
    public SelectMethodType selectMethod;

    @C09CT("type")
    public final MixEditingMaterialType type;

    public MixEditingMaterialModel() {
        this(MixEditingMaterialType.UNKNOWN_TYPE, "", null, null, true, "edit_page_mix_material", SelectMethodType.UNSELECT, null, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixEditingMaterialModel)) {
            return false;
        }
        MixEditingMaterialModel mixEditingMaterialModel = (MixEditingMaterialModel) obj;
        return this.type == mixEditingMaterialModel.type && Intrinsics.LJFF(this.name, mixEditingMaterialModel.name) && Intrinsics.LJFF(this.icon, mixEditingMaterialModel.icon) && Intrinsics.LJFF(this.originAsset, mixEditingMaterialModel.originAsset) && this.fromRecommend == mixEditingMaterialModel.fromRecommend && Intrinsics.LJFF(this.itemClickFrom, mixEditingMaterialModel.itemClickFrom) && this.selectMethod == mixEditingMaterialModel.selectMethod && this.manualSelectSubType == mixEditingMaterialModel.manualSelectSubType && this.insertedMobAsMixMaterial == mixEditingMaterialModel.insertedMobAsMixMaterial;
    }

    public final int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + this.name.hashCode()) * 31;
        UrlModel urlModel = this.icon;
        int iHashCode2 = (iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Asset asset = this.originAsset;
        int iHashCode3 = (((((((iHashCode2 + (asset == null ? 0 : asset.hashCode())) * 31) + C786410Ut5.Z2(this.fromRecommend)) * 31) + this.itemClickFrom.hashCode()) * 31) + this.selectMethod.hashCode()) * 31;
        SelectMethodType selectMethodType = this.manualSelectSubType;
        return ((iHashCode3 + (selectMethodType != null ? selectMethodType.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.insertedMobAsMixMaterial);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixEditingMaterialModel(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", originAsset=");
        sbLIZ.append(this.originAsset);
        sbLIZ.append(", fromRecommend=");
        sbLIZ.append(this.fromRecommend);
        sbLIZ.append(", itemClickFrom=");
        sbLIZ.append(this.itemClickFrom);
        sbLIZ.append(", selectMethod=");
        sbLIZ.append(this.selectMethod);
        sbLIZ.append(", manualSelectSubType=");
        sbLIZ.append(this.manualSelectSubType);
        sbLIZ.append(", insertedMobAsMixMaterial=");
        sbLIZ.append(this.insertedMobAsMixMaterial);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.name);
        parcel.writeSerializable(this.icon);
        parcel.writeParcelable(this.originAsset, i);
        parcel.writeInt(this.fromRecommend ? 1 : 0);
        parcel.writeString(this.itemClickFrom);
        this.selectMethod.writeToParcel(parcel, i);
        SelectMethodType selectMethodType = this.manualSelectSubType;
        if (selectMethodType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectMethodType.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.insertedMobAsMixMaterial ? 1 : 0);
    }

    public MixEditingMaterialModel(MixEditingMaterialType mixEditingMaterialType, String str, UrlModel urlModel, Asset asset, boolean z, String str2, SelectMethodType selectMethodType, SelectMethodType selectMethodType2, boolean z2) {
        this.type = mixEditingMaterialType;
        this.name = str;
        this.icon = urlModel;
        this.originAsset = asset;
        this.fromRecommend = z;
        this.itemClickFrom = str2;
        this.selectMethod = selectMethodType;
        this.manualSelectSubType = selectMethodType2;
        this.insertedMobAsMixMaterial = z2;
    }
}
