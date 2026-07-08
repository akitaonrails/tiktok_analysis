package com.bytedance.apm.agent.instrumentation.io;

import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public final class CInputStream extends CInputStreamParent {
    public CInputStream(InputStream inputStream) {
        this(inputStream, false);
    }

    public CInputStream(InputStream inputStream, boolean z) {
        super(inputStream, z);
    }
}
