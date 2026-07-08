package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.trace;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class BasePerfData {

    @C09CT("average_cpu_rate")
    public double averageCpuRate;

    @C09CT("average_cpu_rate_increase")
    public double averageCpuRateIncrease;

    @C09CT("average_gpu_usage")
    public double averageGpuUsage;

    @C09CT("average_gpu_usage_increase")
    public double averageGpuUsageIncrease;

    @C09CT("average_memory_usage")
    public double averageMemoryUsage;

    @C09CT("average_memory_usage_increase")
    public double averageMemoryUsageIncrease;

    @C09CT("baseline_cpu_rate")
    public double baselineCpuRate;

    @C09CT("baseline_gpu_usage")
    public double baselineGpuUsage;

    @C09CT("baseline_memory_usage")
    public double baselineMemoryUsage;

    @C09CT("cpu_cores")
    public final int cpuCores;

    @C09CT("open_increase_cpu_rate")
    public double increaseCpuRate;

    @C09CT("open_increase_gpu_usage")
    public double increaseGpuUsage;

    @C09CT("open_increase_memory")
    public double increaseMemory;

    @C09CT("peak_cpu_rate")
    public double peakCpuRate;

    @C09CT("peak_gpu_usage")
    public double peakGpuUsage;

    @C09CT("peak_memory_usage")
    public double peakMemoryUsage;

    @C09CT("quit_cpu_rate")
    public double quitCpuRate;

    @C09CT("quit_gpu_usage")
    public double quitGpuUsage;

    @C09CT("quit_memory_usage")
    public double quitMemoryUsage;

    @C09CT("source_page")
    public final String sourcePage;

    @C09CT("total_memory")
    public final int totalMemory;

    public BasePerfData() {
        this("", 0, 0);
    }

    public BasePerfData(String str, int i, int i2) {
        this.sourcePage = str;
        this.cpuCores = i;
        this.totalMemory = i2;
    }
}
