package com.ss.android.ugc.aweme.legoImp.task;

import X.C09CT;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCollector {
    public static int LIZ;
    public static final Map<Integer, String> LIZIZ;

    /* JADX INFO: loaded from: classes14.dex */
    public static class MemoryCollectorParams {

        @C09CT("enable")
        public boolean enable;

        @C09CT("interval_min")
        public int intervalInMin;

        @C09CT("max_memory_type")
        public int maxMemoryTypeCount;

        @C09CT("start_report_min")
        public int startReportMin;
    }

    static {
        HashMap map = new HashMap();
        LIZIZ = map;
        map.put(6, "code_so");
        map.put(7, "code_jar");
        map.put(8, "code_apk");
        map.put(9, "code_ttf");
        map.put(10, "code_dex");
        map.put(11, "code_oat");
        map.put(23, "code_zygote");
        map.put(24, "code_app");
        map.put(12, "java_art");
        map.put(17, "java_normal");
        map.put(18, "java_large");
        map.put(19, "java_zygote");
        map.put(20, "java_nonmoving");
    }
}
