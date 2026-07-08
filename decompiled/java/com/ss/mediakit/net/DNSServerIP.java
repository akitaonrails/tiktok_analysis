package com.ss.mediakit.net;

import X.C0WZX;
import X.C1C7U;
import X.C2179971ATj;
import X.C2204961BRm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes21.dex */
public class DNSServerIP {
    public static volatile String mServerIP;
    public static volatile long mServerIPTime;

    public static String getDNSServerIP() {
        updateDNSServerIP();
        return mServerIP;
    }

    public static void updateDNSServerIP() {
        if (System.currentTimeMillis() - mServerIPTime < 300000) {
            return;
        }
        AVMDLThreadPool.addExecuteTask(new Runnable() { // from class: com.ss.mediakit.net.DNSServerIP.1
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("DNSServerIP@12ad.updateDNSServerIP$1");
                com_ss_mediakit_net_DNSServerIP$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("DNSServerIP@12ad.updateDNSServerIP$1");
            }

            public void com_ss_mediakit_net_DNSServerIP$1__run$___twin___() {
                try {
                    InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                    if (byName != null) {
                        DNSServerIP.mServerIP = C2204961BRm.d0(byName, new C0WZX("dzBzEhEpEcfZUV4gThuQKJLVr0WPWLNzKF4M89VhAA==", null));
                        DNSServerIP.mServerIPTime = System.currentTimeMillis();
                    }
                } catch (UnknownHostException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            public static void com_ss_mediakit_net_DNSServerIP$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_ss_mediakit_net_DNSServerIP$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }
}
