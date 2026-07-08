package com.ss.android.ugc.aweme.feed.model.banner.parser;

import X.C09C2;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2097608Jq;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class MapTypeAdapter extends TypeAdapter<Map<String, ? extends Object>> {
    public final Gson gson = C09C2.LIZ();
    public final MapTypeAdapter$mapTypeToken$1 mapTypeToken = new TypeToken<Map<String, ? extends Object>>() { // from class: com.ss.android.ugc.aweme.feed.model.banner.parser.MapTypeAdapter$mapTypeToken$1
    };

    @Override // com.google.gson.TypeAdapter
    public Map<String, ? extends Object> read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            c09cu.LJJJJJL();
            return C2097608Jq.LJ();
        }
        try {
            Map<String, ? extends Object> map = (Map) GsonProtectorUtils.fromJson(this.gson, c09cu.LJJJZ(), getType());
            if (map != null) {
                return map;
            }
            return C2097608Jq.LJ();
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            throw new s("Failed to parse map", e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(C09DL c09dl, Map<String, ? extends Object> map) {
        if (map == null) {
            c09dl.LJIJJ();
            return;
        }
        try {
            c09dl.LJIILL(GsonProtectorUtils.toJson(this.gson, map));
        } catch (l e) {
            TryCatchGuardChecker.doCheck(e);
            throw new l("Failed to write map value", e);
        }
    }
}
