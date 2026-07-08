package com.bytedance.sysoptimizer.suspension;

import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class SuspensionParam {
    public boolean enableCrashWhenInitFailed;
    public Set<String> ignoredThreadSet;
    public long threadSuspendDuration = 2000;
    public long intervalCheckSuspensionDuration = 4000;
    public long suspensionTaskMaxDuration = 180000;
    public float ratio = 1.0f;

    public Set<String> getIgnoredThreadSet() {
        return this.ignoredThreadSet;
    }

    public long getIntervalCheckSuspensionDuration() {
        return this.intervalCheckSuspensionDuration;
    }

    public float getRatio() {
        return this.ratio;
    }

    public long getSuspensionTaskMaxDuration() {
        return this.suspensionTaskMaxDuration;
    }

    public long getThreadSuspendDuration() {
        return this.threadSuspendDuration;
    }

    public boolean isEnableCrashWhenInitFailed() {
        return this.enableCrashWhenInitFailed;
    }

    public SuspensionParam setEnableCrashWhenInitFailed(boolean z) {
        this.enableCrashWhenInitFailed = z;
        return this;
    }

    public SuspensionParam setIgnoredThreadSet(Set<String> set) {
        this.ignoredThreadSet = set;
        return this;
    }

    public SuspensionParam setIntervalCheckSuspensionDuration(long j) {
        this.intervalCheckSuspensionDuration = j;
        return this;
    }

    public SuspensionParam setRatio(float f) {
        this.ratio = f;
        return this;
    }

    public SuspensionParam setSuspensionTaskMaxDuration(long j) {
        this.suspensionTaskMaxDuration = j;
        return this;
    }

    public SuspensionParam setThreadSuspendDuration(long j) {
        this.threadSuspendDuration = j;
        return this;
    }
}
