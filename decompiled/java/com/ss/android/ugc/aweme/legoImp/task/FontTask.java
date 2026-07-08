package com.ss.android.ugc.aweme.legoImp.task;

import X.AbstractC1043470dGD;
import X.C0CCZ;
import X.C0CD2;
import X.C0VU1;
import X.C0VZ0;
import X.C1041230dCb;
import X.C1487300oo4;
import X.C1492110ovp;
import X.C1514430pVp;
import X.C1697600uHG;
import X.C2279461EKa;
import X.C304790Bx7;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import X.InterfaceC799780VYy;
import Y.AObjectS73S0000000_23;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes24.dex */
public class FontTask implements C0CCZ, InterfaceC799590VYf, InterfaceC799780VYy {
    public long LL = 500;

    @Override // X.InterfaceC799780VYy
    public final void LJFF() {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FontTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
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

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return ((Boolean) C2279461EKa.LJI.getValue()).booleanValue() ? C0VU1.IO : C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        C304790Bx7.LIZ.getClass();
        int iLIZ = C304790Bx7.LIZ();
        int i = C304790Bx7.LIZLLL;
        EnumC799870VZh enumC799870VZh = (EnumC799870VZh) C1492110ovp.LIZJ("FontTask_idleOpt", new AObjectS73S0000000_23(4), new AObjectS73S0000000_23(5), (iLIZ & i) == i);
        Objects.requireNonNull(enumC799870VZh);
        return enumC799870VZh;
    }

    @Override // X.InterfaceC799590VYf
    public final int level() {
        C1514430pVp.LIZLLL().booleanValue();
        return 1;
    }

    @Override // X.InterfaceC799780VYy
    public final long LIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC799780VYy
    public final void LJ(Long l) {
        this.LL = l.longValue();
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1487300oo4 c1487300oo4LIZ = C1487300oo4.LIZ();
        c1487300oo4LIZ.getClass();
        if (context != null) {
            c1487300oo4LIZ.LIZ = C786410Ut5.N3(context);
        }
        C1041230dCb.LIZLLL().LIZIZ(new AbstractC1043470dGD() { // from class: X.0oo3
            @Override // X.AbstractC1043470dGD
            public final String LIZLLL() {
                return "(.*)/ies_fonts/(.+).ttf$";
            }

            @Override // X.AbstractC1043470dGD
            public final InputStream LIZIZ(String str) {
                InputStream inputStreamOpen = null;
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                String strSubstring = str.substring(str.lastIndexOf("/") + 1);
                if (!TextUtils.isEmpty(strSubstring)) {
                    Context context2 = C1487300oo4.LIZ().LIZ;
                    C1487300oo4.LIZ().getClass();
                    Map<String, String> map = C1487300oo4.LIZIZ;
                    if (map != null) {
                        HashMap map2 = (HashMap) map;
                        if (map2.size() != 0) {
                            String str2 = (String) map2.get(strSubstring);
                            if (!TextUtils.isEmpty(str2)) {
                                try {
                                    inputStreamOpen = context2.getAssets().open(str2);
                                    return inputStreamOpen;
                                } catch (IOException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }
                    }
                }
                return inputStreamOpen;
            }
        });
        if (!((Boolean) C0CD2.LJJJLL.getValue()).booleanValue()) {
            Npth.addTag("initTuxTypeface", "start");
            C1697600uHG.LIZIZ(context);
            Npth.addTag("initTuxTypeface", "done");
        }
    }
}
