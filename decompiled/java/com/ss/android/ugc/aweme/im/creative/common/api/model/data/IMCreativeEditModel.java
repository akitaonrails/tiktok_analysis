package com.ss.android.ugc.aweme.im.creative.common.api.model.data;

import X.C786410Ut5;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.DMCameraModelMirror;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.DMMediaModelMirror;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeCommonModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMEffectModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMStickerFontData;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.PhotoSwapEditModel;
import com.ss.android.ugc.aweme.im.creative.common.api.navigation.TargetResolution;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class IMCreativeEditModel implements Parcelable {
    public static final Parcelable.Creator<IMCreativeEditModel> CREATOR = new Parcelable.Creator<IMCreativeEditModel>() { // from class: X.0nhu
        @Override // android.os.Parcelable.Creator
        public final IMCreativeEditModel createFromParcel(Parcel parcel) {
            boolean z;
            IMCreativeCommonModel iMCreativeCommonModelCreateFromParcel;
            DMMediaModelMirror dMMediaModelMirrorCreateFromParcel;
            DMCameraModelMirror dMCameraModelMirrorCreateFromParcel;
            IMEffectModel iMEffectModelCreateFromParcel;
            IMStickerFontData iMStickerFontDataCreateFromParcel;
            TargetResolution targetResolutionCreateFromParcel;
            boolean z2;
            String string = parcel.readString();
            Uri uri = (Uri) parcel.readParcelable(IMCreativeEditModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            PhotoSwapEditModel photoSwapEditModelCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                iMCreativeCommonModelCreateFromParcel = null;
            } else {
                iMCreativeCommonModelCreateFromParcel = IMCreativeCommonModel.CREATOR.createFromParcel(parcel);
            }
            IMCreativeCommonModel iMCreativeCommonModel = iMCreativeCommonModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                dMMediaModelMirrorCreateFromParcel = null;
            } else {
                dMMediaModelMirrorCreateFromParcel = DMMediaModelMirror.CREATOR.createFromParcel(parcel);
            }
            DMMediaModelMirror dMMediaModelMirror = dMMediaModelMirrorCreateFromParcel;
            if (parcel.readInt() == 0) {
                dMCameraModelMirrorCreateFromParcel = null;
            } else {
                dMCameraModelMirrorCreateFromParcel = DMCameraModelMirror.CREATOR.createFromParcel(parcel);
            }
            DMCameraModelMirror dMCameraModelMirror = dMCameraModelMirrorCreateFromParcel;
            if (parcel.readInt() == 0) {
                iMEffectModelCreateFromParcel = null;
            } else {
                iMEffectModelCreateFromParcel = IMEffectModel.CREATOR.createFromParcel(parcel);
            }
            IMEffectModel iMEffectModel = iMEffectModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                iMStickerFontDataCreateFromParcel = null;
            } else {
                iMStickerFontDataCreateFromParcel = IMStickerFontData.CREATOR.createFromParcel(parcel);
            }
            IMStickerFontData iMStickerFontData = iMStickerFontDataCreateFromParcel;
            if (parcel.readInt() == 0) {
                targetResolutionCreateFromParcel = null;
            } else {
                targetResolutionCreateFromParcel = TargetResolution.CREATOR.createFromParcel(parcel);
            }
            TargetResolution targetResolution = targetResolutionCreateFromParcel;
            if (parcel.readInt() != 0) {
                photoSwapEditModelCreateFromParcel = PhotoSwapEditModel.CREATOR.createFromParcel(parcel);
            }
            PhotoSwapEditModel photoSwapEditModel = photoSwapEditModelCreateFromParcel;
            MediaModel mediaModel = (MediaModel) parcel.readParcelable(IMCreativeEditModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new IMCreativeEditModel(string, uri, z, iMCreativeCommonModel, dMMediaModelMirror, dMCameraModelMirror, iMEffectModel, iMStickerFontData, targetResolution, photoSwapEditModel, mediaModel, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final IMCreativeEditModel[] newArray(int i) {
            return new IMCreativeEditModel[i];
        }
    };
    public final MediaModel albumUpdateGuideMediaModel;
    public final IMCreativeCommonModel commonModel;
    public final String creationId;
    public final DMCameraModelMirror dmCameraModelMirror;
    public final DMMediaModelMirror dmMediaModelMirror;
    public final IMEffectModel effectModel;
    public final IMStickerFontData fontData;
    public final boolean isFromAlbum;
    public final boolean isImage;
    public final Uri originUri;
    public final PhotoSwapEditModel photoSwapEditModel;
    public final TargetResolution targetResolution;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMCreativeEditModel)) {
            return false;
        }
        IMCreativeEditModel iMCreativeEditModel = (IMCreativeEditModel) obj;
        return Intrinsics.LJFF(this.creationId, iMCreativeEditModel.creationId) && Intrinsics.LJFF(this.originUri, iMCreativeEditModel.originUri) && this.isImage == iMCreativeEditModel.isImage && Intrinsics.LJFF(this.commonModel, iMCreativeEditModel.commonModel) && Intrinsics.LJFF(this.dmMediaModelMirror, iMCreativeEditModel.dmMediaModelMirror) && Intrinsics.LJFF(this.dmCameraModelMirror, iMCreativeEditModel.dmCameraModelMirror) && Intrinsics.LJFF(this.effectModel, iMCreativeEditModel.effectModel) && Intrinsics.LJFF(this.fontData, iMCreativeEditModel.fontData) && Intrinsics.LJFF(this.targetResolution, iMCreativeEditModel.targetResolution) && Intrinsics.LJFF(this.photoSwapEditModel, iMCreativeEditModel.photoSwapEditModel) && Intrinsics.LJFF(this.albumUpdateGuideMediaModel, iMCreativeEditModel.albumUpdateGuideMediaModel) && this.isFromAlbum == iMCreativeEditModel.isFromAlbum;
    }

    public final int hashCode() {
        int iHashCode = ((((this.creationId.hashCode() * 31) + this.originUri.hashCode()) * 31) + C786410Ut5.Z2(this.isImage)) * 31;
        IMCreativeCommonModel iMCreativeCommonModel = this.commonModel;
        int iHashCode2 = (iHashCode + (iMCreativeCommonModel == null ? 0 : iMCreativeCommonModel.hashCode())) * 31;
        DMMediaModelMirror dMMediaModelMirror = this.dmMediaModelMirror;
        int iHashCode3 = (iHashCode2 + (dMMediaModelMirror == null ? 0 : dMMediaModelMirror.hashCode())) * 31;
        DMCameraModelMirror dMCameraModelMirror = this.dmCameraModelMirror;
        int iHashCode4 = (iHashCode3 + (dMCameraModelMirror == null ? 0 : dMCameraModelMirror.hashCode())) * 31;
        IMEffectModel iMEffectModel = this.effectModel;
        int iHashCode5 = (iHashCode4 + (iMEffectModel == null ? 0 : iMEffectModel.hashCode())) * 31;
        IMStickerFontData iMStickerFontData = this.fontData;
        int iHashCode6 = (iHashCode5 + (iMStickerFontData == null ? 0 : iMStickerFontData.hashCode())) * 31;
        TargetResolution targetResolution = this.targetResolution;
        int iHashCode7 = (iHashCode6 + (targetResolution == null ? 0 : targetResolution.hashCode())) * 31;
        PhotoSwapEditModel photoSwapEditModel = this.photoSwapEditModel;
        int iHashCode8 = (iHashCode7 + (photoSwapEditModel == null ? 0 : photoSwapEditModel.hashCode())) * 31;
        MediaModel mediaModel = this.albumUpdateGuideMediaModel;
        return ((iHashCode8 + (mediaModel != null ? mediaModel.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isFromAlbum);
    }

    public final String toString() {
        return "IMCreativeEditModel(creationId=" + this.creationId + ", originUri=" + this.originUri + ", isImage=" + this.isImage + ", commonModel=" + this.commonModel + ", dmMediaModelMirror=" + this.dmMediaModelMirror + ", dmCameraModelMirror=" + this.dmCameraModelMirror + ", effectModel=" + this.effectModel + ", fontData=" + this.fontData + ", targetResolution=" + this.targetResolution + ", photoSwapEditModel=" + this.photoSwapEditModel + ", albumUpdateGuideMediaModel=" + this.albumUpdateGuideMediaModel + ", isFromAlbum=" + this.isFromAlbum + ')';
    }

    public final boolean LIZ() {
        return this.albumUpdateGuideMediaModel != null;
    }

    public final boolean LIZIZ() {
        DMCameraModelMirror dMCameraModelMirror = this.dmCameraModelMirror;
        return Intrinsics.LJFF(dMCameraModelMirror != null ? dMCameraModelMirror.enterDM : null, "quick_live_react");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.creationId);
        parcel.writeParcelable(this.originUri, i);
        parcel.writeInt(this.isImage ? 1 : 0);
        IMCreativeCommonModel iMCreativeCommonModel = this.commonModel;
        if (iMCreativeCommonModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iMCreativeCommonModel.writeToParcel(parcel, i);
        }
        DMMediaModelMirror dMMediaModelMirror = this.dmMediaModelMirror;
        if (dMMediaModelMirror == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dMMediaModelMirror.writeToParcel(parcel, i);
        }
        DMCameraModelMirror dMCameraModelMirror = this.dmCameraModelMirror;
        if (dMCameraModelMirror == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dMCameraModelMirror.writeToParcel(parcel, i);
        }
        IMEffectModel iMEffectModel = this.effectModel;
        if (iMEffectModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(iMEffectModel.effect, i);
        }
        IMStickerFontData iMStickerFontData = this.fontData;
        if (iMStickerFontData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iMStickerFontData.writeToParcel(parcel, i);
        }
        TargetResolution targetResolution = this.targetResolution;
        if (targetResolution == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            targetResolution.writeToParcel(parcel, i);
        }
        PhotoSwapEditModel photoSwapEditModel = this.photoSwapEditModel;
        if (photoSwapEditModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photoSwapEditModel.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.albumUpdateGuideMediaModel, i);
        parcel.writeInt(this.isFromAlbum ? 1 : 0);
    }

    public IMCreativeEditModel(String str, Uri uri, boolean z, IMCreativeCommonModel iMCreativeCommonModel, DMMediaModelMirror dMMediaModelMirror, DMCameraModelMirror dMCameraModelMirror, IMEffectModel iMEffectModel, IMStickerFontData iMStickerFontData, TargetResolution targetResolution, PhotoSwapEditModel photoSwapEditModel, MediaModel mediaModel, boolean z2) {
        this.creationId = str;
        this.originUri = uri;
        this.isImage = z;
        this.commonModel = iMCreativeCommonModel;
        this.dmMediaModelMirror = dMMediaModelMirror;
        this.dmCameraModelMirror = dMCameraModelMirror;
        this.effectModel = iMEffectModel;
        this.fontData = iMStickerFontData;
        this.targetResolution = targetResolution;
        this.photoSwapEditModel = photoSwapEditModel;
        this.albumUpdateGuideMediaModel = mediaModel;
        this.isFromAlbum = z2;
    }

    public /* synthetic */ IMCreativeEditModel(String str, Uri uri, boolean z, IMCreativeCommonModel iMCreativeCommonModel, DMMediaModelMirror dMMediaModelMirror, DMCameraModelMirror dMCameraModelMirror, IMEffectModel iMEffectModel, IMStickerFontData iMStickerFontData, TargetResolution targetResolution, PhotoSwapEditModel photoSwapEditModel, MediaModel mediaModel, boolean z2, int i) {
        this(str, uri, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : iMCreativeCommonModel, (i & 16) != 0 ? null : dMMediaModelMirror, (i & 32) != 0 ? null : dMCameraModelMirror, (i & 64) != 0 ? null : iMEffectModel, (i & 128) != 0 ? null : iMStickerFontData, (i & 256) != 0 ? null : targetResolution, (i & 512) != 0 ? null : photoSwapEditModel, (i & 1024) == 0 ? mediaModel : null, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z2);
    }
}
