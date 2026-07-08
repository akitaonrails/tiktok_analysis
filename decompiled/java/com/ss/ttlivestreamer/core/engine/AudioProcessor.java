package com.ss.ttlivestreamer.core.engine;

import java.nio.Buffer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AudioProcessor extends NativeObject {
    public abstract Buffer process(Buffer buffer, int i, int i2, int i3, long j);
}
