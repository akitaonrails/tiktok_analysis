package com.ss.android.ugc.aweme.ml.feature.flash;

import X.C2188811AlT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class FlashApplogConfig {
    public final String event;
    public final Map<String, String> event_constraints;
    public final Map<String, String> event_params;
    public final List<String> featureSetList;
    public final boolean isFlat;
    public final String paramsKey;
    public final float sample;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashApplogConfig(event=");
        sbLIZ.append(this.event);
        sbLIZ.append(", event_constraints=");
        sbLIZ.append(this.event_constraints);
        sbLIZ.append(", event_params=");
        sbLIZ.append(this.event_params);
        sbLIZ.append(", sample=");
        sbLIZ.append(this.sample);
        sbLIZ.append(", paramsKey=");
        sbLIZ.append(this.paramsKey);
        sbLIZ.append(", featureSetList=");
        sbLIZ.append(this.featureSetList);
        sbLIZ.append(", isFlat=");
        sbLIZ.append(this.isFlat);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isFlat() {
        return this.isFlat;
    }

    public FlashApplogConfig(String str, Map<String, String> map, Map<String, String> map2, float f, String str2, List<String> list, boolean z) {
        this.event = str;
        this.event_constraints = map;
        this.event_params = map2;
        this.sample = f;
        this.paramsKey = str2;
        this.featureSetList = list;
        this.isFlat = z;
    }
}
