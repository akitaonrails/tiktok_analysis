package com.bytedance.monitor.collector;

import X.C791560V3i;
import X.C791610V3n;
import X.C791750V4b;
import android.util.Pair;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c {
    public final String LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final C791750V4b LIZLLL;

    public Pair<String, ?> LIZ() {
        return null;
    }

    public Pair<String, ?> LIZIZ(long j, long j2) {
        return null;
    }

    public void LIZLLL() {
        this.LIZIZ = 1;
    }

    public abstract void LJ(int i);

    public void LIZJ() {
        if (this.LIZIZ < 0) {
            throw new IllegalStateException("collector has destroyed, can not start.");
        }
        this.LIZIZ = 2;
    }

    public c(int i, String str) {
        this.LIZ = str;
        this.LIZJ = i;
        C791560V3i c791560V3iLIZLLL = C791560V3i.LIZLLL();
        if (!((CopyOnWriteArrayList) c791560V3iLIZLLL.LIZ).contains(this)) {
            ((CopyOnWriteArrayList) c791560V3iLIZLLL.LIZ).add(this);
            if (c791560V3iLIZLLL.LIZJ) {
                LIZJ();
            }
        }
        this.LIZLLL = C791610V3n.LIZ;
    }
}
