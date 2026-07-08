package com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android;

import X.AbstractC1283560jVS;
import X.AbstractC1283580jVU;
import X.C1283590jVV;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public class LinkMicMessageListener extends AbstractC1283560jVS {
    private final native void MoltenFfiNativeOnMessageX2601151541499653034(long j, ByteBuffer byteBuffer);

    public static final native void molten_ffi_link_mic_sdk_LinkMicMessageListener_free(long j);

    @Override // X.AbstractC1283560jVS
    public final void LIZ() {
        AbstractC1283580jVU abstractC1283580jVU = this.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            molten_ffi_link_mic_sdk_LinkMicMessageListener_free(((C1283590jVV) abstractC1283580jVU).LIZ);
        }
    }

    public LinkMicMessageListener(C1283590jVV c1283590jVV) {
        super(c1283590jVV);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        if (r10.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ad, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C968110bIf r11) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMessageListener.LIZIZ(X.0bIf):void");
    }
}
