package com.lynx.tasm.service.security;

import X.C0X80;
import X.C0X87;
import X.C0X8D;
import com.lynx.tasm.service.IServiceProvider;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes14.dex */
public interface ILynxSecurityService extends IServiceProvider {
    @Override // com.lynx.tasm.service.IServiceProvider
    Class<? extends IServiceProvider> getServiceClass();

    C0X80 verifyTASM(C0X8D c0x8d, byte[] bArr, ByteBuffer byteBuffer, String str, C0X87 c0x87);
}
