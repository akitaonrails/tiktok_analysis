package com.ss.android.ugc.aweme.creative.model.edit;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PhotoTemplateAsset implements Parcelable, Serializable {
    public static final Parcelable.Creator<PhotoTemplateAsset> CREATOR = new Parcelable.Creator<PhotoTemplateAsset>() { // from class: X.0mr4
        @Override // android.os.Parcelable.Creator
        public final PhotoTemplateAsset createFromParcel(Parcel parcel) {
            boolean z;
            Asset asset = (Asset) parcel.readParcelable(PhotoTemplateAsset.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new PhotoTemplateAsset(asset, string, z, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoTemplateAsset[] newArray(int i) {
            return new PhotoTemplateAsset[i];
        }
    };

    @C040H
    public final String aiTaskId;

    @C09CT("asset")
    public final Asset asset;

    @C09CT("generate_new_image")
    public final boolean generateNewImage;

    @C040H
    public final String operationTaskId;

    @C09CT("prop_id")
    public final String propId;

    @C09CT("resource_path")
    public String resourcePath;

    public PhotoTemplateAsset() {
        this(null, null, false, null, null, null);
    }

    public final PhotoTemplateAsset copy(Asset asset, String str, boolean z, String str2, String str3, String str4) {
        return new PhotoTemplateAsset(asset, str, z, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoTemplateAsset)) {
            return false;
        }
        PhotoTemplateAsset photoTemplateAsset = (PhotoTemplateAsset) obj;
        return Intrinsics.LJFF(this.asset, photoTemplateAsset.asset) && Intrinsics.LJFF(this.resourcePath, photoTemplateAsset.resourcePath) && this.generateNewImage == photoTemplateAsset.generateNewImage && Intrinsics.LJFF(this.propId, photoTemplateAsset.propId) && Intrinsics.LJFF(this.aiTaskId, photoTemplateAsset.aiTaskId) && Intrinsics.LJFF(this.operationTaskId, photoTemplateAsset.operationTaskId);
    }

    public int hashCode() {
        Asset asset = this.asset;
        int iHashCode = (asset == null ? 0 : asset.hashCode()) * 31;
        String str = this.resourcePath;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.generateNewImage)) * 31;
        String str2 = this.propId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.aiTaskId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.operationTaskId;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoTemplateAsset(asset=");
        sbLIZ.append(this.asset);
        sbLIZ.append(", resourcePath=");
        sbLIZ.append(this.resourcePath);
        sbLIZ.append(", generateNewImage=");
        sbLIZ.append(this.generateNewImage);
        sbLIZ.append(", propId=");
        sbLIZ.append(this.propId);
        sbLIZ.append(", aiTaskId=");
        sbLIZ.append(this.aiTaskId);
        sbLIZ.append(", operationTaskId=");
        sbLIZ.append(this.operationTaskId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.asset, i);
        parcel.writeString(this.resourcePath);
        parcel.writeInt(this.generateNewImage ? 1 : 0);
        parcel.writeString(this.propId);
        parcel.writeString(this.aiTaskId);
        parcel.writeString(this.operationTaskId);
    }

    public final String getAiTaskId() {
        return this.aiTaskId;
    }

    public final Asset getAsset() {
        return this.asset;
    }

    public final boolean getGenerateNewImage() {
        return this.generateNewImage;
    }

    public final String getOperationTaskId() {
        return this.operationTaskId;
    }

    public final String getPropId() {
        return this.propId;
    }

    public final String getResourcePath() {
        return this.resourcePath;
    }

    public final void setResourcePath(String str) {
        this.resourcePath = str;
    }

    public PhotoTemplateAsset(Asset asset, String str, boolean z, String str2, String str3, String str4) {
        this.asset = asset;
        this.resourcePath = str;
        this.generateNewImage = z;
        this.propId = str2;
        this.aiTaskId = str3;
        this.operationTaskId = str4;
    }
}
