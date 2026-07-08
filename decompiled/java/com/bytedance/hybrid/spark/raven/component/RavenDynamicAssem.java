package com.bytedance.hybrid.spark.raven.component;

import X.AbstractC738140SxQ;
import X.C0RUV;
import X.C2097608Jq;
import X.C628830OlV;
import X.C723850SaN;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public abstract class RavenDynamicAssem extends DynamicAssem {
    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    /* JADX INFO: renamed from: do */
    public final void mo127do() {
        C723850SaN.LIZLLL(this, new AwS610S0100000_31(this, 111));
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void hp() {
        Map mapLJ = C2097608Jq.LJ();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C628830OlV> entry : ((C628830OlV) getConfig()).LLJILJIL.entrySet()) {
            String key = entry.getKey();
            C628830OlV value = entry.getValue();
            Integer num = (Integer) mapLJ.get(key);
            if (num != null) {
                value.LLIZLLLIL = num.intValue();
                arrayList.add(value);
            }
        }
        C723850SaN.LIZLLL(this, new AwS397S0200000_31(this, (RavenDynamicAssem) arrayList, (List<C628830OlV>) 35));
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void didUpdateConfig(C0RUV<? extends AbstractC738140SxQ> c0ruv) {
        C723850SaN.LIZLLL(this, new AwS397S0200000_31(this, (RavenDynamicAssem) c0ruv, (C0RUV<? extends AbstractC738140SxQ>) 36));
    }
}
