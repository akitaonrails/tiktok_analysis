package com.ss.android.ugc.aweme.minis.page.main.morepanel.model;

import X.C2188811AlT;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.page.main.morepanel.model.MinisSharePackageModel;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class MinisSharePackageModel extends ShareModel {
    public final String clientKey;
    public final Bundle extras;
    public final String shareDesc;
    public final String shareTitle;
    public final String shareUrl;
    public static final Parcelable.Creator<MinisSharePackageModel> CREATOR = new Parcelable.Creator<MinisSharePackageModel>() { // from class: X.0lyk
        @Override // android.os.Parcelable.Creator
        public final MinisSharePackageModel createFromParcel(Parcel parcel) {
            return new MinisSharePackageModel(parcel.readString(), parcel.readBundle(MinisSharePackageModel.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MinisSharePackageModel[] newArray(int i) {
            return new MinisSharePackageModel[i];
        }
    };
    public static final int $stable = 8;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisSharePackageModel)) {
            return false;
        }
        MinisSharePackageModel minisSharePackageModel = (MinisSharePackageModel) obj;
        return Intrinsics.LJFF(this.clientKey, minisSharePackageModel.clientKey) && Intrinsics.LJFF(this.shareTitle, minisSharePackageModel.shareTitle) && Intrinsics.LJFF(this.shareDesc, minisSharePackageModel.shareDesc) && Intrinsics.LJFF(this.shareUrl, minisSharePackageModel.shareUrl) && Intrinsics.LJFF(this.extras, minisSharePackageModel.extras);
    }

    public final int hashCode() {
        return (((((((this.clientKey.hashCode() * 31) + this.shareTitle.hashCode()) * 31) + this.shareDesc.hashCode()) * 31) + this.shareUrl.hashCode()) * 31) + this.extras.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisSharePackageModel(clientKey=");
        sbLIZ.append(this.clientKey);
        sbLIZ.append(", shareTitle=");
        sbLIZ.append(this.shareTitle);
        sbLIZ.append(", shareDesc=");
        sbLIZ.append(this.shareDesc);
        sbLIZ.append(", shareUrl=");
        sbLIZ.append(this.shareUrl);
        sbLIZ.append(", extras=");
        sbLIZ.append(this.extras);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.ShareModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientKey);
        parcel.writeString(this.shareTitle);
        parcel.writeString(this.shareDesc);
        parcel.writeString(this.shareUrl);
        parcel.writeBundle(this.extras);
    }

    public MinisSharePackageModel(String str, Bundle bundle, String str2, String str3, String str4) {
        super(null);
        this.clientKey = str;
        this.shareTitle = str2;
        this.shareDesc = str3;
        this.shareUrl = str4;
        this.extras = bundle;
    }
}
