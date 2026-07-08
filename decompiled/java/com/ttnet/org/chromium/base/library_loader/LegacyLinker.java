package com.ttnet.org.chromium.base.library_loader;

import com.ttnet.org.chromium.base.library_loader.Linker;

/* JADX INFO: loaded from: classes14.dex */
public class LegacyLinker extends Linker {
    public static native boolean nativeAddZipArchivePath(String str);

    public static native boolean nativeCreateSharedRelro(String str, long j, Linker.LibInfo libInfo);

    public static native boolean nativeLoadLibrary(String str, long j, Linker.LibInfo libInfo);

    public static native boolean nativeUseSharedRelro(String str, Linker.LibInfo libInfo);
}
