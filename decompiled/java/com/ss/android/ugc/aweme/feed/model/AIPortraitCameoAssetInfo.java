package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AIPortraitCameoAssetInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<AIPortraitCameoAssetInfo> CREATOR = new Creator();

    @C09CT("cameo_id")
    public String cameoId;

    @C09CT("cameo_image")
    public UrlStruct cameoImage;

    public static final class Creator implements Parcelable.Creator<AIPortraitCameoAssetInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AIPortraitCameoAssetInfo createFromParcel(Parcel parcel) {
            return new AIPortraitCameoAssetInfo(parcel.readString(), parcel.readInt() == 0 ? null : UrlStruct.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AIPortraitCameoAssetInfo[] newArray(int i) {
            return new AIPortraitCameoAssetInfo[i];
        }
    }

    public AIPortraitCameoAssetInfo() {
        this(null, null);
    }

    public final AIPortraitCameoAssetInfo copy(String str, UrlStruct urlStruct) {
        return new AIPortraitCameoAssetInfo(str, urlStruct);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitCameoAssetInfo)) {
            return false;
        }
        AIPortraitCameoAssetInfo aIPortraitCameoAssetInfo = (AIPortraitCameoAssetInfo) obj;
        return Intrinsics.LJFF(this.cameoId, aIPortraitCameoAssetInfo.cameoId) && Intrinsics.LJFF(this.cameoImage, aIPortraitCameoAssetInfo.cameoImage);
    }

    public int hashCode() {
        String str = this.cameoId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UrlStruct urlStruct = this.cameoImage;
        return iHashCode + (urlStruct != null ? urlStruct.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitCameoAssetInfo(cameoId=");
        sbLIZ.append(this.cameoId);
        sbLIZ.append(", cameoImage=");
        sbLIZ.append(this.cameoImage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cameoId);
        UrlStruct urlStruct = this.cameoImage;
        if (urlStruct == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            urlStruct.writeToParcel(parcel, i);
        }
    }

    public final String getCameoId() {
        return this.cameoId;
    }

    public final UrlStruct getCameoImage() {
        return this.cameoImage;
    }

    public AIPortraitCameoAssetInfo(String str, UrlStruct urlStruct) {
        this.cameoId = str;
        this.cameoImage = urlStruct;
    }
}
