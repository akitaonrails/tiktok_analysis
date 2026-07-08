package com.ss.android.ugc.aweme.search.ecommerce.perf;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class VisualSearchEcomIntentConfig extends SmartSceneConfig {

    @C09CT("enable_ecom_intent_client_model")
    public final boolean enableEcomIntentModel;

    @C09CT("idle_preload_delay_ms")
    public final long idlePreloadDelayMs;

    @C09CT("model_preload_check_for_infer")
    public final boolean modelPreloadCheckForInfer;

    @C09CT("scene_android")
    public final String sceneAndroid;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualSearchEcomIntentConfig)) {
            return false;
        }
        VisualSearchEcomIntentConfig visualSearchEcomIntentConfig = (VisualSearchEcomIntentConfig) obj;
        return this.enableEcomIntentModel == visualSearchEcomIntentConfig.enableEcomIntentModel && this.modelPreloadCheckForInfer == visualSearchEcomIntentConfig.modelPreloadCheckForInfer && this.idlePreloadDelayMs == visualSearchEcomIntentConfig.idlePreloadDelayMs && Intrinsics.LJFF(this.sceneAndroid, visualSearchEcomIntentConfig.sceneAndroid);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.enableEcomIntentModel) * 31) + C786410Ut5.Z2(this.modelPreloadCheckForInfer)) * 31) + C786410Ut5.Y2(this.idlePreloadDelayMs)) * 31) + this.sceneAndroid.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualSearchEcomIntentConfig(enableEcomIntentModel=");
        sbLIZ.append(this.enableEcomIntentModel);
        sbLIZ.append(", modelPreloadCheckForInfer=");
        sbLIZ.append(this.modelPreloadCheckForInfer);
        sbLIZ.append(", idlePreloadDelayMs=");
        sbLIZ.append(this.idlePreloadDelayMs);
        sbLIZ.append(", sceneAndroid=");
        sbLIZ.append(this.sceneAndroid);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VisualSearchEcomIntentConfig() {
        this(false, false, 1000L, "search_ecom_intention_android_native");
    }

    public VisualSearchEcomIntentConfig(boolean z, boolean z2, long j, String str) {
        this.enableEcomIntentModel = z;
        this.modelPreloadCheckForInfer = z2;
        this.idlePreloadDelayMs = j;
        this.sceneAndroid = str;
        setScene("search_ecom_intention_android_native");
    }
}
