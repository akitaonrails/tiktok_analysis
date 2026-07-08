package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.CaptionStickerExtraModel;
import com.ss.ugc.aweme.creation.base.DependencyInfo;
import com.ss.ugc.aweme.creation.base.EffectStickerExtraModel;
import com.ss.ugc.aweme.creation.base.HashtagStickerExtraModel;
import com.ss.ugc.aweme.creation.base.ImageStickerExtraModel;
import com.ss.ugc.aweme.creation.base.PointLengthInfo;
import com.ss.ugc.aweme.creation.base.StickerResModel;
import com.ss.ugc.aweme.creation.base.TextStickerExtraModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class StickerResModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<StickerResModel> CREATOR = new Parcelable.Creator<StickerResModel>() { // from class: X.0MhQ
        @Override // android.os.Parcelable.Creator
        public final StickerResModel createFromParcel(Parcel parcel) {
            Float fValueOf;
            Float fValueOf2;
            DependencyInfo dependencyInfo = (DependencyInfo) parcel.readParcelable(StickerResModel.class.getClassLoader());
            ImageStickerExtraModel imageStickerExtraModel = (ImageStickerExtraModel) parcel.readParcelable(StickerResModel.class.getClassLoader());
            TextStickerExtraModel textStickerExtraModel = (TextStickerExtraModel) parcel.readParcelable(StickerResModel.class.getClassLoader());
            EffectStickerExtraModel effectStickerExtraModel = (EffectStickerExtraModel) parcel.readParcelable(StickerResModel.class.getClassLoader());
            HashtagStickerExtraModel hashtagStickerExtraModel = (HashtagStickerExtraModel) parcel.readParcelable(StickerResModel.class.getClassLoader());
            CaptionStickerExtraModel captionStickerExtraModel = (CaptionStickerExtraModel) parcel.readParcelable(StickerResModel.class.getClassLoader());
            PointLengthInfo pointLengthInfo = (PointLengthInfo) parcel.readParcelable(StickerResModel.class.getClassLoader());
            PointLengthInfo pointLengthInfo2 = (PointLengthInfo) parcel.readParcelable(StickerResModel.class.getClassLoader());
            PointLengthInfo pointLengthInfo3 = (PointLengthInfo) parcel.readParcelable(StickerResModel.class.getClassLoader());
            PointLengthInfo pointLengthInfo4 = (PointLengthInfo) parcel.readParcelable(StickerResModel.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = null;
            if (parcel.readInt() != 0) {
                fValueOf = Float.valueOf(parcel.readFloat());
            } else {
                fValueOf = null;
            }
            if (parcel.readInt() != 0) {
                fValueOf2 = Float.valueOf(parcel.readFloat());
            } else {
                fValueOf2 = null;
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new StickerResModel(dependencyInfo, imageStickerExtraModel, textStickerExtraModel, effectStickerExtraModel, hashtagStickerExtraModel, captionStickerExtraModel, pointLengthInfo, pointLengthInfo2, pointLengthInfo3, pointLengthInfo4, string, string2, fValueOf, fValueOf2, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final StickerResModel[] newArray(int i) {
            return new StickerResModel[i];
        }
    };

    @C09CT("align_id")
    public String alignId;

    @C09CT("align_method")
    public String alignMethod;

    @C09CT("align_offsetX")
    public Float alignOffsetx;

    @C09CT("align_offsetY")
    public Float alignOffsety;

    @C09CT("angle")
    public Integer angle;

    @C09CT("caption_sticker_config")
    public CaptionStickerExtraModel captionStickerConfig;

    @C09CT("center_x")
    public PointLengthInfo centerX;

    @C09CT("center_y")
    public PointLengthInfo centerY;

    @C09CT("dependency_info")
    public DependencyInfo dependencyInfo;

    @C09CT("effect_sticker_config")
    public EffectStickerExtraModel effectStickerConfig;

    @C09CT("hashtag_sticker_config")
    public HashtagStickerExtraModel hashtagStickerConfig;

    @C09CT("height")
    public PointLengthInfo height;

    @C09CT("image_sticker_config")
    public ImageStickerExtraModel imageStickerConfig;

    @C09CT("text_sticker_config")
    public TextStickerExtraModel textStickerConfig;

    @C09CT("width")
    public PointLengthInfo width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.dependencyInfo, i);
        parcel.writeParcelable(this.imageStickerConfig, i);
        parcel.writeParcelable(this.textStickerConfig, i);
        parcel.writeParcelable(this.effectStickerConfig, i);
        parcel.writeParcelable(this.hashtagStickerConfig, i);
        parcel.writeParcelable(this.captionStickerConfig, i);
        parcel.writeParcelable(this.centerX, i);
        parcel.writeParcelable(this.centerY, i);
        parcel.writeParcelable(this.width, i);
        parcel.writeParcelable(this.height, i);
        parcel.writeString(this.alignMethod);
        parcel.writeString(this.alignId);
        Float f = this.alignOffsetx;
        if (f != null) {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        } else {
            parcel.writeInt(0);
        }
        Float f2 = this.alignOffsety;
        if (f2 != null) {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num = this.angle;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public final String getAlignId() {
        return this.alignId;
    }

    public final String getAlignMethod() {
        return this.alignMethod;
    }

    public final Float getAlignOffsetx() {
        return this.alignOffsetx;
    }

    public final Float getAlignOffsety() {
        return this.alignOffsety;
    }

    public final Integer getAngle() {
        return this.angle;
    }

    public final CaptionStickerExtraModel getCaptionStickerConfig() {
        return this.captionStickerConfig;
    }

    public final PointLengthInfo getCenterX() {
        return this.centerX;
    }

    public final PointLengthInfo getCenterY() {
        return this.centerY;
    }

    public final DependencyInfo getDependencyInfo() {
        return this.dependencyInfo;
    }

    public final EffectStickerExtraModel getEffectStickerConfig() {
        return this.effectStickerConfig;
    }

    public final HashtagStickerExtraModel getHashtagStickerConfig() {
        return this.hashtagStickerConfig;
    }

    public final PointLengthInfo getHeight() {
        return this.height;
    }

    public final ImageStickerExtraModel getImageStickerConfig() {
        return this.imageStickerConfig;
    }

    public final TextStickerExtraModel getTextStickerConfig() {
        return this.textStickerConfig;
    }

    public final PointLengthInfo getWidth() {
        return this.width;
    }

    public final void setAlignId(String str) {
        this.alignId = str;
    }

    public final void setAlignMethod(String str) {
        this.alignMethod = str;
    }

    public final void setAlignOffsetx(Float f) {
        this.alignOffsetx = f;
    }

    public final void setAlignOffsety(Float f) {
        this.alignOffsety = f;
    }

    public final void setAngle(Integer num) {
        this.angle = num;
    }

    public final void setCaptionStickerConfig(CaptionStickerExtraModel captionStickerExtraModel) {
        this.captionStickerConfig = captionStickerExtraModel;
    }

    public final void setCenterX(PointLengthInfo pointLengthInfo) {
        this.centerX = pointLengthInfo;
    }

    public final void setCenterY(PointLengthInfo pointLengthInfo) {
        this.centerY = pointLengthInfo;
    }

    public final void setDependencyInfo(DependencyInfo dependencyInfo) {
        this.dependencyInfo = dependencyInfo;
    }

    public final void setEffectStickerConfig(EffectStickerExtraModel effectStickerExtraModel) {
        this.effectStickerConfig = effectStickerExtraModel;
    }

    public final void setHashtagStickerConfig(HashtagStickerExtraModel hashtagStickerExtraModel) {
        this.hashtagStickerConfig = hashtagStickerExtraModel;
    }

    public final void setHeight(PointLengthInfo pointLengthInfo) {
        this.height = pointLengthInfo;
    }

    public final void setImageStickerConfig(ImageStickerExtraModel imageStickerExtraModel) {
        this.imageStickerConfig = imageStickerExtraModel;
    }

    public final void setTextStickerConfig(TextStickerExtraModel textStickerExtraModel) {
        this.textStickerConfig = textStickerExtraModel;
    }

    public final void setWidth(PointLengthInfo pointLengthInfo) {
        this.width = pointLengthInfo;
    }

    public StickerResModel(DependencyInfo dependencyInfo, ImageStickerExtraModel imageStickerExtraModel, TextStickerExtraModel textStickerExtraModel, EffectStickerExtraModel effectStickerExtraModel, HashtagStickerExtraModel hashtagStickerExtraModel, CaptionStickerExtraModel captionStickerExtraModel, PointLengthInfo pointLengthInfo, PointLengthInfo pointLengthInfo2, PointLengthInfo pointLengthInfo3, PointLengthInfo pointLengthInfo4, String str, String str2, Float f, Float f2, Integer num) {
        this.dependencyInfo = dependencyInfo;
        this.imageStickerConfig = imageStickerExtraModel;
        this.textStickerConfig = textStickerExtraModel;
        this.effectStickerConfig = effectStickerExtraModel;
        this.hashtagStickerConfig = hashtagStickerExtraModel;
        this.captionStickerConfig = captionStickerExtraModel;
        this.centerX = pointLengthInfo;
        this.centerY = pointLengthInfo2;
        this.width = pointLengthInfo3;
        this.height = pointLengthInfo4;
        this.alignMethod = str;
        this.alignId = str2;
        this.alignOffsetx = f;
        this.alignOffsety = f2;
        this.angle = num;
    }
}
