package com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android;

import X.AbstractC1283560jVS;
import X.AbstractC1283580jVU;
import X.C1283590jVV;
import X.C1954807lC;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class LinkMicRtcDispatcher extends AbstractC1283560jVS {
    private final native void MoltenFfiNativeOnAuxStreamPublishedX8870708992374459(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeOnAuxStreamStopX7066340598659121003(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeOnAuxStreamUnpublishedX1978423818646187248(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeOnFirstRemoteAuxStreamVideoRenderedX3010870822214328041(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeOnReceivedNetworkQualitiesX468164555302958756(long j, ByteBuffer byteBuffer);

    private final native boolean MoltenFfiNativeOnReceivedRoomMessageX7055057656843936269(long j, String str, String str2);

    private final native boolean MoltenFfiNativeOnReceivedUserMessageX7136847845871743621(long j, String str, String str2);

    private final native void MoltenFfiNativeRtcAudioVolumeDidUpdatedX2117249618161500926(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeRtcConnectionDidLostX1795377086280754041(long j);

    private final native void MoltenFfiNativeRtcDidJoinChannelX5921857934874732072(long j, String str, String str2);

    private final native void MoltenFfiNativeRtcDidLeaveChannelX1551330061285761532(long j);

    private final native void MoltenFfiNativeRtcDidOccurErrorX3357975771013622212(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeRtcDidOfflineOfLinkMicIdX5663884035624260723(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeRtcFirstFrameRenderCallbackX8402431415298329934(long j, String str);

    private final native void MoltenFfiNativeRtcFirstRemoteAudioFrameOfLinkMicIdX1691143620661232168(long j, String str);

    private final native void MoltenFfiNativeRtcFirstRemoteVideoDecodedOfLinkMicIdX2702023740182066187(long j, String str);

    private final native void MoltenFfiNativeRtcNewSessionCreatedX6876186488788194109(long j, String str);

    private final native void MoltenFfiNativeRtcOnForwardStreamStateChangedX6142692219188005874(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeRtcOnRemoteVideoStatsX8843589104213690957(long j, ByteBuffer byteBuffer);

    private final native void MoltenFfiNativeRtcWillLeaveChannelX1538526894297845272(long j);

    public static final native void molten_ffi_link_mic_sdk_LinkMicRTCDispatcher_free(long j);

    @Override // X.AbstractC1283560jVS
    public final void LIZ() {
        AbstractC1283580jVU abstractC1283580jVU = this.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            molten_ffi_link_mic_sdk_LinkMicRTCDispatcher_free(((C1283590jVV) abstractC1283580jVU).LIZ);
        }
    }

    public final long LIZIZ() {
        AbstractC1283580jVU abstractC1283580jVU = this.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            return ((C1283590jVV) abstractC1283580jVU).LIZ;
        }
        throw new C1954807lC();
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
    public final void LJIJJ() {
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
            r7.MoltenFfiNativeRtcDidLeaveChannelX1551330061285761532(r0)     // Catch: java.lang.Throwable -> L59
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher.LJIJJ():void");
    }

    public LinkMicRtcDispatcher(C1283590jVV c1283590jVV) {
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
    public final void LIZLLL(java.lang.String r9) {
        /*
            r8 = this;
            X.1CLb r1 = new X.1CLb
            r1.<init>(r9)
            com.squareup.wire.ProtoAdapter<X.1CLb> r0 = X.C2228771CLb.ADAPTER
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
            r8.MoltenFfiNativeOnAuxStreamPublishedX8870708992374459(r0, r5)     // Catch: java.lang.Throwable -> L70
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher.LIZLLL(java.lang.String):void");
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
    public final void LJFF(java.lang.String r9) {
        /*
            r8 = this;
            X.1CLb r1 = new X.1CLb
            r1.<init>(r9)
            com.squareup.wire.ProtoAdapter<X.1CLb> r0 = X.C2228771CLb.ADAPTER
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
            r8.MoltenFfiNativeOnAuxStreamStopX7066340598659121003(r0, r5)     // Catch: java.lang.Throwable -> L70
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher.LJFF(java.lang.String):void");
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
    public final void LJI(java.lang.String r9) {
        /*
            r8 = this;
            X.1CLb r1 = new X.1CLb
            r1.<init>(r9)
            com.squareup.wire.ProtoAdapter<X.1CLb> r0 = X.C2228771CLb.ADAPTER
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
            r8.MoltenFfiNativeOnAuxStreamUnpublishedX1978423818646187248(r0, r5)     // Catch: java.lang.Throwable -> L70
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher.LJI(java.lang.String):void");
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
    public final void LJII(java.lang.String r9) {
        /*
            r8 = this;
            X.1CLb r1 = new X.1CLb
            r1.<init>(r9)
            com.squareup.wire.ProtoAdapter<X.1CLb> r0 = X.C2228771CLb.ADAPTER
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
            r8.MoltenFfiNativeOnFirstRemoteAuxStreamVideoRenderedX3010870822214328041(r0, r5)     // Catch: java.lang.Throwable -> L70
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher.LJII(java.lang.String):void");
    }

    public final void LJIIZILJ(String str) {
        MoltenFfiNativeRtcDidJoinChannelX5921857934874732072(LIZIZ(), "rust", str);
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
    public final void LJIJJLI(X.C966980bGq r9) {
        /*
            r8 = this;
            X.1CLt r1 = new X.1CLt
            X.1CMV r0 = r9.LIZ()
            r1.<init>(r0)
            com.squareup.wire.ProtoAdapter<X.1CLt> r0 = X.C2228951CLt.ADAPTER
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
            r8.MoltenFfiNativeRtcDidOccurErrorX3357975771013622212(r0, r5)     // Catch: java.lang.Throwable -> L74
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher.LJIJJLI(X.0bGq):void");
    }

    public final void LJJIL(String str) {
        MoltenFfiNativeRtcFirstFrameRenderCallbackX8402431415298329934(LIZIZ(), str);
    }

    public final void LJJIZ(String str) {
        MoltenFfiNativeRtcFirstRemoteAudioFrameOfLinkMicIdX1691143620661232168(LIZIZ(), str);
    }

    public final void LJJJ(String str) {
        MoltenFfiNativeRtcFirstRemoteVideoDecodedOfLinkMicIdX2702023740182066187(LIZIZ(), str);
    }

    public final void LJJJJ(String str) {
        MoltenFfiNativeRtcNewSessionCreatedX6876186488788194109(LIZIZ(), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b1, code lost:
    
        if (r8.LLILLL.decrementAndGet() == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJ(java.util.List<X.C1280010jPj> r9) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher.LJJJJJ(java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00de, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00df, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ea, code lost:
    
        if (r22.LLILLL.decrementAndGet() == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ec, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ef, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJL(X.C1283480jVK r23) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher.LJJJJJL(X.0jVK):void");
    }

    public final void LJIILL(String str, String str2) {
        MoltenFfiNativeOnReceivedRoomMessageX7055057656843936269(LIZIZ(), str, str2);
    }

    public final void LJIILLIIL(String str, String str2) {
        MoltenFfiNativeOnReceivedUserMessageX7136847845871743621(LIZIZ(), str, str2);
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
    public final void LJJ(java.lang.String r9, X.EnumC1280040jPm r10) {
        /*
            r8 = this;
            X.1CFG r1 = new X.1CFG
            X.0jTH r0 = r10.into()
            r1.<init>(r9, r0)
            com.squareup.wire.ProtoAdapter<X.1CFG> r0 = X.C1CFG.ADAPTER
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
            r8.MoltenFfiNativeRtcDidOfflineOfLinkMicIdX5663884035624260723(r0, r5)     // Catch: java.lang.Throwable -> L74
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher.LJJ(java.lang.String, X.0jPm):void");
    }
}
