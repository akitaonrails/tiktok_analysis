package com.bytedance.ies.nleeditor;

import X.C01GW;
import X.C1697810uHb;
import X.C357100DzI;
import X.C452501pT;
import X.InterfaceC357090DzH;
import android.os.SystemClock;
import com.bytedance.ies.nle.editor_jni.INLEMonitor;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLELogger;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMonitor;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.List;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class NLE {
    public static boolean _useNativeLogger;
    public static volatile boolean hasTemplateLibLoaded;
    public static boolean libraryHasLoaded;
    public static NLELoggerListener logger;
    public static INLEMonitor monitor;
    public static final NLE INSTANCE = new NLE();
    public static final C01GW actualLoggerListener$delegate = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(30));
    public static LogLevel logLevel = LogLevel.LEVEL_INFO;
    public static InterfaceC357090DzH libraryLoader = new InterfaceC357090DzH() { // from class: X.08BG
        @Override // X.InterfaceC357090DzH
        public final boolean onLoadNativeLibs(List<String> list) {
            for (String str : list) {
                LoadSoLancet.LIZJ(str);
                long jUptimeMillis = SystemClock.uptimeMillis();
                Librarian.LJFF(str);
                LoadSoLancet.LJ(jUptimeMillis, str);
                LoadSoLancet.LIZLLL(jUptimeMillis, str);
                LoadSoLancet.LIZIZ(str);
            }
            return true;
        }
    };

    public final void loadNLELibrary() {
        loadNLELibrary$default(this, false, false, false, 7, null);
    }

    public final void loadNLELibrary(boolean z) {
        loadNLELibrary$default(this, z, false, false, 6, null);
    }

    public final void loadNLELibrary(boolean z, boolean z2) {
        loadNLELibrary$default(this, z, z2, false, 4, null);
    }

    private final C357100DzI getActualLoggerListener() {
        return (C357100DzI) actualLoggerListener$delegate.getValue();
    }

    public final InterfaceC357090DzH getLibraryLoader() {
        return libraryLoader;
    }

    public final LogLevel getLogLevel() {
        return logLevel;
    }

    public final NLELoggerListener getLogger() {
        return logger;
    }

    public final INLEMonitor getMonitor() {
        return monitor;
    }

    public final boolean hasTemplateLibLoaded() {
        return hasTemplateLibLoaded;
    }

    public final void setLibraryLoader(InterfaceC357090DzH interfaceC357090DzH) {
        libraryLoader = interfaceC357090DzH;
    }

    public final void setLogLevel(LogLevel logLevel2) {
        logLevel = logLevel2;
        if (libraryHasLoaded) {
            NLELogger.obtain().setLogLevel(logLevel2);
        }
    }

    public final void setLogger(NLELoggerListener nLELoggerListener) {
        if (libraryHasLoaded && logger == null) {
            NLELogger.obtain().setDelegate(getActualLoggerListener(), _useNativeLogger);
        }
        logger = nLELoggerListener;
    }

    public final void setMonitor(INLEMonitor iNLEMonitor) {
        if (libraryHasLoaded && iNLEMonitor != null) {
            NLEMonitor.obtain().setListener(iNLEMonitor);
        }
        monitor = iNLEMonitor;
    }

    public final synchronized void loadNLELibrary(boolean z, boolean z2, boolean z3) {
        List<String> listLJIILJJIL = C1697810uHb.LJIILJJIL("NLEEditorJni");
        if (z3) {
            listLJIILJJIL.add("NLEMediaJni");
        }
        if (z) {
            listLJIILJJIL.add("NLETemplateModelJni");
        }
        libraryLoader.onLoadNativeLibs(listLJIILJJIL);
        if (z) {
            hasTemplateLibLoaded = true;
        }
        if (!libraryHasLoaded) {
            _useNativeLogger = z2;
            if (logger != null) {
                NLELogger.obtain().setDelegate(INSTANCE.getActualLoggerListener(), z2);
            }
            NLELogger.obtain().setLogLevel(logLevel);
            INLEMonitor iNLEMonitor = monitor;
            if (iNLEMonitor != null) {
                NLEMonitor.obtain().setListener(iNLEMonitor);
            }
        }
        libraryHasLoaded = true;
    }

    public static /* synthetic */ void loadNLELibrary$default(NLE nle, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        nle.loadNLELibrary(z, z2, z3);
    }
}
