package com.bytedance.creativex.model.mapping;

import X.C09CU;
import X.C09DL;
import X.C09FQ;
import X.C234000vK;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class OnlySerializableModelExtraAdapter extends TypeAdapter<HashMap<String, Serializable>> {
    public final Gson LIZ;
    public final C09FQ LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public final HashMap<String, Serializable> read(C09CU c09cu) {
        HashMap<String, Serializable> map = new HashMap<>();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            Object objFromJson = GsonProtectorUtils.fromJson(this.LIZ, c09cu.LJJJZ(), (Class<Object>) this.LIZIZ.get(strLJJJJ));
            if (objFromJson == null) {
                map.put(strLJJJJ, objFromJson);
            } else if (objFromJson instanceof Serializable) {
                map.put(strLJJJJ, objFromJson);
            } else {
                "type not supported yet".toString();
                throw new IllegalStateException("type not supported yet");
            }
        }
        c09cu.LJII();
        return map;
    }

    public OnlySerializableModelExtraAdapter(Gson gson, C234000vK c234000vK) {
        this.LIZ = gson;
        this.LIZIZ = c234000vK;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, HashMap<String, Serializable> map) {
        c09dl.LIZLLL();
        for (Map.Entry<String, Serializable> entry : map.entrySet()) {
            String key = entry.getKey();
            Serializable value = entry.getValue();
            Class<?> cls = this.LIZIZ.get(key);
            c09dl.LJIILLIIL(key);
            c09dl.LJJJJJ(GsonProtectorUtils.toJson(this.LIZ, value, cls));
        }
        c09dl.LJII();
    }
}
