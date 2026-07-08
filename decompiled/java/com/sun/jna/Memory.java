package com.sun.jna;

import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.sun.jna.internal.Cleaner;
import java.io.Closeable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes31.dex */
public class Memory extends Pointer implements Closeable {
    public static final Map<Long, Reference<Memory>> allocatedMemory = new ConcurrentHashMap();
    public static final WeakMemoryHolder buffers = new WeakMemoryHolder();
    public final Cleaner.Cleanable cleanable;
    public long size;

    public class SharedMemory extends Memory {
        @Override // com.sun.jna.Memory
        public synchronized void dispose() {
            this.peer = 0L;
        }

        @Override // com.sun.jna.Memory, com.sun.jna.Pointer
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(super.toString());
            sbLIZ.append(" (shared from ");
            sbLIZ.append(Memory.this.toString());
            sbLIZ.append(")");
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // com.sun.jna.Memory
        public void boundsCheck(long j, long j2) {
            Memory memory = Memory.this;
            memory.boundsCheck((this.peer - memory.peer) + j, j2);
        }

        public SharedMemory(long j, long j2) {
            this.size = j2;
            this.peer = Memory.this.peer + j;
        }
    }

    public static void disposeAll() {
        Iterator it2 = new ArrayList(allocatedMemory.values()).iterator();
        while (it2.hasNext()) {
            Memory memory = (Memory) ((Reference) it2.next()).get();
            if (memory != null) {
                memory.close();
            }
        }
    }

    public static void purge() {
        buffers.clean();
    }

    public void clear() {
        clear(this.size);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.peer = 0L;
        Cleaner.Cleanable cleanable = this.cleanable;
        if (cleanable != null) {
            cleanable.clean();
        }
    }

    public boolean valid() {
        return this.peer != 0;
    }

    public String dump() {
        return dump(0L, (int) size());
    }

    @Override // com.sun.jna.Pointer
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("allocated@0x");
        sbLIZ.append(Long.toHexString(this.peer));
        sbLIZ.append(" (");
        sbLIZ.append(this.size);
        sbLIZ.append(" bytes)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Memory() {
    }

    public void dispose() {
        close();
    }

    public long size() {
        return this.size;
    }

    /* JADX INFO: loaded from: classes13.dex */
    public static final class MemoryDisposer implements Runnable {
        public long peer;

        public synchronized void com_sun_jna_Memory$MemoryDisposer__run$___twin___() {
            try {
                Memory.free(this.peer);
                Memory.allocatedMemory.remove(Long.valueOf(this.peer));
                this.peer = 0L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Memory.allocatedMemory.remove(Long.valueOf(this.peer));
                this.peer = 0L;
                throw th;
            }
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            C1C7U.LIZ("Memory$MemoryDisposer@1cde.run");
            com_sun_jna_Memory$MemoryDisposer_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("Memory$MemoryDisposer@1cde.run");
        }

        public MemoryDisposer(long j) {
            this.peer = j;
        }

        public static void com_sun_jna_Memory$MemoryDisposer_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(MemoryDisposer memoryDisposer) {
            try {
                memoryDisposer.com_sun_jna_Memory$MemoryDisposer__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    }

    public Memory(long j) {
        this.size = j;
        if (j > 0) {
            long jMalloc = Native.malloc(j);
            this.peer = jMalloc;
            if (jMalloc != 0) {
                allocatedMemory.put(Long.valueOf(jMalloc), new WeakReference(this));
                this.cleanable = Cleaner.getCleaner().register(this, new MemoryDisposer(this.peer));
                return;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cannot allocate ");
                sbLIZ.append(j);
                sbLIZ.append(" bytes");
                throw new OutOfMemoryError(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        throw new IllegalArgumentException("Allocation size must be greater than zero");
    }

    public static void free(long j) {
        if (j != 0) {
            Native.free(j);
        }
    }

    public static long malloc(long j) {
        return Native.malloc(j);
    }

    private Pointer shareReferenceIfInBounds(Pointer pointer) {
        if (pointer == null) {
            return null;
        }
        long j = pointer.peer - this.peer;
        if (j >= 0 && j < this.size) {
            return share(j);
        }
        return pointer;
    }

    public Memory align(int i) {
        if (i > 0) {
            int i2 = 0;
            while (i != (1 << i2)) {
                i2++;
                if (i2 >= 32) {
                    throw new IllegalArgumentException("Byte boundary must be a power of two");
                }
            }
            long j = i;
            long j2 = ~(j - 1);
            long j3 = this.peer;
            if ((j3 & j2) != j3) {
                long j4 = ((j + j3) - 1) & j2;
                long j5 = (this.size + j3) - j4;
                if (j5 > 0) {
                    return (Memory) share(j4 - j3, j5);
                }
                throw new IllegalArgumentException("Insufficient memory to align to the requested boundary");
            }
            return this;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Byte boundary must be positive: ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.sun.jna.Pointer
    public byte getByte(long j) {
        boundsCheck(j, 1L);
        return super.getByte(j);
    }

    @Override // com.sun.jna.Pointer
    public char getChar(long j) {
        boundsCheck(j, Native.WCHAR_SIZE);
        return super.getChar(j);
    }

    @Override // com.sun.jna.Pointer
    public double getDouble(long j) {
        boundsCheck(j, 8L);
        return super.getDouble(j);
    }

    @Override // com.sun.jna.Pointer
    public float getFloat(long j) {
        boundsCheck(j, 4L);
        return super.getFloat(j);
    }

    @Override // com.sun.jna.Pointer
    public int getInt(long j) {
        boundsCheck(j, 4L);
        return super.getInt(j);
    }

    @Override // com.sun.jna.Pointer
    public long getLong(long j) {
        boundsCheck(j, 8L);
        return super.getLong(j);
    }

    @Override // com.sun.jna.Pointer
    public Pointer getPointer(long j) {
        boundsCheck(j, Native.POINTER_SIZE);
        return shareReferenceIfInBounds(super.getPointer(j));
    }

    @Override // com.sun.jna.Pointer
    public short getShort(long j) {
        boundsCheck(j, 2L);
        return super.getShort(j);
    }

    @Override // com.sun.jna.Pointer
    public String getWideString(long j) {
        boundsCheck(j, 0L);
        return super.getWideString(j);
    }

    @Override // com.sun.jna.Pointer
    public Pointer share(long j) {
        return share(j, size() - j);
    }

    public void boundsCheck(long j, long j2) {
        if (j >= 0) {
            long j3 = j + j2;
            if (j3 <= this.size) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Bounds exceeds available space : size=");
            sbLIZ.append(this.size);
            sbLIZ.append(", offset=");
            sbLIZ.append(j3);
            throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Invalid offset: ");
        sbLIZ2.append(j);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.sun.jna.Pointer
    public ByteBuffer getByteBuffer(long j, long j2) {
        boundsCheck(j, j2);
        ByteBuffer byteBuffer = super.getByteBuffer(j, j2);
        buffers.put(byteBuffer, this);
        return byteBuffer;
    }

    @Override // com.sun.jna.Pointer
    public String getString(long j, String str) {
        boundsCheck(j, 0L);
        return super.getString(j, str);
    }

    @Override // com.sun.jna.Pointer
    public void setByte(long j, byte b) {
        boundsCheck(j, 1L);
        super.setByte(j, b);
    }

    @Override // com.sun.jna.Pointer
    public void setChar(long j, char c) {
        boundsCheck(j, Native.WCHAR_SIZE);
        super.setChar(j, c);
    }

    @Override // com.sun.jna.Pointer
    public void setDouble(long j, double d) {
        boundsCheck(j, 8L);
        super.setDouble(j, d);
    }

    @Override // com.sun.jna.Pointer
    public void setFloat(long j, float f) {
        boundsCheck(j, 4L);
        super.setFloat(j, f);
    }

    @Override // com.sun.jna.Pointer
    public void setInt(long j, int i) {
        boundsCheck(j, 4L);
        super.setInt(j, i);
    }

    @Override // com.sun.jna.Pointer
    public void setLong(long j, long j2) {
        boundsCheck(j, 8L);
        super.setLong(j, j2);
    }

    @Override // com.sun.jna.Pointer
    public void setPointer(long j, Pointer pointer) {
        boundsCheck(j, Native.POINTER_SIZE);
        super.setPointer(j, pointer);
    }

    @Override // com.sun.jna.Pointer
    public void setShort(long j, short s) {
        boundsCheck(j, 2L);
        super.setShort(j, s);
    }

    @Override // com.sun.jna.Pointer
    public void setWideString(long j, String str) {
        boundsCheck(j, (((long) str.length()) + 1) * ((long) Native.WCHAR_SIZE));
        super.setWideString(j, str);
    }

    @Override // com.sun.jna.Pointer
    public Pointer share(long j, long j2) {
        boundsCheck(j, j2);
        return new SharedMemory(j, j2);
    }

    @Override // com.sun.jna.Pointer
    public void setString(long j, String str, String str2) {
        boundsCheck(j, ((long) Native.getBytes(str, str2).length) + 1);
        super.setString(j, str, str2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, byte[] bArr, int i, int i2) {
        boundsCheck(j, ((long) i2) * 1);
        super.read(j, bArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, byte[] bArr, int i, int i2) {
        boundsCheck(j, ((long) i2) * 1);
        super.write(j, bArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, char[] cArr, int i, int i2) {
        boundsCheck(j, Native.WCHAR_SIZE * i2);
        super.read(j, cArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, char[] cArr, int i, int i2) {
        boundsCheck(j, Native.WCHAR_SIZE * i2);
        super.write(j, cArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, double[] dArr, int i, int i2) {
        boundsCheck(j, ((long) i2) * 8);
        super.read(j, dArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, double[] dArr, int i, int i2) {
        boundsCheck(j, ((long) i2) * 8);
        super.write(j, dArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, float[] fArr, int i, int i2) {
        boundsCheck(j, ((long) i2) * 4);
        super.read(j, fArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, float[] fArr, int i, int i2) {
        boundsCheck(j, ((long) i2) * 4);
        super.write(j, fArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, int[] iArr, int i, int i2) {
        boundsCheck(j, ((long) i2) * 4);
        super.read(j, iArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, int[] iArr, int i, int i2) {
        boundsCheck(j, ((long) i2) * 4);
        super.write(j, iArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, long[] jArr, int i, int i2) {
        boundsCheck(j, ((long) i2) * 8);
        super.read(j, jArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, long[] jArr, int i, int i2) {
        boundsCheck(j, ((long) i2) * 8);
        super.write(j, jArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, Pointer[] pointerArr, int i, int i2) {
        boundsCheck(j, Native.POINTER_SIZE * i2);
        super.read(j, pointerArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, Pointer[] pointerArr, int i, int i2) {
        boundsCheck(j, Native.POINTER_SIZE * i2);
        super.write(j, pointerArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, short[] sArr, int i, int i2) {
        boundsCheck(j, ((long) i2) * 2);
        super.read(j, sArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, short[] sArr, int i, int i2) {
        boundsCheck(j, ((long) i2) * 2);
        super.write(j, sArr, i, i2);
    }
}
