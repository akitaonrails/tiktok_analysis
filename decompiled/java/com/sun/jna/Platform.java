package com.sun.jna;

import X.C0VSJ;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes31.dex */
public final class Platform {
    public static final String ARCH;
    public static final String C_LIBRARY_NAME;
    public static final boolean HAS_AWT;
    public static final boolean HAS_BUFFERS;
    public static final boolean HAS_DLL_CALLBACKS;
    public static final boolean HAS_JAWT;
    public static final String MATH_LIBRARY_NAME;
    public static final String RESOURCE_PREFIX;
    public static final boolean RO_FIELDS;
    public static final int osType;

    static {
        boolean z;
        String property = System.getProperty("os.name");
        boolean z2 = false;
        if (property.startsWith("Linux")) {
            if ("dalvik".equals(System.getProperty("java.vm.name").toLowerCase())) {
                osType = 8;
                System.setProperty("jna.nounpack", "true");
            } else {
                osType = 1;
            }
        } else if (property.startsWith("AIX")) {
            osType = 7;
        } else if (property.startsWith("Mac") || property.startsWith("Darwin")) {
            osType = 0;
        } else if (property.startsWith("Windows CE")) {
            osType = 6;
        } else if (property.startsWith("Windows")) {
            osType = 2;
        } else if (property.startsWith("Solaris") || property.startsWith("SunOS")) {
            osType = 3;
        } else if (property.startsWith("FreeBSD")) {
            osType = 4;
        } else if (property.startsWith("OpenBSD")) {
            osType = 5;
        } else if (property.equalsIgnoreCase("gnu")) {
            osType = 9;
        } else if (property.equalsIgnoreCase("gnu/kfreebsd")) {
            osType = 10;
        } else if (property.equalsIgnoreCase("netbsd")) {
            osType = 11;
        } else {
            osType = -1;
        }
        try {
            Class.forName("java.nio.Buffer");
            z = true;
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            z = false;
        }
        int i = osType;
        boolean z3 = (i == 6 || i == 8 || i == 7) ? false : true;
        HAS_AWT = z3;
        HAS_JAWT = z3 && i != 0;
        HAS_BUFFERS = z;
        RO_FIELDS = i != 6;
        String str = "coredll";
        C_LIBRARY_NAME = i == 2 ? "msvcrt" : i == 6 ? "coredll" : "c";
        if (i == 2) {
            str = "msvcrt";
        } else if (i != 6) {
            str = "m";
        }
        MATH_LIBRARY_NAME = str;
        String canonicalArchitecture = getCanonicalArchitecture(System.getProperty("os.arch"), i);
        ARCH = canonicalArchitecture;
        if (i == 2 && !canonicalArchitecture.startsWith("aarch")) {
            z2 = true;
        }
        HAS_DLL_CALLBACKS = z2;
        RESOURCE_PREFIX = getNativeLibraryResourcePrefix();
    }

    public static String getNativeLibraryResourcePrefix() {
        String property = System.getProperty("jna.prefix");
        return property != null ? property : getNativeLibraryResourcePrefix(getOSType(), System.getProperty("os.arch"), System.getProperty("os.name"));
    }

    public static final boolean is64Bit() {
        String property = System.getProperty("sun.arch.data.model", System.getProperty("com.ibm.vm.bitmode"));
        if (property != null) {
            return "64".equals(property);
        }
        String str = ARCH;
        return "x86-64".equals(str) || "ia64".equals(str) || "ppc64".equals(str) || "ppc64le".equals(str) || "sparcv9".equals(str) || "mips64".equals(str) || "mips64el".equals(str) || "loongarch64".equals(str) || "amd64".equals(str) || "aarch64".equals(str) || Native.POINTER_SIZE == 8;
    }

    public static final boolean isAIX() {
        return osType == 7;
    }

    public static final boolean isARM() {
        String str = ARCH;
        return str.startsWith("arm") || str.startsWith("aarch");
    }

    public static final boolean isAndroid() {
        return osType == 8;
    }

    public static final boolean isFreeBSD() {
        return osType == 4;
    }

    public static final boolean isGNU() {
        return osType == 9;
    }

    public static final boolean isIntel() {
        return ARCH.startsWith("x86");
    }

    public static final boolean isLinux() {
        return osType == 1;
    }

    public static final boolean isLoongArch() {
        return ARCH.startsWith("loongarch");
    }

    public static final boolean isMIPS() {
        String str = ARCH;
        return str.equals("mips") || str.equals("mips64") || str.equals("mipsel") || str.equals("mips64el");
    }

    public static final boolean isMac() {
        return osType == 0;
    }

    public static final boolean isNetBSD() {
        return osType == 11;
    }

    public static final boolean isOpenBSD() {
        return osType == 5;
    }

    public static final boolean isPPC() {
        return ARCH.startsWith("ppc");
    }

    public static final boolean isSPARC() {
        return ARCH.startsWith("sparc");
    }

    public static boolean isSoftFloat() {
        try {
            if (new C0VSJ("/proc/self/exe").exists()) {
                return !ELFAnalyser.analyse(r1.getCanonicalPath()).isArmHardFloat();
            }
            return false;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            Logger.getLogger(Platform.class.getName()).log(Level.INFO, "Failed to read '/proc/self/exe' or the target binary.", (Throwable) e);
            return false;
        } catch (SecurityException e2) {
            TryCatchGuardChecker.doCheck(e2);
            Logger.getLogger(Platform.class.getName()).log(Level.INFO, "SecurityException while analysing '/proc/self/exe' or the target binary.", (Throwable) e2);
            return false;
        }
    }

    public static final boolean isSolaris() {
        return osType == 3;
    }

    public static final boolean isWindows() {
        int i = osType;
        return i == 2 || i == 6;
    }

    public static final boolean isWindowsCE() {
        return osType == 6;
    }

    public static final boolean iskFreeBSD() {
        return osType == 10;
    }

    public static final boolean hasRuntimeExec() {
        return (isWindowsCE() && "J9".equals(System.getProperty("java.vm.name"))) ? false : true;
    }

    public static final boolean isX11() {
        return (isWindows() || isMac()) ? false : true;
    }

    public static final int getOSType() {
        return osType;
    }

    public static String getCanonicalArchitecture(String str, int i) {
        String strTrim = str.toLowerCase().trim();
        if ("powerpc".equals(strTrim)) {
            strTrim = "ppc";
        } else if ("powerpc64".equals(strTrim)) {
            strTrim = "ppc64";
        } else if (!"i386".equals(strTrim) && !"i686".equals(strTrim)) {
            if (!"x86_64".equals(strTrim) && !"amd64".equals(strTrim)) {
                if ("zarch_64".equals(strTrim)) {
                    strTrim = "s390x";
                }
            } else {
                strTrim = "x86-64";
            }
        } else {
            strTrim = "x86";
        }
        if ("ppc64".equals(strTrim) && "little".equals(System.getProperty("sun.cpu.endian"))) {
            strTrim = "ppc64le";
        }
        if ("arm".equals(strTrim) && i == 1 && isSoftFloat()) {
            return "armel";
        }
        return strTrim;
    }

    public static String getNativeLibraryResourcePrefix(int i, String str, String str2) {
        String canonicalArchitecture = getCanonicalArchitecture(str, i);
        switch (i) {
            case 0:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("darwin-");
                sbLIZ.append(canonicalArchitecture);
                return C2188811AlT.LIZIZ(sbLIZ);
            case 1:
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("linux-");
                sbLIZ2.append(canonicalArchitecture);
                return C2188811AlT.LIZIZ(sbLIZ2);
            case 2:
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("win32-");
                sbLIZ3.append(canonicalArchitecture);
                return C2188811AlT.LIZIZ(sbLIZ3);
            case 3:
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("sunos-");
                sbLIZ4.append(canonicalArchitecture);
                return C2188811AlT.LIZIZ(sbLIZ4);
            case 4:
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("freebsd-");
                sbLIZ5.append(canonicalArchitecture);
                return C2188811AlT.LIZIZ(sbLIZ5);
            case 5:
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("openbsd-");
                sbLIZ6.append(canonicalArchitecture);
                return C2188811AlT.LIZIZ(sbLIZ6);
            case 6:
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("w32ce-");
                sbLIZ7.append(canonicalArchitecture);
                return C2188811AlT.LIZIZ(sbLIZ7);
            case 7:
            case BdTuring.TYPE_ECAF /* 9 */:
            default:
                String lowerCase = str2.toLowerCase();
                int iIndexOf = lowerCase.indexOf(" ");
                if (iIndexOf != -1) {
                    lowerCase = lowerCase.substring(0, iIndexOf);
                }
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append(lowerCase);
                sbLIZ8.append("-");
                sbLIZ8.append(canonicalArchitecture);
                return C2188811AlT.LIZIZ(sbLIZ8);
            case 8:
                if (canonicalArchitecture.startsWith("arm")) {
                    canonicalArchitecture = "arm";
                }
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("android-");
                sbLIZ9.append(canonicalArchitecture);
                return C2188811AlT.LIZIZ(sbLIZ9);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("kfreebsd-");
                sbLIZ10.append(canonicalArchitecture);
                return C2188811AlT.LIZIZ(sbLIZ10);
            case BdTuring.TYPE_EMAIL /* 11 */:
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append("netbsd-");
                sbLIZ11.append(canonicalArchitecture);
                return C2188811AlT.LIZIZ(sbLIZ11);
        }
    }
}
