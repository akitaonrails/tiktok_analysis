package com.facebook.imagepipeline.memory;

import X.C1322210kVn;
import X.C1322350kW1;
import X.C1330490kj9;
import X.InterfaceC1329110kgv;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class NativeMemoryChunk implements InterfaceC1329110kgv, Closeable {
    public boolean mIsClosed;
    public final long mNativePtr;
    public final int mSize;

    public static native long nativeAllocate(int i);

    public static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    public static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    public static native void nativeFree(long j);

    public static native void nativeMemcpy(long j, long j2, int i);

    public static native byte nativeReadByte(long j);

    @Override // X.InterfaceC1329110kgv, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.mIsClosed) {
            this.mIsClosed = true;
            nativeFree(this.mNativePtr);
        }
    }

    @Override // X.InterfaceC1329110kgv
    public ByteBuffer getByteBuffer() {
        return null;
    }

    @Override // X.InterfaceC1329110kgv
    public synchronized boolean isClosed() {
        return this.mIsClosed;
    }

    static {
        C1322210kVn.LIZIZ("imagepipeline");
    }

    public NativeMemoryChunk() {
        this.mIsClosed = true;
    }

    public void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        try {
            close();
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    @Override // X.InterfaceC1329110kgv
    public long getNativePtr() {
        return this.mNativePtr;
    }

    @Override // X.InterfaceC1329110kgv
    public int getSize() {
        return this.mSize;
    }

    @Override // X.InterfaceC1329110kgv
    public long getUniqueId() {
        return this.mNativePtr;
    }

    public NativeMemoryChunk(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        this.mSize = i;
        this.mNativePtr = nativeAllocate(i);
        this.mIsClosed = false;
    }

    @Override // X.InterfaceC1329110kgv
    public synchronized byte read(int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LJFF(z);
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1322350kW1.LIZIZ(z2);
        if (i >= this.mSize) {
            z3 = false;
        }
        C1322350kW1.LIZIZ(z3);
        return nativeReadByte(this.mNativePtr + ((long) i));
    }

    private void doCopy(int i, InterfaceC1329110kgv interfaceC1329110kgv, int i2, int i3) {
        if (interfaceC1329110kgv instanceof NativeMemoryChunk) {
            C1322350kW1.LJFF(!isClosed());
            C1322350kW1.LJFF(!interfaceC1329110kgv.isClosed());
            C1330490kj9.LIZ(i, interfaceC1329110kgv.getSize(), i2, i3, this.mSize);
            nativeMemcpy(interfaceC1329110kgv.getNativePtr() + ((long) i2), this.mNativePtr + ((long) i), i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        throw r0;
     */
    @Override // X.InterfaceC1329110kgv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void copy(int r6, X.InterfaceC1329110kgv r7, int r8, int r9) {
        /*
            r5 = this;
            r7.getClass()
            long r3 = r7.getUniqueId()
            long r1 = r5.getUniqueId()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            r0 = 0
            X.C1322350kW1.LIZIZ(r0)
        L13:
            long r3 = r7.getUniqueId()
            long r1 = r5.getUniqueId()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L33
            monitor-enter(r7)
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L2d
            r5.doCopy(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2d
            return
        L27:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L2d
        L2d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2d
            throw r0
        L33:
            monitor-enter(r5)
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L41
            r5.doCopy(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L41
            return
        L3b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.Throwable -> L41
        L41:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L41
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.NativeMemoryChunk.copy(int, X.0kgv, int, int):void");
    }

    @Override // X.InterfaceC1329110kgv
    public synchronized int read(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int iMin;
        bArr.getClass();
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LJFF(z);
        iMin = Math.min(Math.max(0, this.mSize - i), i3);
        C1330490kj9.LIZ(i, bArr.length, i2, iMin, this.mSize);
        nativeCopyToByteArray(this.mNativePtr + ((long) i), bArr, i2, iMin);
        return iMin;
    }

    @Override // X.InterfaceC1329110kgv
    public synchronized int write(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int iMin;
        bArr.getClass();
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LJFF(z);
        iMin = Math.min(Math.max(0, this.mSize - i), i3);
        C1330490kj9.LIZ(i, bArr.length, i2, iMin, this.mSize);
        nativeCopyFromByteArray(this.mNativePtr + ((long) i), bArr, i2, iMin);
        return iMin;
    }
}
