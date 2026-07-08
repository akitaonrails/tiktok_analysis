package com.bytedance.otis.optimise.system.render;

import X.C2105508Mr;
import X.C2112108Pf;
import X.C2112408Pi;
import com.bytedance.shadowhook.ShadowHook;

/* JADX INFO: loaded from: classes4.dex */
public class RenderManager {
    public static boolean sInit;

    public native void nFinish();

    public native void nInit(int i);

    public void finish() {
        if (sInit) {
            nFinish();
            sInit = false;
        }
    }

    static {
        C2105508Mr.LIZ();
    }

    public RenderManager() {
    }

    public static RenderManager getInstance() {
        return C2112408Pi.LIZ;
    }

    public void speedUpRender(int i) {
        if (i > 19 && i <= 33 && !sInit) {
            sInit = true;
            if (ShadowHook.init(new C2112108Pf().LIZ()) == 0) {
                nInit(i);
            }
        }
    }
}
