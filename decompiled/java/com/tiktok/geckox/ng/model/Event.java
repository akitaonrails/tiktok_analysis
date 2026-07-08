package com.tiktok.geckox.ng.model;

import X.EnumC919040a1W;
import com.bytedance.geckox.settings.model.MatchRule;
import com.bytedance.geckox.settings.model.Resource;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public final class Event {
    public final List<Resource> channels;
    public final MatchRule matchRule;
    public final String name;
    public Map<String, ? extends Object> params;
    public final Function0<Map<String, Object>> paramsGetter;
    public final EnumC919040a1W type;

    public final void setParams(Map<String, ? extends Object> map) {
        this.params = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Event(String str, Map<String, ? extends Object> map, Function0<? extends Map<String, ? extends Object>> function0, MatchRule matchRule, List<Resource> list, EnumC919040a1W enumC919040a1W) {
        this.name = str;
        this.params = map;
        this.paramsGetter = function0;
        this.matchRule = matchRule;
        this.channels = list;
        this.type = enumC919040a1W;
    }
}
