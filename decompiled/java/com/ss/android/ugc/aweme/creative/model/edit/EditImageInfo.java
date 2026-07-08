package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import X.C0MY0;
import X.C1441960ncw;
import X.C1447730nmF;
import X.C2354809Ko;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageTransformParams;
import com.ss.android.ugc.aweme.creative.model.edit.StoryMultiImageParams;
import com.ss.android.ugc.aweme.creative.model.edit.crop.CropData;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class EditImageInfo implements Parcelable, Serializable {

    @C09CT("is_full_screen")
    public boolean _isFullScreen;

    @C09CT("bitmap_height")
    public int bitmapHeight;

    @C09CT("bitmap_width")
    public int bitmapWidth;

    @C09CT("button_rotation")
    public Float buttonRotation;

    @C09CT("transform_params")
    public ImageTransformParams canvasTransformParams;

    @C09CT("crop_data")
    public CropData cropData;

    @C09CT("extra_map")
    public final HashMap<String, String> extraMap;

    @C09CT("extra_rotation")
    public Float extraRotation;

    @C09CT("initialize_scale_value")
    public Float initializeScaleValue;

    @C09CT("initialize_scale_value_nle")
    public Float initializeScaleValueNLE;

    @C09CT("is_local_image_with_enhance")
    public boolean isLocalImageWithEnhance;

    @C09CT("need_compile_local_image")
    public boolean needCompileLocalImage;

    @C09CT("need_compile_nle")
    public boolean needCompileNle;

    @C09CT("offset_x")
    public Float offsetX;

    @C09CT("offset_y")
    public Float offsetY;

    @C09CT("ratio")
    public float ratio;

    @C09CT("ratio_mode")
    public int ratioMode;

    @C09CT("scale_after_crop")
    public Float scaleAfterCrop;

    @C09CT("story_multi_image_params")
    public StoryMultiImageParams storyMultiImageParams;

    @C09CT("temp_synthesis_mini_path")
    @C0MY0
    public String tempSynthesisMiniPath;

    @C09CT("temp_synthesis_path")
    @C0MY0
    public String tempSynthesisPath;
    public static final C1447730nmF Companion = new Object() { // from class: X.0nmF
    };
    public static final Parcelable.Creator<EditImageInfo> CREATOR = new Parcelable.Creator<EditImageInfo>() { // from class: X.0niR
        @Override // android.os.Parcelable.Creator
        public final EditImageInfo createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Float fValueOf;
            Float fValueOf2;
            Float fValueOf3;
            Float fValueOf4;
            Float fValueOf5;
            Float fValueOf6;
            Float fValueOf7;
            ImageTransformParams imageTransformParamsCreateFromParcel;
            boolean z3;
            boolean z4;
            StoryMultiImageParams storyMultiImageParamsCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = parcel.readInt();
            float f = parcel.readFloat();
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                fValueOf2 = null;
            } else {
                fValueOf2 = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                fValueOf3 = null;
            } else {
                fValueOf3 = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                fValueOf4 = null;
            } else {
                fValueOf4 = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                fValueOf5 = null;
            } else {
                fValueOf5 = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                fValueOf6 = null;
            } else {
                fValueOf6 = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                fValueOf7 = null;
            } else {
                fValueOf7 = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                imageTransformParamsCreateFromParcel = null;
            } else {
                imageTransformParamsCreateFromParcel = ImageTransformParams.CREATOR.createFromParcel(parcel);
            }
            ImageTransformParams imageTransformParams = imageTransformParamsCreateFromParcel;
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i4 = parcel.readInt();
            HashMap map = new HashMap(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                map.put(parcel.readString(), parcel.readString());
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            CropData cropData = (CropData) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                storyMultiImageParamsCreateFromParcel = null;
            } else {
                storyMultiImageParamsCreateFromParcel = StoryMultiImageParams.CREATOR.createFromParcel(parcel);
            }
            return new EditImageInfo(string, string2, i, i2, z, z2, i3, f, fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, fValueOf6, fValueOf7, imageTransformParams, z3, map, z4, cropData, storyMultiImageParamsCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EditImageInfo[] newArray(int i) {
            return new EditImageInfo[i];
        }
    };

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public EditImageInfo() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        this(null, objArr, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, 0 == true ? 1 : 0, objArr10, 0 == true ? 1 : 0, objArr11, objArr12, 2097151, objArr13);
    }

    public final EditImageInfo copy(String str, String str2, int i, int i2, boolean z, boolean z2, int i3, float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, ImageTransformParams imageTransformParams, boolean z3, HashMap<String, String> map, boolean z4, CropData cropData, StoryMultiImageParams storyMultiImageParams) {
        return new EditImageInfo(str, str2, i, i2, z, z2, i3, f, f2, f3, f4, f5, f6, f7, f8, imageTransformParams, z3, map, z4, cropData, storyMultiImageParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditImageInfo)) {
            return false;
        }
        EditImageInfo editImageInfo = (EditImageInfo) obj;
        return Intrinsics.LJFF(this.tempSynthesisPath, editImageInfo.tempSynthesisPath) && Intrinsics.LJFF(this.tempSynthesisMiniPath, editImageInfo.tempSynthesisMiniPath) && this.bitmapWidth == editImageInfo.bitmapWidth && this.bitmapHeight == editImageInfo.bitmapHeight && this.isLocalImageWithEnhance == editImageInfo.isLocalImageWithEnhance && this.needCompileLocalImage == editImageInfo.needCompileLocalImage && this.ratioMode == editImageInfo.ratioMode && Float.compare(this.ratio, editImageInfo.ratio) == 0 && Intrinsics.LJFF(this.initializeScaleValue, editImageInfo.initializeScaleValue) && Intrinsics.LJFF(this.initializeScaleValueNLE, editImageInfo.initializeScaleValueNLE) && Intrinsics.LJFF(this.scaleAfterCrop, editImageInfo.scaleAfterCrop) && Intrinsics.LJFF(this.offsetX, editImageInfo.offsetX) && Intrinsics.LJFF(this.offsetY, editImageInfo.offsetY) && Intrinsics.LJFF(this.extraRotation, editImageInfo.extraRotation) && Intrinsics.LJFF(this.buttonRotation, editImageInfo.buttonRotation) && Intrinsics.LJFF(this.canvasTransformParams, editImageInfo.canvasTransformParams) && this._isFullScreen == editImageInfo._isFullScreen && Intrinsics.LJFF(this.extraMap, editImageInfo.extraMap) && this.needCompileNle == editImageInfo.needCompileNle && Intrinsics.LJFF(this.cropData, editImageInfo.cropData) && Intrinsics.LJFF(this.storyMultiImageParams, editImageInfo.storyMultiImageParams);
    }

    public String toString() {
        return "EditImageInfo(tempSynthesisPath=" + this.tempSynthesisPath + ", tempSynthesisMiniPath=" + this.tempSynthesisMiniPath + ", bitmapWidth=" + this.bitmapWidth + ", bitmapHeight=" + this.bitmapHeight + ", isLocalImageWithEnhance=" + this.isLocalImageWithEnhance + ", needCompileLocalImage=" + this.needCompileLocalImage + ", ratioMode=" + this.ratioMode + ", ratio=" + this.ratio + ", initializeScaleValue=" + this.initializeScaleValue + ", initializeScaleValueNLE=" + this.initializeScaleValueNLE + ", scaleAfterCrop=" + this.scaleAfterCrop + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", extraRotation=" + this.extraRotation + ", buttonRotation=" + this.buttonRotation + ", canvasTransformParams=" + this.canvasTransformParams + ", _isFullScreen=" + this._isFullScreen + ", extraMap=" + this.extraMap + ", needCompileNle=" + this.needCompileNle + ", cropData=" + this.cropData + ", storyMultiImageParams=" + this.storyMultiImageParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tempSynthesisPath);
        parcel.writeString(this.tempSynthesisMiniPath);
        parcel.writeInt(this.bitmapWidth);
        parcel.writeInt(this.bitmapHeight);
        parcel.writeInt(this.isLocalImageWithEnhance ? 1 : 0);
        parcel.writeInt(this.needCompileLocalImage ? 1 : 0);
        parcel.writeInt(this.ratioMode);
        parcel.writeFloat(this.ratio);
        Float f = this.initializeScaleValue;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.initializeScaleValueNLE;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Float f3 = this.scaleAfterCrop;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f3.floatValue());
        }
        Float f4 = this.offsetX;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f4.floatValue());
        }
        Float f5 = this.offsetY;
        if (f5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f5.floatValue());
        }
        Float f6 = this.extraRotation;
        if (f6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f6.floatValue());
        }
        Float f7 = this.buttonRotation;
        if (f7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f7.floatValue());
        }
        ImageTransformParams imageTransformParams = this.canvasTransformParams;
        if (imageTransformParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageTransformParams.writeToParcel(parcel, i);
        }
        parcel.writeInt(this._isFullScreen ? 1 : 0);
        HashMap<String, String> map = this.extraMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeInt(this.needCompileNle ? 1 : 0);
        parcel.writeSerializable(this.cropData);
        StoryMultiImageParams storyMultiImageParams = this.storyMultiImageParams;
        if (storyMultiImageParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storyMultiImageParams.writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        String str = this.tempSynthesisPath;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tempSynthesisMiniPath;
        int iHashCode2 = (((((((((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.bitmapWidth) * 31) + this.bitmapHeight) * 31) + C786410Ut5.Z2(this.isLocalImageWithEnhance)) * 31) + C786410Ut5.Z2(this.needCompileLocalImage)) * 31) + this.ratioMode) * 31) + Float.floatToIntBits(this.ratio)) * 31;
        Float f = this.initializeScaleValue;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.initializeScaleValueNLE;
        int iHashCode4 = (iHashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.scaleAfterCrop;
        int iHashCode5 = (iHashCode4 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.offsetX;
        int iHashCode6 = (iHashCode5 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.offsetY;
        int iHashCode7 = (iHashCode6 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.extraRotation;
        int iHashCode8 = (iHashCode7 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this.buttonRotation;
        int iHashCode9 = (iHashCode8 + (f7 == null ? 0 : f7.hashCode())) * 31;
        ImageTransformParams imageTransformParams = this.canvasTransformParams;
        int iHashCode10 = (((((((iHashCode9 + (imageTransformParams == null ? 0 : imageTransformParams.hashCode())) * 31) + C786410Ut5.Z2(this._isFullScreen)) * 31) + this.extraMap.hashCode()) * 31) + C786410Ut5.Z2(this.needCompileNle)) * 31;
        CropData cropData = this.cropData;
        int iHashCode11 = (iHashCode10 + (cropData == null ? 0 : cropData.hashCode())) * 31;
        StoryMultiImageParams storyMultiImageParams = this.storyMultiImageParams;
        return iHashCode11 + (storyMultiImageParams != null ? storyMultiImageParams.hashCode() : 0);
    }

    public final boolean isFullScreen() {
        if (C1441960ncw.LIZ()) {
            return false;
        }
        return this._isFullScreen;
    }

    public final int getBitmapHeight() {
        return this.bitmapHeight;
    }

    public final int getBitmapWidth() {
        return this.bitmapWidth;
    }

    public final Float getButtonRotation() {
        return this.buttonRotation;
    }

    public final ImageTransformParams getCanvasTransformParams() {
        return this.canvasTransformParams;
    }

    public final CropData getCropData() {
        return this.cropData;
    }

    public final HashMap<String, String> getExtraMap() {
        return this.extraMap;
    }

    public final Float getExtraRotation() {
        return this.extraRotation;
    }

    public final Float getInitializeScaleValue() {
        return this.initializeScaleValue;
    }

    public final Float getInitializeScaleValueNLE() {
        return this.initializeScaleValueNLE;
    }

    public final boolean getNeedCompileLocalImage() {
        return this.needCompileLocalImage;
    }

    public final boolean getNeedCompileNle() {
        return this.needCompileNle;
    }

    public final Float getOffsetX() {
        return this.offsetX;
    }

    public final Float getOffsetY() {
        return this.offsetY;
    }

    public final float getRatio() {
        return this.ratio;
    }

    public final int getRatioMode() {
        return this.ratioMode;
    }

    public final Float getScaleAfterCrop() {
        return this.scaleAfterCrop;
    }

    public final StoryMultiImageParams getStoryMultiImageParams() {
        return this.storyMultiImageParams;
    }

    public final String getTempSynthesisMiniPath() {
        return this.tempSynthesisMiniPath;
    }

    public final String getTempSynthesisPath() {
        return this.tempSynthesisPath;
    }

    public final boolean isLocalImageWithEnhance() {
        return this.isLocalImageWithEnhance;
    }

    public final void setBitmapHeight(int i) {
        this.bitmapHeight = i;
    }

    public final void setBitmapWidth(int i) {
        this.bitmapWidth = i;
    }

    public final void setButtonRotation(Float f) {
        this.buttonRotation = f;
    }

    public final void setCanvasTransformParams(ImageTransformParams imageTransformParams) {
        this.canvasTransformParams = imageTransformParams;
    }

    public final void setCropData(CropData cropData) {
        this.cropData = cropData;
    }

    public final void setExtraRotation(Float f) {
        this.extraRotation = f;
    }

    public final void setFullScreen(boolean z) {
        if (!C1441960ncw.LIZ()) {
            this._isFullScreen = z;
        }
    }

    public final void setInitializeScaleValue(Float f) {
        this.initializeScaleValue = f;
    }

    public final void setInitializeScaleValueNLE(Float f) {
        this.initializeScaleValueNLE = f;
    }

    public final void setLocalImageWithEnhance(boolean z) {
        this.isLocalImageWithEnhance = z;
    }

    public final void setNeedCompileLocalImage(boolean z) {
        this.needCompileLocalImage = z;
    }

    public final void setNeedCompileNle(boolean z) {
        this.needCompileNle = z;
    }

    public final void setOffsetX(Float f) {
        this.offsetX = f;
    }

    public final void setOffsetY(Float f) {
        this.offsetY = f;
    }

    public final void setRatio(float f) {
        this.ratio = f;
    }

    public final void setRatioMode(int i) {
        this.ratioMode = i;
    }

    public final void setScaleAfterCrop(Float f) {
        this.scaleAfterCrop = f;
    }

    public final void setStoryMultiImageParams(StoryMultiImageParams storyMultiImageParams) {
        this.storyMultiImageParams = storyMultiImageParams;
    }

    public final void setTempSynthesisMiniPath(String str) {
        this.tempSynthesisMiniPath = str;
    }

    public final void setTempSynthesisPath(String str) {
        this.tempSynthesisPath = str;
    }

    public final void setTempSynthesisMiniPath(String str, boolean z) {
        if (z && !Intrinsics.LJFF(str, this.tempSynthesisMiniPath)) {
            C2354809Ko.LJIIIIZZ(this.tempSynthesisMiniPath);
        }
        this.tempSynthesisMiniPath = str;
    }

    public final void setTempSynthesisPath(String str, boolean z) {
        if (z && !Intrinsics.LJFF(str, this.tempSynthesisPath)) {
            C2354809Ko.LJIIIIZZ(this.tempSynthesisPath);
        }
        this.tempSynthesisPath = str;
    }

    public EditImageInfo(String str, String str2, int i, int i2, boolean z, boolean z2, int i3, float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, ImageTransformParams imageTransformParams, boolean z3, HashMap<String, String> map, boolean z4, CropData cropData, StoryMultiImageParams storyMultiImageParams) {
        this.tempSynthesisPath = str;
        this.tempSynthesisMiniPath = str2;
        this.bitmapWidth = i;
        this.bitmapHeight = i2;
        this.isLocalImageWithEnhance = z;
        this.needCompileLocalImage = z2;
        this.ratioMode = i3;
        this.ratio = f;
        this.initializeScaleValue = f2;
        this.initializeScaleValueNLE = f3;
        this.scaleAfterCrop = f4;
        this.offsetX = f5;
        this.offsetY = f6;
        this.extraRotation = f7;
        this.buttonRotation = f8;
        this.canvasTransformParams = imageTransformParams;
        this._isFullScreen = z3;
        this.extraMap = map;
        this.needCompileNle = z4;
        this.cropData = cropData;
        this.storyMultiImageParams = storyMultiImageParams;
    }

    public /* synthetic */ EditImageInfo(String str, String str2, int i, int i2, boolean z, boolean z2, int i3, float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, ImageTransformParams imageTransformParams, boolean z3, HashMap map, boolean z4, CropData cropData, StoryMultiImageParams storyMultiImageParams, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? false : z, (i4 & 32) != 0 ? false : z2, (i4 & 64) != 0 ? -1 : i3, (i4 & 128) != 0 ? -1.0f : f, (i4 & 256) != 0 ? null : f2, (i4 & 512) != 0 ? null : f3, (i4 & 1024) != 0 ? null : f4, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : f5, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : f6, (i4 & 8192) != 0 ? null : f7, (i4 & 16384) != 0 ? null : f8, (32768 & i4) != 0 ? null : imageTransformParams, (65536 & i4) != 0 ? false : z3, (131072 & i4) != 0 ? new HashMap() : map, (262144 & i4) != 0 ? false : z4, (524288 & i4) != 0 ? null : cropData, (i4 & 1048576) != 0 ? null : storyMultiImageParams);
    }
}
