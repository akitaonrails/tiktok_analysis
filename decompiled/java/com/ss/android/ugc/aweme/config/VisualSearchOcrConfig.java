package com.ss.android.ugc.aweme.config;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class VisualSearchOcrConfig extends SmartSceneConfig {

    @C09CT("enabled")
    public final int enabled;

    @C09CT("ocr_area_ratio_threshold")
    public final double ocrAreaRatioThreshold;

    @C09CT("ocr_iou_threshold")
    public final double ocrIouThreshold;

    @C09CT("ocr_probability")
    public final double ocrProbabilityThreshold;

    @C09CT("scene_android")
    public final String sceneAndroid;

    @C09CT("words_recog")
    public final boolean wordsRecog;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualSearchOcrConfig)) {
            return false;
        }
        VisualSearchOcrConfig visualSearchOcrConfig = (VisualSearchOcrConfig) obj;
        return this.enabled == visualSearchOcrConfig.enabled && Double.compare(this.ocrIouThreshold, visualSearchOcrConfig.ocrIouThreshold) == 0 && Double.compare(this.ocrAreaRatioThreshold, visualSearchOcrConfig.ocrAreaRatioThreshold) == 0 && Double.compare(this.ocrProbabilityThreshold, visualSearchOcrConfig.ocrProbabilityThreshold) == 0 && Intrinsics.LJFF(this.sceneAndroid, visualSearchOcrConfig.sceneAndroid) && this.wordsRecog == visualSearchOcrConfig.wordsRecog;
    }

    public final int hashCode() {
        return (((((((((this.enabled * 31) + C786410Ut5.X2(this.ocrIouThreshold)) * 31) + C786410Ut5.X2(this.ocrAreaRatioThreshold)) * 31) + C786410Ut5.X2(this.ocrProbabilityThreshold)) * 31) + this.sceneAndroid.hashCode()) * 31) + C786410Ut5.Z2(this.wordsRecog);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualSearchOcrConfig(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", ocrIouThreshold=");
        sbLIZ.append(this.ocrIouThreshold);
        sbLIZ.append(", ocrAreaRatioThreshold=");
        sbLIZ.append(this.ocrAreaRatioThreshold);
        sbLIZ.append(", ocrProbabilityThreshold=");
        sbLIZ.append(this.ocrProbabilityThreshold);
        sbLIZ.append(", sceneAndroid=");
        sbLIZ.append(this.sceneAndroid);
        sbLIZ.append(", wordsRecog=");
        sbLIZ.append(this.wordsRecog);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VisualSearchOcrConfig() {
        this(0, 0.0d, 0.3d, 0.3d, "search_smart_ocr_android", false);
    }

    public VisualSearchOcrConfig(int i, double d, double d2, double d3, String str, boolean z) {
        this.enabled = i;
        this.ocrIouThreshold = d;
        this.ocrAreaRatioThreshold = d2;
        this.ocrProbabilityThreshold = d3;
        this.sceneAndroid = str;
        this.wordsRecog = z;
    }
}
