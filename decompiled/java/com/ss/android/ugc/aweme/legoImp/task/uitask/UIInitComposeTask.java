package com.ss.android.ugc.aweme.legoImp.task.uitask;

import X.C0CCZ;
import X.C0NUR;
import X.C0VZ0;
import X.C13X4;
import X.C13Y1;
import X.C1670410tZP;
import X.C1671570tbH;
import X.C1690080u58;
import X.C1691440u7K;
import X.C1692220u8a;
import X.C1694560uCM;
import X.C1695020uD6;
import X.C1695650uE7;
import X.C1696500uFU;
import X.C1ETL;
import X.C20028313Yb;
import X.C2252321DDq;
import X.C2296808zG;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1671600tbK;
import X.InterfaceC1685750ty9;
import X.InterfaceC1693130uA3;
import X.InterfaceC20036213aS;
import android.content.Context;
import android.os.Looper;
import androidx.compose.foundation.layout.c;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class UIInitComposeTask implements C0CCZ {
    public static final UIInitComposeTask LL = new UIInitComposeTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "UIInitComposeTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (context == null) {
            return;
        }
        c.LJIILLIIL(InterfaceC1685750ty9.LIZ, 0.0f);
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0xwg
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ComposePreloader@21e1.preloadCompose$1");
                try {
                    C1838750xwv.LLJIJIL.getValue();
                    C1838610xwh.LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ComposePreloader@21e1.preloadCompose$1");
            }
        });
        C1671570tbH.LIZ((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
        C2252321DDq c2252321DDq = C13Y1.LJJ;
        C1696500uFU c1696500uFU = C1696500uFU.LIZ;
        C1695020uD6 c1695020uD6 = C1695020uD6.LJI;
        InterfaceC1693130uA3.LIZ.getClass();
        C0NUR.LIZ(context);
        C20028313Yb<Object> c20028313Yb = C1691440u7K.LIZ;
        C2296808zG.LIZIZ();
        InterfaceC20036213aS.LIZIZ.getClass();
        new C1692220u8a("");
        new C1690080u58(0, 0);
        InterfaceC1671600tbK.LIZ.getClass();
        C1694560uCM c1694560uCM = C1694560uCM.LLILLL;
        C1695650uE7.LIZ.LIZ();
        C13X4.LIZ();
        try {
            if (C299020Bno.LIZ() != 0) {
                C1ETL.LJ = true;
            }
            EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
            if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
                C1ETL.LJFF = 1;
            } else if (enumC335920DEwLIZ == EnumC335920DEw.V2) {
                C1ETL.LJFF = 2;
            } else {
                C1ETL.LJFF = 0;
            }
            C1670410tZP.LIZIZ();
            Class<?> cls = Class.forName("androidx.compose.ui.platform.m5");
            Method declaredMethod = cls.getDeclaredMethod("getAnimationScaleFlowFor", Context.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(cls, C786410Ut5.N3(context));
            Class.forName("androidx.compose.foundation.layout.c");
            Class.forName("o0.k");
            Class.forName("p2.g");
            Class.forName("p2.g$a");
            Class.forName("p2.j1");
            Class.forName("p2.x");
            Class.forName("n2.k1");
            Class.forName("androidx.compose.ui.platform.z");
            Class.forName("m3.b");
            Class.forName("p2.h1");
            Class.forName("androidx.compose.runtime.s");
            Class.forName("p1.b");
            Class.forName("h0.n2");
            Class.forName("k0.f2");
            Class.forName("a3.e0");
            Class.forName("a3.d");
            Class.forName("p2.k0");
            Class.forName("i0.y1");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.toString();
        }
    }
}
