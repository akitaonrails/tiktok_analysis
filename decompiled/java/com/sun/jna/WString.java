package com.sun.jna;

/* JADX INFO: loaded from: classes24.dex */
public final class WString implements CharSequence, Comparable {
    public String string;

    public int hashCode() {
        return toString().hashCode();
    }

    @Override // java.lang.CharSequence
    public int length() {
        return toString().length();
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.string;
    }

    public WString(String str) {
        if (str != null) {
            this.string = str;
            return;
        }
        throw new NullPointerException("String initializer must be non-null");
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return toString().charAt(i);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return toString().compareTo(obj.toString());
    }

    public boolean equals(Object obj) {
        if ((obj instanceof WString) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }
}
