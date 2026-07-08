package com.bytedance.geckox.settings.model;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class NGSettings {
    public final List<EventMapper> mappers;
    public final Map<String, List<Resource>> resources;
    public final int version;

    /* JADX WARN: Multi-variable type inference failed */
    public NGSettings(int i, Map<String, ? extends List<Resource>> map, List<EventMapper> list) {
        this.version = i;
        this.resources = map;
        this.mappers = list;
    }
}
