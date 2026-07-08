package com.ss.android.ugc.aweme.image.switchmode.payload;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.image.switchmode.payload.AutoCutPayload;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AutoCutPayload extends SwitchModePayload {
    public static final Parcelable.Creator<AutoCutPayload> CREATOR = new Parcelable.Creator<AutoCutPayload>() { // from class: X.0mhW
        @Override // android.os.Parcelable.Creator
        public final AutoCutPayload createFromParcel(Parcel parcel) {
            boolean z;
            ImageAlbumData imageAlbumData = (ImageAlbumData) parcel.readParcelable(AutoCutPayload.class.getClassLoader());
            AutoCutModel autoCutModel = (AutoCutModel) parcel.readParcelable(AutoCutPayload.class.getClassLoader());
            String string = parcel.readString();
            EditPreviewInfo editPreviewInfo = (EditPreviewInfo) parcel.readParcelable(AutoCutPayload.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AutoCutPayload(imageAlbumData, autoCutModel, string, editPreviewInfo, z, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoCutPayload[] newArray(int i) {
            return new AutoCutPayload[i];
        }
    };
    public final AutoCutModel autoCutModel;
    public final boolean hideIntermediateUI;
    public final ImageAlbumData imageAlbumData;
    public int livePicCut;
    public final String nle;
    public final EditPreviewInfo previewInfo;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutPayload)) {
            return false;
        }
        AutoCutPayload autoCutPayload = (AutoCutPayload) obj;
        return Intrinsics.LJFF(this.imageAlbumData, autoCutPayload.imageAlbumData) && Intrinsics.LJFF(this.autoCutModel, autoCutPayload.autoCutModel) && Intrinsics.LJFF(this.nle, autoCutPayload.nle) && Intrinsics.LJFF(this.previewInfo, autoCutPayload.previewInfo) && this.hideIntermediateUI == autoCutPayload.hideIntermediateUI && this.livePicCut == autoCutPayload.livePicCut;
    }

    public final int hashCode() {
        ImageAlbumData imageAlbumData = this.imageAlbumData;
        int iHashCode = (imageAlbumData == null ? 0 : imageAlbumData.hashCode()) * 31;
        AutoCutModel autoCutModel = this.autoCutModel;
        int iHashCode2 = (iHashCode + (autoCutModel == null ? 0 : autoCutModel.hashCode())) * 31;
        String str = this.nle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        EditPreviewInfo editPreviewInfo = this.previewInfo;
        return ((((iHashCode3 + (editPreviewInfo != null ? editPreviewInfo.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.hideIntermediateUI)) * 31) + this.livePicCut;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutPayload(imageAlbumData=");
        sbLIZ.append(this.imageAlbumData);
        sbLIZ.append(", autoCutModel=");
        sbLIZ.append(this.autoCutModel);
        sbLIZ.append(", nle=");
        sbLIZ.append(this.nle);
        sbLIZ.append(", previewInfo=");
        sbLIZ.append(this.previewInfo);
        sbLIZ.append(", hideIntermediateUI=");
        sbLIZ.append(this.hideIntermediateUI);
        sbLIZ.append(", livePicCut=");
        sbLIZ.append(this.livePicCut);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.imageAlbumData, i);
        parcel.writeParcelable(this.autoCutModel, i);
        parcel.writeString(this.nle);
        parcel.writeParcelable(this.previewInfo, i);
        parcel.writeInt(this.hideIntermediateUI ? 1 : 0);
        parcel.writeInt(this.livePicCut);
    }

    @Override // com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload
    public final boolean LIZ() {
        return this.hideIntermediateUI;
    }

    @Override // com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload
    public final int LIZIZ() {
        return this.livePicCut;
    }

    @Override // com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload
    public final void LIZJ(int i) {
        this.livePicCut = i;
    }

    public AutoCutPayload(ImageAlbumData imageAlbumData, AutoCutModel autoCutModel, String str, EditPreviewInfo editPreviewInfo, boolean z, int i) {
        super(SwitchModePayloadType.AUTO_CUT_SELECTED, z, i);
        this.imageAlbumData = imageAlbumData;
        this.autoCutModel = autoCutModel;
        this.nle = str;
        this.previewInfo = editPreviewInfo;
        this.hideIntermediateUI = z;
        this.livePicCut = i;
    }
}
