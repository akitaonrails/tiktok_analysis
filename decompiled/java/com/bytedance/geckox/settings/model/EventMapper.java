package com.bytedance.geckox.settings.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class EventMapper {

    @C09CT("event")
    public final String eventName;
    public List<Matcher> matchers;
    public List<Resource> resources;

    public final void setMatchers(List<Matcher> list) {
        this.matchers = list;
    }

    public final void setResources(List<Resource> list) {
        this.resources = list;
    }

    public EventMapper(String str, List<Matcher> list, List<Resource> list2) {
        this.eventName = str;
        this.matchers = list;
        this.resources = list2;
    }
}
