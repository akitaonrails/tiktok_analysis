package com.sun.jna;

/* JADX INFO: loaded from: classes31.dex */
public class NativeString implements CharSequence, Comparable {
    public String encoding;
    public Pointer pointer;

    public class StringMemory extends Memory {
        @Override // com.sun.jna.Memory, com.sun.jna.Pointer
        public String toString() {
            return NativeString.this.toString();
        }

        public StringMemory(long j) {
            super(j);
        }
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return "--WIDE-STRING--".equals(this.encoding) ? this.pointer.getWideString(0L) : this.pointer.getString(0L, this.encoding);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @Override // java.lang.CharSequence
    public int length() {
        return toString().length();
    }

    public Pointer getPointer() {
        return this.pointer;
    }

    public NativeString(WString wString) {
        this(wString.toString(), "--WIDE-STRING--");
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return toString().charAt(i);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj == null) {
            return 1;
        }
        return toString().compareTo(obj.toString());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CharSequence) || compareTo(obj) != 0) {
            return false;
        }
        return true;
    }

    public NativeString(String str) {
        this(str, Native.getDefaultStringEncoding());
    }

    public NativeString(String str, String str2) {
        if (str != null) {
            this.encoding = str2;
            if ("--WIDE-STRING--".equals(str2)) {
                StringMemory stringMemory = new StringMemory((str.length() + 1) * Native.WCHAR_SIZE);
                this.pointer = stringMemory;
                stringMemory.setWideString(0L, str);
                return;
            } else {
                byte[] bytes = Native.getBytes(str, str2);
                StringMemory stringMemory2 = new StringMemory(bytes.length + 1);
                this.pointer = stringMemory2;
                stringMemory2.write(0L, bytes, 0, bytes.length);
                this.pointer.setByte(bytes.length, (byte) 0);
                return;
            }
        }
        throw new NullPointerException("String must not be null");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NativeString(String str, boolean z) {
        String defaultStringEncoding;
        if (z) {
            defaultStringEncoding = "--WIDE-STRING--";
        } else {
            defaultStringEncoding = Native.getDefaultStringEncoding();
        }
        this(str, defaultStringEncoding);
    }
}
