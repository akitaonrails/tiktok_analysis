package com.ss.android.ugc.aweme.power.scene;

import X.C1590270rU9;
import X.C1590330rUF;
import X.C2214201BlK;
import X.InterfaceC1590340rUG;
import X.InterfaceC794610VFb;
import Y.AfS193S0100000_24;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class SceneGenerator {
    public static volatile SceneGenerator LJII;
    public boolean LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public SceneHandler LJFF;
    public final List<InterfaceC794610VFb> LJI = new ArrayList();

    public static SceneGenerator LIZIZ() {
        if (LJII == null) {
            synchronized (SceneGenerator.class) {
                try {
                    if (LJII == null) {
                        LJII = new SceneGenerator();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJII;
    }

    public final void LJ() {
        if (this.LIZ) {
            if (this.LJFF.hasMessages(1)) {
                this.LJFF.removeMessages(1);
            }
            this.LJFF.sendEmptyMessageDelayed(1, 500L);
        }
    }

    public class SceneHandler extends BPEAHandler {
        /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r5) {
            /*
                r4 = this;
                java.lang.String r3 = "SceneGenerator$SceneHandler@e086.handleMessage"
                X.C1C7U.LIZ(r3)
                int r1 = r5.what
                r0 = 1
                if (r1 == r0) goto L1a
                r0 = 2
                if (r1 != r0) goto L16
                com.ss.android.ugc.aweme.power.scene.SceneGenerator r2 = com.ss.android.ugc.aweme.power.scene.SceneGenerator.this
                java.lang.String r1 = "unknown"
                java.lang.String r0 = "background"
                r2.LIZ(r1, r0)
            L16:
                X.C1C7U.LIZIZ(r3)
                return
            L1a:
                com.ss.android.ugc.aweme.power.scene.SceneGenerator r0 = com.ss.android.ugc.aweme.power.scene.SceneGenerator.this
                java.lang.String r0 = r0.LIZLLL
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L16
                com.ss.android.ugc.aweme.power.scene.SceneGenerator r0 = com.ss.android.ugc.aweme.power.scene.SceneGenerator.this
                java.lang.String r0 = r0.LIZIZ
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L16
                com.ss.android.ugc.aweme.power.scene.SceneGenerator r0 = com.ss.android.ugc.aweme.power.scene.SceneGenerator.this
                java.lang.String r1 = r0.LIZLLL
                java.lang.String r0 = r0.LJ
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L46
                com.ss.android.ugc.aweme.power.scene.SceneGenerator r0 = com.ss.android.ugc.aweme.power.scene.SceneGenerator.this
                java.lang.String r1 = r0.LIZIZ
                java.lang.String r0 = r0.LIZJ
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L16
            L46:
                com.ss.android.ugc.aweme.power.scene.SceneGenerator r2 = com.ss.android.ugc.aweme.power.scene.SceneGenerator.this
                java.lang.String r1 = r2.LIZLLL
                java.lang.String r0 = r2.LIZIZ
                r2.LIZ(r1, r0)
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.power.scene.SceneGenerator.SceneHandler.handleMessage(android.os.Message):void");
        }

        public SceneHandler(Looper looper) {
            super(looper);
        }
    }

    public final void LIZJ(Looper looper) {
        if (this.LIZ) {
            return;
        }
        this.LJFF = new SceneHandler(looper);
        C1590270rU9 c1590270rU9LIZ = C1590270rU9.LIZ();
        c1590270rU9LIZ.LIZ = new C1590330rUF(this);
        if (!TextUtils.isEmpty(c1590270rU9LIZ.LIZIZ)) {
            InterfaceC1590340rUG interfaceC1590340rUG = c1590270rU9LIZ.LIZ;
            String str = c1590270rU9LIZ.LIZIZ;
            SceneGenerator sceneGenerator = ((C1590330rUF) interfaceC1590340rUG).LIZ;
            if (!TextUtils.equals(str, sceneGenerator.LIZIZ)) {
                sceneGenerator.LIZJ = sceneGenerator.LIZIZ;
                sceneGenerator.LIZIZ = str;
                sceneGenerator.LJ();
            }
        }
        C2214201BlK.LIZLLL().LJJLJLI(new AfS193S0100000_24(this, 0));
        this.LIZ = true;
        LJ();
    }

    public final synchronized void LIZLLL(InterfaceC794610VFb interfaceC794610VFb) {
        if (interfaceC794610VFb != null) {
            if (!((ArrayList) this.LJI).contains(interfaceC794610VFb)) {
                ((ArrayList) this.LJI).add(interfaceC794610VFb);
                if (this.LIZ) {
                    interfaceC794610VFb.LIZIZ(this.LIZLLL, this.LIZIZ);
                }
            }
        }
    }

    public final void LJFF(String str) {
        if (TextUtils.equals(str, this.LIZLLL)) {
            return;
        }
        this.LJ = this.LIZLLL;
        this.LIZLLL = str;
        LJ();
    }

    public final synchronized void LIZ(String str, String str2) {
        Iterator it2 = ((ArrayList) this.LJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC794610VFb) it2.next()).LIZIZ(str, str2);
        }
    }
}
