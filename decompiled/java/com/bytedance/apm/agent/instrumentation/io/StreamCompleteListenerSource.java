package com.bytedance.apm.agent.instrumentation.io;

/* JADX INFO: loaded from: classes14.dex */
public interface StreamCompleteListenerSource {
    void addStreamCompleteListener(StreamCompleteListener streamCompleteListener);

    void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener);
}
