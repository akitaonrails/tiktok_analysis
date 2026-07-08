package com.ss.android.ugc.effectmanager.effect.model;

import X.C13OE;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class SearchEffectResponse extends C13OE<SearchEffectResponse> implements Serializable {
    public List<? extends Effect> bind_effects;
    public List<? extends Effect> collection;
    public int cursor;
    public List<? extends Effect> effects;
    public boolean has_more;
    public String message;
    public int status_code;

    public SearchEffectResponse() {
        this(false, 0, new ArrayList(), new ArrayList(), new ArrayList(), 0, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public SearchEffectResponse getResponseData() {
        return this;
    }

    @Override // X.C13OE
    public boolean checkValue() {
        return !getEffect_list().isEmpty();
    }

    public final List<Effect> getBindEffects() {
        return this.bind_effects;
    }

    public final List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    public final List<Effect> getCollection() {
        return this.collection;
    }

    public final List<Effect> getCollection_list() {
        return this.collection;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final List<Effect> getEffect_list() {
        return this.effects;
    }

    public final List<Effect> getEffects() {
        return this.effects;
    }

    public final boolean getHasMore() {
        return this.has_more;
    }

    public final boolean getHas_more() {
        return this.has_more;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // X.C13OE
    public /* bridge */ /* synthetic */ SearchEffectResponse getResponseData() {
        getResponseData();
        return this;
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

    public final void setBindEffects(List<? extends Effect> list) {
        this.bind_effects = list;
    }

    public final void setBind_effects(List<? extends Effect> list) {
        this.bind_effects = list;
    }

    public final void setCollection(List<? extends Effect> list) {
        this.collection = list;
    }

    public final void setCollection_list(List<? extends Effect> list) {
        this.collection = list;
    }

    public final void setCursor(int i) {
        this.cursor = i;
    }

    public final void setEffect_list(List<? extends Effect> list) {
        this.effects = list;
    }

    public final void setEffects(List<? extends Effect> list) {
        this.effects = list;
    }

    public final void setHasMore(boolean z) {
        this.has_more = z;
    }

    public final void setHas_more(boolean z) {
        this.has_more = z;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public SearchEffectResponse(boolean z, int i, List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3, int i2, String str) {
        this.has_more = z;
        this.cursor = i;
        this.effects = list;
        this.collection = list2;
        this.bind_effects = list3;
        this.status_code = i2;
        this.message = str;
    }
}
