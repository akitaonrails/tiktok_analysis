package com.bytedance.otis.resource.psi;

import X.C786410Ut5;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes35.dex */
public final class ResourceContentionSnapshot {
    public final long blockNs;
    public final long busyNs;
    public final long contentionNs;
    public final int cpuCoreCount;
    public final int cpuOnlineCount;
    public final String cpuPolicyCores;
    public final int cpuPolicyCount;
    public final long dispatchBlockNs;
    public final long dispatchFilterThresholdNs;
    public final long dispatchIowaitNs;
    public final long dispatchOnCpuNs;
    public final long dispatchSleepNs;
    public final long dispatchWaitNs;
    public final long dispatchWallNs;
    public final long endCount;
    public final long endNoDispatch;
    public final long execNs;
    public final boolean foreground;
    public final long gapBlockNs;
    public final long gapIowaitNs;
    public final long gapNs;
    public final long gapOnCpuNs;
    public final long gapSleepNs;
    public final long gapWaitNs;
    public final long gcStwPauseNs;
    public final long gcUnionNs;
    public final long idleIoNs;
    public final long idleNs;
    public final long involuntarySwitches;
    public final long iowaitNs;
    public final long longDispatchContentionNs;
    public final long longDispatchCount;
    public final long longDispatchOffCpuNs;
    public final float longDispatchOverBusy;
    public final boolean lowConfidence;
    public final int mainLastCpu;
    public final int mainLastCpuPolicy;
    public final long mainWaitGcNs;
    public final String processAllowedCpus;
    public final float ratioOverBusy;
    public final float ratioOverWall;
    public final long resourceWaitNs;
    public final float resourceWaitOverBusy;
    public final String scene;
    public final long shortDispatchCount;
    public final long shortDispatchFilteredOffCpuNs;
    public final long sleepNs;
    public final long startCount;
    public final long startNoGap;
    public final long timestampMs;
    public final long voluntarySwitches;
    public final long waitIoNs;
    public final float waitIoOverBusy;
    public final long waitNs;
    public final long wallNs;
    public final long windowSeq;

    public String toJson() {
        StringBuilder sb = new StringBuilder(640);
        sb.append("{\"ts\":");
        sb.append(this.timestampMs);
        sb.append(",\"scene\":\"");
        sb.append(this.scene);
        sb.append("\",\"seq\":");
        sb.append(this.windowSeq);
        sb.append(",\"wallNs\":");
        sb.append(this.wallNs);
        sb.append(",\"execNs\":");
        sb.append(this.execNs);
        sb.append(",\"idleNs\":");
        sb.append(this.idleNs);
        sb.append(",\"contentionNs\":");
        sb.append(this.contentionNs);
        sb.append(",\"busyNs\":");
        sb.append(this.busyNs);
        sb.append(",\"ratioOverBusy\":");
        sb.append(this.ratioOverBusy);
        sb.append(",\"ratioOverWall\":");
        sb.append(this.ratioOverWall);
        sb.append(",\"lowConfidence\":");
        sb.append(this.lowConfidence);
        sb.append(",\"idleIoNs\":");
        sb.append(this.idleIoNs);
        sb.append(",\"foreground\":");
        sb.append(this.foreground);
        sb.append(",\"iowaitNs\":");
        sb.append(this.iowaitNs);
        sb.append(",\"sleepNs\":");
        sb.append(this.sleepNs);
        sb.append(",\"blockNs\":");
        sb.append(this.blockNs);
        sb.append(",\"waitNs\":");
        sb.append(this.waitNs);
        sb.append(",\"voluntarySwitches\":");
        sb.append(this.voluntarySwitches);
        sb.append(",\"involuntarySwitches\":");
        sb.append(this.involuntarySwitches);
        sb.append(",\"dispatchWallNs\":");
        sb.append(this.dispatchWallNs);
        sb.append(",\"dispatchWaitNs\":");
        sb.append(this.dispatchWaitNs);
        sb.append(",\"dispatchOnCpuNs\":");
        sb.append(this.dispatchOnCpuNs);
        sb.append(",\"dispatchSleepNs\":");
        sb.append(this.dispatchSleepNs);
        sb.append(",\"dispatchBlockNs\":");
        sb.append(this.dispatchBlockNs);
        sb.append(",\"dispatchIowaitNs\":");
        sb.append(this.dispatchIowaitNs);
        sb.append(",\"gapNs\":");
        sb.append(this.gapNs);
        sb.append(",\"gapOnCpuNs\":");
        sb.append(this.gapOnCpuNs);
        sb.append(",\"gapWaitNs\":");
        sb.append(this.gapWaitNs);
        sb.append(",\"gapSleepNs\":");
        sb.append(this.gapSleepNs);
        sb.append(",\"gapBlockNs\":");
        sb.append(this.gapBlockNs);
        sb.append(",\"gapIowaitNs\":");
        sb.append(this.gapIowaitNs);
        sb.append(",\"waitIoNs\":");
        sb.append(this.waitIoNs);
        sb.append(",\"waitIoOverBusy\":");
        sb.append(this.waitIoOverBusy);
        sb.append(",\"mainWaitGcNs\":");
        sb.append(this.mainWaitGcNs);
        sb.append(",\"gcStwPauseNs\":");
        sb.append(this.gcStwPauseNs);
        sb.append(",\"gcUnionNs\":");
        sb.append(this.gcUnionNs);
        sb.append(",\"resourceWaitNs\":");
        sb.append(this.resourceWaitNs);
        sb.append(",\"resourceWaitOverBusy\":");
        sb.append(this.resourceWaitOverBusy);
        sb.append(",\"longDispatchContentionNs\":");
        sb.append(this.longDispatchContentionNs);
        sb.append(",\"longDispatchOverBusy\":");
        sb.append(this.longDispatchOverBusy);
        sb.append(",\"longDispatchOffCpuNs\":");
        sb.append(this.longDispatchOffCpuNs);
        sb.append(",\"shortDispatchFilteredOffCpuNs\":");
        sb.append(this.shortDispatchFilteredOffCpuNs);
        sb.append(",\"longDispatchCount\":");
        sb.append(this.longDispatchCount);
        sb.append(",\"shortDispatchCount\":");
        sb.append(this.shortDispatchCount);
        sb.append(",\"dispatchFilterThresholdNs\":");
        sb.append(this.dispatchFilterThresholdNs);
        sb.append(",\"startCount\":");
        sb.append(this.startCount);
        sb.append(",\"endCount\":");
        sb.append(this.endCount);
        sb.append(",\"startNoGap\":");
        sb.append(this.startNoGap);
        sb.append(",\"endNoDispatch\":");
        sb.append(this.endNoDispatch);
        sb.append(",\"cpuCoreCount\":");
        sb.append(this.cpuCoreCount);
        sb.append(",\"cpuOnlineCount\":");
        sb.append(this.cpuOnlineCount);
        sb.append(",\"cpuPolicyCount\":");
        sb.append(this.cpuPolicyCount);
        sb.append(",\"cpuPolicyCores\":\"");
        sb.append(escape(this.cpuPolicyCores));
        sb.append("\",\"mainLastCpu\":");
        sb.append(this.mainLastCpu);
        sb.append(",\"mainLastCpuPolicy\":");
        sb.append(this.mainLastCpuPolicy);
        sb.append(",\"processAllowedCpus\":\"");
        sb.append(escape(this.processAllowedCpus));
        sb.append("\"}");
        return sb.toString();
    }

    public String toString() {
        return toJson();
    }

    public static String escape(String str) {
        String strJ4;
        int length = str.length();
        StringBuilder sb = null;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\f') {
                if (cCharAt != '\r') {
                    if (cCharAt != '\"') {
                        if (cCharAt != '\\') {
                            switch (cCharAt) {
                                case '\b':
                                    strJ4 = "\\b";
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    strJ4 = "\\t";
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    strJ4 = "\\n";
                                    break;
                                default:
                                    if (cCharAt >= ' ' || (strJ4 = C786410Ut5.j4("\\u%04x", new Object[]{Integer.valueOf(cCharAt)})) == null) {
                                        if (sb != null) {
                                            sb.append(cCharAt);
                                        }
                                    }
                                    break;
                            }
                        } else {
                            strJ4 = "\\\\";
                        }
                    } else {
                        strJ4 = "\\\"";
                    }
                } else {
                    strJ4 = "\\r";
                }
            } else {
                strJ4 = "\\f";
            }
            if (sb == null) {
                sb = new StringBuilder(length + 16);
                sb.append((CharSequence) str, 0, i);
            }
            sb.append(strJ4);
        }
        if (sb != null) {
            return sb.toString();
        }
        return str;
    }

    public ResourceContentionSnapshot(long j, String str, long j2, long j3, long j4, long j5, long j6, long j7, float f, float f2, boolean z, long j8, boolean z2, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j28, float f3, long j29, long j30, long j31, long j32, float f4, long j33, float f5, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, int i, int i2, int i3, String str2, int i4, int i5, String str3) {
        this.timestampMs = j;
        this.scene = str;
        this.windowSeq = j2;
        this.wallNs = j3;
        this.execNs = j4;
        this.idleNs = j5;
        this.contentionNs = j6;
        this.busyNs = j7;
        this.ratioOverBusy = f;
        this.ratioOverWall = f2;
        this.lowConfidence = z;
        this.idleIoNs = j8;
        this.foreground = z2;
        this.iowaitNs = j9;
        this.sleepNs = j10;
        this.blockNs = j11;
        this.waitNs = j12;
        this.voluntarySwitches = j13;
        this.involuntarySwitches = j14;
        this.dispatchWallNs = j15;
        this.dispatchWaitNs = j16;
        this.dispatchOnCpuNs = j17;
        this.dispatchSleepNs = j18;
        this.dispatchBlockNs = j19;
        this.dispatchIowaitNs = j20;
        this.gapNs = j21;
        this.gapOnCpuNs = j22;
        this.gapWaitNs = j23;
        this.gapSleepNs = j24;
        this.gapBlockNs = j25;
        this.gapIowaitNs = j26;
        this.waitIoNs = j28;
        this.waitIoOverBusy = f3;
        this.mainWaitGcNs = j29;
        this.gcStwPauseNs = j30;
        this.gcUnionNs = j31;
        this.resourceWaitNs = j32;
        this.resourceWaitOverBusy = f4;
        this.longDispatchContentionNs = j33;
        this.longDispatchOverBusy = f5;
        this.longDispatchOffCpuNs = j34;
        this.shortDispatchFilteredOffCpuNs = j35;
        this.longDispatchCount = j36;
        this.shortDispatchCount = j37;
        this.dispatchFilterThresholdNs = j38;
        this.startCount = j39;
        this.endCount = j40;
        this.startNoGap = j41;
        this.endNoDispatch = j42;
        this.cpuCoreCount = i;
        this.cpuOnlineCount = i2;
        this.cpuPolicyCount = i3;
        this.cpuPolicyCores = str2;
        this.mainLastCpu = i4;
        this.mainLastCpuPolicy = i5;
        this.processAllowedCpus = str3;
    }
}
