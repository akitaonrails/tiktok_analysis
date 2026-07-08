package com.ss.ugc.android.editor.base.model;

import X.C09CT;
import com.ss.ugc.android.editor.base.network.BaseHttpResponseBean;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class QueryResponse extends BaseHttpResponseBean<List<Object>> implements Serializable {

    @C09CT("utterances")
    public final List<Object> data;
    public final Double duration;
    public final String id;

    @Override // com.ss.ugc.android.editor.base.network.BaseHttpResponseBean
    public String getHttpCode() {
        String code = getCode();
        return code == null ? "" : code;
    }

    @Override // com.ss.ugc.android.editor.base.network.BaseHttpResponseBean
    public String getHttpMessage() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public final Double getDuration() {
        return this.duration;
    }

    @Override // com.ss.ugc.android.editor.base.network.BaseHttpResponseBean
    public List<Object> getData() {
        return this.data;
    }
}
