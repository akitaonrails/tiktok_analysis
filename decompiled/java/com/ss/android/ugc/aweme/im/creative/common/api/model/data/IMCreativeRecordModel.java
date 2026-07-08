package com.ss.android.ugc.aweme.im.creative.common.api.model.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.CameraPageConfig;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.DMCameraModelMirror;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeCommonModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeRecordModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMEffectModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMGameCameraInfo;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMQuickLiveReactModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMStickerFontData;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.Photo2StickerStatus;
import java.util.Collections;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class IMCreativeRecordModel implements Parcelable {
    public static final Parcelable.Creator<IMCreativeRecordModel> CREATOR = new Parcelable.Creator<IMCreativeRecordModel>() { // from class: X.0nhr
        @Override // android.os.Parcelable.Creator
        public final IMCreativeRecordModel createFromParcel(Parcel parcel) {
            DMCameraModelMirror dMCameraModelMirrorCreateFromParcel;
            IMEffectModel iMEffectModelCreateFromParcel;
            IMStickerFontData iMStickerFontDataCreateFromParcel;
            IMGameCameraInfo iMGameCameraInfoCreateFromParcel;
            String string = parcel.readString();
            IMQuickLiveReactModel iMQuickLiveReactModelCreateFromParcel = null;
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
                iMGameCameraInfoCreateFromParcel = null;
            } else {
                iMGameCameraInfoCreateFromParcel = IMGameCameraInfo.CREATOR.createFromParcel(parcel);
            }
            IMGameCameraInfo iMGameCameraInfo = iMGameCameraInfoCreateFromParcel;
            Photo2StickerStatus photo2StickerStatus = (Photo2StickerStatus) parcel.readParcelable(IMCreativeRecordModel.class.getClassLoader());
            IMCreativeCommonModel iMCreativeCommonModelCreateFromParcel = IMCreativeCommonModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                iMQuickLiveReactModelCreateFromParcel = IMQuickLiveReactModel.CREATOR.createFromParcel(parcel);
            }
            return new IMCreativeRecordModel(string, dMCameraModelMirror, iMEffectModel, iMStickerFontData, iMGameCameraInfo, photo2StickerStatus, iMCreativeCommonModelCreateFromParcel, iMQuickLiveReactModelCreateFromParcel, CameraPageConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final IMCreativeRecordModel[] newArray(int i) {
            return new IMCreativeRecordModel[i];
        }
    };
    public final IMCreativeCommonModel commonModel;
    public final String creationId;
    public final DMCameraModelMirror dmCameraModelMirror;
    public final IMEffectModel effectModel;
    public final IMStickerFontData fontData;
    public final IMGameCameraInfo gameModel;
    public final Photo2StickerStatus photo2StickerStatus;
    public IMQuickLiveReactModel quickLiveReactModel;
    public final CameraPageConfig tabConfig;

    public IMCreativeRecordModel() {
        this((String) null, (DMCameraModelMirror) null, (IMEffectModel) null, (IMStickerFontData) null, (IMGameCameraInfo) null, (Photo2StickerStatus.ENABLED) null, (IMCreativeCommonModel) null, (CameraPageConfig) null, 511);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMCreativeRecordModel)) {
            return false;
        }
        IMCreativeRecordModel iMCreativeRecordModel = (IMCreativeRecordModel) obj;
        return Intrinsics.LJFF(this.creationId, iMCreativeRecordModel.creationId) && Intrinsics.LJFF(this.dmCameraModelMirror, iMCreativeRecordModel.dmCameraModelMirror) && Intrinsics.LJFF(this.effectModel, iMCreativeRecordModel.effectModel) && Intrinsics.LJFF(this.fontData, iMCreativeRecordModel.fontData) && Intrinsics.LJFF(this.gameModel, iMCreativeRecordModel.gameModel) && Intrinsics.LJFF(this.photo2StickerStatus, iMCreativeRecordModel.photo2StickerStatus) && Intrinsics.LJFF(this.commonModel, iMCreativeRecordModel.commonModel) && Intrinsics.LJFF(this.quickLiveReactModel, iMCreativeRecordModel.quickLiveReactModel) && Intrinsics.LJFF(this.tabConfig, iMCreativeRecordModel.tabConfig);
    }

    public final int hashCode() {
        int iHashCode = this.creationId.hashCode() * 31;
        DMCameraModelMirror dMCameraModelMirror = this.dmCameraModelMirror;
        int iHashCode2 = (iHashCode + (dMCameraModelMirror == null ? 0 : dMCameraModelMirror.hashCode())) * 31;
        IMEffectModel iMEffectModel = this.effectModel;
        int iHashCode3 = (iHashCode2 + (iMEffectModel == null ? 0 : iMEffectModel.hashCode())) * 31;
        IMStickerFontData iMStickerFontData = this.fontData;
        int iHashCode4 = (iHashCode3 + (iMStickerFontData == null ? 0 : iMStickerFontData.hashCode())) * 31;
        IMGameCameraInfo iMGameCameraInfo = this.gameModel;
        int iHashCode5 = (((((iHashCode4 + (iMGameCameraInfo == null ? 0 : iMGameCameraInfo.hashCode())) * 31) + this.photo2StickerStatus.hashCode()) * 31) + this.commonModel.hashCode()) * 31;
        IMQuickLiveReactModel iMQuickLiveReactModel = this.quickLiveReactModel;
        return ((iHashCode5 + (iMQuickLiveReactModel != null ? iMQuickLiveReactModel.hashCode() : 0)) * 31) + this.tabConfig.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMCreativeRecordModel(creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", dmCameraModelMirror=");
        sbLIZ.append(this.dmCameraModelMirror);
        sbLIZ.append(", effectModel=");
        sbLIZ.append(this.effectModel);
        sbLIZ.append(", fontData=");
        sbLIZ.append(this.fontData);
        sbLIZ.append(", gameModel=");
        sbLIZ.append(this.gameModel);
        sbLIZ.append(", photo2StickerStatus=");
        sbLIZ.append(this.photo2StickerStatus);
        sbLIZ.append(", commonModel=");
        sbLIZ.append(this.commonModel);
        sbLIZ.append(", quickLiveReactModel=");
        sbLIZ.append(this.quickLiveReactModel);
        sbLIZ.append(", tabConfig=");
        sbLIZ.append(this.tabConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.creationId);
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
        IMGameCameraInfo iMGameCameraInfo = this.gameModel;
        if (iMGameCameraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iMGameCameraInfo.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.photo2StickerStatus, i);
        this.commonModel.writeToParcel(parcel, i);
        IMQuickLiveReactModel iMQuickLiveReactModel = this.quickLiveReactModel;
        if (iMQuickLiveReactModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iMQuickLiveReactModel.writeToParcel(parcel, i);
        }
        this.tabConfig.writeToParcel(parcel, i);
    }

    public IMCreativeRecordModel(String str, DMCameraModelMirror dMCameraModelMirror, IMEffectModel iMEffectModel, IMStickerFontData iMStickerFontData, IMGameCameraInfo iMGameCameraInfo, Photo2StickerStatus.ENABLED enabled, IMCreativeCommonModel iMCreativeCommonModel, CameraPageConfig cameraPageConfig, int i) {
        CameraPageConfig cameraPageConfig2 = cameraPageConfig;
        IMCreativeCommonModel iMCreativeCommonModel2 = iMCreativeCommonModel;
        IMGameCameraInfo iMGameCameraInfo2 = iMGameCameraInfo;
        IMStickerFontData iMStickerFontData2 = iMStickerFontData;
        IMEffectModel iMEffectModel2 = iMEffectModel;
        Photo2StickerStatus photo2StickerStatus = enabled;
        DMCameraModelMirror dMCameraModelMirror2 = dMCameraModelMirror;
        String string = (i & 1) != 0 ? UUID.randomUUID().toString() : str;
        String str2 = null;
        dMCameraModelMirror2 = (i & 2) != 0 ? null : dMCameraModelMirror2;
        iMEffectModel2 = (i & 4) != 0 ? null : iMEffectModel2;
        iMStickerFontData2 = (i & 8) != 0 ? null : iMStickerFontData2;
        iMGameCameraInfo2 = (i & 16) != 0 ? null : iMGameCameraInfo2;
        photo2StickerStatus = (i & 32) != 0 ? Photo2StickerStatus.DISABLED.INSTANCE : photo2StickerStatus;
        iMCreativeCommonModel2 = (i & 64) != 0 ? new IMCreativeCommonModel(str2, str2, 0, str2, str2, 16383) : iMCreativeCommonModel2;
        if ((i & 256) != 0) {
            IMRecordPageEnum iMRecordPageEnum = IMRecordPageEnum.DEFAULT;
            cameraPageConfig2 = new CameraPageConfig(Collections.singletonList(iMRecordPageEnum), iMRecordPageEnum);
        }
        this(string, dMCameraModelMirror2, iMEffectModel2, iMStickerFontData2, iMGameCameraInfo2, photo2StickerStatus, iMCreativeCommonModel2, (IMQuickLiveReactModel) null, cameraPageConfig2);
    }

    public IMCreativeRecordModel(String str, DMCameraModelMirror dMCameraModelMirror, IMEffectModel iMEffectModel, IMStickerFontData iMStickerFontData, IMGameCameraInfo iMGameCameraInfo, Photo2StickerStatus photo2StickerStatus, IMCreativeCommonModel iMCreativeCommonModel, IMQuickLiveReactModel iMQuickLiveReactModel, CameraPageConfig cameraPageConfig) {
        this.creationId = str;
        this.dmCameraModelMirror = dMCameraModelMirror;
        this.effectModel = iMEffectModel;
        this.fontData = iMStickerFontData;
        this.gameModel = iMGameCameraInfo;
        this.photo2StickerStatus = photo2StickerStatus;
        this.commonModel = iMCreativeCommonModel;
        this.quickLiveReactModel = iMQuickLiveReactModel;
        this.tabConfig = cameraPageConfig;
    }
}
