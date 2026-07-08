package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1842507Jn;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PreloadInMeasureTriggerTask implements C0CCZ {
    public static final PreloadInMeasureTriggerTask LL = new PreloadInMeasureTriggerTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreloadInMeasureTriggerTask";
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
        return !ColdBootTasksDegradeExperiment.LIZ().preloadInMeasureTriggerTask;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.FIRST_WINDOW_FOCUS;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1842507Jn.LIZ.getClass();
        if ((((Number) C1842507Jn.LIZIZ.getValue()).intValue() & 1) == 1) {
            ((IEarlyFeedbackService) ServiceManager.get().getService(IEarlyFeedbackService.class)).LJFF();
        }
    }
}
