package com.ss.android.ugc.aweme.im.common.perfmonitor.impl;

import com.ss.android.ugc.aweme.im.common.perfmonitor.api.IStopwatchFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class SimpleStopwatchFactory implements IStopwatchFactory {
    @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.api.IStopwatchFactory
    public final SimpleStopwatch LIZ() {
        return new SimpleStopwatch(null);
    }

    @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.api.IStopwatchFactory
    public final SimpleStopwatch LIZIZ() {
        SimpleStopwatch simpleStopwatch = new SimpleStopwatch(null);
        simpleStopwatch.start();
        return simpleStopwatch;
    }
}
