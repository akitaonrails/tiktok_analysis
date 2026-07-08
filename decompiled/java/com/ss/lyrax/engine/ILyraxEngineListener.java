package com.ss.lyrax.engine;

import com.ss.bytertc.engine.GLESVersion;
import com.ss.lyrax.LyraxErrorCode;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxEngineListener {
    void onConnectionStateChanged(LyraxConnectionState lyraxConnectionState);

    void onCreateRoomStateChanged(String str, LyraxErrorCode lyraxErrorCode);

    void onDisposed();

    void onExtensionAccessError(String str, String str2);

    void onInitializedEngineEGL(GLESVersion gLESVersion);

    void onLogReport(String str, String str2);

    void onNativeLibraryLoadInfo(LyraxNativeLibraryLoadStatus lyraxNativeLibraryLoadStatus, String str);

    void onNetworkTypeChanged(LyraxNetworkType lyraxNetworkType);

    void onSysStats(LyraxSysStats lyraxSysStats);
}
