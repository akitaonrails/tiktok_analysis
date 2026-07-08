package com.ss.android.ugc.aweme.services.external;

import X.C1440005kM;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: loaded from: classes9.dex */
public final class HelpCenterResultEvent implements IEvent {
    public final int actionType;

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

    public final int getActionType() {
        return this.actionType;
    }

    public HelpCenterResultEvent(int i) {
        this.actionType = i;
    }
}
