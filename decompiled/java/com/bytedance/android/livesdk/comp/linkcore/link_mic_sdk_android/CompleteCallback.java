package com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android;

import X.AbstractC1283560jVS;
import X.AbstractC1283580jVU;
import X.C1283590jVV;

/* JADX INFO: loaded from: classes21.dex */
public class CompleteCallback extends AbstractC1283560jVS {
    private final native void MoltenFfiNativeOnCompleteX7184785407694354040(long j);

    public static final native void molten_ffi_link_mic_sdk_CompleteCallback_free(long j);

    @Override // X.AbstractC1283560jVS
    public final void LIZ() {
        AbstractC1283580jVU abstractC1283580jVU = this.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            molten_ffi_link_mic_sdk_CompleteCallback_free(((C1283590jVV) abstractC1283580jVU).LIZ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r3 = r0.get()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L89
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6b
            java.util.concurrent.atomic.AtomicLong r2 = r7.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L0
            X.0jVU r1 = r7.LL     // Catch: java.lang.Throwable -> L59
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L3b
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L59
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L59
            r7.MoltenFfiNativeOnCompleteX7184785407694354040(r0)     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L3a
            r7.LIZ()
        L3a:
            return
        L3b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L59
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L59
            r1.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L59
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L59
            throw r2     // Catch: java.lang.Throwable -> L59
        L59:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicLong r0 = r7.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L6a
            r7.LIZ()
        L6a:
            throw r3
        L6b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " call counter would overflow"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L89:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " object has already been destroyed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.CompleteCallback.LIZIZ():void");
    }

    public CompleteCallback(C1283590jVV c1283590jVV) {
        super(c1283590jVV);
    }
}
