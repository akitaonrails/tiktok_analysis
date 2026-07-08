package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0PEM;
import X.C13LE;
import X.C1482560ogQ;
import X.C1488130opP;
import X.C1500000p8Y;
import X.C1500010p8Z;
import X.C15YW;
import X.C19719912Dl;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.EnumC1500030p8b;
import X.EnumC20538815Yk;
import com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger;
import java.util.Collections;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class STMMeditationTrigger implements ISleepHourComponentTrigger {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZLLL;
    public AnonymousClass0956 LJ;
    public final long LIZJ = 50000;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS567S0100000_23(this, 82));

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final C19719912Dl LJIILJJIL() {
        return C13LE.LIZ(STMMeditationAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final boolean LIZIZ() {
        C15YW.LIZ.getClass();
        return C15YW.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final void prepare() {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        STMMeditationAssem.LLJZIJLIL.getClass();
        C1482560ogQ c1482560ogQLIZ = C1488130opP.LIZ(STMMeditationAssem.LLLFF.getValue());
        if (!this.LIZ) {
            this.LIZ = true;
            C1488130opP.LIZJ().LIZLLL((C1500010p8Z) this.LJFF.getValue());
            this.LJ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1500000p8Y(this, null), 3);
        }
        C1488130opP.LIZLLL("breathing_exercise", Collections.singletonList(c1482560ogQLIZ));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final boolean LIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final EnumC20538815Yk getKey() {
        return EnumC20538815Yk.MEDITATION_VIDEO;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final EnumC1500030p8b getPriority() {
        return EnumC1500030p8b.SLEEP_HOUR;
    }
}
