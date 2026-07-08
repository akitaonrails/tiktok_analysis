package com.bytedance.helios.network.pipeline.recognize;

import X.C098200Yq;
import X.C1697810uHb;
import X.C189200o6;
import X.C823280WRi;
import android.util.LruCache;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.config.NetworkConfig;
import com.bytedance.pns.engine.RuleEngineService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkDomainRecognize {
    public static final NetworkDomainRecognize INSTANCE = new NetworkDomainRecognize();
    public static DomainRecognizeConfig domainConfigs = new DomainRecognizeConfig(C1697810uHb.LJIIJJI(new ConfigItem("tt_first_full_domain_list", "tt_1st"), new ConfigItem("bd_first_full_domain_list", "bd_1st"), new ConfigItem("tt_first_second_level_domain_list", "tt_1st"), new ConfigItem("bd_first_second_level_domain_list", "bd_1st"), new ConfigItem("tt_3_second_level_domain_list", "tt_3rd")), "bd_3rd", 100);
    public static LruCache<String, String> lruCache = new LruCache<>(domainConfigs.cacheSize);
    public static ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    public static final ConcurrentHashMap<String, Boolean> cdnDomainCache = new ConcurrentHashMap<>();

    public static final String domainIdentityRecognize(String str) {
        Object c098200Yq;
        ReentrantReadWriteLock.ReadLock lock;
        String str2;
        int readHoldCount;
        try {
            lock = rwLock.readLock();
            lock.lock();
            try {
                str2 = lruCache.get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                lock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (str2 != null) {
            lock.unlock();
            return str2;
        }
        lock.unlock();
        for (ConfigItem configItem : domainConfigs.list) {
            Boolean boolIsInNameList = RuleEngineService.isInNameList(str, configItem.key);
            if (boolIsInNameList != null) {
                if (boolIsInNameList.booleanValue()) {
                    ReentrantReadWriteLock reentrantReadWriteLock = rwLock;
                    ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
                    int i = 0;
                    if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                        readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                    } else {
                        readHoldCount = 0;
                    }
                    for (int i2 = 0; i2 < readHoldCount; i2++) {
                        lock2.unlock();
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        lruCache.put(str, configItem.value);
                        while (i < readHoldCount) {
                            lock2.lock();
                            i++;
                        }
                        writeLock.unlock();
                        return configItem.value;
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        while (i < readHoldCount) {
                            lock2.lock();
                            i++;
                        }
                        writeLock.unlock();
                        throw th3;
                    }
                }
            } else {
                return null;
            }
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
        return domainConfigs.defaultValue;
    }

    public final void init(DomainRecognizeConfig domainRecognizeConfig) {
        Object c098200Yq;
        int readHoldCount;
        if (domainRecognizeConfig != null) {
            try {
                domainConfigs = domainRecognizeConfig;
                ReentrantReadWriteLock reentrantReadWriteLock = rwLock;
                ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                int i = 0;
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                    for (int i2 = 0; i2 < readHoldCount; i2++) {
                        lock.unlock();
                    }
                } else {
                    readHoldCount = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    int iMaxSize = lruCache.maxSize();
                    int i3 = domainRecognizeConfig.cacheSize;
                    if (iMaxSize != i3) {
                        lruCache.resize(i3);
                    }
                    while (i < readHoldCount) {
                        lock.lock();
                        i++;
                    }
                    writeLock.unlock();
                    c098200Yq = Unit.LIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    while (i < readHoldCount) {
                        lock.lock();
                        i++;
                    }
                    writeLock.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        } else {
            c098200Yq = null;
        }
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }

    public final boolean isCdn(String str, String str2) {
        Object c098200Yq;
        NetworkConfig networkConfigNetworkConfigOrNull;
        ConcurrentHashMap<String, Boolean> concurrentHashMap;
        try {
            networkConfigNetworkConfigOrNull = NetworkComponent.INSTANCE.networkConfigOrNull();
            if (networkConfigNetworkConfigOrNull == null) {
                networkConfigNetworkConfigOrNull = new NetworkConfig(false, false, 0L, 0L, null, null, null, null, null, 0L, 0.0d, null, null, null, 0.0d, false, false, 0.0d, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, 0.0d, null, null, false, -1, 63, null);
            }
            Set<String> set = networkConfigNetworkConfigOrNull.cdnPathList;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (u.LJJIIJZLJL(str2, (String) it2.next(), false)) {
                        return true;
                    }
                }
            }
            concurrentHashMap = cdnDomainCache;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (concurrentHashMap.containsKey(str)) {
            Boolean bool = concurrentHashMap.get(str);
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }
        Iterator<T> it3 = networkConfigNetworkConfigOrNull.cdnDomainList.iterator();
        while (it3.hasNext()) {
            if (u.LJIIZILJ(str, (String) it3.next(), false)) {
                cdnDomainCache.put(str, Boolean.TRUE);
                return true;
            }
        }
        cdnDomainCache.put(str, Boolean.FALSE);
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
        return false;
    }
}
