package com.ss.android.ugc.aweme.frequency;

import X.C01GW;
import X.C04TD;
import X.C1072880e1e;
import X.C1072890e1f;
import X.C1076010e6h;
import X.C1156810gD1;
import X.C2187451AjH;
import X.C2214981Bma;
import X.C452501pT;
import X.InterfaceC1156820gD2;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.friends.service.ISocialFriendsService;
import com.ss.android.ugc.aweme.relation.frequencycenter.service.IRecUserPopFrequencyService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class RecUserPopFrequencyService implements IRecUserPopFrequencyService {
    public final Keva LIZ;
    public final C01GW LIZIZ;

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0117, code lost:
    
        if (kotlin.text.u.LJIJI("lt_4s", r3, true) == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110 A[RETURN] */
    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IRecUserPopFrequencyService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL() {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.frequency.RecUserPopFrequencyService.LIZLLL():boolean");
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IRecUserPopFrequencyService
    public final boolean LJ() {
        if (!LJII(1) && !LJII(2)) {
            return true;
        }
        int i = C2187451AjH.LIZ;
        return false;
    }

    public static IRecUserPopFrequencyService LJFF() {
        Object objLIZ = C04TD.LIZ(IRecUserPopFrequencyService.class, false);
        if (objLIZ != null) {
            return (IRecUserPopFrequencyService) objLIZ;
        }
        if (C04TD.H0 == null) {
            synchronized (IRecUserPopFrequencyService.class) {
                if (C04TD.H0 == null) {
                    C04TD.H0 = new RecUserPopFrequencyService();
                }
            }
        }
        return C04TD.H0;
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IRecUserPopFrequencyService
    public final void LIZ() {
        int i = C2187451AjH.LIZ;
        this.LIZ.storeLong("dialog_last_shown_timestamp", System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IRecUserPopFrequencyService
    public final boolean LIZIZ() {
        if (System.currentTimeMillis() >= this.LIZ.getLong("dialog_last_shown_timestamp", 0L) + TimeUnit.DAYS.toMillis(LJI().LIZ)) {
            return true;
        }
        int i = C2187451AjH.LIZ;
        return false;
    }

    public final C2214981Bma LJI() {
        return (C2214981Bma) this.LIZIZ.getValue();
    }

    public RecUserPopFrequencyService() {
        String str = C1072890e1f.LIZIZ;
        this.LIZ = C1072880e1e.LIZ().LIZ;
        this.LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(66));
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IRecUserPopFrequencyService
    public final void LIZJ(InterfaceC1156820gD2 interfaceC1156820gD2) {
        C1156810gD1 c1156810gD1 = (C1156810gD1) interfaceC1156820gD2;
        boolean z = c1156810gD1.LIZ;
        long j = c1156810gD1.LIZIZ;
        if (!z && j <= TimeUnit.SECONDS.toMillis(((Number) LJI().LJIILL.getValue()).intValue())) {
            int i = C2187451AjH.LIZ;
            int i2 = this.LIZ.getInt("dialog_close_without_action_in_times", 0) + 1;
            this.LIZ.storeInt("dialog_close_without_action_in_times", i2);
            if (i2 >= ((Number) LJI().LJIILIIL.getValue()).intValue()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (((Boolean) LJI().LIZJ.getValue()).booleanValue()) {
                    int iIntValue = ((Number) LJI().LJ.getValue()).intValue();
                    Keva keva = this.LIZ;
                    TimeUnit timeUnit = TimeUnit.DAYS;
                    keva.storeLong("dialog_close_without_action_in_times_maximum_timestamp", timeUnit.toMillis(((Number) LJI().LJIILJJIL.getValue()).intValue()) + jCurrentTimeMillis);
                    this.LIZ.storeLong("dialog_close_without_action_in_times_minimum_timestamp", timeUnit.toMillis(iIntValue) + jCurrentTimeMillis);
                } else {
                    Keva keva2 = this.LIZ;
                    TimeUnit timeUnit2 = TimeUnit.DAYS;
                    keva2.storeLong("dialog_close_without_action_in_times_maximum_timestamp", timeUnit2.toMillis(((Number) LJI().LJIILJJIL.getValue()).intValue()) + jCurrentTimeMillis);
                    this.LIZ.storeLong("dialog_close_without_action_in_times_minimum_timestamp", timeUnit2.toMillis(LJI().LJIIL) + jCurrentTimeMillis);
                }
                this.LIZ.storeLong("dialog_last_negative_feedback_timestamp", jCurrentTimeMillis);
                return;
            }
            return;
        }
        int i3 = C2187451AjH.LIZ;
        this.LIZ.storeInt("dialog_close_without_action_in_times", 0);
    }

    public final boolean LJII(int i) {
        Pair<Boolean, Long> pairLJI;
        ISocialFriendsService iSocialFriendsServiceLJIIZILJ = C1076010e6h.LIZJ.LJIIZILJ();
        if (iSocialFriendsServiceLJIIZILJ == null || (pairLJI = iSocialFriendsServiceLJIIZILJ.LJI(i)) == null || !pairLJI.getFirst().booleanValue() || System.currentTimeMillis() >= pairLJI.getSecond().longValue() + (((long) ((Number) LJI().LJIILLIIL.getValue()).intValue()) * 86400000)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ(long r11, long r13, long r15) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.frequency.RecUserPopFrequencyService.LJIIIIZZ(long, long, long):boolean");
    }
}
