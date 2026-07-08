package com.ss.android.ugc.aweme.frequency;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C04TD;
import X.C0PEM;
import X.C0XQ7;
import X.C1157730gEV;
import X.C1261890iwV;
import X.C13LQ;
import X.C1778910wOP;
import X.C1952707kr;
import X.C19990113Jj;
import X.C19990313Jl;
import X.C1A91;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C323670CmT;
import X.C452501pT;
import X.C817503Hh;
import X.C995300c0W;
import X.EnumC19990213Jk;
import X.InterfaceC1156820gD2;
import X.InterfaceC995310c0X;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.frequencycenter.service.IBigCardFrequencyService;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class BigCardFrequencyService implements IBigCardFrequencyService {
    public final Keva LIZ;
    public final Keva LIZIZ;
    public final Keva LIZJ;
    public final C01GW LIZLLL;
    public C995300c0W LJ;
    public C995300c0W LJFF;

    public static IBigCardFrequencyService LIZ() {
        Object objLIZ = C04TD.LIZ(IBigCardFrequencyService.class, false);
        if (objLIZ != null) {
            return (IBigCardFrequencyService) objLIZ;
        }
        if (C04TD.G0 == null) {
            synchronized (IBigCardFrequencyService.class) {
                if (C04TD.G0 == null) {
                    C04TD.G0 = new BigCardFrequencyService();
                }
            }
        }
        return C04TD.G0;
    }

    public final C1A91 LIZIZ() {
        return (C1A91) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IBigCardFrequencyService
    public final void LJ() {
        this.LIZIZ.storeLong("timestamp_of_card_impression", System.currentTimeMillis());
        LJIILL("homepage_friends");
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IBigCardFrequencyService
    public final void LJII() {
        this.LIZ.storeInt("count_of_card_impression", this.LIZ.getInt("count_of_card_impression", 0) + 1);
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IBigCardFrequencyService
    public final void LJIIJJI() {
        this.LIZ.storeLong("timestamp_of_card_impression", System.currentTimeMillis());
        LJIILL("homepage_hot");
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IBigCardFrequencyService
    public final void LJIIL() {
        this.LIZIZ.storeInt("count_of_card_impression", this.LIZIZ.getInt("count_of_card_impression", 0) + 1);
    }

    public BigCardFrequencyService() {
        C1952707kr.LIZ.getClass();
        this.LIZ = C1952707kr.LIZ();
        new Object() { // from class: X.1A90
        }.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert_rec_user_card_into_friends_tab_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        this.LIZIZ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        C323670CmT.LIZ.getClass();
        this.LIZJ = C323670CmT.LIZ();
        this.LIZLLL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(319));
        this.LJ = new C995300c0W(null);
        this.LJFF = new C995300c0W(null);
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IBigCardFrequencyService
    public final boolean LIZLLL() {
        if (!LIZIZ().LIZ()) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LIZJ.getLong("timestamp_of_passive_reaction", 0L);
        TimeUnit timeUnit = TimeUnit.DAYS;
        boolean z = jCurrentTimeMillis >= timeUnit.toMillis(((Number) LIZIZ().LIZJ.getValue()).longValue()) + j;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lastBigCardPassiveReactionMs = ");
        sbLIZ.append(j);
        sbLIZ.append(", passiveReactionCooldownTime = ");
        sbLIZ.append(((Number) LIZIZ().LIZJ.getValue()).longValue());
        sbLIZ.append(", curTimeMs = ");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", exceedBigCardPassiveReactionTimeLimit = ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZJ.getBoolean("passive_reaction_record", false) && !z) {
            return false;
        }
        this.LIZJ.storeBoolean("passive_reaction_record", false);
        long j2 = this.LIZJ.getLong("timestamp_of_long_press_dislike", 0L);
        boolean z2 = jCurrentTimeMillis >= timeUnit.toMillis(((Number) LIZIZ().LIZLLL.getValue()).longValue()) + j2;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("lastBigCardLongPressDislikeMs = ");
        sbLIZ2.append(j2);
        sbLIZ2.append(", longPressDislikeCoolDownTime = ");
        sbLIZ2.append(((Number) LIZIZ().LIZLLL.getValue()).longValue());
        sbLIZ2.append(", curTimeMs = ");
        sbLIZ2.append(jCurrentTimeMillis);
        sbLIZ2.append(", exceedBigCardLongPressDislikeTimeLimit = ");
        sbLIZ2.append(z2);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (this.LIZJ.getBoolean("long_press_dislike_record", false) && !z2) {
            return false;
        }
        this.LIZJ.storeBoolean("long_press_dislike_record", false);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IBigCardFrequencyService
    public final boolean LJI() {
        Pair pair;
        Object next;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LIZ.getLong("timestamp_of_maf_video_impression", 0L);
        if (!((Boolean) LIZIZ().LJFF.getValue()).booleanValue() && jCurrentTimeMillis < TimeUnit.DAYS.toMillis(((Number) LIZIZ().LJIIIZ.getValue()).intValue()) + j) {
            int i = C2187451AjH.LIZ;
            return false;
        }
        if (!((Boolean) LIZIZ().LJFF.getValue()).booleanValue() && !LJIILJJIL("homepage_friends") && !LJIILJJIL("homepage_follow")) {
            int i2 = C2187451AjH.LIZ;
            return false;
        }
        User user = this.LJ.LIZ;
        int friendCount = user != null ? user.getFriendCount() : 0;
        long j2 = this.LIZ.getLong("timestamp_of_card_impression", 0L);
        if (LIZIZ().LIZ()) {
            int[] iArr = (int[]) LIZIZ().LJIILIIL.getValue();
            int[] iArr2 = (int[]) LIZIZ().LJIILJJIL.getValue();
            if (iArr.length != iArr2.length) {
                pair = new Pair(0, 0);
            } else {
                Iterator it2 = ((ArrayList) C13LQ.LJLIL(iArr, iArr2)).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (friendCount <= ((Number) ((Pair) next).getSecond()).intValue()) {
                        break;
                    }
                }
                Pair pair2 = (Pair) next;
                pair = pair2 != null ? new Pair(pair2.getFirst(), 1) : new Pair(0, 0);
            }
        } else {
            pair = friendCount <= 5 ? new Pair(Integer.valueOf(((Number) LIZIZ().LJII.getValue()).intValue()), Integer.valueOf(((Number) LIZIZ().LJIIIIZZ.getValue()).intValue())) : friendCount <= 60 ? new Pair(Integer.valueOf(((Number) LIZIZ().LJIIIZ.getValue()).intValue()), Integer.valueOf(((Number) LIZIZ().LJIIJ.getValue()).intValue())) : new Pair(Integer.valueOf(((Number) LIZIZ().LJIIJJI.getValue()).intValue()), Integer.valueOf(((Number) LIZIZ().LJIIL.getValue()).intValue()));
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        boolean z = jCurrentTimeMillis >= TimeUnit.DAYS.toMillis((long) iIntValue) + j2;
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FYP, lastBigCardImpressionMs = ");
        sbLIZ.append(j2);
        sbLIZ.append(", interval = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", curTimeMs = ");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", exceedBigCardTimeLimit = ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            this.LIZ.storeInt("count_of_card_impression", 0);
            return true;
        }
        if (((Boolean) LIZIZ().LIZ.getValue()).booleanValue()) {
            int i4 = this.LIZ.getInt("count_of_card_impression", 0);
            boolean z2 = i4 >= iIntValue2;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("FYP, bigCardImpressionCount = ");
            sbLIZ2.append(i4);
            sbLIZ2.append(", count = ");
            sbLIZ2.append(iIntValue2);
            sbLIZ2.append(", exceedBigCardImpressionCount = ");
            sbLIZ2.append(z2);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (!z2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IBigCardFrequencyService
    public final boolean LJIIIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        User user = this.LJFF.LIZ;
        return jCurrentTimeMillis > TimeUnit.SECONDS.toMillis(user != null ? user.getRegisterTime() : 0L) + TimeUnit.DAYS.toMillis(((Number) LIZIZ().LJI.getValue()).longValue());
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IBigCardFrequencyService
    public final boolean LJIIJ() {
        Pair pair;
        Object next;
        if (!((Boolean) LIZIZ().LJFF.getValue()).booleanValue() && !LJIILJJIL("homepage_hot")) {
            int i = C2187451AjH.LIZ;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        User user = this.LJFF.LIZ;
        int friendCount = user != null ? user.getFriendCount() : 0;
        long j = this.LIZIZ.getLong("timestamp_of_card_impression", 0L);
        if (LIZIZ().LIZ()) {
            int[] iArr = (int[]) LIZIZ().LJIJJLI.getValue();
            int[] iArr2 = (int[]) LIZIZ().LJIL.getValue();
            if (iArr.length != iArr2.length) {
                pair = new Pair(0, 0);
            } else {
                Iterator it2 = ((ArrayList) C13LQ.LJLIL(iArr, iArr2)).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (friendCount <= ((Number) ((Pair) next).getSecond()).intValue()) {
                        break;
                    }
                }
                Pair pair2 = (Pair) next;
                pair = pair2 != null ? new Pair(pair2.getFirst(), 1) : new Pair(0, 0);
            }
        } else {
            pair = friendCount <= 5 ? new Pair(Integer.valueOf(((Number) LIZIZ().LJIILL.getValue()).intValue()), Integer.valueOf(((Number) LIZIZ().LJIILLIIL.getValue()).intValue())) : friendCount <= 60 ? new Pair(Integer.valueOf(((Number) LIZIZ().LJIIZILJ.getValue()).intValue()), Integer.valueOf(((Number) LIZIZ().LJIJ.getValue()).intValue())) : new Pair(Integer.valueOf(((Number) LIZIZ().LJIJI.getValue()).intValue()), Integer.valueOf(((Number) LIZIZ().LJIJJ.getValue()).intValue()));
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        boolean z = jCurrentTimeMillis >= TimeUnit.DAYS.toMillis((long) iIntValue) + j;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Friends Feed, lastBigCardImpressionMs = ");
        sbLIZ.append(j);
        sbLIZ.append(", interval = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", curTimeMs = ");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", exceedBigCardTimeLimit = ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            this.LIZIZ.storeInt("count_of_card_impression", 0);
            return true;
        }
        if (((Boolean) LIZIZ().LIZ.getValue()).booleanValue()) {
            int i3 = this.LIZIZ.getInt("count_of_card_impression", 0);
            boolean z2 = i3 >= iIntValue2;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Friends Feed, bigCardImpressionCount = ");
            sbLIZ2.append(i3);
            sbLIZ2.append(", count = ");
            sbLIZ2.append(iIntValue2);
            sbLIZ2.append(", exceedBigCardImpressionCount = ");
            sbLIZ2.append(z2);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (!z2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IBigCardFrequencyService
    public final boolean LJIILIIL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        User user = this.LJ.LIZ;
        return jCurrentTimeMillis > TimeUnit.SECONDS.toMillis(user != null ? user.getRegisterTime() : 0L) + TimeUnit.DAYS.toMillis(((Number) LIZIZ().LJI.getValue()).longValue());
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IBigCardFrequencyService
    public final void LIZJ(InterfaceC1156820gD2 interfaceC1156820gD2) {
        C1157730gEV c1157730gEV = (C1157730gEV) interfaceC1156820gD2;
        int i = C1778910wOP.LIZ[c1157730gEV.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (LIZIZ().LIZ()) {
                    this.LIZJ.storeBoolean("long_press_dislike_record", true);
                    this.LIZJ.storeLong("timestamp_of_long_press_dislike", System.currentTimeMillis());
                    return;
                } else {
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1261890iwV(null), 2);
                    return;
                }
            }
            return;
        }
        if (c1157730gEV.LIZIZ) {
            int i2 = this.LIZJ.getInt("negative_action_times", 0) + 1;
            if (i2 >= ((Number) LIZIZ().LJ.getValue()).intValue()) {
                if (LIZIZ().LIZ()) {
                    this.LIZJ.storeBoolean("passive_reaction_record", true);
                    this.LIZJ.storeLong("timestamp_of_passive_reaction", System.currentTimeMillis());
                } else {
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1261890iwV(null), 2);
                }
                this.LIZJ.storeInt("negative_action_times", 0);
                return;
            }
            this.LIZJ.storeInt("negative_action_times", i2);
            return;
        }
        this.LIZJ.storeInt("negative_action_times", 0);
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IBigCardFrequencyService
    public final void LJFF(InterfaceC995310c0X interfaceC995310c0X) {
        this.LJFF = (C995300c0W) interfaceC995310c0X;
    }

    @Override // com.ss.android.ugc.aweme.relation.frequencycenter.service.IBigCardFrequencyService
    public final void LJIIIIZZ(InterfaceC995310c0X interfaceC995310c0X) {
        this.LJ = (C995300c0W) interfaceC995310c0X;
    }

    public final boolean LJIILJJIL(String str) {
        Keva keva = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timestamp_of_update_insert_status");
        sbLIZ.append(str);
        if (System.currentTimeMillis() >= TimeUnit.SECONDS.toMillis(keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L))) {
            return true;
        }
        return false;
    }

    public final void LJIILL(String str) {
        Keva keva = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timestamp_of_update_insert_status");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long jLJIIJJI = C19990113Jj.LJIIJJI(C19990313Jl.LJII(1, EnumC19990213Jk.DAYS));
        keva.storeLong(strLIZIZ, ((((long) 1) * jLJIIJJI) + jCurrentTimeMillis) - ((jCurrentTimeMillis + ((long) Calendar.getInstance().getTimeZone().getRawOffset())) % jLJIIJJI));
    }
}
