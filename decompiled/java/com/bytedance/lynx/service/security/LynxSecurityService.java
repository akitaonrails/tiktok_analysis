package com.bytedance.lynx.service.security;

import X.AbstractC816260W0i;
import X.C01GW;
import X.C0X84;
import X.C0X88;
import X.C0X89;
import X.C0X8A;
import X.C0X8B;
import X.C0X8C;
import X.C0X8D;
import X.C1898707c9;
import X.C2188811AlT;
import X.C452501pT;
import X.C843710X7x;
import X.EnumC843700X7w;
import X.InterfaceC1898907cB;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.service.security.ILynxSecurityService;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class LynxSecurityService extends AbstractC816260W0i implements ILynxSecurityService {
    public static final C0X8A Companion = new Object() { // from class: X.0X8A
    };
    public static final C01GW<LynxSecurityService> INSTANCE$delegate = C452501pT.LIZIZ(new C0X89());
    public final String TAG = "LynxSecurityService";
    public final C0X88<C0X8D, C0X84> delegateRegistry = new C0X88<>();

    private final native boolean nativeUpdateRsaPublicKeys(String str);

    private final native boolean nativeVerifySignBlock(byte[] bArr, ByteBuffer byteBuffer, long[] jArr, String[] strArr, int[] iArr);

    @Override // com.lynx.tasm.service.security.ILynxSecurityService, com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ Class getServiceClass() {
        return C0X8B.LIZ(this);
    }

    @Override // X.AbstractC816260W0i
    public boolean doInitialize() {
        try {
            C0X8C libraryLoader = LynxEnv.inst().getLibraryLoader();
            if (libraryLoader != null) {
                libraryLoader.loadLibrary("lynxsecurity");
                if (Unit.LIZ != null) {
                    return true;
                }
            }
            INVOKESTATIC_com_bytedance_lynx_service_security_LynxSecurityService_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lynxsecurity");
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String str = this.TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fail to load lynxsecurity.so, error message is: ");
            sbLIZ.append(e);
            LynxLog.e(str, C2188811AlT.LIZIZ(sbLIZ));
            return false;
        } catch (UnsatisfiedLinkError e2) {
            TryCatchGuardChecker.doCheck(e2);
            String str2 = this.TAG;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fail to load lynxsecurity.so, error message is: ");
            sbLIZ2.append(e2);
            LynxLog.e(str2, C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
    }

    public final String getTAG() {
        return this.TAG;
    }

    public static void INVOKESTATIC_com_bytedance_lynx_service_security_LynxSecurityService_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.07c9] */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.07c9] */
    private final C1898707c9 verifyPayloadInternal(ByteBuffer byteBuffer) {
        if (!ensureInitialized()) {
            final String str = "lynxsecurity.so load failed.";
            LynxLog.e(this.TAG, "lynxsecurity.so load failed.");
            final boolean z = false;
            final EnumC843700X7w enumC843700X7w = null;
            final long j = -1;
            final Object[] objArr = 0 == true ? 1 : 0;
            return new InterfaceC1898907cB(z, str, enumC843700X7w, j, objArr) { // from class: X.07c9
                public final boolean LIZ;
                public final String LIZIZ;
                public final EnumC843700X7w LIZJ;
                public final long LIZLLL;
                public final String LJ;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [int] */
                /* JADX WARN: Type inference failed for: r0v13 */
                /* JADX WARN: Type inference failed for: r0v14 */
                public final int hashCode() {
                    boolean z2 = this.LIZ;
                    ?? r0 = z2;
                    if (z2) {
                        r0 = 1;
                    }
                    int i = r0 * 31;
                    String str2 = this.LIZIZ;
                    int iHashCode = (i + (str2 == null ? 0 : str2.hashCode())) * 31;
                    EnumC843700X7w enumC843700X7w2 = this.LIZJ;
                    int iHashCode2 = (((iHashCode + (enumC843700X7w2 == null ? 0 : enumC843700X7w2.hashCode())) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
                    String str3 = this.LJ;
                    return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LynxSecurityPayloadVerificationEntity(verified=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", errorMsg=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", errorCode=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(", signId=");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(", extraConfig=");
                    sbLIZ.append(this.LJ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1898707c9)) {
                        return false;
                    }
                    C1898707c9 c1898707c9 = (C1898707c9) obj;
                    if (this.LIZ == c1898707c9.LIZ && Intrinsics.LJFF(this.LIZIZ, c1898707c9.LIZIZ) && this.LIZJ == c1898707c9.LIZJ && this.LIZLLL == c1898707c9.LIZLLL && Intrinsics.LJFF(this.LJ, c1898707c9.LJ)) {
                        return true;
                    }
                    return false;
                }

                {
                    this.LIZ = z;
                    this.LIZIZ = str;
                    this.LIZJ = enumC843700X7w;
                    this.LIZLLL = j;
                    this.LJ = objArr;
                }
            };
        }
        long[] jArr = {-1};
        int[] iArr = {0};
        String[] strArr = new String[2];
        final boolean zNativeVerifySignBlock = nativeVerifySignBlock(null, byteBuffer, jArr, strArr, iArr);
        final String str2 = strArr[1];
        C843710X7x c843710X7x = EnumC843700X7w.Companion;
        int i = iArr[0];
        c843710X7x.getClass();
        final EnumC843700X7w enumC843700X7wLIZ = C843710X7x.LIZ(i);
        final long j2 = jArr[0];
        final String str3 = strArr[0];
        return new InterfaceC1898907cB(zNativeVerifySignBlock, str2, enumC843700X7wLIZ, j2, str3) { // from class: X.07c9
            public final boolean LIZ;
            public final String LIZIZ;
            public final EnumC843700X7w LIZJ;
            public final long LIZLLL;
            public final String LJ;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v13 */
            /* JADX WARN: Type inference failed for: r0v14 */
            public final int hashCode() {
                boolean z2 = this.LIZ;
                ?? r0 = z2;
                if (z2) {
                    r0 = 1;
                }
                int i2 = r0 * 31;
                String str22 = this.LIZIZ;
                int iHashCode = (i2 + (str22 == null ? 0 : str22.hashCode())) * 31;
                EnumC843700X7w enumC843700X7w2 = this.LIZJ;
                int iHashCode2 = (((iHashCode + (enumC843700X7w2 == null ? 0 : enumC843700X7w2.hashCode())) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
                String str32 = this.LJ;
                return iHashCode2 + (str32 != null ? str32.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LynxSecurityPayloadVerificationEntity(verified=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", errorMsg=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", errorCode=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", signId=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", extraConfig=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1898707c9)) {
                    return false;
                }
                C1898707c9 c1898707c9 = (C1898707c9) obj;
                if (this.LIZ == c1898707c9.LIZ && Intrinsics.LJFF(this.LIZIZ, c1898707c9.LIZIZ) && this.LIZJ == c1898707c9.LIZJ && this.LIZLLL == c1898707c9.LIZLLL && Intrinsics.LJFF(this.LJ, c1898707c9.LJ)) {
                    return true;
                }
                return false;
            }

            {
                this.LIZ = zNativeVerifySignBlock;
                this.LIZIZ = str2;
                this.LIZJ = enumC843700X7wLIZ;
                this.LIZLLL = j2;
                this.LJ = str3;
            }
        };
    }

    @Override // com.lynx.tasm.service.IServiceProvider
    public void onInitialize(Context context) {
        initialize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSecurityDelegate(C0X84 c0x84) {
        boolean z;
        C0X88<C0X8D, C0X84> c0x88 = this.delegateRegistry;
        synchronized (c0x88.LIZ) {
            try {
                if (c0x88.LIZIZ != null) {
                    z = false;
                } else {
                    c0x88.LIZIZ = c0x84;
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!z) {
            LynxLog.e(this.TAG, "SecurityDelegate can not be override.");
        }
    }

    public final void updateRSAPublicKeys(String str) {
        if (!ensureInitialized()) {
            LynxLog.e("LynxSecurityService", "lynxsecurity.so load failed.");
        } else {
            nativeUpdateRsaPublicKeys(str);
        }
    }

    public final void setSecurityDelegateForTarget(C0X8D c0x8d, C0X84 c0x84) {
        boolean z;
        C0X88<C0X8D, C0X84> c0x88 = this.delegateRegistry;
        synchronized (c0x88.LIZ) {
            try {
                if (c0x88.LIZJ.containsKey(c0x8d)) {
                    z = false;
                } else {
                    c0x88.LIZJ.put(c0x8d, c0x84);
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!z) {
            LynxLog.e(this.TAG, "SecurityDelegate for target can not be override.");
        }
    }

    public final InterfaceC1898907cB verifyPayload(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int i = 0;
        ByteBuffer[] byteBufferArr = {byteBuffer, byteBuffer2};
        int i2 = 0;
        int iRemaining = 0;
        do {
            iRemaining += byteBufferArr[i2].remaining();
            i2++;
        } while (i2 < 2);
        int i3 = iRemaining + 4;
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
        byteBufferOrder.putInt(i3);
        do {
            byteBufferOrder.put(byteBufferArr[i].duplicate().slice());
            i++;
        } while (i < 2);
        byteBufferOrder.flip();
        return verifyPayloadInternal(byteBufferOrder);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #0 {all -> 0x0098, blocks: (B:14:0x0036, B:16:0x003e), top: B:33:0x0036 }] */
    @Override // com.lynx.tasm.service.security.ILynxSecurityService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C0X80 verifyTASM(X.C0X8D r20, byte[] r21, java.nio.ByteBuffer r22, java.lang.String r23, X.C0X87 r24) {
        /*
            r19 = this;
            r3 = r20
            r9 = r19
            boolean r0 = r9.ensureInitialized()
            r7 = 1
            if (r0 != 0) goto L1a
            java.lang.String r1 = r9.TAG
            java.lang.String r0 = "lynxsecurity.so load failed"
            com.lynx.base.log.LynxLog.e(r1, r0)
            X.0X80 r0 = new X.0X80
            r0.<init>()
            r0.LIZ = r7
            return r0
        L1a:
            r6 = 0
            r11 = r22
            r10 = r21
            if (r10 != 0) goto L2f
            if (r11 != 0) goto L2f
            java.lang.String r1 = "empty tasm file."
            X.0X80 r0 = new X.0X80
            r0.<init>()
            r0.LIZ = r6
            r0.LIZIZ = r1
            return r0
        L2f:
            X.0X88<X.0X8D, X.0X84> r4 = r9.delegateRegistry
            java.lang.Object r1 = r4.LIZ
            monitor-enter(r1)
            if (r3 == 0) goto L3e
            java.util.WeakHashMap<K, V> r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L98
            java.lang.Object r2 = r0.get(r3)     // Catch: java.lang.Throwable -> L98
            if (r2 != 0) goto L40
        L3e:
            V r2 = r4.LIZIZ     // Catch: java.lang.Throwable -> L98
        L40:
            monitor-exit(r1)
            X.0X84 r2 = (X.C0X84) r2
            if (r2 == 0) goto L90
            boolean r0 = r2.LIZIZ()
            if (r0 == 0) goto L90
            long[] r8 = new long[r7]
            r0 = -1
            r8[r6] = r0
            int[] r5 = new int[r7]
            r5[r6] = r6
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]
            r10 = r10
            r11 = r11
            r12 = r8
            r13 = r4
            r14 = r5
            r9 = r9
            boolean r12 = r9.nativeVerifySignBlock(r10, r11, r12, r13, r14)
            r15 = r8[r6]
            X.0X7x r1 = X.EnumC843700X7w.Companion
            r0 = r5[r6]
            r1.getClass()
            X.0X7w r14 = X.C843710X7x.LIZ(r0)
            r17 = r4[r6]
            r13 = r4[r7]
            X.0X82 r6 = new X.0X82
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r3)
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            boolean r0 = r3 instanceof com.lynx.tasm.LynxView
            if (r0 != 0) goto L81
            r3 = 0
        L81:
            r8.<init>(r3)
            r18 = r24
            r9 = r23
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18)
            X.0X80 r0 = r2.LIZ(r6)
            return r0
        L90:
            X.0X80 r0 = new X.0X80
            r0.<init>()
            r0.LIZ = r7
            return r0
        L98:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.service.security.LynxSecurityService.verifyTASM(X.0X8D, byte[], java.nio.ByteBuffer, java.lang.String, X.0X87):X.0X80");
    }
}
