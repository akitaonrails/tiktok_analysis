package com.orbu.core.logger;

/* JADX INFO: loaded from: classes14.dex */
public final class SandboxActivationJournal {
    public long activationCallback;
    public long activationEnd;
    public long activationStart;
    public int activeCount;

    public SandboxActivationJournal() {
        this(0L, 0L, 0L, 0);
    }

    public final long getActivationCost() {
        return this.activationEnd - this.activationStart;
    }

    public final long getActivationToCallbackCost() {
        return this.activationCallback - this.activationStart;
    }

    public final void setActivationCallback(long j) {
        this.activationCallback = j;
    }

    public final void setActivationEnd(long j) {
        this.activationEnd = j;
    }

    public final void setActivationStart(long j) {
        this.activationStart = j;
    }

    public final void setActiveCount(int i) {
        this.activeCount = i;
    }

    public SandboxActivationJournal(long j, long j2, long j3, int i) {
        this.activationStart = j;
        this.activationEnd = j2;
        this.activationCallback = j3;
        this.activeCount = i;
    }
}
