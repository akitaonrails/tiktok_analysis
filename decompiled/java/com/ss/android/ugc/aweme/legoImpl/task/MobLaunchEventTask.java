package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C20684815ws;
import X.C2344809Gs;
import X.C794240VDq;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class MobLaunchEventTask implements C0CCZ {
    public final boolean LL;
    public final long LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MobLaunchEventTask";
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !ColdBootTasksDegradeExperiment.LIZ().mobLaunchEventTask;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        String str;
        C2344809Gs.LJ("MobLaunchEventTask");
        String str2 = "first_launch_time";
        if (this.LL) {
            str = "first_launch_time";
        } else {
            str = "launch_time";
        }
        C794240VDq.LJ("aweme_app_performance", str, this.LLILLJJLI);
        MobClick mobClickObtain = MobClick.obtain();
        if (!this.LL) {
            str2 = "launch_time";
        }
        mobClickObtain.setEventName(str2);
        mobClickObtain.setLabelName("perf_monitor");
        mobClickObtain.setExtValueLong(this.LLILLJJLI);
        C20684815ws.onEvent(mobClickObtain);
    }

    public MobLaunchEventTask(boolean z, long j) {
        this.LL = z;
        this.LLILLJJLI = j;
    }
}
