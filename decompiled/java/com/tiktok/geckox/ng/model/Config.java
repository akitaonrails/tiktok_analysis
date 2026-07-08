package com.tiktok.geckox.ng.model;

import X.C09CT;
import com.bytedance.geckox.settings.model.EventMapper;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class Config {

    @C09CT("mappers")
    public final List<EventMapper> eventMappers;

    public Config(List<EventMapper> list) {
        this.eventMappers = list;
    }
}
