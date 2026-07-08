package com.ss.bduploader.net;

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
import com.ss.bduploader.BDUploadLog;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes24.dex */
public class LocalDNS extends BaseDNS {
    public InetAddress[] mAddress;
    public Future mFuture;
    public boolean mRet;

    @Override // com.ss.bduploader.net.BaseDNS
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

    @Override // com.ss.bduploader.net.BaseDNS
    public void start() {
        try {
            this.mFuture = BDUploadThreadPool.addExecuteTask(new Runnable() { // from class: com.ss.bduploader.net.LocalDNS.1
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("LocalDNS@f00f.start$1");
                    com_ss_bduploader_net_LocalDNS$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("LocalDNS@f00f.start$1");
                }

                public void com_ss_bduploader_net_LocalDNS$1__run$___twin___() throws Throwable {
                    BDUploadLog.d("LocalDNS", C786410Ut5.j4("----call local dns, host:%s", new Object[]{LocalDNS.this.mHostname}));
                    try {
                        LocalDNS localDNS = LocalDNS.this;
                        localDNS.mAddress = C2204961BRm.c0(localDNS.mHostname, new C0WZX("dzBzEhEpEcjYQEctShOAYxA5m3p9pTEEj2Rro8r5", null));
                        LocalDNS localDNS2 = LocalDNS.this;
                        localDNS2.mRet = true;
                        if (localDNS2.mAddress == null) {
                            BDUploadLog.d("LocalDNS", C786410Ut5.j4("****end call local dns, not get address host:%s", new Object[]{localDNS2.mHostname}));
                            LocalDNS localDNS3 = LocalDNS.this;
                            localDNS3.notifyError(new BDUploadDNSInfo(0, localDNS3.mHostname, null, 0L, localDNS3.mId));
                            return;
                        }
                        String strLIZIZ = "";
                        int i = 0;
                        while (true) {
                            InetAddress[] inetAddressArr = LocalDNS.this.mAddress;
                            if (i >= inetAddressArr.length) {
                                break;
                            }
                            String strD0 = C2204961BRm.d0(inetAddressArr[i], new C0WZX("dzBzEhEpEcjYQEctShOAYxA5m3p9pTEEj2Rro8r5", null));
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
                            BDUploadLog.d("LocalDNS", C786410Ut5.j4("****end call local dns, iplist null host:%s", new Object[]{LocalDNS.this.mHostname}));
                            LocalDNS localDNS4 = LocalDNS.this;
                            localDNS4.notifyError(new BDUploadDNSInfo(0, localDNS4.mHostname, null, 0L, localDNS4.mId));
                        } else {
                            BDUploadLog.d("LocalDNS", C786410Ut5.j4("****end call local dns, suc iplist:%s host:%s", new Object[]{strLIZIZ, LocalDNS.this.mHostname}));
                            BDUploadDNSInfo bDUploadDNSInfo = new BDUploadDNSInfo(0, LocalDNS.this.mHostname, strLIZIZ, System.currentTimeMillis() + ((long) (BDUploadDNSParser.mGlobalDefaultExpiredTime * LSPassThroughRecordSizeConfig.DEFAULT)), LocalDNS.this.mId);
                            IPCache.getInstance().put(LocalDNS.this.mHostname, bDUploadDNSInfo);
                            LocalDNS.this.notifySuccess(bDUploadDNSInfo);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        LocalDNS localDNS5 = LocalDNS.this;
                        localDNS5.mRet = true;
                        BDUploadLog.d("LocalDNS", C786410Ut5.j4("****end call local dns, end exception:%s host:%s", new Object[]{th, localDNS5.mHostname}));
                        LocalDNS localDNS6 = LocalDNS.this;
                        localDNS6.notifyError(new BDUploadDNSInfo(0, localDNS6.mHostname, null, 0L, localDNS6.mId));
                    }
                }

                public static void com_ss_bduploader_net_LocalDNS$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_ss_bduploader_net_LocalDNS$1__run$___twin___();
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
            BDUploadLog.d("LocalDNS", C786410Ut5.j4("****end call local dns, exception:%s host:%s", new Object[]{e, this.mHostname}));
            notifyError(new BDUploadDNSInfo(0, this.mHostname, null, 0L, this.mId));
        }
        C786410Ut5.LJLIIL(10000L, this.mHandler, new MyRunnable(this));
    }

    @Override // com.ss.bduploader.net.BaseDNS
    public void close() {
        super.close();
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

    @Override // com.ss.bduploader.net.BaseDNS
    public boolean isRunning() {
        return this.mRet;
    }

    public static class MyRunnable implements Runnable {
        public final WeakReference<LocalDNS> mLocalDNSRef;

        public void com_ss_bduploader_net_LocalDNS$MyRunnable__run$___twin___() {
            BDUploadLog.d("LocalDNS", C786410Ut5.j4("----implement delayed check for local dns", new Object[0]));
            LocalDNS localDNS = this.mLocalDNSRef.get();
            if (localDNS == null) {
                BDUploadLog.d("LocalDNS", C786410Ut5.j4("****end implement delayed check for local dns, dns object null", new Object[0]));
            } else {
                if (localDNS.mRet) {
                    return;
                }
                localDNS.cancel();
                BDUploadLog.d("LocalDNS", C786410Ut5.j4("****end implement delayed check cancel local dns,", new Object[0]));
                localDNS.notifyError(new BDUploadDNSInfo(0, localDNS.mHostname, null, 0L, localDNS.mId));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            C1C7U.LIZ("LocalDNS$MyRunnable@13d2.run");
            com_ss_bduploader_net_LocalDNS$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("LocalDNS$MyRunnable@13d2.run");
        }

        public MyRunnable(LocalDNS localDNS) {
            this.mLocalDNSRef = new WeakReference<>(localDNS);
        }

        public static void com_ss_bduploader_net_LocalDNS$MyRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(MyRunnable myRunnable) {
            try {
                myRunnable.com_ss_bduploader_net_LocalDNS$MyRunnable__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    }

    public LocalDNS(String str, Handler handler) {
        super(str, handler);
    }
}
