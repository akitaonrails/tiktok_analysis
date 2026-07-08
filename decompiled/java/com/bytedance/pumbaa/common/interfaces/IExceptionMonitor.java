package com.bytedance.pumbaa.common.interfaces;

import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public interface IExceptionMonitor {
    void monitorNativeException(String str, String str2, String str3, String str4, Map<String, String> map);

    void monitorThrowable(String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2);

    void monitorThrowable(Throwable th, String str, Map<String, String> map);

    void setDebugMode(boolean z);
}
