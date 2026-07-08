package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C2344809Gs;
import X.C810670Vr7;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class SharePreferencePreloadForAllProcessTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SharePreferencePreloadForAllProcessTask";
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
        return 35;
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
    public final void run(Context context) {
        C2344809Gs.LJ("SharePreferencePreloadForAllProcessTask");
        LIZ(context, 0, "app_setting");
        LIZ(context, 0, "use_https");
        LIZ(context, 0, "update_params");
        LIZ(context, 0, "is_allow_oppo_push");
        LIZ(context, 0, "push_setting");
        LIZ(context, 4, "push_multi_process_config");
        LIZ(context, 0, "applog_stats");
    }

    public final void LIZ(Context context, int i, String str) {
        C810670Vr7.LIZJ(context, i, str).getAll();
    }
}
