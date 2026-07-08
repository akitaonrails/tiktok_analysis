package com.ss.android.ttve.vealgorithm.params;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes28.dex */
public class VESmartCutParam extends VEAlgorithmParam {
    public c audioBeatParam;
    public int frameCountPerStep;
    public ArrayList<String> paths;
    public int stepDurationMs;
    public int threadNum;
    public int threadNumOfSW;

    public class c {
    }

    public VESmartCutParam() {
        this.type = VEAlgorithmType.VEAlgorithmTypeSmartCut;
        this.threadNum = 1;
        this.stepDurationMs = LSPassThroughRecordSizeConfig.DEFAULT;
        this.frameCountPerStep = 2;
        this.audioBeatParam = new c();
    }
}
