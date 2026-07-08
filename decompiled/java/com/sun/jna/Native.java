package com.sun.jna;

import X.C0VSJ;
import X.C0VSV;
import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Structure;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Window;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes31.dex */
public final class Native implements Version {
    public static final int BOOL_SIZE;
    public static final boolean DEBUG_JNA_LOAD;
    public static final Level DEBUG_JNA_LOAD_LEVEL;
    public static final boolean DEBUG_LOAD;
    public static final Charset DEFAULT_CHARSET;
    public static final String DEFAULT_ENCODING;
    public static final Callback.UncaughtExceptionHandler DEFAULT_HANDLER;
    public static final Logger LOG = Logger.getLogger(Native.class.getName());
    public static final int LONG_DOUBLE_SIZE;
    public static final int LONG_SIZE;
    public static final int MAX_ALIGNMENT;
    public static final int MAX_PADDING;
    public static final int POINTER_SIZE;
    public static final int SIZE_T_SIZE;
    public static final int WCHAR_SIZE;
    public static Callback.UncaughtExceptionHandler callbackExceptionHandler;
    public static final Object finalizer;
    public static String jnidispatchPath;
    public static final Map<Class<?>, Reference<?>> libraries;
    public static final ThreadLocal<Memory> nativeThreadTerminationFlag;
    public static final Map<Thread, Pointer> nativeThreads;
    public static final Map<Class<?>, long[]> registeredClasses;
    public static final Map<Class<?>, NativeLibrary> registeredLibraries;
    public static final Map<Class<?>, Map<String, Object>> typeOptions;

    public interface ffi_callback {
        void invoke(long j, long j2, long j3);
    }

    public static native long _getDirectBufferPointer(Buffer buffer);

    public static native long _getPointer(long j);

    public static native void close(long j);

    public static native synchronized long createNativeCallback(Callback callback, Method method, Class<?>[] clsArr, Class<?> cls, int i, int i2, String str);

    public static native void ffi_call(long j, long j2, long j3, long j4);

    public static native void ffi_free_closure(long j);

    public static native long ffi_prep_cif(int i, int i2, long j, long j2);

    public static native long ffi_prep_closure(long j, ffi_callback ffi_callbackVar);

    public static native long findSymbol(long j, String str);

    public static native void free(long j);

    public static native synchronized void freeNativeCallback(long j);

    public static native String getAPIChecksum();

    public static native byte getByte(Pointer pointer, long j, long j2);

    public static native char getChar(Pointer pointer, long j, long j2);

    public static native ByteBuffer getDirectByteBuffer(Pointer pointer, long j, long j2, long j3);

    public static native double getDouble(Pointer pointer, long j, long j2);

    public static native float getFloat(Pointer pointer, long j, long j2);

    public static native int getInt(Pointer pointer, long j, long j2);

    public static native int getLastError();

    public static native long getLong(Pointer pointer, long j, long j2);

    public static native String getNativeVersion();

    public static native short getShort(Pointer pointer, long j, long j2);

    public static native byte[] getStringBytes(Pointer pointer, long j, long j2);

    public static native String getWideString(Pointer pointer, long j, long j2);

    public static native long getWindowHandle0(Component component);

    public static native long indexOf(Pointer pointer, long j, long j2, byte b);

    public static native void initIDs();

    public static native int initialize_ffi_type(long j);

    public static native double invokeDouble(Function function, long j, int i, Object[] objArr);

    public static native float invokeFloat(Function function, long j, int i, Object[] objArr);

    public static native int invokeInt(Function function, long j, int i, Object[] objArr);

    public static native long invokeLong(Function function, long j, int i, Object[] objArr);

    public static native Object invokeObject(Function function, long j, int i, Object[] objArr);

    public static native long invokePointer(Function function, long j, int i, Object[] objArr);

    public static native void invokeStructure(Function function, long j, int i, Object[] objArr, long j2, long j3);

    public static native void invokeVoid(Function function, long j, int i, Object[] objArr);

    public static native synchronized boolean isProtected();

    public static native long malloc(long j);

    public static native long open(String str, int i);

    public static native void read(Pointer pointer, long j, long j2, byte[] bArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, char[] cArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, double[] dArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, float[] fArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, int[] iArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, long[] jArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, short[] sArr, int i, int i2);

    public static native long registerMethod(Class<?> cls, String str, String str2, int[] iArr, long[] jArr, long[] jArr2, int i, long j, long j2, Method method, long j3, int i2, boolean z, ToNativeConverter[] toNativeConverterArr, FromNativeConverter fromNativeConverter, String str3);

    public static native void setByte(Pointer pointer, long j, long j2, byte b);

    public static native void setChar(Pointer pointer, long j, long j2, char c);

    public static native void setDetachState(boolean z, long j);

    public static native void setDouble(Pointer pointer, long j, long j2, double d);

    public static native void setFloat(Pointer pointer, long j, long j2, float f);

    public static native void setInt(Pointer pointer, long j, long j2, int i);

    public static native void setLastError(int i);

    public static native void setLong(Pointer pointer, long j, long j2, long j3);

    public static native void setMemory(Pointer pointer, long j, long j2, long j3, byte b);

    public static native void setPointer(Pointer pointer, long j, long j2, long j3);

    public static native synchronized void setProtected(boolean z);

    public static native void setShort(Pointer pointer, long j, long j2, short s);

    public static native void setWideString(Pointer pointer, long j, long j2, String str);

    public static native int sizeof(int i);

    public static native void unregister(Class<?> cls, long[] jArr);

    public static native void write(Pointer pointer, long j, long j2, byte[] bArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, char[] cArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, double[] dArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, float[] fArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, int[] iArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, long[] jArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, short[] sArr, int i, int i2);

    static {
        Charset charsetForName;
        String property;
        String property2 = System.getProperty("native.encoding");
        if (property2 != null) {
            try {
                charsetForName = Charset.forName(property2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Logger logger = LOG;
                Level level = Level.WARNING;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed to get charset for native.encoding value : '");
                sbLIZ.append(property2);
                sbLIZ.append("'");
                logger.log(level, C2188811AlT.LIZIZ(sbLIZ), (Throwable) e);
            }
            if (charsetForName == null) {
                charsetForName = Charset.defaultCharset();
            }
        } else {
            charsetForName = Charset.defaultCharset();
        }
        DEFAULT_CHARSET = charsetForName;
        DEFAULT_ENCODING = charsetForName.name();
        DEBUG_LOAD = Boolean.getBoolean("jna.debug_load");
        boolean z = Boolean.getBoolean("jna.debug_load.jna");
        DEBUG_JNA_LOAD = z;
        DEBUG_JNA_LOAD_LEVEL = z ? Level.INFO : Level.FINE;
        jnidispatchPath = null;
        typeOptions = Collections.synchronizedMap(new WeakHashMap());
        libraries = Collections.synchronizedMap(new WeakHashMap());
        Callback.UncaughtExceptionHandler uncaughtExceptionHandler = new Callback.UncaughtExceptionHandler() { // from class: com.sun.jna.Native.1
            @Override // com.sun.jna.Callback.UncaughtExceptionHandler
            public void uncaughtException(Callback callback, Throwable th) {
                Logger logger2 = Native.LOG;
                Level level2 = Level.WARNING;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("JNA: Callback ");
                sbLIZ2.append(callback);
                sbLIZ2.append(" threw the following exception");
                logger2.log(level2, C2188811AlT.LIZIZ(sbLIZ2), th);
            }
        };
        DEFAULT_HANDLER = uncaughtExceptionHandler;
        callbackExceptionHandler = uncaughtExceptionHandler;
        loadNativeDispatchLibrary();
        if (isCompatibleVersion("7.0.0", getNativeVersion())) {
            POINTER_SIZE = sizeof(0);
            int iSizeof = sizeof(1);
            LONG_SIZE = iSizeof;
            WCHAR_SIZE = sizeof(2);
            SIZE_T_SIZE = sizeof(3);
            BOOL_SIZE = sizeof(4);
            LONG_DOUBLE_SIZE = sizeof(5);
            initIDs();
            if (Boolean.getBoolean("jna.protected")) {
                setProtected(true);
            }
            if (Platform.isSPARC() || Platform.isWindows() || ((Platform.isLinux() && (Platform.isARM() || Platform.isPPC() || Platform.isMIPS() || Platform.isLoongArch())) || Platform.isAIX() || (Platform.isAndroid() && !Platform.isIntel()))) {
                iSizeof = 8;
            }
            MAX_ALIGNMENT = iSizeof;
            MAX_PADDING = (Platform.isMac() && Platform.isPPC()) ? 8 : iSizeof;
            System.setProperty("jna.loaded", "true");
            finalizer = new Object() { // from class: com.sun.jna.Native.2
                public void finalize() throws Throwable {
                    Native.dispose();
                    super.finalize();
                }
            };
            registeredClasses = new WeakHashMap();
            registeredLibraries = new WeakHashMap();
            nativeThreadTerminationFlag = new ThreadLocal<Memory>() { // from class: com.sun.jna.Native.7
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.lang.ThreadLocal
                public Memory initialValue() {
                    Memory memory = new Memory(4L);
                    memory.clear();
                    return memory;
                }
            };
            nativeThreads = Collections.synchronizedMap(new WeakHashMap());
            return;
        }
        String strLineSeparator = System.lineSeparator();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLineSeparator);
        sbLIZ2.append(strLineSeparator);
        sbLIZ2.append("There is an incompatible JNA native library installed on this system");
        sbLIZ2.append(strLineSeparator);
        sbLIZ2.append("Expected: ");
        sbLIZ2.append("7.0.0");
        sbLIZ2.append(strLineSeparator);
        sbLIZ2.append("Found:    ");
        sbLIZ2.append(getNativeVersion());
        sbLIZ2.append(strLineSeparator);
        if (jnidispatchPath != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("(at ");
            sbLIZ3.append(jnidispatchPath);
            sbLIZ3.append(")");
            property = C2188811AlT.LIZIZ(sbLIZ3);
        } else {
            property = System.getProperty("java.library.path");
        }
        sbLIZ2.append(property);
        sbLIZ2.append(e3.d);
        sbLIZ2.append(strLineSeparator);
        sbLIZ2.append("To resolve this issue you may do one of the following:");
        sbLIZ2.append(strLineSeparator);
        sbLIZ2.append(" - remove or uninstall the offending library");
        sbLIZ2.append(strLineSeparator);
        sbLIZ2.append(" - set the system property jna.nosys=true");
        sbLIZ2.append(strLineSeparator);
        sbLIZ2.append(" - set jna.boot.library.path to include the path to the version of the ");
        sbLIZ2.append(strLineSeparator);
        sbLIZ2.append("   jnidispatch library included with the JNA jar file you are using");
        sbLIZ2.append(strLineSeparator);
        throw new Error(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static Class<?> getCallingClass() {
        Class<?>[] classContext = new SecurityManager() { // from class: com.sun.jna.Native.6
            @Override // java.lang.SecurityManager
            public Class<?>[] getClassContext() {
                return super.getClassContext();
            }
        }.getClassContext();
        if (classContext == null) {
            throw new IllegalStateException("The SecurityManager implementation on this platform is broken; you must explicitly provide the class to register");
        }
        if (classContext.length >= 4) {
            return classContext[3];
        }
        throw new IllegalStateException("This method must be called from the static initializer of a class");
    }

    public static String getDefaultStringEncoding() {
        return System.getProperty("jna.encoding", DEFAULT_ENCODING);
    }

    public static File getTempDir() throws IOException {
        C0VSJ c0vsj;
        C0VSJ c0vsj2;
        String property = System.getProperty("jna.tmpdir");
        if (property != null) {
            c0vsj = new C0VSJ(property);
            c0vsj.mkdirs();
        } else {
            c0vsj = new C0VSJ(System.getProperty("java.io.tmpdir"));
            if (Platform.isMac()) {
                c0vsj2 = new C0VSJ(System.getProperty("user.home"), "Library/Caches/JNA/temp");
            } else if (Platform.isLinux() || Platform.isSolaris() || Platform.isAIX() || Platform.isFreeBSD() || Platform.isNetBSD() || Platform.isOpenBSD() || Platform.iskFreeBSD()) {
                String str = System.getenv("XDG_CACHE_HOME");
                c0vsj2 = new C0VSJ((str == null || str.trim().isEmpty()) ? new C0VSJ(System.getProperty("user.home"), ".cache") : new C0VSJ(str), "JNA/temp");
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("jna-");
                sbLIZ.append(System.getProperty("user.name").hashCode());
                c0vsj2 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ));
            }
            c0vsj2.mkdirs();
            if (c0vsj2.exists() && c0vsj2.canWrite()) {
                c0vsj = c0vsj2;
            }
        }
        if (!c0vsj.exists()) {
            throw new IOException("JNA temporary directory '" + c0vsj + "' does not exist");
        }
        if (c0vsj.canWrite()) {
            return c0vsj;
        }
        throw new IOException("JNA temporary directory '" + c0vsj + "' is not writable");
    }

    public static void loadNativeDispatchLibrary() throws Throwable {
        if (!Boolean.getBoolean("jna.nounpack")) {
            try {
                removeTemporaryFiles();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                LOG.log(Level.WARNING, "JNA Warning: IOException removing temporary files", (Throwable) e);
            }
        }
        String property = System.getProperty("jna.boot.library.name", "jnidispatch");
        String property2 = System.getProperty("jna.boot.library.path");
        if (property2 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property2, File.pathSeparator);
            while (stringTokenizer.hasMoreTokens()) {
                C0VSJ c0vsj = new C0VSJ(new C0VSJ(stringTokenizer.nextToken()), System.mapLibraryName(property).replace(".dylib", ".jnilib"));
                String absolutePath = c0vsj.getAbsolutePath();
                Logger logger = LOG;
                Level level = DEBUG_JNA_LOAD_LEVEL;
                logger.log(level, "Looking in {0}", absolutePath);
                if (c0vsj.exists()) {
                    try {
                        logger.log(level, "Trying {0}", absolutePath);
                        System.setProperty("jnidispatch.path", absolutePath);
                        System.load(absolutePath);
                        jnidispatchPath = absolutePath;
                        logger.log(level, "Found jnidispatch at {0}", absolutePath);
                        return;
                    } catch (UnsatisfiedLinkError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                if (Platform.isMac()) {
                    String str = "dylib";
                    String str2 = "jnilib";
                    if (!absolutePath.endsWith("dylib")) {
                        str2 = "dylib";
                        str = "jnilib";
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(absolutePath.substring(0, absolutePath.lastIndexOf(str)));
                    sbLIZ.append(str2);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    Logger logger2 = LOG;
                    Level level2 = DEBUG_JNA_LOAD_LEVEL;
                    logger2.log(level2, "Looking in {0}", strLIZIZ);
                    if (new C0VSJ(strLIZIZ).exists()) {
                        try {
                            logger2.log(level2, "Trying {0}", strLIZIZ);
                            System.setProperty("jnidispatch.path", strLIZIZ);
                            System.load(strLIZIZ);
                            jnidispatchPath = strLIZIZ;
                            logger2.log(level2, "Found jnidispatch at {0}", strLIZIZ);
                            return;
                        } catch (UnsatisfiedLinkError e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            Logger logger3 = LOG;
                            Level level3 = Level.WARNING;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("File found at ");
                            sbLIZ2.append(strLIZIZ);
                            sbLIZ2.append(" but not loadable: ");
                            sbLIZ2.append(e3.getMessage());
                            logger3.log(level3, C2188811AlT.LIZIZ(sbLIZ2), (Throwable) e3);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!Boolean.parseBoolean(System.getProperty("jna.nosys", "true")) || Platform.isAndroid()) {
            try {
                Logger logger4 = LOG;
                Level level4 = DEBUG_JNA_LOAD_LEVEL;
                logger4.log(level4, "Trying (via loadLibrary) {0}", property);
                INVOKESTATIC_com_sun_jna_Native_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(property);
                logger4.log(level4, "Found jnidispatch on system path");
                return;
            } catch (UnsatisfiedLinkError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
        if (Boolean.getBoolean("jna.noclasspath")) {
            throw new UnsatisfiedLinkError("Unable to locate JNA native support library");
        }
        loadNativeDispatchLibraryFromClasspath();
    }

    public static void loadNativeDispatchLibraryFromClasspath() throws Throwable {
        try {
            String strReplace = System.mapLibraryName("jnidispatch").replace(".dylib", ".jnilib");
            if (Platform.isAIX()) {
                strReplace = "libjnidispatch.a";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/com/sun/jna/");
            sbLIZ.append(Platform.RESOURCE_PREFIX);
            sbLIZ.append("/");
            sbLIZ.append(strReplace);
            File fileExtractFromResourcePath = extractFromResourcePath(C2188811AlT.LIZIZ(sbLIZ), Native.class.getClassLoader());
            if (fileExtractFromResourcePath == null) {
                throw new UnsatisfiedLinkError("Could not find JNA native support");
            }
            Logger logger = LOG;
            Level level = DEBUG_JNA_LOAD_LEVEL;
            logger.log(level, "Trying {0}", fileExtractFromResourcePath.getAbsolutePath());
            System.setProperty("jnidispatch.path", fileExtractFromResourcePath.getAbsolutePath());
            System.load(fileExtractFromResourcePath.getAbsolutePath());
            String absolutePath = fileExtractFromResourcePath.getAbsolutePath();
            jnidispatchPath = absolutePath;
            logger.log(level, "Found jnidispatch at {0}", absolutePath);
            if (!isUnpacked(fileExtractFromResourcePath) || Boolean.getBoolean("jnidispatch.preserve")) {
                return;
            }
            deleteLibrary(fileExtractFromResourcePath);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new UnsatisfiedLinkError(e.getMessage());
        }
    }

    public static void unregisterAll() {
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            try {
                for (Map.Entry<Class<?>, long[]> entry : map.entrySet()) {
                    unregister(entry.getKey(), entry.getValue());
                }
                registeredClasses.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void dispose() {
        CallbackReference.disposeAll();
        Memory.disposeAll();
        NativeLibrary.disposeAll();
        unregisterAll();
        jnidispatchPath = null;
        System.setProperty("jna.loaded", "false");
    }

    public static void removeTemporaryFiles() {
        File[] fileArrListFiles = getTempDir().listFiles(new FilenameFilter() { // from class: com.sun.jna.Native.5
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                if (str.endsWith(".x") && str.startsWith("jna")) {
                    return true;
                }
                return false;
            }
        });
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                C0VSJ c0vsj = new C0VSJ(file.getParentFile(), file.getName().substring(0, r1.length() - 2));
                if (!c0vsj.exists() || c0vsj.delete()) {
                    file.delete();
                }
            }
        }
    }

    public static void unregister() {
        unregister(findDirectMappedClass(getCallingClass()));
    }

    public static Callback.UncaughtExceptionHandler getCallbackExceptionHandler() {
        return callbackExceptionHandler;
    }

    public static class AWT {
        /* JADX INFO: Thrown type has an unknown type hierarchy: java.awt.HeadlessException */
        public static long getComponentID(Object obj) throws HeadlessException {
            if (!GraphicsEnvironment.isHeadless()) {
                Component component = (Component) obj;
                if (!component.isLightweight()) {
                    if (component.isDisplayable()) {
                        if (Platform.isX11() && System.getProperty("java.version").startsWith("1.4") && !component.isVisible()) {
                            throw new IllegalStateException("Component must be visible");
                        }
                        return Native.getWindowHandle0(component);
                    }
                    throw new IllegalStateException("Component must be displayable");
                }
                throw new IllegalArgumentException("Component must be heavyweight");
            }
            throw new HeadlessException("No native windows when headless");
        }

        public static long getWindowID(Window window) {
            return getComponentID(window);
        }
    }

    public static class Buffers {
        public static boolean isBuffer(Class<?> cls) {
            return Buffer.class.isAssignableFrom(cls);
        }
    }

    public static void INVOKESTATIC_com_sun_jna_Native_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static boolean deleteLibrary(File file) {
        if (file.delete()) {
            return true;
        }
        markTemporaryFile(file);
        return false;
    }

    public static void detach(boolean z) {
        Thread threadU3 = C786410Ut5.u3();
        if (z) {
            nativeThreads.remove(threadU3);
            nativeThreadTerminationFlag.get();
            setDetachState(true, 0L);
        } else {
            Map<Thread, Pointer> map = nativeThreads;
            if (map.containsKey(threadU3)) {
                return;
            }
            Memory memory = nativeThreadTerminationFlag.get();
            map.put(threadU3, memory);
            setDetachState(false, memory.peer);
        }
    }

    public static File extractFromResourcePath(String str) {
        return extractFromResourcePath(str, null);
    }

    public static Class<?> findDirectMappedClass(Class<?> cls) {
        for (Method method : cls.getDeclaredMethods()) {
            if ((method.getModifiers() & 256) != 0) {
                return cls;
            }
        }
        int iLastIndexOf = cls.getName().lastIndexOf(e3.c);
        if (iLastIndexOf != -1) {
            try {
                return findDirectMappedClass(Class.forName(cls.getName().substring(0, iLastIndexOf), true, cls.getClassLoader()));
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        throw new IllegalArgumentException("Can't determine class with native methods from the current context (" + cls + ")");
    }

    public static Class<?> findEnclosingLibraryClass(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        Map<String, Object> map = typeOptions.get(cls);
        if (map != null) {
            Class<?> cls2 = (Class) map.get("enclosing-library");
            if (cls2 != null) {
                return cls2;
            }
            return cls;
        }
        if (Library.class.isAssignableFrom(cls)) {
            return cls;
        }
        if (Callback.class.isAssignableFrom(cls)) {
            cls = CallbackReference.findCallbackClass(cls);
        }
        Class<?> clsFindEnclosingLibraryClass = findEnclosingLibraryClass(cls.getDeclaringClass());
        if (clsFindEnclosingLibraryClass != null) {
            return clsFindEnclosingLibraryClass;
        }
        return findEnclosingLibraryClass(cls.getSuperclass());
    }

    public static byte[] getBytes(String str) {
        return getBytes(str, getDefaultStringEncoding());
    }

    public static Charset getCharset(String str) {
        Charset charsetForName;
        if (str != null) {
            try {
                charsetForName = Charset.forName(str);
            } catch (IllegalCharsetNameException | UnsupportedCharsetException e) {
                TryCatchGuardChecker.doCheck(e);
                LOG.log(Level.WARNING, "JNA Warning: Encoding ''{0}'' is unsupported ({1})", new Object[]{str, e.getMessage()});
                charsetForName = null;
            }
        } else {
            charsetForName = null;
        }
        if (charsetForName == null) {
            Logger logger = LOG;
            Level level = Level.WARNING;
            Charset charset = DEFAULT_CHARSET;
            logger.log(level, "JNA Warning: Using fallback encoding {0}", charset);
            return charset;
        }
        return charsetForName;
    }

    public static long getComponentID(Component component) {
        return AWT.getComponentID(component);
    }

    public static Pointer getComponentPointer(Component component) {
        return new Pointer(AWT.getComponentID(component));
    }

    public static Pointer getDirectBufferPointer(Buffer buffer) {
        long j_getDirectBufferPointer = _getDirectBufferPointer(buffer);
        if (j_getDirectBufferPointer == 0) {
            return null;
        }
        return new Pointer(j_getDirectBufferPointer);
    }

    public static Map<String, Object> getLibraryOptions(Class<?> cls) {
        Map mapEmptyMap;
        Map<Class<?>, Map<String, Object>> map = typeOptions;
        Map<String, Object> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        Class<?> clsFindEnclosingLibraryClass = findEnclosingLibraryClass(cls);
        if (clsFindEnclosingLibraryClass != null) {
            loadLibraryInstance(clsFindEnclosingLibraryClass);
        } else {
            clsFindEnclosingLibraryClass = cls;
        }
        Map<String, Object> map3 = map.get(clsFindEnclosingLibraryClass);
        if (map3 != null) {
            map.put(cls, map3);
            return map3;
        }
        try {
            Field field = clsFindEnclosingLibraryClass.getField("OPTIONS");
            field.setAccessible(true);
            mapEmptyMap = (Map) field.get(null);
            if (mapEmptyMap == null) {
                throw new IllegalStateException("Null options field");
            }
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
            mapEmptyMap = Collections.emptyMap();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OPTIONS must be a public field of type java.util.Map (");
            sbLIZ.append(e2);
            sbLIZ.append("): ");
            sbLIZ.append(clsFindEnclosingLibraryClass);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        HashMap map4 = new HashMap(mapEmptyMap);
        if (!map4.containsKey("type-mapper")) {
            map4.put("type-mapper", lookupField(clsFindEnclosingLibraryClass, "TYPE_MAPPER", TypeMapper.class));
        }
        if (!map4.containsKey("structure-alignment")) {
            map4.put("structure-alignment", lookupField(clsFindEnclosingLibraryClass, "STRUCTURE_ALIGNMENT", Integer.class));
        }
        if (!map4.containsKey("string-encoding")) {
            map4.put("string-encoding", lookupField(clsFindEnclosingLibraryClass, "STRING_ENCODING", String.class));
        }
        Map<String, Object> mapCacheOptions = cacheOptions(clsFindEnclosingLibraryClass, map4, null);
        if (cls != clsFindEnclosingLibraryClass) {
            typeOptions.put(cls, mapCacheOptions);
        }
        return mapCacheOptions;
    }

    public static int getNativeSize(Class<?> cls) {
        if (NativeMapped.class.isAssignableFrom(cls)) {
            cls = NativeMappedConverter.getInstance(cls).nativeType();
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return 4;
        }
        if (cls != Byte.TYPE && cls != Byte.class) {
            if (cls != Short.TYPE && cls != Short.class) {
                if (cls != Character.TYPE && cls != Character.class) {
                    if (cls == Integer.TYPE || cls == Integer.class) {
                        return 4;
                    }
                    if (cls == Long.TYPE || cls == Long.class) {
                        return 8;
                    }
                    if (cls == Float.TYPE || cls == Float.class) {
                        return 4;
                    }
                    if (cls == Double.TYPE || cls == Double.class) {
                        return 8;
                    }
                    if (Structure.class.isAssignableFrom(cls)) {
                        if (Structure.ByValue.class.isAssignableFrom(cls)) {
                            return Structure.size(cls);
                        }
                        return POINTER_SIZE;
                    }
                    if (!Pointer.class.isAssignableFrom(cls) && ((!Platform.HAS_BUFFERS || !Buffers.isBuffer(cls)) && !Callback.class.isAssignableFrom(cls) && String.class != cls && WString.class != cls)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Native size for type \"");
                        sbLIZ.append(cls.getName());
                        sbLIZ.append("\" is unknown");
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return POINTER_SIZE;
                }
                return WCHAR_SIZE;
            }
            return 2;
        }
        return 1;
    }

    public static Pointer getPointer(long j) {
        long j_getPointer = _getPointer(j);
        if (j_getPointer == 0) {
            return null;
        }
        return new Pointer(j_getPointer);
    }

    public static String getSignature(Class<?> cls) {
        if (cls.isArray()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(e3.e);
            sbLIZ.append(getSignature(cls.getComponentType()));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (cls.isPrimitive()) {
            if (cls == Void.TYPE) {
                return "V";
            }
            if (cls == Boolean.TYPE) {
                return "Z";
            }
            if (cls == Byte.TYPE) {
                return "B";
            }
            if (cls == Short.TYPE) {
                return "S";
            }
            if (cls == Character.TYPE) {
                return "C";
            }
            if (cls == Integer.TYPE) {
                return "I";
            }
            if (cls == Long.TYPE) {
                return "J";
            }
            if (cls == Float.TYPE) {
                return "F";
            }
            if (cls == Double.TYPE) {
                return "D";
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("L");
        sbLIZ2.append(replace(e3.d, "/", cls.getName()));
        sbLIZ2.append(";");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static String getStringEncoding(Class<?> cls) {
        String str = (String) getLibraryOptions(cls).get("string-encoding");
        if (str == null) {
            return getDefaultStringEncoding();
        }
        return str;
    }

    public static int getStructureAlignment(Class<?> cls) {
        Integer num = (Integer) getLibraryOptions(cls).get("structure-alignment");
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static Pointer getTerminationFlag(Thread thread) {
        return nativeThreads.get(thread);
    }

    public static TypeMapper getTypeMapper(Class<?> cls) {
        return (TypeMapper) getLibraryOptions(cls).get("type-mapper");
    }

    public static String getWebStartLibraryPath(String str) {
        if (System.getProperty("javawebstart.version") == null) {
            return null;
        }
        try {
            String str2 = (String) C2204961BRm.a0((Method) AccessController.doPrivileged(new PrivilegedAction<Method>() { // from class: com.sun.jna.Native.4
                @Override // java.security.PrivilegedAction
                public Method run() {
                    try {
                        Method declaredMethod = ClassLoader.class.getDeclaredMethod("findLibrary", String.class);
                        declaredMethod.setAccessible(true);
                        return declaredMethod;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                }
            }), Native.class.getClassLoader(), new Object[]{str}, new C0WZX("dzBzEhEvUYTWW1ZvaxOQb+4d", null));
            if (str2 == null) {
                return null;
            }
            return new C0VSJ(str2).getParent();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static long getWindowID(Window window) {
        return AWT.getComponentID(window);
    }

    public static Pointer getWindowPointer(Window window) {
        return new Pointer(AWT.getComponentID(window));
    }

    public static boolean isSupportedNativeType(Class<?> cls) {
        if (Structure.class.isAssignableFrom(cls)) {
            return true;
        }
        try {
            if (getNativeSize(cls) != 0) {
                return true;
            }
            return false;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean isUnpacked(File file) {
        return file.getName().startsWith("jna");
    }

    public static <T extends Library> T load(Class<T> cls) {
        return (T) load((String) null, cls);
    }

    public static <T> T loadLibrary(Class<T> cls) {
        return (T) loadLibrary((String) null, cls);
    }

    public static void loadLibraryInstance(Class<?> cls) {
        if (cls != null && !libraries.containsKey(cls)) {
            try {
                for (Field field : cls.getFields()) {
                    if (field.getType() == cls && Modifier.isStatic(field.getModifiers())) {
                        field.setAccessible(true);
                        libraries.put(cls, new WeakReference(field.get(null)));
                        return;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Could not access instance of ");
                sbLIZ.append(cls);
                sbLIZ.append(" (");
                sbLIZ.append(e);
                sbLIZ.append(")");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void main(java.lang.String[] r4) {
        /*
            java.lang.Class<com.sun.jna.Native> r0 = com.sun.jna.Native.class
            java.lang.Package r4 = r0.getPackage()
            java.lang.String r3 = "Java Native Access (JNA)"
            if (r4 == 0) goto L99
            java.lang.String r0 = r4.getSpecificationTitle()
            if (r0 != 0) goto L9a
        L10:
            java.lang.String r2 = "5.14.0"
            if (r4 == 0) goto L96
            java.lang.String r0 = r4.getSpecificationVersion()
            if (r0 != 0) goto L97
        L1a:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            java.lang.String r0 = " API Version "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            java.lang.String r3 = "5.14.0 (package information missing)"
            if (r4 == 0) goto L93
            java.lang.String r0 = r4.getImplementationVersion()
            if (r0 != 0) goto L94
        L3c:
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Version: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.println(r0)
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = " Native: "
            r1.append(r0)
            java.lang.String r0 = getNativeVersion()
            r1.append(r0)
            java.lang.String r0 = " ("
            r1.append(r0)
            java.lang.String r0 = getAPIChecksum()
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.println(r0)
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = " Prefix: "
            r1.append(r0)
            java.lang.String r0 = com.sun.jna.Platform.RESOURCE_PREFIX
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.println(r0)
            return
        L93:
            r0 = r3
        L94:
            r3 = r0
            goto L3c
        L96:
            r0 = r2
        L97:
            r2 = r0
            goto L1a
        L99:
            r0 = r3
        L9a:
            r3 = r0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Native.main(java.lang.String[]):void");
    }

    public static void markTemporaryFile(File file) {
        try {
            File parentFile = file.getParentFile();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(file.getName());
            sbLIZ.append(".x");
            new C0VSJ(parentFile, C2188811AlT.LIZIZ(sbLIZ)).createNewFile();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static Class<?> nativeType(Class<?> cls) {
        return NativeMappedConverter.getInstance(cls).nativeType();
    }

    public static long open(String str) {
        return open(str, -1);
    }

    public static void register(NativeLibrary nativeLibrary) {
        register(findDirectMappedClass(getCallingClass()), nativeLibrary);
    }

    public static boolean registered(Class<?> cls) {
        boolean zContainsKey;
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            try {
                zContainsKey = map.containsKey(cls);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zContainsKey;
    }

    public static void setCallbackExceptionHandler(Callback.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            uncaughtExceptionHandler = DEFAULT_HANDLER;
        }
        callbackExceptionHandler = uncaughtExceptionHandler;
    }

    public static Library synchronizedLibrary(final Library library) {
        Class<?> cls = library.getClass();
        if (Proxy.isProxyClass(cls)) {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(library);
            if (invocationHandler instanceof Library.Handler) {
                final Library.Handler handler = (Library.Handler) invocationHandler;
                return (Library) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new InvocationHandler() { // from class: com.sun.jna.Native.3
                    @Override // java.lang.reflect.InvocationHandler
                    public Object invoke(Object obj, Method method, Object[] objArr) {
                        Object objInvoke;
                        synchronized (handler.getNativeLibrary()) {
                            try {
                                objInvoke = handler.invoke(library, method, objArr);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        return objInvoke;
                    }
                });
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unrecognized proxy handler: ");
            sbLIZ.append(invocationHandler);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new IllegalArgumentException("Library must be a proxy class");
    }

    public static byte[] toByteArray(String str) {
        return toByteArray(str, getDefaultStringEncoding());
    }

    public static char[] toCharArray(String str) {
        char[] charArray = str.toCharArray();
        char[] cArr = new char[charArray.length + 1];
        System.arraycopy(charArray, 0, cArr, 0, charArray.length);
        return cArr;
    }

    public static String toString(char[] cArr) {
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (cArr[i] == 0) {
                length = i;
                break;
            }
            i++;
        }
        if (length == 0) {
            return "";
        }
        return new String(cArr, 0, length);
    }

    public static List<String> toStringList(char[] cArr) {
        return toStringList(cArr, 0, cArr.length);
    }

    public static void unregister(Class<?> cls) {
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            try {
                long[] jArr = map.get(cls);
                if (jArr != null) {
                    unregister(cls, jArr);
                    map.remove(cls);
                    registeredLibraries.remove(cls);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void register(String str) {
        register(findDirectMappedClass(getCallingClass()), str);
    }

    public static String toString(byte[] bArr) {
        return toString(bArr, getDefaultStringEncoding());
    }

    public static File extractFromResourcePath(String str, ClassLoader classLoader) throws Throwable {
        Level level;
        String strMapSharedLibraryName;
        String strLIZIZ;
        File c0vsj;
        String str2;
        C0VSV c0vsv;
        if (DEBUG_LOAD || (DEBUG_JNA_LOAD && str.contains("jnidispatch"))) {
            level = Level.INFO;
        } else {
            level = Level.FINE;
        }
        if (classLoader == null && (classLoader = C786410Ut5.u3().getContextClassLoader()) == null) {
            classLoader = Native.class.getClassLoader();
        }
        Logger logger = LOG;
        logger.log(level, "Looking in classpath from {0} for {1}", new Object[]{classLoader, str});
        if (str.startsWith("/")) {
            strMapSharedLibraryName = str;
        } else {
            strMapSharedLibraryName = NativeLibrary.mapSharedLibraryName(str);
        }
        if (str.startsWith("/")) {
            strLIZIZ = str;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(Platform.RESOURCE_PREFIX);
            sbLIZ.append("/");
            sbLIZ.append(strMapSharedLibraryName);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (strLIZIZ.startsWith("/")) {
            strLIZIZ = strLIZIZ.substring(1);
        }
        URL resource = classLoader.getResource(strLIZIZ);
        if (resource == null) {
            String str3 = Platform.RESOURCE_PREFIX;
            if (strLIZIZ.startsWith(str3)) {
                if (str3.startsWith("darwin")) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("darwin/");
                    sbLIZ2.append(strLIZIZ.substring(str3.length() + 1));
                    resource = classLoader.getResource(C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (resource == null) {
                    resource = classLoader.getResource(strMapSharedLibraryName);
                }
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("com/sun/jna/");
                sbLIZ3.append(str3);
                sbLIZ3.append("/");
                if (strLIZIZ.startsWith(C2188811AlT.LIZIZ(sbLIZ3))) {
                    if (str3.startsWith("com/sun/jna/darwin")) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("com/sun/jna/darwin");
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("com/sun/jna/");
                        sbLIZ5.append(str3);
                        sbLIZ4.append(strLIZIZ.substring(C2188811AlT.LIZIZ(sbLIZ5).length() + 1));
                        resource = classLoader.getResource(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    if (resource == null) {
                        resource = classLoader.getResource(strMapSharedLibraryName);
                    }
                }
            }
        }
        if (resource == null) {
            String property = System.getProperty("java.class.path");
            if (classLoader instanceof URLClassLoader) {
                property = Arrays.asList(((URLClassLoader) classLoader).getURLs()).toString();
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("Native library (");
            sbLIZ6.append(strLIZIZ);
            sbLIZ6.append(") not found in resource path (");
            sbLIZ6.append(property);
            sbLIZ6.append(")");
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ6));
        }
        logger.log(level, "Found library resource at {0}", resource);
        if (resource.getProtocol().toLowerCase().equals("file")) {
            try {
                c0vsj = new C0VSJ(new URI(resource.toString()));
            } catch (URISyntaxException e) {
                TryCatchGuardChecker.doCheck(e);
                c0vsj = new C0VSJ(resource.getPath());
            }
            LOG.log(level, "Looking in {0}", c0vsj.getAbsolutePath());
            if (!c0vsj.exists()) {
                throw new IOException("File URL " + resource + " could not be properly decoded");
            }
        } else {
            C0VSV c0vsv2 = null;
            if (Boolean.getBoolean("jna.nounpack")) {
                return null;
            }
            InputStream inputStreamOpenStream = resource.openStream();
            try {
                if (inputStreamOpenStream != null) {
                    try {
                        File tempDir = getTempDir();
                        if (Platform.isWindows()) {
                            str2 = ".dll";
                        } else {
                            str2 = null;
                        }
                        c0vsj = File.createTempFile("jna", str2, tempDir);
                        if (!Boolean.getBoolean("jnidispatch.preserve")) {
                            c0vsj.deleteOnExit();
                        }
                        logger.log(level, "Extracting library to {0}", c0vsj.getAbsolutePath());
                        c0vsv = new C0VSV(c0vsj);
                    } catch (IOException e2) {
                        e = e2;
                    }
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = inputStreamOpenStream.read(bArr, 0, 1024);
                            if (i > 0) {
                                c0vsv.write(bArr, 0, i);
                            } else {
                                try {
                                    break;
                                } catch (IOException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                }
                            }
                        }
                        inputStreamOpenStream.close();
                        try {
                            c0vsv.close();
                            return c0vsj;
                        } catch (IOException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                    } catch (IOException e5) {
                        e = e5;
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("Failed to create temporary file for ");
                        sbLIZ7.append(str);
                        sbLIZ7.append(" library: ");
                        sbLIZ7.append(e.getMessage());
                        throw new IOException(C2188811AlT.LIZIZ(sbLIZ7));
                    } catch (Throwable th) {
                        th = th;
                        c0vsv2 = c0vsv;
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            inputStreamOpenStream.close();
                        } catch (IOException e6) {
                            TryCatchGuardChecker.doCheck(e6);
                        }
                        if (c0vsv2 != null) {
                            try {
                                c0vsv2.close();
                                throw th;
                            } catch (IOException e7) {
                                TryCatchGuardChecker.doCheck(e7);
                                throw th;
                            }
                        }
                        throw th;
                    }
                } else {
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("Can't obtain InputStream for ");
                    sbLIZ8.append(strLIZIZ);
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ8));
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return c0vsj;
    }

    public static NativeMapped fromNative(Method method, Object obj) {
        Class<?> returnType = method.getReturnType();
        return (NativeMapped) NativeMappedConverter.getInstance(returnType).fromNative(obj, new MethodResultContext(returnType, null, null, method));
    }

    public static byte[] getBytes(String str, String str2) {
        return getBytes(str, getCharset(str2));
    }

    public static int getNativeSize(Class<?> cls, Object obj) {
        if (cls.isArray()) {
            int length = Array.getLength(obj);
            if (length > 0) {
                return length * getNativeSize(cls.getComponentType(), Array.get(obj, 0));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Arrays of length zero not allowed: ");
            sbLIZ.append(cls);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (Structure.class.isAssignableFrom(cls) && !Structure.ByReference.class.isAssignableFrom(cls)) {
            return Structure.size(cls, (Structure) obj);
        }
        try {
            return getNativeSize(cls);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("The type \"");
            sbLIZ2.append(cls.getName());
            sbLIZ2.append("\" is not supported: ");
            sbLIZ2.append(e.getMessage());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static String getString(Pointer pointer, long j) {
        return getString(pointer, j, getDefaultStringEncoding());
    }

    public static boolean isCompatibleVersion(String str, String str2) {
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        if (strArrSplit.length < 3 || strArrSplit2.length < 3) {
            return false;
        }
        int i = CastIntegerProtector.parseInt(strArrSplit[0]);
        int i2 = CastIntegerProtector.parseInt(strArrSplit2[0]);
        int i3 = CastIntegerProtector.parseInt(strArrSplit[1]);
        int i4 = CastIntegerProtector.parseInt(strArrSplit2[1]);
        if (i != i2 || i3 > i4) {
            return false;
        }
        return true;
    }

    public static <T extends Library> T load(String str, Class<T> cls) {
        return (T) load(str, cls, Collections.emptyMap());
    }

    public static <T> T loadLibrary(String str, Class<T> cls) {
        return (T) loadLibrary(str, cls, Collections.emptyMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117 A[FALL_THROUGH, PHI: r14
      0x0117: PHI (r14v2 java.lang.Class<?>) = (r14v3 java.lang.Class<?>), (r14v6 java.lang.Class<?>), (r14v0 java.lang.Class<?>) binds: [B:44:0x00da, B:43:0x00d7, B:42:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022c  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void register(java.lang.Class<?> r40, com.sun.jna.NativeLibrary r41) {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Native.register(java.lang.Class, com.sun.jna.NativeLibrary):void");
    }

    public static void setCallbackThreadInitializer(Callback callback, CallbackThreadInitializer callbackThreadInitializer) {
        CallbackReference.setCallbackThreadInitializer(callback, callbackThreadInitializer);
    }

    public static byte[] toByteArray(String str, Charset charset) {
        byte[] bytes = getBytes(str, charset);
        byte[] bArr = new byte[bytes.length + 1];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    public static Object toNative(ToNativeConverter toNativeConverter, Object obj) {
        return toNativeConverter.toNative(obj, new ToNativeContext());
    }

    public static String toString(byte[] bArr, Charset charset) {
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (bArr[i] == 0) {
                length = i;
                break;
            }
            i++;
        }
        if (length == 0) {
            return "";
        }
        return new String(bArr, 0, length, charset);
    }

    public static NativeMapped fromNative(Class<?> cls, Object obj) {
        return (NativeMapped) NativeMappedConverter.getInstance(cls).fromNative(obj, new FromNativeContext(cls));
    }

    public static byte[] getBytes(String str, Charset charset) {
        return str.getBytes(charset);
    }

    public static <T extends Library> T load(Class<T> cls, Map<String, ?> map) {
        return (T) load(null, cls, map);
    }

    public static <T> T loadLibrary(Class<T> cls, Map<String, ?> map) {
        return (T) loadLibrary(null, cls, map);
    }

    public static void register(Class<?> cls, String str) {
        register(cls, NativeLibrary.getInstance(str, (Map<String, ?>) Collections.singletonMap("classloader", cls.getClassLoader())));
    }

    public static byte[] toByteArray(String str, String str2) {
        return toByteArray(str, getCharset(str2));
    }

    public static String toString(byte[] bArr, String str) {
        return toString(bArr, getCharset(str));
    }

    public static Map<String, Object> cacheOptions(Class<?> cls, Map<String, ?> map, Object obj) {
        HashMap map2 = new HashMap(map);
        map2.put("enclosing-library", cls);
        typeOptions.put(cls, map2);
        if (obj != null) {
            libraries.put(cls, new WeakReference(obj));
        }
        if (!cls.isInterface() && Library.class.isAssignableFrom(cls)) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Class<?> cls2 = interfaces[i];
                if (Library.class.isAssignableFrom(cls2)) {
                    cacheOptions(cls2, map2, obj);
                    break;
                }
                i++;
            }
        }
        return map2;
    }

    public static Object fromNative(FromNativeConverter fromNativeConverter, Object obj, Method method) {
        return fromNativeConverter.fromNative(obj, new MethodResultContext(method.getReturnType(), null, null, method));
    }

    public static int getConversion(Class<?> cls, TypeMapper typeMapper, boolean z) {
        if (cls == Void.class) {
            cls = Void.TYPE;
        }
        if (typeMapper != null) {
            FromNativeConverter fromNativeConverter = typeMapper.getFromNativeConverter(cls);
            ToNativeConverter toNativeConverter = typeMapper.getToNativeConverter(cls);
            if (fromNativeConverter != null) {
                Class<?> clsNativeType = fromNativeConverter.nativeType();
                if (clsNativeType == String.class) {
                    return 24;
                }
                if (clsNativeType == WString.class) {
                    return 25;
                }
                return 23;
            }
            if (toNativeConverter != null) {
                Class<?> clsNativeType2 = toNativeConverter.nativeType();
                if (clsNativeType2 == String.class) {
                    return 24;
                }
                if (clsNativeType2 == WString.class) {
                    return 25;
                }
                return 23;
            }
        }
        if (Pointer.class.isAssignableFrom(cls)) {
            return 1;
        }
        if (String.class == cls) {
            return 2;
        }
        if (WString.class.isAssignableFrom(cls)) {
            return 20;
        }
        if (Platform.HAS_BUFFERS && Buffers.isBuffer(cls)) {
            return 5;
        }
        if (Structure.class.isAssignableFrom(cls)) {
            if (Structure.ByValue.class.isAssignableFrom(cls)) {
                return 4;
            }
            return 3;
        }
        if (cls.isArray()) {
            char cCharAt = cls.getName().charAt(1);
            if (cCharAt != 'F') {
                if (cCharAt != 'S') {
                    if (cCharAt != 'Z') {
                        if (cCharAt != 'I') {
                            if (cCharAt != 'J') {
                                switch (cCharAt) {
                                    case 'B':
                                        return 6;
                                    case 'C':
                                        return 8;
                                    case 'D':
                                        return 12;
                                }
                            }
                            return 10;
                        }
                        return 9;
                    }
                    return 13;
                }
                return 7;
            }
            return 11;
        }
        if (cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                return 14;
            }
            return 0;
        }
        if (Callback.class.isAssignableFrom(cls)) {
            return 15;
        }
        if (IntegerType.class.isAssignableFrom(cls)) {
            return 21;
        }
        if (PointerType.class.isAssignableFrom(cls)) {
            return 22;
        }
        if (NativeMapped.class.isAssignableFrom(cls)) {
            Class<?> clsNativeType3 = NativeMappedConverter.getInstance(cls).nativeType();
            if (clsNativeType3 == String.class) {
                return 18;
            }
            if (clsNativeType3 == WString.class) {
                return 19;
            }
            return 17;
        }
        if (JNIEnv.class == cls) {
            return 27;
        }
        if (z) {
            return 26;
        }
        return -1;
    }

    public static String getString(Pointer pointer, long j, String str) {
        byte[] stringBytes = getStringBytes(pointer, pointer.peer, j);
        if (str != null) {
            try {
                return new String(stringBytes, str);
            } catch (UnsupportedEncodingException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return new String(stringBytes);
    }

    public static <T extends Library> T load(String str, Class<T> cls, Map<String, ?> map) {
        if (Library.class.isAssignableFrom(cls)) {
            Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new Library.Handler(str, cls, map));
            cacheOptions(cls, map, objNewProxyInstance);
            return cls.cast(objNewProxyInstance);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Interface (");
        sbLIZ.append(cls.getSimpleName());
        sbLIZ.append(") of library=");
        sbLIZ.append(str);
        sbLIZ.append(" does not extend ");
        sbLIZ.append("Library");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static <T> T loadLibrary(String str, Class<T> cls, Map<String, ?> map) {
        if (Library.class.isAssignableFrom(cls)) {
            Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new Library.Handler(str, cls, map));
            cacheOptions(cls, map, objNewProxyInstance);
            return cls.cast(objNewProxyInstance);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Interface (");
        sbLIZ.append(cls.getSimpleName());
        sbLIZ.append(") of library=");
        sbLIZ.append(str);
        sbLIZ.append(" does not extend ");
        sbLIZ.append("Library");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Object lookupField(Class<?> cls, String str, Class<?> cls2) {
        try {
            Field field = cls.getField(str);
            field.setAccessible(true);
            return field.get(null);
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" must be a public field of type ");
            sbLIZ.append(cls2.getName());
            sbLIZ.append(" (");
            sbLIZ.append(e2);
            sbLIZ.append("): ");
            sbLIZ.append(cls);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static String replace(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int iIndexOf = str3.indexOf(str);
            if (iIndexOf == -1) {
                sb.append(str3);
                return sb.toString();
            }
            sb.append(str3.substring(0, iIndexOf));
            sb.append(str2);
            str3 = str3.substring(iIndexOf + str.length());
        }
    }

    public static List<String> toStringList(char[] cArr, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            if (cArr[i] == 0) {
                if (i4 == i) {
                    return arrayList;
                }
                arrayList.add(new String(cArr, i4, i - i4));
                i4 = i + 1;
            }
            i++;
        }
        if (i4 < i3) {
            arrayList.add(new String(cArr, i4, i3 - i4));
        }
        return arrayList;
    }

    public static Structure invokeStructure(Function function, long j, int i, Object[] objArr, Structure structure) {
        invokeStructure(function, j, i, objArr, structure.getPointer().peer, structure.getTypeInfo().peer);
        return structure;
    }
}
