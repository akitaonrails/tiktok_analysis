package com.bytedance.storage;

import android.os.SystemClock;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes14.dex */
public class StorageHook {

    public interface FileOpenPathCallback {
        void onFileOpen(String str);
    }

    public static native void nativeRegisterFileOpenPathCallback(FileOpenPathCallback fileOpenPathCallback);

    public static native void nativeSetFileOpenAtimeSkipThresholdSec(int i);

    public static native int nativeStart();

    public static native void nativeUnregisterFileOpenPathCallback(FileOpenPathCallback fileOpenPathCallback);

    static {
        INVOKESTATIC_com_bytedance_storage_StorageHook_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("storage-hook");
    }

    public static void init() {
        ByteHook.init();
        nativeStart();
    }

    public static void INVOKESTATIC_com_bytedance_storage_StorageHook_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static void registerFileOpenPathCallback(FileOpenPathCallback fileOpenPathCallback) {
        if (fileOpenPathCallback == null) {
            return;
        }
        nativeRegisterFileOpenPathCallback(fileOpenPathCallback);
    }

    public static void setFileOpenAtimeSkipThresholdSeconds(int i) {
        nativeSetFileOpenAtimeSkipThresholdSec(i);
    }

    public static void unregisterFileOpenPathCallback(FileOpenPathCallback fileOpenPathCallback) {
        nativeUnregisterFileOpenPathCallback(fileOpenPathCallback);
    }
}
