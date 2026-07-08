package com.ss.android.vesdk;

import X.C08FF;
import X.C1DIV;
import X.C2188811AlT;
import X.C2325341G0m;
import X.EnumC1778840wOI;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes36.dex */
public class VEDisplaySettings implements Parcelable {
    public static final Parcelable.Creator<VEDisplaySettings> CREATOR = new C2325341G0m(18);
    public boolean enableReducePerFrameCallbackOptimization;
    public long mBgColor;
    public VESize mCamOutSize;
    public long mCameraHDR10BitDynamicRangeProfile;
    public VESize mCanvasSize;
    public float mDisplayRatio;
    public C1DIV mDisplayRatioMode;
    public int mDisplayRotation;
    public VEDisPlayEffect mEffect;
    public float mEffectIntensity;
    public int mEffectRotation;
    public boolean mEnablePreviewResolutionDowngrading;
    public EnumC1778840wOI mFitMode;
    public boolean mFlipX;
    public boolean mFlipY;
    public boolean mForceAdaptSurfaceSize;
    public VESize mLayoutSize;
    public VESize mPreviewDowngradingRenderSize;
    public VESize mRenderSize;
    public int mRotation;
    public long mTargetHDR10BitDynamicRangeProfile;
    public int mTranslateX;
    public int mTranslateY;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static final class Builder {
        public final VEDisplaySettings mVEPreviewRaidoSettings;

        public Builder() {
            this.mVEPreviewRaidoSettings = new VEDisplaySettings();
        }

        public VEDisplaySettings build() {
            return this.mVEPreviewRaidoSettings;
        }

        public Builder(VEDisplaySettings vEDisplaySettings) {
            this.mVEPreviewRaidoSettings = vEDisplaySettings;
        }

        public Builder enablePreviewResolutionDowngrading(boolean z) {
            this.mVEPreviewRaidoSettings.mEnablePreviewResolutionDowngrading = z;
            return this;
        }

        public Builder enableReducePerFrameCallbackOptimization(boolean z) {
            this.mVEPreviewRaidoSettings.enableReducePerFrameCallbackOptimization = z;
            return this;
        }

        public Builder setBackgroundColor(long j) {
            this.mVEPreviewRaidoSettings.mBgColor = j;
            return this;
        }

        public Builder setCamOutSize(VESize vESize) {
            this.mVEPreviewRaidoSettings.mCamOutSize = vESize;
            return this;
        }

        public Builder setCanvasSize(VESize vESize) {
            this.mVEPreviewRaidoSettings.mCanvasSize = vESize;
            return this;
        }

        public Builder setDisplayEffect(VEDisPlayEffect vEDisPlayEffect) {
            this.mVEPreviewRaidoSettings.mEffect = vEDisPlayEffect;
            return this;
        }

        public Builder setDisplayEffectIntensity(float f) {
            this.mVEPreviewRaidoSettings.mEffectIntensity = f;
            return this;
        }

        public Builder setDisplayLayoutSize(VESize vESize) {
            this.mVEPreviewRaidoSettings.mLayoutSize = vESize;
            return this;
        }

        public Builder setDisplayRatio(float f) {
            this.mVEPreviewRaidoSettings.mDisplayRatio = f;
            return this;
        }

        public Builder setDisplayRatioMode(C1DIV c1div) {
            this.mVEPreviewRaidoSettings.mDisplayRatioMode = c1div;
            return this;
        }

        public Builder setDisplayRotation(int i) {
            this.mVEPreviewRaidoSettings.mDisplayRotation = i;
            return this;
        }

        public Builder setEffectRotation(int i) {
            this.mVEPreviewRaidoSettings.mEffectRotation = i;
            return this;
        }

        public Builder setFitMode(EnumC1778840wOI enumC1778840wOI) {
            this.mVEPreviewRaidoSettings.mFitMode = enumC1778840wOI;
            return this;
        }

        public Builder setFlipX(boolean z) {
            this.mVEPreviewRaidoSettings.mFlipX = z;
            return this;
        }

        public Builder setFlipY(boolean z) {
            this.mVEPreviewRaidoSettings.mFlipY = z;
            return this;
        }

        public Builder setForceAdaptSurfaceSize(boolean z) {
            this.mVEPreviewRaidoSettings.mForceAdaptSurfaceSize = z;
            return this;
        }

        public Builder setPreviewDowngradingRenderSize(VESize vESize) {
            this.mVEPreviewRaidoSettings.mPreviewDowngradingRenderSize = vESize;
            return this;
        }

        public Builder setRenderSize(VESize vESize) {
            this.mVEPreviewRaidoSettings.mRenderSize = vESize;
            return this;
        }

        public Builder setRotation(int i) {
            this.mVEPreviewRaidoSettings.mRotation = i;
            return this;
        }

        public Builder setTranslateX(int i) {
            this.mVEPreviewRaidoSettings.mTranslateX = i;
            return this;
        }

        public Builder setTranslateY(int i) {
            this.mVEPreviewRaidoSettings.mTranslateY = i;
            return this;
        }

        public Builder setHDR10BitDynamicRangeProfile(long j, long j2) {
            VEDisplaySettings vEDisplaySettings = this.mVEPreviewRaidoSettings;
            vEDisplaySettings.mCameraHDR10BitDynamicRangeProfile = j;
            vEDisplaySettings.mTargetHDR10BitDynamicRangeProfile = j2;
            return this;
        }
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mTranslateX), Integer.valueOf(this.mTranslateY), Boolean.valueOf(this.mFlipX), Boolean.valueOf(this.mFlipY), this.mFitMode, Integer.valueOf(this.mRotation), Integer.valueOf(this.mEffectRotation), Integer.valueOf(this.mDisplayRotation), Long.valueOf(this.mBgColor), Float.valueOf(this.mDisplayRatio), this.mDisplayRatioMode, this.mRenderSize, this.mPreviewDowngradingRenderSize, Boolean.valueOf(this.mEnablePreviewResolutionDowngrading), this.mLayoutSize, this.mCamOutSize, Boolean.valueOf(this.mForceAdaptSurfaceSize), this.mEffect, Float.valueOf(this.mEffectIntensity), Long.valueOf(this.mCameraHDR10BitDynamicRangeProfile), Long.valueOf(this.mTargetHDR10BitDynamicRangeProfile), Boolean.valueOf(this.enableReducePerFrameCallbackOptimization));
    }

    public VEDisplaySettings() {
        this.mFitMode = EnumC1778840wOI.SCALE_MODE_CENTER_INSIDE;
        this.mLayoutSize = new VESize(0, 0);
        this.mCamOutSize = new VESize(0, 0);
        this.mForceAdaptSurfaceSize = false;
        this.mCanvasSize = new VESize(0, 0);
        this.mCameraHDR10BitDynamicRangeProfile = 1L;
        this.mTargetHDR10BitDynamicRangeProfile = 1L;
        this.enableReducePerFrameCallbackOptimization = false;
        this.mEffect = VEDisPlayEffect.NONE;
        this.mEffectIntensity = 0.0f;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEDisplaySettings{mTranslateX=");
        sbLIZ.append(this.mTranslateX);
        sbLIZ.append(", mTranslateY=");
        sbLIZ.append(this.mTranslateY);
        sbLIZ.append(", mFlipX=");
        sbLIZ.append(this.mFlipX);
        sbLIZ.append(", mFlipY=");
        sbLIZ.append(this.mFlipY);
        sbLIZ.append(", mFitMode=");
        sbLIZ.append(this.mFitMode);
        sbLIZ.append(", mRotation=");
        sbLIZ.append(this.mRotation);
        sbLIZ.append(", mBgColor=");
        sbLIZ.append(this.mBgColor);
        sbLIZ.append(", mDisplayRatio=");
        sbLIZ.append(this.mDisplayRatio);
        sbLIZ.append(", mDisplayRatioMode=");
        sbLIZ.append(this.mDisplayRatioMode);
        sbLIZ.append(", mRenderSize=");
        sbLIZ.append(this.mRenderSize);
        sbLIZ.append(", mPreviewDowngradingRenderSize=");
        sbLIZ.append(this.mPreviewDowngradingRenderSize);
        sbLIZ.append(", mEnablePreviewResolutionDowngrading=");
        sbLIZ.append(this.mEnablePreviewResolutionDowngrading);
        sbLIZ.append(", mLayoutSize=");
        sbLIZ.append(this.mLayoutSize);
        sbLIZ.append(", mEffect=");
        sbLIZ.append(this.mEffect);
        sbLIZ.append(", mEffectIntensity=");
        sbLIZ.append(this.mEffectIntensity);
        sbLIZ.append(", mCameraHDR10BitDynamicRangeProfile=");
        sbLIZ.append(this.mCameraHDR10BitDynamicRangeProfile);
        sbLIZ.append(", mTargetHDR10BitDynamicRangeProfile=");
        sbLIZ.append(this.mTargetHDR10BitDynamicRangeProfile);
        sbLIZ.append(", enableReducePerFrameCallbackOptimization=");
        sbLIZ.append(this.enableReducePerFrameCallbackOptimization);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public long getBackgroundColor() {
        return this.mBgColor;
    }

    public VESize getCamOutSize() {
        return this.mCamOutSize;
    }

    public long getCameraHDR10BitDynamicRangeProfile() {
        return this.mCameraHDR10BitDynamicRangeProfile;
    }

    public VESize getCanvasSize() {
        return this.mCanvasSize;
    }

    public VEDisPlayEffect getDisplayEffect() {
        return this.mEffect;
    }

    public float getDisplayRatio() {
        return this.mDisplayRatio;
    }

    public C1DIV getDisplayRatioMode() {
        return this.mDisplayRatioMode;
    }

    public int getDisplayRotation() {
        return this.mDisplayRotation;
    }

    public float getEffectIntensity() {
        return this.mEffectIntensity;
    }

    public int getEffectRotation() {
        return this.mEffectRotation;
    }

    public EnumC1778840wOI getFitMode() {
        return this.mFitMode;
    }

    public boolean getFlipX() {
        return this.mFlipX;
    }

    public boolean getFlipY() {
        return this.mFlipY;
    }

    public VESize getLayoutSize() {
        return this.mLayoutSize;
    }

    public VESize getPreviewDowngradingRenderSize() {
        return this.mPreviewDowngradingRenderSize;
    }

    public VESize getRenderSize() {
        return this.mRenderSize;
    }

    public int getRotation() {
        return this.mRotation;
    }

    public long getTargetHDR10BitDynamicRangeProfile() {
        return this.mTargetHDR10BitDynamicRangeProfile;
    }

    public int getTranslateX() {
        return this.mTranslateX;
    }

    public int getTranslateY() {
        return this.mTranslateY;
    }

    public boolean isForceAdaptSurfaceSize() {
        return this.mForceAdaptSurfaceSize;
    }

    public boolean isPreviewResolutionDowngradingEnabled() {
        return this.mEnablePreviewResolutionDowngrading;
    }

    public boolean isReducePerFrameCallbackOptimizationEnabled() {
        return this.enableReducePerFrameCallbackOptimization;
    }

    /* JADX INFO: loaded from: classes28.dex */
    public enum VEDisPlayEffect {
        NONE,
        GAUSSIAN_BLUR;

        public static VEDisPlayEffect valueOf(String str) {
            return (VEDisPlayEffect) C08FF.LIZ(VEDisPlayEffect.class, str);
        }
    }

    public VEDisplaySettings(Parcel parcel) {
        EnumC1778840wOI enumC1778840wOI;
        this.mFitMode = EnumC1778840wOI.SCALE_MODE_CENTER_INSIDE;
        this.mLayoutSize = new VESize(0, 0);
        this.mCamOutSize = new VESize(0, 0);
        this.mForceAdaptSurfaceSize = false;
        this.mCanvasSize = new VESize(0, 0);
        this.mCameraHDR10BitDynamicRangeProfile = 1L;
        this.mTargetHDR10BitDynamicRangeProfile = 1L;
        this.enableReducePerFrameCallbackOptimization = false;
        this.mEffect = VEDisPlayEffect.NONE;
        this.mEffectIntensity = 0.0f;
        this.mTranslateX = parcel.readInt();
        this.mTranslateY = parcel.readInt();
        this.mFlipX = parcel.readBoolean();
        this.mFlipY = parcel.readBoolean();
        int i = parcel.readInt();
        if (i == -1) {
            enumC1778840wOI = null;
        } else {
            enumC1778840wOI = EnumC1778840wOI.values()[i];
        }
        this.mFitMode = enumC1778840wOI;
        this.mRotation = parcel.readInt();
        this.mEffectRotation = parcel.readInt();
        this.mDisplayRotation = parcel.readInt();
        this.mBgColor = parcel.readLong();
        this.mDisplayRatio = parcel.readFloat();
        int i2 = parcel.readInt();
        this.mDisplayRatioMode = i2 != -1 ? C1DIV.values()[i2] : null;
        this.mCameraHDR10BitDynamicRangeProfile = parcel.readLong();
        this.mTargetHDR10BitDynamicRangeProfile = parcel.readLong();
        this.enableReducePerFrameCallbackOptimization = parcel.readBoolean();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VEDisplaySettings vEDisplaySettings = (VEDisplaySettings) obj;
        if (this.mTranslateX == vEDisplaySettings.mTranslateX && this.mTranslateY == vEDisplaySettings.mTranslateY && this.mFlipX == vEDisplaySettings.mFlipX && this.mFlipY == vEDisplaySettings.mFlipY && this.mRotation == vEDisplaySettings.mRotation && this.mEffectRotation == vEDisplaySettings.mEffectRotation && this.mDisplayRotation == vEDisplaySettings.mDisplayRotation && this.mBgColor == vEDisplaySettings.mBgColor && Float.compare(vEDisplaySettings.mDisplayRatio, this.mDisplayRatio) == 0 && this.mForceAdaptSurfaceSize == vEDisplaySettings.mForceAdaptSurfaceSize && Float.compare(vEDisplaySettings.mEffectIntensity, this.mEffectIntensity) == 0 && this.mFitMode == vEDisplaySettings.mFitMode && this.mDisplayRatioMode == vEDisplaySettings.mDisplayRatioMode && this.mRenderSize.equals(vEDisplaySettings.mRenderSize) && this.mPreviewDowngradingRenderSize.equals(vEDisplaySettings.mPreviewDowngradingRenderSize) && this.mEnablePreviewResolutionDowngrading == vEDisplaySettings.mEnablePreviewResolutionDowngrading && this.mLayoutSize.equals(vEDisplaySettings.mLayoutSize) && this.mCamOutSize.equals(vEDisplaySettings.mCamOutSize) && this.mEffect == vEDisplaySettings.mEffect && this.mCameraHDR10BitDynamicRangeProfile == vEDisplaySettings.mCameraHDR10BitDynamicRangeProfile && this.mTargetHDR10BitDynamicRangeProfile == vEDisplaySettings.mTargetHDR10BitDynamicRangeProfile && this.enableReducePerFrameCallbackOptimization == vEDisplaySettings.enableReducePerFrameCallbackOptimization) {
            return true;
        }
        return false;
    }

    public /* synthetic */ VEDisplaySettings(C2325341G0m c2325341G0m) {
        this();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iOrdinal;
        parcel.writeInt(this.mTranslateX);
        parcel.writeInt(this.mTranslateY);
        parcel.writeBoolean(this.mFlipX);
        parcel.writeBoolean(this.mFlipY);
        EnumC1778840wOI enumC1778840wOI = this.mFitMode;
        int iOrdinal2 = -1;
        if (enumC1778840wOI == null) {
            iOrdinal = -1;
        } else {
            iOrdinal = enumC1778840wOI.ordinal();
        }
        parcel.writeInt(iOrdinal);
        parcel.writeInt(this.mRotation);
        parcel.writeInt(this.mEffectRotation);
        parcel.writeInt(this.mDisplayRotation);
        parcel.writeLong(this.mBgColor);
        parcel.writeFloat(this.mDisplayRatio);
        C1DIV c1div = this.mDisplayRatioMode;
        if (c1div != null) {
            iOrdinal2 = c1div.ordinal();
        }
        parcel.writeInt(iOrdinal2);
        parcel.writeLong(this.mCameraHDR10BitDynamicRangeProfile);
        parcel.writeLong(this.mTargetHDR10BitDynamicRangeProfile);
        parcel.writeBoolean(this.enableReducePerFrameCallbackOptimization);
    }
}
