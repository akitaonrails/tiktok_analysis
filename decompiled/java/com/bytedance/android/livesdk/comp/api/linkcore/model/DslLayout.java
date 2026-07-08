package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2097808Js;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class DslLayout {
    public final Map<String, Layout> data;
    public final int scene;
    public final int version;

    public final Map<String, String> getBusinessSceneMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Layout> entry : this.data.entrySet()) {
            linkedHashMap.put(entry.getValue().layoutId, entry.getKey());
        }
        return linkedHashMap;
    }

    public final Map<String, String> getSceneMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Layout> entry : this.data.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().layoutId);
        }
        return linkedHashMap;
    }

    public final String toShortString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DslLayout{scene = ");
        sbLIZ.append(this.scene);
        sbLIZ.append(", version = ");
        sbLIZ.append(this.version);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Layout getLayout(String str) {
        return this.data.get(str);
    }

    public final Layout getLayoutByLayoutId(String str) {
        Map<String, Layout> map = this.data;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Layout> entry : map.entrySet()) {
            if (Intrinsics.LJFF(entry.getValue().layoutId, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List listLJIL = C2097808Js.LJIL(linkedHashMap);
        if (listLJIL != null && !listLJIL.isEmpty()) {
            return (Layout) ((Pair) ListProtector.get(listLJIL, 0)).getSecond();
        }
        return null;
    }

    public DslLayout(int i, int i2, Map<String, Layout> map) {
        this.scene = i;
        this.version = i2;
        this.data = map;
    }
}
