package com.ss.android.ugc.aweme.relation.auth.frequency;

import X.C01GW;
import X.C1071790dzt;
import X.C1071800dzu;
import X.C1072870e1d;
import X.C1073300e2K;
import X.C1073340e2O;
import X.C1073400e2U;
import X.C1073420e2W;
import X.C1073570e2l;
import X.C1076010e6h;
import X.C1589380rSi;
import X.C1910890zpH;
import X.C1954807lC;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C452501pT;
import X.C849850XVn;
import X.EnumC1073310e2L;
import X.EnumC1073320e2M;
import X.InterfaceC1072840e1a;
import X.InterfaceC995310c0X;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.Rules;
import com.ss.android.ugc.aweme.friends.service.ISocialFriendsService;
import com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes17.dex */
public final class AuthFrequencyService implements IAuthFrequencyService {
    public final Keva LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public C1073300e2K LJ;
    public C1073300e2K LJFF;
    public int LJI;
    public long LJII;
    public final C01GW LJIIIIZZ;
    public EnumC1073310e2L LJIIIZ;

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService
    public final boolean LJ() {
        int value;
        if (!LIZLLL(1) && !LIZLLL(2)) {
            return true;
        }
        int i = C2187451AjH.LIZ;
        int i2 = C1073340e2O.LIZ[this.LJIIIZ.ordinal()];
        if (i2 == 1) {
            value = this.LJ.LIZ.getValue();
        } else if (i2 == 2) {
            value = this.LJFF.LIZ.getValue();
        } else {
            if (i2 != 3) {
                throw new C1954807lC();
            }
            value = EnumC1073320e2M.UNKNOWN.getValue();
        }
        InterfaceC1072840e1a interfaceC1072840e1aLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("phase ");
        sbLIZ.append(this.LJIIIZ.getValue());
        sbLIZ.append(", has gone through social rec auth in 7 days");
        interfaceC1072840e1aLIZIZ.LIZ(100, value, C2188811AlT.LIZIZ(sbLIZ), false);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService
    public final void LIZ() {
        ((C1910890zpH) this.LIZIZ.getValue()).LIZ("AuthFrequencyService", "update auth show time");
        C1589380rSi.LIZIZ.LIZ(false);
        this.LIZ.storeLong("last_show_contact_time", System.currentTimeMillis());
    }

    public final InterfaceC1072840e1a LIZIZ() {
        return (InterfaceC1072840e1a) this.LJIIIIZZ.getValue();
    }

    public final C1073570e2l LIZJ() {
        return (C1073570e2l) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService
    public final boolean LJI() {
        long j = this.LIZ.getLong("last_show_contact_time", 0L);
        long jMax = Math.max(this.LIZ.getLong("sync_off_contact_time", 0L), this.LIZ.getLong("sync_off_facebook_time", 0L));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j <= jMax) {
            j = jMax;
        }
        long jLongValue = jCurrentTimeMillis - j;
        int i = 0;
        while (i < ((List) ((C1073420e2W) this.LIZLLL.getValue()).LIZLLL.getValue()).size() && jLongValue > ((Number) ListProtector.get((List) ((C1073420e2W) this.LIZLLL.getValue()).LIZJ.getValue(), i)).longValue() * 86400000) {
            jLongValue -= ((Number) ListProtector.get((List) ((C1073420e2W) this.LIZLLL.getValue()).LIZJ.getValue(), i)).longValue() * 86400000;
            i++;
        }
        if (i > 0 && ((List) ListProtector.get((List) ((C1073420e2W) this.LIZLLL.getValue()).LIZLLL.getValue(), i - 1)).contains(Integer.valueOf(this.LJFF.LIZ.getValue()))) {
            return true;
        }
        int i2 = C2187451AjH.LIZ;
        LIZIZ().LIZ(100, this.LJFF.LIZ.getValue(), "phase 2, scene not match", false);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService
    public final boolean LJIIIIZZ() {
        if (this.LIZ.getInt("reask_count", 0) < ((Number) ((C1073420e2W) this.LIZLLL.getValue()).LIZIZ.getValue()).intValue()) {
            return true;
        }
        int i = C2187451AjH.LIZ;
        LIZIZ().LIZ(100, this.LJFF.LIZ.getValue(), "phase 2, more than reask count", false);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService
    public final boolean LJIIIZ() {
        int i = this.LIZ.getInt("rules_major_stage", 0);
        this.LJI = i;
        if (i < ((Number) LIZJ().LIZJ.getValue()).intValue()) {
            return true;
        }
        int i2 = C2187451AjH.LIZ;
        LIZIZ().LIZ(100, this.LJ.LIZ.getValue(), "phase 1, major stage overmuch", false);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService
    public final boolean LJIIJ() {
        Keva keva = this.LIZ;
        return (this.LIZ.getBoolean("has_go_through_process", false) || (keva.getBoolean("finish_contact_permission_process", false) && keva.getBoolean("finish_facebook_permission_process", false)) || this.LIZ.getInt("rules_major_stage", 0) >= ((Number) LIZJ().LIZJ.getValue()).intValue()) && C1073400e2U.LIZ().group != 0;
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService
    public final boolean LJIIL() {
        ISocialFriendsService iSocialFriendsServiceLJIIZILJ;
        Pair<Boolean, Long> pairLJII;
        Pair<Boolean, Long> pairLJII2;
        C849850XVn c849850XVn = C849850XVn.LIZIZ;
        if (!c849850XVn.LIZJ().LJIIL()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - (this.LIZ.getLong("last_show_contact_time", 0L) + (((long) LIZJ().LIZ()) * 86400000));
            this.LJII = jCurrentTimeMillis;
            if (jCurrentTimeMillis >= 0) {
                return true;
            }
            int i = C2187451AjH.LIZ;
            LIZIZ().LIZ(100, this.LJ.LIZ.getValue(), "phase 1, interval not ok", false);
            return false;
        }
        long jLJIIIIZZ = c849850XVn.LIZJ().LJIIIIZZ();
        long j = this.LIZ.getLong("last_show_contact_time", 0L);
        if (j == 0) {
            C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
            ISocialFriendsService iSocialFriendsServiceLJIIZILJ2 = c1076010e6h.LJIIZILJ();
            long jLIZ = ((iSocialFriendsServiceLJIIZILJ2 == null || (pairLJII2 = iSocialFriendsServiceLJIIZILJ2.LJII(1)) == null || !pairLJII2.getFirst().booleanValue()) && ((iSocialFriendsServiceLJIIZILJ = c1076010e6h.LJIIZILJ()) == null || (pairLJII = iSocialFriendsServiceLJIIZILJ.LJII(2)) == null || !pairLJII.getFirst().booleanValue())) ? LIZJ().LIZ() * 2 : LIZJ().LIZ();
            Long.signum(jLIZ);
            j = jLIZ * 86400000;
        } else {
            jLJIIIIZZ = ((long) LIZJ().LIZ()) * 86400000;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - (jLJIIIIZZ + j);
        this.LJII = jCurrentTimeMillis2;
        if (jCurrentTimeMillis2 >= 0) {
            return true;
        }
        int i2 = C2187451AjH.LIZ;
        LIZIZ().LIZ(100, this.LJ.LIZ.getValue(), "phase 1, interval not ok", false);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService
    public final void LJIILIIL() {
        int i = C2187451AjH.LIZ;
        Keva keva = this.LIZ;
        keva.storeInt("rules_major_stage", keva.getInt("rules_major_stage", 0) + 1);
        Keva keva2 = this.LIZ;
        keva2.storeInt("contact_pop_up_count", keva2.getInt("contact_pop_up_count", 0) + 1);
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService
    public final void LJIILJJIL() {
        int i = C2187451AjH.LIZ;
        Keva keva = this.LIZ;
        keva.storeInt("reask_count", keva.getInt("reask_count", 0) + 1);
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService
    public final boolean LJIILL() {
        return C849850XVn.LIZIZ.LIZJ().LJIJ();
    }

    public AuthFrequencyService() {
        String str = C1071790dzt.LIZIZ;
        this.LIZ = C1071800dzu.LIZ().LIZ;
        this.LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(334));
        this.LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(232));
        this.LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(233));
        int i = 0;
        this.LJ = new C1073300e2K(i);
        this.LJFF = new C1073300e2K(i);
        this.LJIIIIZZ = C452501pT.LIZIZ(new C1072870e1d(this));
        this.LJIIIZ = EnumC1073310e2L.UNKNOWN;
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService
    public final boolean LJFF() {
        if (LIZJ().LIZIZ().isEmpty()) {
            int i = C2187451AjH.LIZ;
            LIZIZ().LIZ(100, this.LJ.LIZ.getValue(), "phase 1, no rules", false);
            return false;
        }
        if (this.LJI >= LIZJ().LIZIZ().size()) {
            LIZIZ().LIZ(100, this.LJ.LIZ.getValue(), "phase 1, index out of bound", false);
            return false;
        }
        int iIntValue = ((Number) ListProtector.get(((Rules) ListProtector.get(LIZJ().LIZIZ(), this.LJI)).duration, 0)).intValue();
        int i2 = 0;
        while (true) {
            long j = ((long) iIntValue) * 86400000;
            if (this.LJII <= j || i2 >= ((Rules) ListProtector.get(LIZJ().LIZIZ(), this.LJI)).stage.size() - 1) {
                break;
            }
            this.LJII -= j;
            i2++;
            iIntValue = ((Number) ListProtector.get(((Rules) ListProtector.get(LIZJ().LIZIZ(), this.LJI)).duration, i2)).intValue();
        }
        if (((Number) ListProtector.get(((Rules) ListProtector.get(LIZJ().LIZIZ(), this.LJI)).stage, i2)).intValue() == this.LJ.LIZ.getValue()) {
            return true;
        }
        int i3 = C2187451AjH.LIZ;
        LIZIZ().LIZ(100, this.LJ.LIZ.getValue(), "phase 1, scene not match", false);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService
    public final int LJII() {
        return ((Number) LIZJ().LIZJ.getValue()).intValue();
    }

    public final boolean LIZLLL(int i) {
        Pair<Boolean, Long> pairLJII;
        ISocialFriendsService iSocialFriendsServiceLJIIZILJ = C1076010e6h.LIZJ.LJIIZILJ();
        if (iSocialFriendsServiceLJIIZILJ == null || (pairLJII = iSocialFriendsServiceLJIIZILJ.LJII(i)) == null || !pairLJII.getFirst().booleanValue() || System.currentTimeMillis() >= pairLJII.getSecond().longValue() + (((long) LIZJ().LIZ()) * 86400000)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService
    public final void LJIIJJI(InterfaceC995310c0X interfaceC995310c0X) {
        this.LJFF = (C1073300e2K) interfaceC995310c0X;
        this.LJIIIZ = EnumC1073310e2L.PHASE2;
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService
    public final void LJIILLIIL(InterfaceC995310c0X interfaceC995310c0X) {
        this.LJ = (C1073300e2K) interfaceC995310c0X;
        this.LJIIIZ = EnumC1073310e2L.PHASE1;
    }
}
