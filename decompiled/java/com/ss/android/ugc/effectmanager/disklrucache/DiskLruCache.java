package com.ss.android.ugc.effectmanager.disklrucache;

import X.C0VSJ;
import X.C0VSP;
import X.C0VSV;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes31.dex */
public final class DiskLruCache implements Closeable {
    public static final Pattern LEGAL_KEY_PATTERN = PatternProtector.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() { // from class: com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache.2
        @Override // java.io.OutputStream
        public void write(int i) {
        }
    };
    public final int appVersion;
    public boolean closed;
    public final File directory;
    public boolean initialized;
    public final File journalFile;
    public final File journalFileBackup;
    public final File journalFileTmp;
    public Writer journalWriter;
    public long maxSize;
    public int redundantOpCount;
    public long size;
    public final int valueCount;
    public final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    public long nextSequenceNumber = 0;
    public final ExecutorService executorService = C786410Ut5.h4();
    public final Callable<Void> cleanupCallable = new Callable<Void>() { // from class: com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache.1
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
        public Void call2() {
            synchronized (DiskLruCache.this) {
                try {
                    DiskLruCache diskLruCache = DiskLruCache.this;
                    if ((!diskLruCache.initialized) || diskLruCache.closed) {
                        return null;
                    }
                    diskLruCache.trimToSize();
                    if (DiskLruCache.this.journalRebuildRequired()) {
                        DiskLruCache.this.rebuildJournal();
                        DiskLruCache.this.redundantOpCount = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() {
            C1C7U.LIZ("DiskLruCache@7ad8.<field>$5");
            Void voidCall2 = call2();
            C1C7U.LIZIZ("DiskLruCache@7ad8.<field>$5");
            return voidCall2;
        }
    };

    public final class Editor {
        public boolean committed;
        public final Entry entry;
        public boolean hasErrors;
        public final boolean[] written;

        public class FaultHidingOutputStream extends FilterOutputStream {
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    Editor.this.hasErrors = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    Editor.this.hasErrors = true;
                }
            }

            public FaultHidingOutputStream(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    Editor.this.hasErrors = true;
                }
            }
        }

        public void abort() {
            DiskLruCache.this.completeEdit(this, false);
        }

        public void abortUnlessCommitted() {
            if (this.committed) {
                return;
            }
            try {
                abort();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }

        public void commit() {
            if (this.hasErrors) {
                DiskLruCache.this.completeEdit(this, false);
                DiskLruCache.this.remove(this.entry.key);
            } else {
                DiskLruCache.this.completeEdit(this, true);
            }
            this.committed = true;
        }

        public String getString(int i) {
            InputStream inputStreamNewInputStream = newInputStream(i);
            if (inputStreamNewInputStream != null) {
                return DiskLruCache.inputStreamToString(inputStreamNewInputStream);
            }
            return null;
        }

        public InputStream newInputStream(int i) {
            synchronized (DiskLruCache.this) {
                try {
                    Entry entry = this.entry;
                    if (entry.currentEditor == this) {
                        if (!entry.readable) {
                            return null;
                        }
                        try {
                            return new C0VSP(this.entry.getCleanFile(i));
                        } catch (FileNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            return null;
                        }
                    }
                    throw new IllegalStateException();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        public OutputStream newOutputStream(int i) {
            C0VSV c0vsv;
            FaultHidingOutputStream faultHidingOutputStream;
            if (i >= 0) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (i < diskLruCache.valueCount) {
                    synchronized (diskLruCache) {
                        try {
                            Entry entry = this.entry;
                            if (entry.currentEditor == this) {
                                if (!entry.readable) {
                                    this.written[i] = true;
                                }
                                File dirtyFile = entry.getDirtyFile(i);
                                try {
                                    c0vsv = new C0VSV(dirtyFile);
                                } catch (FileNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    DiskLruCache.this.directory.mkdirs();
                                    try {
                                        c0vsv = new C0VSV(dirtyFile);
                                    } catch (FileNotFoundException e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        return DiskLruCache.NULL_OUTPUT_STREAM;
                                    }
                                }
                                faultHidingOutputStream = new FaultHidingOutputStream(c0vsv);
                            } else {
                                throw new IllegalStateException();
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    return faultHidingOutputStream;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected index ");
            sbLIZ.append(i);
            sbLIZ.append(" to be greater than 0 and less than the maximum value count of ");
            sbLIZ.append(DiskLruCache.this.valueCount);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }

        public Editor(Entry entry) {
            boolean[] zArr;
            this.entry = entry;
            if (entry.readable) {
                zArr = null;
            } else {
                zArr = new boolean[DiskLruCache.this.valueCount];
            }
            this.written = zArr;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:9:0x0016
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        public void set(int r5, java.lang.String r6) {
            /*
                r4 = this;
                r3 = 0
                java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L16
                java.io.OutputStream r1 = r4.newOutputStream(r5)     // Catch: java.lang.Throwable -> L16
                java.nio.charset.Charset r0 = com.ss.android.ugc.effectmanager.disklrucache.Util.UTF_8     // Catch: java.lang.Throwable -> L16
                r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L16
                r2.write(r6)     // Catch: java.lang.Throwable -> L13
                com.ss.android.ugc.effectmanager.disklrucache.Util.closeQuietly(r2)
                return
            L13:
                r0 = move-exception
                r3 = r2
                goto L17
            L16:
                r0 = move-exception
            L17:
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L16
                com.ss.android.ugc.effectmanager.disklrucache.Util.closeQuietly(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache.Editor.set(int, java.lang.String):void");
        }
    }

    public final class Entry {
        public Editor currentEditor;
        public final String key;
        public final long[] lengths;
        public boolean readable;
        public long sequenceNumber;

        public String getLengths() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.lengths) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        private IOException invalidLengths(String[] strArr) throws IOException {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unexpected journal line: ");
            sbLIZ.append(Arrays.toString(strArr));
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
        }

        public File getCleanFile(int i) {
            if (i == 0) {
                return new C0VSJ(DiskLruCache.this.directory, this.key);
            }
            File file = DiskLruCache.this.directory;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.key);
            sbLIZ.append(e3.d);
            sbLIZ.append(i);
            return new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ));
        }

        public File getDirtyFile(int i) {
            if (i == 0) {
                File file = DiskLruCache.this.directory;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.key);
                sbLIZ.append(".tmp");
                return new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ));
            }
            File file2 = DiskLruCache.this.directory;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.key);
            sbLIZ2.append(e3.d);
            sbLIZ2.append(i);
            sbLIZ2.append(".tmp");
            return new C0VSJ(file2, C2188811AlT.LIZIZ(sbLIZ2));
        }

        public void setLengths(String[] strArr) throws IOException {
            if (strArr.length == DiskLruCache.this.valueCount) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.lengths[i] = CastLongProtector.parseLong(strArr[i]);
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw invalidLengths(strArr);
                    }
                }
                return;
            }
            throw invalidLengths(strArr);
        }

        public Entry(String str) {
            this.key = str;
            this.lengths = new long[DiskLruCache.this.valueCount];
        }
    }

    public final class Snapshot implements Closeable {
        public final File[] cleanFiles;
        public final InputStream[] ins;
        public final String key;
        public final long[] lengths;
        public final long sequenceNumber;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.ins) {
                Util.closeQuietly(inputStream);
            }
        }

        public Editor edit() {
            return DiskLruCache.this.edit(this.key, this.sequenceNumber);
        }

        public File getCleanFile(int i) {
            return this.cleanFiles[i];
        }

        public InputStream getInputStream(int i) {
            return this.ins[i];
        }

        public long getLength(int i) {
            return this.lengths[i];
        }

        public String getString(int i) {
            return DiskLruCache.inputStreamToString(getInputStream(i));
        }

        public Snapshot(String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.key = str;
            this.sequenceNumber = j;
            this.cleanFiles = fileArr;
            this.ins = inputStreamArr;
            this.lengths = jArr;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.initialized || this.closed) {
            this.closed = true;
            return;
        }
        Iterator it2 = new ArrayList(this.lruEntries.values()).iterator();
        while (it2.hasNext()) {
            Editor editor = ((Entry) it2.next()).currentEditor;
            if (editor != null) {
                editor.abort();
            }
        }
        trimToSize();
        this.journalWriter.close();
        this.journalWriter = null;
        this.closed = true;
    }

    public synchronized void flush() {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            this.journalWriter.flush();
        }
    }

    public Set<String> getLruEntryKeys() {
        Set<String> setUnmodifiableSet;
        synchronized (this) {
            try {
                initialize();
                setUnmodifiableSet = Collections.unmodifiableSet(new LinkedHashSet(this.lruEntries.keySet()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return setUnmodifiableSet;
    }

    public synchronized long getMaxSize() {
        return this.maxSize;
    }

    public synchronized void initialize() {
        if (this.initialized) {
            return;
        }
        if (this.journalFileBackup.exists()) {
            if (!this.journalFile.exists()) {
                renameTo(this.journalFileBackup, this.journalFile, false);
            } else if (this.journalFileBackup.delete() && this.journalFileBackup.exists()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("failed to delete ");
                sbLIZ.append(this.journalFileBackup);
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (this.journalFile.exists()) {
            try {
                readJournal();
                processJournal();
                this.initialized = true;
                return;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("DiskLruCache ");
                sbLIZ2.append(this.directory);
                sbLIZ2.append(" is corrupt: ");
                sbLIZ2.append(e.getMessage());
                sbLIZ2.append(", removing");
                printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
                try {
                    delete();
                    this.closed = false;
                    rebuildJournal();
                    this.initialized = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.closed = false;
                    throw th;
                }
            }
        }
        rebuildJournal();
        this.initialized = true;
    }

    public synchronized boolean isClosed() {
        return this.closed;
    }

    public synchronized void rebuildJournal() {
        C0VSV c0vsv;
        Writer writer = this.journalWriter;
        if (writer != null) {
            writer.close();
        }
        try {
            c0vsv = new C0VSV(this.journalFileTmp);
        } catch (FileNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            this.journalFileTmp.getParentFile().mkdirs();
            c0vsv = new C0VSV(this.journalFileTmp);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(c0vsv, Util.US_ASCII));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.appVersion));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.valueCount));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (Entry entry : this.lruEntries.values()) {
                if (entry.currentEditor != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DIRTY ");
                    sbLIZ.append(entry.key);
                    sbLIZ.append('\n');
                    bufferedWriter.write(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("CLEAN ");
                    sbLIZ2.append(entry.key);
                    sbLIZ2.append(entry.getLengths());
                    sbLIZ2.append('\n');
                    bufferedWriter.write(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            bufferedWriter.close();
            if (this.journalFile.exists()) {
                renameTo(this.journalFile, this.journalFileBackup, true);
            }
            renameTo(this.journalFileTmp, this.journalFile, false);
            this.journalFileBackup.delete();
            this.journalWriter = new BufferedWriter(new OutputStreamWriter(new C0VSV(this.journalFile, true), Util.US_ASCII));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            bufferedWriter.close();
            throw th;
        }
    }

    public synchronized long size() {
        initialize();
        return this.size;
    }

    public synchronized void trimToSize() {
        while (this.size > this.maxSize) {
            remove(this.lruEntries.entrySet().iterator().next().getKey());
        }
    }

    private void processJournal() throws IOException {
        deleteIfExists(this.journalFileTmp);
        Iterator<Entry> it2 = this.lruEntries.values().iterator();
        while (it2.hasNext()) {
            Entry next = it2.next();
            int i = 0;
            if (next.currentEditor != null) {
                next.currentEditor = null;
                while (i < this.valueCount) {
                    deleteIfExists(next.getCleanFile(i));
                    deleteIfExists(next.getDirtyFile(i));
                    i++;
                }
                it2.remove();
            } else {
                while (i < this.valueCount) {
                    this.size += next.lengths[i];
                    i++;
                }
            }
        }
    }

    private void readJournal() {
        StrictLineReader strictLineReader = new StrictLineReader(new C0VSP(this.journalFile), Util.US_ASCII);
        try {
            String line = strictLineReader.readLine();
            String line2 = strictLineReader.readLine();
            String line3 = strictLineReader.readLine();
            String line4 = strictLineReader.readLine();
            String line5 = strictLineReader.readLine();
            if (!"libcore.io.DiskLruCache".equals(line) || !"1".equals(line2) || !Integer.toString(this.appVersion).equals(line3) || !Integer.toString(this.valueCount).equals(line4) || !"".equals(line5)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unexpected journal header: [");
                sbLIZ.append(line);
                sbLIZ.append(", ");
                sbLIZ.append(line2);
                sbLIZ.append(", ");
                sbLIZ.append(line4);
                sbLIZ.append(", ");
                sbLIZ.append(line5);
                sbLIZ.append(e3.f);
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
            int i = 0;
            while (true) {
                try {
                    readJournalLine(strictLineReader.readLine());
                    i++;
                } catch (EOFException e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.redundantOpCount = i - this.lruEntries.size();
                    if (strictLineReader.hasUnterminatedLine()) {
                        rebuildJournal();
                    } else {
                        this.journalWriter = new BufferedWriter(new OutputStreamWriter(new C0VSV(this.journalFile, true), Util.US_ASCII));
                    }
                    Util.closeQuietly(strictLineReader);
                    return;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Util.closeQuietly(strictLineReader);
            throw th;
        }
    }

    public boolean isValid() {
        File file = this.directory;
        return file != null && file.exists() && this.journalFile.exists();
    }

    public boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    private void checkNotClosed() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public void delete() {
        close();
        Util.deleteContents(this.directory);
    }

    public File getDirectory() {
        return this.directory;
    }

    public static void deleteIfExists(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static String inputStreamToString(InputStream inputStream) {
        return Util.readFully(new InputStreamReader(inputStream, Util.UTF_8));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void readJournalLine(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            r1 = 32
            int r6 = r9.indexOf(r1)
            java.lang.String r2 = "unexpected journal line: "
            r7 = -1
            if (r6 == r7) goto L99
            int r0 = r6 + 1
            int r5 = r9.indexOf(r1, r0)
            if (r5 != r7) goto L28
            java.lang.String r1 = r9.substring(r0)
            r0 = 6
            if (r6 != r0) goto L2c
            java.lang.String r0 = "REMOVE"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L2c
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache$Entry> r0 = r8.lruEntries
            r0.remove(r1)
            return
        L28:
            java.lang.String r1 = r9.substring(r0, r5)
        L2c:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache$Entry> r0 = r8.lruEntries
            java.lang.Object r3 = r0.get(r1)
            com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache$Entry r3 = (com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache.Entry) r3
            r4 = 0
            if (r3 != 0) goto L41
            com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache$Entry r3 = new com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache$Entry
            r3.<init>(r1)
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache$Entry> r0 = r8.lruEntries
            r0.put(r1, r3)
        L41:
            r1 = 5
            if (r5 == r7) goto L63
            if (r6 != r1) goto L75
            java.lang.String r0 = "CLEAN"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L75
            r2 = 1
            int r0 = r5 + 1
            java.lang.String r1 = r9.substring(r0)
            java.lang.String r0 = " "
            java.lang.String[] r0 = r1.split(r0)
            r3.readable = r2
            r3.currentEditor = r4
            r3.setLengths(r0)
            return
        L63:
            if (r6 != r1) goto L79
            java.lang.String r0 = "DIRTY"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L85
            com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache$Editor r0 = new com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache$Editor
            r0.<init>(r3)
            r3.currentEditor = r0
            return
        L75:
            if (r5 == r7) goto L63
            if (r5 != r7) goto L85
        L79:
            r0 = 4
            if (r6 != r0) goto L85
            java.lang.String r0 = "READ"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L85
            return
        L85:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r2)
            r0.append(r9)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            r1.<init>(r0)
            throw r1
        L99:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r2)
            r0.append(r9)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache.readJournalLine(java.lang.String):void");
    }

    private boolean validateKey(String str) {
        return LEGAL_KEY_PATTERN.matcher(str).matches();
    }

    public Editor edit(String str) {
        return edit(str, -1L);
    }

    public synchronized Snapshot get(String str) {
        InputStream inputStream;
        initialize();
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (entry == null) {
                return null;
            }
            if (!entry.readable) {
                return null;
            }
            int i = this.valueCount;
            InputStream[] inputStreamArr = new InputStream[i];
            File[] fileArr = new File[i];
            for (int i2 = 0; i2 < this.valueCount; i2++) {
                try {
                    fileArr[i2] = entry.getCleanFile(i2);
                    inputStreamArr[i2] = new C0VSP(fileArr[i2]);
                } catch (FileNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    for (int i3 = 0; i3 < this.valueCount && (inputStream = inputStreamArr[i3]) != null; i3++) {
                        Util.closeQuietly(inputStream);
                    }
                    return null;
                }
            }
            this.redundantOpCount++;
            Writer writer = this.journalWriter;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("READ ");
            sbLIZ.append(str);
            sbLIZ.append('\n');
            writer.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
            this.journalWriter.flush();
            if (journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            return new Snapshot(str, entry.sequenceNumber, fileArr, inputStreamArr, entry.lengths);
        }
        remove(str);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("keys must match regex [a-z0-9_-]{1,120}: \"");
        sbLIZ2.append(str);
        sbLIZ2.append("\"");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public synchronized boolean remove(String str) {
        initialize();
        checkNotClosed();
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (entry == null || entry.currentEditor != null) {
                return false;
            }
            this.redundantOpCount++;
            Writer writer = this.journalWriter;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("REMOVE ");
            sbLIZ.append(str);
            sbLIZ.append('\n');
            writer.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
            this.journalWriter.flush();
            this.lruEntries.remove(str);
            for (int i = 0; i < this.valueCount; i++) {
                File cleanFile = entry.getCleanFile(i);
                if (cleanFile.exists() && !cleanFile.delete()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("failed to delete ");
                    sbLIZ2.append(cleanFile);
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                long j = this.size;
                long[] jArr = entry.lengths;
                this.size = j - jArr[i];
                jArr[i] = 0;
            }
            if (journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            return true;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("keys must match regex [a-z0-9_-]{1,120}: \"");
        sbLIZ3.append(str);
        sbLIZ3.append("\"");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            this.executorService.submit(this.cleanupCallable);
        }
    }

    public synchronized void completeEdit(Editor editor, boolean z) {
        Entry entry = editor.entry;
        if (entry.currentEditor == editor) {
            if (z && !entry.readable) {
                for (int i = 0; i < this.valueCount; i++) {
                    if (editor.written[i]) {
                        if (!entry.getDirtyFile(i).exists()) {
                            editor.abort();
                            return;
                        }
                    } else {
                        editor.abort();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Newly created entry didn't create value for index ");
                        sbLIZ.append(i);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
            for (int i2 = 0; i2 < this.valueCount; i2++) {
                File dirtyFile = entry.getDirtyFile(i2);
                if (z) {
                    if (dirtyFile.exists()) {
                        File cleanFile = entry.getCleanFile(i2);
                        dirtyFile.renameTo(cleanFile);
                        long j = entry.lengths[i2];
                        long length = cleanFile.length();
                        entry.lengths[i2] = length;
                        this.size = (this.size - j) + length;
                    }
                } else {
                    deleteIfExists(dirtyFile);
                }
            }
            this.redundantOpCount++;
            entry.currentEditor = null;
            if (entry.readable | z) {
                entry.readable = true;
                Writer writer = this.journalWriter;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("CLEAN ");
                sbLIZ2.append(entry.key);
                sbLIZ2.append(entry.getLengths());
                sbLIZ2.append('\n');
                writer.write(C2188811AlT.LIZIZ(sbLIZ2));
                if (z) {
                    long j2 = this.nextSequenceNumber;
                    this.nextSequenceNumber = 1 + j2;
                    entry.sequenceNumber = j2;
                }
            } else {
                this.lruEntries.remove(entry.key);
                Writer writer2 = this.journalWriter;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("REMOVE ");
                sbLIZ3.append(entry.key);
                sbLIZ3.append('\n');
                writer2.write(C2188811AlT.LIZIZ(sbLIZ3));
            }
            this.journalWriter.flush();
            if (this.size > this.maxSize || journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized Editor edit(String str, long j) {
        initialize();
        checkNotClosed();
        validateKey(str);
        if (validateKey(str)) {
            Entry entry = this.lruEntries.get(str);
            if (j != -1) {
                if (entry == null || entry.sequenceNumber != j) {
                    return null;
                }
            } else {
                if (entry == null) {
                    entry = new Entry(str);
                    this.lruEntries.put(str, entry);
                }
                Editor editor = new Editor(entry);
                entry.currentEditor = editor;
                Writer writer = this.journalWriter;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DIRTY ");
                sbLIZ.append(str);
                sbLIZ.append('\n');
                writer.write(C2188811AlT.LIZIZ(sbLIZ));
                this.journalWriter.flush();
                return editor;
            }
            if (entry.currentEditor != null) {
                return null;
            }
            Editor editor2 = new Editor(entry);
            entry.currentEditor = editor2;
            Writer writer2 = this.journalWriter;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("DIRTY ");
            sbLIZ2.append(str);
            sbLIZ2.append('\n');
            writer2.write(C2188811AlT.LIZIZ(sbLIZ2));
            this.journalWriter.flush();
            return editor2;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("keys must match regex [a-z0-9_-]{1,120}: \"");
        sbLIZ3.append(str);
        sbLIZ3.append("\"");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static void renameTo(File file, File file2, boolean z) throws IOException {
        if (z) {
            deleteIfExists(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    public DiskLruCache(File file, int i, int i2, long j) {
        this.directory = file;
        this.appVersion = i;
        this.journalFile = new C0VSJ(file, "journal");
        this.journalFileTmp = new C0VSJ(file, "journal.tmp");
        this.journalFileBackup = new C0VSJ(file, "journal.bkp");
        this.valueCount = i2;
        this.maxSize = j;
    }

    public static DiskLruCache open(File file, int i, int i2, long j) {
        if (j > 0) {
            if (i2 > 0) {
                return new DiskLruCache(file, i, i2, j);
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
