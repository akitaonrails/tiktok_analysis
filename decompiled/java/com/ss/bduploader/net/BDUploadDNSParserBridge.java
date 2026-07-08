package com.ss.bduploader.net;

import X.C2188811AlT;
import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bduploader.BDUploadLog;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes24.dex */
public class BDUploadDNSParserBridge implements BDUploadDNSParserListener {
    public String host;
    public String ipList;
    public boolean isFinish;
    public Lock lock = new ReentrantLock();
    public long handle = 0;

    public static native void _notifyParserResult(long j, String str, String str2, long j2, String str3);

    public String getResult() {
        this.lock.lock();
        try {
            String str = this.ipList;
            this.lock.unlock();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("****get result:");
            sbLIZ.append(str);
            BDUploadLog.d("BDUploadDNSParserBridge", C2188811AlT.LIZIZ(sbLIZ));
            return str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.unlock();
            throw th;
        }
    }

    public void release() {
        this.lock.lock();
        try {
            this.handle = 0L;
            BDUploadDNSParser.getInstance().removeHost(this.host, this);
            this.lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.unlock();
            throw th;
        }
    }

    public boolean isFinish() {
        return this.isFinish;
    }

    public int start(long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("----start parse host:");
        sbLIZ.append(str);
        BDUploadLog.d("BDUploadDNSParserBridge", C2188811AlT.LIZIZ(sbLIZ));
        if (TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("****end parse fail for host:");
            sbLIZ2.append(str);
            BDUploadLog.d("BDUploadDNSParserBridge", C2188811AlT.LIZIZ(sbLIZ2));
            return -1;
        }
        this.lock.lock();
        this.handle = j;
        try {
            this.host = str;
            BDUploadDNSInfo bDUploadDNSInfo = IPCache.getInstance().get(str);
            int i = 0;
            if (bDUploadDNSInfo != null) {
                this.ipList = bDUploadDNSInfo.mIpList;
                long jCurrentTimeMillis = System.currentTimeMillis();
                BDUploadLog.d("BDUploadDNSParserBridge", C786410Ut5.j4("get result from cache expiredT:%d curT:%d ", new Object[]{Long.valueOf(bDUploadDNSInfo.mExpiredTime), Long.valueOf(jCurrentTimeMillis)}));
                if (bDUploadDNSInfo.mExpiredTime <= jCurrentTimeMillis) {
                    BDUploadLog.d("BDUploadDNSParserBridge", C786410Ut5.j4("has expired try call parse:", new Object[0]));
                    BDUploadDNSParser.getInstance().addHost(str, null);
                }
                long j2 = this.handle;
                if (j2 != 0) {
                    _notifyParserResult(j2, str, this.ipList, bDUploadDNSInfo.mExpiredTime, null);
                }
                i = 1;
            } else {
                BDUploadLog.d("BDUploadDNSParserBridge", "****add host to parser");
                BDUploadDNSParser.getInstance().addHost(str, this);
            }
            this.lock.unlock();
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bduploader.net.BDUploadDNSParserListener
    public void onCompletion(int i, String str, String str2, long j, String str3) {
        this.lock.lock();
        try {
            if (!this.isFinish) {
                BDUploadLog.d("BDUploadDNSParserBridge", C786410Ut5.j4("receive completion code:%d result:%s", new Object[]{Integer.valueOf(i), str2}));
                this.ipList = str2;
                this.isFinish = true;
                long j2 = this.handle;
                if (j2 != 0) {
                    _notifyParserResult(j2, str, str2, j, str3);
                }
            } else {
                BDUploadLog.d("BDUploadDNSParserBridge", C786410Ut5.j4("has finished not nedd cur completion code:%d result:%s expiredTime:%lld", new Object[]{Integer.valueOf(i), str2, Long.valueOf(j)}));
            }
            this.lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.unlock();
            throw th;
        }
    }
}
