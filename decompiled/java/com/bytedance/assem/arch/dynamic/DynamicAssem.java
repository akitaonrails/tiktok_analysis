package com.bytedance.assem.arch.dynamic;

import X.AbstractC738140SxQ;
import X.C0RUV;
import X.C2097608Jq;
import X.C628830OlV;
import X.C723850SaN;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS372S0200000_6;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DynamicAssem extends UISlotAssem {
    @Override // com.bytedance.assem.arch.core.UIAssem
    /* JADX INFO: renamed from: do */
    public void mo127do() {
        super.mo127do();
        hp();
    }

    public void hp() {
        Map<String, Integer> mapKp = kp();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C628830OlV> entry : ip().LLJILJIL.entrySet()) {
            String key = entry.getKey();
            C628830OlV value = entry.getValue();
            Integer num = mapKp.get(key);
            if (num != null) {
                value.LLIZLLLIL = num.intValue();
                arrayList.add(value);
            }
        }
        C723850SaN.LIZLLL(this, new AwS372S0200000_6(this, (DynamicAssem) arrayList, (List<C628830OlV>) 5));
    }

    public final C628830OlV ip() {
        return (C628830OlV) getConfig();
    }

    public Map<String, Integer> kp() {
        return C2097608Jq.LJ();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void didUpdateConfig(C0RUV<? extends AbstractC738140SxQ> c0ruv) {
        super.didUpdateConfig(c0ruv);
        hp();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        mo127do();
    }
}
