package com.ss.ugc.live.sdk.message;

import X.C20338614i8;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public final class MessageMonitorExtKt {
    public static final void logDebug(MessageMonitor messageMonitor, String str, Function0<String> function0) {
        if (C20338614i8.LIZ) {
            messageMonitor.mMessageContext.log(str, function0.invoke());
        }
    }
}
