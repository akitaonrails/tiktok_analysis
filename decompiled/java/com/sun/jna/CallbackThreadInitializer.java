package com.sun.jna;

/* JADX INFO: loaded from: classes31.dex */
public class CallbackThreadInitializer {
    public boolean daemon;
    public boolean detach;
    public ThreadGroup group;
    public String name;

    public CallbackThreadInitializer() {
        this(true);
    }

    public CallbackThreadInitializer(boolean z) {
        this(z, false);
    }

    public boolean detach(Callback callback) {
        return this.detach;
    }

    public String getName(Callback callback) {
        return this.name;
    }

    public ThreadGroup getThreadGroup(Callback callback) {
        return this.group;
    }

    public boolean isDaemon(Callback callback) {
        return this.daemon;
    }

    public CallbackThreadInitializer(boolean z, boolean z2) {
        this(z, z2, null);
    }

    public CallbackThreadInitializer(boolean z, boolean z2, String str) {
        this(z, z2, str, null);
    }

    public CallbackThreadInitializer(boolean z, boolean z2, String str, ThreadGroup threadGroup) {
        this.daemon = z;
        this.detach = z2;
        this.name = str;
        this.group = threadGroup;
    }
}
