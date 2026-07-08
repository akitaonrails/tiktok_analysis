package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class ConvertOidToUrlResponse extends C13OE<ConvertOidToUrlResponse> implements Serializable {
    public int status_code;
    public String status_msg;
    public List<? extends ResourceUrl> url_list;

    public ConvertOidToUrlResponse() {
        this(null, 0, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public ConvertOidToUrlResponse getResponseData() {
        return this;
    }

    @Override // X.C13OE
    public String getResponseMessage() {
        return getStatus_msg();
    }

    @Override // X.C13OE
    public int getStatusCode() {
        return getStatus_code();
    }

    @Override // X.C13OE
    public /* bridge */ /* synthetic */ ConvertOidToUrlResponse getResponseData() {
        getResponseData();
        return this;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public String getStatus_msg() {
        return this.status_msg;
    }

    public List<ResourceUrl> getUrl_list() {
        return this.url_list;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setStatus_msg(String str) {
        this.status_msg = str;
    }

    public void setUrl_list(List<? extends ResourceUrl> list) {
        this.url_list = list;
    }

    public ConvertOidToUrlResponse(List<? extends ResourceUrl> list, int i, String str) {
        this.url_list = list;
        this.status_code = i;
        this.status_msg = str;
    }
}
