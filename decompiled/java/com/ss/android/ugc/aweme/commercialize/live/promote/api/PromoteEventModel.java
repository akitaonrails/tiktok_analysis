package com.ss.android.ugc.aweme.commercialize.live.promote.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PromoteEventModel implements Serializable {

    @C09CT("common")
    public PromoteEventCommon common;

    @C09CT("ev_type")
    public String evType;

    @C09CT("payload")
    public PromoteEventPayload payload;

    public PromoteEventModel() {
        this("custom", null, null);
    }

    public final PromoteEventCommon getCommon() {
        return this.common;
    }

    public final String getEvType() {
        return this.evType;
    }

    public final PromoteEventPayload getPayload() {
        return this.payload;
    }

    public final void setCommon(PromoteEventCommon promoteEventCommon) {
        this.common = promoteEventCommon;
    }

    public final void setEvType(String str) {
        this.evType = str;
    }

    public final void setPayload(PromoteEventPayload promoteEventPayload) {
        this.payload = promoteEventPayload;
    }

    public PromoteEventModel(String str, PromoteEventCommon promoteEventCommon, PromoteEventPayload promoteEventPayload) {
        this.evType = str;
        this.common = promoteEventCommon;
        this.payload = promoteEventPayload;
    }
}
