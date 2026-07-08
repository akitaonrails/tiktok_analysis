package com.lynx.devtoolwrapper;

import X.C1285920jZG;
import X.C1309850kBr;
import X.C2188811AlT;
import X.InterfaceC1309710kBd;
import X.InterfaceC1310380kCi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.service.ILynxDevToolService;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class LynxDevtool {
    public static ILynxDevToolService LIZJ;
    public InterfaceC1310380kCi LIZ;
    public C1309850kBr LIZIZ;
    public InterfaceC1309710kBd mOwner;

    public LynxDevtool(boolean z) {
        LIZ(null, null, z);
    }

    public final void LIZJ(TemplateData templateData, String str) {
        C1309850kBr c1309850kBr = this.LIZIZ;
        if (c1309850kBr != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadFromLocalFile:");
            sbLIZ.append(str);
            LynxLog.i("PageReloadHelper", C2188811AlT.LIZIZ(sbLIZ));
            c1309850kBr.LIZ.getClass();
            c1309850kBr.LIZ.getClass();
            c1309850kBr.LIZIZ(templateData);
        }
        InterfaceC1310380kCi interfaceC1310380kCi = this.LIZ;
        if (interfaceC1310380kCi != null) {
            interfaceC1310380kCi.LIZJ();
        }
    }

    public LynxDevtool(LynxView lynxView, LynxTemplateRender lynxTemplateRender, boolean z) {
        lynxTemplateRender.mLynxContext.LIZ();
        LIZ(lynxView, lynxTemplateRender, z);
    }

    public final void LIZ(LynxView lynxView, LynxTemplateRender lynxTemplateRender, boolean z) {
        ILynxDevToolService iLynxDevToolService;
        ILynxDevToolService iLynxDevToolService2;
        TraceEvent.LIZLLL("LynxDevtool initialized");
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Initialize LynxDevtool, lynxDebugEnabled:");
            sbLIZ.append(LynxEnv.inst().isLynxDebugEnabled());
            LynxLog.i("LynxDevtool", C2188811AlT.LIZIZ(sbLIZ));
            new WeakReference(lynxView);
            new WeakReference(lynxTemplateRender);
            if (LynxEnv.inst().isLynxDebugEnabled()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("devtoolEnabled:");
                sbLIZ2.append(LynxEnv.inst().isDevtoolEnabled());
                sbLIZ2.append(", logBoxEnabled:");
                sbLIZ2.append(LynxEnv.inst().isLogBoxEnabled());
                sbLIZ2.append(", debuggable:");
                sbLIZ2.append(z);
                LynxLog.i("LynxDevtool", C2188811AlT.LIZIZ(sbLIZ2));
                LIZJ = (ILynxDevToolService) C1285920jZG.LIZJ().LIZ(ILynxDevToolService.class);
                if ((LynxEnv.inst().isDevtoolEnabled() || z) && (iLynxDevToolService = LIZJ) != null) {
                    iLynxDevToolService.createInspectorOwner(lynxView, z);
                }
                if (LynxEnv.inst().isLogBoxEnabled() && (iLynxDevToolService2 = LIZJ) != null) {
                    this.LIZ = iLynxDevToolService2.createLogBox(this);
                    LynxLog.i("LynxDevtool", "LogBox init");
                }
            }
            if (this.LIZ != null) {
                this.LIZIZ = new C1309850kBr(lynxView);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("failed to init LynxDevtool: ");
            sbLIZ3.append(e.toString());
            LynxLog.e("LynxDevtool", C2188811AlT.LIZIZ(sbLIZ3));
            this.LIZ = null;
            this.LIZIZ = null;
        }
        TraceEvent.LJII("LynxDevtool initialized");
    }

    public final void LIZIZ(TemplateBundle templateBundle, TemplateData templateData, String str) {
        C1309850kBr c1309850kBr = this.LIZIZ;
        if (c1309850kBr != null) {
            c1309850kBr.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadFromBundle:");
            sbLIZ.append(str);
            LynxLog.i("PageReloadHelper", C2188811AlT.LIZIZ(sbLIZ));
            c1309850kBr.LIZIZ.LIZ = templateBundle;
            c1309850kBr.LIZIZ(templateData);
        }
        InterfaceC1310380kCi interfaceC1310380kCi = this.LIZ;
        if (interfaceC1310380kCi != null) {
            interfaceC1310380kCi.LIZJ();
        }
    }

    public final void LIZLLL(String str, TemplateData templateData, Map map, String str2) {
        C1309850kBr c1309850kBr = this.LIZIZ;
        if (c1309850kBr != null) {
            if (templateData != null) {
                c1309850kBr.LIZ(str, templateData);
            } else if (map != null) {
                c1309850kBr.LIZ(str, TemplateData.LJII(map));
            } else if (str2 != null) {
                c1309850kBr.LIZ(str, TemplateData.LJIIIIZZ(str2));
            } else {
                c1309850kBr.LIZ(str, null);
            }
        }
        InterfaceC1310380kCi interfaceC1310380kCi = this.LIZ;
        if (interfaceC1310380kCi != null) {
            interfaceC1310380kCi.LIZJ();
        }
    }
}
