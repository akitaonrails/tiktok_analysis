package com.sun.jna;

import X.C2188811AlT;
import com.sun.jna.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class StringArray extends Memory implements Function.PostCallRead {
    public String encoding;
    public List<NativeString> natives;
    public Object[] original;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // com.sun.jna.Function.PostCallRead
    public void read() {
        ?? wideString;
        boolean z = this.original instanceof WString[];
        boolean zEquals = "--WIDE-STRING--".equals(this.encoding);
        for (int i = 0; i < this.original.length; i++) {
            Pointer pointer = getPointer(Native.POINTER_SIZE * i);
            if (pointer != null) {
                wideString = zEquals ? pointer.getWideString(0L) : pointer.getString(0L, this.encoding);
                if (z) {
                    wideString = new WString(wideString);
                }
            } else {
                wideString = 0;
            }
            this.original[i] = wideString;
        }
    }

    @Override // com.sun.jna.Memory, com.sun.jna.Pointer
    public String toString() {
        String str = "--WIDE-STRING--".equals(this.encoding) ? "const wchar_t*[]" : "const char*[]";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(Arrays.asList(this.original));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StringArray(WString[] wStringArr) {
        this(wStringArr, "--WIDE-STRING--");
    }

    public StringArray(String[] strArr) {
        this(strArr, false);
    }

    public StringArray(Object[] objArr, String str) {
        super((objArr.length + 1) * Native.POINTER_SIZE);
        this.natives = new ArrayList();
        this.original = objArr;
        this.encoding = str;
        int i = 0;
        while (true) {
            Pointer pointer = null;
            if (i < objArr.length) {
                Object obj = objArr[i];
                if (obj != null) {
                    NativeString nativeString = new NativeString(obj.toString(), str);
                    this.natives.add(nativeString);
                    pointer = nativeString.getPointer();
                }
                setPointer(Native.POINTER_SIZE * i, pointer);
                i++;
            } else {
                setPointer(Native.POINTER_SIZE * objArr.length, null);
                return;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StringArray(String[] strArr, boolean z) {
        String defaultStringEncoding;
        if (z) {
            defaultStringEncoding = "--WIDE-STRING--";
        } else {
            defaultStringEncoding = Native.getDefaultStringEncoding();
        }
        this((Object[]) strArr, defaultStringEncoding);
    }

    public StringArray(String[] strArr, String str) {
        this((Object[]) strArr, str);
    }
}
