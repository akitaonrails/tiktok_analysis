package com.bytedance.ies.cutsame.cut_android;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class TemplateExtra {

    @C09CT("alignmode")
    public final String alignMode;

    @C09CT("duration")
    public final long duration;

    @C09CT("featurebits")
    public final List<Long> featureBits;

    @C09CT("ratio")
    public final float ratio;

    @C09CT("slots")
    public final String slots;

    @C09CT("source_id")
    public final Integer sourceId;

    public TemplateExtra(String str, long j, List<Long> list, float f, String str2, Integer num) {
        this.alignMode = str;
        this.duration = j;
        this.featureBits = list;
        this.ratio = f;
        this.slots = str2;
        this.sourceId = num;
    }
}
