package com.google.gson.internal;

import X.C09CQ;
import X.C09CU;
import X.C09DL;
import X.C2329809Ay;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes4.dex */
public final class w {

    public static final class a extends Writer {
        public final Appendable LL;
        public final C0013a LLILLJJLI = new C0013a();

        /* JADX INFO: renamed from: com.google.gson.internal.w$a$a, reason: collision with other inner class name */
        public static class C0013a implements CharSequence {
            public char[] LL;

            @Override // java.lang.CharSequence
            public final int length() {
                return this.LL.length;
            }

            @Override // java.lang.CharSequence
            public final char charAt(int i) {
                return this.LL[i];
            }

            @Override // java.lang.CharSequence
            public final CharSequence subSequence(int i, int i2) {
                return new String(this.LL, i, i2 - i);
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        public a(Appendable appendable) {
            this.LL = appendable;
        }

        @Override // java.io.Writer
        public final void write(int i) throws IOException {
            this.LL.append((char) i);
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) throws IOException {
            C0013a c0013a = this.LLILLJJLI;
            c0013a.LL = cArr;
            this.LL.append(c0013a, i, i2 + i);
        }
    }

    public static com.google.gson.k LIZ(C09CU c09cu) {
        boolean z;
        try {
            try {
                c09cu.LJJLIIIJ();
                try {
                    return TypeAdapters.LJJIIJ.read(c09cu);
                } catch (EOFException e) {
                    e = e;
                    z = false;
                    TryCatchGuardChecker.doCheck(e);
                    if (z) {
                        return com.google.gson.m.LL;
                    }
                    throw new com.google.gson.s(e);
                }
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
        } catch (C2329809Ay e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new com.google.gson.s(e3);
        } catch (IOException e4) {
            TryCatchGuardChecker.doCheck(e4);
            throw new com.google.gson.l(e4);
        } catch (NumberFormatException e5) {
            TryCatchGuardChecker.doCheck(e5);
            throw new com.google.gson.s(e5);
        }
    }

    public static Writer LIZJ(Appendable appendable) {
        if (C09CQ.LIZJ) {
            if (appendable instanceof Writer) {
                return (Writer) appendable;
            }
            return new a(appendable);
        }
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new com.google.gson.u(appendable);
    }

    public static void LIZIZ(com.google.gson.k kVar, C09DL c09dl) {
        TypeAdapters.LJJIIJ.write(c09dl, kVar);
    }
}
