package com.ss.bytertc.engine;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class SysStats {
    public double cpuAppUsage;
    public int cpuCores;
    public double cpuTotalUsage;
    public long freeMemory;
    public long fullMemory;
    public double memoryRatio;
    public double memoryUsage;
    public double totalMemoryRatio;
    public long totalMemoryUsage;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SysStats{cpu_cores=");
        sbLIZ.append(this.cpuCores);
        sbLIZ.append('\'');
        sbLIZ.append(" cpu_app_usage=");
        sbLIZ.append(this.cpuAppUsage);
        sbLIZ.append('\'');
        sbLIZ.append(", cpu_total_usage=");
        sbLIZ.append(this.cpuTotalUsage);
        sbLIZ.append(", memory_usage=");
        sbLIZ.append(this.memoryUsage);
        sbLIZ.append("full_memory=");
        sbLIZ.append(this.fullMemory);
        sbLIZ.append('\'');
        sbLIZ.append("total_memory_usage=");
        sbLIZ.append(this.totalMemoryUsage);
        sbLIZ.append('\'');
        sbLIZ.append("free_memory=");
        sbLIZ.append(this.freeMemory);
        sbLIZ.append('\'');
        sbLIZ.append("memory_ratio=");
        sbLIZ.append(this.memoryRatio);
        sbLIZ.append('\'');
        sbLIZ.append("total_memory_ratio=");
        sbLIZ.append(this.totalMemoryRatio);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SysStats() {
    }

    public SysStats(int i, double d, double d2, double d3, long j, long j2, long j3, double d4, double d5) {
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

    public static SysStats create(int i, double d, double d2, double d3, long j, long j2, long j3, double d4, double d5) {
        return new SysStats(i, d, d2, d3, j, j2, j3, d4, d5);
    }
}
