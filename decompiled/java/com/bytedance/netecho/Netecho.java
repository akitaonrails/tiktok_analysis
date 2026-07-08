package com.bytedance.netecho;

import X.C0WZX;
import X.C1C7U;
import X.C2179971ATj;
import X.C2204961BRm;
import X.C259800zU;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.netecho.result.DnsResolveResult;
import com.bytedance.netecho.result.IcmpDetectResult;
import com.bytedance.netecho.result.IcmpPacketResult;
import com.bytedance.netecho.result.TcpDetectResult;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.InetAddress;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes24.dex */
public final class Netecho {
    public static final Netecho INSTANCE = new Netecho();
    public static final String TAG = "Netecho";
    public static final String LIB_NAME = "netecho";
    public static final int STAGE_ATON = 1;
    public static final int STAGE_SOCKET = 2;
    public static final int STAGE_SET_OPT = 3;
    public static final int STAGE_SEND = 4;
    public static final int STAGE_RECV = 5;
    public static final int STAGE_FINISH = 6;

    public static final native IcmpDetectResult nativeDetectIcmp(String str, long j, int i);

    public static final native IcmpDetectResult nativeDetectIcmpV6(String str, int i, long j, int i2);

    public static final native TcpDetectResult nativeDetectTcp(String str, int i, long j);

    public static final native TcpDetectResult nativeDetectTcpV6(String str, int i, long j);

    static {
        NetechoConfig.INSTANCE.getLoadLibrary().invoke("netecho");
    }

    public static final IcmpPacketResult[] createIcmpPacketResultsArray(int i) {
        IcmpPacketResult[] icmpPacketResultArr = new IcmpPacketResult[i];
        for (int i2 = 0; i2 < i; i2++) {
            icmpPacketResultArr[i2] = null;
        }
        return icmpPacketResultArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.concurrent.CountDownLatch] */
    public final DnsResolveResult resolveDns(final String str, long j) throws InterruptedException {
        final C259800zU c259800zU = new C259800zU();
        boolean z = true;
        c259800zU.element = new CountDownLatch(1);
        final C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = null;
        final C259800zU c259800zU3 = new C259800zU();
        c259800zU3.element = null;
        new BPEAThread(new Runnable() { // from class: com.bytedance.netecho.Netecho.resolveDns.1
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("Netecho@f39c.resolveDns$1");
                com_bytedance_netecho_Netecho$resolveDns$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("Netecho@f39c.resolveDns$1");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
            public final void com_bytedance_netecho_Netecho$resolveDns$1__run$___twin___() {
                try {
                    c259800zU2.element = C2204961BRm.d0(InetAddress.getByName(str), new C0WZX("dzBzEgAjS8/YVFkiQFyKY8zdaCQ3XrG6I+dBzZo=", null));
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    do {
                        c259800zU3.element = th.getClass().getSimpleName() + ":" + th.getMessage();
                        th = th.getCause();
                    } while (th != null);
                }
                ((CountDownLatch) c259800zU.element).countDown();
            }

            public static void com_bytedance_netecho_Netecho$resolveDns$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_bytedance_netecho_Netecho$resolveDns$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        }).start();
        ((CountDownLatch) c259800zU.element).await(j, TimeUnit.MILLISECONDS);
        T t = c259800zU2.element;
        if (t == 0) {
            z = false;
        }
        return new DnsResolveResult(z, (String) t, (String) c259800zU3.element);
    }

    public static final TcpDetectResult createTcpDetectResult(boolean z, int i, int i2) {
        return new TcpDetectResult(z, i, i2);
    }

    public final IcmpDetectResult detectIcmp(String str, long j, int i) {
        return nativeDetectIcmp(str, j, i);
    }

    public final TcpDetectResult detectTcp(String str, int i, long j) {
        return nativeDetectTcp(str, i, j);
    }

    public final TcpDetectResult detectTcpV6(String str, int i, long j) {
        return nativeDetectTcpV6(str, i, j);
    }

    public static final IcmpDetectResult createIcmpDetectResult(boolean z, IcmpPacketResult[] icmpPacketResultArr, int i, int i2) {
        return new IcmpDetectResult(z, icmpPacketResultArr, i, i2);
    }

    public final IcmpDetectResult detectIcmpV6(String str, int i, long j, int i2) {
        return nativeDetectIcmpV6(str, i, j, i2);
    }

    public static final void addIcmpPacketResultToArray(IcmpPacketResult[] icmpPacketResultArr, int i, boolean z, int i2, float f, int i3) {
        icmpPacketResultArr[i] = new IcmpPacketResult(z, i2, f, i3);
    }
}
