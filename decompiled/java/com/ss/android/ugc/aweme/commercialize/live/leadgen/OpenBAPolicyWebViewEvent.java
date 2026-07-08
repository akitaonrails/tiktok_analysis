package com.ss.android.ugc.aweme.commercialize.live.leadgen;

import X.C09CT;
import X.C1440005kM;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: loaded from: classes13.dex */
public final class OpenBAPolicyWebViewEvent implements IEvent {

    @C09CT("schema")
    public final String schema;

    @C09CT("title")
    public final String title;

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public OpenBAPolicyWebViewEvent(String str, String str2) {
        this.schema = str;
        this.title = str2;
    }
}
