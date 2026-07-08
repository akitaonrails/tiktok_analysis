package com.ss.bduploader;

import X.C1C7U;
import X.C2179971ATj;
import X.C786410Ut5;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bduploader.net.BDUploadDNSInfo;
import com.ss.bduploader.net.BDUploadDNSParser;
import com.ss.bduploader.net.BDUploadDNSParserListener;
import com.ss.bduploader.net.BDUploadThreadPool;
import com.ss.bduploader.net.HTTPDNS;
import com.ss.bduploader.net.IPCache;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes24.dex */
public class BDUploadResolver implements BDUploadDNSParserListener {
    public static int HOST_MAX_CACHE_TIME = 60000;
    public static volatile int mDNSVersion = 1;
    public static volatile int mIsUseTTnetDNS;
    public String mError;
    public Future mFuture;
    public HostInfo mHostInfo;
    public volatile String mHostName;
    public volatile String[] mIPStr;
    public volatile boolean mRet;
    public Thread mThread;
    public int mUseDNSType = mDNSVersion;
    public static final Hashtable<String, HostInfo> mCacheHosts = new Hashtable<>();
    public static int mEnableThreadPool = 1;

    public static class HostInfo {
        public String ip;
        public long time;
    }

    public static class ParserHost implements Runnable {
        public String mHostName;
        public BDUploadResolver mResolver;

        @Override // java.lang.Runnable
        public void run() {
            C1C7U.LIZ("BDUploadResolver$ParserHost@38ae.run");
            com_ss_bduploader_BDUploadResolver$ParserHost_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("BDUploadResolver$ParserHost@38ae.run");
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void com_ss_bduploader_BDUploadResolver$ParserHost__run$___twin___() throws java.lang.Throwable {
            /*
                r6 = this;
                int r0 = com.ss.bduploader.BDUploadResolver.mIsUseTTnetDNS
                r3 = 0
                r5 = 0
                r4 = 1
                if (r0 != r4) goto L20
                java.lang.String r0 = r6.mHostName     // Catch: java.lang.Throwable -> L1c
                java.util.List r1 = com.ss.bduploader.TTNetWrapper.dnsLookup(r0)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L20
                java.lang.Object r0 = r1.get(r5)     // Catch: java.lang.Throwable -> L1c
                if (r0 == 0) goto L20
                java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L1c
                java.net.InetAddress r2 = (java.net.InetAddress) r2     // Catch: java.lang.Throwable -> L1c
                goto L34
            L1c:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            L20:
                r2 = r3
                java.lang.String r0 = r6.mHostName     // Catch: java.net.UnknownHostException -> L28
                java.net.InetAddress r2 = java.net.InetAddress.getByName(r0)     // Catch: java.net.UnknownHostException -> L28
                goto L34
            L28:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                com.ss.bduploader.BDUploadResolver r1 = r6.mResolver
                java.lang.String r0 = r0.getMessage()
                r1.mError = r0
            L34:
                if (r2 == 0) goto L6a
                X.0WZX r1 = new X.0WZX
                java.lang.String r0 = "dzBzEhEpEcjYQEctShOAYxA5t1tc+xEEjWFVgvfF5AzD3Q=="
                r1.<init>(r0, r3)
                java.lang.String r3 = X.C2204961BRm.d0(r2, r1)
                com.ss.bduploader.BDUploadResolver r1 = r6.mResolver
                java.lang.String[] r0 = new java.lang.String[r4]
                r1.mIPStr = r0
                com.ss.bduploader.BDUploadResolver r0 = r6.mResolver
                java.lang.String[] r0 = r0.mIPStr
                r0[r5] = r3
                com.ss.bduploader.BDUploadResolver$HostInfo r2 = new com.ss.bduploader.BDUploadResolver$HostInfo
                r2.<init>()
                long r0 = java.lang.System.currentTimeMillis()
                r2.time = r0
                r2.ip = r3
                java.lang.String r0 = r6.mHostName
                com.ss.bduploader.BDUploadResolver.putHostInfo(r0, r2)
                long r0 = java.lang.System.currentTimeMillis()
                r2.time = r0
                com.ss.bduploader.BDUploadResolver r0 = r6.mResolver
                r0.mRet = r4
                return
            L6a:
                com.ss.bduploader.BDUploadResolver r0 = r6.mResolver
                r0.mRet = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.bduploader.BDUploadResolver.ParserHost.com_ss_bduploader_BDUploadResolver$ParserHost__run$___twin___():void");
        }

        public static void com_ss_bduploader_BDUploadResolver$ParserHost_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(ParserHost parserHost) {
            try {
                parserHost.com_ss_bduploader_BDUploadResolver$ParserHost__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }

        public ParserHost(BDUploadResolver bDUploadResolver, String str) {
            this.mResolver = bDUploadResolver;
            this.mHostName = str;
        }
    }

    private native void _notifyParserResult(String str, String str2, long j, String str3);

    public void freeAddress() {
        if (this.mUseDNSType == 1) {
            Future future = this.mFuture;
            if (future != null) {
                try {
                    future.cancel(true);
                    this.mFuture = null;
                    BDUploadLog.d("BDUploadResolver", "----cancel parser thread");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            Thread thread = this.mThread;
            if (thread != null) {
                try {
                    thread.interrupt();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        if (this.mUseDNSType == 2) {
            try {
                BDUploadDNSParser.getInstance().removeHost(this.mHostName, this);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    public String getAddress() {
        if (!this.mRet || this.mIPStr == null || this.mIPStr[0] == null) {
            return null;
        }
        return this.mIPStr[0];
    }

    public int isSuccess() {
        if (this.mRet) {
            return (this.mIPStr == null || this.mIPStr[0] == null) ? -1 : 1;
        }
        return 0;
    }

    private void getAddressInfoVersion_1(String str) {
        this.mHostName = str;
        if (str != null && str.length() >= 1 && !"".equals(str)) {
            if (isIP(this.mHostName)) {
                this.mIPStr = new String[1];
                this.mIPStr[0] = this.mHostName;
                this.mRet = true;
                return;
            }
            Hashtable<String, HostInfo> hashtable = mCacheHosts;
            HostInfo hostInfo = hashtable.get(str);
            this.mHostInfo = hostInfo;
            if (hostInfo != null) {
                if (hostInfo.ip != null && System.currentTimeMillis() - this.mHostInfo.time < HOST_MAX_CACHE_TIME) {
                    this.mIPStr = new String[1];
                    this.mIPStr[0] = this.mHostInfo.ip;
                    this.mRet = true;
                    return;
                }
                hashtable.remove(str);
                this.mHostInfo = null;
            }
            try {
                if (mEnableThreadPool > 0) {
                    BDUploadLog.d("BDUploadResolver", "----enable dns parser thread pool");
                    this.mFuture = BDUploadThreadPool.addExecuteTask(new ParserHost(this, this.mHostName));
                    return;
                } else {
                    BDUploadLog.d("BDUploadResolver", "----disable dns parser thread pool");
                    BPEAThread bPEAThread = new BPEAThread(new ParserHost(this, this.mHostName));
                    this.mThread = bPEAThread;
                    bPEAThread.start();
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.mRet = true;
                this.mError = e.getMessage();
                return;
            }
        }
        this.mRet = true;
    }

    private void getAddressInfoVersion_2(String str) {
        BDUploadLog.d("BDUploadResolver", "----add host to parser");
        this.mHostName = str;
        BDUploadDNSInfo bDUploadDNSInfo = IPCache.getInstance().get(str);
        if (bDUploadDNSInfo != null && bDUploadDNSInfo.mIpList != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            BDUploadLog.d("BDUploadResolver", C786410Ut5.j4("get result from cache expiredT:%d curT:%d ", new Object[]{Long.valueOf(bDUploadDNSInfo.mExpiredTime), Long.valueOf(jCurrentTimeMillis)}));
            if (bDUploadDNSInfo.mExpiredTime <= jCurrentTimeMillis) {
                BDUploadLog.d("BDUploadResolver", C786410Ut5.j4("has expired try call parse:", new Object[0]));
                BDUploadDNSParser.getInstance().addHost(str, null);
            }
            String[] strArrSplit = bDUploadDNSInfo.mIpList.split(",");
            if (strArrSplit != null && strArrSplit.length > 0) {
                this.mIPStr = new String[1];
                this.mIPStr[0] = strArrSplit[0];
                this.mRet = true;
                BDUploadLog.d("BDUploadResolver", C786410Ut5.j4("get result from cache suc, ip:%s ", new Object[]{strArrSplit[0]}));
            }
        }
        if (!this.mRet) {
            BDUploadLog.d("BDUploadResolver", "****add host to parser");
            BDUploadDNSParser.getInstance().addHost(str, this);
        }
    }

    public static final boolean isIP(String str) {
        if (str.length() >= 7 && str.length() <= 15) {
            return PatternProtector.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str).find();
        }
        if (str.charAt(0) != '[' || str.charAt(str.length() - 1) != ']') {
            return false;
        }
        return true;
    }

    public static void setEnableDNSParserThreadPool(int i) {
        mEnableThreadPool = i;
    }

    public static void setEnableTTNetDNS(int i) {
        mIsUseTTnetDNS = i;
    }

    public void getAddressInfo(String str) {
        int i = this.mUseDNSType;
        if (i != 1) {
            if (i != 2) {
                getAddressInfoVersion_1(str);
                return;
            } else {
                getAddressInfoVersion_2(str);
                return;
            }
        }
        getAddressInfoVersion_1(str);
    }

    public static synchronized void putHostInfo(String str, HostInfo hostInfo) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Hashtable<String, HostInfo> hashtable = mCacheHosts;
        String key = null;
        if (hashtable.size() > 128) {
            Iterator<Map.Entry<String, HostInfo>> it2 = hashtable.entrySet().iterator();
            HostInfo hostInfo2 = null;
            while (it2.hasNext()) {
                HostInfo value = it2.next().getValue();
                key = it2.next().getKey();
                if (value != null) {
                    long j = value.time;
                    if (j < jCurrentTimeMillis) {
                        hostInfo2 = value;
                        jCurrentTimeMillis = j;
                    }
                }
            }
            if (hostInfo2 != null && key != null) {
                mCacheHosts.remove(key);
            }
        }
        mCacheHosts.put(str, hostInfo);
    }

    public static void setDNSServer(String str, String str2) {
        HTTPDNS.setDNSServerHost(str, str2);
    }

    public static void setDNSType(int i, int i2, int i3, int i4, int i5) {
        if (i != 1 && i != 2) {
            return;
        }
        BDUploadDNSParser.setIntValue(0, i2);
        BDUploadDNSParser.setIntValue(1, i3);
        BDUploadDNSParser.setIntValue(3, i4);
        BDUploadDNSParser.setIntValue(2, i5);
        mDNSVersion = i;
    }

    @Override // com.ss.bduploader.net.BDUploadDNSParserListener
    public void onCompletion(int i, String str, String str2, long j, String str3) {
        String[] strArrSplit;
        BDUploadLog.d("BDUploadResolver", C786410Ut5.j4("notify result host:%s iplist:%s ", new Object[]{str, str2}));
        if (!this.mRet) {
            if (str2 != null && str != null && str.equals(this.mHostName) && (strArrSplit = str2.split(",")) != null && strArrSplit.length > 0) {
                this.mIPStr = new String[1];
                this.mIPStr[0] = strArrSplit[0];
            }
            this.mRet = true;
        }
    }
}
