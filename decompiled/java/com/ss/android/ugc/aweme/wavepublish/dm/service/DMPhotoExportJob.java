package com.ss.android.ugc.aweme.wavepublish.dm.service;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes23.dex */
public final class DMPhotoExportJob {
    public final CountDownLatch latch = new CountDownLatch(1);
    public final String outputPath;
    public volatile String resultPath;

    public final String getOutputPath() {
        return this.outputPath;
    }

    public final String getResultPath() {
        return this.resultPath;
    }

    public DMPhotoExportJob(String str) {
        this.outputPath = str;
    }

    public final boolean await(long j) {
        if (this.latch.await(j, TimeUnit.MILLISECONDS) && this.resultPath != null) {
            return true;
        }
        return false;
    }

    public final void markDone(String str) {
        this.resultPath = str;
        this.latch.countDown();
    }
}
