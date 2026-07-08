package com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android;

import X.AbstractC1283560jVS;
import X.AbstractC1283580jVU;
import X.C1283590jVV;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public class LinkMicLayoutLayer extends AbstractC1283560jVS {
    private final native void MoltenFfiNativeEndLayoutX6516107003968922462(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeGetCurrentArchTypeX7310431901935730676(long j);

    private final native ByteBuffer MoltenFfiNativeGetMediaConfigX6114369107161072273(long j, ByteBuffer byteBuffer);

    private final native ByteBuffer MoltenFfiNativeHasRtcViewX8400931359110438457(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeOnRtcUserLeaveX4631666032989421214(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeOnRtcViewX9071909933073907362(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeOnSeiX1330403312633522668(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeRemoveLayoutByArchTypeX1923469446531189782(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeRequestLayoutX2580771762524884777(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeUpdateCanvasX3900579037110229775(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeUpdateLayoutDataX7825962617821379415(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeUpdateLayoutInfoWithLayoutDataX868302170880820103(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeUpdateLayoutInfoX3808508555280543003(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeUpdateParentContainerX86597388829355010(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeUpdatePlayerX6579621676576551629(long j, ByteBuffer byteBuffer);

    public static final native void molten_ffi_link_mic_sdk_LinkMicLayoutLayer_free(long j);

    @Override // X.AbstractC1283560jVS
    public final void LIZ() {
        AbstractC1283580jVU abstractC1283580jVU = this.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            molten_ffi_link_mic_sdk_LinkMicLayoutLayer_free(((C1283590jVV) abstractC1283580jVU).LIZ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        if (r7.LLILLL.decrementAndGet() == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1AZU LIZLLL() {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer.LIZLLL():X.1AZU");
    }

    public LinkMicLayoutLayer(C1283590jVV c1283590jVV) {
        super(c1283590jVV);
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
    public final void LJIILLIIL(X.C2181931AaN r9) {
        /*
            r8 = this;
            X.1Cc4 r1 = new X.1Cc4
            X.1CbX r0 = r9.LIZ()
            r1.<init>(r0)
            com.squareup.wire.ProtoAdapter<X.1Cc4> r0 = X.C2233941Cc4.ADAPTER
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
            r8.MoltenFfiNativeRequestLayoutX2580771762524884777(r0, r5)     // Catch: java.lang.Throwable -> L74
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer.LJIILLIIL(X.1AaN):void");
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
    public final void LJIIZILJ(X.C2181391AYv r9) {
        /*
            r8 = this;
            X.1CIP r1 = new X.1CIP
            X.1CIG r0 = X.C2231651CWd.LJIIJ(r9)
            r1.<init>(r0)
            com.squareup.wire.ProtoAdapter<X.1CIP> r0 = X.C1CIP.ADAPTER
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
            r8.MoltenFfiNativeUpdateCanvasX3900579037110229775(r0, r5)     // Catch: java.lang.Throwable -> L74
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer.LJIIZILJ(X.1AYv):void");
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
    public final void LJJIZ(X.C2181561AZm r9) {
        /*
            r8 = this;
            X.1CIM r1 = new X.1CIM
            X.1CIG r0 = X.C2231651CWd.LJI(r9)
            r1.<init>(r0)
            com.squareup.wire.ProtoAdapter<X.1CIM> r0 = X.C1CIM.ADAPTER
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
            r8.MoltenFfiNativeUpdatePlayerX6579621676576551629(r0, r5)     // Catch: java.lang.Throwable -> L74
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer.LJJIZ(X.1AZm):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.EnumC2181681AZy r9, X.C2181931AaN r10) {
        /*
            r8 = this;
            X.1Cc1 r2 = new X.1Cc1
            X.1Ab0 r1 = r9.into()
            X.1CbX r0 = r10.LIZ()
            r2.<init>(r1, r0)
            com.squareup.wire.ProtoAdapter<X.1Cc1> r0 = X.C2233911Cc1.ADAPTER
            int r0 = r0.encodedSize(r2)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)
            X.0jVP r0 = new X.0jVP
            r0.<init>(r5)
            r2.encode(r0)
        L1f:
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r3 = r0.get()
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto La8
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L8a
            java.util.concurrent.atomic.AtomicLong r2 = r8.LLILLL
            r0 = 1
            long r0 = r0 + r3
            boolean r0 = r2.compareAndSet(r3, r0)
            if (r0 == 0) goto L1f
            X.0jVU r1 = r8.LL     // Catch: java.lang.Throwable -> L78
            boolean r0 = r1 instanceof X.C1283590jVV     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L5a
            X.0jVV r1 = (X.C1283590jVV) r1     // Catch: java.lang.Throwable -> L78
            long r0 = r1.LIZ     // Catch: java.lang.Throwable -> L78
            r8.MoltenFfiNativeEndLayoutX6516107003968922462(r0, r5)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L59
            r8.LIZ()
        L59:
            return
        L5a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L78
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L78
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = " pointer type mismatch(long expected)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L78
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r2     // Catch: java.lang.Throwable -> L78
        L78:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicLong r0 = r8.LLILLL
            long r1 = r0.decrementAndGet()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L89
            r8.LIZ()
        L89:
            throw r3
        L8a:
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
        La8:
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer.LIZIZ(X.1AZy, X.1AaN):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c1, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(long r9, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer.LJFF(long, java.lang.String):boolean");
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
    public final void LJI(long r9, java.lang.String r11) {
        /*
            r8 = this;
            X.1CBI r1 = new X.1CBI
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r1.<init>(r11, r0)
            com.squareup.wire.ProtoAdapter<X.1CBI> r0 = X.C1CBI.ADAPTER
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
            r8.MoltenFfiNativeOnRtcViewX9071909933073907362(r0, r5)     // Catch: java.lang.Throwable -> L74
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer.LJI(long, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x014f, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0150, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x015b, code lost:
    
        if (r26.LLILLL.decrementAndGet() == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x015d, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0160, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C2181861AaG r27, long r28) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer.LJII(X.1AaG, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ec, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ed, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f8, code lost:
    
        if (r20.LLILLL.decrementAndGet() == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fa, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fd, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(X.C1AZU r21, X.C2182311Aaz r22) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer.LJIJJLI(X.1AZU, X.1Aaz):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f7, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f8, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0103, code lost:
    
        if (r21.LLILLL.decrementAndGet() == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0105, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0108, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(X.C1AZU r22, X.C2182411Ab9 r23) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer.LJJ(X.1AZU, X.1Ab9):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(X.C1AZU r9, X.EnumC2181681AZy r10, X.C2181931AaN r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer.LJIILL(X.1AZU, X.1AZy, X.1AaN):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(X.C1AZU r9, byte[] r10, java.util.List<java.lang.Long> r11, X.C2181931AaN r12) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer.LJIJJ(X.1AZU, byte[], java.util.List, X.1AaN):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0097, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0098, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
    
        if (r10.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(X.C2182431AbB r11, X.C2182441AbC r12, X.EnumC2181801AaA r13, boolean r14, X.C2181931AaN r15) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer.LJJIL(X.1AbB, X.1AbC, X.1AaA, boolean, X.1AaN):void");
    }
}
