package com.bytedance.memrelief.monitor;

import X.InterfaceC1294060jmO;
import com.bytedance.memrelief.utils.EnsureLoad;

/* JADX INFO: loaded from: classes4.dex */
public final class JniPageFault {
    public static final JniPageFault LIZ = new JniPageFault();

    @InterfaceC1294060jmO
    public final native long getCurrentThreadMajorFaults(int i);

    @InterfaceC1294060jmO
    public final native long getCurrentThreadMinorFaults(int i);

    public final native long[] getProcessFaults();

    public final native long[] getProcessFaultsByNew();

    @InterfaceC1294060jmO
    public final native long getProcessMajorFaults();

    @InterfaceC1294060jmO
    public final native long getProcessMinorFaults();

    public final native long[] getThreadFaults(int i);

    public final native long[] getThreadFaultsByNew();

    static {
        EnsureLoad.init();
    }
}
