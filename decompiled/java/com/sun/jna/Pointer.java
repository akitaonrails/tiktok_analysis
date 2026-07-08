package com.sun.jna;

import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.sun.jna.Structure;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes31.dex */
public class Pointer {
    public static final Pointer NULL = null;
    public long peer;

    public static class Opaque extends Pointer {
        public final String MSG;

        @Override // com.sun.jna.Pointer
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("const@0x");
            sbLIZ.append(Long.toHexString(this.peer));
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Opaque(long j) {
            super(j);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("This pointer is opaque: ");
            sbLIZ.append(this);
            this.MSG = C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // com.sun.jna.Pointer
        public void clear(long j) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public byte getByte(long j) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public char getChar(long j) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public double getDouble(long j) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public float getFloat(long j) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public int getInt(long j) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public long getLong(long j) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public Pointer getPointer(long j) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public short getShort(long j) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public String getWideString(long j) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public String dump(long j, int i) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public ByteBuffer getByteBuffer(long j, long j2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public String getString(long j, String str) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public long indexOf(long j, byte b) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setByte(long j, byte b) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setChar(long j, char c) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setDouble(long j, double d) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setFloat(long j, float f) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setInt(long j, int i) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setLong(long j, long j2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setPointer(long j, Pointer pointer) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setShort(long j, short s) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setWideString(long j, String str) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public Pointer share(long j, long j2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setMemory(long j, long j2, byte b) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setString(long j, String str, String str2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, char[] cArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, char[] cArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, double[] dArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, double[] dArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, float[] fArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, float[] fArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, int[] iArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, int[] iArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, long[] jArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, long[] jArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, Pointer[] pointerArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, Pointer[] pointerArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, short[] sArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, short[] sArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }
    }

    public int hashCode() {
        long j = this.peer;
        return (int) ((j >>> 32) + (j & 4294967295L));
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("native@0x");
        sbLIZ.append(Long.toHexString(this.peer));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Pointer() {
    }

    public Pointer(long j) {
        this.peer = j;
    }

    public static final Pointer createConstant(int i) {
        return new Opaque(((long) i) & 4294967295L);
    }

    public static long nativeValue(Pointer pointer) {
        if (pointer == null) {
            return 0L;
        }
        return pointer.peer;
    }

    public void clear(long j) {
        setMemory(0L, j, (byte) 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof Pointer) && ((Pointer) obj).peer == this.peer) {
            return true;
        }
        return false;
    }

    public byte getByte(long j) {
        return Native.getByte(this, this.peer, j);
    }

    public char getChar(long j) {
        return Native.getChar(this, this.peer, j);
    }

    public double getDouble(long j) {
        return Native.getDouble(this, this.peer, j);
    }

    public float getFloat(long j) {
        return Native.getFloat(this, this.peer, j);
    }

    public int getInt(long j) {
        return Native.getInt(this, this.peer, j);
    }

    public long getLong(long j) {
        return Native.getLong(this, this.peer, j);
    }

    public NativeLong getNativeLong(long j) {
        long j2;
        if (NativeLong.SIZE == 8) {
            j2 = getLong(j);
        } else {
            j2 = getInt(j);
        }
        return new NativeLong(j2);
    }

    public Pointer getPointer(long j) {
        return Native.getPointer(this.peer + j);
    }

    public Pointer[] getPointerArray(long j) {
        ArrayList arrayList = new ArrayList();
        Pointer pointer = getPointer(j);
        int i = 0;
        while (pointer != null) {
            arrayList.add(pointer);
            i += Native.POINTER_SIZE;
            pointer = getPointer(((long) i) + j);
        }
        return (Pointer[]) arrayList.toArray(new Pointer[0]);
    }

    public short getShort(long j) {
        return Native.getShort(this, this.peer, j);
    }

    public String getString(long j) {
        return getString(j, Native.getDefaultStringEncoding());
    }

    public String[] getStringArray(long j) {
        return getStringArray(j, -1, Native.getDefaultStringEncoding());
    }

    public String getWideString(long j) {
        return Native.getWideString(this, this.peer, j);
    }

    public String[] getWideStringArray(long j) {
        return getWideStringArray(j, -1);
    }

    public Pointer share(long j) {
        return share(j, 0L);
    }

    public static final Pointer createConstant(long j) {
        return new Opaque(j);
    }

    public static void nativeValue(Pointer pointer, long j) {
        pointer.peer = j;
    }

    public String dump(long j, int i) {
        StringWriter stringWriter = new StringWriter(13 + (i * 2) + ((i / 4) * 4));
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println("memory dump");
        for (int i2 = 0; i2 < i; i2++) {
            byte b = getByte(((long) i2) + j);
            int i3 = i2 % 4;
            if (i3 == 0) {
                printWriter.print(e3.e);
            }
            if (b >= 0 && b < 16) {
                printWriter.print(CardStruct.IStatusCode.DEFAULT);
            }
            printWriter.print(Integer.toHexString(b & 255));
            if (i3 == 3 && i2 < i - 1) {
                printWriter.println(e3.f);
            }
        }
        if (stringWriter.getBuffer().charAt(stringWriter.getBuffer().length() - 2) != ']') {
            printWriter.println(e3.f);
        }
        return stringWriter.toString();
    }

    public byte[] getByteArray(long j, int i) {
        byte[] bArr = new byte[i];
        read(j, bArr, 0, i);
        return bArr;
    }

    public ByteBuffer getByteBuffer(long j, long j2) {
        return Native.getDirectByteBuffer(this, this.peer, j, j2).order(ByteOrder.nativeOrder());
    }

    public char[] getCharArray(long j, int i) {
        char[] cArr = new char[i];
        read(j, cArr, 0, i);
        return cArr;
    }

    public double[] getDoubleArray(long j, int i) {
        double[] dArr = new double[i];
        read(j, dArr, 0, i);
        return dArr;
    }

    public float[] getFloatArray(long j, int i) {
        float[] fArr = new float[i];
        read(j, fArr, 0, i);
        return fArr;
    }

    public int[] getIntArray(long j, int i) {
        int[] iArr = new int[i];
        read(j, iArr, 0, i);
        return iArr;
    }

    public long[] getLongArray(long j, int i) {
        long[] jArr = new long[i];
        read(j, jArr, 0, i);
        return jArr;
    }

    public Pointer[] getPointerArray(long j, int i) {
        Pointer[] pointerArr = new Pointer[i];
        read(j, pointerArr, 0, i);
        return pointerArr;
    }

    public short[] getShortArray(long j, int i) {
        short[] sArr = new short[i];
        read(j, sArr, 0, i);
        return sArr;
    }

    public String getString(long j, String str) {
        return Native.getString(this, j, str);
    }

    public String[] getStringArray(long j, int i) {
        return getStringArray(j, i, Native.getDefaultStringEncoding());
    }

    public String[] getWideStringArray(long j, int i) {
        return getStringArray(j, i, "--WIDE-STRING--");
    }

    public long indexOf(long j, byte b) {
        return Native.indexOf(this, this.peer, j, b);
    }

    public void setByte(long j, byte b) {
        Native.setByte(this, this.peer, j, b);
    }

    public void setChar(long j, char c) {
        Native.setChar(this, this.peer, j, c);
    }

    public void setDouble(long j, double d) {
        Native.setDouble(this, this.peer, j, d);
    }

    public void setFloat(long j, float f) {
        Native.setFloat(this, this.peer, j, f);
    }

    public void setInt(long j, int i) {
        Native.setInt(this, this.peer, j, i);
    }

    public void setLong(long j, long j2) {
        Native.setLong(this, this.peer, j, j2);
    }

    public void setNativeLong(long j, NativeLong nativeLong) {
        if (NativeLong.SIZE == 8) {
            setLong(j, nativeLong.longValue());
        } else {
            setInt(j, nativeLong.intValue());
        }
    }

    public void setPointer(long j, Pointer pointer) {
        long j2;
        long j3 = this.peer;
        if (pointer != null) {
            j2 = pointer.peer;
        } else {
            j2 = 0;
        }
        Native.setPointer(this, j3, j, j2);
    }

    public void setShort(long j, short s) {
        Native.setShort(this, this.peer, j, s);
    }

    public void setString(long j, WString wString) {
        String string;
        if (wString == null) {
            string = null;
        } else {
            string = wString.toString();
        }
        setWideString(j, string);
    }

    public void setWideString(long j, String str) {
        Native.setWideString(this, this.peer, j, str);
    }

    public Pointer share(long j, long j2) {
        if (j == 0) {
            return this;
        }
        return new Pointer(this.peer + j);
    }

    public String[] getStringArray(long j, String str) {
        return getStringArray(j, -1, str);
    }

    public void setString(long j, String str) {
        setString(j, str, Native.getDefaultStringEncoding());
    }

    private void readArray(long j, Object obj, Class<?> cls) {
        int length = Array.getLength(obj);
        if (cls == Byte.TYPE) {
            read(j, (byte[]) obj, 0, length);
            return;
        }
        if (cls == Short.TYPE) {
            read(j, (short[]) obj, 0, length);
            return;
        }
        if (cls == Character.TYPE) {
            read(j, (char[]) obj, 0, length);
            return;
        }
        if (cls == Integer.TYPE) {
            read(j, (int[]) obj, 0, length);
            return;
        }
        if (cls == Long.TYPE) {
            read(j, (long[]) obj, 0, length);
            return;
        }
        if (cls == Float.TYPE) {
            read(j, (float[]) obj, 0, length);
            return;
        }
        if (cls == Double.TYPE) {
            read(j, (double[]) obj, 0, length);
            return;
        }
        if (Pointer.class.isAssignableFrom(cls)) {
            read(j, (Pointer[]) obj, 0, length);
            return;
        }
        int i = 0;
        if (Structure.class.isAssignableFrom(cls)) {
            Structure[] structureArr = (Structure[]) obj;
            if (Structure.ByReference.class.isAssignableFrom(cls)) {
                Pointer[] pointerArray = getPointerArray(j, structureArr.length);
                while (i < structureArr.length) {
                    structureArr[i] = Structure.updateStructureByReference(cls, structureArr[i], pointerArray[i]);
                    i++;
                }
                return;
            }
            Structure structureNewInstance = structureArr[0];
            if (structureNewInstance == null) {
                structureNewInstance = Structure.newInstance((Class<Structure>) cls, share(j));
                structureNewInstance.conditionalAutoRead();
                structureArr[0] = structureNewInstance;
            } else {
                structureNewInstance.useMemory(this, (int) j, true);
                structureNewInstance.read();
            }
            Structure[] array = structureNewInstance.toArray(structureArr.length);
            for (int i2 = 1; i2 < structureArr.length; i2++) {
                Structure structure = structureArr[i2];
                if (structure == null) {
                    structureArr[i2] = array[i2];
                } else {
                    structure.useMemory(this, (int) (((long) (structure.size() * i2)) + j), true);
                    structureArr[i2].read();
                }
            }
            return;
        }
        if (NativeMapped.class.isAssignableFrom(cls)) {
            Object[] objArr = (NativeMapped[]) obj;
            NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
            int nativeSize = Native.getNativeSize(obj.getClass(), obj) / objArr.length;
            while (i < objArr.length) {
                objArr[i] = nativeMappedConverter.fromNative(getValue(((long) (nativeSize * i)) + j, nativeMappedConverter.nativeType(), objArr[i]), new FromNativeContext(cls));
                i++;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Reading array of ");
        sbLIZ.append(cls);
        sbLIZ.append(" from memory not supported");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    private void writeArray(long j, Object obj, Class<?> cls) {
        if (cls == Byte.TYPE) {
            byte[] bArr = (byte[]) obj;
            write(j, bArr, 0, bArr.length);
            return;
        }
        if (cls == Short.TYPE) {
            short[] sArr = (short[]) obj;
            write(j, sArr, 0, sArr.length);
            return;
        }
        if (cls == Character.TYPE) {
            char[] cArr = (char[]) obj;
            write(j, cArr, 0, cArr.length);
            return;
        }
        if (cls == Integer.TYPE) {
            int[] iArr = (int[]) obj;
            write(j, iArr, 0, iArr.length);
            return;
        }
        if (cls == Long.TYPE) {
            long[] jArr = (long[]) obj;
            write(j, jArr, 0, jArr.length);
            return;
        }
        if (cls == Float.TYPE) {
            float[] fArr = (float[]) obj;
            write(j, fArr, 0, fArr.length);
            return;
        }
        if (cls == Double.TYPE) {
            double[] dArr = (double[]) obj;
            write(j, dArr, 0, dArr.length);
            return;
        }
        if (Pointer.class.isAssignableFrom(cls)) {
            Pointer[] pointerArr = (Pointer[]) obj;
            write(j, pointerArr, 0, pointerArr.length);
            return;
        }
        int i = 0;
        if (Structure.class.isAssignableFrom(cls)) {
            Structure[] structureArr = (Structure[]) obj;
            if (Structure.ByReference.class.isAssignableFrom(cls)) {
                int length = structureArr.length;
                Pointer[] pointerArr2 = new Pointer[length];
                while (i < structureArr.length) {
                    Structure structure = structureArr[i];
                    if (structure == null) {
                        pointerArr2[i] = null;
                    } else {
                        pointerArr2[i] = structure.getPointer();
                        structureArr[i].write();
                    }
                    i++;
                }
                write(j, pointerArr2, 0, length);
                return;
            }
            Structure structureNewInstance = structureArr[0];
            if (structureNewInstance == null) {
                structureNewInstance = Structure.newInstance((Class<Structure>) cls, share(j));
                structureArr[0] = structureNewInstance;
            } else {
                structureNewInstance.useMemory(this, (int) j, true);
            }
            structureNewInstance.write();
            Structure[] array = structureNewInstance.toArray(structureArr.length);
            for (int i2 = 1; i2 < structureArr.length; i2++) {
                Structure structure2 = structureArr[i2];
                if (structure2 == null) {
                    structureArr[i2] = array[i2];
                } else {
                    structure2.useMemory(this, (int) (((long) (structure2.size() * i2)) + j), true);
                }
                structureArr[i2].write();
            }
            return;
        }
        if (NativeMapped.class.isAssignableFrom(cls)) {
            NativeMapped[] nativeMappedArr = (NativeMapped[]) obj;
            NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
            Class<?> clsNativeType = nativeMappedConverter.nativeType();
            int nativeSize = Native.getNativeSize(obj.getClass(), obj) / nativeMappedArr.length;
            while (i < nativeMappedArr.length) {
                setValue(((long) (i * nativeSize)) + j, nativeMappedConverter.toNative(nativeMappedArr[i], new ToNativeContext()), clsNativeType);
                i++;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Writing array of ");
        sbLIZ.append(cls);
        sbLIZ.append(" to memory not supported");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public String[] getStringArray(long j, int i, String str) {
        String string;
        String string2;
        ArrayList arrayList = new ArrayList();
        if (i != -1) {
            Pointer pointer = getPointer(((long) 0) + j);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= i) {
                    break;
                }
                if (pointer == null) {
                    string2 = null;
                } else if ("--WIDE-STRING--".equals(str)) {
                    string2 = pointer.getWideString(0L);
                } else {
                    string2 = pointer.getString(0L, str);
                }
                arrayList.add(string2);
                if (i4 < i) {
                    i3 += Native.POINTER_SIZE;
                    pointer = getPointer(((long) i3) + j);
                }
                i2 = i4;
            }
        } else {
            int i5 = 0;
            while (true) {
                Pointer pointer2 = getPointer(((long) i5) + j);
                if (pointer2 == null) {
                    break;
                }
                if ("--WIDE-STRING--".equals(str)) {
                    string = pointer2.getWideString(0L);
                } else {
                    string = pointer2.getString(0L, str);
                }
                arrayList.add(string);
                i5 += Native.POINTER_SIZE;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public Object getValue(long j, Class<?> cls, Object obj) {
        Pointer directBufferPointer;
        boolean z = true;
        if (Structure.class.isAssignableFrom(cls)) {
            Structure structure = (Structure) obj;
            if (Structure.ByReference.class.isAssignableFrom(cls)) {
                return Structure.updateStructureByReference(cls, structure, getPointer(j));
            }
            structure.useMemory(this, (int) j, true);
            structure.read();
            return structure;
        }
        if (cls != Boolean.TYPE && cls != Boolean.class) {
            if (cls != Byte.TYPE && cls != Byte.class) {
                if (cls != Short.TYPE && cls != Short.class) {
                    if (cls != Character.TYPE && cls != Character.class) {
                        if (cls != Integer.TYPE && cls != Integer.class) {
                            if (cls != Long.TYPE && cls != Long.class) {
                                if (cls != Float.TYPE && cls != Float.class) {
                                    if (cls != Double.TYPE && cls != Double.class) {
                                        Pointer pointer = null;
                                        if (Pointer.class.isAssignableFrom(cls)) {
                                            Pointer pointer2 = getPointer(j);
                                            if (pointer2 != null && (!(obj instanceof Pointer) || (pointer = (Pointer) obj) == null || pointer2.peer != pointer.peer)) {
                                                return pointer2;
                                            }
                                        } else if (cls == String.class) {
                                            Pointer pointer3 = getPointer(j);
                                            if (pointer3 != null) {
                                                return pointer3.getString(0L);
                                            }
                                        } else if (cls == WString.class) {
                                            Pointer pointer4 = getPointer(j);
                                            if (pointer4 != null) {
                                                return new WString(pointer4.getWideString(0L));
                                            }
                                        } else if (Callback.class.isAssignableFrom(cls)) {
                                            Pointer pointer5 = getPointer(j);
                                            if (pointer5 != null) {
                                                Callback callback = (Callback) obj;
                                                if (!pointer5.equals(CallbackReference.getFunctionPointer(callback))) {
                                                    return CallbackReference.getCallback(cls, pointer5);
                                                }
                                                return callback;
                                            }
                                        } else if (Platform.HAS_BUFFERS && Buffer.class.isAssignableFrom(cls)) {
                                            Pointer pointer6 = getPointer(j);
                                            if (pointer6 != null) {
                                                if (obj != null && (directBufferPointer = Native.getDirectBufferPointer((Buffer) obj)) != null && directBufferPointer.equals(pointer6)) {
                                                    return obj;
                                                }
                                                throw new IllegalStateException("Can't autogenerate a direct buffer on memory read");
                                            }
                                        } else {
                                            if (NativeMapped.class.isAssignableFrom(cls)) {
                                                NativeMapped nativeMapped = (NativeMapped) obj;
                                                if (nativeMapped != null) {
                                                    Object objFromNative = nativeMapped.fromNative(getValue(j, nativeMapped.nativeType(), null), new FromNativeContext(cls));
                                                    if (!nativeMapped.equals(objFromNative)) {
                                                        return objFromNative;
                                                    }
                                                    return nativeMapped;
                                                }
                                                NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
                                                return nativeMappedConverter.fromNative(getValue(j, nativeMappedConverter.nativeType(), null), new FromNativeContext(cls));
                                            }
                                            if (cls.isArray()) {
                                                if (obj != null) {
                                                    readArray(j, obj, cls.getComponentType());
                                                    return obj;
                                                }
                                                throw new IllegalStateException("Need an initialized array");
                                            }
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("Reading \"");
                                            sbLIZ.append(cls);
                                            sbLIZ.append("\" from memory is not supported");
                                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                                        }
                                        return pointer;
                                    }
                                    return Double.valueOf(getDouble(j));
                                }
                                return Float.valueOf(getFloat(j));
                            }
                            return Long.valueOf(getLong(j));
                        }
                        return Integer.valueOf(getInt(j));
                    }
                    return Character.valueOf(getChar(j));
                }
                return Short.valueOf(getShort(j));
            }
            return Byte.valueOf(getByte(j));
        }
        if (getInt(j) == 0) {
            z = false;
        }
        return Function.valueOf(z);
    }

    public void setMemory(long j, long j2, byte b) {
        Native.setMemory(this, this.peer, j, j2, b);
    }

    public void setString(long j, String str, String str2) {
        byte[] bytes = Native.getBytes(str, str2);
        write(j, bytes, 0, bytes.length);
        setByte(j + ((long) bytes.length), (byte) 0);
    }

    public void setValue(long j, Object obj, Class<?> cls) {
        long jLongValue;
        float fFloatValue;
        double dDoubleValue;
        int i = 0;
        int iIntValue = 0;
        char cCharValue = 0;
        short sShortValue = 0;
        byte bByteValue = 0;
        if (cls != Boolean.TYPE && cls != Boolean.class) {
            if (cls != Byte.TYPE && cls != Byte.class) {
                if (cls != Short.TYPE && cls != Short.class) {
                    if (cls != Character.TYPE && cls != Character.class) {
                        if (cls != Integer.TYPE && cls != Integer.class) {
                            if (cls != Long.TYPE && cls != Long.class) {
                                if (cls != Float.TYPE && cls != Float.class) {
                                    if (cls != Double.TYPE && cls != Double.class) {
                                        if (cls == Pointer.class) {
                                            setPointer(j, (Pointer) obj);
                                            return;
                                        }
                                        if (cls == String.class) {
                                            setPointer(j, (Pointer) obj);
                                            return;
                                        }
                                        if (cls == WString.class) {
                                            setPointer(j, (Pointer) obj);
                                            return;
                                        }
                                        Pointer directBufferPointer = null;
                                        if (Structure.class.isAssignableFrom(cls)) {
                                            Structure structure = (Structure) obj;
                                            if (Structure.ByReference.class.isAssignableFrom(cls)) {
                                                if (structure != null) {
                                                    directBufferPointer = structure.getPointer();
                                                }
                                                setPointer(j, directBufferPointer);
                                                if (structure == null) {
                                                    return;
                                                }
                                                structure.autoWrite();
                                                return;
                                            }
                                            structure.useMemory(this, (int) j, true);
                                            structure.write();
                                            return;
                                        }
                                        if (Callback.class.isAssignableFrom(cls)) {
                                            setPointer(j, CallbackReference.getFunctionPointer((Callback) obj));
                                            return;
                                        }
                                        if (Platform.HAS_BUFFERS && Buffer.class.isAssignableFrom(cls)) {
                                            if (obj != null) {
                                                directBufferPointer = Native.getDirectBufferPointer((Buffer) obj);
                                            }
                                            setPointer(j, directBufferPointer);
                                            return;
                                        } else if (NativeMapped.class.isAssignableFrom(cls)) {
                                            NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
                                            setValue(j, nativeMappedConverter.toNative(obj, new ToNativeContext()), nativeMappedConverter.nativeType());
                                            return;
                                        } else {
                                            if (cls.isArray()) {
                                                writeArray(j, obj, cls.getComponentType());
                                                return;
                                            }
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("Writing ");
                                            sbLIZ.append(cls);
                                            sbLIZ.append(" to memory is not supported");
                                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                                        }
                                    }
                                    if (obj == null) {
                                        dDoubleValue = 0.0d;
                                    } else {
                                        dDoubleValue = ((Double) obj).doubleValue();
                                    }
                                    setDouble(j, dDoubleValue);
                                    return;
                                }
                                if (obj == null) {
                                    fFloatValue = 0.0f;
                                } else {
                                    fFloatValue = ((Float) obj).floatValue();
                                }
                                setFloat(j, fFloatValue);
                                return;
                            }
                            if (obj == null) {
                                jLongValue = 0;
                            } else {
                                jLongValue = ((Long) obj).longValue();
                            }
                            setLong(j, jLongValue);
                            return;
                        }
                        if (obj != null) {
                            iIntValue = ((Integer) obj).intValue();
                        }
                        setInt(j, iIntValue);
                        return;
                    }
                    if (obj != null) {
                        cCharValue = ((Character) obj).charValue();
                    }
                    setChar(j, cCharValue);
                    return;
                }
                if (obj != null) {
                    sShortValue = ((Short) obj).shortValue();
                }
                setShort(j, sShortValue);
                return;
            }
            if (obj != null) {
                bByteValue = ((Byte) obj).byteValue();
            }
            setByte(j, bByteValue);
            return;
        }
        if (Boolean.TRUE.equals(obj)) {
            i = -1;
        }
        setInt(j, i);
    }

    public void read(long j, Pointer[] pointerArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            Pointer pointer = getPointer(((long) (Native.POINTER_SIZE * i3)) + j);
            int i4 = i3 + i;
            Pointer pointer2 = pointerArr[i4];
            if (pointer2 == null || pointer == null || pointer.peer != pointer2.peer) {
                pointerArr[i4] = pointer;
            }
        }
    }

    public void write(long j, Pointer[] pointerArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            setPointer(((long) (Native.POINTER_SIZE * i3)) + j, pointerArr[i + i3]);
        }
    }

    public void read(long j, byte[] bArr, int i, int i2) {
        Native.read(this, this.peer, j, bArr, i, i2);
    }

    public void write(long j, byte[] bArr, int i, int i2) {
        Native.write(this, this.peer, j, bArr, i, i2);
    }

    public void read(long j, char[] cArr, int i, int i2) {
        Native.read(this, this.peer, j, cArr, i, i2);
    }

    public void write(long j, char[] cArr, int i, int i2) {
        Native.write(this, this.peer, j, cArr, i, i2);
    }

    public void read(long j, double[] dArr, int i, int i2) {
        Native.read(this, this.peer, j, dArr, i, i2);
    }

    public void write(long j, double[] dArr, int i, int i2) {
        Native.write(this, this.peer, j, dArr, i, i2);
    }

    public void read(long j, float[] fArr, int i, int i2) {
        Native.read(this, this.peer, j, fArr, i, i2);
    }

    public void write(long j, float[] fArr, int i, int i2) {
        Native.write(this, this.peer, j, fArr, i, i2);
    }

    public void read(long j, int[] iArr, int i, int i2) {
        Native.read(this, this.peer, j, iArr, i, i2);
    }

    public void write(long j, int[] iArr, int i, int i2) {
        Native.write(this, this.peer, j, iArr, i, i2);
    }

    public void read(long j, long[] jArr, int i, int i2) {
        Native.read(this, this.peer, j, jArr, i, i2);
    }

    public void write(long j, long[] jArr, int i, int i2) {
        Native.write(this, this.peer, j, jArr, i, i2);
    }

    public void read(long j, short[] sArr, int i, int i2) {
        Native.read(this, this.peer, j, sArr, i, i2);
    }

    public void write(long j, short[] sArr, int i, int i2) {
        Native.write(this, this.peer, j, sArr, i, i2);
    }
}
