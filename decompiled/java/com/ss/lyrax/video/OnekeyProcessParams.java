package com.ss.lyrax.video;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class OnekeyProcessParams {

    @C09CT("algParams")
    public String algParams;

    @C09CT("switch")
    public boolean algSwitch;

    @C09CT("cvdetectFrames")
    public int cvdetectFrames;

    @C09CT("enableAfs")
    public boolean enableAfs;

    @C09CT("enableAlgoConfig")
    public boolean enableAlgoConfig;

    @C09CT("enableAsyncProcess")
    public boolean enableAsyncProcess;

    @C09CT("enableDayScene")
    public boolean enableDayScene;

    @C09CT("enableDenoise")
    public boolean enableDenoise;

    @C09CT("enableDetectAlgo")
    public boolean enableDetectAlgo;

    @C09CT("enableHDR")
    public boolean enableHDR;

    @C09CT("enableHdrV2")
    public boolean enableHdrV2;

    @C09CT("enableNightScene")
    public boolean enableNightScene;

    @C09CT("isFirstFrame")
    public boolean isFirstFrame;

    public OnekeyProcessParams() {
        this.enableHDR = true;
        this.enableHdrV2 = true;
        this.enableAsyncProcess = true;
        this.enableDayScene = true;
        this.enableNightScene = true;
        this.cvdetectFrames = 3;
        this.algParams = "luminance_target_string=175,155\n    & contrast_factor_float=0.3f\n    & saturation_factor_float=0.3f\n    & amount_float=2.f\n    & ratio_float=0.02f\n    & noise_factor_float=1.f\n    & current_pixel_weight_float=0.5f\n    & hdr_version_int=4\n    & luma_trigger_float=37.8\n    & over_trigger_float=-1\n    & under_trigger_float=-1\n    & asf_scene_mode_int=5";
        this.enableAlgoConfig = true;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnekeyProcessParams{algSwitch=");
        sbLIZ.append(this.algSwitch);
        sbLIZ.append(", enableHDR=");
        sbLIZ.append(this.enableHDR);
        sbLIZ.append(", enableDenoise=");
        sbLIZ.append(this.enableDenoise);
        sbLIZ.append(", enableAfs=");
        sbLIZ.append(this.enableAfs);
        sbLIZ.append(", enableHdrV2=");
        sbLIZ.append(this.enableHdrV2);
        sbLIZ.append(", enableAsyncProcess=");
        sbLIZ.append(this.enableAsyncProcess);
        sbLIZ.append(", enableDayScene=");
        sbLIZ.append(this.enableDayScene);
        sbLIZ.append(", enableNightScene=");
        sbLIZ.append(this.enableNightScene);
        sbLIZ.append(", cvdetectFrames=");
        sbLIZ.append(this.cvdetectFrames);
        sbLIZ.append(", algParams='");
        sbLIZ.append(this.algParams);
        sbLIZ.append('\'');
        sbLIZ.append(", isFirstFrame=");
        sbLIZ.append(this.isFirstFrame);
        sbLIZ.append(", enableAlgoConfig=");
        sbLIZ.append(this.enableAlgoConfig);
        sbLIZ.append(", enableDetectAlgo=");
        sbLIZ.append(this.enableDetectAlgo);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OnekeyProcessParams(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, String str, boolean z9, boolean z10, boolean z11) {
        this.algSwitch = z;
        this.enableHDR = z2;
        this.enableDenoise = z3;
        this.enableAfs = z4;
        this.enableHdrV2 = z5;
        this.enableAsyncProcess = z6;
        this.enableDayScene = z7;
        this.enableNightScene = z8;
        this.cvdetectFrames = i;
        this.algParams = str;
        this.isFirstFrame = z9;
        this.enableAlgoConfig = z10;
        this.enableDetectAlgo = z11;
    }
}
