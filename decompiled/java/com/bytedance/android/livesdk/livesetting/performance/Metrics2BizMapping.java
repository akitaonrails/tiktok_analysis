package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class Metrics2BizMapping {
    public static final TypeAdapter ADAPTER = new Metrics2BizMapping_OptTypeAdapter(NormalGson.singleton());

    @C09CT("biz_level")
    public List<Integer> bizLevel;

    @C09CT("metrics_score")
    public List<Integer> metricsScore;

    public Metrics2BizMapping() {
        C13BV c13bv = C13BV.INSTANCE;
        this.metricsScore = c13bv;
        this.bizLevel = c13bv;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("metricsScore: ");
        sbLIZ.append(this.metricsScore);
        sbLIZ.append(", bizLevel: ");
        sbLIZ.append(this.bizLevel);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
