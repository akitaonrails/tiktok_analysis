package com.ss.android.ugc.aweme.im.chatlist.api.extension;

import X.C01GW;
import X.C051B;
import X.C452501pT;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.r;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class FilterTabTypeMapAdapter implements r<Map<FilterTabType, ? extends Integer>>, j<Map<FilterTabType, ? extends Integer>> {
    public static final C01GW<Pair<Map<String, FilterTabType>, Map<FilterTabType, String>>> LIZ = C452501pT.LIZIZ(new C051B());

    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        n nVar = new n();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            FilterTabType filterTabType = (FilterTabType) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            String strName = LIZ.getValue().getSecond().get(filterTabType);
            if (strName == null) {
                strName = filterTabType.name();
            }
            nVar.LJJIII(Integer.valueOf(iIntValue), strName);
        }
        return nVar;
    }

    @Override // com.google.gson.j
    public final Map<FilterTabType, ? extends Integer> deserialize(k kVar, Type type, i iVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (kVar instanceof n) {
            for (Map.Entry<String, k> entry : kVar.LJIILIIL().entrySet()) {
                String key = entry.getKey();
                k value = entry.getValue();
                FilterTabType filterTabType = LIZ.getValue().getFirst().get(key);
                if (filterTabType != null) {
                    linkedHashMap.put(filterTabType, Integer.valueOf(value.LJIIJJI()));
                }
            }
        }
        return linkedHashMap;
    }
}
