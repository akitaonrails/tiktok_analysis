package com.ss.android.ugc.effectmanager.knadapt;

import X.InterfaceC20008913Qp;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public final class InputStreamByteRead implements InterfaceC20008913Qp {
    public final InputStream inputStream;

    @Override // X.InterfaceC20008913Qp
    public boolean available() {
        return this.inputStream.available() >= 0;
    }

    @Override // X.InterfaceC20008913Qp
    public void close() throws IOException {
        this.inputStream.close();
    }

    public InputStreamByteRead(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override // X.InterfaceC20008913Qp
    public int read(byte[] bArr, int i, int i2) {
        return this.inputStream.read(bArr, i, i2);
    }
}
