package com.bytedance.pitaya.cep_engine.port;

import com.bytedance.pitaya.cep_engine.CepResult;

/* JADX INFO: loaded from: classes21.dex */
public interface CepCallback extends CepKeeper {
    void onResult(CepResult cepResult);
}
