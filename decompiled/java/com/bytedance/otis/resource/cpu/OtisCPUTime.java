package com.bytedance.otis.resource.cpu;

import X.C2188811AlT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class OtisCPUTime {
    public long devCpu;
    public Map<Integer, Map<Long, Long>> devCpuFreqMap;
    public long devIdle;
    public long procCpu;
    public long refreshTime;
    public Map<Integer, Long> threadCpuMap;
    public Map<Integer, Map<Integer, Long>> threadCpuPolicyMap;

    public OtisCPUTime() {
        this(0L, 0L, 0L, null, 0L, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(refreshTime:");
        sbLIZ.append(this.refreshTime);
        sbLIZ.append(", devCpu:");
        sbLIZ.append(this.devCpu);
        sbLIZ.append(", devIdle:");
        sbLIZ.append(this.devIdle);
        sbLIZ.append(", procCpu:");
        sbLIZ.append(this.procCpu);
        sbLIZ.append(", devCpuPolicy:");
        Object obj = this.devCpuFreqMap;
        if (obj == null) {
            obj = "null";
        }
        sbLIZ.append(obj);
        sbLIZ.append(" threadCpuMap:");
        Object obj2 = this.threadCpuMap;
        if (obj2 == null) {
            obj2 = "null";
        }
        sbLIZ.append(obj2);
        sbLIZ.append(" threadCpuPolicyMap:");
        Map<Integer, Map<Integer, Long>> map = this.threadCpuPolicyMap;
        sbLIZ.append(map != null ? map : "null");
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long getDevCpu() {
        return this.devCpu;
    }

    public final Map<Integer, Map<Long, Long>> getDevCpuFreqMap() {
        return this.devCpuFreqMap;
    }

    public final long getDevIdle() {
        return this.devIdle;
    }

    public final long getProcCpu() {
        return this.procCpu;
    }

    public final long getRefreshTime() {
        return this.refreshTime;
    }

    public final Map<Integer, Long> getThreadCpuMap() {
        return this.threadCpuMap;
    }

    public final Map<Integer, Map<Integer, Long>> getThreadCpuPolicyMap() {
        return this.threadCpuPolicyMap;
    }

    public final void setDevCpu(long j) {
        this.devCpu = j;
    }

    public final void setDevCpuFreqMap(Map<Integer, Map<Long, Long>> map) {
        this.devCpuFreqMap = map;
    }

    public final void setDevIdle(long j) {
        this.devIdle = j;
    }

    public final void setProcCpu(long j) {
        this.procCpu = j;
    }

    public final void setRefreshTime(long j) {
        this.refreshTime = j;
    }

    public final void setThreadCpuMap(Map<Integer, Long> map) {
        this.threadCpuMap = map;
    }

    public final void setThreadCpuPolicyMap(Map<Integer, Map<Integer, Long>> map) {
        this.threadCpuPolicyMap = map;
    }

    public final void putThreadCpu(int i, long j) {
        if (this.threadCpuMap == null) {
            this.threadCpuMap = new LinkedHashMap();
        }
        Map<Integer, Long> map = this.threadCpuMap;
        if (map != null) {
            map.put(Integer.valueOf(i), Long.valueOf(j));
        }
    }

    public final void putDeviceCpuFreq(int i, long j, long j2) {
        if (this.devCpuFreqMap == null) {
            this.devCpuFreqMap = new LinkedHashMap();
        }
        Map<Integer, Map<Long, Long>> map = this.devCpuFreqMap;
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i);
            Map<Long, Long> linkedHashMap = map.get(numValueOf);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
                map.put(numValueOf, linkedHashMap);
            }
            linkedHashMap.put(Long.valueOf(j), Long.valueOf(j2));
        }
        this.devCpu += j2;
    }

    public final void putThreadCpuPolicy(int i, int i2, long j) {
        if (this.threadCpuPolicyMap == null) {
            this.threadCpuPolicyMap = new LinkedHashMap();
        }
        Map<Integer, Map<Integer, Long>> map = this.threadCpuPolicyMap;
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i);
            Map<Integer, Long> linkedHashMap = map.get(numValueOf);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
                map.put(numValueOf, linkedHashMap);
            }
            linkedHashMap.put(Integer.valueOf(i2), Long.valueOf(j));
        }
        if (this.threadCpuMap == null) {
            this.threadCpuMap = new LinkedHashMap();
        }
        Map<Integer, Long> map2 = this.threadCpuMap;
        if (map2 != null) {
            Integer numValueOf2 = Integer.valueOf(i);
            Long l = map2.get(numValueOf2);
            if (l == null) {
                l = 0L;
                map2.put(numValueOf2, l);
            }
            map2.put(Integer.valueOf(i), Long.valueOf(l.longValue() + j));
        }
    }

    public OtisCPUTime(long j, long j2, long j3, Map<Integer, Map<Long, Long>> map, long j4, Map<Integer, Long> map2, Map<Integer, Map<Integer, Long>> map3) {
        this.refreshTime = j;
        this.devCpu = j2;
        this.devIdle = j3;
        this.devCpuFreqMap = map;
        this.procCpu = j4;
        this.threadCpuMap = map2;
        this.threadCpuPolicyMap = map3;
    }
}
