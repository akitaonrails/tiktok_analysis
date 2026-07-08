package com.ss.android.ugc.aweme.infoSticker.customsticker;

import X.C004I;
import X.C1644450stX;
import X.C2188811AlT;
import X.C2404709bZ;
import X.C529150Kp7;
import com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class EditPreviewStickerState implements C004I {
    public final C529150Kp7 cancel;
    public final C1644450stX<Integer, Integer> compressBitmapEvent;
    public final CutoutData cutoutData;
    public final C2404709bZ cutoutError;
    public final C529150Kp7 finishCutoutSticker;
    public final MediaModel mediaModel;
    public final C529150Kp7 selectImage;
    public final C529150Kp7 startCutoutSticker;
    public final C529150Kp7 useSticker;

    public EditPreviewStickerState() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final EditPreviewStickerState copy(C529150Kp7 c529150Kp7, C529150Kp7 c529150Kp72, C529150Kp7 c529150Kp73, C529150Kp7 c529150Kp74, MediaModel mediaModel, C2404709bZ c2404709bZ, C529150Kp7 c529150Kp75, CutoutData cutoutData, C1644450stX<Integer, Integer> c1644450stX) {
        return new EditPreviewStickerState(c529150Kp7, c529150Kp72, c529150Kp73, c529150Kp74, mediaModel, c2404709bZ, c529150Kp75, cutoutData, c1644450stX);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditPreviewStickerState)) {
            return false;
        }
        EditPreviewStickerState editPreviewStickerState = (EditPreviewStickerState) obj;
        return Intrinsics.LJFF(this.selectImage, editPreviewStickerState.selectImage) && Intrinsics.LJFF(this.useSticker, editPreviewStickerState.useSticker) && Intrinsics.LJFF(this.startCutoutSticker, editPreviewStickerState.startCutoutSticker) && Intrinsics.LJFF(this.finishCutoutSticker, editPreviewStickerState.finishCutoutSticker) && Intrinsics.LJFF(this.mediaModel, editPreviewStickerState.mediaModel) && Intrinsics.LJFF(this.cutoutError, editPreviewStickerState.cutoutError) && Intrinsics.LJFF(this.cancel, editPreviewStickerState.cancel) && Intrinsics.LJFF(this.cutoutData, editPreviewStickerState.cutoutData) && Intrinsics.LJFF(this.compressBitmapEvent, editPreviewStickerState.compressBitmapEvent);
    }

    public int hashCode() {
        C529150Kp7 c529150Kp7 = this.selectImage;
        int iHashCode = (c529150Kp7 == null ? 0 : c529150Kp7.hashCode()) * 31;
        C529150Kp7 c529150Kp72 = this.useSticker;
        int iHashCode2 = (iHashCode + (c529150Kp72 == null ? 0 : c529150Kp72.hashCode())) * 31;
        C529150Kp7 c529150Kp73 = this.startCutoutSticker;
        int iHashCode3 = (iHashCode2 + (c529150Kp73 == null ? 0 : c529150Kp73.hashCode())) * 31;
        C529150Kp7 c529150Kp74 = this.finishCutoutSticker;
        int iHashCode4 = (iHashCode3 + (c529150Kp74 == null ? 0 : c529150Kp74.hashCode())) * 31;
        MediaModel mediaModel = this.mediaModel;
        int iHashCode5 = (iHashCode4 + (mediaModel == null ? 0 : mediaModel.hashCode())) * 31;
        C2404709bZ c2404709bZ = this.cutoutError;
        int iHashCode6 = (iHashCode5 + (c2404709bZ == null ? 0 : c2404709bZ.hashCode())) * 31;
        C529150Kp7 c529150Kp75 = this.cancel;
        int iHashCode7 = (iHashCode6 + (c529150Kp75 == null ? 0 : c529150Kp75.hashCode())) * 31;
        CutoutData cutoutData = this.cutoutData;
        int iHashCode8 = (iHashCode7 + (cutoutData == null ? 0 : cutoutData.hashCode())) * 31;
        C1644450stX<Integer, Integer> c1644450stX = this.compressBitmapEvent;
        return iHashCode8 + (c1644450stX != null ? c1644450stX.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditPreviewStickerState(selectImage=");
        sbLIZ.append(this.selectImage);
        sbLIZ.append(", useSticker=");
        sbLIZ.append(this.useSticker);
        sbLIZ.append(", startCutoutSticker=");
        sbLIZ.append(this.startCutoutSticker);
        sbLIZ.append(", finishCutoutSticker=");
        sbLIZ.append(this.finishCutoutSticker);
        sbLIZ.append(", mediaModel=");
        sbLIZ.append(this.mediaModel);
        sbLIZ.append(", cutoutError=");
        sbLIZ.append(this.cutoutError);
        sbLIZ.append(", cancel=");
        sbLIZ.append(this.cancel);
        sbLIZ.append(", cutoutData=");
        sbLIZ.append(this.cutoutData);
        sbLIZ.append(", compressBitmapEvent=");
        sbLIZ.append(this.compressBitmapEvent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C529150Kp7 getCancel() {
        return this.cancel;
    }

    public final C1644450stX<Integer, Integer> getCompressBitmapEvent() {
        return this.compressBitmapEvent;
    }

    public final CutoutData getCutoutData() {
        return this.cutoutData;
    }

    public final C2404709bZ getCutoutError() {
        return this.cutoutError;
    }

    public final C529150Kp7 getFinishCutoutSticker() {
        return this.finishCutoutSticker;
    }

    public final MediaModel getMediaModel() {
        return this.mediaModel;
    }

    public final C529150Kp7 getSelectImage() {
        return this.selectImage;
    }

    public final C529150Kp7 getStartCutoutSticker() {
        return this.startCutoutSticker;
    }

    public final C529150Kp7 getUseSticker() {
        return this.useSticker;
    }

    public EditPreviewStickerState(C529150Kp7 c529150Kp7, C529150Kp7 c529150Kp72, C529150Kp7 c529150Kp73, C529150Kp7 c529150Kp74, MediaModel mediaModel, C2404709bZ c2404709bZ, C529150Kp7 c529150Kp75, CutoutData cutoutData, C1644450stX<Integer, Integer> c1644450stX) {
        this.selectImage = c529150Kp7;
        this.useSticker = c529150Kp72;
        this.startCutoutSticker = c529150Kp73;
        this.finishCutoutSticker = c529150Kp74;
        this.mediaModel = mediaModel;
        this.cutoutError = c2404709bZ;
        this.cancel = c529150Kp75;
        this.cutoutData = cutoutData;
        this.compressBitmapEvent = c1644450stX;
    }
}
