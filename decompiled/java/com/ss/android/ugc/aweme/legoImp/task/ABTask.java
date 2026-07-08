package com.ss.android.ugc.aweme.legoImp.task;

import X.C08Q0;
import X.C0BEC;
import X.C0C58;
import X.C0C5F;
import X.C0C5G;
import X.C0C5N;
import X.C0C5P;
import X.C0C5Q;
import X.C0CCZ;
import X.C0CLD;
import X.C0VZ0;
import X.C0X35;
import X.C293210BeR;
import X.C307820C4u;
import X.C311760CJy;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC308030C5p;
import android.app.Application;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.launcher.service.configcenter.IAwemeConfigCenterApi;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ABTask implements C0CCZ {
    public static volatile boolean LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ABTask";
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !LL;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!LL) {
            synchronized (ABTask.class) {
                try {
                    if (!LL) {
                        C0X35.LIZ("method_ab_task_before_configuration_init_duration", false);
                        C0C5N c0c5n = C0C5N.LL;
                        LinkedList<C0C5F> linkedList = C0C5G.LIZIZ;
                        if (!linkedList.contains(c0c5n)) {
                            linkedList.add(c0c5n);
                            if (linkedList.size() != 0) {
                                C0C5G.LIZJ = true;
                            }
                        }
                        C0X35.LJIIJJI("method_ab_task_before_configuration_init_duration", false);
                        C0X35.LIZ("method_ab_task_configuration_init_duration", false);
                        if (C0BEC.LJ(context)) {
                            C311760CJy c311760CJy = C311760CJy.LIZIZ;
                            C844470XAv.LIZ.getClass();
                            c311760CJy.LIZ((Application) C844470XAv.LIZ());
                        } else {
                            C0C5P c0c5pLIZJ = C0C5P.LIZJ();
                            C844470XAv.LIZ.getClass();
                            c0c5pLIZJ.LIZLLL((Application) C844470XAv.LIZ(), new C0CLD(), C08Q0.LJ(context, "opt_abmock_enable_lazy_init", false));
                        }
                        C0X35.LJIIJJI("method_ab_task_configuration_init_duration", false);
                        C0X35.LIZ("method_ab_task_precise_exposure_duration", false);
                        if (C08Q0.LIZIZ(context, 0, "precise_exposure_strategy") == 1) {
                            C0C58.LIZJ.LIZIZ = true;
                        }
                        if (C08Q0.LIZIZ(context, 2, "ab_precise_exposure_repo_version") == 2) {
                            C0C58.LIZJ.getClass();
                        } else {
                            C0C58.LIZJ.getClass();
                        }
                        C293210BeR.LIZ("hybrid_ab");
                        C293210BeR.LIZ("livesdk");
                        LL = true;
                        IAwemeConfigCenterApi iAwemeConfigCenterApi = (IAwemeConfigCenterApi) PluggableExtentionKt.pluggableSpi(IAwemeConfigCenterApi.class);
                        if (iAwemeConfigCenterApi != null) {
                            iAwemeConfigCenterApi.LIZIZ();
                        }
                        SettingsManager.LIZLLL().LJIIIZ(c0c5n);
                        C307820C4u.LIZLLL = C08Q0.LJ(context, "ab_erase_opt", false);
                        C0X35.LJIIJJI("method_ab_task_precise_exposure_duration", false);
                        C0X35.LIZ("method_ab_task_unnecessary_business_duration", false);
                        C0C5P c0c5pLIZJ2 = C0C5P.LIZJ();
                        InterfaceC308030C5p interfaceC308030C5p = new InterfaceC308030C5p() { // from class: X.0C60
                        };
                        c0c5pLIZJ2.getClass();
                        C0C5Q.LIZIZ = interfaceC308030C5p;
                        C0X35.LJIIJJI("method_ab_task_unnecessary_business_duration", false);
                        C0X35.LIZ("method_ab_task_last_init_duration", false);
                        C0X35.LJIIJJI("method_ab_task_last_init_duration", false);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
