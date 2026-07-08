package org.apache.commons.io.output;

import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: loaded from: classes4.dex */
public class StringBuilderWriter extends Writer implements Serializable {
    public static final long serialVersionUID = -146927496096066153L;
    public final StringBuilder builder;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.builder.toString();
    }

    public StringBuilderWriter() {
        this.builder = new StringBuilder();
    }

    public StringBuilder getBuilder() {
        return this.builder;
    }

    public StringBuilderWriter(StringBuilder sb) {
        this.builder = sb == null ? new StringBuilder() : sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        this.builder.append(c);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.builder.append(str);
        }
    }

    public StringBuilderWriter(int i) {
        this.builder = new StringBuilder(i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.builder.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(char c) {
        append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        this.builder.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.builder.append(cArr, i, i2);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }
}
