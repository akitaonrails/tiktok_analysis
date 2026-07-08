package com.bytedance.apm.agent.instrumentation.io;

/* JADX INFO: loaded from: classes14.dex */
public interface StreamCompleteListener {
    void streamComplete(StreamCompleteEvent streamCompleteEvent);

    void streamError(StreamCompleteEvent streamCompleteEvent);
}
