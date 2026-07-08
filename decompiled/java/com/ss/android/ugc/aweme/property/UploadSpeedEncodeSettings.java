package com.ss.android.ugc.aweme.property;

import X.C09CT;
import X.C1442260ndQ;
import X.C1442320ndW;
import X.C1442470ndl;
import X.C1442540nds;
import X.C1442550ndt;
import X.C1442600ndy;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1420160n3m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class UploadSpeedEncodeSettings implements InterfaceC1420160n3m {
    public int LIZ;

    @C09CT("bitrate_of_recode_threshold")
    public final int bitrateOfRecodeThreshold;

    @C09CT("compile_video_size_index")
    public final int compileVideoSizeIndex;

    @C09CT("high_quality_bitrate_of_recode_threshold")
    public final int highQualityBitrateOfRecodeThreshold;

    @C09CT("high_quality_compile_video_size_index")
    public final int highQualityCompileVideoSizeIndex;

    @C09CT("high_quality_use_smart_compile")
    public final boolean highQualityUseSmartCompile;

    @C09CT("high_quality_ve_synthesis_settings")
    public final String highQualityVeSynthesisSettings;

    @C09CT("max_speed")
    public final int maxSpeed;

    @C09CT("use_smart_compile")
    public final boolean useSmartCompile;

    @C09CT("ve_synthesis_settings")
    public final String veSynthesisSettings;

    public UploadSpeedEncodeSettings() {
        this(0, 0, 0, null, null, false, false, 0, 0, 511, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadSpeedEncodeSettings)) {
            return false;
        }
        UploadSpeedEncodeSettings uploadSpeedEncodeSettings = (UploadSpeedEncodeSettings) obj;
        return this.maxSpeed == uploadSpeedEncodeSettings.maxSpeed && this.compileVideoSizeIndex == uploadSpeedEncodeSettings.compileVideoSizeIndex && this.highQualityCompileVideoSizeIndex == uploadSpeedEncodeSettings.highQualityCompileVideoSizeIndex && Intrinsics.LJFF(this.veSynthesisSettings, uploadSpeedEncodeSettings.veSynthesisSettings) && Intrinsics.LJFF(this.highQualityVeSynthesisSettings, uploadSpeedEncodeSettings.highQualityVeSynthesisSettings) && this.useSmartCompile == uploadSpeedEncodeSettings.useSmartCompile && this.highQualityUseSmartCompile == uploadSpeedEncodeSettings.highQualityUseSmartCompile && this.bitrateOfRecodeThreshold == uploadSpeedEncodeSettings.bitrateOfRecodeThreshold && this.highQualityBitrateOfRecodeThreshold == uploadSpeedEncodeSettings.highQualityBitrateOfRecodeThreshold;
    }

    public final int hashCode() {
        return (((((((((((((((this.maxSpeed * 31) + this.compileVideoSizeIndex) * 31) + this.highQualityCompileVideoSizeIndex) * 31) + this.veSynthesisSettings.hashCode()) * 31) + this.highQualityVeSynthesisSettings.hashCode()) * 31) + C786410Ut5.Z2(this.useSmartCompile)) * 31) + C786410Ut5.Z2(this.highQualityUseSmartCompile)) * 31) + this.bitrateOfRecodeThreshold) * 31) + this.highQualityBitrateOfRecodeThreshold;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadSpeedEncodeSettings(maxSpeed=");
        sbLIZ.append(this.maxSpeed);
        sbLIZ.append(", compileVideoSizeIndex=");
        sbLIZ.append(this.compileVideoSizeIndex);
        sbLIZ.append(", highQualityCompileVideoSizeIndex=");
        sbLIZ.append(this.highQualityCompileVideoSizeIndex);
        sbLIZ.append(", veSynthesisSettings=");
        sbLIZ.append(this.veSynthesisSettings);
        sbLIZ.append(", highQualityVeSynthesisSettings=");
        sbLIZ.append(this.highQualityVeSynthesisSettings);
        sbLIZ.append(", useSmartCompile=");
        sbLIZ.append(this.useSmartCompile);
        sbLIZ.append(", highQualityUseSmartCompile=");
        sbLIZ.append(this.highQualityUseSmartCompile);
        sbLIZ.append(", bitrateOfRecodeThreshold=");
        sbLIZ.append(this.bitrateOfRecodeThreshold);
        sbLIZ.append(", highQualityBitrateOfRecodeThreshold=");
        sbLIZ.append(this.highQualityBitrateOfRecodeThreshold);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1420160n3m
    public final int LIZ() {
        return this.maxSpeed;
    }

    @Override // X.InterfaceC1420160n3m
    public final void setIndex(int i) {
        this.LIZ = i;
    }

    public UploadSpeedEncodeSettings(int i, int i2, int i3, String str, String str2, boolean z, boolean z2, int i4, int i5) {
        this.maxSpeed = i;
        this.compileVideoSizeIndex = i2;
        this.highQualityCompileVideoSizeIndex = i3;
        this.veSynthesisSettings = str;
        this.highQualityVeSynthesisSettings = str2;
        this.useSmartCompile = z;
        this.highQualityUseSmartCompile = z2;
        this.bitrateOfRecodeThreshold = i4;
        this.highQualityBitrateOfRecodeThreshold = i5;
        this.LIZ = -1;
    }

    public UploadSpeedEncodeSettings(int i, int i2, int i3, String str, String str2, boolean z, boolean z2, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? -1 : i, (i6 & 2) != 0 ? C1442320ndW.LIZ() : i2, (i6 & 4) != 0 ? C1442470ndl.LIZ() : i3, (i6 & 8) != 0 ? C1442260ndQ.LIZ(false) : str, (i6 & 16) != 0 ? C1442600ndy.LIZ() : str2, (i6 & 32) != 0 ? false : z, (i6 & 64) == 0 ? z2 : false, (i6 & 128) != 0 ? C1442550ndt.LIZ() : i4, (i6 & 256) != 0 ? C1442540nds.LIZ() : i5);
    }
}
