package com.bytedance.apm.agent.v2.instrumentation;

import android.text.TextUtils;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;

/* JADX INFO: loaded from: classes14.dex */
public class AppAgent {
    public static long attachBaseContextEndTime;
    public static long attachBaseContextStartTime;
    public static long constructorEndTime;
    public static long constructorStartTime;
    public static long onCreateEndTime;
    public static long onCreateStartTime;

    public static void onTrace(String str, boolean z) {
        if (TextUtils.equals(str, "<init>")) {
            if (z) {
                constructorStartTime = System.currentTimeMillis();
                return;
            } else {
                constructorEndTime = System.currentTimeMillis();
                return;
            }
        }
        if (TextUtils.equals(str, "attachBaseContext")) {
            if (z) {
                attachBaseContextStartTime = System.currentTimeMillis();
                return;
            } else {
                attachBaseContextEndTime = System.currentTimeMillis();
                return;
            }
        }
        if (!TextUtils.equals(str, "onCreate")) {
            return;
        }
        if (z) {
            onCreateStartTime = System.currentTimeMillis();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        onCreateEndTime = jCurrentTimeMillis;
        AutoLaunchTraceHelper.assignAppTime(constructorStartTime, constructorEndTime, attachBaseContextStartTime, attachBaseContextEndTime, onCreateStartTime, jCurrentTimeMillis);
    }
}
