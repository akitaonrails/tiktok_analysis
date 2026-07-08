package com.ss.android.ugc.effectmanager.common.monitor;

import X.C2188811AlT;
import android.os.SystemClock;
import com.ss.android.ugc.effectmanager.common.utils.TimeUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MonitorTrace {
    public long duration;
    public final String id;
    public boolean isTraceEnded;
    public final List<String> stepList = new ArrayList();
    public long traceBeginTimeMills;

    public final void begin() {
        if (!this.stepList.isEmpty()) {
            this.stepList.clear();
        }
        this.isTraceEnded = false;
        this.traceBeginTimeMills = SystemClock.uptimeMillis();
        addStep(">>>>>>> Trace Begin <<<<<<<");
    }

    public final void end() {
        addStep(">>>>>>> Trace End <<<<<<<");
        this.isTraceEnded = true;
        this.duration = SystemClock.uptimeMillis() - this.traceBeginTimeMills;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getStepList() {
        return this.stepList;
    }

    public MonitorTrace(String str) {
        this.id = str;
    }

    public final void addStep(String str) {
        if (!this.isTraceEnded) {
            List<String> list = this.stepList;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(TimeUtils.INSTANCE.currentTime());
            sbLIZ.append(" [");
            sbLIZ.append(this.id);
            sbLIZ.append("]->");
            sbLIZ.append(str);
            sbLIZ.append(" \n");
            list.add(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
