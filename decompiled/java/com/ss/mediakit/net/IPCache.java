package com.ss.mediakit.net;

import X.C2188811AlT;
import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes24.dex */
public class IPCache {
    public static volatile IPCache mInstance = null;
    public static String mNetExtraInfo = null;
    public static int mNetType = -1;
    public ConcurrentHashMap<String, AVMDLDNSInfo> mDNSRecord = new ConcurrentHashMap<>();
    public ConcurrentHashMap<String, AVMDLDNSInfo> mBackUps = new ConcurrentHashMap<>();
    public Lock lock = new ReentrantLock();
    public Lock backUplock = new ReentrantLock();

    public static IPCache getInstance() {
        if (mInstance == null) {
            synchronized (IPCache.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new IPCache();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mInstance;
    }

    public void clear() {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, AVMDLDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
            this.lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.unlock();
            throw th;
        }
    }

    public int getRecordSize() {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, AVMDLDNSInfo> concurrentHashMap = this.mDNSRecord;
            int size = concurrentHashMap != null ? concurrentHashMap.size() : -1;
            this.lock.unlock();
            return size;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.unlock();
            throw th;
        }
    }

    public String getCurNetExtraInfo() {
        return mNetExtraInfo;
    }

    public int getCurNetType() {
        return mNetType;
    }

    public static void setCurNetExtraInfo(String str) {
        mNetExtraInfo = str;
    }

    public AVMDLDNSInfo get(String str) {
        AVMDLDNSInfo aVMDLDNSInfo = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.lock.lock();
        try {
            ConcurrentHashMap<String, AVMDLDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null && (aVMDLDNSInfo = concurrentHashMap.get(str)) != null && !TextUtils.isEmpty(aVMDLDNSInfo.mIpList) && AVMDLDNSParser.mGlobalEnableBackUpIp > 0) {
                Locale locale = Locale.US;
                AVMDLLog.d("AVMDLIPCache", C786410Ut5.k4(locale, "enable backup try get backup ip for:%s", new Object[]{str}));
                AVMDLDNSInfo backUpIp = getBackUpIp(str);
                if (backUpIp != null && !TextUtils.isEmpty(backUpIp.mIpList)) {
                    AVMDLLog.d("AVMDLIPCache", C786410Ut5.k4(locale, "succ get backup ip:%s", new Object[]{backUpIp.mIpList}));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(aVMDLDNSInfo.mIpList);
                    sbLIZ.append(",");
                    sbLIZ.append(backUpIp.mIpList);
                    aVMDLDNSInfo.mIpList = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            this.lock.unlock();
            return aVMDLDNSInfo;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.unlock();
            throw th;
        }
    }

    public AVMDLDNSInfo getBackUpIp(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.backUplock.lock();
        try {
            AVMDLDNSInfo aVMDLDNSInfo = this.mBackUps.get(str);
            this.backUplock.unlock();
            return aVMDLDNSInfo;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.backUplock.unlock();
            throw th;
        }
    }

    public void setCurNetType(int i) {
        mNetType = i;
    }

    public void put(String str, AVMDLDNSInfo aVMDLDNSInfo) {
        int i;
        if (aVMDLDNSInfo != null && !TextUtils.isEmpty(str)) {
            this.lock.lock();
            try {
                ConcurrentHashMap<String, AVMDLDNSInfo> concurrentHashMap = this.mDNSRecord;
                if (concurrentHashMap != null) {
                    AVMDLDNSInfo aVMDLDNSInfo2 = concurrentHashMap.get(str);
                    if (AVMDLDNSParser.mGlobalEnableParallel > 0 && aVMDLDNSInfo2 != null && (i = aVMDLDNSInfo.mType) == 0 && aVMDLDNSInfo2.mType > i && aVMDLDNSInfo2.mExpiredTime > System.currentTimeMillis()) {
                        AVMDLLog.d("AVMDLIPCache", C786410Ut5.k4(Locale.US, "put for host:%s enable parallel info.type:%d info.expiredT:%d cache.type:%d cache.expiredT:%d curT:%d info can not replace cache", new Object[]{str, Integer.valueOf(aVMDLDNSInfo.mType), Long.valueOf(aVMDLDNSInfo.mExpiredTime), Integer.valueOf(aVMDLDNSInfo2.mType), Long.valueOf(aVMDLDNSInfo2.mExpiredTime), Long.valueOf(System.currentTimeMillis())}));
                        this.lock.unlock();
                        return;
                    } else {
                        AVMDLLog.d("AVMDLIPCache", C786410Ut5.k4(Locale.US, "put for host:%s type:%d ip:%s", new Object[]{aVMDLDNSInfo.mHost, Integer.valueOf(aVMDLDNSInfo.mType), aVMDLDNSInfo.mIpList}));
                        this.mDNSRecord.put(str, aVMDLDNSInfo);
                    }
                }
                this.lock.unlock();
                AVMDLLog.d("AVMDLIPCache", "update dns info to native");
                AVMDLDataLoader.getInstance().updateDNSInfo(str, aVMDLDNSInfo.mIpList, aVMDLDNSInfo.mExpiredTime, null, aVMDLDNSInfo.mType);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.lock.unlock();
                throw th;
            }
        }
    }

    public void putBackUpIp(String str, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo != null && !TextUtils.isEmpty(str)) {
            this.backUplock.lock();
            try {
                AVMDLLog.d("AVMDLIPCache", C786410Ut5.k4(Locale.US, "put backupip for host:%s type:%d ip:%s", new Object[]{aVMDLDNSInfo.mHost, Integer.valueOf(aVMDLDNSInfo.mType), aVMDLDNSInfo.mIpList}));
                this.mBackUps.put(str, aVMDLDNSInfo);
                this.backUplock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.backUplock.unlock();
                throw th;
            }
        }
    }
}
