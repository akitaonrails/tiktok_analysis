package com.ss.android.ugc.aweme.ecommercelive.common.container.lynxcard;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LynxCardTemplateEventData {

    @C09CT("params")
    public final LynxCardEventParams params;

    @C09CT("time_stamp")
    public final String timeStamp;

    public LynxCardTemplateEventData() {
        this(null, String.valueOf(System.currentTimeMillis()));
    }

    public LynxCardTemplateEventData(LynxCardEventParams lynxCardEventParams, String str) {
        this.params = lynxCardEventParams;
        this.timeStamp = str;
    }
}
