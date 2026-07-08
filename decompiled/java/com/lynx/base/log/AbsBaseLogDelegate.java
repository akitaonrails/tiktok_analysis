package com.lynx.base.log;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AbsBaseLogDelegate {
    public int mMinimumLoggingLevel = 4;

    private void println(int i, String str, String str2) {
    }

    public int getMinimumLoggingLevel() {
        return this.mMinimumLoggingLevel;
    }

    public boolean isLoggable(int i) {
        if (this.mMinimumLoggingLevel <= i) {
            return true;
        }
        return false;
    }

    public void setMinimumLoggingLevel(int i) {
        this.mMinimumLoggingLevel = i;
    }

    public void d(String str, String str2) {
        println(3, str, str2);
    }

    public void e(String str, String str2) {
        println(6, str, str2);
    }

    public void i(String str, String str2) {
        println(4, str, str2);
    }

    public void v(String str, String str2) {
        println(2, str, str2);
    }

    public void w(String str, String str2) {
        println(5, str, str2);
    }

    public void log(int i, String str, String str2) {
        println(i, str, str2);
    }
}
