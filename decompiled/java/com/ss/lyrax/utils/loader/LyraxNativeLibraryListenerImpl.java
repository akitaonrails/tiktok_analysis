package com.ss.lyrax.utils.loader;

import X.C2188811AlT;
import com.ss.bytertc.engine.utils.LogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class LyraxNativeLibraryListenerImpl implements LyraxNativeLibraryLoaderListener {
    @Override // com.ss.lyrax.utils.loader.LyraxNativeLibraryLoaderListener
    public void onLoadAlready(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadAlready : ");
        sbLIZ.append(str);
        LogUtil.i("LyraxNativeLibraryLoaderListener", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.lyrax.utils.loader.LyraxNativeLibraryLoaderListener
    public void onLoadError(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadError : ");
        sbLIZ.append(str);
        LogUtil.i("LyraxNativeLibraryLoaderListener", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.lyrax.utils.loader.LyraxNativeLibraryLoaderListener
    public void onLoadSuccess(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadSuccess : ");
        sbLIZ.append(str);
        LogUtil.i("LyraxNativeLibraryLoaderListener", C2188811AlT.LIZIZ(sbLIZ));
    }
}
