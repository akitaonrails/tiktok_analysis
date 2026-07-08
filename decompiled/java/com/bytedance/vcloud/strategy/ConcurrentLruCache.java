package com.bytedance.vcloud.strategy;

import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes24.dex */
public class ConcurrentLruCache<K, V> {
    public final LruCache<K, V> cache;
    public final ReadWriteLock lock = new ReentrantReadWriteLock();

    public void evictAll() {
        this.lock.writeLock().lock();
        try {
            this.cache.evictAll();
            this.lock.writeLock().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.writeLock().unlock();
            throw th;
        }
    }

    public int maxSize() {
        this.lock.readLock().lock();
        try {
            int iMaxSize = this.cache.maxSize();
            this.lock.readLock().unlock();
            return iMaxSize;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.readLock().unlock();
            throw th;
        }
    }

    public int size() {
        this.lock.readLock().lock();
        try {
            int size = this.cache.size();
            this.lock.readLock().unlock();
            return size;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.readLock().unlock();
            throw th;
        }
    }

    public ConcurrentLruCache(int i) {
        this.cache = new LruCache<>(i);
    }

    public boolean containsKey(K k) {
        boolean z;
        this.lock.readLock().lock();
        try {
            if (this.cache.get(k) != null) {
                z = true;
            } else {
                z = false;
            }
            this.lock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.readLock().unlock();
            throw th;
        }
    }

    public V get(K k) {
        this.lock.readLock().lock();
        try {
            V v = this.cache.get(k);
            this.lock.readLock().unlock();
            return v;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.readLock().unlock();
            throw th;
        }
    }

    public V remove(K k) {
        this.lock.writeLock().lock();
        try {
            V vRemove = this.cache.remove(k);
            this.lock.writeLock().unlock();
            return vRemove;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.writeLock().unlock();
            throw th;
        }
    }

    public V put(K k, V v) {
        this.lock.writeLock().lock();
        try {
            V vPut = this.cache.put(k, v);
            this.lock.writeLock().unlock();
            return vPut;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.writeLock().unlock();
            throw th;
        }
    }
}
