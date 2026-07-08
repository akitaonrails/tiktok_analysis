package com.ss.bytertc.engine.loader;

import X.C2188811AlT;
import com.ss.bytertc.engine.utils.LogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class RTCNativeLibraryListenerImpl implements RTCNativeLibraryLoaderListener {
    @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener
    public void onLoadAlready(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadAlready : ");
        sbLIZ.append(str);
        LogUtil.i("RtcNativeLibraryLoaderListener", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener
    public void onLoadError(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadError : ");
        sbLIZ.append(str);
        LogUtil.i("RtcNativeLibraryLoaderListener", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener
    public void onLoadSuccess(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadSuccess : ");
        sbLIZ.append(str);
        LogUtil.i("RtcNativeLibraryLoaderListener", C2188811AlT.LIZIZ(sbLIZ));
    }
}
