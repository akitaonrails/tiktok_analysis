package com.bytedance.otis.resource.thread;

import com.bytedance.otis.resource.util.EnsureLoad;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class ThreadStatusNative {
    public static final native void getAllThreadCpuTime(HashMap<String, Long> map, long j);

    public static final native void getStatus(HashMap<Character, Integer> map);

    public static final native void getStatusDetail(HashMap<Character, Set<String>> map);

    static {
        new ThreadStatusNative();
        EnsureLoad.LIZ.init();
    }
}
