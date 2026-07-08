package com.ss.android.ugc.aweme.videoadaption.adaptionparams;

import X.C20558915cZ;
import X.C786410Ut5;
import X.EnumC584530MwF;
import X.InterfaceC1604490rr5;
import X.InterfaceC589490NAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoAdaptionParams implements InterfaceC1604490rr5 {
    public final EnumC584530MwF blurMode;
    public final int containerHeight;
    public final int containerWidth;
    public boolean isOcrEffective;
    public final boolean isRTL;
    public final boolean ocrCheckEnable;
    public final C20558915cZ ocrCheckInfo;
    public final float ocrCropThreshold;
    public final InterfaceC589490NAd paramsOperator;
    public final int videoHeight;
    public final String videoId;
    public final float videoRatio;
    public final int videoWidth;

    public final VideoAdaptionParams copy(int i, int i2, int i3, int i4, InterfaceC589490NAd interfaceC589490NAd, boolean z, float f, C20558915cZ c20558915cZ, EnumC584530MwF enumC584530MwF, boolean z2, String str, boolean z3) {
        return new VideoAdaptionParams(i, i2, i3, i4, interfaceC589490NAd, z, f, c20558915cZ, enumC584530MwF, z2, str, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAdaptionParams)) {
            return false;
        }
        VideoAdaptionParams videoAdaptionParams = (VideoAdaptionParams) obj;
        return this.containerWidth == videoAdaptionParams.containerWidth && this.containerHeight == videoAdaptionParams.containerHeight && this.videoWidth == videoAdaptionParams.videoWidth && this.videoHeight == videoAdaptionParams.videoHeight && Intrinsics.LJFF(this.paramsOperator, videoAdaptionParams.paramsOperator) && this.ocrCheckEnable == videoAdaptionParams.ocrCheckEnable && Float.compare(this.ocrCropThreshold, videoAdaptionParams.ocrCropThreshold) == 0 && Intrinsics.LJFF(this.ocrCheckInfo, videoAdaptionParams.ocrCheckInfo) && this.blurMode == videoAdaptionParams.blurMode && this.isRTL == videoAdaptionParams.isRTL && Intrinsics.LJFF(this.videoId, videoAdaptionParams.videoId) && this.isOcrEffective == videoAdaptionParams.isOcrEffective;
    }

    public String toString() {
        return "VideoAdaptionParams(containerWidth=" + this.containerWidth + ", containerHeight=" + this.containerHeight + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", paramsOperator=" + this.paramsOperator + ", ocrCheckEnable=" + this.ocrCheckEnable + ", ocrCropThreshold=" + this.ocrCropThreshold + ", ocrCheckInfo=" + this.ocrCheckInfo + ", blurMode=" + this.blurMode + ", isRTL=" + this.isRTL + ", videoId=" + this.videoId + ", isOcrEffective=" + this.isOcrEffective + ')';
    }

    public int hashCode() {
        int i = ((((((this.containerWidth * 31) + this.containerHeight) * 31) + this.videoWidth) * 31) + this.videoHeight) * 31;
        InterfaceC589490NAd interfaceC589490NAd = this.paramsOperator;
        int iHashCode = (((((i + (interfaceC589490NAd == null ? 0 : interfaceC589490NAd.hashCode())) * 31) + C786410Ut5.Z2(this.ocrCheckEnable)) * 31) + Float.floatToIntBits(this.ocrCropThreshold)) * 31;
        C20558915cZ c20558915cZ = this.ocrCheckInfo;
        int iHashCode2 = (((((iHashCode + (c20558915cZ == null ? 0 : c20558915cZ.hashCode())) * 31) + this.blurMode.hashCode()) * 31) + C786410Ut5.Z2(this.isRTL)) * 31;
        String str = this.videoId;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isOcrEffective);
    }

    public final EnumC584530MwF getBlurMode() {
        return this.blurMode;
    }

    public final int getContainerHeight() {
        return this.containerHeight;
    }

    public final int getContainerWidth() {
        return this.containerWidth;
    }

    public final boolean getOcrCheckEnable() {
        return this.ocrCheckEnable;
    }

    public final C20558915cZ getOcrCheckInfo() {
        return this.ocrCheckInfo;
    }

    public final float getOcrCropThreshold() {
        return this.ocrCropThreshold;
    }

    public final InterfaceC589490NAd getParamsOperator() {
        return this.paramsOperator;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final float getVideoRatio() {
        return this.videoRatio;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final boolean isOcrEffective() {
        return this.isOcrEffective;
    }

    public final boolean isRTL() {
        return this.isRTL;
    }

    public final void setOcrEffective(boolean z) {
        this.isOcrEffective = z;
    }

    public VideoAdaptionParams(int i, int i2, int i3, int i4, InterfaceC589490NAd interfaceC589490NAd, boolean z, float f, C20558915cZ c20558915cZ, EnumC584530MwF enumC584530MwF, boolean z2, String str, boolean z3) {
        this.containerWidth = i;
        this.containerHeight = i2;
        this.videoWidth = i3;
        this.videoHeight = i4;
        this.paramsOperator = interfaceC589490NAd;
        this.ocrCheckEnable = z;
        this.ocrCropThreshold = f;
        this.ocrCheckInfo = c20558915cZ;
        this.blurMode = enumC584530MwF;
        this.isRTL = z2;
        this.videoId = str;
        this.isOcrEffective = z3;
        this.videoRatio = i4 / i3;
    }
}
