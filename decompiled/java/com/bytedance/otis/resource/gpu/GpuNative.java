package com.bytedance.otis.resource.gpu;

import com.bytedance.otis.resource.util.EnsureLoad;

/* JADX INFO: loaded from: classes4.dex */
public final class GpuNative {
    public static final native double getGpuUsage(boolean z);

    static {
        new GpuNative();
        EnsureLoad.LIZ.init();
    }
}
