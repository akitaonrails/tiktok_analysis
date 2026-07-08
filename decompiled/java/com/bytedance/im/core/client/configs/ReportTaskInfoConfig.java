package com.bytedance.im.core.client.configs;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public class ReportTaskInfoConfig implements Serializable {

    @C09CT("enable")
    public int enable;

    @C09CT("timeout_duration_ms")
    public long timeoutDurationMs = 8000;

    @C09CT("execute_too_long_ms")
    public long executeTooLongMs = 8000;

    @C09CT("callback_too_long_ms")
    public long callbackTooLongMs = 2000;
}
