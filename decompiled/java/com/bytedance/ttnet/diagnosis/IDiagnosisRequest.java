package com.bytedance.ttnet.diagnosis;

/* JADX INFO: loaded from: classes24.dex */
public interface IDiagnosisRequest {
    void cancel();

    void doExtraCommand(String str, String str2);

    void setUserExtraInfo(String str);

    void start(IDiagnosisCallback iDiagnosisCallback);
}
