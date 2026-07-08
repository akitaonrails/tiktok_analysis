package com.ss.android.ugc.aweme.sidebar.model;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.Map;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarComponentEventParams {
    public final transient C01GW LIZ;

    @C09CT("biz_params")
    public final String bizParamsRaw;

    @C09CT("event")
    public final String event;

    @C09CT("type")
    public final String type;

    public SideBarComponentEventParams() {
        this(null, null, null);
    }

    public final Map<String, Object> LIZ() {
        return (Map) this.LIZ.getValue();
    }

    public SideBarComponentEventParams(String str, String str2, String str3) {
        this.event = str;
        this.type = str2;
        this.bizParamsRaw = str3;
        this.LIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1146));
    }
}
