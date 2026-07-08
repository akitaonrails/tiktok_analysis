package com.ss.android.ugc.aweme.im.common.perfmonitor.impl;

import X.C1446105lL;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.Stopwatch;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class SimpleStopwatch implements Stopwatch {
    public final Function0<Long> LIZ;
    public long LIZIZ;
    public long LIZJ;

    public SimpleStopwatch() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.api.Stopwatch
    public final long LIZ() {
        return this.LIZJ - this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.api.Stopwatch
    public final boolean isRunning() {
        return this.LIZIZ > 0 && this.LIZJ == 0;
    }

    @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.api.Stopwatch
    public final void start() {
        this.LIZIZ = this.LIZ.invoke().longValue();
    }

    @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.api.Stopwatch
    public final void stop() {
        this.LIZJ = this.LIZ.invoke().longValue();
    }

    public SimpleStopwatch(Object obj) {
        this.LIZ = C1446105lL.LL;
    }
}
