package org.chromium.diagnosis;

import J.N;
import X.C1498110p5V;
import X.InterfaceC1490450ot9;
import X.InterfaceC1490460otA;
import X.InterfaceC1498130p5X;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.e;
import com.ttnet.org.chromium.net.g0;
import com.ttnet.org.chromium.net.impl.TTCronetNetExpRequest;
import java.util.List;
import org.chromium.CronetClient;

/* JADX INFO: loaded from: classes24.dex */
public class CronetDiagnosisRequestImpl implements InterfaceC1490450ot9 {
    public static final String TAG = "CronetDiagnosisRequestImpl";
    public static e sCronetEngine;
    public InterfaceC1490460otA mCallback;
    public CallbackImpl mCronetCallback = new CallbackImpl();
    public g0 mRequest;

    public static void loadCronetKernel() {
        Reflect.on(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("preInitCronetKernel");
    }

    @Override // X.InterfaceC1490450ot9
    public void cancel() {
        g0 g0Var = this.mRequest;
        if (g0Var != null) {
            TTCronetNetExpRequest tTCronetNetExpRequest = (TTCronetNetExpRequest) g0Var;
            synchronized (tTCronetNetExpRequest.LJIIJ) {
                try {
                    if (!tTCronetNetExpRequest.LJIIIZ || tTCronetNetExpRequest.LJIIIIZZ == 0) {
                        return;
                    }
                    if (tTCronetNetExpRequest.LJIIIIZZ != 0) {
                        N.M6$xRvea(tTCronetNetExpRequest.LJIIIIZZ, tTCronetNetExpRequest);
                        tTCronetNetExpRequest.LJIIIIZZ = 0L;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC1490450ot9
    public void start() {
        g0 g0Var = this.mRequest;
        if (g0Var != null) {
            TTCronetNetExpRequest tTCronetNetExpRequest = (TTCronetNetExpRequest) g0Var;
            synchronized (tTCronetNetExpRequest.LJIIJ) {
                try {
                    if (tTCronetNetExpRequest.LJIIIZ) {
                        return;
                    }
                    long jLJJL = tTCronetNetExpRequest.LIZ.LJJL();
                    int i = tTCronetNetExpRequest.LIZIZ;
                    List<String> list = tTCronetNetExpRequest.LIZJ;
                    long jMPJAsrFC = N.MPJAsrFC(tTCronetNetExpRequest, jLJJL, i, (String[]) list.toArray(new String[list.size()]), tTCronetNetExpRequest.LIZLLL, tTCronetNetExpRequest.LJ, tTCronetNetExpRequest.LJFF);
                    tTCronetNetExpRequest.LJIIIIZZ = jMPJAsrFC;
                    if (jMPJAsrFC == 0) {
                        throw new NullPointerException("Create native net exp request adapter failed.");
                    }
                    tTCronetNetExpRequest.LJIIIZ = true;
                    N.MLiR9ZbW(tTCronetNetExpRequest.LJIIIIZZ, tTCronetNetExpRequest);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    private e getCronetEngine() {
        Logger.debug();
        try {
            loadCronetKernel();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Logger.debug();
        }
        return CronetClient.getCronetEngine();
    }

    public class CallbackImpl implements InterfaceC1498130p5X {
        public CallbackImpl() {
        }

        @Override // X.InterfaceC1498130p5X
        public void onNetDiagnosisRequestComplete(g0 g0Var, String str) {
            CronetDiagnosisRequestImpl.this.mCallback.LIZ(str);
        }
    }

    @Override // X.InterfaceC1490450ot9
    public void doExtraCommand(String str, String str2) {
        g0 g0Var = this.mRequest;
        if (g0Var != null) {
            TTCronetNetExpRequest tTCronetNetExpRequest = (TTCronetNetExpRequest) g0Var;
            synchronized (tTCronetNetExpRequest.LJIIJ) {
                try {
                    if (tTCronetNetExpRequest.LJIIIZ && tTCronetNetExpRequest.LJIIIIZZ != 0) {
                        N.MDZjmtTn(tTCronetNetExpRequest.LJIIIIZZ, tTCronetNetExpRequest, str, str2);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public CronetDiagnosisRequestImpl(InterfaceC1490460otA interfaceC1490460otA, int i, List<String> list, int i2, int i3, int i4) {
        this.mCallback = interfaceC1490460otA;
        if (sCronetEngine == null) {
            sCronetEngine = getCronetEngine();
        }
        e eVar = sCronetEngine;
        if (eVar != null) {
            C1498110p5V c1498110p5VLIZIZ = eVar.LIZIZ(this.mCronetCallback);
            c1498110p5VLIZIZ.getClass();
            c1498110p5VLIZIZ.LIZLLL = list;
            c1498110p5VLIZIZ.getClass();
            c1498110p5VLIZIZ.getClass();
            c1498110p5VLIZIZ.getClass();
            this.mRequest = c1498110p5VLIZIZ.LIZ.LJJJJL(c1498110p5VLIZIZ.LIZJ, c1498110p5VLIZIZ.LIZIZ, i, list, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Can not get cronet engine.");
    }
}
