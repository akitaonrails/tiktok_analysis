package com.ss.lyrax.engine;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxSysStats {
    public double cpuAppUsage;
    public int cpuCores;
    public double cpuTotalUsage;
    public long freeMemory;
    public long fullMemory;
    public double memoryRatio;
    public double memoryUsage;
    public double totalMemoryRatio;
    public long totalMemoryUsage;

    public double getCpuAppUsage() {
        return this.cpuAppUsage;
    }

    public int getCpuCores() {
        return this.cpuCores;
    }

    public double getCpuTotalUsage() {
        return this.cpuTotalUsage;
    }

    public long getFreeMemory() {
        return this.freeMemory;
    }

    public long getFullMemory() {
        return this.fullMemory;
    }

    public double getMemoryRatio() {
        return this.memoryRatio;
    }

    public double getMemoryUsage() {
        return this.memoryUsage;
    }

    public double getTotalMemoryRatio() {
        return this.totalMemoryRatio;
    }

    public long getTotalMemoryUsage() {
        return this.totalMemoryUsage;
    }

    public LyraxSysStats(int i, double d, double d2, double d3, long j, long j2, long j3, double d4, double d5) {
        this.cpuCores = i;
        this.cpuAppUsage = d;
        this.cpuTotalUsage = d2;
        this.memoryUsage = d3;
        this.fullMemory = j;
        this.totalMemoryUsage = j2;
        this.freeMemory = j3;
        this.memoryRatio = d4;
        this.totalMemoryRatio = d5;
    }
}
