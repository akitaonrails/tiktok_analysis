package com.ttnet.org.chromium.net.urlconnection;

import X.C1496600p34;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes24.dex */
public final class SegmentPool {
    public static long byteCount = 0;
    public static Segment next = null;
    public static long sMaxSize = 262144;
    public static boolean sSizeInited;
    public static final ReentrantReadWriteLock sSizeLock = new ReentrantReadWriteLock();
    public static final AtomicLong segmentAllocateTimes = new AtomicLong(0);
    public static final AtomicLong segmentReuseTimes = new AtomicLong(0);
    public static final AtomicLong segmentRequestTimes = new AtomicLong(0);

    public static long getSize() {
        ReentrantReadWriteLock reentrantReadWriteLock = sSizeLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            sSizeInited = true;
            long j = sMaxSize;
            reentrantReadWriteLock.readLock().unlock();
            return j;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sSizeLock.readLock().unlock();
            throw th;
        }
    }

    public static Segment take() {
        synchronized (SegmentPool.class) {
            try {
                if (C1496600p34.LIZ()) {
                    segmentRequestTimes.incrementAndGet();
                }
                if (next != null) {
                    if (C1496600p34.LIZ()) {
                        segmentReuseTimes.incrementAndGet();
                    }
                    Segment segment = next;
                    next = segment.next;
                    segment.next = null;
                    byteCount -= (long) Segment.getSize();
                    return segment;
                }
                if (C1496600p34.LIZ()) {
                    AtomicLong atomicLong = segmentAllocateTimes;
                    atomicLong.incrementAndGet();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("state: ");
                    sbLIZ.append(segmentRequestTimes.get());
                    sbLIZ.append(" ");
                    sbLIZ.append(atomicLong);
                    sbLIZ.append(" ");
                    sbLIZ.append(segmentReuseTimes);
                    sbLIZ.append(" ");
                    sbLIZ.append(r1.get() / r2.get());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                return new Segment();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean recycle(Segment segment) {
        if (segment.next == null && segment.prev == null) {
            synchronized (SegmentPool.class) {
                try {
                    if (byteCount + ((long) Segment.getSize()) > getSize()) {
                        return false;
                    }
                    byteCount += (long) Segment.getSize();
                    segment.next = next;
                    next = segment;
                    return true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public static void setSize(long j) {
        if (sSizeInited) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = sSizeLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!sSizeInited) {
                sSizeInited = true;
                sMaxSize = j;
            }
            sSizeInited = true;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sSizeLock.writeLock().unlock();
            throw th;
        }
    }
}
