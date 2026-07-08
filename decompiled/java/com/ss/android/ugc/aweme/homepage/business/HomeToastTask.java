package com.ss.android.ugc.aweme.homepage.business;

import X.C0CCZ;
import X.C0VZ0;
import X.C10EU;
import X.C20684815ws;
import X.C2214201BlK;
import X.C2241008qG;
import X.C2344809Gs;
import X.C786410Ut5;
import X.C794420VEi;
import X.C813020Vuu;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.common.MobClick;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class HomeToastTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "HomeToastTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C2344809Gs.LJ("ToastTask");
        final long jLIZJ = C813020Vuu.LJIIL().LIZJ(context, "red_point_count");
        if (jLIZJ > 0) {
            if (!C10EU.LJIIIIZZ()) {
                final Context contextLJFF = C2214201BlK.LJFF();
                if (contextLJFF == null) {
                    contextLJFF = context;
                }
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.05jp
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        String string;
                        Activity activityLIZ;
                        C1C7U.LIZ("HomeToastTask@121e.run$1");
                        try {
                            Context context2 = contextLJFF;
                            if (context2 != null && (string = context2.getString(2131845877, Long.valueOf(jLIZJ))) != null && (activityLIZ = C1388190mED.LIZ(contextLJFF)) != null && !activityLIZ.isFinishing()) {
                                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                                c1389890mGx.LJIIJ(string);
                                c1389890mGx.LJIIJJI();
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("HomeToastTask@121e.run$1");
                    }
                });
            }
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("count", String.valueOf(jLIZJ));
            C794420VEi.LIZIZ("log_red_badge", "click", c2241008qG.LJ());
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setEventName("red_badge");
            mobClickObtain.setLabelName("click");
            mobClickObtain.setValue(String.valueOf(jLIZJ));
            C20684815ws.onEvent(mobClickObtain);
            C813020Vuu.LJIIL().LJIIIZ(context, "red_point_count", 0L);
        }
    }
}
