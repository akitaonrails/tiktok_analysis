package com.ss.android.ugc.effectmanager.effect.model;

import X.C13OE;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class QueryRewardEffectsResponse extends C13OE<QueryRewardEffectsResponse> implements Serializable {
    public boolean has_more;
    public String message;
    public int next_cursor;
    public List<? extends Effect> reward_effects;
    public int status_code;
    public List<String> url_prefix;

    public QueryRewardEffectsResponse() {
        this(new ArrayList(), 0, null, false, 0, new ArrayList());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public QueryRewardEffectsResponse getResponseData() {
        return this;
    }

    public final boolean getHas_more() {
        return this.has_more;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getNext_cursor() {
        return this.next_cursor;
    }

    @Override // X.C13OE
    public /* bridge */ /* synthetic */ QueryRewardEffectsResponse getResponseData() {
        getResponseData();
        return this;
    }

    @Override // X.C13OE
    public String getResponseMessage() {
        return this.message;
    }

    public final List<Effect> getRewardEffects() {
        return this.reward_effects;
    }

    public final List<Effect> getReward_effects() {
        return this.reward_effects;
    }

    @Override // X.C13OE
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public final void setHas_more(boolean z) {
        this.has_more = z;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setNext_cursor(int i) {
        this.next_cursor = i;
    }

    public final void setRewardEffects(List<? extends Effect> list) {
        this.reward_effects = list;
    }

    public final void setReward_effects(List<? extends Effect> list) {
        this.reward_effects = list;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setUrl_prefix(List<String> list) {
        this.url_prefix = list;
    }

    public QueryRewardEffectsResponse(List<String> list, int i, String str, boolean z, int i2, List<? extends Effect> list2) {
        this.url_prefix = list;
        this.status_code = i;
        this.message = str;
        this.has_more = z;
        this.next_cursor = i2;
        this.reward_effects = list2;
    }
}
