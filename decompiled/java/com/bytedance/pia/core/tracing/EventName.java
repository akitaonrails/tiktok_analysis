package com.bytedance.pia.core.tracing;

import X.C08FF;

/* JADX INFO: loaded from: classes35.dex */
public enum EventName {
    NavigateStart,
    WorkerEnvironmentInitializeStart,
    WorkerEnvironmentInitializeEnd,
    WorkerScriptRequestStart,
    WorkerScriptRequestEnd,
    WorkerExecuteStart,
    HTMLRequestStart,
    HTMLResponseStart,
    HTMLResponseEnd,
    ResourceInterceptStart,
    ResourceInterceptEnd,
    PreloadResourceStart,
    PreloadResourceEnd;

    public static EventName valueOf(String str) {
        return (EventName) C08FF.LIZ(EventName.class, str);
    }
}
