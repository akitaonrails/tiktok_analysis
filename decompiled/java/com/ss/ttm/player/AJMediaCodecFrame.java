package com.ss.ttm.player;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class AJMediaCodecFrame implements Cloneable {
    public ByteBuffer data;
    public int flags;
    public int index;
    public long pts = -269488145;
    public int size;

    public final Object clone() {
        try {
            return (AJMediaCodecFrame) super.clone();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
