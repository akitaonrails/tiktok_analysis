package com.orbu.core.logger;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
public final class SandboxBootLogger {
    public static SandboxActivationJournal lastActivationJournal;
    public static final SandboxBootLogger INSTANCE = new SandboxBootLogger();
    public static AtomicLong sdkInitStart = new AtomicLong(0);
    public static AtomicLong sdkInitEnd = new AtomicLong(0);
    public static AtomicLong firstDataflowIdRequest = new AtomicLong(0);
    public static AtomicInteger dfidCounter = new AtomicInteger(0);

    public final void keepLog(int i) {
    }

    public final void firstDataflowRequest() {
        if (dfidCounter.compareAndSet(0, 1)) {
            firstDataflowIdRequest.set(SystemClock.uptimeMillis());
        }
    }

    public final long getInitCost() {
        return sdkInitEnd.get() - sdkInitStart.get();
    }

    public void sandboxInitEnd() {
        sdkInitEnd.set(SystemClock.uptimeMillis());
    }

    public void sandboxInitStart() {
        sdkInitStart.set(SystemClock.uptimeMillis());
    }

    public final AtomicLong getFirstDataflowIdRequest() {
        return firstDataflowIdRequest;
    }

    public final SandboxActivationJournal getLastActivationJournal() {
        return lastActivationJournal;
    }

    public final SandboxActivationJournal getLastSandboxActivationJournal() {
        return lastActivationJournal;
    }

    public final AtomicLong getSdkInitEnd() {
        return sdkInitEnd;
    }

    public final AtomicLong getSdkInitStart() {
        return sdkInitStart;
    }

    public final long calcFirstDFIDToTimestamp(long j) {
        return firstDataflowIdRequest.get() - j;
    }

    public final long getThreshold(long j) {
        if (isThresholdValid(j)) {
            return firstDataflowIdRequest.get() - sdkInitStart.get();
        }
        return 0L;
    }

    public final boolean isThresholdValid(long j) {
        if (dfidCounter.get() > 0 && firstDataflowIdRequest.get() > sdkInitStart.get() && firstDataflowIdRequest.get() - sdkInitStart.get() < getInitCost() + j) {
            return true;
        }
        return false;
    }

    public final void setFirstDataflowIdRequest(AtomicLong atomicLong) {
        firstDataflowIdRequest = atomicLong;
    }

    public final void setLastActivationJournal(SandboxActivationJournal sandboxActivationJournal) {
        lastActivationJournal = sandboxActivationJournal;
    }

    public final void setSdkInitEnd(AtomicLong atomicLong) {
        sdkInitEnd = atomicLong;
    }

    public final void setSdkInitStart(AtomicLong atomicLong) {
        sdkInitStart = atomicLong;
    }
}
