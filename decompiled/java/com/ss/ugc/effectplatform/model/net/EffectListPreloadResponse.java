package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class EffectListPreloadResponse extends C13OE<EffectListPreloadResponse> implements Serializable {
    public List<? extends Effect> bind_effects;
    public List<? extends Effect> collection;
    public List<? extends Effect> data;
    public String message;
    public final List<String> preloading_effect_id_list;
    public int status_code;
    public List<String> url_prefix;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public EffectListPreloadResponse getResponseData() {
        return this;
    }

    @Override // X.C13OE
    public boolean checkValue() {
        return !this.data.isEmpty();
    }

    public final List<Effect> getPreloadEffectList() {
        ArrayList arrayList = new ArrayList();
        List<? extends Effect> list = this.data;
        if (list != null) {
            arrayList.addAll(list);
        }
        List<? extends Effect> list2 = this.collection;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        List<? extends Effect> list3 = this.bind_effects;
        if (list3 != null) {
            arrayList.addAll(list3);
        }
        return arrayList;
    }

    public final List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    public final List<Effect> getCollection() {
        return this.collection;
    }

    public final List<Effect> getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<String> getPreloading_effect_id_list() {
        return this.preloading_effect_id_list;
    }

    @Override // X.C13OE
    public /* bridge */ /* synthetic */ EffectListPreloadResponse getResponseData() {
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

    public final void setBind_effects(List<? extends Effect> list) {
        this.bind_effects = list;
    }

    public final void setCollection(List<? extends Effect> list) {
        this.collection = list;
    }

    public final void setData(List<? extends Effect> list) {
        this.data = list;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setUrl_prefix(List<String> list) {
        this.url_prefix = list;
    }

    public EffectListPreloadResponse(List<String> list, List<? extends Effect> list2, List<? extends Effect> list3, List<? extends Effect> list4, List<String> list5, int i, String str) {
        this.preloading_effect_id_list = list;
        this.data = list2;
        this.collection = list3;
        this.bind_effects = list4;
        this.url_prefix = list5;
        this.status_code = i;
        this.message = str;
    }
}
