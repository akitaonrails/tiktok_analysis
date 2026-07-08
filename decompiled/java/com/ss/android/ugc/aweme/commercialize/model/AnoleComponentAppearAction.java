package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AnoleComponentAppearAction implements Serializable {

    @C09CT("params")
    public final Map<String, Object> params;

    @C09CT("type")
    public final String type;

    public AnoleComponentAppearAction(String str, Map<String, ? extends Object> map) {
        this.type = str;
        this.params = map;
    }
}
