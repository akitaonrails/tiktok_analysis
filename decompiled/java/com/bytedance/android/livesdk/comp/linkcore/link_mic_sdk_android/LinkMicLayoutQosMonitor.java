package com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android;

import X.AbstractC1283560jVS;
import X.AbstractC1283580jVU;
import X.C1283590jVV;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public class LinkMicLayoutQosMonitor extends AbstractC1283560jVS {
    private final native void MoltenFfiNativeAddContextParamsX2950783403945065454(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeMarkStepCostX8388664509655258260(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeMarkStepEndX2977951924956496236(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeMarkStepStartX8217786914274471571(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeReportLayoutExtraErrorX7199411727995858556(long j, ByteBuffer byteBuffer);

    public static final native void molten_ffi_link_mic_sdk_LinkMicLayoutQosMonitor_free(long j);

    @Override // X.AbstractC1283560jVS
    public final void LIZ() {
        AbstractC1283580jVU abstractC1283580jVU = this.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            molten_ffi_link_mic_sdk_LinkMicLayoutQosMonitor_free(((C1283590jVV) abstractC1283580jVU).LIZ);
        }
    }

    public LinkMicLayoutQosMonitor(C1283590jVV c1283590jVV) {
        super(c1283590jVV);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.EnumC2182511AbJ r9, java.lang.String r10) {
        /*
            r8 = this;
            X.1CPJ r2 = new X.1CPJ
            X.1Acn r1 = r9.into()
            java.lang.String r0 = ""
            r2.<init>(r0, r1, r10)
            com.squareup.wire.ProtoAdapter<X.1CPJ> r0 = X.C1CPJ.ADAPTER
            int r0 = r0.encodedSize(r2)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r2.encode(r0)
        L1d:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La6
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L88
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1d
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L76
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L58
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L76
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L76
            r8.MoltenFfiNativeAddContextParamsX2950783403945065454(r0, r5)     // Catch: java.lang.Throwable -> L76
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L57
            r8.LIZ()
        L57:
            return
        L58:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L76
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L76
            r1.append(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L76
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L76
            throw r2     // Catch: java.lang.Throwable -> L76
        L76:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L76
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L87
            r8.LIZ()
        L87:
            throw r3
        L88:
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
        La6:
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutQosMonitor.LIZIZ(X.1AbJ, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.EnumC2189021Alo r9, long r10) {
        /*
            r8 = this;
            X.1CPH r3 = new X.1CPH
            X.1Alq r2 = r9.into()
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            java.lang.String r0 = ""
            r3.<init>(r0, r2, r1)
            com.squareup.wire.ProtoAdapter<X.1CPH> r0 = X.C1CPH.ADAPTER
            int r0 = r0.encodedSize(r3)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r3.encode(r0)
        L21:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto Laa
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L8c
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L21
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L7a
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L5c
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L7a
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L7a
            r8.MoltenFfiNativeMarkStepCostX8388664509655258260(r0, r5)     // Catch: java.lang.Throwable -> L7a
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L5b
            r8.LIZ()
        L5b:
            return
        L5c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L7a
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L7a
            r1.append(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L7a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L7a
            throw r2     // Catch: java.lang.Throwable -> L7a
        L7a:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L7a
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L8b
            r8.LIZ()
        L8b:
            throw r3
        L8c:
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
        Laa:
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutQosMonitor.LIZLLL(X.1Alo, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.EnumC2231791CWr r9, java.lang.String r10) {
        /*
            r8 = this;
            X.1CRm r2 = new X.1CRm
            X.1CWt r1 = r9.into()
            java.lang.String r0 = ""
            r2.<init>(r0, r1, r10)
            com.squareup.wire.ProtoAdapter<X.1CRm> r0 = X.C2230441CRm.ADAPTER
            int r0 = r0.encodedSize(r2)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r2.encode(r0)
        L1d:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La6
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L88
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1d
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L76
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L58
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L76
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L76
            r8.MoltenFfiNativeReportLayoutExtraErrorX7199411727995858556(r0, r5)     // Catch: java.lang.Throwable -> L76
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L57
            r8.LIZ()
        L57:
            return
        L58:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L76
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L76
            r1.append(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L76
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L76
            throw r2     // Catch: java.lang.Throwable -> L76
        L76:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L76
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L87
            r8.LIZ()
        L87:
            throw r3
        L88:
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
        La6:
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutQosMonitor.LJFF(X.1CWr, java.lang.String):void");
    }
}
