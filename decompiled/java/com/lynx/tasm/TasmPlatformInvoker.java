package com.lynx.tasm;

import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableMap;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class TasmPlatformInvoker {
    public WeakReference<NativeFacade> LIZ;

    private void onRunPipelineFinished() {
        NativeFacade nativeFacade = this.LIZ.get();
        if (nativeFacade == null) {
            LynxLog.i("TasmPlatformInvoker", "OnRunPipelineFinished failed, NativeFacade has been released.");
        } else {
            nativeFacade.onRunPipelineFinished();
        }
    }

    public TasmPlatformInvoker(NativeFacade nativeFacade) {
        this.LIZ = new WeakReference<>(nativeFacade);
    }

    private void onPageConfigDecoded(ReadableMap readableMap) {
        NativeFacade nativeFacade = this.LIZ.get();
        if (nativeFacade == null) {
            LynxLog.i("TasmPlatformInvoker", "onPageConfigDecoded failed, NativeFacade has been released.");
        } else {
            nativeFacade.onPageConfigDecoded(readableMap);
        }
    }

    private void getI18nResourceByNative(String str, String str2) {
        NativeFacade nativeFacade = this.LIZ.get();
        if (nativeFacade == null) {
            LynxLog.i("TasmPlatformInvoker", "getI18nResourceByNative failed, NativeFacade has been released.");
        } else {
            nativeFacade.getI18nResourceByNative(str, str2);
        }
    }

    private String translateResourceForTheme(String str, String str2) {
        NativeFacade nativeFacade = this.LIZ.get();
        if (nativeFacade == null) {
            LynxLog.i("TasmPlatformInvoker", "translateResourceForTheme failed, NativeFacade has been released.");
            return null;
        }
        return nativeFacade.translateResourceForTheme(str, str2);
    }

    private ByteBuffer triggerLepusBridge(String str, Object obj) {
        NativeFacade nativeFacade = this.LIZ.get();
        if (nativeFacade == null) {
            LynxLog.i("TasmPlatformInvoker", "triggerLepusBridge failed, NativeFacade has been released.");
            return null;
        }
        return nativeFacade.triggerLepusBridge(str, obj);
    }

    private void triggerLepusBridgeAsync(String str, Object obj) {
        NativeFacade nativeFacade = this.LIZ.get();
        if (nativeFacade == null) {
            LynxLog.i("TasmPlatformInvoker", "triggerLepusBridgeAsync failed, NativeFacade has been released.");
        } else {
            nativeFacade.triggerLepusBridgeAsync(str, obj);
        }
    }
}
