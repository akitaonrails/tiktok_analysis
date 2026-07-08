package com.ss.android.ugc.aweme.creative.model.edit;

import X.C040H;
import X.C09CT;
import X.C0MY0;
import X.C13BV;
import X.C13LP;
import X.C1441960ncw;
import X.C1697810uHb;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSurfaceData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageUiBusinessData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageAlbumData implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageAlbumData> CREATOR = new Parcelable.Creator<ImageAlbumData>() { // from class: X.0nNX
        @Override // android.os.Parcelable.Creator
        public final ImageAlbumData createFromParcel(Parcel parcel) {
            boolean z;
            ImageStickerInfoNewEngine imageStickerInfoNewEngineCreateFromParcel;
            boolean z2;
            Boolean boolValueOf;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SingleImageData.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            ImageSurfaceData imageSurfaceDataCreateFromParcel = ImageSurfaceData.CREATOR.createFromParcel(parcel);
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            AICoverInfo aICoverInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                imageStickerInfoNewEngineCreateFromParcel = null;
            } else {
                imageStickerInfoNewEngineCreateFromParcel = ImageStickerInfoNewEngine.CREATOR.createFromParcel(parcel);
            }
            ImageStickerInfoNewEngine imageStickerInfoNewEngine = imageStickerInfoNewEngineCreateFromParcel;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf = Boolean.valueOf(z2);
            }
            ImageUiBusinessData imageUiBusinessDataCreateFromParcel = ImageUiBusinessData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            String string = parcel.readString();
            int i6 = parcel.readInt();
            if (parcel.readInt() != 0) {
                aICoverInfoCreateFromParcel = AICoverInfo.CREATOR.createFromParcel(parcel);
            }
            return new ImageAlbumData(arrayList, i3, z, imageSurfaceDataCreateFromParcel, i4, i5, imageStickerInfoNewEngine, arrayListCreateStringArrayList, boolValueOf, imageUiBusinessDataCreateFromParcel, z3, z4, z5, z6, z7, z8, z9, z10, string, i6, aICoverInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageAlbumData[] newArray(int i) {
            return new ImageAlbumData[i];
        }
    };

    @C09CT("photo_editor_action_list")
    public ArrayList<String> actionList;

    @C09CT("ai_cover_info")
    public AICoverInfo aiCoverInfo;

    @C09CT("auto_enhance_on")
    public boolean autoEnhanceOn;

    @C09CT("config_path")
    @C0MY0
    public String configPath;

    @C09CT("current_index")
    public int currentPreviewIndex;

    @C09CT("image_list")
    public List<SingleImageData> imageList;

    @C09CT("image_ui_business_data")
    public ImageUiBusinessData imageUiBusinessData;

    @C09CT("is_canvas_converted")
    public boolean isCanvasConverted;

    @C09CT("is_differentiated_layout")
    public boolean isDifferentiatedLayout;

    @C09CT("is_from_camera_photo")
    public boolean isFromCameraPhoto;

    @C09CT("is_new_differentiated_layout")
    public boolean isOptimizedDifferentiatedLayout;

    @C09CT("is_single_photo_using_image_edit_framework")
    public boolean isSinglePhotoUsingImageEditFramework;

    @C09CT("is_single_when_init")
    public boolean isSingleWhenInit;

    @C09CT("is_temp_image_mode")
    public boolean isTempImageMode;

    @C09CT("is_text_mode_when_init")
    public boolean isTextModeWhenInit;

    @C09CT("max_image_height")
    public int maxImageHeight;

    @C09CT("max_image_width")
    public int maxImageWidth;

    @C09CT("stickerInfo_new_engine")
    public ImageStickerInfoNewEngine stickerInfoNewEngine;

    @C09CT("support_do_not_auto_cut")
    public int supportDoNotAutoCut;

    @C09CT("surface_data")
    public ImageSurfaceData surfaceData;

    @C040H
    public Boolean useTextNewEngineInMultiPhotoMode;

    public ImageAlbumData() {
        this(null, 0, false, null, 0, 0, null, null, null, null, false, false, false, false, false, false, false, false, null, 0, null, 2097151, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<SingleImageData> list = this.imageList;
        parcel.writeInt(list.size());
        Iterator<SingleImageData> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.supportDoNotAutoCut);
        parcel.writeInt(this.autoEnhanceOn ? 1 : 0);
        this.surfaceData.writeToParcel(parcel, i);
        parcel.writeInt(this.maxImageWidth);
        parcel.writeInt(this.maxImageHeight);
        ImageStickerInfoNewEngine imageStickerInfoNewEngine = this.stickerInfoNewEngine;
        if (imageStickerInfoNewEngine == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageStickerInfoNewEngine.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.actionList);
        Boolean bool = this.useTextNewEngineInMultiPhotoMode;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        this.imageUiBusinessData.writeToParcel(parcel, i);
        parcel.writeInt(this.isSingleWhenInit ? 1 : 0);
        parcel.writeInt(this.isTextModeWhenInit ? 1 : 0);
        parcel.writeInt(this.isTempImageMode ? 1 : 0);
        parcel.writeInt(this.isCanvasConverted ? 1 : 0);
        parcel.writeInt(this.isDifferentiatedLayout ? 1 : 0);
        parcel.writeInt(this.isOptimizedDifferentiatedLayout ? 1 : 0);
        parcel.writeInt(this.isSinglePhotoUsingImageEditFramework ? 1 : 0);
        parcel.writeInt(this.isFromCameraPhoto ? 1 : 0);
        parcel.writeString(this.configPath);
        parcel.writeInt(this.currentPreviewIndex);
        AICoverInfo aICoverInfo = this.aiCoverInfo;
        if (aICoverInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aICoverInfo.writeToParcel(parcel, i);
        }
    }

    public final Map<SingleImageData, Integer> getNeedCompileImages() {
        HashMap map = new HashMap();
        int i = 0;
        for (SingleImageData singleImageData : this.imageList) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            SingleImageData singleImageData2 = singleImageData;
            if (singleImageData2.getEditImageInfo().getNeedCompileLocalImage()) {
                map.put(singleImageData2, Integer.valueOf(i));
            }
            i = i2;
        }
        return map;
    }

    public final List<TextStickerModel> getNewEngineTextStickers() {
        CopyOnWriteArrayList<TextStickerModel> textStickerModels;
        ArrayList arrayList = new ArrayList();
        Iterator<SingleImageData> it2 = this.imageList.iterator();
        while (it2.hasNext()) {
            ImageStickerInfoNewEngine stickerInfoNewEngine = it2.next().getStickerInfoNewEngine();
            if (stickerInfoNewEngine != null && (textStickerModels = stickerInfoNewEngine.getTextStickerModels()) != null) {
                arrayList.addAll(textStickerModels);
            }
        }
        return arrayList;
    }

    public final boolean hasInfoSticker() {
        List<SingleImageData> list = this.imageList;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<SingleImageData> it2 = list.iterator();
            while (it2.hasNext()) {
                List<StickerItemModel> stickers = it2.next().getStickerInfo().getStickers();
                if (!(stickers instanceof Collection) || !stickers.isEmpty()) {
                    Iterator<StickerItemModel> it3 = stickers.iterator();
                    while (it3.hasNext()) {
                        if (it3.next().isNormalInfoSticker()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean hasMentionStickers() {
        List<MentionStickerModel> mentionStickerModels;
        List<SingleImageData> list = this.imageList;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<SingleImageData> it2 = list.iterator();
            while (it2.hasNext()) {
                ImageStickerInfoNewEngine stickerInfoNewEngine = it2.next().getStickerInfoNewEngine();
                if (stickerInfoNewEngine != null && (mentionStickerModels = stickerInfoNewEngine.getMentionStickerModels()) != null && !mentionStickerModels.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean hasTextStickers() {
        CopyOnWriteArrayList<TextStickerModel> textStickerModels;
        if (Intrinsics.LJFF(this.useTextNewEngineInMultiPhotoMode, Boolean.TRUE)) {
            List<SingleImageData> list = this.imageList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<SingleImageData> it2 = list.iterator();
                while (it2.hasNext()) {
                    ImageStickerInfoNewEngine stickerInfoNewEngine = it2.next().getStickerInfoNewEngine();
                    if (stickerInfoNewEngine != null && (textStickerModels = stickerInfoNewEngine.getTextStickerModels()) != null && !textStickerModels.isEmpty()) {
                        return true;
                    }
                }
            }
            return false;
        }
        List<SingleImageData> list2 = this.imageList;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<SingleImageData> it3 = list2.iterator();
        while (it3.hasNext()) {
            List<StickerItemModel> stickers = it3.next().getStickerInfo().getStickers();
            if (stickers != null && !stickers.isEmpty()) {
                Iterator<StickerItemModel> it4 = stickers.iterator();
                while (it4.hasNext()) {
                    if (it4.next().isTextSticker()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final ArrayList<String> getActionList() {
        return this.actionList;
    }

    public final AICoverInfo getAiCoverInfo() {
        return this.aiCoverInfo;
    }

    public final boolean getAutoEnhanceOn() {
        return this.autoEnhanceOn;
    }

    public final String getConfigPath() {
        return this.configPath;
    }

    public final int getCurrentPreviewIndex() {
        return this.currentPreviewIndex;
    }

    public final List<SingleImageData> getImageList() {
        return this.imageList;
    }

    public final ImageUiBusinessData getImageUiBusinessData() {
        return this.imageUiBusinessData;
    }

    public final int getMaxImageHeight() {
        return this.maxImageHeight;
    }

    public final int getMaxImageWidth() {
        return this.maxImageWidth;
    }

    public final ImageStickerInfoNewEngine getStickerInfoNewEngine() {
        return this.stickerInfoNewEngine;
    }

    public final int getSupportDoNotAutoCut() {
        return this.supportDoNotAutoCut;
    }

    public final ImageSurfaceData getSurfaceData() {
        return this.surfaceData;
    }

    public final Boolean getUseTextNewEngineInMultiPhotoMode() {
        return this.useTextNewEngineInMultiPhotoMode;
    }

    public final boolean isCanvasConverted() {
        return this.isCanvasConverted;
    }

    public final boolean isDifferentiatedLayout() {
        return this.isDifferentiatedLayout;
    }

    public final boolean isFromCameraPhoto() {
        return this.isFromCameraPhoto;
    }

    public final boolean isOptimizedDifferentiatedLayout() {
        return this.isOptimizedDifferentiatedLayout;
    }

    public final boolean isSinglePhotoUsingImageEditFramework() {
        return this.isSinglePhotoUsingImageEditFramework;
    }

    public final boolean isSingleWhenInit() {
        return this.isSingleWhenInit;
    }

    public final boolean isTempImageMode() {
        return this.isTempImageMode;
    }

    public final boolean isTextModeWhenInit() {
        return this.isTextModeWhenInit;
    }

    public final String getAllPicSize(int i) {
        boolean z;
        String strLIZIZ;
        List<SingleImageData> list = this.imageList;
        ArrayList arrayList = new ArrayList();
        for (SingleImageData singleImageData : list) {
            if (singleImageData.getSrcImageInfo().getWidth() != 0 && singleImageData.getSrcImageInfo().getHeight() != 0) {
                float width = singleImageData.getSrcImageInfo().getWidth() / singleImageData.getSrcImageInfo().getHeight();
                if (C1441960ncw.LIZ() && singleImageData.getImageRatio() < width) {
                    z = true;
                } else {
                    z = false;
                }
                Pair<Integer, Integer> pairCalCompileOutputSize = calCompileOutputSize(singleImageData, this, i, singleImageData.getImageRatio(), z);
                int iIntValue = pairCalCompileOutputSize.getFirst().intValue();
                int iIntValue2 = pairCalCompileOutputSize.getSecond().intValue();
                int iLIZ = LIZ(iIntValue, iIntValue2);
                if (iLIZ != 0) {
                    int i2 = iIntValue / iLIZ;
                    int i3 = iIntValue2 / iLIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i2);
                    sbLIZ.append(':');
                    sbLIZ.append(i3);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(iIntValue);
                    sbLIZ2.append(':');
                    sbLIZ2.append(iIntValue2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                if (strLIZIZ != null) {
                    arrayList.add(strLIZIZ);
                }
            }
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    public final int getIsCropValue(Function2<? super Float, ? super Float, Float> function2) {
        List<SingleImageData> list = this.imageList;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<SingleImageData> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().isManualCrop()) {
                    return 1;
                }
            }
        }
        List<SingleImageData> list2 = this.imageList;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return 0;
        }
        Iterator<SingleImageData> it3 = list2.iterator();
        while (it3.hasNext()) {
            if (it3.next().isAutoCrop(this.surfaceData, function2)) {
                return 9;
            }
        }
        return 0;
    }

    public final void setActionList(ArrayList<String> arrayList) {
        this.actionList = arrayList;
    }

    public final void setAiCoverInfo(AICoverInfo aICoverInfo) {
        this.aiCoverInfo = aICoverInfo;
    }

    public final void setAutoEnhanceOn(boolean z) {
        this.autoEnhanceOn = z;
    }

    public final void setCanvasConverted(boolean z) {
        this.isCanvasConverted = z;
    }

    public final void setConfigPath(String str) {
        this.configPath = str;
    }

    public final void setCurrentPreviewIndex(int i) {
        this.currentPreviewIndex = i;
    }

    public final void setDifferentiatedLayout(boolean z) {
        this.isDifferentiatedLayout = z;
    }

    public final void setFromCameraPhoto(boolean z) {
        this.isFromCameraPhoto = z;
    }

    public final void setImageList(List<SingleImageData> list) {
        this.imageList = list;
    }

    public final void setImageUiBusinessData(ImageUiBusinessData imageUiBusinessData) {
        this.imageUiBusinessData = imageUiBusinessData;
    }

    public final void setMaxImageHeight(int i) {
        this.maxImageHeight = i;
    }

    public final void setMaxImageWidth(int i) {
        this.maxImageWidth = i;
    }

    public final void setOptimizedDifferentiatedLayout(boolean z) {
        this.isOptimizedDifferentiatedLayout = z;
    }

    public final void setSinglePhotoUsingImageEditFramework(boolean z) {
        this.isSinglePhotoUsingImageEditFramework = z;
    }

    public final void setSingleWhenInit(boolean z) {
        this.isSingleWhenInit = z;
    }

    public final void setStickerInfoNewEngine(ImageStickerInfoNewEngine imageStickerInfoNewEngine) {
        this.stickerInfoNewEngine = imageStickerInfoNewEngine;
    }

    public final void setSupportDoNotAutoCut(int i) {
        this.supportDoNotAutoCut = i;
    }

    public final void setSurfaceData(ImageSurfaceData imageSurfaceData) {
        this.surfaceData = imageSurfaceData;
    }

    public final void setTempImageMode(boolean z) {
        this.isTempImageMode = z;
    }

    public final void setTextModeWhenInit(boolean z) {
        this.isTextModeWhenInit = z;
    }

    public final void setUseTextNewEngineInMultiPhotoMode(Boolean bool) {
        this.useTextNewEngineInMultiPhotoMode = bool;
    }

    public static int LIZ(int i, int i2) {
        if (i2 == 0) {
            return i;
        }
        return LIZ(i2, i % i2);
    }

    public static Pair LIZIZ(SingleImageData singleImageData, int i) {
        if (singleImageData.getSrcImageInfo().getHeight() > singleImageData.getSrcImageInfo().getWidth()) {
            return new Pair(Integer.valueOf((int) (i * 0.5625f)), Integer.valueOf(i));
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf((int) (i * 0.5625f)));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0311  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> calCompileOutputSize(com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r23, com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r24, int r25, float r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 1599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData.calCompileOutputSize(com.ss.android.ugc.aweme.creative.model.edit.SingleImageData, com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData, int, float, boolean):kotlin.Pair");
    }

    public ImageAlbumData(List<SingleImageData> list, int i, boolean z, ImageSurfaceData imageSurfaceData, int i2, int i3, ImageStickerInfoNewEngine imageStickerInfoNewEngine, ArrayList<String> arrayList, Boolean bool, ImageUiBusinessData imageUiBusinessData, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str, int i4, AICoverInfo aICoverInfo) {
        this.imageList = list;
        this.supportDoNotAutoCut = i;
        this.autoEnhanceOn = z;
        this.surfaceData = imageSurfaceData;
        this.maxImageWidth = i2;
        this.maxImageHeight = i3;
        this.stickerInfoNewEngine = imageStickerInfoNewEngine;
        this.actionList = arrayList;
        this.useTextNewEngineInMultiPhotoMode = bool;
        this.imageUiBusinessData = imageUiBusinessData;
        this.isSingleWhenInit = z2;
        this.isTextModeWhenInit = z3;
        this.isTempImageMode = z4;
        this.isCanvasConverted = z5;
        this.isDifferentiatedLayout = z6;
        this.isOptimizedDifferentiatedLayout = z7;
        this.isSinglePhotoUsingImageEditFramework = z8;
        this.isFromCameraPhoto = z9;
        this.configPath = str;
        this.currentPreviewIndex = i4;
        this.aiCoverInfo = aICoverInfo;
    }

    public ImageAlbumData(List list, int i, boolean z, ImageSurfaceData imageSurfaceData, int i2, int i3, ImageStickerInfoNewEngine imageStickerInfoNewEngine, ArrayList arrayList, Boolean bool, ImageUiBusinessData imageUiBusinessData, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str, int i4, AICoverInfo aICoverInfo, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? C13BV.INSTANCE : list, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? false : z, (i5 & 8) != 0 ? new ImageSurfaceData(0, 0, 0, 7, null) : imageSurfaceData, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) != 0 ? null : imageStickerInfoNewEngine, (i5 & 128) != 0 ? null : arrayList, (i5 & 256) != 0 ? null : bool, (i5 & 512) != 0 ? new ImageUiBusinessData(false, null) : imageUiBusinessData, (i5 & 1024) != 0 ? false : z2, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z3, (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z4, (i5 & 8192) != 0 ? false : z5, (i5 & 16384) != 0 ? false : z6, (32768 & i5) != 0 ? false : z7, (65536 & i5) != 0 ? false : z8, (131072 & i5) != 0 ? false : z9, (262144 & i5) != 0 ? null : str, (524288 & i5) != 0 ? 0 : i4, (i5 & 1048576) != 0 ? null : aICoverInfo);
    }
}
