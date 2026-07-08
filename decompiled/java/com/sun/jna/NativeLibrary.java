package com.sun.jna;

import X.C0VSJ;
import X.C0WZX;
import X.C1697810uHb;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2204961BRm;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.sun.jna.internal.Cleaner;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function2;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes31.dex */
public class NativeLibrary implements Closeable {
    public static final Level DEBUG_LOAD_LEVEL;
    public static final Logger LOG = Logger.getLogger(NativeLibrary.class.getName());
    public static final SymbolProvider NATIVE_SYMBOL_PROVIDER;
    public static Method addSuppressedMethod;
    public static final Map<String, Reference<NativeLibrary>> libraries;
    public static final LinkedHashSet<String> librarySearchPath;
    public static final Map<String, List<String>> searchPaths;
    public final int callFlags;
    public final Cleaner.Cleanable cleanable;
    public final String encoding;
    public final Map<String, Function> functions;
    public volatile long handle;
    public final String libraryName;
    public final String libraryPath;
    public final Map<String, ?> options;
    public final SymbolProvider symbolProvider;

    public static NativeLibrary loadLibrary(String str, Map map) {
        return com_sun_jna_NativeLibrary_com_sun_jna_JnaLibrarianLancet_loadLibrary(str, map);
    }

    static {
        String strLIZIZ;
        DEBUG_LOAD_LEVEL = Native.DEBUG_LOAD ? Level.INFO : Level.FINE;
        NATIVE_SYMBOL_PROVIDER = new SymbolProvider() { // from class: com.sun.jna.NativeLibrary.1
            @Override // com.sun.jna.SymbolProvider
            public long getSymbolAddress(long j, String str, SymbolProvider symbolProvider) {
                return Native.findSymbol(j, str);
            }
        };
        libraries = new HashMap();
        searchPaths = new ConcurrentHashMap();
        librarySearchPath = new LinkedHashSet<>();
        if (Native.POINTER_SIZE == 0) {
            throw new Error("Native library not initialized");
        }
        addSuppressedMethod = null;
        try {
            addSuppressedMethod = Throwable.class.getMethod("addSuppressed", Throwable.class);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (SecurityException e2) {
            TryCatchGuardChecker.doCheck(e2);
            Logger.getLogger(NativeLibrary.class.getName()).log(Level.SEVERE, "Failed to initialize 'addSuppressed' method", (Throwable) e2);
        }
        String webStartLibraryPath = Native.getWebStartLibraryPath("jnidispatch");
        if (webStartLibraryPath != null) {
            librarySearchPath.add(webStartLibraryPath);
        }
        if (System.getProperty("jna.platform.library.path") == null && !Platform.isWindows()) {
            if (Platform.isLinux() || Platform.isSolaris() || Platform.isFreeBSD() || Platform.iskFreeBSD()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(Platform.isSolaris() ? "/" : "");
                sbLIZ.append(Native.POINTER_SIZE * 8);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = "";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("/usr/lib");
            sbLIZ2.append(strLIZIZ);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("/lib");
            sbLIZ3.append(strLIZIZ);
            String[] strArr = {C2188811AlT.LIZIZ(sbLIZ2), C2188811AlT.LIZIZ(sbLIZ3), "/usr/lib", "/lib"};
            if (Platform.isLinux() || Platform.iskFreeBSD() || Platform.isGNU()) {
                String multiArchPath = getMultiArchPath();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("/usr/lib/");
                sbLIZ4.append(multiArchPath);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("/lib/");
                sbLIZ5.append(multiArchPath);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("/usr/lib");
                sbLIZ6.append(strLIZIZ);
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("/lib");
                sbLIZ7.append(strLIZIZ);
                strArr = new String[]{C2188811AlT.LIZIZ(sbLIZ4), C2188811AlT.LIZIZ(sbLIZ5), C2188811AlT.LIZIZ(sbLIZ6), C2188811AlT.LIZIZ(sbLIZ7), "/usr/lib", "/lib"};
            }
            if (Platform.isLinux()) {
                ArrayList<String> linuxLdPaths = getLinuxLdPaths();
                for (int length = strArr.length - 1; length >= 0; length--) {
                    int iIndexOf = linuxLdPaths.indexOf(strArr[length]);
                    if (iIndexOf != -1) {
                        ListProtector.remove(linuxLdPaths, iIndexOf);
                    }
                    ListProtector.add(linuxLdPaths, 0, strArr[length]);
                }
                strArr = (String[]) linuxLdPaths.toArray(new String[0]);
            }
            String strLIZIZ2 = "";
            String str = "";
            for (int i = 0; i < strArr.length; i++) {
                C0VSJ c0vsj = new C0VSJ(strArr[i]);
                if (c0vsj.exists() && c0vsj.isDirectory()) {
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append(strLIZIZ2);
                    sbLIZ8.append(str);
                    sbLIZ8.append(strArr[i]);
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ8);
                    str = File.pathSeparator;
                }
            }
            if (!"".equals(strLIZIZ2)) {
                System.setProperty("jna.platform.library.path", strLIZIZ2);
            }
        }
        librarySearchPath.addAll(initPaths("jna.platform.library.path"));
    }

    public static void disposeAll() {
        LinkedHashSet linkedHashSet;
        Map<String, Reference<NativeLibrary>> map = libraries;
        synchronized (map) {
            try {
                linkedHashSet = new LinkedHashSet(map.values());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            NativeLibrary nativeLibrary = (NativeLibrary) ((Reference) it2.next()).get();
            if (nativeLibrary != null) {
                nativeLibrary.close();
            }
        }
    }

    public static ArrayList<String> getLinuxLdPaths() throws Throwable {
        Process processExec;
        BufferedReader bufferedReader;
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                    processExec = Runtime.getRuntime().exec("/sbin/ldconfig -p");
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line != null) {
                                    int iIndexOf = line.indexOf(" => ");
                                    int iLastIndexOf = line.lastIndexOf(47);
                                    if (iIndexOf != -1 && iLastIndexOf != -1 && iIndexOf < iLastIndexOf) {
                                        String strSubstring = line.substring(iIndexOf + 4, iLastIndexOf);
                                        if (!arrayList.contains(strSubstring)) {
                                            arrayList.add(strSubstring);
                                        }
                                    }
                                } else {
                                    try {
                                        break;
                                    } catch (IOException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                TryCatchGuardChecker.doCheck(e);
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e3) {
                                        TryCatchGuardChecker.doCheck(e3);
                                    }
                                }
                                if (processExec != null) {
                                    processExec.waitFor();
                                    return arrayList;
                                }
                                return arrayList;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                TryCatchGuardChecker.doCheck(th);
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException e4) {
                                        TryCatchGuardChecker.doCheck(e4);
                                    }
                                }
                                if (processExec == null) {
                                    throw th;
                                }
                                try {
                                    processExec.waitFor();
                                    throw th;
                                } catch (InterruptedException e5) {
                                    TryCatchGuardChecker.doCheck(e5);
                                    throw th;
                                }
                            }
                        }
                        bufferedReader.close();
                        processExec.waitFor();
                        return arrayList;
                    } catch (Exception e6) {
                        e = e6;
                        bufferedReader = null;
                    }
                } catch (InterruptedException e7) {
                    TryCatchGuardChecker.doCheck(e7);
                    return arrayList;
                }
            } catch (Exception e8) {
                e = e8;
                bufferedReader = null;
                processExec = null;
            } catch (Throwable th2) {
                th = th2;
                processExec = null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String getMultiArchPath() {
        String str = Platform.ARCH;
        String str2 = Platform.iskFreeBSD() ? "-kfreebsd" : Platform.isGNU() ? "" : "-linux";
        String str3 = "-gnu";
        if (Platform.isIntel()) {
            str = Platform.is64Bit() ? "x86_64" : "i386";
        } else if (Platform.isPPC()) {
            str = Platform.is64Bit() ? "powerpc64" : "powerpc";
        } else if (Platform.isARM()) {
            str = "arm";
            str3 = "-gnueabi";
        } else if (str.equals("mips64el")) {
            str3 = "-gnuabi64";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        sbLIZ.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final synchronized NativeLibrary getProcess() {
        return getInstance(null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        HashSet hashSet = new HashSet();
        Map<String, Reference<NativeLibrary>> map = libraries;
        synchronized (map) {
            try {
                for (Map.Entry<String, Reference<NativeLibrary>> entry : map.entrySet()) {
                    if (entry.getValue().get() == this) {
                        hashSet.add(entry.getKey());
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    libraries.remove((String) it2.next());
                }
            } finally {
            }
        }
        synchronized (this) {
            try {
                if (this.handle != 0) {
                    this.handle = 0L;
                    this.cleanable.clean();
                }
            } finally {
            }
        }
    }

    public File getFile() {
        if (this.libraryPath == null) {
            return null;
        }
        return new C0VSJ(this.libraryPath);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Native Library <");
        sbLIZ.append(this.libraryPath);
        sbLIZ.append(e3.g);
        sbLIZ.append(this.handle);
        sbLIZ.append(">");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public void dispose() {
        close();
    }

    public String getName() {
        return this.libraryName;
    }

    public Map<String, ?> getOptions() {
        return this.options;
    }

    public static final class NativeLibraryDisposer implements Runnable {
        public long handle;

        public synchronized void com_sun_jna_NativeLibrary$NativeLibraryDisposer__run$___twin___() {
            long j = this.handle;
            if (j != 0) {
                try {
                    Native.close(j);
                    this.handle = 0L;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.handle = 0L;
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            C1C7U.LIZ("NativeLibrary$NativeLibraryDisposer@873c.run");
            com_sun_jna_NativeLibrary$NativeLibraryDisposer_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("NativeLibrary$NativeLibraryDisposer@873c.run");
        }

        public NativeLibraryDisposer(long j) {
            this.handle = j;
        }

        public static void com_sun_jna_NativeLibrary$NativeLibraryDisposer_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(NativeLibraryDisposer nativeLibraryDisposer) {
            try {
                nativeLibraryDisposer.com_sun_jna_NativeLibrary$NativeLibraryDisposer__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    }

    public static void INVOKESTATIC_com_sun_jna_NativeLibrary_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static final NativeLibrary getInstance(String str) {
        return getInstance(str, (Map<String, ?>) Collections.emptyMap());
    }

    private String getLibraryName(String str) {
        String strMapSharedLibraryName = mapSharedLibraryName("---");
        int iIndexOf = strMapSharedLibraryName.indexOf("---");
        if (iIndexOf > 0 && str.startsWith(strMapSharedLibraryName.substring(0, iIndexOf))) {
            str = str.substring(iIndexOf);
        }
        int iIndexOf2 = str.indexOf(strMapSharedLibraryName.substring(iIndexOf + 3));
        if (iIndexOf2 != -1) {
            return str.substring(0, iIndexOf2);
        }
        return str;
    }

    public static final synchronized NativeLibrary getProcess(Map<String, ?> map) {
        return getInstance((String) null, map);
    }

    public static List<String> initPaths(String str) {
        String property = System.getProperty(str, "");
        if ("".equals(property)) {
            return Collections.emptyList();
        }
        StringTokenizer stringTokenizer = new StringTokenizer(property, File.pathSeparator);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (!"".equals(strNextToken)) {
                arrayList.add(strNextToken);
            }
        }
        return arrayList;
    }

    public static boolean isVersionedName(String str) {
        int iLastIndexOf;
        int i;
        if (!str.startsWith("lib") || (iLastIndexOf = str.lastIndexOf(".so.")) == -1 || (i = iLastIndexOf + 4) >= str.length()) {
            return false;
        }
        for (i = iLastIndexOf + 4; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isDigit(cCharAt) && cCharAt != '.') {
                return false;
            }
        }
        return true;
    }

    public static String mapSharedLibraryName(String str) {
        if (Platform.isMac()) {
            if (str.startsWith("lib") && (str.endsWith(".dylib") || str.endsWith(".jnilib"))) {
                return str;
            }
            String strMapLibraryName = System.mapLibraryName(str);
            if (strMapLibraryName.endsWith(".jnilib")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strMapLibraryName.substring(0, strMapLibraryName.lastIndexOf(".jnilib")));
                sbLIZ.append(".dylib");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return strMapLibraryName;
        }
        if (!Platform.isLinux() && !Platform.isFreeBSD()) {
            if (Platform.isAIX()) {
                if (isVersionedName(str) || str.endsWith(".so") || str.startsWith("lib") || str.endsWith(".a")) {
                    return str;
                }
            } else if (Platform.isWindows() && (str.endsWith(".drv") || str.endsWith(".dll") || str.endsWith(".ocx"))) {
                return str;
            }
        } else {
            if (!isVersionedName(str) && !str.endsWith(".so")) {
            }
            return str;
        }
        str = System.mapLibraryName(str);
        if (Platform.isAIX() && str.endsWith(".so")) {
            return str.replaceAll(".so$", ".a");
        }
        return str;
    }

    public static String[] matchFramework(String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.isAbsolute()) {
            if (str.contains(".framework")) {
                if (c0vsj.exists()) {
                    return new String[]{c0vsj.getAbsolutePath()};
                }
                linkedHashSet.add(c0vsj.getAbsolutePath());
            } else {
                File parentFile = c0vsj.getParentFile();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c0vsj.getName());
                sbLIZ.append(".framework");
                C0VSJ c0vsj2 = new C0VSJ(new C0VSJ(parentFile, C2188811AlT.LIZIZ(sbLIZ)), c0vsj.getName());
                if (c0vsj2.exists()) {
                    return new String[]{c0vsj2.getAbsolutePath()};
                }
                linkedHashSet.add(c0vsj2.getAbsolutePath());
            }
        } else {
            String[] strArr = {System.getProperty("user.home"), "", "/System"};
            if (!str.contains(".framework")) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(".framework/");
                sbLIZ2.append(str);
                str = C2188811AlT.LIZIZ(sbLIZ2);
            }
            int i = 0;
            do {
                String str2 = strArr[i];
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str2);
                sbLIZ3.append("/Library/Frameworks/");
                sbLIZ3.append(str);
                C0VSJ c0vsj3 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ3));
                if (c0vsj3.exists()) {
                    return new String[]{c0vsj3.getAbsolutePath()};
                }
                linkedHashSet.add(c0vsj3.getAbsolutePath());
                i++;
            } while (i < 3);
        }
        return (String[]) linkedHashSet.toArray(new String[0]);
    }

    public static int openFlags(Map<String, ?> map) {
        Object obj = map.get("open-flags");
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return -1;
    }

    public static double parseVersion(String str) {
        String strSubstring;
        int iIndexOf = str.indexOf(e3.d);
        double d = 1.0d;
        double d2 = 0.0d;
        do {
            if (iIndexOf != -1) {
                String strSubstring2 = str.substring(0, iIndexOf);
                strSubstring = str.substring(iIndexOf + 1);
                iIndexOf = strSubstring.indexOf(e3.d);
                str = strSubstring2;
            } else {
                strSubstring = null;
            }
            try {
                d2 += ((double) CastIntegerProtector.parseInt(str)) / d;
                d *= 100.0d;
                str = strSubstring;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return 0.0d;
            }
        } while (strSubstring != null);
        return d2;
    }

    public Function getFunction(String str) {
        return getFunction(str, this.callFlags);
    }

    public Pointer getGlobalVariableAddress(String str) {
        try {
            return new Pointer(getSymbolAddress(str));
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error looking up '");
            sbLIZ.append(str);
            sbLIZ.append("': ");
            sbLIZ.append(e.getMessage());
            throw new UnsatisfiedLinkError(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public long getSymbolAddress(String str) {
        if (this.handle != 0) {
            return this.symbolProvider.getSymbolAddress(this.handle, str, NATIVE_SYMBOL_PROVIDER);
        }
        throw new UnsatisfiedLinkError("Library has been unloaded");
    }

    public static final void addSearchPath(String str, String str2) {
        Map<String, List<String>> map = searchPaths;
        List<String> listSynchronizedList = map.get(str);
        if (listSynchronizedList == null) {
            listSynchronizedList = Collections.synchronizedList(new ArrayList());
            map.put(str, listSynchronizedList);
        }
        listSynchronizedList.add(str2);
    }

    public static void addSuppressedReflected(Throwable th, Throwable th2) {
        Method method = addSuppressedMethod;
        if (method == null) {
            return;
        }
        try {
            C2204961BRm.a0(method, th, new Object[]{th2}, new C0WZX("dzBzEhEvUYTWW1ZvaxOQb+4dsTQ4zgVH6Q==", null));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Failed to call addSuppressedMethod", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x02f4  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sun.jna.NativeLibrary com_sun_jna_NativeLibrary__loadLibrary$___twin___(java.lang.String r18, java.util.Map<java.lang.String, ?> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.NativeLibrary.com_sun_jna_NativeLibrary__loadLibrary$___twin___(java.lang.String, java.util.Map):com.sun.jna.NativeLibrary");
    }

    public static NativeLibrary com_sun_jna_NativeLibrary_com_sun_jna_JnaLibrarianLancet_loadLibrary(String str, Map map) {
        int iIntValue;
        Number number;
        if (!JnaAabFixSettings.isOpen()) {
            return com_sun_jna_NativeLibrary__loadLibrary$___twin___(str, map);
        }
        Object obj = map.get("open-flags");
        if ((obj instanceof Number) && (number = (Number) obj) != null) {
            iIntValue = number.intValue();
        } else {
            iIntValue = -1;
        }
        ArrayList<String> arrayList = new ArrayList();
        int i = 0;
        long jLongValue = 0;
        for (Function2<String, Integer, Long> function2 : JnaLibrarianLancetHelper.INSTANCE.getLoadLibraryRetries()) {
            int i2 = i + 1;
            if (i >= 0) {
                Function2<String, Integer, Long> function22 = function2;
                if (jLongValue == 0) {
                    try {
                        jLongValue = function22.invoke(str, Integer.valueOf(iIntValue)).longValue();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        String message = th.getMessage();
                        if (message == null) {
                            message = th.toString();
                        }
                        arrayList.add(message);
                        jLongValue = 0;
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (jLongValue != 0) {
            return JnaLibrarianLancetHelper.INSTANCE.newNativeLibrary(str, jLongValue, map);
        }
        try {
            return com_sun_jna_NativeLibrary__loadLibrary$___twin___(str, map);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sb = new StringBuilder("Unable to load library '");
            sb.append(str);
            sb.append("':");
            for (String str2 : arrayList) {
                sb.append("\n");
                sb.append(str2);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\nOrigin.call:\n");
            sbLIZ.append(th2.getMessage());
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            throw new UnsatisfiedLinkError(sb.toString());
        }
    }

    public static String findLibraryPath(String str, Collection<String> collection) {
        if (new C0VSJ(str).isAbsolute()) {
            return str;
        }
        String strMapSharedLibraryName = mapSharedLibraryName(str);
        for (String str2 : collection) {
            C0VSJ c0vsj = new C0VSJ(str2, strMapSharedLibraryName);
            if (c0vsj.exists()) {
                return c0vsj.getAbsolutePath();
            }
            if (Platform.isMac() && strMapSharedLibraryName.endsWith(".dylib")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strMapSharedLibraryName.substring(0, strMapSharedLibraryName.lastIndexOf(".dylib")));
                sbLIZ.append(".jnilib");
                C0VSJ c0vsj2 = new C0VSJ(str2, C2188811AlT.LIZIZ(sbLIZ));
                if (c0vsj2.exists()) {
                    return c0vsj2.getAbsolutePath();
                }
            }
        }
        return strMapSharedLibraryName;
    }

    public static final NativeLibrary getInstance(String str, Map<String, ?> map) {
        NativeLibrary nativeLibraryCom_sun_jna_NativeLibrary_com_sun_jna_JnaLibrarianLancet_loadLibrary;
        HashMap map2 = new HashMap(map);
        if (map2.get("calling-convention") == null) {
            map2.put("calling-convention", 0);
        }
        if ((Platform.isLinux() || Platform.isFreeBSD() || Platform.isAIX()) && Platform.C_LIBRARY_NAME.equals(str)) {
            str = null;
        }
        Map<String, Reference<NativeLibrary>> map3 = libraries;
        synchronized (map3) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(map2);
                Reference<NativeLibrary> reference = map3.get(C2188811AlT.LIZIZ(sbLIZ));
                if (reference == null || (nativeLibraryCom_sun_jna_NativeLibrary_com_sun_jna_JnaLibrarianLancet_loadLibrary = reference.get()) == null) {
                    if (str == null) {
                        nativeLibraryCom_sun_jna_NativeLibrary_com_sun_jna_JnaLibrarianLancet_loadLibrary = new NativeLibrary("<process>", null, Native.open(null, openFlags(map2)), map2);
                    } else {
                        nativeLibraryCom_sun_jna_NativeLibrary_com_sun_jna_JnaLibrarianLancet_loadLibrary = com_sun_jna_NativeLibrary_com_sun_jna_JnaLibrarianLancet_loadLibrary(str, map2);
                    }
                    WeakReference weakReference = new WeakReference(nativeLibraryCom_sun_jna_NativeLibrary_com_sun_jna_JnaLibrarianLancet_loadLibrary);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(nativeLibraryCom_sun_jna_NativeLibrary_com_sun_jna_JnaLibrarianLancet_loadLibrary.getName());
                    sbLIZ2.append(map2);
                    map3.put(C2188811AlT.LIZIZ(sbLIZ2), weakReference);
                    File file = nativeLibraryCom_sun_jna_NativeLibrary_com_sun_jna_JnaLibrarianLancet_loadLibrary.getFile();
                    if (file != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(file.getAbsolutePath());
                        sbLIZ3.append(map2);
                        map3.put(C2188811AlT.LIZIZ(sbLIZ3), weakReference);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(file.getName());
                        sbLIZ4.append(map2);
                        map3.put(C2188811AlT.LIZIZ(sbLIZ4), weakReference);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return nativeLibraryCom_sun_jna_NativeLibrary_com_sun_jna_JnaLibrarianLancet_loadLibrary;
    }

    public static String matchLibrary(final String str, Collection<String> collection) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.isAbsolute()) {
            collection = Arrays.asList(c0vsj.getParent());
        }
        FilenameFilter filenameFilter = new FilenameFilter() { // from class: com.sun.jna.NativeLibrary.3
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lib");
                sbLIZ.append(str);
                sbLIZ.append(".so");
                if (!str2.startsWith(C2188811AlT.LIZIZ(sbLIZ))) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(".so");
                    if (!str2.startsWith(C2188811AlT.LIZIZ(sbLIZ2)) || !str.startsWith("lib")) {
                        return false;
                    }
                }
                if (NativeLibrary.isVersionedName(str2)) {
                    return true;
                }
                return false;
            }
        };
        LinkedList linkedList = new LinkedList();
        Iterator<String> it2 = collection.iterator();
        while (it2.hasNext()) {
            File[] fileArrListFiles = new C0VSJ(it2.next()).listFiles(filenameFilter);
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                linkedList.addAll(Arrays.asList(fileArrListFiles));
            }
        }
        Iterator it3 = linkedList.iterator();
        double d = -1.0d;
        String str2 = null;
        while (it3.hasNext()) {
            String absolutePath = ((File) it3.next()).getAbsolutePath();
            double version = parseVersion(absolutePath.substring(absolutePath.lastIndexOf(".so.") + 4));
            if (version > d) {
                str2 = absolutePath;
                d = version;
            }
        }
        return str2;
    }

    public Function getFunction(String str, Method method) {
        FunctionMapper functionMapper = (FunctionMapper) this.options.get("function-mapper");
        if (functionMapper != null) {
            str = functionMapper.getFunctionName(this, method);
        }
        String property = System.getProperty("jna.profiler.prefix", "$$YJP$$");
        if (str.startsWith(property)) {
            str = str.substring(property.length());
        }
        int i = this.callFlags;
        for (Class<?> cls : method.getExceptionTypes()) {
            if (LastErrorException.class.isAssignableFrom(cls)) {
                i |= 64;
            }
        }
        return getFunction(str, i);
    }

    public static final NativeLibrary getInstance(String str, ClassLoader classLoader) {
        return getInstance(str, (Map<String, ?>) Collections.singletonMap("classloader", classLoader));
    }

    public Function getFunction(String str, int i) {
        return getFunction(str, i, this.encoding);
    }

    public static String functionKey(String str, int i, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("|");
        sbLIZ.append(i);
        sbLIZ.append("|");
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Function getFunction(String str, int i, String str2) {
        Function function;
        if (str != null) {
            synchronized (this.functions) {
                try {
                    String strFunctionKey = functionKey(str, i, str2);
                    function = this.functions.get(strFunctionKey);
                    if (function == null) {
                        function = new Function(this, str, i, str2);
                        this.functions.put(strFunctionKey, function);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return function;
        }
        throw new NullPointerException("Function name may not be null");
    }

    public NativeLibrary(String str, String str2, long j, Map<String, ?> map) {
        int iIntValue;
        HashMap map2 = new HashMap();
        this.functions = map2;
        String libraryName = getLibraryName(str);
        this.libraryName = libraryName;
        this.libraryPath = str2;
        this.handle = j;
        this.cleanable = Cleaner.getCleaner().register(this, new NativeLibraryDisposer(j));
        Object obj = map.get("calling-convention");
        if (obj instanceof Number) {
            iIntValue = ((Number) obj).intValue();
        } else {
            iIntValue = 0;
        }
        this.callFlags = iIntValue;
        this.options = map;
        SymbolProvider symbolProvider = (SymbolProvider) map.get("symbol-provider");
        if (symbolProvider == null) {
            this.symbolProvider = NATIVE_SYMBOL_PROVIDER;
        } else {
            this.symbolProvider = symbolProvider;
        }
        String defaultStringEncoding = (String) map.get("string-encoding");
        defaultStringEncoding = defaultStringEncoding == null ? Native.getDefaultStringEncoding() : defaultStringEncoding;
        this.encoding = defaultStringEncoding;
        if (Platform.isWindows() && "kernel32".equals(libraryName.toLowerCase())) {
            synchronized (map2) {
                try {
                    map2.put(functionKey("GetLastError", iIntValue, defaultStringEncoding), new Function(this, "GetLastError", 63, defaultStringEncoding) { // from class: com.sun.jna.NativeLibrary.2
                        @Override // com.sun.jna.Function
                        public Object invoke(Object[] objArr, Class<?> cls, boolean z, int i) {
                            return Integer.valueOf(Native.getLastError());
                        }

                        @Override // com.sun.jna.Function
                        public Object invoke(Method method, Class<?>[] clsArr, Class<?> cls, Object[] objArr, Map<String, ?> map3) {
                            return Integer.valueOf(Native.getLastError());
                        }
                    });
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
