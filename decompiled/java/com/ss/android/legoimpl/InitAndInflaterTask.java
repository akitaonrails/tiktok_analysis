package com.ss.android.legoimpl;

import X.C01GW;
import X.C0B71;
import X.C0CCZ;
import X.C0VZ0;
import X.C1337240ku2;
import X.C16F1;
import X.C20673215v0;
import X.C20742916Ex;
import X.C21172617tM;
import X.C21263918Jh;
import X.C21264918Jr;
import X.C21265018Js;
import X.C21265318Jv;
import X.C21265518Jx;
import X.C285090BFj;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20743016Ey;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.nita.memory.MemoryManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes33.dex */
public class InitAndInflaterTask implements C0CCZ {
    public static final Random LL = new Random();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitAndInflaterTask";
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

    public static boolean LIZ() {
        return LL.nextFloat() < 0.005f;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        System.currentTimeMillis();
        C21264918Jr c21264918Jr = new C21264918Jr();
        c21264918Jr.LJI = true;
        SettingsManager.LIZLLL().getClass();
        c21264918Jr.LJIIIZ = SettingsManager.LIZ("and_inflater_fix_leak", true);
        c21264918Jr.LJ = true;
        C20742916Ex.LIZIZ = true;
        c21264918Jr.LJFF = false;
        c21264918Jr.LIZJ = 2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24 && i <= 27) {
            c21264918Jr.LIZJ = 1;
        }
        C01GW c01gw = C285090BFj.LIZ;
        c21264918Jr.LJII = ((Boolean) c01gw.getValue()).booleanValue();
        c21264918Jr.LJIIIIZZ = false;
        c21264918Jr.LIZLLL = R.style.xm;
        c21264918Jr.LIZ(R.style.xm, new int[]{R.style.xq, R.style.xr});
        c21264918Jr.LIZ(R.style.xq, new int[]{R.style.xm, R.style.xr});
        c21264918Jr.LIZ(R.style.xr, new int[]{R.style.xm, R.style.xq});
        c21264918Jr.LIZIZ = true;
        c21264918Jr.LJIIJ = ((Boolean) C0B71.LIZIZ.getValue()).booleanValue();
        final C16F1 c16f1 = new C16F1();
        C20742916Ex.LIZ = new InterfaceC20743016Ey() { // from class: X.16Ez
        };
        C21263918Jh.LIZIZ = c16f1;
        C21265018Js c21265018Js = new C21265018Js(c21264918Jr);
        if (context instanceof Application) {
            C20673215v0.LIZ = c21265018Js;
            C21263918Jh.LIZ = context;
            MemoryManager.LLJIJIL.getClass();
            Context context2 = C21263918Jh.LIZ;
            if (context2 != null) {
                ((Application) context2).registerActivityLifecycleCallbacks(MemoryManager.LLJI);
                context2.registerComponentCallbacks(new ComponentCallbacks2() { // from class: X.18JK
                    @Override // android.content.ComponentCallbacks
                    public final void onConfigurationChanged(Configuration configuration) {
                    }

                    @Override // android.content.ComponentCallbacks
                    public final void onLowMemory() {
                        MemoryManager.LLJIJIL.getClass();
                        C21172617tM.LJFF.LIZIZ().execute(C0C87.LL);
                        int i2 = C2187451AjH.LIZ;
                    }

                    @Override // android.content.ComponentCallbacks2
                    public final void onTrimMemory(int i2) {
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onLowMemory level ");
                        sbLIZ.append(i2);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                });
            }
            C20673215v0.LIZ.getClass();
            C21265318Jv c21265318Jv = C20673215v0.LIZ.LIZ;
            if (c21265318Jv != null) {
                C21263918Jh.LIZJ = c21265318Jv;
            }
            C21265518Jx c21265518Jx = C20673215v0.LIZ.LIZIZ;
            if (c21265518Jx != null) {
                C21263918Jh.LIZLLL = c21265518Jx;
            }
            C1337240ku2.LIZ = c21265018Js.LJIIJ;
            if (((Boolean) c01gw.getValue()).booleanValue()) {
                C21172617tM.LJFF.LIZ();
                return;
            }
            return;
        }
        throw new IllegalStateException("context must be application");
    }
}
