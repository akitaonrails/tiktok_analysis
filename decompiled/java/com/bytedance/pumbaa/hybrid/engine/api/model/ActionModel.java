package com.bytedance.pumbaa.hybrid.engine.api.model;

import X.C09CT;
import X.EnumC822260WNk;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class ActionModel {

    @C09CT("params")
    public final Map<String, Object> params;

    @C09CT("name")
    public final EnumC822260WNk type;

    public final boolean LIZ() {
        Map<String, Object> map = this.params;
        Object obj = map != null ? map.get("block_enable") : null;
        Number number = obj instanceof Number ? (Number) obj : null;
        return number != null && number.intValue() == 1;
    }

    public ActionModel(EnumC822260WNk enumC822260WNk, Map<String, ? extends Object> map) {
        this.type = enumC822260WNk;
        this.params = map;
    }
}
