package com.ss.android.ugc.aweme.socialavatar.mixstudio.ids;

import X.C13BV;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class InMemoryIdSelectionCache implements IdSelectionCache {
    public final Map<String, List<Pair<Integer, String>>> LIZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdSelectionCache
    public final List<Pair<Integer, String>> LIZIZ(String str) {
        List<Pair<Integer, String>> list;
        if (str.length() <= 0 || this == null || (list = (List) ((LinkedHashMap) this.LIZ).get(str)) == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdSelectionCache
    public final void LIZ(String str, List<Pair<Integer, String>> list) {
        if (str.length() == 0) {
            return;
        }
        this.LIZ.put(str, list);
    }
}
