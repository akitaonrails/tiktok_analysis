package com.ss.android.ugc.aweme.homepage.business;

import X.C0CCZ;
import X.C0VZ0;
import X.C2344809Gs;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class PreloadMainTask implements C0CCZ {
    public final WeakReference<Hox> LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreloadMainTask";
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !ColdBootTasksDegradeExperiment.LIZ().preloadMainTask;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    public PreloadMainTask(Hox hox) {
        this.LL = new WeakReference<>(hox);
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Hox hox = this.LL.get();
        if (hox != null) {
            try {
                hox.EQ2("page_feed");
                hox.EQ2("page_profile");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LJI(e);
            }
        }
    }
}
