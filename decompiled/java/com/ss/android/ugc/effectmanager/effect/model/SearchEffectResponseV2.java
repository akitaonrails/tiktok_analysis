package com.ss.android.ugc.effectmanager.effect.model;

import X.C13OE;
import java.io.Serializable;

/* JADX INFO: loaded from: classes26.dex */
public class SearchEffectResponseV2 extends C13OE<SearchEffectResponseV2> implements Serializable {
    public SearchEffectModel data;
    public String message;
    public SearchNilInfo search_nil_info;
    public int status_code;

    public SearchEffectResponseV2() {
        this(null, null, 0, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public SearchEffectResponseV2 getResponseData() {
        return this;
    }

    @Override // X.C13OE
    public boolean checkValue() {
        return this.data != null;
    }

    public final SearchEffectModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // X.C13OE
    public /* bridge */ /* synthetic */ SearchEffectResponseV2 getResponseData() {
        getResponseData();
        return this;
    }

    @Override // X.C13OE
    public String getResponseMessage() {
        return this.message;
    }

    public final SearchNilInfo getSearch_nil_info() {
        return this.search_nil_info;
    }

    @Override // X.C13OE
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final void setData(SearchEffectModel searchEffectModel) {
        this.data = searchEffectModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setSearch_nil_info(SearchNilInfo searchNilInfo) {
        this.search_nil_info = searchNilInfo;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public SearchEffectResponseV2(SearchEffectModel searchEffectModel, SearchNilInfo searchNilInfo, int i, String str) {
        this.data = searchEffectModel;
        this.search_nil_info = searchNilInfo;
        this.status_code = i;
        this.message = str;
    }
}
