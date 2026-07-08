package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class QueryCustomizedEffectsResponse extends C13OE<QueryCustomizedEffectsData> implements Serializable {
    public QueryCustomizedEffectsData data;
    public String message;
    public int status_code;

    public QueryCustomizedEffectsResponse() {
        this(0, null, null);
    }

    public final QueryCustomizedEffectsData getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // X.C13OE
    public String getResponseMessage() {
        return this.message;
    }

    @Override // X.C13OE
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public QueryCustomizedEffectsData getResponseData() {
        return this.data;
    }

    public final void setData(QueryCustomizedEffectsData queryCustomizedEffectsData) {
        this.data = queryCustomizedEffectsData;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public QueryCustomizedEffectsResponse(int i, String str, QueryCustomizedEffectsData queryCustomizedEffectsData) {
        this.status_code = i;
        this.message = str;
        this.data = queryCustomizedEffectsData;
    }
}
