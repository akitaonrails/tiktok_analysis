package com.ss.android.ugc.aweme.im.service.impl;

import X.C01GW;
import X.C0R00;
import X.C1509305vX;
import X.C1702930uPr;
import X.C1A1S;
import X.C1A2Y;
import X.C1A2Z;
import X.C2172861A2a;
import X.C2172871A2b;
import X.EnumC1154930g9z;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository;
import com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService;
import com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva;
import com.ss.android.ugc.aweme.network.INetwork;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public final class EncourageMufServiceImpl implements IIMEncourageMufService {
    public final Function0<C1A2Z> LIZ;
    public final Function0<INetwork> LIZIZ;
    public final Function0<Long> LIZJ;
    public final C01GW LIZLLL;

    public EncourageMufServiceImpl() {
        this(null);
    }

    public EncourageMufServiceImpl(Object obj) {
        C2172871A2b c2172871A2b = new C2172871A2b();
        C1702930uPr c1702930uPr = new C1702930uPr();
        C0R00 c0r00 = new C0R00(c1702930uPr);
        this.LIZ = c2172871A2b;
        this.LIZIZ = c1702930uPr;
        this.LIZJ = c0r00;
        this.LIZLLL = C1509305vX.LIZ(new C2172861A2a(this));
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
    public final boolean LIZ(String str) {
        if (((IShareStatusKeva) ServiceManager.get().getService(IShareStatusKeva.class)).LIZJ(str) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
    public final void LIZIZ(String str) {
        ((C1A2Z) this.LIZLLL.getValue()).LIZ().LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
    public final void LIZJ(C1A1S c1a1s) {
        EnumC1154930g9z enumC1154930g9z;
        boolean z = true;
        if ((c1a1s.LIZ == 0 && c1a1s.LIZIZ == 0 && c1a1s.LIZJ == 0) || (enumC1154930g9z = c1a1s.LIZLLL) == null) {
            return;
        }
        C1A2Y c1a2yLIZIZ = ((C1A2Z) this.LIZLLL.getValue()).LIZIZ(enumC1154930g9z);
        boolean z2 = !LJIIIIZZ(c1a2yLIZIZ.LIZ(), this.LIZJ.invoke().longValue());
        if (c1a2yLIZIZ.LIZIZ() < c1a1s.LIZIZ) {
            z = false;
        }
        c1a2yLIZIZ.LJ(z2);
        c1a2yLIZIZ.LJFF(z);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
    public final List<String> LIZLLL(int i) {
        return MufAffinityScoreRepository.LJIIIIZZ.getValue().LIZLLL(i, true);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
    public final boolean LJ(String str) {
        return ((C1A2Z) this.LIZLLL.getValue()).LIZ().LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
    public final boolean LJFF(C1A1S c1a1s) {
        boolean z;
        boolean z2;
        boolean z3;
        if (c1a1s.LIZ == 0 && c1a1s.LIZIZ == 0 && c1a1s.LIZJ == 0) {
            return true;
        }
        long jLongValue = this.LIZJ.invoke().longValue();
        EnumC1154930g9z enumC1154930g9z = c1a1s.LIZLLL;
        if (enumC1154930g9z == null) {
            return false;
        }
        C1A2Y c1a2yLIZIZ = ((C1A2Z) this.LIZLLL.getValue()).LIZIZ(enumC1154930g9z);
        int i = c1a1s.LIZIZ;
        if (c1a2yLIZIZ.LIZIZ() >= i) {
            z = true;
        } else {
            z = false;
        }
        long jLIZ = c1a2yLIZIZ.LIZ();
        if (jLongValue >= TimeUnit.DAYS.toMillis(c1a1s.LIZ) + jLIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i > 0 && (!z || z2)) {
            int i2 = c1a1s.LIZJ;
            if (c1a2yLIZIZ.LIZLLL() >= i2) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = !LJIIIIZZ(jLIZ, jLongValue);
            if (i2 > 0) {
                if (!z3 || z4) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
    public final void LJI(C1A1S c1a1s) {
        EnumC1154930g9z enumC1154930g9z;
        if ((c1a1s.LIZ == 0 && c1a1s.LIZIZ == 0 && c1a1s.LIZJ == 0) || (enumC1154930g9z = c1a1s.LIZLLL) == null) {
            return;
        }
        C1A2Y c1a2yLIZIZ = ((C1A2Z) this.LIZLLL.getValue()).LIZIZ(enumC1154930g9z);
        if (!LJIIIIZZ(c1a2yLIZIZ.LIZ(), this.LIZJ.invoke().longValue())) {
            c1a2yLIZIZ.LJI();
        }
        c1a2yLIZIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMEncourageMufService
    public final int LJII(String str) {
        int iLIZJ = MufAffinityScoreRepository.LIZJ(MufAffinityScoreRepository.LJIIIIZZ.getValue(), str);
        if (iLIZJ == -1) {
            return iLIZJ;
        }
        return iLIZJ + 1;
    }

    public static boolean LJIIIIZZ(long j, long j2) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(j2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        long timeInMillis2 = calendar.getTimeInMillis();
        if (timeInMillis > j || j > timeInMillis2) {
            return false;
        }
        return true;
    }
}
