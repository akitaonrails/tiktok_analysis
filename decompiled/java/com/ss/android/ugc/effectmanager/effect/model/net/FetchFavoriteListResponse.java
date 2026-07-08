package com.ss.android.ugc.effectmanager.effect.model.net;

import X.C13OE;
import X.C1697810uHb;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public class FetchFavoriteListResponse extends C13OE<FetchFavoriteListResponse> implements Serializable {
    public List<? extends Data> data;
    public String message;
    public int status_code;

    public static class Data implements Serializable {
        public List<? extends Effect> bind_effects;
        public List<? extends Effect> collection;
        public List<? extends Effect> effects;
        public String type;
        public List<String> url_prefix;

        public Data() {
            this("", new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
        }

        public List<Effect> getBind_effects() {
            return this.bind_effects;
        }

        public List<Effect> getCollection() {
            return this.collection;
        }

        public List<Effect> getEffects() {
            return this.effects;
        }

        public String getType() {
            return this.type;
        }

        public List<String> getUrl_prefix() {
            return this.url_prefix;
        }

        public void setBind_effects(List<? extends Effect> list) {
            this.bind_effects = list;
        }

        public void setCollection(List<? extends Effect> list) {
            this.collection = list;
        }

        public void setEffects(List<? extends Effect> list) {
            this.effects = list;
        }

        public void setType(String str) {
            this.type = str;
        }

        public void setUrl_prefix(List<String> list) {
            this.url_prefix = list;
        }

        public Data(String str, List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3, List<String> list4) {
            this.type = str;
            this.effects = list;
            this.collection = list2;
            this.bind_effects = list3;
            this.url_prefix = list4;
        }
    }

    public FetchFavoriteListResponse() {
        this(new ArrayList(), null, 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public FetchFavoriteListResponse getResponseData() {
        return this;
    }

    @Override // X.C13OE
    public boolean checkValue() {
        return !getData().isEmpty();
    }

    public final List<Effect> getBindEffects() {
        return getData().isEmpty() ? new ArrayList() : ((Data) ListProtector.get(getData(), 0)).getBind_effects();
    }

    public final List<Effect> getCollectEffects() {
        return getData().isEmpty() ? new ArrayList() : ((Data) ListProtector.get(getData(), 0)).getCollection();
    }

    public final List<Effect> getCollection_effects() {
        return ((Data) ListProtector.get(getData(), 0)).getCollection();
    }

    public final List<Effect> getEffect_list() {
        return ((Data) ListProtector.get(getData(), 0)).getEffects();
    }

    public final List<Effect> getEffects() {
        return getData().isEmpty() ? new ArrayList() : ((Data) ListProtector.get(getData(), 0)).getEffects();
    }

    @Override // X.C13OE
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // X.C13OE
    public int getStatusCode() {
        return getStatus_code();
    }

    public final String getType() {
        return getData().isEmpty() ? "" : ((Data) ListProtector.get(getData(), 0)).getType();
    }

    public final List<String> getUrlPrefix() {
        return getData().isEmpty() ? new ArrayList() : ((Data) ListProtector.get(getData(), 0)).getUrl_prefix();
    }

    public List<Data> getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    @Override // X.C13OE
    public /* bridge */ /* synthetic */ FetchFavoriteListResponse getResponseData() {
        getResponseData();
        return this;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public final void setCollection_effects(List<? extends Effect> list) {
        if (getData().isEmpty()) {
            setData(C1697810uHb.LJ(new Data("", new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList())));
        }
        ((Data) ListProtector.get(getData(), 0)).setCollection(list);
    }

    public void setData(List<? extends Data> list) {
        this.data = list;
    }

    public final void setEffect_list(List<? extends Effect> list) {
        if (getData().isEmpty()) {
            setData(C1697810uHb.LJ(new Data("", new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList())));
        }
        ((Data) ListProtector.get(getData(), 0)).setEffects(list);
    }

    public final void setEffects(List<? extends Effect> list) {
        if (getData().isEmpty()) {
            return;
        }
        ((Data) ListProtector.get(getData(), 0)).setEffects(list);
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public FetchFavoriteListResponse(List<? extends Data> list, String str, int i) {
        this.data = list;
        this.message = str;
        this.status_code = i;
    }
}
