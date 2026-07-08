package com.google.firebase.analytics.connector.internal;

import X.C0W3J;
import X.C0WBG;
import X.C0WBI;
import X.C0WBM;
import X.C0WBP;
import X.C0WBQ;
import X.C0WBR;
import X.C786410Ut5;
import X.C811100Vro;
import X.C818880WAk;
import X.C820210WFn;
import X.C820230WFp;
import X.InterfaceC811540VsW;
import X.InterfaceC811570VsZ;
import X.InterfaceC814150Vwj;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes14.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0WBP<?>> getComponents() {
        C0WBP[] c0wbpArr = new C0WBP[2];
        C0WBQ c0wbqLIZ = C0WBP.LIZ(InterfaceC814150Vwj.class);
        c0wbqLIZ.LIZ(C0WBG.LIZ(C818880WAk.class));
        c0wbqLIZ.LIZ(C0WBG.LIZ(Context.class));
        c0wbqLIZ.LIZ(C0WBG.LIZ(InterfaceC811540VsW.class));
        c0wbqLIZ.LJ = new C0WBM() { // from class: X.0WBa
            @Override // X.C0WBM
            public final Object LIZ(C0WBH c0wbh) {
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(c0wbh);
            }
        };
        if (c0wbqLIZ.LIZJ != 0) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        c0wbqLIZ.LIZJ = 2;
        c0wbpArr[0] = c0wbqLIZ.LIZIZ();
        c0wbpArr[1] = C0WBR.LIZ("fire-analytics", "22.0.1");
        return Arrays.asList(c0wbpArr);
    }

    public static InterfaceC814150Vwj lambda$getComponents$0(C0WBI c0wbi) {
        C818880WAk c818880WAk = (C818880WAk) c0wbi.LIZIZ(C818880WAk.class);
        Context context = (Context) c0wbi.LIZIZ(Context.class);
        InterfaceC811540VsW interfaceC811540VsW = (InterfaceC811540VsW) c0wbi.LIZIZ(InterfaceC811540VsW.class);
        C0W3J.LJIIIIZZ(c818880WAk);
        C0W3J.LJIIIIZZ(context);
        C0W3J.LJIIIIZZ(interfaceC811540VsW);
        C0W3J.LJIIIIZZ(C786410Ut5.N3(context));
        if (C820230WFp.LIZIZ == null) {
            synchronized (C820230WFp.class) {
                try {
                    if (C820230WFp.LIZIZ == null) {
                        Bundle bundle = new Bundle(1);
                        c818880WAk.LIZ();
                        if ("[DEFAULT]".equals(c818880WAk.LIZIZ)) {
                            interfaceC811540VsW.LIZ(C811100Vro.class, new Executor() { // from class: X.0WBf
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new InterfaceC811570VsZ() { // from class: X.0Vsa
                                @Override // X.InterfaceC811570VsZ
                                public final void LIZ(C1267204xa c1267204xa) {
                                    c1267204xa.getClass();
                                    throw null;
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", c818880WAk.LJI());
                        }
                        C820230WFp.LIZIZ = new C820230WFp(C820210WFn.LIZ(context, bundle).LIZLLL);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C820230WFp.LIZIZ;
    }
}
