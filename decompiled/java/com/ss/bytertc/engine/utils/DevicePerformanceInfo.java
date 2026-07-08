package com.ss.bytertc.engine.utils;

/* JADX INFO: loaded from: classes.dex */
public class DevicePerformanceInfo {
    public int cpuCores;
    public float cpuFrequency;
    public String cpuModel;
    public int cpuThreads;
    public String deviceModel;
    public String gpuModel;
    public float memory;
    public String os;
    public String osVersion;

    public DevicePerformanceInfo(float f, int i, int i2, float f2, String str, String str2, String str3, String str4, String str5) {
        this.memory = f;
        this.cpuCores = i;
        this.cpuThreads = i2;
        this.cpuFrequency = f2;
        this.cpuModel = str;
        this.gpuModel = str2;
        this.os = str3;
        this.osVersion = str4;
        this.deviceModel = str5;
    }

    public static DevicePerformanceInfo create(float f, int i, int i2, float f2, String str, String str2, String str3, String str4, String str5) {
        return new DevicePerformanceInfo(f, i, i2, f2, str, str2, str3, str4, str5);
    }
}
