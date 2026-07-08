package com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android;

import X.AbstractC1283560jVS;
import X.AbstractC1283580jVU;
import X.C1283590jVV;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes35.dex */
public class SymphonyEngine extends AbstractC1283560jVS {
    private final native ByteBuffer MoltenFfiNativeAppendBranchX4941476605697780557(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeAppendSingleStateBranchX166866358006764855(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeAppendStateX4090803456723159445(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeEndEditX4019129450818108576(long j);

    private final native ByteBuffer MoltenFfiNativeExportFlowX1570301063474338750(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeGetVersionCodeX5862645410613899777(long j);

    private final native ByteBuffer MoltenFfiNativeInsertStateX6704981231815645905(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeModifyStateX682964991707918052(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeMoveBranchX765766295973923138(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeMoveStateX9182985891578573530(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeNewParallelStateX4535295274002239087(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeNewRootFlowX3023001150388718910(long j);

    private final native ByteBuffer MoltenFfiNativeNewTaskStateX540206945788198462(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeRecoverFlowX6699715905787093908(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeRemoveBranchX3242236641038536252(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeRemoveStateX327716944677883707(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeStartEditX2994507599830333892(long j, ByteBuffer byteBuffer);

    public static final native void molten_ffi_link_mic_sdk_SymphonyEngine_free(long j);

    @Override // X.AbstractC1283560jVS
    public final void LIZ() {
        AbstractC1283580jVU abstractC1283580jVU = this.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            molten_ffi_link_mic_sdk_SymphonyEngine_free(((C1283590jVV) abstractC1283580jVU).LIZ);
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
    public final void LJFF() {
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
            r7.MoltenFfiNativeEndEditX4019129450818108576(r0)     // Catch: java.lang.Throwable -> L59
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine.LJFF():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJII() {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine.LJII():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20426214wG LJIJJLI() {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine.LJIJJLI():X.14wG");
    }

    public SymphonyEngine(C1283590jVV c1283590jVV) {
        super(c1283590jVV);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJI(X.C20426214wG r9) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine.LJI(X.14wG):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20426914wN LJIILLIIL(X.C20425214w6 r9) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine.LJIILLIIL(X.14w6):X.14wN");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20426214wG LJJIL(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine.LJJIL(java.lang.String):X.14wG");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20426914wN LJJJ(long r9) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine.LJJJ(long):X.14wN");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJ(X.C20426214wG r9) {
        /*
            r8 = this;
            X.1CQ9 r1 = new X.1CQ9
            X.1CQI r0 = r9.LIZ()
            r1.<init>(r0)
            com.squareup.wire.ProtoAdapter<X.1CQ9> r0 = X.C1CQ9.ADAPTER
            int r0 = r0.encodedSize(r1)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r1.encode(r0)
        L1b:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La4
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L86
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1b
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L74
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L56
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L74
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L74
            r8.MoltenFfiNativeStartEditX2994507599830333892(r0, r5)     // Catch: java.lang.Throwable -> L74
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L55
            r8.LIZ()
        L55:
            return
        L56:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L74
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L74
            r1.append(r0)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L74
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L74
            throw r2     // Catch: java.lang.Throwable -> L74
        L74:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L74
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L85
            r8.LIZ()
        L85:
            throw r3
        L86:
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
        La4:
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine.LJJJJ(X.14wG):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c0, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20426814wM LIZIZ(long r9, X.C20425214w6 r11) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine.LIZIZ(long, X.14w6):X.14wM");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c0, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20426914wN LIZLLL(long r9, X.C20425214w6 r11) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine.LIZLLL(long, X.14w6):X.14wN");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20426914wN LJIIZILJ(long r9, java.util.List<java.lang.Long> r11) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine.LJIIZILJ(long, java.util.List):X.14wN");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c0, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20426814wM LJJIZ(long r9, long r11) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine.LJJIZ(long, long):X.14wM");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c0, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20426914wN LJIILL(java.util.List<java.lang.Long> r9, long r10, X.C20425214w6 r12) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine.LJIILL(java.util.List, long, X.14w6):X.14wN");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20425214w6 LJIJJ(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine.LJIJJ(java.lang.String, java.lang.String, java.lang.String, java.lang.String):X.14w6");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c3, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20425214w6 LJJ(long r9, long r11, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine.LJJ(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):X.14w6");
    }
}
