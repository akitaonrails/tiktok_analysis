package com.bytedance.tt.reliability.queuemonitor.api;

import android.os.Handler;
import com.bytedance.tt.reliability.queuemonitor.model.QueueType;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes4.dex */
public interface MonitorHelper {
    Map<String, Object> appendCommonParams(Handler handler);

    Map<String, Object> appendCommonParams(ThreadPoolExecutor threadPoolExecutor);

    String buildGroupTag(Handler handler);

    String buildGroupTag(ThreadPoolExecutor threadPoolExecutor);

    boolean filterCallerKeyPoint(QueueType queueType, StackTraceElement stackTraceElement);
}
