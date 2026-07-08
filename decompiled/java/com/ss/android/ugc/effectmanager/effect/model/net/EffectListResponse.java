package com.ss.android.ugc.effectmanager.effect.model.net;

import X.C13OE;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public class EffectListResponse extends C13OE<List<? extends Effect>> implements Serializable {
    public List<? extends Effect> bind_effects;
    public List<? extends Effect> collection;
    public List<? extends Effect> data;
    public String message;
    public int status_code;
    public List<String> url_prefix;

    public EffectListResponse() {
        this(new ArrayList(), new ArrayList(), new ArrayList(), 0, null, new ArrayList());
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

    public final List<Effect> getData() {
        return this.data;
    }

    public final List<Effect> getEffect_list() {
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

    public final List<String> getUrlPrefix() {
        return this.url_prefix;
    }

    public final List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    @Override // X.C13OE
    public List<? extends Effect> getResponseData() {
        return this.data;
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

    public final void setData(List<? extends Effect> list) {
        this.data = list;
    }

    public final void setEffect_list(List<? extends Effect> list) {
        this.data = list;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setUrlPrefix(List<String> list) {
        this.url_prefix = list;
    }

    public final void setUrl_prefix(List<String> list) {
        this.url_prefix = list;
    }

    public EffectListResponse(List<String> list, List<? extends Effect> list2, List<? extends Effect> list3, int i, String str, List<? extends Effect> list4) {
        this.url_prefix = list;
        this.bind_effects = list2;
        this.collection = list3;
        this.status_code = i;
        this.message = str;
        this.data = list4;
    }
}
