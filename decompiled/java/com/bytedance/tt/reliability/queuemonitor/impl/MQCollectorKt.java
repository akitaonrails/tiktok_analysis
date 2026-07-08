package com.bytedance.tt.reliability.queuemonitor.impl;

import android.os.Looper;
import android.util.Log;
import android.util.Printer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class MQCollectorKt {
    public static final Printer tryGetLogger(Looper looper) {
        try {
            Field field = Looper.class.getField("mLogging");
            field.setAccessible(true);
            Object obj = field.get(looper);
            if (obj instanceof Printer) {
                return (Printer) obj;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            System.out.println(Intrinsics.LJIIJJI(Log.getStackTraceString(th), "QueueMonitor: tryGetLogger error: "));
        }
        return null;
    }
}
