package com.bytedance.ies.sdk.widgets;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS301S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class LayeredElementConfiguration {
    public static boolean debug;
    public static boolean guidelineIndicatorEnabled;
    public static final LayeredElementConfiguration INSTANCE = new LayeredElementConfiguration();
    public static long animationDuration = 300;
    public static Function2<? super String, ? super Throwable, Unit> sladarReporter = AFwS301S0000000_17.get$arr$(15);

    public final long getAnimationDuration() {
        return animationDuration;
    }

    public final boolean getDebug() {
        return debug;
    }

    public final boolean getGuidelineIndicatorEnabled() {
        return guidelineIndicatorEnabled;
    }

    public final Function2<String, Throwable, Unit> getSladarReporter() {
        return sladarReporter;
    }

    public final void setAnimationDuration(long j) {
        animationDuration = j;
    }

    public final void setDebug(boolean z) {
        debug = z;
    }

    public final void setGuidelineIndicatorEnabled(boolean z) {
        guidelineIndicatorEnabled = z;
    }

    public final void setSladarReporter(Function2<? super String, ? super Throwable, Unit> function2) {
        sladarReporter = function2;
    }

    public static final void reportException(String str, Throwable th) {
        sladarReporter.invoke(str, th);
    }
}
