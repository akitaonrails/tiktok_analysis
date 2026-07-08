package com.google.gson;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends Writer {
    public final Appendable LL;
    public final a LLILLJJLI = new a();

    public static class a implements CharSequence {
        public char[] LL;
        public String LLILLJJLI;

        @Override // java.lang.CharSequence
        public final int length() {
            return this.LL.length;
        }

        @Override // java.lang.CharSequence
        public final String toString() {
            if (this.LLILLJJLI == null) {
                this.LLILLJJLI = new String(this.LL);
            }
            return this.LLILLJJLI;
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

    public u(Appendable appendable) {
        this.LL = appendable;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        this.LL.append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        this.LL.append((char) i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        this.LL.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        this.LL.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        a aVar = this.LLILLJJLI;
        aVar.LL = cArr;
        aVar.LLILLJJLI = null;
        this.LL.append(aVar, i, i2 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        this.LL.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) throws IOException {
        str.getClass();
        this.LL.append(str, i, i2 + i);
    }
}
