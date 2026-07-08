package com.ss.android.ugc.aweme.friends.model;

import X.C1440005kM;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: loaded from: classes17.dex */
public final class BackFromSettingEvent implements IEvent {
    public final String enterFrom;

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

    public BackFromSettingEvent(String str) {
        this.enterFrom = str;
    }
}
