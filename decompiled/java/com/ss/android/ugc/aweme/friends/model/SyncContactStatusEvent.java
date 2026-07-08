package com.ss.android.ugc.aweme.friends.model;

import X.C1440005kM;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: loaded from: classes17.dex */
public final class SyncContactStatusEvent implements IEvent {
    public final String enterFrom;
    public final boolean isSuccess;
    public final boolean lastValue;

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

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final boolean getLastValue() {
        return this.lastValue;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public SyncContactStatusEvent(String str, boolean z, boolean z2) {
        this.enterFrom = str;
        this.isSuccess = z;
        this.lastValue = z2;
    }
}
