package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Effect {

    @C09CT("bgms")
    public final List<String> bgms;

    @C09CT("Link")
    public final List<Link> links;

    @C09CT("model_names")
    public final Map<String, List<String>> modelNames;

    @C09CT("requirement")
    public final Map<String, Boolean> requirement;

    public Effect() {
        this(null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Effect(List<Link> list, Map<String, ? extends List<String>> map, List<String> list2, Map<String, Boolean> map2) {
        this.links = list;
        this.modelNames = map;
        this.bgms = list2;
        this.requirement = map2;
    }
}
