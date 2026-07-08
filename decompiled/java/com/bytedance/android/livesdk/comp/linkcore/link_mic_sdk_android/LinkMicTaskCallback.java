package com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android;

import X.AbstractC1283560jVS;
import X.AbstractC1283580jVU;
import X.C1283590jVV;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class LinkMicTaskCallback extends AbstractC1283560jVS {
    private final native void MoltenFfiNativeOnCompletionX3585148652501022803(long j, ByteBuffer byteBuffer);

    public static final native void molten_ffi_link_mic_sdk_LinkMicTaskCallback_free(long j);

    @Override // X.AbstractC1283560jVS
    public final void LIZ() {
        AbstractC1283580jVU abstractC1283580jVU = this.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            molten_ffi_link_mic_sdk_LinkMicTaskCallback_free(((C1283590jVV) abstractC1283580jVU).LIZ);
        }
    }

    public LinkMicTaskCallback(C1283590jVV c1283590jVV) {
        super(c1283590jVV);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r8 = this;
            X.0pbH r1 = new X.0pbH
            r1.<init>(r9)
            com.squareup.wire.ProtoAdapter<X.0pbH> r0 = X.C1517810pbH.ADAPTER
            int r0 = r0.encodedSize(r1)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r1.encode(r0)
        L17:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La0
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L82
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L17
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L70
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L52
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L70
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L70
            r8.MoltenFfiNativeOnCompletionX3585148652501022803(r0, r5)     // Catch: java.lang.Throwable -> L70
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L51
            r8.LIZ()
        L51:
            return
        L52:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L70
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L70
            r1.append(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L70
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L70
            throw r2     // Catch: java.lang.Throwable -> L70
        L70:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L70
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L81
            r8.LIZ()
        L81:
            throw r3
        L82:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        La0:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicTaskCallback.LIZIZ(java.util.Map):void");
    }
}
