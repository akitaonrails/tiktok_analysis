package com.bytedance.apm.agent.instrumentation.io;

import java.util.EventObject;

/* JADX INFO: loaded from: classes14.dex */
public final class StreamCompleteEvent extends EventObject {
    public static final long serialVersionUID = 1;
    public final long bytes;
    public final Exception exception;

    public boolean isError() {
        return this.exception != null;
    }

    public long getBytes() {
        return this.bytes;
    }

    public Exception getException() {
        return this.exception;
    }

    public StreamCompleteEvent(Object obj, long j) {
        this(obj, j, null);
    }

    public StreamCompleteEvent(Object obj, long j, Exception exc) {
        super(obj);
        this.bytes = j;
        this.exception = exc;
    }
}
