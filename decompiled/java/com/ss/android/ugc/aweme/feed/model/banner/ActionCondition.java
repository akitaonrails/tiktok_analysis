package com.ss.android.ugc.aweme.feed.model.banner;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class ActionCondition implements Serializable {

    @C09CT("params")
    public final String params;
    public final transient C01GW paramsMap$delegate;

    @C09CT("type")
    public final String type;

    public ActionCondition() {
        this(null, null);
    }

    public final Map<String, Object> getParamsMap() {
        return (Map) this.paramsMap$delegate.getValue();
    }

    public final void prepare() {
        getParamsMap();
    }

    public ActionCondition(String str, String str2) {
        this.type = str;
        this.params = str2;
        this.paramsMap$delegate = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1493));
    }
}
