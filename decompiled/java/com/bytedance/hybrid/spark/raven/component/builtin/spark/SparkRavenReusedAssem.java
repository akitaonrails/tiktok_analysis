package com.bytedance.hybrid.spark.raven.component.builtin.spark;

import X.C13LE;
import X.C19719912Dl;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.hybrid.spark.raven.component.RavenDynamicGlueReusedUISlotAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class SparkRavenReusedAssem extends RavenDynamicGlueReusedUISlotAssem<RavenSparkModule> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ekh;
    }

    @Override // com.bytedance.hybrid.spark.raven.component.RavenDynamicGlueReusedUISlotAssem
    public final C19719912Dl sp(BaseComponentData baseComponentData) {
        return C13LE.LIZ(SparkRavenUIAssem.class);
    }
}
