package com.ss.ugc.effectplatform.model;

import X.C09CT;
import X.C19989513Jd;
import X.C19989613Je;
import X.C19989713Jf;
import X.C19989813Jg;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1841100y0i;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986513Hz;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i
public final class PerfMetricEntry {
    public static final C19989613Je Companion = new C19989613Je();

    /* JADX INFO: renamed from: avg, reason: collision with root package name */
    @C09CT("avg")
    public final double f442avg;

    @C09CT("freq")
    public final int freq;

    public PerfMetricEntry() {
        this(0, 0.0d);
    }

    public static /* synthetic */ void getAvg$annotations() {
    }

    public static /* synthetic */ void getFreq$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerfMetricEntry)) {
            return false;
        }
        PerfMetricEntry perfMetricEntry = (PerfMetricEntry) obj;
        return this.freq == perfMetricEntry.freq && Double.compare(this.f442avg, perfMetricEntry.f442avg) == 0;
    }

    public int hashCode() {
        return (this.freq * 31) + C786410Ut5.X2(this.f442avg);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PerfMetricEntry(freq=");
        sbLIZ.append(this.freq);
        sbLIZ.append(", avg=");
        sbLIZ.append(this.f442avg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PerfMetricEntry(int i, double d) {
        this.freq = i;
        this.f442avg = d;
    }

    public static final /* synthetic */ void write$Self$ckresource_model_release(PerfMetricEntry perfMetricEntry, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
        if (interfaceC19986513Hz.LJIJJ() || perfMetricEntry.freq != 0) {
            interfaceC19986513Hz.LJ(0, perfMetricEntry.freq, interfaceC19983313Gt);
        }
        if (interfaceC19986513Hz.LJIJJ() || Double.compare(perfMetricEntry.f442avg, 0.0d) != 0) {
            interfaceC19986513Hz.LJIIJJI(interfaceC19983313Gt, 1, perfMetricEntry.f442avg);
        }
    }

    public /* synthetic */ PerfMetricEntry(int i, int i2, double d, C19989813Jg c19989813Jg) {
        if (0 == 0) {
            if ((i & 1) == 0) {
                this.freq = 0;
            } else {
                this.freq = i2;
            }
            if ((i & 2) == 0) {
                this.f442avg = 0.0d;
                return;
            } else {
                this.f442avg = d;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, C19989513Jd.LIZ.getDescriptor());
        throw null;
    }
}
