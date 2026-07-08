package com.ss.ugc.effectplatform.model.net;

import X.C09CT;
import X.C13OE;
import com.ss.android.ugc.effectmanager.common.model.MaterialResource;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class MaterialResourceListResponse extends C13OE<List<? extends MaterialResource>> implements Serializable {
    public String message;
    public List<MaterialResource> resources;

    @C09CT("status_code")
    public int statusCode;

    public final String getMessage() {
        return this.message;
    }

    public final List<MaterialResource> getResources() {
        return this.resources;
    }

    @Override // X.C13OE
    public String getResponseMessage() {
        return this.message;
    }

    @Override // X.C13OE
    public int getStatusCode() {
        return this.statusCode;
    }

    @Override // X.C13OE
    public List<? extends MaterialResource> getResponseData() {
        return this.resources;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setResources(List<MaterialResource> list) {
        this.resources = list;
    }
}
