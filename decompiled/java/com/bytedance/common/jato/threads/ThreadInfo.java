package com.bytedance.common.jato.threads;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public class ThreadInfo {
    public int lockTid;
    public long nativePeer;
    public int stm;
    public String threadName;
    public int tid;
    public int utm;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThreadInfo{tid=");
        sbLIZ.append(this.tid);
        sbLIZ.append(", lock_tid=");
        sbLIZ.append(this.lockTid);
        sbLIZ.append(", threadPeer=");
        sbLIZ.append(this.nativePeer);
        sbLIZ.append(", threadName='");
        sbLIZ.append(this.threadName);
        sbLIZ.append('\'');
        sbLIZ.append(", utm=");
        sbLIZ.append(this.utm);
        sbLIZ.append(", stm=");
        sbLIZ.append(this.stm);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getLockTid() {
        return this.lockTid;
    }

    public long getNativePeer() {
        return this.nativePeer;
    }

    public int getStm() {
        return this.stm;
    }

    public String getThreadName() {
        return this.threadName;
    }

    public int getTid() {
        return this.tid;
    }

    public int getUtm() {
        return this.utm;
    }
}
