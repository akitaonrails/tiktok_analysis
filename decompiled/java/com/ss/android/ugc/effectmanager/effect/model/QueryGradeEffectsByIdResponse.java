package com.ss.android.ugc.effectmanager.effect.model;

import X.C13OE;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class QueryGradeEffectsByIdResponse extends C13OE<QueryGradeEffectsByIdResponse> implements Serializable {
    public Map<String, ? extends List<? extends Effect>> data;
    public boolean has_more;
    public String message;
    public int next_cursor;
    public int status_code;
    public List<String> url_prefix;

    public QueryGradeEffectsByIdResponse() {
        this(new ArrayList(), 0, null, false, 0, new LinkedHashMap());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public QueryGradeEffectsByIdResponse getResponseData() {
        return this;
    }

    public final Map<String, List<Effect>> getData() {
        return this.data;
    }

    public final Map<String, List<Effect>> getGradeEffects() {
        return this.data;
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
    public /* bridge */ /* synthetic */ QueryGradeEffectsByIdResponse getResponseData() {
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

    public final List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public final void setData(Map<String, ? extends List<? extends Effect>> map) {
        this.data = map;
    }

    public final void setGradeEffects(Map<String, ? extends List<? extends Effect>> map) {
        this.data = map;
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

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setUrl_prefix(List<String> list) {
        this.url_prefix = list;
    }

    public QueryGradeEffectsByIdResponse(List<String> list, int i, String str, boolean z, int i2, Map<String, ? extends List<? extends Effect>> map) {
        this.url_prefix = list;
        this.status_code = i;
        this.message = str;
        this.has_more = z;
        this.next_cursor = i2;
        this.data = map;
    }
}
