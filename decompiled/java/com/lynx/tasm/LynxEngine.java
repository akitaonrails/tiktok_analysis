package com.lynx.tasm;

import X.C1299860jvk;
import X.C1299870jvl;
import X.C1310290kCZ;
import X.C1310660kDA;
import X.C2188811AlT;
import X.EnumC1309960kC2;
import X.EnumC665490Q8l;
import X.InterfaceC1309730kBf;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.UIBody;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes21.dex */
public class LynxEngine {
    public WeakReference<LynxTemplateRender> LIZ;
    public final TemplateBundle LIZJ;
    public EnumC665490Q8l LJ;
    public InterfaceC1309730kBf LJFF;
    public TasmPlatformInvoker LJI;
    public C1310290kCZ LJII;
    public EnumC1309960kC2 LIZLLL = EnumC1309960kC2.UN_LOADED;
    public long LIZIZ = nativeCreate();

    private native long nativeCreate();

    private native void nativeDestroyEngine(long j);

    private native long nativeDetachEngine(long j);

    public final synchronized boolean LIZ() {
        return this.LIZLLL == EnumC1309960kC2.READY_BE_REUSED;
    }

    public final synchronized boolean LIZLLL() {
        return this.LIZLLL != EnumC1309960kC2.UN_LOADED;
    }

    public final synchronized boolean LJ() {
        if (this.LIZLLL != EnumC1309960kC2.READY_BE_REUSED) {
            return false;
        }
        LJFF(EnumC1309960kC2.ON_REUSING);
        return true;
    }

    public final void LIZIZ() {
        LJFF(EnumC1309960kC2.DESTROYED);
        C1299860jvk c1299860jvk = C1299870jvl.LIZ;
        c1299860jvk.getClass();
        TemplateBundle templateBundle = this.LIZJ;
        if (templateBundle != null) {
            LinkedList<LynxEngine> linkedListLIZ = c1299860jvk.LIZ(templateBundle);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deleteEngine EngineQueue Cache: ");
            sbLIZ.append(linkedListLIZ);
            sbLIZ.append(", bundle:");
            sbLIZ.append(templateBundle);
            LynxLog.i("LynxEnginePool", C2188811AlT.LIZIZ(sbLIZ));
            synchronized (c1299860jvk) {
                try {
                    linkedListLIZ.remove(this);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        long j = this.LIZIZ;
        if (j != 0) {
            this.LIZIZ = 0L;
            nativeDestroyEngine(j);
        }
    }

    public final void LIZJ() {
        UIBody uIBody;
        LynxTemplateRender lynxTemplateRender = this.LIZ.get();
        if (this.LIZIZ == 0 || lynxTemplateRender == null) {
            return;
        }
        if (lynxTemplateRender.LJJLIIIJL) {
            lynxTemplateRender.LJJJJI("TemplateRender.detachLynxEngineWrapper");
            s sVar = lynxTemplateRender.mLynxContext;
            if (sVar != null && (uIBody = sVar.LLJILJILJ) != null) {
                uIBody.LJJIIZI();
            }
            if (lynxTemplateRender.LJJLL != null) {
                lynxTemplateRender.LJJJIL = null;
                C1310660kDA c1310660kDA = lynxTemplateRender.LJJII;
                if (c1310660kDA != null) {
                    c1310660kDA.setLynxUIRendererInternal(null);
                }
                lynxTemplateRender.LJJLL = null;
                lynxTemplateRender.LJJLIL = null;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(lynxTemplateRender);
                sbLIZ.append(", call detachLynxEngineWrapper");
                LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
                long j = lynxTemplateRender.LJJLIIIJ;
                if (j != 0) {
                    lynxTemplateRender.nativeDetachLynxEngineWrapper(j, lynxTemplateRender.LJJLI);
                }
            }
            LynxTemplateRender.LJJJJIZL("TemplateRender.detachLynxEngineWrapper");
        }
        this.LIZ.clear();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxEngineWrapper{mNativePtr=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mLynxEngineState=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final synchronized void LJFF(EnumC1309960kC2 enumC1309960kC2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append("updateLynxEngineState:");
        sbLIZ.append(enumC1309960kC2.name());
        LynxLog.i("LynxEngineWrapper", C2188811AlT.LIZIZ(sbLIZ));
        EnumC1309960kC2 enumC1309960kC22 = this.LIZLLL;
        EnumC1309960kC2 enumC1309960kC23 = EnumC1309960kC2.DESTROYED;
        if (enumC1309960kC22 == enumC1309960kC23) {
            if (enumC1309960kC2 != enumC1309960kC23) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("lynxEngineState has been destroyed.");
                sbLIZ2.append(this);
                LynxLog.e("LynxEngineWrapper", C2188811AlT.LIZIZ(sbLIZ2));
            }
            return;
        }
        this.LIZLLL = enumC1309960kC2;
    }

    public LynxEngine(TemplateBundle templateBundle, LynxTemplateRender lynxTemplateRender) {
        this.LIZ = new WeakReference<>(lynxTemplateRender);
        this.LIZJ = templateBundle;
        this.LJ = lynxTemplateRender.LJIIL;
    }
}
