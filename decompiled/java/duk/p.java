package duk;

import X.C11PQ;
import X.C1701940uOG;
import X.C19475711Hn;
import X.C20012313Rx;
import X.C201955140j;
import X.InterfaceC1624670sNd;
import X.InterfaceC23050091k;
import Y.AfS185S0100000_16;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;

/* JADX INFO: loaded from: classes26.dex */
public final class p implements InterfaceC23050091k, InterfaceC1624670sNd {
    public final C11PQ<Pair<Integer, Integer>> LIZ;
    public int LIZIZ;

    public p() {
        this(0);
    }

    @Override // X.InterfaceC23050091k
    public final C19475711Hn LIZJ() {
        return new C19475711Hn(this.LIZ.LJL(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS185S0100000_16(this, 18)));
    }

    @Override // X.InterfaceC23050091k
    public final int LIZ() {
        return this.LIZIZ;
    }

    public p(int i) {
        C11PQ<Pair<Integer, Integer>> c11pqLJLLLLLL;
        if (i == 0) {
            c11pqLJLLLLLL = new C11PQ<>();
        } else {
            c11pqLJLLLLLL = C11PQ.LJLLLLLL(new Pair(0, Integer.valueOf(i)));
        }
        this.LIZ = c11pqLJLLLLLL;
        this.LIZIZ = i;
    }

    @Override // X.InterfaceC1624670sNd
    public final void LIZIZ(int i) {
        int iIntValue;
        Pair<Integer, Integer> pairLJLZ = this.LIZ.LJLZ();
        if (pairLJLZ != null) {
            iIntValue = pairLJLZ.getSecond().intValue();
        } else {
            iIntValue = 0;
        }
        if (i != iIntValue) {
            this.LIZ.onNext(new Pair<>(Integer.valueOf(iIntValue), Integer.valueOf(i)));
        } else {
            C201955140j.LIZLLL(C20012313Rx.LIZIZ, "EffectWhitelistStateManager", "updateCurrentWhitelistScene: ignored, same scene");
        }
    }

    public final Integer LIZLLL(Effect effect, Integer num) {
        int iIntValue;
        int i;
        Pair<Integer, Integer> pairLJLZ;
        if ((num == null && ((pairLJLZ = this.LIZ.LJLZ()) == null || (num = pairLJLZ.getSecond()) == null)) || (iIntValue = num.intValue()) == 0) {
            return null;
        }
        if (iIntValue != 1) {
            if (effect != null ? !LJ(effect, 2) || iIntValue != 4 : iIntValue == 2) {
                i = 2131828267;
            } else {
                i = 2131828268;
            }
            return Integer.valueOf(i);
        }
        return 2131828269;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(com.ss.android.ugc.effectmanager.effect.model.Effect r11, java.lang.Integer r12) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: duk.p.LJ(com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Integer):boolean");
    }
}
