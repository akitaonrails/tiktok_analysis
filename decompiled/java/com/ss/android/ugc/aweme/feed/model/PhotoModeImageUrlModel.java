package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.model.ImagePreviewModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoModeImageUrlModel implements Serializable {
    public int adaptMultiRateErrCode;

    @C09CT("alternate_text")
    public String altText;

    @C09CT("aspect_fill_threshold")
    public Float aspectFillThreshold;

    @C09CT("bitrate_images")
    public List<MultiImageUrlInfo> bitrateImages;
    public String blurHashCode;
    public Integer blurHashPreviewType;
    public Integer darkMainColor;

    @C09CT("display_image")
    public UrlModel displayImageNoWatermark;

    @C09CT("dynamic_image")
    public UrlModel dynamicImage;
    public String gearName;
    public boolean isCoverLoadSuccess;

    @C09CT("live_photo_info")
    public LivePhotoStruct livePhotoStruct;
    public int multiRateNetSpeed;

    @C09CT("ocr_language")
    public String ocrLanguage;

    @C09CT("owner_watermark_image")
    public UrlModel ownerWatermarkImage;
    public transient int selectedBitrateIndex;
    public PhotoSourceFromScene sourceFrom;
    public transient Double srLevel;

    @C09CT("subscription_info")
    public SubscriptionInfo subscriptionInfo;
    public UrlModel targetMultiRateImageUrl;

    @C09CT("thumbnail")
    public UrlModel thumbnail;

    @C09CT("translated_image")
    public UrlModel translatedDisplayImage;

    @C09CT("user_watermark_image")
    public UrlModel userWatermarkImage;

    public PhotoModeImageUrlModel() {
    }

    public final PhotoModeImageUrlModel copy(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, List<MultiImageUrlInfo> list, Float f, UrlModel urlModel5, UrlModel urlModel6, String str, String str2, LivePhotoStruct livePhotoStruct, SubscriptionInfo subscriptionInfo) {
        return new PhotoModeImageUrlModel(urlModel, urlModel2, urlModel3, urlModel4, list, f, urlModel5, urlModel6, str, str2, livePhotoStruct, subscriptionInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoModeImageUrlModel)) {
            return false;
        }
        PhotoModeImageUrlModel photoModeImageUrlModel = (PhotoModeImageUrlModel) obj;
        return Intrinsics.LJFF(this.displayImageNoWatermark, photoModeImageUrlModel.displayImageNoWatermark) && Intrinsics.LJFF(this.ownerWatermarkImage, photoModeImageUrlModel.ownerWatermarkImage) && Intrinsics.LJFF(this.userWatermarkImage, photoModeImageUrlModel.userWatermarkImage) && Intrinsics.LJFF(this.thumbnail, photoModeImageUrlModel.thumbnail) && Intrinsics.LJFF(this.bitrateImages, photoModeImageUrlModel.bitrateImages) && Intrinsics.LJFF(this.aspectFillThreshold, photoModeImageUrlModel.aspectFillThreshold) && Intrinsics.LJFF(this.dynamicImage, photoModeImageUrlModel.dynamicImage) && Intrinsics.LJFF(this.translatedDisplayImage, photoModeImageUrlModel.translatedDisplayImage) && Intrinsics.LJFF(this.ocrLanguage, photoModeImageUrlModel.ocrLanguage) && Intrinsics.LJFF(this.altText, photoModeImageUrlModel.altText) && Intrinsics.LJFF(this.livePhotoStruct, photoModeImageUrlModel.livePhotoStruct) && Intrinsics.LJFF(this.subscriptionInfo, photoModeImageUrlModel.subscriptionInfo);
    }

    public String toString() {
        return "PhotoModeImageUrlModel(displayImageNoWatermark=" + this.displayImageNoWatermark + ", ownerWatermarkImage=" + this.ownerWatermarkImage + ", userWatermarkImage=" + this.userWatermarkImage + ", thumbnail=" + this.thumbnail + ", bitrateImages=" + this.bitrateImages + ", aspectFillThreshold=" + this.aspectFillThreshold + ", dynamicImage=" + this.dynamicImage + ", translatedDisplayImage=" + this.translatedDisplayImage + ", ocrLanguage=" + this.ocrLanguage + ", altText=" + this.altText + ", livePhotoStruct=" + this.livePhotoStruct + ", subscriptionInfo=" + this.subscriptionInfo + ')';
    }

    public final String getBlurHashCode() {
        UrlModel urlModel;
        ImagePreviewModel previewModel;
        ImagePreviewModel previewModel2;
        String data;
        if (this.blurHashCode == null && (urlModel = this.displayImageNoWatermark) != null && (previewModel = urlModel.getPreviewModel()) != null && Integer.valueOf(previewModel.getPreviewType()) != null && ((previewModel2 = this.displayImageNoWatermark.getPreviewModel()) == null || previewModel2.getPreviewType() != 0)) {
            ImagePreviewModel previewModel3 = this.displayImageNoWatermark.getPreviewModel();
            if (previewModel3 == null || (data = previewModel3.getData()) == null) {
                data = "";
            }
            this.blurHashCode = data;
        }
        return this.blurHashCode;
    }

    public final Integer getBlurHashPreviewType() {
        ImagePreviewModel previewModel;
        if (this.blurHashPreviewType == null) {
            UrlModel urlModel = this.displayImageNoWatermark;
            this.blurHashPreviewType = (urlModel == null || (previewModel = urlModel.getPreviewModel()) == null) ? null : Integer.valueOf(previewModel.getPreviewType());
        }
        return this.blurHashPreviewType;
    }

    public final boolean needSupportMultiRateSelect() {
        return this.sourceFrom != PhotoSourceFromScene.PUBLISH;
    }

    public final boolean isCoverLoadSuccess() {
        return this.isCoverLoadSuccess;
    }

    public final void setAdaptMultiRateErrCode(int i) {
        this.adaptMultiRateErrCode = i;
    }

    public final void setAspectFillThreshold(Float f) {
        this.aspectFillThreshold = f;
    }

    public final void setBitrateImages(List<MultiImageUrlInfo> list) {
        this.bitrateImages = list;
    }

    public final void setBlurHashCode(String str) {
        this.blurHashCode = str;
    }

    public final void setBlurHashPreviewType(Integer num) {
        this.blurHashPreviewType = num;
    }

    public final void setCoverLoadSuccess(boolean z) {
        this.isCoverLoadSuccess = z;
    }

    public final void setDarkMainColor(Integer num) {
        this.darkMainColor = num;
    }

    public final void setDynamicImage(UrlModel urlModel) {
        this.dynamicImage = urlModel;
    }

    public final void setGearName(String str) {
        this.gearName = str;
    }

    public final void setMultiRateNetSpeed(int i) {
        this.multiRateNetSpeed = i;
    }

    public final void setSelectedBitrateIndex(int i) {
        this.selectedBitrateIndex = i;
    }

    public final void setSourceFrom(PhotoSourceFromScene photoSourceFromScene) {
        this.sourceFrom = photoSourceFromScene;
    }

    public final void setSrLevel(Double d) {
        this.srLevel = d;
    }

    public final void setSubscriptionInfo(SubscriptionInfo subscriptionInfo) {
        this.subscriptionInfo = subscriptionInfo;
    }

    public final void setTargetMultiRateImageUrl(UrlModel urlModel) {
        this.targetMultiRateImageUrl = urlModel;
    }

    public PhotoModeImageUrlModel(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, List<MultiImageUrlInfo> list, Float f, UrlModel urlModel5, UrlModel urlModel6, String str, String str2, LivePhotoStruct livePhotoStruct, SubscriptionInfo subscriptionInfo) {
        this.displayImageNoWatermark = urlModel;
        this.ownerWatermarkImage = urlModel2;
        this.userWatermarkImage = urlModel3;
        this.thumbnail = urlModel4;
        this.bitrateImages = list;
        this.aspectFillThreshold = f;
        this.dynamicImage = urlModel5;
        this.translatedDisplayImage = urlModel6;
        this.ocrLanguage = str;
        this.altText = str2;
        this.livePhotoStruct = livePhotoStruct;
        this.subscriptionInfo = subscriptionInfo;
        this.adaptMultiRateErrCode = MultiBitrateAdapterErrorCode.DEFAULT_CODE.getCode();
        this.multiRateNetSpeed = -1;
        this.selectedBitrateIndex = -1;
        this.sourceFrom = PhotoSourceFromScene.DEFAULT;
    }
}
