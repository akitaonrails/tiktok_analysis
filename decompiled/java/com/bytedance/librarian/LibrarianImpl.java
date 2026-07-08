package com.bytedance.librarian;

import X.C09NU;
import X.C0VSJ;
import X.C0VSV;
import X.C2188811AlT;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes31.dex */
public class LibrarianImpl {
    public static final String[] LJIILIIL = {"log", "m", "stdc++", "dl", "c", "z", "android", "jnigraphics", "EGL", "GLESv1_CM", "GLESv2", "GLESv3", "OpenSLES", "OpenMAXAL"};
    public static final LibrarianImpl instance;
    public final LibrarianMonitor LIZ;
    public final C0VSJ LIZJ;
    public volatile boolean LJFF;
    public List<ZipFile> LJIIIIZZ;
    public String LJIIIZ;
    public Map<String, String> LJIIJ;
    public String[] LJIIJJI;
    public String LJIIL;
    public final File mWorkDir;
    public final List<ZipFile> LJI = new CopyOnWriteArrayList();
    public final List<ZipFile> LJII = new ArrayList();
    public ApplicationInfo LIZLLL = Librarian.LIZ.getApplicationInfo();
    public C0VSJ LJ = new C0VSJ(this.LIZLLL.nativeLibraryDir);
    public final Map<String, LibRecorder> LIZIZ = new HashMap();

    public static class LibRecorder {
        public boolean LIZ;

        public final String toString() {
            return Boolean.toString(this.LIZ);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public class Locker {
        public RandomAccessFile LIZ;
        public FileLock LIZIZ;
        public FileChannel LIZJ;
        public final File LIZLLL;

        public final void LIZ() {
            FileLock fileLock = this.LIZIZ;
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            LibrarianMonitor librarianMonitor = LibrarianImpl.this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("released lock ");
            sbLIZ.append(this.LIZLLL.getPath());
            C2188811AlT.LIZIZ(sbLIZ);
            librarianMonitor.getClass();
            LibrarianImpl.this.LIZIZ(this.LIZJ);
            LibrarianImpl.this.LIZIZ(this.LIZ);
        }

        public final void LIZIZ() throws IOException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.LIZLLL, "rw");
            this.LIZ = randomAccessFile;
            try {
                this.LIZJ = randomAccessFile.getChannel();
                try {
                    LibrarianMonitor librarianMonitor = LibrarianImpl.this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("blocking on lock ");
                    sbLIZ.append(this.LIZLLL.getPath());
                    C2188811AlT.LIZIZ(sbLIZ);
                    librarianMonitor.getClass();
                    this.LIZIZ = this.LIZJ.lock();
                    LibrarianMonitor librarianMonitor2 = LibrarianImpl.this.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("acquired on lock ");
                    sbLIZ2.append(this.LIZLLL.getPath());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    librarianMonitor2.getClass();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    LibrarianImpl.this.LIZIZ(this.LIZJ);
                    throw e;
                }
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                LibrarianImpl.this.LIZIZ(this.LIZ);
                throw e2;
            }
        }

        public Locker(C0VSJ c0vsj) {
            this.LIZLLL = c0vsj;
        }
    }

    static {
        Context context = Librarian.LIZ;
        if (context == null) {
            throw new LibrarianUnsatisfiedLinkError("you should call init first or use loadLibraryForModule.");
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        File dir = context.getDir("librarian", 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String str = Librarian.LIZIZ != null ? Librarian.LIZIZ : "default.version";
        C0VSJ c0vsj = new C0VSJ(applicationInfo.sourceDir);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(e3.d);
        sbLIZ.append(c0vsj.lastModified() >> 8);
        C0VSJ c0vsj2 = new C0VSJ(dir, C2188811AlT.LIZIZ(sbLIZ));
        File[] fileArrListFiles = dir.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (!c0vsj2.getName().equals(file.getName())) {
                    File[] fileArrListFiles2 = file.listFiles();
                    if (fileArrListFiles2 != null) {
                        for (File file2 : fileArrListFiles2) {
                            file2.delete();
                        }
                    }
                    file.delete();
                }
            }
        }
        c0vsj2.mkdirs();
        if (!c0vsj2.exists()) {
            instance = null;
            return;
        }
        LibrarianMonitor librarianMonitor = Librarian.LIZJ;
        if (librarianMonitor == null) {
            librarianMonitor = new LibrarianMonitor();
        }
        instance = new LibrarianImpl(c0vsj2, librarianMonitor);
    }

    public final void LIZ() {
        if (this.LJFF) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LJFF) {
                    return;
                }
                LJFF();
                HashMap map = new HashMap();
                this.LJIIJ = map;
                map.put("arm64-v8a", "arm64");
                this.LJIIJ.put("armeabi-v7a", "arm");
                this.LJIIJ.put("armeabi", "arm");
                String str = null;
                try {
                    Class<?> cls = Class.forName("dalvik.system.VMRuntime");
                    str = (String) cls.getDeclaredMethod("vmInstructionSet", new Class[0]).invoke(cls.getDeclaredMethod("getRuntime", new Class[0]).invoke(null, new Object[0]), new Object[0]);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    LibrarianMonitor librarianMonitor = this.LIZ;
                    new LibrarianUnsatisfiedLinkError("reflect err", e);
                    librarianMonitor.getClass();
                }
                this.LJIIIZ = str;
                LibrarianMonitor librarianMonitor2 = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("vm instruction set: ");
                sbLIZ.append(this.LJIIIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                librarianMonitor2.getClass();
                this.LJIIJJI = Build.SUPPORTED_ABIS;
                this.LJFF = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJFF() {
        if (!Librarian.LJ) {
            ((CopyOnWriteArrayList) this.LJI).clear();
        }
        C0VSJ c0vsj = new C0VSJ(this.LIZLLL.sourceDir);
        ArrayList<File> arrayList = new ArrayList();
        arrayList.add(c0vsj);
        String[] strArr = this.LIZLLL.splitSourceDirs;
        boolean z = false;
        if (strArr != null && strArr.length != 0) {
            for (String str : strArr) {
                arrayList.add(new C0VSJ(str));
                LibrarianMonitor librarianMonitor = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("split source dir: ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                librarianMonitor.getClass();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (File file : arrayList) {
            try {
                C09NU c09nu = new C09NU(file);
                if (Librarian.LJ) {
                    arrayList2.add(c09nu);
                } else {
                    ((CopyOnWriteArrayList) this.LJI).add(c09nu);
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("fail to get zip file ");
                sbLIZ2.append(file.getName());
                sbLIZ2.append(", size ");
                sbLIZ2.append(file.length());
                sbLIZ2.append(", exists ");
                sbLIZ2.append(file.exists());
                new LibrarianUnsatisfiedLinkError(C2188811AlT.LIZIZ(sbLIZ2), e).printStackTrace();
                z = true;
            }
        }
        if (Librarian.LJ) {
            if (!z || ((CopyOnWriteArrayList) this.LJI).isEmpty()) {
                ((CopyOnWriteArrayList) this.LJI).clear();
                ((CopyOnWriteArrayList) this.LJI).addAll(arrayList2);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("initBaseApks: open failed during dont-kill, keep cached apk zip files=");
            sbLIZ3.append(((CopyOnWriteArrayList) this.LJI).size());
            sbLIZ3.append(", newly opened=");
            sbLIZ3.append(arrayList2.size());
            new LibrarianUnsatisfiedLinkError(C2188811AlT.LIZIZ(sbLIZ3)).printStackTrace();
        }
    }

    public final List<ZipFile> LJIIJJI() {
        ArrayList arrayList;
        List<ZipFile> list = this.LJIIIIZZ;
        if (list != null) {
            return list;
        }
        synchronized (this.LJII) {
            try {
                arrayList = new ArrayList(((CopyOnWriteArrayList) this.LJI).size() + ((ArrayList) this.LJII).size());
                arrayList.addAll(this.LJI);
                arrayList.addAll(this.LJII);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LJIIIIZZ = arrayList;
        return arrayList;
    }

    public final void LIZIZ(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.getClass();
        }
    }

    public final boolean LIZJ(C0VSJ c0vsj) throws IOException {
        LIZLLL(c0vsj.getName());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lib/");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append("/");
        sbLIZ.append(c0vsj.getName());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        for (ZipFile zipFile : LJIIJJI()) {
            ZipEntry entry = zipFile.getEntry(strLIZIZ);
            if (entry != null) {
                InputStream inputStream = zipFile.getInputStream(entry);
                try {
                    LJIIL(c0vsj, inputStream);
                    LibrarianMonitor librarianMonitor = this.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("get lib file ");
                    sbLIZ2.append(c0vsj.getPath());
                    sbLIZ2.append(" from ");
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(" of ");
                    sbLIZ2.append(zipFile.getName());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    librarianMonitor.getClass();
                    LIZIZ(inputStream);
                    return true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LIZIZ(inputStream);
                    throw th;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.librarian.LibrarianImpl.LIZLLL(java.lang.String):void");
    }

    public LibrarianImpl(C0VSJ c0vsj, LibrarianMonitor librarianMonitor) {
        this.mWorkDir = c0vsj;
        this.LIZ = librarianMonitor;
        this.LIZJ = new C0VSJ(c0vsj, "process.lock");
    }

    public final void LJ(C0VSJ c0vsj, boolean z) {
        String name = c0vsj.getName();
        synchronized (this) {
            try {
                Locker locker = new Locker(this.LIZJ);
                try {
                    try {
                        locker.LIZIZ();
                        if (!LIZJ(c0vsj)) {
                            if (z) {
                                LibrarianMonitor librarianMonitor = this.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("may be system lib, no found ");
                                sbLIZ.append(name);
                                C2188811AlT.LIZIZ(sbLIZ);
                                librarianMonitor.getClass();
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("fail to extract ");
                                sbLIZ2.append(name);
                                throw new LibrarianUnsatisfiedLinkError(C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        }
                        locker.LIZ();
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("fail to extract ");
                        sbLIZ3.append(name);
                        throw new LibrarianUnsatisfiedLinkError(C2188811AlT.LIZIZ(sbLIZ3), e);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    locker.LIZ();
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final void LJII(String str, boolean z) {
        synchronized (this.LIZIZ) {
            try {
                LibRecorder libRecorder = (LibRecorder) ((HashMap) this.LIZIZ).get(str);
                if (libRecorder != null) {
                    if (libRecorder.LIZ) {
                        return;
                    }
                } else {
                    libRecorder = new LibRecorder();
                    ((HashMap) this.LIZIZ).put(str, libRecorder);
                }
                synchronized (libRecorder) {
                    try {
                        if (libRecorder.LIZ) {
                            LibrarianMonitor librarianMonitor = this.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("lib was already loaded before: ");
                            sbLIZ.append(str);
                            C2188811AlT.LIZIZ(sbLIZ);
                            librarianMonitor.getClass();
                            return;
                        }
                        LJIIIZ(str, z);
                        libRecorder.LIZ = true;
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x015d A[Catch: IOException -> 0x01b6, TryCatch #3 {IOException -> 0x01b6, blocks: (B:37:0x0150, B:38:0x0157, B:40:0x015d, B:42:0x0173, B:44:0x017b, B:45:0x017e, B:59:0x01b2, B:60:0x01b5), top: B:77:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0198  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:69:0x01cb
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.String r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.librarian.LibrarianImpl.LJIIIIZZ(java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0054 A[EXC_TOP_SPLITTER, LOOP:1: B:38:0x0054->B:31:0x00bc, LOOP_START, PHI: r4
      0x0054: PHI (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:18:0x0050, B:31:0x00bc] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.lang.String r10, boolean r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.librarian.LibrarianImpl.LJIIIZ(java.lang.String, boolean):void");
    }

    public final boolean LJIIJ(String str, String str2) {
        try {
            this.LIZ.LIZ(str);
            LibrarianMonitor librarianMonitor = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loaded the origin lib ");
            sbLIZ.append(str);
            sbLIZ.append(", tag: ");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            librarianMonitor.getClass();
            return true;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            LibrarianMonitor librarianMonitor2 = this.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fail to load ");
            sbLIZ2.append(str);
            sbLIZ2.append(", tag: ");
            sbLIZ2.append(str2);
            C2188811AlT.LIZIZ(sbLIZ2);
            librarianMonitor2.getClass();
            ArrayList<UnsatisfiedLinkError> arrayList = LibrarianUnsatisfiedLinkError.LLILLJJLI;
            synchronized (arrayList) {
                try {
                    arrayList.add(e);
                    C0VSJ c0vsj = new C0VSJ(Librarian.LIZ.getApplicationInfo().nativeLibraryDir);
                    if (this.LJ.equals(c0vsj)) {
                        return false;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("System.loadLibrary(\"");
                    sbLIZ3.append(str);
                    sbLIZ3.append("\") failed, because ApplicationInfo changed. nativeLibraryDir from ");
                    sbLIZ3.append(this.LJ.getAbsolutePath());
                    sbLIZ3.append(" to ");
                    sbLIZ3.append(c0vsj.getAbsolutePath());
                    throw new LibrarianUnsatisfiedLinkError(C2188811AlT.LIZIZ(sbLIZ3), e);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LJIIL(C0VSJ c0vsj, InputStream inputStream) throws IOException {
        File fileCreateTempFile = File.createTempFile("tmp-", c0vsj.getName(), c0vsj.getParentFile());
        LibrarianMonitor librarianMonitor = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("extracting ");
        sbLIZ.append(fileCreateTempFile.getPath());
        C2188811AlT.LIZIZ(sbLIZ);
        librarianMonitor.getClass();
        C0VSV c0vsv = new C0VSV(fileCreateTempFile);
        try {
            byte[] bArr = new byte[8192];
            int i = inputStream.read(bArr);
            while (i != -1) {
                c0vsv.write(bArr, 0, i);
                i = inputStream.read(bArr);
            }
            if (fileCreateTempFile.setReadOnly()) {
                LibrarianMonitor librarianMonitor2 = this.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("renaming to ");
                sbLIZ2.append(c0vsj.getPath());
                C2188811AlT.LIZIZ(sbLIZ2);
                librarianMonitor2.getClass();
                if (fileCreateTempFile.renameTo(c0vsj)) {
                    LIZIZ(c0vsv);
                    fileCreateTempFile.delete();
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("failed to rename \"");
                sbLIZ3.append(fileCreateTempFile.getAbsolutePath());
                sbLIZ3.append("\" to \"");
                sbLIZ3.append(c0vsj.getAbsolutePath());
                sbLIZ3.append("\"");
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ3));
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("failed to mark readonly \"");
            sbLIZ4.append(fileCreateTempFile.getAbsolutePath());
            sbLIZ4.append("\" (tmp of \"");
            sbLIZ4.append(c0vsj.getAbsolutePath());
            sbLIZ4.append("\")");
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ4));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ(c0vsv);
            fileCreateTempFile.delete();
            throw th;
        }
    }

    public final boolean LJI(C0VSJ c0vsj, String str, boolean z) {
        try {
            LibrarianMonitor librarianMonitor = this.LIZ;
            String path = c0vsj.getPath();
            librarianMonitor.getClass();
            System.load(path);
            LibrarianMonitor librarianMonitor2 = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loaded the extracted lib ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            librarianMonitor2.getClass();
            return true;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            if (!z) {
                LibrarianMonitor librarianMonitor3 = this.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("fail to load ");
                sbLIZ2.append(c0vsj.getName());
                sbLIZ2.append(", out lib exists");
                C2188811AlT.LIZIZ(sbLIZ2);
                librarianMonitor3.getClass();
                return false;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("finally fail to load ");
            sbLIZ3.append(c0vsj.getPath());
            throw new LibrarianUnsatisfiedLinkError(C2188811AlT.LIZIZ(sbLIZ3), e);
        }
    }
}
