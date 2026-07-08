package com.bytedance.android.starship.strategy;

import X.C09CS;
import X.C09CT;
import X.C13BV;
import X.EnumC1308150k97;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes21.dex */
@C09CS(DecisionConfigAdapter.class)
public final class DecisionConfig {

    @C09CT("data")
    public final Object data;

    @C09CT("tags")
    public final List<String> tags;

    @C09CT("type")
    @C09CS(DecisionConfigTypeAdapter.class)
    public final EnumC1308150k97 type;

    public DecisionConfig() {
        this(null, null, null, 7, null);
    }

    public DecisionConfig(List<String> list, EnumC1308150k97 enumC1308150k97, Object obj) {
        this.tags = list;
        this.type = enumC1308150k97;
        this.data = obj;
    }

    public DecisionConfig(List list, EnumC1308150k97 enumC1308150k97, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? EnumC1308150k97.UNKNOWN : enumC1308150k97, (i & 4) != 0 ? null : obj);
    }
}
