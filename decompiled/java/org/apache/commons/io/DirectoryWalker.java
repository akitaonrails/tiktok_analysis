package org.apache.commons.io;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes31.dex */
public abstract class DirectoryWalker<T> {
    public final int depthLimit;
    public final FileFilter filter;

    public DirectoryWalker() {
        this(null, -1);
    }

    public File[] filterDirectoryContents(File file, int i, File[] fileArr) {
        return fileArr;
    }

    public boolean handleDirectory(File file, int i, Collection<T> collection) {
        return true;
    }

    public void handleDirectoryEnd(File file, int i, Collection<T> collection) {
    }

    public void handleDirectoryStart(File file, int i, Collection<T> collection) {
    }

    public void handleEnd(Collection<T> collection) {
    }

    public void handleFile(File file, int i, Collection<T> collection) {
    }

    public boolean handleIsCancelled(File file, int i, Collection<T> collection) {
        return false;
    }

    public void handleRestricted(File file, int i, Collection<T> collection) {
    }

    public void handleStart(File file, Collection<T> collection) {
    }

    public static class CancelException extends IOException {
        public static final long serialVersionUID = 1347339620135041008L;
        public final int depth;
        public final File file;

        public int getDepth() {
            return this.depth;
        }

        public File getFile() {
            return this.file;
        }

        public CancelException(File file, int i) {
            this("Operation Cancelled", file, i);
        }

        public CancelException(String str, File file, int i) {
            super(str);
            this.file = file;
            this.depth = i;
        }
    }

    public DirectoryWalker(FileFilter fileFilter, int i) {
        this.filter = fileFilter;
        this.depthLimit = i;
    }

    public final void walk(File file, Collection<T> collection) throws CancelException {
        if (file != null) {
            try {
                handleStart(file, collection);
                walk(file, 0, collection);
                handleEnd(collection);
                return;
            } catch (CancelException e) {
                TryCatchGuardChecker.doCheck(e);
                handleCancelled(file, collection, e);
                return;
            }
        }
        throw new NullPointerException("Start Directory is null");
    }

    private void walk(File file, int i, Collection<T> collection) throws CancelException {
        File[] fileArrListFiles;
        checkIfCancelled(file, i, collection);
        if (handleDirectory(file, i, collection)) {
            handleDirectoryStart(file, i, collection);
            int i2 = i + 1;
            int i3 = this.depthLimit;
            if (i3 < 0 || i2 <= i3) {
                checkIfCancelled(file, i, collection);
                FileFilter fileFilter = this.filter;
                if (fileFilter == null) {
                    fileArrListFiles = file.listFiles();
                } else {
                    fileArrListFiles = file.listFiles(fileFilter);
                }
                filterDirectoryContents(file, i, fileArrListFiles);
                if (fileArrListFiles == null) {
                    handleRestricted(file, i2, collection);
                } else {
                    for (File file2 : fileArrListFiles) {
                        if (file2.isDirectory()) {
                            walk(file2, i2, collection);
                        } else {
                            checkIfCancelled(file2, i2, collection);
                            handleFile(file2, i2, collection);
                            checkIfCancelled(file2, i2, collection);
                        }
                    }
                }
            }
            handleDirectoryEnd(file, i, collection);
        }
        checkIfCancelled(file, i, collection);
    }

    public final void checkIfCancelled(File file, int i, Collection<T> collection) throws CancelException {
        if (!handleIsCancelled(file, i, collection)) {
        } else {
            throw new CancelException(file, i);
        }
    }

    public void handleCancelled(File file, Collection<T> collection, CancelException cancelException) throws CancelException {
        throw cancelException;
    }
}
