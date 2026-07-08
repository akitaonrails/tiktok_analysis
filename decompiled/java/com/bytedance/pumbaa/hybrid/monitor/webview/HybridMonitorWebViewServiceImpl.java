package com.bytedance.pumbaa.hybrid.monitor.webview;

import X.C04TD;
import X.C0VYV;
import X.C0VYX;
import X.C0VYY;
import X.C0VYZ;
import X.C0VZH;
import X.C0VZK;
import X.C0VZM;
import X.C0VZT;
import X.C13BV;
import X.C790430UzZ;
import X.C800360VaU;
import X.C800370VaV;
import X.C800390VaX;
import X.C800750Vb7;
import android.app.Application;
import android.content.Intent;
import com.bytedance.pumbaa.hybrid.api.IHybridHookService;
import com.bytedance.pumbaa.hybrid.monitor.api.IHybridWebViewMonitorService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class HybridMonitorWebViewServiceImpl implements IHybridWebViewMonitorService {
    public C0VYX LIZ;
    public C0VYV LIZIZ;
    public C800370VaV LIZJ;

    public static IHybridWebViewMonitorService LIZLLL() {
        Object objLIZ = C04TD.LIZ(IHybridWebViewMonitorService.class, false);
        if (objLIZ != null) {
            return (IHybridWebViewMonitorService) objLIZ;
        }
        if (C04TD.LJJJJZ == null) {
            synchronized (IHybridWebViewMonitorService.class) {
                if (C04TD.LJJJJZ == null) {
                    C04TD.LJJJJZ = new HybridMonitorWebViewServiceImpl();
                }
            }
        }
        return C04TD.LJJJJZ;
    }

    @Override // com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorService
    public final void LIZ(C800390VaX c800390VaX) {
        final C800390VaX c800390VaX2 = c800390VaX;
        if (c800390VaX2.LJII == null) {
            c800390VaX2.LJII = Collections.singletonList(new C800750Vb7());
        }
        C790430UzZ c790430UzZ = C0VZK.LIZ;
        if (c790430UzZ != null) {
            Application application = c790430UzZ.LIZ;
            boolean z = c790430UzZ.LIZIZ;
            if (C0VZT.LIZ == null) {
                C0VZT.LIZ = application;
                C0VZT.LIZIZ = z;
                application.registerActivityLifecycleCallbacks(C0VZT.LJIIIIZZ);
            }
        }
        C0VYX c0vyx = new C0VYX(c800390VaX2);
        Application application2 = C0VZT.LIZ;
        if (application2 != null) {
            application2.registerActivityLifecycleCallbacks(c0vyx);
            this.LIZ = c0vyx;
            C0VYV c0vyv = new C0VYV(c800390VaX2);
            synchronized (C0VZT.LIZJ) {
                try {
                    ((ArrayList) C0VZT.LIZLLL).add(c0vyv);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LIZIZ = c0vyv;
            IHybridHookService iHybridHookService = (IHybridHookService) ServiceManager.get().getService(IHybridHookService.class);
            if (iHybridHookService != null && c800390VaX2.LIZ) {
                String str = c800390VaX2.LJI;
                if (str == null) {
                    str = "";
                }
                C0VZH.LIZ = str;
                List<? extends C0VYZ> list = c800390VaX2.LJII;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                C800370VaV.LJFF = list;
                C800370VaV c800370VaV = new C800370VaV(c800390VaX2);
                this.LIZJ = c800370VaV;
                iHybridHookService.LIZIZ(c800370VaV);
                iHybridHookService.LIZLLL(new C0VZM(c800390VaX2) { // from class: X.0VZJ
                    public final C800390VaX LIZ;

                    {
                        this.LIZ = c800390VaX2;
                    }

                    @Override // X.C0VZM
                    public final boolean LIZ(Intent intent, Throwable th2) {
                        Object c098200Yq;
                        String string;
                        C800390VaX c800390VaX3 = this.LIZ;
                        if (c800390VaX3 != null && !c800390VaX3.LIZ) {
                            return false;
                        }
                        try {
                            C0VZH.LIZJ(intent, th2, c800390VaX3);
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            c098200Yq = new C098200Yq(th3);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl != null) {
                            Pair[] pairArr = new Pair[1];
                            if (intent == null || (string = intent.toString()) == null) {
                                string = "null";
                            }
                            pairArr[0] = new Pair("intent", string);
                            C0VZK.LIZ(thM5exceptionOrNullimpl, "conversion_recorder_onActivityStarted_error", C2097608Jq.LJIIJ(pairArr));
                        }
                        return false;
                    }
                });
                C800360VaU.LIZ = c800390VaX2;
                return;
            }
            return;
        }
        throw new IllegalStateException("HybridLifecycle need init");
    }

    @Override // com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorService
    public final void LIZIZ(String str) {
        JSONObject jSONObject;
        if (Intrinsics.LJFF(str, C800370VaV.LIZJ) && (jSONObject = C800370VaV.LIZIZ) != null) {
            C0VYY.LIZJ(jSONObject, false);
        }
    }

    @Override // com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorService
    public final void LIZJ(C800390VaX c800390VaX) {
        C800390VaX c800390VaX2 = c800390VaX;
        if (c800390VaX2.LJII == null) {
            c800390VaX2.LJII = Collections.singletonList(new C800750Vb7());
        }
        C0VYX c0vyx = this.LIZ;
        if (c0vyx != null) {
            c0vyx.LL = c800390VaX2;
        }
        C0VYV c0vyv = this.LIZIZ;
        if (c0vyv != null) {
            c0vyv.LL = c800390VaX2;
        }
        C800370VaV c800370VaV = this.LIZJ;
        if (c800370VaV != null) {
            c800370VaV.LIZ = c800390VaX2;
        }
        C800360VaU.LIZ = c800390VaX2;
        if (c800390VaX2.LIZ) {
            List<? extends C0VYZ> list = c800390VaX2.LJII;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            C800370VaV.LJFF = list;
        }
    }
}
