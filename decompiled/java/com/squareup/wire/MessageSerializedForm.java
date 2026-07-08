package com.squareup.wire;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes24.dex */
public final class MessageSerializedForm<M extends Message<M, B>, B extends Message.Builder<M, B>> implements Serializable {
    public static final long serialVersionUID = 0;
    public final byte[] LL;
    public final Class<M> LLILLJJLI;

    public Object readResolve() throws StreamCorruptedException {
        try {
            return ProtoAdapter.get(this.LLILLJJLI).decode(this.LL);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new StreamCorruptedException(e.getMessage());
        }
    }

    public MessageSerializedForm(byte[] bArr, Class<M> cls) {
        this.LL = bArr;
        this.LLILLJJLI = cls;
    }
}
