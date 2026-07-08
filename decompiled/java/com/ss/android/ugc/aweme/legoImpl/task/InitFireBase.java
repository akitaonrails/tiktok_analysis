package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0CD2;
import X.C0VU1;
import X.C0VZ0;
import X.C1913870zu5;
import X.C20144713rx;
import X.C2162308dZ;
import X.C793770VBv;
import X.C818880WAk;
import X.C837720Wte;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import java.util.List;
import kotlin.jvm.internal.AwS131S0110000_13;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class InitFireBase implements C0CCZ, InterfaceC799590VYf {
    public static InitFireBase LLILLL;
    public boolean LL;
    public Runnable LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitFireBase";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
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

    public static InitFireBase LIZ() {
        if (LLILLL == null) {
            LLILLL = new InitFireBase();
        }
        return LLILLL;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return ((Boolean) C0CD2.LJ.getValue()).booleanValue() ? 2 : 1;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return ((Boolean) C0CD2.LJ.getValue()).booleanValue() ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        try {
            C818880WAk.LJFF(context);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_reason", e.toString());
                C793770VBv.LJII("firebase_initialize_error", jSONObject, null, null);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        this.LL = true;
        Runnable runnable = this.LLILLJJLI;
        if (runnable != null) {
            runnable.run();
        }
        if (C2162308dZ.LJI(context)) {
            try {
                C20144713rx c20144713rx = new C20144713rx(939524363);
                C837720Wte.LIZ("Firebase", "setDeliveryMetricsExportToBigQuery", c20144713rx, new AwS131S0110000_13(c20144713rx, 3));
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LIZJ();
            C1913870zu5.LJ();
        }
    }
}
