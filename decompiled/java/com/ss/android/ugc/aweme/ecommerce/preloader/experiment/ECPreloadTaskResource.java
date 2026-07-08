package com.ss.android.ugc.aweme.ecommerce.preloader.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class ECPreloadTaskResource {

    @C09CT("cpu")
    public final int cpu;

    @C09CT("memory")
    public final int memory;

    /* JADX INFO: renamed from: net, reason: collision with root package name */
    @C09CT("net")
    public final int f357net;

    @C09CT("task_type")
    public final String taskType;

    public ECPreloadTaskResource() {
        this("", 1, 1, 1);
    }

    public ECPreloadTaskResource(String str, int i, int i2, int i3) {
        this.taskType = str;
        this.cpu = i;
        this.memory = i2;
        this.f357net = i3;
    }
}
