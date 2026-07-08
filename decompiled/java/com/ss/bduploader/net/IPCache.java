package com.ss.bduploader.net;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes24.dex */
public class IPCache {
    public static IPCache mInstance = null;
    public static String mNetExtraInfo = null;
    public static int mNetType = -1;
    public ConcurrentHashMap<String, BDUploadDNSInfo> mDNSRecord = new ConcurrentHashMap<>();
    public Lock lock = new ReentrantLock();

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
            ConcurrentHashMap<String, BDUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
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
            ConcurrentHashMap<String, BDUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
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

    public BDUploadDNSInfo get(String str) {
        BDUploadDNSInfo bDUploadDNSInfo;
        this.lock.lock();
        try {
            ConcurrentHashMap<String, BDUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                bDUploadDNSInfo = concurrentHashMap.get(str);
            } else {
                bDUploadDNSInfo = null;
            }
            this.lock.unlock();
            return bDUploadDNSInfo;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.unlock();
            throw th;
        }
    }

    public void setCurNetExtraInfo(String str) {
        mNetExtraInfo = str;
    }

    public void setCurNetType(int i) {
        mNetType = i;
    }

    public void put(String str, BDUploadDNSInfo bDUploadDNSInfo) {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, BDUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                concurrentHashMap.put(str, bDUploadDNSInfo);
            }
            this.lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.unlock();
            throw th;
        }
    }
}
