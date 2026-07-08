package com.ss.android.ugc.aweme.relation.auth.frequency;

import X.C01GW;
import X.C04TD;
import X.C1071790dzt;
import X.C1071800dzu;
import X.C1073430e2X;
import X.C1910890zpH;
import X.C2452109jD;
import X.C452501pT;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.relation.frequencycenter.service.IEmailFrequencyService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes17.dex */
public final class EmailFrequencyService implements IEmailFrequencyService {
    public final Keva LIZ;
    public final Keva LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;

    public static IEmailFrequencyService LJ() {
        Object objLIZ = C04TD.LIZ(IEmailFrequencyService.class, false);
        if (objLIZ != null) {
            return (IEmailFrequencyService) objLIZ;
        }
        if (C04TD.r3 == null) {
            synchronized (IEmailFrequencyService.class) {
                if (C04TD.r3 == null) {
                    C04TD.r3 = new EmailFrequencyService();
                }
            }
        }
        return C04TD.r3;
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IEmailFrequencyService
    public final void LIZ() {
        ((C1910890zpH) this.LIZJ.getValue()).LIZ("EmailFrequencyService", "update show time");
        this.LIZ.storeLong("last_show_email_dialog_time", System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IEmailFrequencyService
    public final boolean LIZJ() {
        if (this.LIZ.getInt("email_dialog_show_times", 0) < ((C1073430e2X) this.LIZLLL.getValue()).LIZJ) {
            return true;
        }
        ((C1910890zpH) this.LIZJ.getValue()).LIZ("EmailFrequencyService", "exceed max show count");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IEmailFrequencyService
    public final void LIZLLL() {
        ((C1910890zpH) this.LIZJ.getValue()).LIZ("EmailFrequencyService", "update show count");
        Keva keva = this.LIZ;
        C2452109jD.LIZ.getClass();
        keva.storeInt("email_dialog_show_times", C2452109jD.LIZLLL.getInt("email_dialog_show_times", 0) + 1);
    }

    public EmailFrequencyService() {
        C2452109jD.LIZ.getClass();
        this.LIZ = C2452109jD.LIZLLL;
        String str = C1071790dzt.LIZIZ;
        this.LIZIZ = C1071800dzu.LIZ().LIZ;
        this.LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(335));
        this.LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(234));
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IEmailFrequencyService
    public final boolean LIZIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LIZ.getLong("last_show_email_dialog_time", 0L);
        if (j != 0 && jCurrentTimeMillis - j < TimeUnit.DAYS.toMillis(((C1073430e2X) this.LIZLLL.getValue()).LIZ)) {
            ((C1910890zpH) this.LIZJ.getValue()).LIZ("EmailFrequencyService", "email time interval not enough");
            return false;
        }
        long j2 = jCurrentTimeMillis - this.LIZIZ.getLong("last_show_contact_time", 0L);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        if (j2 > timeUnit.toMillis(((C1073430e2X) this.LIZLLL.getValue()).LIZIZ) && jCurrentTimeMillis - this.LIZIZ.getLong("contact_did_pop_up_time", 0L) > timeUnit.toMillis(((C1073430e2X) this.LIZLLL.getValue()).LIZIZ)) {
            return true;
        }
        ((C1910890zpH) this.LIZJ.getValue()).LIZ("EmailFrequencyService", "auth time interval not enough");
        return false;
    }
}
