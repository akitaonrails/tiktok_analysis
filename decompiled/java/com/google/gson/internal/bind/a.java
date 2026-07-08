package com.google.gson.internal.bind;

import X.C09CU;
import X.C09D6;
import X.C2188811AlT;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends C09CU {
    public static final C0012a LLJJJ = new C0012a();
    public static final Object LLJJJIL = new Object();
    public Object[] LLJJIII;
    public int LLJJIJI;
    public String[] LLJJIJIIJIL;
    public int[] LLJJIJIL;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    public static class C0012a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    @Override // X.C09CU, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LLJJIII = new Object[]{LLJJJIL};
        this.LLJJIJI = 1;
    }

    @Override // X.C09CU
    public final void LIZ() {
        LJLIIIL(C09D6.BEGIN_ARRAY);
        LJLJL(((h) LJLJI()).iterator());
        this.LLJJIJIL[this.LLJJIJI - 1] = 0;
    }

    @Override // X.C09CU
    public final void LIZIZ() {
        LJLIIIL(C09D6.BEGIN_OBJECT);
        LJLJL(((n) LJLJI()).entrySet().iterator());
    }

    @Override // X.C09CU
    public final void LJI() {
        LJLIIIL(C09D6.END_ARRAY);
        LJLJJLL();
        LJLJJLL();
        int i = this.LLJJIJI;
        if (i > 0) {
            int[] iArr = this.LLJJIJIL;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // X.C09CU
    public final void LJII() {
        LJLIIIL(C09D6.END_OBJECT);
        LJLJJLL();
        LJLJJLL();
        int i = this.LLJJIJI;
        if (i > 0) {
            int[] iArr = this.LLJJIJIL;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // X.C09CU
    public final String LJIILLIIL() {
        StringBuilder sb = new StringBuilder(e3.c);
        int i = 0;
        while (i < this.LLJJIJI) {
            Object[] objArr = this.LLJJIII;
            Object obj = objArr[i];
            if (obj instanceof h) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.LLJJIJIL[i]);
                    sb.append(']');
                }
            } else if (obj instanceof n) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String str = this.LLJJIJIIJIL[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // X.C09CU
    public final boolean LJJ() {
        LJLIIIL(C09D6.BOOLEAN);
        boolean zLJ = ((k) LJLJJLL()).LJ();
        int i = this.LLJJIJI;
        if (i > 0) {
            int[] iArr = this.LLJJIJIL;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zLJ;
    }

    @Override // X.C09CU
    public final String LJJJJ() {
        LJLIIIL(C09D6.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) LJLJI()).next();
        String str = (String) entry.getKey();
        this.LLJJIJIIJIL[this.LLJJIJI - 1] = str;
        LJLJL(entry.getValue());
        return str;
    }

    @Override // X.C09CU
    public final void LJJJJJL() {
        LJLIIIL(C09D6.NULL);
        LJLJJLL();
        int i = this.LLJJIJI;
        if (i > 0) {
            int[] iArr = this.LLJJIJIL;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // X.C09CU
    public final C09D6 LJJLIIIJ() {
        if (this.LLJJIJI == 0) {
            return C09D6.END_DOCUMENT;
        }
        Object objLJLJI = LJLJI();
        if (objLJLJI instanceof Iterator) {
            boolean z = this.LLJJIII[this.LLJJIJI - 2] instanceof n;
            Iterator it2 = (Iterator) objLJLJI;
            if (!it2.hasNext()) {
                return z ? C09D6.END_OBJECT : C09D6.END_ARRAY;
            }
            if (z) {
                return C09D6.NAME;
            }
            LJLJL(it2.next());
            return LJJLIIIJ();
        }
        if (objLJLJI instanceof n) {
            return C09D6.BEGIN_OBJECT;
        }
        if (objLJLJI instanceof h) {
            return C09D6.BEGIN_ARRAY;
        }
        if (!(objLJLJI instanceof q)) {
            if (objLJLJI instanceof m) {
                return C09D6.NULL;
            }
            if (objLJLJI == LLJJJIL) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        Object obj = ((q) objLJLJI).LL;
        if (obj instanceof String) {
            return C09D6.STRING;
        }
        if (obj instanceof Boolean) {
            return C09D6.BOOLEAN;
        }
        if (obj instanceof Number) {
            return C09D6.NUMBER;
        }
        throw new AssertionError();
    }

    public final Object LJLJI() {
        return this.LLJJIII[this.LLJJIJI - 1];
    }

    public final Object LJLJJLL() {
        Object[] objArr = this.LLJJIII;
        int i = this.LLJJIJI - 1;
        this.LLJJIJI = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // X.C09CU
    public final String toString() {
        return a.class.getSimpleName();
    }

    private String LJIJJLI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" at path ");
        sbLIZ.append(LJIILLIIL());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C09CU
    public final boolean LJIIZILJ() {
        C09D6 c09d6LJJLIIIJ = LJJLIIIJ();
        return (c09d6LJJLIIIJ == C09D6.END_OBJECT || c09d6LJJLIIIJ == C09D6.END_ARRAY) ? false : true;
    }

    @Override // X.C09CU
    public final double LJJIL() {
        C09D6 c09d6LJJLIIIJ = LJJLIIIJ();
        C09D6 c09d6 = C09D6.NUMBER;
        if (c09d6LJJLIIIJ != c09d6 && c09d6LJJLIIIJ != C09D6.STRING) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected ");
            sbLIZ.append(c09d6);
            sbLIZ.append(" but was ");
            sbLIZ.append(c09d6LJJLIIIJ);
            sbLIZ.append(LJIJJLI());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        double dLJIIIZ = ((k) LJLJI()).LJIIIZ();
        if (!this.LLILLJJLI && (Double.isNaN(dLJIIIZ) || Double.isInfinite(dLJIIIZ))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("JSON forbids NaN and infinities: ");
            sbLIZ2.append(dLJIIIZ);
            throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        LJLJJLL();
        int i = this.LLJJIJI;
        if (i > 0) {
            int[] iArr = this.LLJJIJIL;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dLJIIIZ;
    }

    @Override // X.C09CU
    public final int LJJIZ() {
        C09D6 c09d6LJJLIIIJ = LJJLIIIJ();
        C09D6 c09d6 = C09D6.NUMBER;
        if (c09d6LJJLIIIJ != c09d6 && c09d6LJJLIIIJ != C09D6.STRING) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected ");
            sbLIZ.append(c09d6);
            sbLIZ.append(" but was ");
            sbLIZ.append(c09d6LJJLIIIJ);
            sbLIZ.append(LJIJJLI());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        int iLJIIJJI = ((k) LJLJI()).LJIIJJI();
        LJLJJLL();
        int i = this.LLJJIJI;
        if (i > 0) {
            int[] iArr = this.LLJJIJIL;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iLJIIJJI;
    }

    @Override // X.C09CU
    public final long LJJJ() {
        C09D6 c09d6LJJLIIIJ = LJJLIIIJ();
        C09D6 c09d6 = C09D6.NUMBER;
        if (c09d6LJJLIIIJ != c09d6 && c09d6LJJLIIIJ != C09D6.STRING) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected ");
            sbLIZ.append(c09d6);
            sbLIZ.append(" but was ");
            sbLIZ.append(c09d6LJJLIIIJ);
            sbLIZ.append(LJIJJLI());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        long jLJIIZILJ = ((k) LJLJI()).LJIIZILJ();
        LJLJJLL();
        int i = this.LLJJIJI;
        if (i > 0) {
            int[] iArr = this.LLJJIJIL;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jLJIIZILJ;
    }

    @Override // X.C09CU
    public final String LJJJZ() {
        C09D6 c09d6LJJLIIIJ = LJJLIIIJ();
        C09D6 c09d6 = C09D6.STRING;
        if (c09d6LJJLIIIJ == c09d6 || c09d6LJJLIIIJ == C09D6.NUMBER) {
            String strLJIL = ((k) LJLJJLL()).LJIL();
            int i = this.LLJJIJI;
            if (i > 0) {
                int[] iArr = this.LLJJIJIL;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return strLJIL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected ");
        sbLIZ.append(c09d6);
        sbLIZ.append(" but was ");
        sbLIZ.append(c09d6LJJLIIIJ);
        sbLIZ.append(LJIJJLI());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C09CU
    public final void LJJZ() {
        if (LJJLIIIJ() == C09D6.NAME) {
            LJJJJ();
            this.LLJJIJIIJIL[this.LLJJIJI - 2] = "null";
        } else {
            LJLJJLL();
            int i = this.LLJJIJI;
            if (i > 0) {
                this.LLJJIJIIJIL[i - 1] = "null";
            }
        }
        int i2 = this.LLJJIJI;
        if (i2 > 0) {
            int[] iArr = this.LLJJIJIL;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public a(k kVar) {
        super(LLJJJ);
        this.LLJJIII = new Object[32];
        this.LLJJIJIIJIL = new String[32];
        this.LLJJIJIL = new int[32];
        LJLJL(kVar);
    }

    public final void LJLIIIL(C09D6 c09d6) {
        if (LJJLIIIJ() == c09d6) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected ");
        sbLIZ.append(c09d6);
        sbLIZ.append(" but was ");
        sbLIZ.append(LJJLIIIJ());
        sbLIZ.append(LJIJJLI());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJLJL(Object obj) {
        int i = this.LLJJIJI;
        Object[] objArr = this.LLJJIII;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[i * 2];
            int[] iArr = new int[i * 2];
            String[] strArr = new String[i * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.LLJJIJIL, 0, iArr, 0, this.LLJJIJI);
            System.arraycopy(this.LLJJIJIIJIL, 0, strArr, 0, this.LLJJIJI);
            this.LLJJIII = objArr2;
            this.LLJJIJIL = iArr;
            this.LLJJIJIIJIL = strArr;
        }
        Object[] objArr3 = this.LLJJIII;
        int i2 = this.LLJJIJI;
        this.LLJJIJI = i2 + 1;
        objArr3[i2] = obj;
    }
}
