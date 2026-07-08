package com.ss.android.tracker.event;

import X.AbstractC207072161e;
import X.C2805016t;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class AdBaseEvent extends AbstractC207072161e {
    @Override // X.AbstractC207072161e
    public final Map<String, String> LIZLLL() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(super.LIZLLL());
        for (Map.Entry<String, C2805016t> entry : this.LIZIZ.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue().LIZJ) {
                linkedHashMap.remove(key);
            }
        }
        throw null;
    }

    @Override // X.AbstractC207072161e
    public final void LJI(Object obj, String str) {
        super.LJI(obj, str);
        C2805016t c2805016t = this.LIZIZ.get(str);
        if (c2805016t != null && c2805016t.LIZJ) {
            throw null;
        }
    }
}
