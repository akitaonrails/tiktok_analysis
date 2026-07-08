package com.ss.android.ugc.effectmanager.common.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class SingleAlgorithmModelResponse implements Serializable {
    public ModelInfo data;
    public int status_code;

    public final void setData(ModelInfo modelInfo) {
        this.data = modelInfo;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public SingleAlgorithmModelResponse(int i, ModelInfo modelInfo) {
        this.status_code = i;
        this.data = modelInfo;
    }
}
