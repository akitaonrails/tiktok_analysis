package com.lynx.devtoolwrapper;

import X.C2188811AlT;
import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxEnv;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes21.dex */
public class LynxDevToolPool {
    public static int LJ;
    public final List<LynxDevtool> LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public long LIZLLL;

    private native long nativeCreateDevToolPool();

    private native void nativeDestroyDevToolPool(long j);

    public final void LIZ() {
        if (!((ArrayList) this.LIZ).isEmpty()) {
            ((ArrayList) this.LIZ).forEach(new Consumer() { // from class: X.0jfN
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    obj.getClass();
                }
            });
            ((ArrayList) this.LIZ).clear();
        }
        long j = this.LIZLLL;
        if (j != 0) {
            nativeDestroyDevToolPool(j);
            this.LIZLLL = 0L;
        }
    }

    public void popDevTool() {
        if (((ArrayList) this.LIZ).isEmpty()) {
            return;
        }
        ListProtector.get(this.LIZ, ((ArrayList) r1).size() - 1).getClass();
        ListProtector.remove(this.LIZ, ((ArrayList) r1).size() - 1);
    }

    public void createDevTool() {
        if (LynxEnv.inst().isLynxDebugEnabled()) {
            ((ArrayList) this.LIZ).add(new LynxDevtool(this.LIZIZ));
        }
    }

    public LynxDevToolPool(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create LynxDevToolPool, url: ");
        sbLIZ.append(str);
        sbLIZ.append(", debuggable: ");
        sbLIZ.append(false);
        LynxLog.i("LynxDevToolPool", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = new ArrayList();
        this.LIZIZ = false;
        this.LIZJ = str;
        if (TextUtils.isEmpty(str)) {
            this.LIZJ = "anonymous bundle";
        }
        this.LIZLLL = nativeCreateDevToolPool();
    }

    public void onMTSRuntimeCreated(long j) {
        if (((ArrayList) this.LIZ).isEmpty()) {
            return;
        }
        List<LynxDevtool> list = this.LIZ;
        ListProtector.get(list, ((ArrayList) list).size() - 1).getClass();
        int i = LJ;
        LJ = i + 1;
        C786410Ut5.j4("%s - context%d", new Object[]{this.LIZJ, Integer.valueOf(i)});
    }
}
