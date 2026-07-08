package com.ttnet.org.chromium.net.urlconnection;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes24.dex */
public final class Segment {
    public static int sSize = 32768;
    public static boolean sSizeInited;
    public static final ReentrantReadWriteLock sSizeLock = new ReentrantReadWriteLock();
    public ByteBuffer bb;
    public boolean bufferFlipped;
    public Segment next;
    public Segment prev;

    public static int getSize() {
        ReentrantReadWriteLock reentrantReadWriteLock = sSizeLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            sSizeInited = true;
            int i = sSize;
            reentrantReadWriteLock.readLock().unlock();
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sSizeLock.readLock().unlock();
            throw th;
        }
    }

    public void completeRead() {
        this.bb.flip();
        this.bufferFlipped = true;
    }

    public ByteBuffer getInnerBuffer() {
        if (this.bb == null) {
            this.bb = ByteBuffer.allocateDirect(getSize());
        }
        return this.bb;
    }

    public boolean isWritable() {
        return !this.bufferFlipped && this.bb.hasRemaining();
    }

    public Segment pop() {
        Segment segment = this.next;
        Segment segment2 = segment != this ? segment : null;
        Segment segment3 = this.prev;
        segment3.next = segment;
        this.next.prev = segment3;
        this.next = null;
        this.prev = null;
        return segment2;
    }

    public Segment release() {
        this.bb.clear();
        this.bufferFlipped = false;
        Segment segmentPop = pop();
        if (!SegmentPool.recycle(this)) {
            this.bb = null;
        }
        return segmentPop;
    }

    public Segment() {
        getInnerBuffer();
    }

    public static void setSize(int i) {
        if (sSizeInited) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = sSizeLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!sSizeInited) {
                sSizeInited = true;
                sSize = i;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sSizeLock.writeLock().unlock();
            throw th;
        }
    }

    public Segment push(Segment segment) {
        segment.prev = this;
        segment.next = this.next;
        this.next.prev = segment;
        this.next = segment;
        return segment;
    }

    public int getInnerBufferTo(byte[] bArr, int i, int i2) {
        if (!this.bufferFlipped) {
            return -1;
        }
        int iMin = Math.min(this.bb.remaining(), i2);
        this.bb.get(bArr, i, iMin);
        return iMin;
    }
}
