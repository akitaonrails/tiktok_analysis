package com.ss.android.ugc.aweme.im.creative.common.api.model.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.PhotoSwapEditModel;
import com.ss.android.ugc.aweme.im.creative.common.api.navigation.TargetResolution;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PhotoSwapEditModel implements Parcelable {
    public static final Parcelable.Creator<PhotoSwapEditModel> CREATOR = new Parcelable.Creator<PhotoSwapEditModel>() { // from class: X.0ni1
        @Override // android.os.Parcelable.Creator
        public final PhotoSwapEditModel createFromParcel(Parcel parcel) {
            return new PhotoSwapEditModel(parcel.readString(), TargetResolution.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoSwapEditModel[] newArray(int i) {
            return new PhotoSwapEditModel[i];
        }
    };
    public final String photoSwapPairedMsgId;
    public final String photoSwapScene;
    public final TargetResolution targetResolution;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoSwapEditModel)) {
            return false;
        }
        PhotoSwapEditModel photoSwapEditModel = (PhotoSwapEditModel) obj;
        return Intrinsics.LJFF(this.photoSwapScene, photoSwapEditModel.photoSwapScene) && Intrinsics.LJFF(this.targetResolution, photoSwapEditModel.targetResolution) && Intrinsics.LJFF(this.photoSwapPairedMsgId, photoSwapEditModel.photoSwapPairedMsgId);
    }

    public final int hashCode() {
        int iHashCode = ((this.photoSwapScene.hashCode() * 31) + this.targetResolution.hashCode()) * 31;
        String str = this.photoSwapPairedMsgId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoSwapEditModel(photoSwapScene=");
        sbLIZ.append(this.photoSwapScene);
        sbLIZ.append(", targetResolution=");
        sbLIZ.append(this.targetResolution);
        sbLIZ.append(", photoSwapPairedMsgId=");
        sbLIZ.append(this.photoSwapPairedMsgId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.photoSwapScene);
        this.targetResolution.writeToParcel(parcel, i);
        parcel.writeString(this.photoSwapPairedMsgId);
    }

    public PhotoSwapEditModel(String str, TargetResolution targetResolution, String str2) {
        this.photoSwapScene = str;
        this.targetResolution = targetResolution;
        this.photoSwapPairedMsgId = str2;
    }
}
