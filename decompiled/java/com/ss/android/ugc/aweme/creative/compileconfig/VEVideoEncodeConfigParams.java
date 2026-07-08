package com.ss.android.ugc.aweme.creative.compileconfig;

import X.C09R3;
import X.C0NTU;
import X.C13LE;
import X.C2217371BqR;
import X.InterfaceC2217461Bqa;
import X.InterfaceC608270NtR;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.compileconfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.compileconfig.VEVideoEncodeConfigParams;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;

/* JADX INFO: loaded from: classes23.dex */
public final class VEVideoEncodeConfigParams extends BaseCompileConfigParams {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] $$delegatedProperties;
    public static final int $stable;
    public final InterfaceC608270NtR bitrateMode$delegate;
    public final InterfaceC608270NtR enableAvInterLeave$delegate;
    public final InterfaceC608270NtR enableHdr10bitEncode$delegate;
    public final InterfaceC608270NtR enableRemuxVideo$delegate;
    public final InterfaceC608270NtR enableRemuxVideoForRotation$delegate;
    public final InterfaceC608270NtR enableRemuxVideoForShoot$delegate;
    public final InterfaceC608270NtR enableRemuxVideoRes$delegate;
    public final InterfaceC608270NtR encodeProfile$delegate;
    public final InterfaceC608270NtR encodeStandard$delegate;
    public final InterfaceC608270NtR externalSettingsJsonStr$delegate;
    public final InterfaceC608270NtR fps$delegate;
    public final InterfaceC608270NtR gopSize$delegate;
    public final InterfaceC608270NtR hwBps$delegate;
    public final InterfaceC608270NtR isPseudoLandscape$delegate;
    public final InterfaceC608270NtR isSupportHWEncoder$delegate;
    public final InterfaceC608270NtR lowPublishFps$delegate;
    public final InterfaceC608270NtR lowWatermarkFps$delegate;
    public final InterfaceC608270NtR netLevel$delegate;
    public final InterfaceC608270NtR outputSize$delegate;
    public final InterfaceC608270NtR publishFps$delegate;
    public final InterfaceC608270NtR resizeMode$delegate;
    public final InterfaceC608270NtR resizeX$delegate;
    public final InterfaceC608270NtR resizeY$delegate;
    public final InterfaceC608270NtR swMaxRate$delegate;
    public final InterfaceC608270NtR swPreset$delegate;
    public final InterfaceC608270NtR videoBitrate$delegate;
    public final InterfaceC608270NtR videoHWOptBitrateEnableHD$delegate;
    public final InterfaceC608270NtR videoHWOptBitrateInLength$delegate;
    public final InterfaceC608270NtR videoHWOptBitrateOptBitrate$delegate;
    public final InterfaceC608270NtR watermarkParam$delegate;
    public final InterfaceC608270NtR watermarkSize$delegate;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(VEVideoEncodeConfigParams.class, "outputSize", "getOutputSize()Lcom/ss/android/ugc/aweme/creative/compileconfig/CompileConfigResolution;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217371BqR c2217371BqR2 = new C2217371BqR(VEVideoEncodeConfigParams.class, "resizeMode", "getResizeMode()I", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR3 = new C2217371BqR(VEVideoEncodeConfigParams.class, "resizeX", "getResizeX()F", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR4 = new C2217371BqR(VEVideoEncodeConfigParams.class, "resizeY", "getResizeY()F", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR5 = new C2217371BqR(VEVideoEncodeConfigParams.class, "enableRemuxVideo", "getEnableRemuxVideo()Z", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR6 = new C2217371BqR(VEVideoEncodeConfigParams.class, "enableRemuxVideoForRotation", "getEnableRemuxVideoForRotation()Z", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR7 = new C2217371BqR(VEVideoEncodeConfigParams.class, "enableRemuxVideoForShoot", "getEnableRemuxVideoForShoot()Z", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR8 = new C2217371BqR(VEVideoEncodeConfigParams.class, "isSupportHWEncoder", "isSupportHWEncoder()Z", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR9 = new C2217371BqR(VEVideoEncodeConfigParams.class, "bitrateMode", "getBitrateMode()Lcom/ss/android/vesdk/VEVideoEncodeSettings$ENCODE_BITRATE_MODE;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR10 = new C2217371BqR(VEVideoEncodeConfigParams.class, "videoBitrate", "getVideoBitrate()I", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR11 = new C2217371BqR(VEVideoEncodeConfigParams.class, "hwBps", "getHwBps()I", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR12 = new C2217371BqR(VEVideoEncodeConfigParams.class, "encodeProfile", "getEncodeProfile()Lcom/ss/android/vesdk/VEVideoEncodeSettings$ENCODE_PROFILE;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR13 = new C2217371BqR(VEVideoEncodeConfigParams.class, "swMaxRate", "getSwMaxRate()J", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR14 = new C2217371BqR(VEVideoEncodeConfigParams.class, "swPreset", "getSwPreset()Lcom/ss/android/vesdk/VEVideoEncodeSettings$ENCODE_PRESET;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR15 = new C2217371BqR(VEVideoEncodeConfigParams.class, "enableAvInterLeave", "getEnableAvInterLeave()Z", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR16 = new C2217371BqR(VEVideoEncodeConfigParams.class, "externalSettingsJsonStr", "getExternalSettingsJsonStr()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR17 = new C2217371BqR(VEVideoEncodeConfigParams.class, "videoHWOptBitrateInLength", "getVideoHWOptBitrateInLength()I", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR18 = new C2217371BqR(VEVideoEncodeConfigParams.class, "videoHWOptBitrateOptBitrate", "getVideoHWOptBitrateOptBitrate()F", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR19 = new C2217371BqR(VEVideoEncodeConfigParams.class, "videoHWOptBitrateEnableHD", "getVideoHWOptBitrateEnableHD()Z", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR20 = new C2217371BqR(VEVideoEncodeConfigParams.class, "fps", "getFps()I", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR21 = new C2217371BqR(VEVideoEncodeConfigParams.class, "publishFps", "getPublishFps()I", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR22 = new C2217371BqR(VEVideoEncodeConfigParams.class, "gopSize", "getGopSize()I", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR23 = new C2217371BqR(VEVideoEncodeConfigParams.class, "watermarkSize", "getWatermarkSize()Lcom/ss/android/ugc/aweme/creative/compileconfig/CompileConfigResolution;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR24 = new C2217371BqR(VEVideoEncodeConfigParams.class, "watermarkParam", "getWatermarkParam()Lcom/ss/android/vesdk/VEWatermarkParam;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR25 = new C2217371BqR(VEVideoEncodeConfigParams.class, "lowPublishFps", "getLowPublishFps()I", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR26 = new C2217371BqR(VEVideoEncodeConfigParams.class, "lowWatermarkFps", "getLowWatermarkFps()I", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR27 = new C2217371BqR(VEVideoEncodeConfigParams.class, "enableHdr10bitEncode", "getEnableHdr10bitEncode()Z", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR28 = new C2217371BqR(VEVideoEncodeConfigParams.class, "encodeStandard", "getEncodeStandard()Lcom/ss/android/vesdk/VEVideoEncodeSettings$ENCODE_STANDARD;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR29 = new C2217371BqR(VEVideoEncodeConfigParams.class, "netLevel", "getNetLevel()I", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR30 = new C2217371BqR(VEVideoEncodeConfigParams.class, "isPseudoLandscape", "isPseudoLandscape()Z", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR31 = new C2217371BqR(VEVideoEncodeConfigParams.class, "enableRemuxVideoRes", "getEnableRemuxVideoRes()I", 0);
        c09r3.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217371BqR, c2217371BqR2, c2217371BqR3, c2217371BqR4, c2217371BqR5, c2217371BqR6, c2217371BqR7, c2217371BqR8, c2217371BqR9, c2217371BqR10, c2217371BqR11, c2217371BqR12, c2217371BqR13, c2217371BqR14, c2217371BqR15, c2217371BqR16, c2217371BqR17, c2217371BqR18, c2217371BqR19, c2217371BqR20, c2217371BqR21, c2217371BqR22, c2217371BqR23, c2217371BqR24, c2217371BqR25, c2217371BqR26, c2217371BqR27, c2217371BqR28, c2217371BqR29, c2217371BqR30, c2217371BqR31};
        $stable = 8;
    }

    public final VEVideoEncodeSettings.ENCODE_BITRATE_MODE getBitrateMode() {
        return (VEVideoEncodeSettings.ENCODE_BITRATE_MODE) this.bitrateMode$delegate.getValue(this, $$delegatedProperties[8]);
    }

    public final boolean getEnableAvInterLeave() {
        return ((Boolean) this.enableAvInterLeave$delegate.getValue(this, $$delegatedProperties[14])).booleanValue();
    }

    public final boolean getEnableHdr10bitEncode() {
        return ((Boolean) this.enableHdr10bitEncode$delegate.getValue(this, $$delegatedProperties[26])).booleanValue();
    }

    public final boolean getEnableRemuxVideo() {
        return ((Boolean) this.enableRemuxVideo$delegate.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    public final boolean getEnableRemuxVideoForRotation() {
        return ((Boolean) this.enableRemuxVideoForRotation$delegate.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    public final boolean getEnableRemuxVideoForShoot() {
        return ((Boolean) this.enableRemuxVideoForShoot$delegate.getValue(this, $$delegatedProperties[6])).booleanValue();
    }

    public final int getEnableRemuxVideoRes() {
        return ((Number) this.enableRemuxVideoRes$delegate.getValue(this, $$delegatedProperties[30])).intValue();
    }

    public final VEVideoEncodeSettings.ENCODE_PROFILE getEncodeProfile() {
        return (VEVideoEncodeSettings.ENCODE_PROFILE) this.encodeProfile$delegate.getValue(this, $$delegatedProperties[11]);
    }

    public final VEVideoEncodeSettings.ENCODE_STANDARD getEncodeStandard() {
        return (VEVideoEncodeSettings.ENCODE_STANDARD) this.encodeStandard$delegate.getValue(this, $$delegatedProperties[27]);
    }

    public final String getExternalSettingsJsonStr() {
        return (String) this.externalSettingsJsonStr$delegate.getValue(this, $$delegatedProperties[15]);
    }

    public final int getFps() {
        return ((Number) this.fps$delegate.getValue(this, $$delegatedProperties[19])).intValue();
    }

    public final int getGopSize() {
        return ((Number) this.gopSize$delegate.getValue(this, $$delegatedProperties[21])).intValue();
    }

    public final int getHwBps() {
        return ((Number) this.hwBps$delegate.getValue(this, $$delegatedProperties[10])).intValue();
    }

    public final int getLowPublishFps() {
        return ((Number) this.lowPublishFps$delegate.getValue(this, $$delegatedProperties[24])).intValue();
    }

    public final int getLowWatermarkFps() {
        return ((Number) this.lowWatermarkFps$delegate.getValue(this, $$delegatedProperties[25])).intValue();
    }

    public final int getNetLevel() {
        return ((Number) this.netLevel$delegate.getValue(this, $$delegatedProperties[28])).intValue();
    }

    public final CompileConfigResolution getOutputSize() {
        return (CompileConfigResolution) this.outputSize$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final int getPublishFps() {
        return ((Number) this.publishFps$delegate.getValue(this, $$delegatedProperties[20])).intValue();
    }

    public final int getResizeMode() {
        return ((Number) this.resizeMode$delegate.getValue(this, $$delegatedProperties[1])).intValue();
    }

    public final float getResizeX() {
        return ((Number) this.resizeX$delegate.getValue(this, $$delegatedProperties[2])).floatValue();
    }

    public final float getResizeY() {
        return ((Number) this.resizeY$delegate.getValue(this, $$delegatedProperties[3])).floatValue();
    }

    public final long getSwMaxRate() {
        return ((Number) this.swMaxRate$delegate.getValue(this, $$delegatedProperties[12])).longValue();
    }

    public final VEVideoEncodeSettings.ENCODE_PRESET getSwPreset() {
        return (VEVideoEncodeSettings.ENCODE_PRESET) this.swPreset$delegate.getValue(this, $$delegatedProperties[13]);
    }

    public final int getVideoBitrate() {
        return ((Number) this.videoBitrate$delegate.getValue(this, $$delegatedProperties[9])).intValue();
    }

    public final boolean getVideoHWOptBitrateEnableHD() {
        return ((Boolean) this.videoHWOptBitrateEnableHD$delegate.getValue(this, $$delegatedProperties[18])).booleanValue();
    }

    public final int getVideoHWOptBitrateInLength() {
        return ((Number) this.videoHWOptBitrateInLength$delegate.getValue(this, $$delegatedProperties[16])).intValue();
    }

    public final float getVideoHWOptBitrateOptBitrate() {
        return ((Number) this.videoHWOptBitrateOptBitrate$delegate.getValue(this, $$delegatedProperties[17])).floatValue();
    }

    public final VEWatermarkParam getWatermarkParam() {
        return (VEWatermarkParam) this.watermarkParam$delegate.getValue(this, $$delegatedProperties[23]);
    }

    public final CompileConfigResolution getWatermarkSize() {
        return (CompileConfigResolution) this.watermarkSize$delegate.getValue(this, $$delegatedProperties[22]);
    }

    public final boolean isPseudoLandscape() {
        return ((Boolean) this.isPseudoLandscape$delegate.getValue(this, $$delegatedProperties[29])).booleanValue();
    }

    public final boolean isSupportHWEncoder() {
        return ((Boolean) this.isSupportHWEncoder$delegate.getValue(this, $$delegatedProperties[7])).booleanValue();
    }

    public VEVideoEncodeConfigParams() {
        final CompileConfigResolution compileConfigResolution = new CompileConfigResolution(0, 0, null, null, 15, null);
        this.outputSize$delegate = new C0NTU<CompileConfigResolution>(compileConfigResolution) { // from class: X.1DaV
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(CompileConfigResolution.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(CompileConfigResolution.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        final int i = 2;
        this.resizeMode$delegate = new C0NTU<Integer>(i) { // from class: X.1DaL
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        final Float fValueOf = Float.valueOf(0.0f);
        this.resizeX$delegate = new C0NTU<Float>(fValueOf) { // from class: X.1DaO
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Float.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Float.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.resizeY$delegate = new C0NTU<Float>(fValueOf) { // from class: X.1DaP
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Float.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Float.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        final Boolean bool = Boolean.FALSE;
        this.enableRemuxVideo$delegate = new C0NTU<Boolean>(bool) { // from class: X.1Da3
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Boolean.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Boolean.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.enableRemuxVideoForRotation$delegate = new C0NTU<Boolean>(bool) { // from class: X.1Da5
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Boolean.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Boolean.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.enableRemuxVideoForShoot$delegate = new C0NTU<Boolean>(bool) { // from class: X.1Da7
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Boolean.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Boolean.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.isSupportHWEncoder$delegate = new C0NTU<Boolean>(bool) { // from class: X.1Da8
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Boolean.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Boolean.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        final VEVideoEncodeSettings.ENCODE_BITRATE_MODE encode_bitrate_mode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bitrateMode$delegate = new C0NTU<VEVideoEncodeSettings.ENCODE_BITRATE_MODE>(encode_bitrate_mode) { // from class: X.1DaQ
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        final int i2 = 4194304;
        this.videoBitrate$delegate = new C0NTU<Integer>(i2) { // from class: X.1Da4
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        final int i3 = -1;
        this.hwBps$delegate = new C0NTU<Integer>(i3) { // from class: X.1Da6
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        final VEVideoEncodeSettings.ENCODE_PROFILE encode_profile = VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN;
        this.encodeProfile$delegate = new C0NTU<VEVideoEncodeSettings.ENCODE_PROFILE>(encode_profile) { // from class: X.1Da2
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(VEVideoEncodeSettings.ENCODE_PROFILE.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(VEVideoEncodeSettings.ENCODE_PROFILE.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        final long j = 15000000L;
        this.swMaxRate$delegate = new C0NTU<Long>(j) { // from class: X.1Da9
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Long.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Long.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        final VEVideoEncodeSettings.ENCODE_PRESET encode_preset = VEVideoEncodeSettings.ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST;
        this.swPreset$delegate = new C0NTU<VEVideoEncodeSettings.ENCODE_PRESET>(encode_preset) { // from class: X.1DaU
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(VEVideoEncodeSettings.ENCODE_PRESET.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(VEVideoEncodeSettings.ENCODE_PRESET.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.enableAvInterLeave$delegate = new C0NTU<Boolean>(bool) { // from class: X.1DaA
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Boolean.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Boolean.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.externalSettingsJsonStr$delegate = new C0NTU<String>() { // from class: X.1DaT
            {
                super(null);
            }

            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this.LLILLJJLI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(String.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(String.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        final int i4 = 0;
        this.videoHWOptBitrateInLength$delegate = new C0NTU<Integer>(i4) { // from class: X.1DaB
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        final Float fValueOf2 = Float.valueOf(-1.0f);
        this.videoHWOptBitrateOptBitrate$delegate = new C0NTU<Float>(fValueOf2) { // from class: X.1DaC
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Float.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Float.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.videoHWOptBitrateEnableHD$delegate = new C0NTU<Boolean>(bool) { // from class: X.1DaD
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Boolean.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Boolean.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.fps$delegate = new C0NTU<Integer>(i3) { // from class: X.1DaE
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.publishFps$delegate = new C0NTU<Integer>(i3) { // from class: X.1DaF
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        final int i5 = 60;
        this.gopSize$delegate = new C0NTU<Integer>(i5) { // from class: X.1DaG
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        final CompileConfigResolution compileConfigResolution2 = new CompileConfigResolution(-1, -1, null, null, 12, null);
        this.watermarkSize$delegate = new C0NTU<CompileConfigResolution>(compileConfigResolution2) { // from class: X.1DaW
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(CompileConfigResolution.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(CompileConfigResolution.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.watermarkParam$delegate = new C0NTU<VEWatermarkParam>() { // from class: X.1DaR
            {
                super(null);
            }

            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this.LLILLJJLI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(VEWatermarkParam.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(VEWatermarkParam.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.lowPublishFps$delegate = new C0NTU<Integer>(i3) { // from class: X.1DaH
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.lowWatermarkFps$delegate = new C0NTU<Integer>(i3) { // from class: X.1DaI
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.enableHdr10bitEncode$delegate = new C0NTU<Boolean>(bool) { // from class: X.1DaJ
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Boolean.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Boolean.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.encodeStandard$delegate = new C0NTU<VEVideoEncodeSettings.ENCODE_STANDARD>() { // from class: X.1DaS
            {
                super(null);
            }

            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this.LLILLJJLI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(VEVideoEncodeSettings.ENCODE_STANDARD.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(VEVideoEncodeSettings.ENCODE_STANDARD.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.netLevel$delegate = new C0NTU<Integer>(i4) { // from class: X.1DaK
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.isPseudoLandscape$delegate = new C0NTU<Boolean>(bool) { // from class: X.1DaM
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Boolean.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Boolean.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.enableRemuxVideoRes$delegate = new C0NTU<Integer>(i3) { // from class: X.1DaN
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                String json;
                String json2;
                VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\nStrategyName : ");
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStage());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurStrategyName());
                sbLIZ.append('-');
                sbLIZ.append(vEVideoEncodeConfigParams.getCurPriority());
                sbLIZ.append(" ; \n--- property : ");
                sbLIZ.append(interfaceC2217461Bqa.getName());
                sbLIZ.append(" ; \n------ oldValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json = String.valueOf(obj);
                } else {
                    json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj);
                }
                sbLIZ.append(json);
                sbLIZ.append(" ; \n------ newValue : ");
                if (C1983207pm.LIZ(Integer.class)) {
                    json2 = String.valueOf(obj2);
                } else {
                    json2 = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), obj2);
                }
                sbLIZ.append(json2);
                sbLIZ.append(" ; \n");
                C564000MAc.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }

    public final void setBitrateMode(VEVideoEncodeSettings.ENCODE_BITRATE_MODE encode_bitrate_mode) {
        this.bitrateMode$delegate.setValue(this, $$delegatedProperties[8], encode_bitrate_mode);
    }

    public final void setEnableAvInterLeave(boolean z) {
        this.enableAvInterLeave$delegate.setValue(this, $$delegatedProperties[14], Boolean.valueOf(z));
    }

    public final void setEnableHdr10bitEncode(boolean z) {
        this.enableHdr10bitEncode$delegate.setValue(this, $$delegatedProperties[26], Boolean.valueOf(z));
    }

    public final void setEnableRemuxVideo(boolean z) {
        this.enableRemuxVideo$delegate.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    public final void setEnableRemuxVideoForRotation(boolean z) {
        this.enableRemuxVideoForRotation$delegate.setValue(this, $$delegatedProperties[5], Boolean.valueOf(z));
    }

    public final void setEnableRemuxVideoForShoot(boolean z) {
        this.enableRemuxVideoForShoot$delegate.setValue(this, $$delegatedProperties[6], Boolean.valueOf(z));
    }

    public final void setEnableRemuxVideoRes(int i) {
        this.enableRemuxVideoRes$delegate.setValue(this, $$delegatedProperties[30], Integer.valueOf(i));
    }

    public final void setEncodeProfile(VEVideoEncodeSettings.ENCODE_PROFILE encode_profile) {
        this.encodeProfile$delegate.setValue(this, $$delegatedProperties[11], encode_profile);
    }

    public final void setEncodeStandard(VEVideoEncodeSettings.ENCODE_STANDARD encode_standard) {
        this.encodeStandard$delegate.setValue(this, $$delegatedProperties[27], encode_standard);
    }

    public final void setExternalSettingsJsonStr(String str) {
        this.externalSettingsJsonStr$delegate.setValue(this, $$delegatedProperties[15], str);
    }

    public final void setFps(int i) {
        this.fps$delegate.setValue(this, $$delegatedProperties[19], Integer.valueOf(i));
    }

    public final void setGopSize(int i) {
        this.gopSize$delegate.setValue(this, $$delegatedProperties[21], Integer.valueOf(i));
    }

    public final void setHwBps(int i) {
        this.hwBps$delegate.setValue(this, $$delegatedProperties[10], Integer.valueOf(i));
    }

    public final void setLowPublishFps(int i) {
        this.lowPublishFps$delegate.setValue(this, $$delegatedProperties[24], Integer.valueOf(i));
    }

    public final void setLowWatermarkFps(int i) {
        this.lowWatermarkFps$delegate.setValue(this, $$delegatedProperties[25], Integer.valueOf(i));
    }

    public final void setNetLevel(int i) {
        this.netLevel$delegate.setValue(this, $$delegatedProperties[28], Integer.valueOf(i));
    }

    public final void setOutputSize(CompileConfigResolution compileConfigResolution) {
        this.outputSize$delegate.setValue(this, $$delegatedProperties[0], compileConfigResolution);
    }

    public final void setPseudoLandscape(boolean z) {
        this.isPseudoLandscape$delegate.setValue(this, $$delegatedProperties[29], Boolean.valueOf(z));
    }

    public final void setPublishFps(int i) {
        this.publishFps$delegate.setValue(this, $$delegatedProperties[20], Integer.valueOf(i));
    }

    public final void setResizeMode(int i) {
        this.resizeMode$delegate.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    public final void setResizeX(float f) {
        this.resizeX$delegate.setValue(this, $$delegatedProperties[2], Float.valueOf(f));
    }

    public final void setResizeY(float f) {
        this.resizeY$delegate.setValue(this, $$delegatedProperties[3], Float.valueOf(f));
    }

    public final void setSupportHWEncoder(boolean z) {
        this.isSupportHWEncoder$delegate.setValue(this, $$delegatedProperties[7], Boolean.valueOf(z));
    }

    public final void setSwMaxRate(long j) {
        this.swMaxRate$delegate.setValue(this, $$delegatedProperties[12], Long.valueOf(j));
    }

    public final void setSwPreset(VEVideoEncodeSettings.ENCODE_PRESET encode_preset) {
        this.swPreset$delegate.setValue(this, $$delegatedProperties[13], encode_preset);
    }

    public final void setVideoBitrate(int i) {
        this.videoBitrate$delegate.setValue(this, $$delegatedProperties[9], Integer.valueOf(i));
    }

    public final void setVideoHWOptBitrateEnableHD(boolean z) {
        this.videoHWOptBitrateEnableHD$delegate.setValue(this, $$delegatedProperties[18], Boolean.valueOf(z));
    }

    public final void setVideoHWOptBitrateInLength(int i) {
        this.videoHWOptBitrateInLength$delegate.setValue(this, $$delegatedProperties[16], Integer.valueOf(i));
    }

    public final void setVideoHWOptBitrateOptBitrate(float f) {
        this.videoHWOptBitrateOptBitrate$delegate.setValue(this, $$delegatedProperties[17], Float.valueOf(f));
    }

    public final void setWatermarkParam(VEWatermarkParam vEWatermarkParam) {
        this.watermarkParam$delegate.setValue(this, $$delegatedProperties[23], vEWatermarkParam);
    }

    public final void setWatermarkSize(CompileConfigResolution compileConfigResolution) {
        this.watermarkSize$delegate.setValue(this, $$delegatedProperties[22], compileConfigResolution);
    }
}
