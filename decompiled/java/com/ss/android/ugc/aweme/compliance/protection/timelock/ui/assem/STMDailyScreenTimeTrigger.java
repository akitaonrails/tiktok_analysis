package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0PEM;
import X.C13LE;
import X.C1482560ogQ;
import X.C1488130opP;
import X.C1488140opQ;
import X.C1500040p8c;
import X.C1500050p8d;
import X.C15YW;
import X.C19719912Dl;
import X.C20543315a3;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.EnumC1500030p8b;
import X.EnumC20538815Yk;
import X.EnumC20542815Zy;
import com.ss.android.ugc.aweme.compliance.api.model.DailyScreenTimeMeditation;
import com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger;
import java.util.Collections;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class STMDailyScreenTimeTrigger implements ISleepHourComponentTrigger {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public AnonymousClass0956 LJ;
    public final long LIZLLL = 50000;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS567S0100000_23(this, 80));

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final C19719912Dl LJIILJJIL() {
        return C13LE.LIZ(STMDailyScreenTimeAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final boolean LIZIZ() {
        C15YW.LIZ.getClass();
        return C15YW.LJIIIZ != null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final EnumC20538815Yk getKey() {
        STMDailyScreenTimeAssem.LLJZIJLIL.getClass();
        return STMDailyScreenTimeAssem.LLLFF;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final void prepare() {
        EnumC20542815Zy enumC20542815Zy;
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        C15YW.LIZ.getClass();
        DailyScreenTimeMeditation dailyScreenTimeMeditation = C15YW.LJIIIZ;
        if (dailyScreenTimeMeditation == null || (enumC20542815Zy = dailyScreenTimeMeditation.type) == null) {
            return;
        }
        STMDailyScreenTimeAssem.LLJZIJLIL.getClass();
        C20543315a3 c20543315a3 = STMDailyScreenTimeAssem.LLLF.get(enumC20542815Zy);
        if (c20543315a3 == null) {
            return;
        }
        C1482560ogQ c1482560ogQLIZ = C1488130opP.LIZ(new C1488140opQ(true, Collections.singletonList(c20543315a3.LIZJ), 0, enumC20542815Zy.getS(), 0, 0, false, 120));
        if (!this.LIZ) {
            this.LIZ = true;
            C1488130opP.LIZJ().LIZLLL((C1500050p8d) this.LJFF.getValue());
            this.LJ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1500040p8c(this, null), 3);
        }
        C1488130opP.LIZLLL("daily_screen_time", Collections.singletonList(c1482560ogQLIZ));
        new AwS567S0100000_23(dailyScreenTimeMeditation, 81);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final boolean LIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final EnumC1500030p8b getPriority() {
        return EnumC1500030p8b.DAILY_SCREEN_TIME;
    }
}
