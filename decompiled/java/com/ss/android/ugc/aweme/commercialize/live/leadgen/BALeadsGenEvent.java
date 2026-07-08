package com.ss.android.ugc.aweme.commercialize.live.leadgen;

import X.C09CT;
import X.C1440005kM;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: loaded from: classes13.dex */
public final class BALeadsGenEvent implements IEvent {

    @C09CT("action_type")
    public final String actionType;

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

    public BALeadsGenEvent(String str) {
        this.actionType = str;
    }
}
