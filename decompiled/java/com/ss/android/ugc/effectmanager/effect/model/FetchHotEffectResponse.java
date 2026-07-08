package com.ss.android.ugc.effectmanager.effect.model;

import X.C13OE;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FetchHotEffectResponse extends C13OE<FetchHotEffectResponse> implements Serializable {
    public Data data;
    public boolean isFromCache;
    public String message;
    public int status_code;

    public static class Data implements Serializable {
        public final CategoryEffectModel category_effects;
        public Extra extra;
        public List<String> url_prefix;

        public Data() {
            this(new CategoryEffectModel("", "", false, 0, 0, new ArrayList(), new ArrayList(), new ArrayList(), 0), new Extra(null, null), new ArrayList());
        }

        public List<Effect> getCollection() {
            return this.category_effects.getCollection();
        }

        public List<Effect> getEffects() {
            return this.category_effects.getCategory_effects();
        }

        public String getRecId() {
            Extra extra = this.extra;
            if (extra != null) {
                return extra.getRec_id();
            }
            return null;
        }

        public final Extra getExtra() {
            return this.extra;
        }

        public final List<String> getUrl_prefix() {
            return this.url_prefix;
        }

        public void setCollection(List<? extends Effect> list) {
            this.category_effects.setCollection(list);
        }

        public void setEffects(List<? extends Effect> list) {
            this.category_effects.setCategory_effects(list);
        }

        public final void setExtra(Extra extra) {
            this.extra = extra;
        }

        public void setRecId(String str) {
            Extra extra = this.extra;
            if (extra != null) {
                extra.setRec_id(str);
            }
        }

        public final void setUrl_prefix(List<String> list) {
            this.url_prefix = list;
        }

        public Data(CategoryEffectModel categoryEffectModel, Extra extra, List<String> list) {
            this.category_effects = categoryEffectModel;
            this.extra = extra;
            this.url_prefix = list;
        }
    }

    public FetchHotEffectResponse() {
        this(new Data(new CategoryEffectModel("", "", false, 0, 0, new ArrayList(), new ArrayList(), new ArrayList(), 0), new Extra(null, null), new ArrayList()), null, 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public FetchHotEffectResponse getResponseData() {
        return this;
    }

    public final List<Effect> getCollection_list() {
        return this.data.getCollection();
    }

    public final List<Effect> getEffect_list() {
        return this.data.getEffects();
    }

    public String getRecId() {
        Data data = this.data;
        if (data != null) {
            return data.getRecId();
        }
        return null;
    }

    public List<String> getUrlPrefix() {
        return this.data.getUrl_prefix();
    }

    @Override // X.C13OE
    public boolean checkValue() {
        List<Effect> effect_list = getEffect_list();
        return effect_list != null && (effect_list.isEmpty() ^ true);
    }

    public final List<Effect> getCollection() {
        return getCollection_list();
    }

    public final List<Effect> getEffects() {
        return getEffect_list();
    }

    public static class Extra implements Serializable {
        public List<CategoryPageModel.FilterEffect> filtered_effects;
        public String rec_id;

        public Extra() {
            this(null, null);
        }

        public final List<CategoryPageModel.FilterEffect> getFiltered_effects() {
            return this.filtered_effects;
        }

        public final String getRec_id() {
            return this.rec_id;
        }

        public final void setFiltered_effects(List<CategoryPageModel.FilterEffect> list) {
            this.filtered_effects = list;
        }

        public final void setRec_id(String str) {
            this.rec_id = str;
        }

        public Extra(String str, List<CategoryPageModel.FilterEffect> list) {
            this.rec_id = str;
            this.filtered_effects = list;
        }
    }

    public static final class FilterEffect implements Serializable {
        public Long Id;
        public Long ReasonCode;
        public String ReasonMsg;

        public FilterEffect() {
            this(null, null, null);
        }

        public final Long getId() {
            return this.Id;
        }

        public final Long getReasonCode() {
            return this.ReasonCode;
        }

        public final String getReasonMsg() {
            return this.ReasonMsg;
        }

        public final void setId(Long l) {
            this.Id = l;
        }

        public final void setReasonCode(Long l) {
            this.ReasonCode = l;
        }

        public final void setReasonMsg(String str) {
            this.ReasonMsg = str;
        }

        public FilterEffect(Long l, Long l2, String str) {
            this.Id = l;
            this.ReasonCode = l2;
            this.ReasonMsg = str;
        }
    }

    public final Data getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // X.C13OE
    public /* bridge */ /* synthetic */ FetchHotEffectResponse getResponseData() {
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

    public final boolean isFromCache() {
        return this.isFromCache;
    }

    public final void setCollection_list(List<? extends Effect> list) {
        this.data.setCollection(list);
    }

    public final void setData(Data data) {
        this.data = data;
    }

    public final void setEffect_list(List<? extends Effect> list) {
        this.data.setEffects(list);
    }

    public final void setEffects(List<? extends Effect> list) {
        setEffect_list(list);
    }

    public final void setFromCache(boolean z) {
        this.isFromCache = z;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public void setRecId(String str) {
        Data data = this.data;
        if (data != null) {
            data.setRecId(str);
        }
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setUrlPrefix(List<String> list) {
        Data data = this.data;
        if (data != null) {
            data.setUrl_prefix(list);
        }
    }

    public FetchHotEffectResponse(Data data, String str, int i) {
        this.data = data;
        this.message = str;
        this.status_code = i;
    }
}
