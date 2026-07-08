package com.lynx.tasm.behavior.ui.krypton;

import X.C1289410jet;
import X.C1289430jev;
import X.C1299340juu;
import X.C2188811AlT;
import com.lynx.base.log.LynxLog;
import com.lynx.jsbridge.h;
import j27.s;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import t27.a;

/* JADX INFO: loaded from: classes21.dex */
public class LynxKryptonModule extends h {
    public final C1289410jet LIZJ;
    public long LIZLLL;

    private native long nativeCreate();

    private native void nativeDestroy(long j);

    private native long nativeGetExtensionDelegatePtr(long j, long j2);

    @Override // com.lynx.jsbridge.h
    public final void LIZ() {
        a aVar;
        CanvasRuntimeMediator canvasRuntimeMediator = this.LIZJ.LIZ;
        if (canvasRuntimeMediator != null && (aVar = canvasRuntimeMediator.LIZIZ) != null) {
            aVar.deInit();
        }
        nativeDestroy(this.LIZLLL);
        this.LIZLLL = 0L;
    }

    @Override // com.lynx.jsbridge.h
    public final long LIZIZ() {
        if (this.LIZLLL == 0) {
            LynxLog.e("LynxKryptonModule", "native ptr is 0");
            return 0L;
        }
        CanvasRuntimeMediator canvasRuntimeMediator = new CanvasRuntimeMediator(this.LIZ);
        C1289410jet c1289410jet = this.LIZJ;
        c1289410jet.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Krypton] Register new CanvasRuntimeMediator.");
        sbLIZ.append(canvasRuntimeMediator);
        LynxLog.i("LynxKryptonHelper", C2188811AlT.LIZIZ(sbLIZ));
        c1289410jet.LIZ = canvasRuntimeMediator;
        for (Map.Entry<Class<?>, Object> entry : c1289410jet.LIZIZ.entrySet()) {
            CanvasRuntimeMediator canvasRuntimeMediator2 = c1289410jet.LIZ;
            Class<?> key = entry.getKey();
            Object value = entry.getValue();
            ((ConcurrentHashMap) canvasRuntimeMediator2.LIZJ).put(key, value);
            a aVar = canvasRuntimeMediator2.LIZIZ;
            if (aVar != null) {
                aVar.registerService(key, value);
            }
        }
        long jLIZ = canvasRuntimeMediator.LIZ();
        if (jLIZ == 0) {
            LynxLog.e("LynxKryptonModule", "mediator ptr is 0");
            return 0L;
        }
        long jNativeGetExtensionDelegatePtr = nativeGetExtensionDelegatePtr(this.LIZLLL, jLIZ);
        canvasRuntimeMediator.LIZJ(jLIZ);
        return jNativeGetExtensionDelegatePtr;
    }

    @Override // com.lynx.jsbridge.h
    public final void LIZLLL() {
        C1299340juu c1299340juu = this.LIZIZ;
        if (c1299340juu == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LynxKryptonModule setup failed because LynxGroup is null, current url: ");
            sbLIZ.append(this.LIZ.LLJJIII);
            LynxLog.e("LynxKryptonModule", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!c1299340juu.LIZIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LynxKryptonModule setup failed because LynxGroup id: ");
            sbLIZ2.append(this.LIZIZ.LIZJ);
            sbLIZ2.append(" is not enable canvas, current url: ");
            sbLIZ2.append(this.LIZ.LLJJIII);
            LynxLog.e("LynxKryptonModule", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("LynxKryptonModule setup success with LynxGroup id: ");
        sbLIZ3.append(this.LIZIZ.LIZJ);
        sbLIZ3.append(" current url: ");
        sbLIZ3.append(this.LIZ.LLJJIII);
        LynxLog.i("LynxKryptonModule", C2188811AlT.LIZIZ(sbLIZ3));
        C1289410jet c1289410jet = this.LIZJ;
        c1289410jet.getClass();
        LynxLog.i("LynxKryptonHelper", "[Krypton] Setup canvas environment when specify enable_canvas in schema.");
        CanvasRuntimeMediator canvasRuntimeMediator = c1289410jet.LIZ;
        if (canvasRuntimeMediator != null) {
            LynxLog.i("KryptonCanvasRuntimeMediator", "[Krypton] setupCanvasFromUI");
            canvasRuntimeMediator.LIZLLL();
            CanvasRuntimeMediator canvasRuntimeMediator2 = c1289410jet.LIZ;
            C1289430jev c1289430jev = c1289410jet.LIZJ;
            a aVar = canvasRuntimeMediator2.LIZIZ;
            if (aVar != null) {
                aVar.registerCanvasBehavior(c1289430jev);
            }
        }
    }

    @Override // com.lynx.jsbridge.h
    public final void LIZJ(String str) {
        a aVar;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxKryptonModule onTemplateLoad ");
        sbLIZ.append(str);
        sbLIZ.append(" this: ");
        sbLIZ.append(this);
        LynxLog.i("LynxKryptonModule", C2188811AlT.LIZIZ(sbLIZ));
        CanvasRuntimeMediator canvasRuntimeMediator = this.LIZJ.LIZ;
        if (canvasRuntimeMediator != null && (aVar = canvasRuntimeMediator.LIZIZ) != null) {
            aVar.onTemplateLoad(str);
        }
    }

    public LynxKryptonModule(s sVar, C1299340juu c1299340juu, C1289430jev c1289430jev) {
        super(sVar, c1299340juu);
        this.LIZJ = new C1289410jet(c1289430jev);
        this.LIZLLL = nativeCreate();
        LynxLog.i("LynxKryptonModule", "LynxKryptonModule create");
    }
}
