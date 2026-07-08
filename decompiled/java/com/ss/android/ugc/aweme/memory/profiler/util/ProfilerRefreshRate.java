package com.ss.android.ugc.aweme.memory.profiler.util;

import X.C0WZX;
import X.C13BV;
import X.C13LQ;
import X.C20085613iQ;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public final class ProfilerRefreshRate {
    public static volatile float currentRate;
    public static DisplayManager.DisplayListener displayListener;
    public static DisplayManager displayManager;
    public static final ProfilerRefreshRate INSTANCE = new ProfilerRefreshRate();
    public static List<Display.Mode> supportedModes = C13BV.INSTANCE;
    public static final int $stable = 8;

    public final void stop() {
        DisplayManager displayManager2 = displayManager;
        if (displayManager2 != null) {
            displayManager2.unregisterDisplayListener(displayListener);
        }
        displayManager = null;
        displayListener = null;
    }

    private final void initByWindow(Context context) {
        WindowManager windowManager;
        Display displayLLILZIL;
        List<Display.Mode> listLJJLIIIIJ;
        Object objH2 = C786410Ut5.H2(context, "window");
        if (!(objH2 instanceof WindowManager) || (windowManager = (WindowManager) objH2) == null || (displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOetbpDcxXxPbnBUcWNzASDwoiQv4uYY/XKjZsZXAjtAwTI4SxT6lys=", null))) == null) {
            return;
        }
        currentRate = displayLLILZIL.getRefreshRate();
        Display.Mode[] supportedModes2 = displayLLILZIL.getSupportedModes();
        if (supportedModes2 != null && (listLJJLIIIIJ = C13LQ.LJJLIIIIJ(new Comparator() { // from class: com.ss.android.ugc.aweme.memory.profiler.util.ProfilerRefreshRate$initByWindow$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C20085613iQ.LIZIZ(Float.valueOf(((Display.Mode) t).getRefreshRate()), Float.valueOf(((Display.Mode) t2).getRefreshRate()));
            }
        }, supportedModes2)) != null) {
            Iterator<Display.Mode> it2 = listLJJLIIIIJ.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        } else {
            listLJJLIIIIJ = C13BV.INSTANCE;
        }
        supportedModes = listLJJLIIIIJ;
    }

    private final void initListener(Context context, final Function1<? super Float, Unit> function1) {
        final DisplayManager displayManager2;
        Object objH2 = C786410Ut5.H2(context, "display");
        if ((objH2 instanceof DisplayManager) && (displayManager2 = (DisplayManager) objH2) != null) {
            displayManager = displayManager2;
            DisplayManager.DisplayListener displayListener2 = new DisplayManager.DisplayListener() { // from class: com.ss.android.ugc.aweme.memory.profiler.util.ProfilerRefreshRate.initListener.1
                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayAdded(int i) {
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayRemoved(int i) {
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayChanged(int i) {
                    Display display = displayManager2.getDisplay(i);
                    if (display != null) {
                        Float fValueOf = Float.valueOf(display.getRefreshRate());
                        float fFloatValue = fValueOf.floatValue();
                        if (fFloatValue > 0.0f && fFloatValue != ProfilerRefreshRate.currentRate) {
                            Function1<Float, Unit> function12 = function1;
                            float fFloatValue2 = fValueOf.floatValue();
                            ProfilerRefreshRate.currentRate = fFloatValue2;
                            if (function12 != null) {
                                function12.invoke(Float.valueOf(fFloatValue2));
                            }
                        }
                    }
                }
            };
            displayListener = displayListener2;
            DisplayManager displayManager3 = displayManager;
            if (displayManager3 != null) {
                displayManager3.registerDisplayListener(displayListener2, null);
            }
        }
    }

    public final void start(Context context, Function1<? super Float, Unit> function1) {
        if (displayListener != null) {
            return;
        }
        Context contextN3 = C786410Ut5.N3(context);
        initByWindow(contextN3);
        if (function1 != null && currentRate > 0.0f) {
            function1.invoke(Float.valueOf(currentRate));
        }
        initListener(contextN3, function1);
    }
}
