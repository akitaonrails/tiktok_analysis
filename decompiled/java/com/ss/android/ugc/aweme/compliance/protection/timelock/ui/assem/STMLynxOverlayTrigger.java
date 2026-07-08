package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem;

import X.C13LE;
import X.C19719912Dl;
import X.C20544915aJ;
import X.C20545015aK;
import X.C23250099c;
import X.C294510BgX;
import X.EnumC1500030p8b;
import X.EnumC20538815Yk;
import X.EnumC20545715aR;
import com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger;

/* JADX INFO: loaded from: classes32.dex */
public final class STMLynxOverlayTrigger implements ISleepHourComponentTrigger {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final C19719912Dl LJIILJJIL() {
        return C13LE.LIZ(STMLynxOverlayAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final boolean LIZ() {
        C20544915aJ.LIZ.getClass();
        return C20544915aJ.LIZJ == EnumC20545715aR.LLILLL && C20544915aJ.LJ != null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final EnumC20538815Yk getKey() {
        STMLynxOverlayAssem.LLJJJJJIL.getClass();
        return STMLynxOverlayAssem.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final void prepare() {
        C20544915aJ.LIZ.getClass();
        C23250099c.LIZLLL(C20544915aJ.LIZIZ, null, null, new C20545015aK(null), 3);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final boolean LIZIZ() {
        if (!C294510BgX.LIZ()) {
            return false;
        }
        C20544915aJ.LIZ.getClass();
        return C20544915aJ.LIZLLL != null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger
    public final EnumC1500030p8b getPriority() {
        return EnumC1500030p8b.SLEEP_HOUR_LYNX_OVERLAY;
    }
}
