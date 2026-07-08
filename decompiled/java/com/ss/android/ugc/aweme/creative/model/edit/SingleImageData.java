package com.ss.android.ugc.aweme.creative.model.edit;

import X.C040H;
import X.C09CT;
import X.C1403980mdg;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.ImageVideoSharedModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.CameraPhotoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAdjustInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageBufferData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageFilterInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageQualityInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ReuseEffectTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SubOnlyPhotoPreviewInfo;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import dmt.av.video.SingleImageCoverBitmapData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleImageData implements Parcelable, Serializable {
    public static final Parcelable.Creator<SingleImageData> CREATOR = new Parcelable.Creator<SingleImageData>() { // from class: X.0nLF
        @Override // android.os.Parcelable.Creator
        public final SingleImageData createFromParcel(Parcel parcel) {
            ImageBufferData imageBufferDataCreateFromParcel;
            ImageAdjustInfo imageAdjustInfoCreateFromParcel;
            ImageStickerInfoNewEngine imageStickerInfoNewEngineCreateFromParcel;
            ImageSynthesisResult imageSynthesisResultCreateFromParcel;
            ImageQualityInfo imageQualityInfoCreateFromParcel;
            PhotoTemplateInfo photoTemplateInfoCreateFromParcel;
            ReuseEffectTemplateInfo reuseEffectTemplateInfoCreateFromParcel;
            boolean z;
            SrcLiveVideoInfo srcLiveVideoInfoCreateFromParcel;
            CameraPhotoInfo cameraPhotoInfoCreateFromParcel;
            ImageVideoSharedModel imageVideoSharedModelCreateFromParcel;
            CollageInfo collageInfoCreateFromParcel;
            SubOnlyPhotoPreviewInfo subOnlyPhotoPreviewInfoCreateFromParcel;
            boolean z2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            SrcImageInfo srcImageInfoCreateFromParcel = SrcImageInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                imageBufferDataCreateFromParcel = null;
            } else {
                imageBufferDataCreateFromParcel = ImageBufferData.CREATOR.createFromParcel(parcel);
            }
            ImageBufferData imageBufferData = imageBufferDataCreateFromParcel;
            EditImageInfo editImageInfoCreateFromParcel = EditImageInfo.CREATOR.createFromParcel(parcel);
            ImageFilterInfo imageFilterInfoCreateFromParcel = ImageFilterInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                imageAdjustInfoCreateFromParcel = null;
            } else {
                imageAdjustInfoCreateFromParcel = ImageAdjustInfo.CREATOR.createFromParcel(parcel);
            }
            ImageAdjustInfo imageAdjustInfo = imageAdjustInfoCreateFromParcel;
            ImageStickerInfo imageStickerInfoCreateFromParcel = ImageStickerInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                imageStickerInfoNewEngineCreateFromParcel = null;
            } else {
                imageStickerInfoNewEngineCreateFromParcel = ImageStickerInfoNewEngine.CREATOR.createFromParcel(parcel);
            }
            ImageStickerInfoNewEngine imageStickerInfoNewEngine = imageStickerInfoNewEngineCreateFromParcel;
            if (parcel.readInt() == 0) {
                imageSynthesisResultCreateFromParcel = null;
            } else {
                imageSynthesisResultCreateFromParcel = ImageSynthesisResult.CREATOR.createFromParcel(parcel);
            }
            ImageSynthesisResult imageSynthesisResult = imageSynthesisResultCreateFromParcel;
            if (parcel.readInt() == 0) {
                imageQualityInfoCreateFromParcel = null;
            } else {
                imageQualityInfoCreateFromParcel = ImageQualityInfo.CREATOR.createFromParcel(parcel);
            }
            ImageQualityInfo imageQualityInfo = imageQualityInfoCreateFromParcel;
            int i = parcel.readInt();
            AIGCInfo aIGCInfo = (AIGCInfo) parcel.readParcelable(SingleImageData.class.getClassLoader());
            ImportVideoInfo importVideoInfo = (ImportVideoInfo) parcel.readParcelable(SingleImageData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                photoTemplateInfoCreateFromParcel = null;
            } else {
                photoTemplateInfoCreateFromParcel = PhotoTemplateInfo.CREATOR.createFromParcel(parcel);
            }
            PhotoTemplateInfo photoTemplateInfo = photoTemplateInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                reuseEffectTemplateInfoCreateFromParcel = null;
            } else {
                reuseEffectTemplateInfoCreateFromParcel = ReuseEffectTemplateInfo.CREATOR.createFromParcel(parcel);
            }
            ReuseEffectTemplateInfo reuseEffectTemplateInfo = reuseEffectTemplateInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                srcLiveVideoInfoCreateFromParcel = null;
            } else {
                srcLiveVideoInfoCreateFromParcel = SrcLiveVideoInfo.CREATOR.createFromParcel(parcel);
            }
            SrcLiveVideoInfo srcLiveVideoInfo = srcLiveVideoInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                cameraPhotoInfoCreateFromParcel = null;
            } else {
                cameraPhotoInfoCreateFromParcel = CameraPhotoInfo.CREATOR.createFromParcel(parcel);
            }
            CameraPhotoInfo cameraPhotoInfo = cameraPhotoInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                imageVideoSharedModelCreateFromParcel = null;
            } else {
                imageVideoSharedModelCreateFromParcel = ImageVideoSharedModel.CREATOR.createFromParcel(parcel);
            }
            ImageVideoSharedModel imageVideoSharedModel = imageVideoSharedModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                collageInfoCreateFromParcel = null;
            } else {
                collageInfoCreateFromParcel = CollageInfo.CREATOR.createFromParcel(parcel);
            }
            CollageInfo collageInfo = collageInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                subOnlyPhotoPreviewInfoCreateFromParcel = null;
            } else {
                subOnlyPhotoPreviewInfoCreateFromParcel = SubOnlyPhotoPreviewInfo.CREATOR.createFromParcel(parcel);
            }
            SubOnlyPhotoPreviewInfo subOnlyPhotoPreviewInfo = subOnlyPhotoPreviewInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new SingleImageData(string, string2, srcImageInfoCreateFromParcel, imageBufferData, editImageInfoCreateFromParcel, imageFilterInfoCreateFromParcel, imageAdjustInfo, imageStickerInfoCreateFromParcel, imageStickerInfoNewEngine, imageSynthesisResult, imageQualityInfo, i, aIGCInfo, importVideoInfo, photoTemplateInfo, reuseEffectTemplateInfo, z, srcLiveVideoInfo, cameraPhotoInfo, imageVideoSharedModel, collageInfo, subOnlyPhotoPreviewInfo, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final SingleImageData[] newArray(int i) {
            return new SingleImageData[i];
        }
    };

    @C09CT("adjustInfo")
    public ImageAdjustInfo adjustInfo;

    @C09CT("aigc_info")
    public AIGCInfo aigcInfo;

    @C09CT("image_buffer_data")
    public final ImageBufferData bufferData;

    @C09CT("camera_photo_info")
    public CameraPhotoInfo cameraPhotoInfo;

    @C09CT("collage_info")
    public CollageInfo collageInfo;

    @C09CT("edit_image_info")
    public final EditImageInfo editImageInfo;

    @C09CT("filterInfo")
    public final ImageFilterInfo filterInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("is_aigc_content")
    public int imageAIGCType;

    @C09CT("image_quality_info")
    public ImageQualityInfo imageQualityInfo;

    @C09CT("image_video_shared_model")
    public ImageVideoSharedModel imageVideoSharedModel;

    @C09CT("is_ai_cover")
    public boolean isAICover;

    @C09CT("is_text_2_image")
    public boolean isText2Image;

    @C09CT("origin_album_image_data")
    public ImportVideoInfo originAlbumImageData;

    @C09CT("photo_template_info")
    public PhotoTemplateInfo photoTemplateInfo;

    @C09CT("reuse_effect_template_info")
    public ReuseEffectTemplateInfo reuseEffectTemplateInfo;

    @C09CT("src_image_info")
    public SrcImageInfo srcImageInfo;

    @C09CT("src_live_info")
    public SrcLiveVideoInfo srcLiveInfo;

    @C09CT("stickerInfo")
    public ImageStickerInfo stickerInfo;

    @C09CT("item_sticker_info_new_engine")
    public ImageStickerInfoNewEngine stickerInfoNewEngine;

    @C09CT("sub_only_preview_info")
    public SubOnlyPhotoPreviewInfo subOnlyPhotoPreviewInfo;

    @C040H
    @C09CT("synthesis_data")
    public ImageSynthesisResult synthesisData;

    @C09CT("system_id")
    public final String systemId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.systemId);
        this.srcImageInfo.writeToParcel(parcel, i);
        ImageBufferData imageBufferData = this.bufferData;
        if (imageBufferData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageBufferData.writeToParcel(parcel, i);
        }
        this.editImageInfo.writeToParcel(parcel, i);
        this.filterInfo.writeToParcel(parcel, i);
        ImageAdjustInfo imageAdjustInfo = this.adjustInfo;
        if (imageAdjustInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageAdjustInfo.writeToParcel(parcel, i);
        }
        this.stickerInfo.writeToParcel(parcel, i);
        ImageStickerInfoNewEngine imageStickerInfoNewEngine = this.stickerInfoNewEngine;
        if (imageStickerInfoNewEngine == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageStickerInfoNewEngine.writeToParcel(parcel, i);
        }
        ImageSynthesisResult imageSynthesisResult = this.synthesisData;
        if (imageSynthesisResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageSynthesisResult.writeToParcel(parcel, i);
        }
        ImageQualityInfo imageQualityInfo = this.imageQualityInfo;
        if (imageQualityInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageQualityInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.imageAIGCType);
        parcel.writeParcelable(this.aigcInfo, i);
        parcel.writeParcelable(this.originAlbumImageData, i);
        PhotoTemplateInfo photoTemplateInfo = this.photoTemplateInfo;
        if (photoTemplateInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photoTemplateInfo.writeToParcel(parcel, i);
        }
        ReuseEffectTemplateInfo reuseEffectTemplateInfo = this.reuseEffectTemplateInfo;
        if (reuseEffectTemplateInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reuseEffectTemplateInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isText2Image ? 1 : 0);
        SrcLiveVideoInfo srcLiveVideoInfo = this.srcLiveInfo;
        if (srcLiveVideoInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            srcLiveVideoInfo.writeToParcel(parcel, i);
        }
        CameraPhotoInfo cameraPhotoInfo = this.cameraPhotoInfo;
        if (cameraPhotoInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cameraPhotoInfo.writeToParcel(parcel, i);
        }
        ImageVideoSharedModel imageVideoSharedModel = this.imageVideoSharedModel;
        if (imageVideoSharedModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageVideoSharedModel.writeToParcel(parcel, i);
        }
        CollageInfo collageInfo = this.collageInfo;
        if (collageInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            collageInfo.writeToParcel(parcel, i);
        }
        SubOnlyPhotoPreviewInfo subOnlyPhotoPreviewInfo = this.subOnlyPhotoPreviewInfo;
        if (subOnlyPhotoPreviewInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subOnlyPhotoPreviewInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isAICover ? 1 : 0);
    }

    public final float getImageRatio() {
        float ratio = this.editImageInfo.getRatio();
        return ratio == -1.0f ? this.srcImageInfo.getImageRatio() : ratio;
    }

    public final float getRotation() {
        Float extraRotation = this.editImageInfo.getExtraRotation();
        float fFloatValue = extraRotation != null ? extraRotation.floatValue() : 0.0f;
        Float buttonRotation = this.editImageInfo.getButtonRotation();
        return fFloatValue + (buttonRotation != null ? buttonRotation.floatValue() : 0.0f);
    }

    public final String getSynthesisPathAsPossible() {
        String path;
        ImageSynthesisResult imageSynthesisResult = this.synthesisData;
        if (imageSynthesisResult != null && (path = imageSynthesisResult.getPath()) != null) {
            return path;
        }
        String tempSynthesisPath = this.editImageInfo.getTempSynthesisPath();
        return tempSynthesisPath == null ? this.srcImageInfo.getPath() : tempSynthesisPath;
    }

    public final boolean isCameraPhoto() {
        return this.cameraPhotoInfo != null;
    }

    public final boolean isCameraPhotoFirstTimeShowInEditPage() {
        SingleImageCoverBitmapData singleImageCoverBitmapData;
        CameraPhotoInfo cameraPhotoInfo;
        CameraPhotoInfo cameraPhotoInfo2 = this.cameraPhotoInfo;
        return (cameraPhotoInfo2 == null || (singleImageCoverBitmapData = cameraPhotoInfo2.getSingleImageCoverBitmapData()) == null || !singleImageCoverBitmapData.isReuseTexture() || (cameraPhotoInfo = this.cameraPhotoInfo) == null || cameraPhotoInfo.getReceivedFirstFrame()) ? false : true;
    }

    public final boolean isManualCrop() {
        return this.editImageInfo.getScaleAfterCrop() != null;
    }

    public final boolean hasImageAltered() {
        if (getRotation() != 0.0f) {
            return true;
        }
        Float offsetX = this.editImageInfo.getOffsetX();
        if (offsetX != null && !Intrinsics.LIZLLL(offsetX, 0.0f)) {
            return true;
        }
        Float offsetY = this.editImageInfo.getOffsetY();
        return (offsetY == null || Intrinsics.LIZLLL(offsetY, 0.0f)) ? false : true;
    }

    public final ImageAdjustInfo getAdjustInfo() {
        return this.adjustInfo;
    }

    public final AIGCInfo getAigcInfo() {
        return this.aigcInfo;
    }

    public final ImageBufferData getBufferData() {
        return this.bufferData;
    }

    public final CameraPhotoInfo getCameraPhotoInfo() {
        return this.cameraPhotoInfo;
    }

    public final CollageInfo getCollageInfo() {
        return this.collageInfo;
    }

    public final EditImageInfo getEditImageInfo() {
        return this.editImageInfo;
    }

    public final ImageFilterInfo getFilterInfo() {
        return this.filterInfo;
    }

    public final String getId() {
        return this.id;
    }

    public final int getImageAIGCType() {
        return this.imageAIGCType;
    }

    public final ImageQualityInfo getImageQualityInfo() {
        return this.imageQualityInfo;
    }

    public final ImageVideoSharedModel getImageVideoSharedModel() {
        return this.imageVideoSharedModel;
    }

    public final ImportVideoInfo getOriginAlbumImageData() {
        return this.originAlbumImageData;
    }

    public final PhotoTemplateInfo getPhotoTemplateInfo() {
        return this.photoTemplateInfo;
    }

    public final ReuseEffectTemplateInfo getReuseEffectTemplateInfo() {
        return this.reuseEffectTemplateInfo;
    }

    public final SrcImageInfo getSrcImageInfo() {
        return this.srcImageInfo;
    }

    public final SrcLiveVideoInfo getSrcLiveInfo() {
        return this.srcLiveInfo;
    }

    public final ImageStickerInfo getStickerInfo() {
        return this.stickerInfo;
    }

    public final ImageStickerInfoNewEngine getStickerInfoNewEngine() {
        return this.stickerInfoNewEngine;
    }

    public final SubOnlyPhotoPreviewInfo getSubOnlyPhotoPreviewInfo() {
        return this.subOnlyPhotoPreviewInfo;
    }

    public final ImageSynthesisResult getSynthesisData() {
        return this.synthesisData;
    }

    public final String getSystemId() {
        return this.systemId;
    }

    public final boolean isAICover() {
        return this.isAICover;
    }

    public final boolean isText2Image() {
        return this.isText2Image;
    }

    public final void setAICover(boolean z) {
        this.isAICover = z;
    }

    public final void setAdjustInfo(ImageAdjustInfo imageAdjustInfo) {
        this.adjustInfo = imageAdjustInfo;
    }

    public final void setAigcInfo(AIGCInfo aIGCInfo) {
        this.aigcInfo = aIGCInfo;
    }

    public final void setCameraPhotoInfo(CameraPhotoInfo cameraPhotoInfo) {
        this.cameraPhotoInfo = cameraPhotoInfo;
    }

    public final void setCollageInfo(CollageInfo collageInfo) {
        this.collageInfo = collageInfo;
    }

    public final void setImageAIGCType(int i) {
        this.imageAIGCType = i;
    }

    public final void setImageQualityInfo(ImageQualityInfo imageQualityInfo) {
        this.imageQualityInfo = imageQualityInfo;
    }

    public final void setImageVideoSharedModel(ImageVideoSharedModel imageVideoSharedModel) {
        this.imageVideoSharedModel = imageVideoSharedModel;
    }

    public final void setOriginAlbumImageData(ImportVideoInfo importVideoInfo) {
        this.originAlbumImageData = importVideoInfo;
    }

    public final void setPhotoTemplateInfo(PhotoTemplateInfo photoTemplateInfo) {
        this.photoTemplateInfo = photoTemplateInfo;
    }

    public final void setReuseEffectTemplateInfo(ReuseEffectTemplateInfo reuseEffectTemplateInfo) {
        this.reuseEffectTemplateInfo = reuseEffectTemplateInfo;
    }

    public final void setSrcImageInfo(SrcImageInfo srcImageInfo) {
        this.srcImageInfo = srcImageInfo;
    }

    public final void setSrcLiveInfo(SrcLiveVideoInfo srcLiveVideoInfo) {
        this.srcLiveInfo = srcLiveVideoInfo;
    }

    public final void setStickerInfo(ImageStickerInfo imageStickerInfo) {
        this.stickerInfo = imageStickerInfo;
    }

    public final void setStickerInfoNewEngine(ImageStickerInfoNewEngine imageStickerInfoNewEngine) {
        this.stickerInfoNewEngine = imageStickerInfoNewEngine;
    }

    public final void setSubOnlyPhotoPreviewInfo(SubOnlyPhotoPreviewInfo subOnlyPhotoPreviewInfo) {
        this.subOnlyPhotoPreviewInfo = subOnlyPhotoPreviewInfo;
    }

    public final void setSynthesisData(ImageSynthesisResult imageSynthesisResult) {
        this.synthesisData = imageSynthesisResult;
    }

    public final void setText2Image(boolean z) {
        this.isText2Image = z;
    }

    public final boolean isAutoCrop(ImageSurfaceData imageSurfaceData, Function2<? super Float, ? super Float, Float> function2) {
        boolean z;
        float imageRatio = this.srcImageInfo.getImageRatio();
        if (imageRatio == function2.invoke(Float.valueOf(imageSurfaceData.getSurfaceViewRatio()), Float.valueOf(imageRatio)).floatValue()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public final boolean isCrop(ImageSurfaceData imageSurfaceData, Function2<? super Float, ? super Float, Float> function2) {
        if (!isManualCrop() && !isAutoCrop(imageSurfaceData, function2)) {
            return false;
        }
        return true;
    }

    public final boolean isEdited(boolean z, boolean z2) {
        PhotoTemplateInfo photoTemplateInfo;
        Map<String, SingleAdjustInfo> adjustMap;
        if ((!a0.LJJJIL(this.filterInfo.getFilterId())) || (!this.stickerInfo.getStickers().isEmpty())) {
            return true;
        }
        if (z2 && this.editImageInfo.getScaleAfterCrop() != null) {
            return true;
        }
        ImageAdjustInfo imageAdjustInfo = this.adjustInfo;
        if (imageAdjustInfo != null && (adjustMap = imageAdjustInfo.getAdjustMap()) != null && C1403980mdg.LIZ(adjustMap)) {
            return true;
        }
        ImageStickerInfoNewEngine imageStickerInfoNewEngine = this.stickerInfoNewEngine;
        if (imageStickerInfoNewEngine != null && imageStickerInfoNewEngine.hasSticker()) {
            return true;
        }
        if (z2 && (this.editImageInfo.getRatioMode() >= 0 || this.editImageInfo.getOffsetX() != null || this.editImageInfo.getOffsetY() != null)) {
            return true;
        }
        if (z && (photoTemplateInfo = this.photoTemplateInfo) != null && photoTemplateInfo.getPhotoTemplateAsset() != null) {
            return true;
        }
        return false;
    }

    public SingleImageData(String str, String str2, SrcImageInfo srcImageInfo, ImageBufferData imageBufferData, EditImageInfo editImageInfo, ImageFilterInfo imageFilterInfo, ImageAdjustInfo imageAdjustInfo, ImageStickerInfo imageStickerInfo, ImageStickerInfoNewEngine imageStickerInfoNewEngine, ImageSynthesisResult imageSynthesisResult, ImageQualityInfo imageQualityInfo, int i, AIGCInfo aIGCInfo, ImportVideoInfo importVideoInfo, PhotoTemplateInfo photoTemplateInfo, ReuseEffectTemplateInfo reuseEffectTemplateInfo, boolean z, SrcLiveVideoInfo srcLiveVideoInfo, CameraPhotoInfo cameraPhotoInfo, ImageVideoSharedModel imageVideoSharedModel, CollageInfo collageInfo, SubOnlyPhotoPreviewInfo subOnlyPhotoPreviewInfo, boolean z2) {
        this.id = str;
        this.systemId = str2;
        this.srcImageInfo = srcImageInfo;
        this.bufferData = imageBufferData;
        this.editImageInfo = editImageInfo;
        this.filterInfo = imageFilterInfo;
        this.adjustInfo = imageAdjustInfo;
        this.stickerInfo = imageStickerInfo;
        this.stickerInfoNewEngine = imageStickerInfoNewEngine;
        this.synthesisData = imageSynthesisResult;
        this.imageQualityInfo = imageQualityInfo;
        this.imageAIGCType = i;
        this.aigcInfo = aIGCInfo;
        this.originAlbumImageData = importVideoInfo;
        this.photoTemplateInfo = photoTemplateInfo;
        this.reuseEffectTemplateInfo = reuseEffectTemplateInfo;
        this.isText2Image = z;
        this.srcLiveInfo = srcLiveVideoInfo;
        this.cameraPhotoInfo = cameraPhotoInfo;
        this.imageVideoSharedModel = imageVideoSharedModel;
        this.collageInfo = collageInfo;
        this.subOnlyPhotoPreviewInfo = subOnlyPhotoPreviewInfo;
        this.isAICover = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ SingleImageData(String str, String str2, SrcImageInfo srcImageInfo, ImageBufferData imageBufferData, EditImageInfo editImageInfo, ImageFilterInfo imageFilterInfo, ImageAdjustInfo imageAdjustInfo, ImageStickerInfo imageStickerInfo, ImageStickerInfoNewEngine imageStickerInfoNewEngine, ImageSynthesisResult imageSynthesisResult, ImageQualityInfo imageQualityInfo, int i, AIGCInfo aIGCInfo, ImportVideoInfo importVideoInfo, PhotoTemplateInfo photoTemplateInfo, ReuseEffectTemplateInfo reuseEffectTemplateInfo, boolean z, SrcLiveVideoInfo srcLiveVideoInfo, CameraPhotoInfo cameraPhotoInfo, ImageVideoSharedModel imageVideoSharedModel, CollageInfo collageInfo, SubOnlyPhotoPreviewInfo subOnlyPhotoPreviewInfo, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? "" : str2, srcImageInfo, imageBufferData, (i2 & 16) != 0 ? new EditImageInfo(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2097151, 0 == true ? 1 : 0) : editImageInfo, (i2 & 32) != 0 ? new ImageFilterInfo("", null, -1.0f, false, null, false, null, "") : imageFilterInfo, (i2 & 64) != 0 ? null : imageAdjustInfo, (i2 & 128) != 0 ? new ImageStickerInfo(new ArrayList(), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0) : imageStickerInfo, (i2 & 256) != 0 ? null : imageStickerInfoNewEngine, (i2 & 512) != 0 ? null : imageSynthesisResult, (i2 & 1024) != 0 ? null : imageQualityInfo, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : aIGCInfo, (i2 & 8192) != 0 ? null : importVideoInfo, (i2 & 16384) != 0 ? null : photoTemplateInfo, (32768 & i2) != 0 ? null : reuseEffectTemplateInfo, (65536 & i2) != 0 ? false : z, (131072 & i2) != 0 ? null : srcLiveVideoInfo, (262144 & i2) != 0 ? null : cameraPhotoInfo, (524288 & i2) != 0 ? null : imageVideoSharedModel, (1048576 & i2) != 0 ? null : collageInfo, (2097152 & i2) == 0 ? subOnlyPhotoPreviewInfo : null, (i2 & 4194304) != 0 ? false : z2);
    }
}
