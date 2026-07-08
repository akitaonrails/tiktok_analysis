package com.ss.mediakit.net;

import X.C0WZX;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.Locale;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes24.dex */
public class LocalDNSHosts {
    public InetAddress[] mAddress;
    public boolean mCancelled;
    public Future mFuture;
    public Handler mHandler;
    public String[] mHosts;
    public String mId;
    public AVMDLNetClient mNetClient;
    public boolean mRet;

    public static class MyRunnable implements Runnable {
        public final WeakReference<LocalDNSHosts> mLocalDNSRef;

        @Override // java.lang.Runnable
        public void run() {
            C1C7U.LIZ("LocalDNSHosts$MyRunnable@d7fb.run");
            com_ss_mediakit_net_LocalDNSHosts$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("LocalDNSHosts$MyRunnable@d7fb.run");
        }

        public void com_ss_mediakit_net_LocalDNSHosts$MyRunnable__run$___twin___() {
            Locale locale = Locale.US;
            AVMDLLog.d("BatchParseLocalDNSHosts", C786410Ut5.k4(locale, "----implement delayed check for local dns", new Object[0]));
            LocalDNSHosts localDNSHosts = this.mLocalDNSRef.get();
            if (localDNSHosts == null) {
                AVMDLLog.d("BatchParseLocalDNSHosts", C786410Ut5.k4(locale, "****end implement delayed check for local dns, dns object null", new Object[0]));
            } else {
                if (localDNSHosts.mRet) {
                    return;
                }
                localDNSHosts.cancel();
                AVMDLLog.d("BatchParseLocalDNSHosts", C786410Ut5.k4(locale, "****end implement delayed check cancel local dns,", new Object[0]));
            }
        }

        public MyRunnable(LocalDNSHosts localDNSHosts) {
            this.mLocalDNSRef = new WeakReference<>(localDNSHosts);
        }

        public static void com_ss_mediakit_net_LocalDNSHosts$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(MyRunnable myRunnable) {
            try {
                myRunnable.com_ss_mediakit_net_LocalDNSHosts$MyRunnable__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    }

    public void cancel() {
        if (this.mCancelled) {
            return;
        }
        this.mCancelled = true;
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

    public void close() {
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

    public void start() {
        try {
            this.mFuture = AVMDLThreadPool.addExecuteTask(new Runnable() { // from class: com.ss.mediakit.net.LocalDNSHosts.1
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("LocalDNSHosts@8f19.start$1");
                    com_ss_mediakit_net_LocalDNSHosts$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("LocalDNSHosts@8f19.start$1");
                }

                public void com_ss_mediakit_net_LocalDNSHosts$1__run$___twin___() throws Throwable {
                    LocalDNSHosts localDNSHosts;
                    AVMDLLog.d("BatchParseLocalDNSHosts", "----call local dns batch parse");
                    int i = 0;
                    while (true) {
                        LocalDNSHosts localDNSHosts2 = LocalDNSHosts.this;
                        String[] strArr = localDNSHosts2.mHosts;
                        if (i >= strArr.length) {
                            localDNSHosts2.mRet = true;
                            AVMDLLog.d("BatchParseLocalDNSHosts", "****end call local dns batch parse");
                            return;
                        }
                        if (!TextUtils.isEmpty(strArr[i])) {
                            try {
                                LocalDNSHosts localDNSHosts3 = LocalDNSHosts.this;
                                localDNSHosts3.mAddress = C2204961BRm.c0(localDNSHosts3.mHosts[i], new C0WZX("dzBzEhEpEcfZUV4gThuQKJLVr0WHeYNBIWg0xe9HI4Nn", null));
                                String strLIZIZ = "";
                                int i2 = 0;
                                while (true) {
                                    localDNSHosts = LocalDNSHosts.this;
                                    InetAddress[] inetAddressArr = localDNSHosts.mAddress;
                                    if (i2 >= inetAddressArr.length) {
                                        break;
                                    }
                                    String strD0 = C2204961BRm.d0(inetAddressArr[i2], new C0WZX("dzBzEhEpEcfZUV4gThuQKJLVr0WHeYNBIWg0xe9HI4Nn", null));
                                    if (!TextUtils.isEmpty(strD0)) {
                                        if (TextUtils.isEmpty(strLIZIZ)) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append(strLIZIZ);
                                            sbLIZ.append(strD0);
                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                        } else {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append(strLIZIZ);
                                            sbLIZ2.append(",");
                                            sbLIZ2.append(strD0);
                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                        }
                                    }
                                    i2++;
                                }
                                Locale locale = Locale.US;
                                AVMDLLog.d("BatchParseLocalDNSHosts", C786410Ut5.k4(locale, "host:%s pasrse suc result:%s", new Object[]{localDNSHosts.mHosts[i], strLIZIZ}));
                                if (!TextUtils.isEmpty(strLIZIZ)) {
                                    AVMDLLog.d("BatchParseLocalDNSHosts", C786410Ut5.k4(locale, "****default expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(AVMDLDNSParser.mGlobalDefaultExpiredTime), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
                                    int i3 = AVMDLDNSParser.mGlobalForceExpiredTime;
                                    if (i3 <= 0) {
                                        i3 = AVMDLDNSParser.mGlobalDefaultExpiredTime;
                                    }
                                    IPCache.getInstance().put(LocalDNSHosts.this.mHosts[i], new AVMDLDNSInfo(0, LocalDNSHosts.this.mHosts[i], strLIZIZ, System.currentTimeMillis() + ((long) (i3 * LSPassThroughRecordSizeConfig.DEFAULT)), LocalDNSHosts.this.mId));
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                AVMDLLog.d("BatchParseLocalDNSHosts", C786410Ut5.k4(Locale.US, "host:%s pasrse err:%s", new Object[]{LocalDNSHosts.this.mHosts[i], th.getMessage()}));
                            }
                        }
                        i++;
                    }
                }

                public static void com_ss_mediakit_net_LocalDNSHosts$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_ss_mediakit_net_LocalDNSHosts$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AVMDLLog.d("BatchParseLocalDNSHosts", C786410Ut5.k4(Locale.US, "****end call local dns, exception:%s", new Object[]{e}));
        }
        C786410Ut5.LJLIIL(10000L, this.mHandler, new MyRunnable(this));
    }

    public boolean isRunning() {
        return this.mRet;
    }

    public LocalDNSHosts(String[] strArr, Handler handler) {
        this.mHosts = strArr;
        this.mHandler = handler;
    }
}
