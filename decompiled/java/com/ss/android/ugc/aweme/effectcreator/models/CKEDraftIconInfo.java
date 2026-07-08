package com.ss.android.ugc.aweme.effectcreator.models;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftIconAsset;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftIconInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CKEDraftIconInfo implements Parcelable {
    public static final Parcelable.Creator<CKEDraftIconInfo> CREATOR = new Parcelable.Creator<CKEDraftIconInfo>() { // from class: X.0vJE
        @Override // android.os.Parcelable.Creator
        public final CKEDraftIconInfo createFromParcel(Parcel parcel) {
            Parcelable.Creator<CKEDraftIconAsset> creator = CKEDraftIconAsset.CREATOR;
            return new CKEDraftIconInfo(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CKEDraftIconInfo[] newArray(int i) {
            return new CKEDraftIconInfo[i];
        }
    };
    public String originIconPath;
    public String placeholderIconPath;
    public final CKEDraftIconAsset primaryIconData;
    public final CKEDraftIconAsset secondaryIconData;

    /* JADX WARN: Multi-variable type inference failed */
    public CKEDraftIconInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final CKEDraftIconInfo copy(CKEDraftIconAsset cKEDraftIconAsset, CKEDraftIconAsset cKEDraftIconAsset2, String str, String str2) {
        return new CKEDraftIconInfo(cKEDraftIconAsset, cKEDraftIconAsset2, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CKEDraftIconInfo)) {
            return false;
        }
        CKEDraftIconInfo cKEDraftIconInfo = (CKEDraftIconInfo) obj;
        return Intrinsics.LJFF(this.primaryIconData, cKEDraftIconInfo.primaryIconData) && Intrinsics.LJFF(this.secondaryIconData, cKEDraftIconInfo.secondaryIconData) && Intrinsics.LJFF(this.originIconPath, cKEDraftIconInfo.originIconPath) && Intrinsics.LJFF(this.placeholderIconPath, cKEDraftIconInfo.placeholderIconPath);
    }

    public int hashCode() {
        return (((((this.primaryIconData.hashCode() * 31) + this.secondaryIconData.hashCode()) * 31) + this.originIconPath.hashCode()) * 31) + this.placeholderIconPath.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CKEDraftIconInfo(primaryIconData=");
        sbLIZ.append(this.primaryIconData);
        sbLIZ.append(", secondaryIconData=");
        sbLIZ.append(this.secondaryIconData);
        sbLIZ.append(", originIconPath=");
        sbLIZ.append(this.originIconPath);
        sbLIZ.append(", placeholderIconPath=");
        sbLIZ.append(this.placeholderIconPath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.primaryIconData.writeToParcel(parcel, i);
        this.secondaryIconData.writeToParcel(parcel, i);
        parcel.writeString(this.originIconPath);
        parcel.writeString(this.placeholderIconPath);
    }

    public final String getOriginIconPath() {
        return this.originIconPath;
    }

    public final String getPlaceholderIconPath() {
        return this.placeholderIconPath;
    }

    public final CKEDraftIconAsset getPrimaryIconData() {
        return this.primaryIconData;
    }

    public final CKEDraftIconAsset getSecondaryIconData() {
        return this.secondaryIconData;
    }

    public final void setOriginIconPath(String str) {
        this.originIconPath = str;
    }

    public final void setPlaceholderIconPath(String str) {
        this.placeholderIconPath = str;
    }

    public CKEDraftIconInfo(CKEDraftIconAsset cKEDraftIconAsset, CKEDraftIconAsset cKEDraftIconAsset2, String str, String str2) {
        this.primaryIconData = cKEDraftIconAsset;
        this.secondaryIconData = cKEDraftIconAsset2;
        this.originIconPath = str;
        this.placeholderIconPath = str2;
    }

    public /* synthetic */ CKEDraftIconInfo(CKEDraftIconAsset cKEDraftIconAsset, CKEDraftIconAsset cKEDraftIconAsset2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CKEDraftIconAsset("", "", null, null, true, 0) : cKEDraftIconAsset, (i & 2) != 0 ? new CKEDraftIconAsset("", "", null, null, true, 0) : cKEDraftIconAsset2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
    }
}
