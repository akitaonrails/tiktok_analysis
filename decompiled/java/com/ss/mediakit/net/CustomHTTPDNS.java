package com.ss.mediakit.net;

import X.C1C7U;
import X.C2179971ATj;
import X.C786410Ut5;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.Locale;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes24.dex */
public class CustomHTTPDNS extends BaseDNS {
    public InetAddress[] mAddress;
    public Future mFuture;
    public boolean mRet;

    public static class MyRunnable implements Runnable {
        public final WeakReference<CustomHTTPDNS> mCustomHTTPDNSRef;

        @Override // java.lang.Runnable
        public void run() {
            C1C7U.LIZ("CustomHTTPDNS$MyRunnable@a503.run");
            com_ss_mediakit_net_CustomHTTPDNS$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("CustomHTTPDNS$MyRunnable@a503.run");
        }

        public void com_ss_mediakit_net_CustomHTTPDNS$MyRunnable__run$___twin___() {
            Locale locale = Locale.US;
            AVMDLLog.d("CustomHTTPDNS", C786410Ut5.k4(locale, "----implement delayed check for custom httpdns", new Object[0]));
            CustomHTTPDNS customHTTPDNS = this.mCustomHTTPDNSRef.get();
            if (customHTTPDNS == null) {
                AVMDLLog.d("CustomHTTPDNS", C786410Ut5.k4(locale, "****end implement delayed check for custom httpdns, dns object null", new Object[0]));
            } else {
                if (customHTTPDNS.mRet) {
                    return;
                }
                customHTTPDNS.cancel();
                AVMDLLog.d("CustomHTTPDNS", C786410Ut5.k4(locale, "****end implement delayed check cancel custom httpdns,", new Object[0]));
                customHTTPDNS.notifyError(new AVMDLDNSInfo(4, customHTTPDNS.mHostname, (String) null, 0L, customHTTPDNS.mId));
            }
        }

        public MyRunnable(CustomHTTPDNS customHTTPDNS) {
            this.mCustomHTTPDNSRef = new WeakReference<>(customHTTPDNS);
        }

        public static void com_ss_mediakit_net_CustomHTTPDNS$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(MyRunnable myRunnable) {
            try {
                myRunnable.com_ss_mediakit_net_CustomHTTPDNS$MyRunnable__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.mediakit.net.BaseDNS
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

    @Override // com.ss.mediakit.net.BaseDNS
    public void start() {
        try {
            this.mFuture = AVMDLThreadPool.addExecuteTask(new Runnable() { // from class: com.ss.mediakit.net.CustomHTTPDNS.1
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("CustomHTTPDNS@9a8f.start$1");
                    com_ss_mediakit_net_CustomHTTPDNS$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("CustomHTTPDNS@9a8f.start$1");
                }

                public void com_ss_mediakit_net_CustomHTTPDNS$1__run$___twin___() {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[2];
                    objArr[0] = CustomHTTPDNS.this.mHostname;
                    objArr[1] = Integer.valueOf(AVMDLDNSParser.mCustomHttpDNSParser == null ? 0 : 1);
                    AVMDLLog.d("CustomHTTPDNS", C786410Ut5.k4(locale, "----call custom httpdns, host:%s custom parser:%d", objArr));
                    AVMDLCustomHTTPDNSParser aVMDLCustomHTTPDNSParser = AVMDLDNSParser.mCustomHttpDNSParser;
                    AVMDLCustomHTTPDNSParserResult host = aVMDLCustomHTTPDNSParser != null ? aVMDLCustomHTTPDNSParser.parseHost(CustomHTTPDNS.this.mHostname) : null;
                    CustomHTTPDNS.this.mRet = true;
                    if (host == null || TextUtils.isEmpty(host.mIPList)) {
                        AVMDLLog.d("CustomHTTPDNS", C786410Ut5.k4(locale, "****end call custom httpdns, result null or iplist null host:%s", new Object[]{CustomHTTPDNS.this.mHostname}));
                        CustomHTTPDNS customHTTPDNS = CustomHTTPDNS.this;
                        customHTTPDNS.notifyError(new AVMDLDNSInfo(4, customHTTPDNS.mHostname, (String) null, 0L, customHTTPDNS.mId));
                    } else {
                        AVMDLLog.d("CustomHTTPDNS", C786410Ut5.k4(locale, "****default expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(AVMDLDNSParser.mGlobalDefaultExpiredTime), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
                        int i = AVMDLDNSParser.mGlobalForceExpiredTime;
                        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(4, CustomHTTPDNS.this.mHostname, host.mIPList, System.currentTimeMillis() + ((i > 0 ? i : host.mTTL) * 1000), CustomHTTPDNS.this.mId);
                        IPCache.getInstance().put(CustomHTTPDNS.this.mHostname, aVMDLDNSInfo);
                        CustomHTTPDNS.this.notifySuccess(aVMDLDNSInfo);
                        AVMDLLog.d("CustomHTTPDNS", C786410Ut5.k4(locale, "****end call custom httpdns, suc iplist:%s host:%s", new Object[]{host.mIPList, CustomHTTPDNS.this.mHostname}));
                    }
                }

                public static void com_ss_mediakit_net_CustomHTTPDNS$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_ss_mediakit_net_CustomHTTPDNS$1__run$___twin___();
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
            AVMDLLog.d("CustomHTTPDNS", C786410Ut5.k4(Locale.US, "****end call custom httpdns, exception:%s host:%s", new Object[]{e, this.mHostname}));
            notifyError(new AVMDLDNSInfo(4, this.mHostname, (String) null, 0L, this.mId));
        }
        C786410Ut5.LJLIIL(10000L, this.mHandler, new MyRunnable(this));
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public void close() {
        super.close();
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public boolean isRunning() {
        return this.mRet;
    }

    public CustomHTTPDNS(String str, Handler handler) {
        super(str, handler);
    }
}
