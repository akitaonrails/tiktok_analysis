package com.bytedance.common.jato.memory.LeakRepair;

import X.C1959307lv;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class RenderNodeReclaimer {
    public static final RenderNodeReclaimer LIZIZ;
    public final Method LIZ;

    public static native boolean nativeInitRenderNodeReclaim(long j, Method method, boolean z);

    static {
        LoadSoLancet.LIZJ("jato");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("jato");
        LoadSoLancet.LJ(jUptimeMillis, "jato");
        LoadSoLancet.LIZLLL(jUptimeMillis, "jato");
        LoadSoLancet.LIZIZ("jato");
        LIZIZ = null;
    }

    public RenderNodeReclaimer() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        long jLongValue = -1;
        try {
            C1959307lv.LIZJ(View.class, "mRenderNode").setAccessible(true);
            Field fieldLIZJ = C1959307lv.LIZJ(RenderNode.class, "mNativeRenderNode");
            fieldLIZJ.setAccessible(true);
            Class cls = Long.TYPE;
            C1959307lv.LIZLLL(RenderNode.class, "nIsValid", cls).setAccessible(true);
            RenderNode.class.getDeclaredConstructor(cls).setAccessible(true);
            jLongValue = ((Long) fieldLIZJ.get(new RenderNode("ReplaceEmptyNode"))).longValue();
            Method methodLIZLLL = C1959307lv.LIZLLL(RecordingCanvas.class, "nDrawRenderNode", cls, cls);
            this.LIZ = methodLIZLLL;
            methodLIZLLL.setAccessible(true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (jLongValue != 0) {
            nativeInitRenderNodeReclaim(jLongValue, this.LIZ, false);
        }
    }
}
