package net.jpountz.util;

import X.C08FF;
import X.C0VSV;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes24.dex */
public enum Native {
    ;

    public static boolean loaded;

    public static String arch() {
        return System.getProperty("os.arch");
    }

    public static synchronized boolean isLoaded() {
        return loaded;
    }

    public static synchronized void load() {
        if (loaded) {
            return;
        }
        try {
            INVOKESTATIC_net_jpountz_util_Native_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lz4-java");
            loaded = true;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            String strResourceName = resourceName();
            InputStream inputStreamLJLLI = C786410Ut5.LJLLI(Native.class, strResourceName);
            if (inputStreamLJLLI == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unsupported OS/arch, cannot find ");
                sbLIZ.append(strResourceName);
                sbLIZ.append(". Please try building from source.");
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
            }
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(e3.d);
                sbLIZ2.append(os().libExtension);
                File fileCreateTempFile = File.createTempFile("liblz4-java", C2188811AlT.LIZIZ(sbLIZ2));
                C0VSV c0vsv = new C0VSV(fileCreateTempFile);
                try {
                    byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                    while (true) {
                        int i = inputStreamLJLLI.read(bArr);
                        if (i == -1) {
                            break;
                        } else {
                            c0vsv.write(bArr, 0, i);
                        }
                    }
                    try {
                        c0vsv.close();
                        c0vsv = null;
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    System.load(fileCreateTempFile.getAbsolutePath());
                    loaded = true;
                    if (c0vsv != null) {
                        try {
                            c0vsv.close();
                        } catch (IOException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        }
                    }
                    if (fileCreateTempFile.exists()) {
                        if (loaded) {
                            fileCreateTempFile.deleteOnExit();
                        } else {
                            fileCreateTempFile.delete();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (c0vsv != null) {
                        try {
                            c0vsv.close();
                        } catch (IOException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                    }
                    if (!fileCreateTempFile.exists()) {
                        throw th;
                    }
                    if (loaded) {
                        fileCreateTempFile.deleteOnExit();
                        throw th;
                    }
                    fileCreateTempFile.delete();
                    throw th;
                }
            } catch (IOException e5) {
                TryCatchGuardChecker.doCheck(e5);
                throw new ExceptionInInitializerError("Cannot unpack liblz4-java");
            }
        }
    }

    public static OS os() {
        String property = System.getProperty("os.name");
        if (property.contains("Linux")) {
            return OS.LINUX;
        }
        if (property.contains("Mac")) {
            return OS.MAC;
        }
        if (property.contains("Windows")) {
            return OS.WINDOWS;
        }
        if (property.contains("Solaris") || property.contains("SunOS")) {
            return OS.SOLARIS;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unsupported operating system: ");
        sbLIZ.append(property);
        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String resourceName() {
        OS os = os();
        String strReplace = Native.class.getPackage().getName().replace('.', '/');
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/");
        sbLIZ.append(strReplace);
        sbLIZ.append("/");
        sbLIZ.append(os.name);
        sbLIZ.append("/");
        sbLIZ.append(arch());
        sbLIZ.append("/liblz4-java.");
        sbLIZ.append(os.libExtension);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public enum OS {
        WINDOWS("win32", "so"),
        LINUX("linux", "so"),
        MAC("darwin", "dylib"),
        SOLARIS("solaris", "so");

        public final String libExtension;
        public final String name;

        public static OS valueOf(String str) {
            return (OS) C08FF.LIZ(OS.class, str);
        }

        OS(String str, String str2) {
            this.name = str;
            this.libExtension = str2;
        }
    }

    public static void INVOKESTATIC_net_jpountz_util_Native_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static Native valueOf(String str) {
        return (Native) C08FF.LIZ(Native.class, str);
    }
}
