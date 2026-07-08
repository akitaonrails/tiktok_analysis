package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public final class EventRegisterData extends BaseResponse {
    public String aid;

    @C09CT("sharer_info")
    public EventRegister eventRegister;

    public final String getAid() {
        return this.aid;
    }

    public final EventRegister getEventRegister() {
        return this.eventRegister;
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setEventRegister(EventRegister eventRegister) {
        this.eventRegister = eventRegister;
    }
}
