package com.ss.mediakit.net;

import X.C0WZX;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import android.net.Network;
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
public class LocalDNS extends BaseDNS {
    public InetAddress[] mAddress;
    public Future mFuture;
    public boolean mRet;

    public static class MyRunnable implements Runnable {
        public final WeakReference<LocalDNS> mLocalDNSRef;

        @Override // java.lang.Runnable
        public void run() {
            C1C7U.LIZ("LocalDNS$MyRunnable@8ef9.run");
            com_ss_mediakit_net_LocalDNS$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("LocalDNS$MyRunnable@8ef9.run");
        }

        public void com_ss_mediakit_net_LocalDNS$MyRunnable__run$___twin___() {
            Locale locale = Locale.US;
            AVMDLLog.d("LocalDNS", C786410Ut5.k4(locale, "----implement delayed check for local dns", new Object[0]));
            LocalDNS localDNS = this.mLocalDNSRef.get();
            if (localDNS == null) {
                AVMDLLog.d("LocalDNS", C786410Ut5.k4(locale, "****end implement delayed check for local dns, dns object null", new Object[0]));
            } else {
                if (localDNS.mRet) {
                    return;
                }
                localDNS.cancel();
                AVMDLLog.d("LocalDNS", C786410Ut5.k4(locale, "****end implement delayed check cancel local dns,", new Object[0]));
                localDNS.notifyError(new AVMDLDNSInfo(0, localDNS.mHostname, (String) null, 0L, localDNS.mId));
            }
        }

        public MyRunnable(LocalDNS localDNS) {
            this.mLocalDNSRef = new WeakReference<>(localDNS);
        }

        public static void com_ss_mediakit_net_LocalDNS$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(MyRunnable myRunnable) {
            try {
                myRunnable.com_ss_mediakit_net_LocalDNS$MyRunnable__run$___twin___();
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
            this.mFuture = AVMDLThreadPool.addExecuteTask(new Runnable() { // from class: com.ss.mediakit.net.LocalDNS.1
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("LocalDNS@3ba3.start$1");
                    com_ss_mediakit_net_LocalDNS$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("LocalDNS@3ba3.start$1");
                }

                public void com_ss_mediakit_net_LocalDNS$1__run$___twin___() throws Throwable {
                    Locale locale = Locale.US;
                    AVMDLLog.d("LocalDNS", C786410Ut5.k4(locale, "----call local dns, host:%s", new Object[]{LocalDNS.this.mHostname}));
                    try {
                        Network curNetwork = AVMDLMultiNetwork.getCurNetwork();
                        if (curNetwork != null) {
                            AVMDLLog.d("LocalDNS", C786410Ut5.k4(locale, "do local by cellular network", new Object[0]));
                            LocalDNS localDNS = LocalDNS.this;
                            localDNS.mAddress = curNetwork.getAllByName(localDNS.mHostname);
                        } else {
                            AVMDLLog.d("LocalDNS", C786410Ut5.k4(locale, "do local by default network", new Object[0]));
                            LocalDNS localDNS2 = LocalDNS.this;
                            localDNS2.mAddress = C2204961BRm.c0(localDNS2.mHostname, new C0WZX("dzBzEhEpEcfZUV4gThuQKJLVr0WHeYNBIWg0xQ==", null));
                        }
                        LocalDNS localDNS3 = LocalDNS.this;
                        localDNS3.mRet = true;
                        if (localDNS3.mAddress == null) {
                            AVMDLLog.d("LocalDNS", C786410Ut5.k4(locale, "****end call local dns, not get address host:%s", new Object[]{localDNS3.mHostname}));
                            LocalDNS localDNS4 = LocalDNS.this;
                            localDNS4.notifyError(new AVMDLDNSInfo(0, localDNS4.mHostname, (String) null, 0L, localDNS4.mId));
                            return;
                        }
                        String strLIZIZ = "";
                        int i = 0;
                        while (true) {
                            InetAddress[] inetAddressArr = LocalDNS.this.mAddress;
                            if (i >= inetAddressArr.length) {
                                break;
                            }
                            String strD0 = C2204961BRm.d0(inetAddressArr[i], new C0WZX("dzBzEhEpEcfZUV4gThuQKJLVr0WHeYNBIWg0xQ==", null));
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
                            i++;
                        }
                        if (TextUtils.isEmpty(strLIZIZ)) {
                            AVMDLLog.d("LocalDNS", C786410Ut5.k4(Locale.US, "****end call local dns, iplist null host:%s", new Object[]{LocalDNS.this.mHostname}));
                            LocalDNS localDNS5 = LocalDNS.this;
                            localDNS5.notifyError(new AVMDLDNSInfo(0, localDNS5.mHostname, (String) null, 0L, localDNS5.mId));
                            return;
                        }
                        Locale locale2 = Locale.US;
                        AVMDLLog.d("LocalDNS", C786410Ut5.k4(locale2, "****default expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(AVMDLDNSParser.mGlobalDefaultExpiredTime), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
                        int i2 = AVMDLDNSParser.mGlobalForceExpiredTime;
                        if (i2 <= 0) {
                            i2 = AVMDLDNSParser.mGlobalDefaultExpiredTime;
                        }
                        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(0, LocalDNS.this.mHostname, strLIZIZ, System.currentTimeMillis() + ((long) (i2 * LSPassThroughRecordSizeConfig.DEFAULT)), LocalDNS.this.mId);
                        IPCache.getInstance().put(LocalDNS.this.mHostname, aVMDLDNSInfo);
                        LocalDNS.this.notifySuccess(aVMDLDNSInfo);
                        AVMDLLog.d("LocalDNS", C786410Ut5.k4(locale2, "****end call local dns, suc iplist:%s host:%s", new Object[]{strLIZIZ, LocalDNS.this.mHostname}));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        LocalDNS localDNS6 = LocalDNS.this;
                        localDNS6.mRet = true;
                        AVMDLLog.d("LocalDNS", C786410Ut5.k4(Locale.US, "****end call local dns, end exception:%s host:%s", new Object[]{th, localDNS6.mHostname}));
                        LocalDNS localDNS7 = LocalDNS.this;
                        localDNS7.notifyError(new AVMDLDNSInfo(0, localDNS7.mHostname, (String) null, 0L, localDNS7.mId));
                    }
                }

                public static void com_ss_mediakit_net_LocalDNS$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_ss_mediakit_net_LocalDNS$1__run$___twin___();
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
            AVMDLLog.d("LocalDNS", C786410Ut5.k4(Locale.US, "****end call local dns, exception:%s host:%s", new Object[]{e, this.mHostname}));
            notifyError(new AVMDLDNSInfo(0, this.mHostname, (String) null, 0L, this.mId));
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

    public LocalDNS(String str, Handler handler) {
        super(str, handler);
    }
}
