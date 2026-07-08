package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload;

import X.C09CT;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationTemplateNLEData implements Serializable {
    public static final int $stable = 8;

    @C09CT("data_timestamp")
    public long dataTimeStamp;

    @C09CT("template_nle_data")
    public HashMap<String, String> templateNleMap;

    public CelebrationTemplateNLEData() {
        this(null, 0L);
    }

    public final void setDataTimeStamp(long j) {
        this.dataTimeStamp = j;
    }

    public final void setTemplateNleMap(HashMap<String, String> map) {
        this.templateNleMap = map;
    }

    public CelebrationTemplateNLEData(HashMap<String, String> map, long j) {
        this.templateNleMap = map;
        this.dataTimeStamp = j;
    }
}
