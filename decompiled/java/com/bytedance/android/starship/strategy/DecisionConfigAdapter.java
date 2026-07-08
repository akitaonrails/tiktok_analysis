package com.bytedance.android.starship.strategy;

import X.C786410Ut5;
import X.EnumC1308150k97;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class DecisionConfigAdapter implements j<DecisionConfig>, r<DecisionConfig> {
    public final DecisionConfigTypeAdapter LIZ = new DecisionConfigTypeAdapter();
    public final p LIZIZ = new p();

    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        Integer value;
        DecisionConfig decisionConfig = (DecisionConfig) obj;
        n nVar = new n();
        nVar.LJJIFFI("tags", aVar.LIZIZ(decisionConfig.tags));
        DecisionConfigTypeAdapter decisionConfigTypeAdapter = this.LIZ;
        EnumC1308150k97 enumC1308150k97 = decisionConfig.type;
        decisionConfigTypeAdapter.getClass();
        if (enumC1308150k97 != null) {
            value = enumC1308150k97.getValue();
        } else {
            value = null;
        }
        nVar.LJJIFFI("type", new q((Number) value));
        Object obj2 = decisionConfig.data;
        if (obj2 instanceof JSONObject) {
            nVar.LJJIFFI("data", GsonProtectorUtils.parse(this.LIZIZ, C786410Ut5.J3((JSONObject) obj2)));
            return nVar;
        }
        nVar.LJJIFFI("data", aVar.LIZIZ(obj2));
        return nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0141  */
    @Override // com.google.gson.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.starship.strategy.DecisionConfig deserialize(com.google.gson.k r6, java.lang.reflect.Type r7, com.google.gson.i r8) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.starship.strategy.DecisionConfigAdapter.deserialize(com.google.gson.k, java.lang.reflect.Type, com.google.gson.i):java.lang.Object");
    }
}
