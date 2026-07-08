package cs.bd.o;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class m {

    public static final class a<A, B> {
        public final A LIZ;
        public final B LIZIZ;

        public a(A a, B b) {
            this.LIZ = a;
            this.LIZIZ = b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            A a = this.LIZ;
            if (a == null) {
                if (aVar.LIZ != null) {
                    return false;
                }
            } else if (!a.equals(aVar.LIZ)) {
                return false;
            }
            B b = this.LIZIZ;
            B b2 = aVar.LIZIZ;
            return b == null ? b2 == null : b.equals(b2);
        }

        public final int hashCode() {
            A a = this.LIZ;
            int iHashCode = ((a == null ? 0 : a.hashCode()) + 31) * 31;
            B b = this.LIZIZ;
            return iHashCode + (b != null ? b.hashCode() : 0);
        }
    }

    public static class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public static a<ByteBuffer, Long> LIZ(FileChannel fileChannel) throws b, IOException {
        long size = fileChannel.size();
        if (size >= 22) {
            long j = size - 22;
            long jMin = Math.min(j, 65535L);
            int i = 0;
            while (true) {
                long j2 = i;
                if (j2 <= jMin) {
                    long j3 = j - j2;
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                    fileChannel.position(j3);
                    fileChannel.read(byteBufferAllocate);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    byteBufferAllocate.order(byteOrder);
                    if (byteBufferAllocate.getInt(0) == 101010256) {
                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(2);
                        fileChannel.position(j3 + 20);
                        fileChannel.read(byteBufferAllocate2);
                        byteBufferAllocate2.order(byteOrder);
                        short s = byteBufferAllocate2.getShort(0);
                        if (s == i) {
                            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(4);
                            byteBufferAllocate3.order(byteOrder);
                            fileChannel.position((fileChannel.size() - ((long) s)) - 6);
                            fileChannel.read(byteBufferAllocate3);
                            long j4 = byteBufferAllocate3.getInt(0);
                            if (j4 >= 32) {
                                fileChannel.position(j4 - 24);
                                ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(24);
                                fileChannel.read(byteBufferAllocate4);
                                byteBufferAllocate4.order(byteOrder);
                                if (byteBufferAllocate4.getLong(8) == 2334950737559900225L && byteBufferAllocate4.getLong(16) == 3617552046287187010L) {
                                    long j5 = byteBufferAllocate4.getLong(0);
                                    if (j5 >= byteBufferAllocate4.capacity() && j5 <= 2147483639) {
                                        int i2 = (int) (8 + j5);
                                        long j6 = j4 - ((long) i2);
                                        if (j6 >= 0) {
                                            fileChannel.position(j6);
                                            ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(i2);
                                            fileChannel.read(byteBufferAllocate5);
                                            byteBufferAllocate5.order(byteOrder);
                                            if (byteBufferAllocate5.getLong(0) == j5) {
                                                return new a<>(byteBufferAllocate5, Long.valueOf(j6));
                                            }
                                            return null;
                                        }
                                        return null;
                                    }
                                    return null;
                                }
                                return null;
                            }
                            throw new b("9");
                        }
                    }
                    i++;
                } else {
                    throw new IOException("10");
                }
            }
        } else {
            throw new IOException("11");
        }
    }

    public static Map<Integer, String> LIZIZ(String str) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap map = new HashMap();
        try {
            randomAccessFile = new RandomAccessFile(str, "r");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            a<ByteBuffer, Long> aVarLIZ = LIZ(randomAccessFile.getChannel());
            if (aVarLIZ != null) {
                for (Map.Entry entry : ((LinkedHashMap) LIZJ(aVarLIZ.LIZ)).entrySet()) {
                    if (entry != null && entry.getKey() != null && ((Integer) entry.getKey()).intValue() != 1896449818) {
                        try {
                            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
                            byte[] bArrArray = byteBuffer.array();
                            int iArrayOffset = byteBuffer.arrayOffset();
                            map.put(entry.getKey(), new String(Arrays.copyOfRange(bArrArray, byteBuffer.position() + iArrayOffset, iArrayOffset + byteBuffer.limit())));
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile = randomAccessFile2;
            }
            return map;
        }
        try {
            randomAccessFile.close();
            return map;
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            return map;
        }
    }

    public static Map<Integer, ByteBuffer> LIZJ(ByteBuffer byteBuffer) throws b {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            int iCapacity = byteBuffer.capacity() - 24;
            if (iCapacity >= 8) {
                byteBuffer.capacity();
                if (iCapacity <= byteBuffer.capacity()) {
                    int iLimit = byteBuffer.limit();
                    int iPosition = byteBuffer.position();
                    try {
                        byteBuffer.position(0);
                        byteBuffer.limit(iCapacity);
                        byteBuffer.position(8);
                        ByteBuffer byteBufferSlice = byteBuffer.slice();
                        byteBufferSlice.order(byteBuffer.order());
                        byteBuffer.position(0);
                        byteBuffer.limit(iLimit);
                        byteBuffer.position(iPosition);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        while (byteBufferSlice.hasRemaining()) {
                            if (byteBufferSlice.remaining() >= 8) {
                                long j = byteBufferSlice.getLong();
                                if (j >= 4 && j <= 2147483647L) {
                                    int i = (int) j;
                                    int iPosition2 = byteBufferSlice.position() + i;
                                    if (i <= byteBufferSlice.remaining()) {
                                        Integer numValueOf = Integer.valueOf(byteBufferSlice.getInt());
                                        int i2 = i - 4;
                                        if (i2 >= 0) {
                                            int iLimit2 = byteBufferSlice.limit();
                                            int iPosition3 = byteBufferSlice.position();
                                            int i3 = i2 + iPosition3;
                                            if (i3 >= iPosition3 && i3 <= iLimit2) {
                                                byteBufferSlice.limit(i3);
                                                try {
                                                    ByteBuffer byteBufferSlice2 = byteBufferSlice.slice();
                                                    byteBufferSlice2.order(byteBufferSlice.order());
                                                    byteBufferSlice.position(i3);
                                                    byteBufferSlice.limit(iLimit2);
                                                    linkedHashMap.put(numValueOf, byteBufferSlice2);
                                                    byteBufferSlice.position(iPosition2);
                                                } catch (Throwable th) {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    byteBufferSlice.limit(iLimit2);
                                                    throw th;
                                                }
                                            } else {
                                                throw new BufferUnderflowException();
                                            }
                                        } else {
                                            throw new IllegalArgumentException("2");
                                        }
                                    } else {
                                        throw new b("8");
                                    }
                                } else {
                                    throw new b("7");
                                }
                            } else {
                                throw new b("6");
                            }
                        }
                        return linkedHashMap;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        byteBuffer.position(0);
                        byteBuffer.limit(iLimit);
                        byteBuffer.position(iPosition);
                        throw th2;
                    }
                }
                throw new IllegalArgumentException("5");
            }
            throw new IllegalArgumentException("4");
        }
        throw new IllegalArgumentException("1");
    }
}
