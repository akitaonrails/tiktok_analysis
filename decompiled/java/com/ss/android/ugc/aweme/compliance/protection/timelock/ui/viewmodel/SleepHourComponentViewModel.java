package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.viewmodel;

import X.C1386180mAy;
import X.C1571810r0N;
import X.EnumC1500030p8b;
import X.EnumC20538815Yk;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AwS139S1200000_24;
import kotlin.jvm.internal.AwS173S1100000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SleepHourComponentViewModel extends AssemViewModel<C1571810r0N> {
    public final Map<EnumC20538815Yk, ISleepHourComponentTrigger> LL = new LinkedHashMap();
    public long LLILLJJLI;
    public long LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1571810r0N(0);
    }

    public final void wQ2() {
        if (this.LLILLL > 0) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - this.LLILLL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            if (jCurrentTimeMillis > 0) {
                this.LLILLL = 0L;
                C1386180mAy c1386180mAy = new C1386180mAy();
                Aweme aweme = new Aweme();
                aweme.setAwemeType(0);
                aweme.setAid(UUID.randomUUID().toString());
                c1386180mAy.LJIJI(aweme);
                c1386180mAy.LIZLLL = "homepage_hot";
                c1386180mAy.LJJLIIIJL = jCurrentTimeMillis;
                c1386180mAy.LJIILJJIL();
            }
        }
    }

    public final boolean vQ2() {
        return getState().LL == EnumC20538815Yk.DISMISS;
    }

    public final boolean yQ2() {
        ISleepHourComponentTrigger iSleepHourComponentTrigger;
        EnumC20538815Yk enumC20538815Yk = getState().LL;
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("stm_framework_refactor", true) && (iSleepHourComponentTrigger = (ISleepHourComponentTrigger) ((LinkedHashMap) this.LL).get(enumC20538815Yk)) != null && iSleepHourComponentTrigger.LIZIZ();
    }

    public final void xQ2(EnumC20538815Yk enumC20538815Yk, String str) {
        EnumC1500030p8b priority;
        EnumC20538815Yk enumC20538815Yk2 = getState().LL;
        new AwS139S1200000_24(str, enumC20538815Yk2, enumC20538815Yk, 1);
        if (enumC20538815Yk == enumC20538815Yk2) {
            new AwS568S0100000_24(enumC20538815Yk, 248);
            return;
        }
        if (enumC20538815Yk == EnumC20538815Yk.DISMISS) {
            new AwS173S1100000_24(enumC20538815Yk, str, 0);
            setState(new AwS603S0100000_24(enumC20538815Yk, 39));
            return;
        }
        ISleepHourComponentTrigger iSleepHourComponentTrigger = (ISleepHourComponentTrigger) ((LinkedHashMap) this.LL).get(enumC20538815Yk);
        if (iSleepHourComponentTrigger == null) {
            return;
        }
        if (!iSleepHourComponentTrigger.LIZIZ()) {
            new AwS568S0100000_24(enumC20538815Yk, 249);
            return;
        }
        ISleepHourComponentTrigger iSleepHourComponentTrigger2 = (ISleepHourComponentTrigger) ((LinkedHashMap) this.LL).get(enumC20538815Yk2);
        if (iSleepHourComponentTrigger2 != null && (priority = iSleepHourComponentTrigger2.getPriority()) != null && iSleepHourComponentTrigger2.LIZIZ() && iSleepHourComponentTrigger.getPriority().getI() >= priority.getI()) {
            new AwS568S0100000_24(enumC20538815Yk, 250);
        } else {
            new AwS173S1100000_24(enumC20538815Yk, str, 1);
            setState(new AwS603S0100000_24(enumC20538815Yk, 40));
        }
    }
}
