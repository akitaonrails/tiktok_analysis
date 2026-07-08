package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VEJ;
import X.C0VU1;
import X.C0VZ0;
import X.C2273401Dyc;
import X.C794030VCv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.legoImp.task.LogCleanTask;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class LogCleanTask implements C0CCZ, InterfaceC799590VYf {
    public CleanModel LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LogCleanTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
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
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(final Context context) {
        C794030VCv.LIZ.getClass();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        CleanModel cleanModel = C794030VCv.LIZIZ;
        CleanModel cleanModel2 = (CleanModel) settingsManagerLIZLLL.LJIIIIZZ("slardar_clean_settings", CleanModel.class, cleanModel);
        if (cleanModel2 != null) {
            cleanModel = cleanModel2;
        }
        this.LL = cleanModel;
        C0VEJ c0vej = new C0VEJ() { // from class: X.0VEI
            @Override // X.C0VEJ
            public final void LIZ(String str, String str2) {
                if (str.length() > 0 && !Intrinsics.LJFF(str, str2)) {
                    final LogCleanTask logCleanTask = this.LIZ;
                    final Context context2 = context;
                    logCleanTask.getClass();
                    C09UZ.LIZ(new Runnable() { // from class: X.0VBw
                        /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZ() throws org.json.JSONException {
                            /*
                                Method dump skipped, instruction units count: 576
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.RunnableC793780VBw.LIZ():void");
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LogCleanTask@c9c1.cleanInBackground$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LogCleanTask@c9c1.cleanInBackground$1");
                        }
                    });
                }
            }
        };
        CopyOnWriteArrayList<C0VEJ> copyOnWriteArrayList = C2273401Dyc.LIZIZ;
        if (!copyOnWriteArrayList.contains(c0vej)) {
            copyOnWriteArrayList.add(c0vej);
            if (!Intrinsics.LJFF(C2273401Dyc.LIZLLL, "")) {
                c0vej.LIZ(C2273401Dyc.LIZJ, C2273401Dyc.LIZLLL);
            }
        }
    }
}
