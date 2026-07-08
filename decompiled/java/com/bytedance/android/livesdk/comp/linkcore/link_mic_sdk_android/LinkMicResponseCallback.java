package com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android;

import X.AbstractC1283560jVS;
import X.AbstractC1283580jVU;
import X.C1283590jVV;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public class LinkMicResponseCallback extends AbstractC1283560jVS {
    private final native void MoltenFfiNativeOnResponseX8743245684353967898(long j, ByteBuffer byteBuffer);

    public static final native void molten_ffi_link_mic_sdk_LinkMicResponseCallback_free(long j);

    @Override // X.AbstractC1283560jVS
    public final void LIZ() {
        AbstractC1283580jVU abstractC1283580jVU = this.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            molten_ffi_link_mic_sdk_LinkMicResponseCallback_free(((C1283590jVV) abstractC1283580jVU).LIZ);
        }
    }

    public LinkMicResponseCallback(C1283590jVV c1283590jVV) {
        super(c1283590jVV);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (r11.LLILLL.decrementAndGet() == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C2183221AcS r12) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicResponseCallback.LIZIZ(X.1AcS):void");
    }
}
