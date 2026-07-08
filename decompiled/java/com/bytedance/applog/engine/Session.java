package com.bytedance.applog.engine;

import X.AbstractC2209931BeR;
import X.C2188811AlT;
import X.C2209571Bdr;
import X.C2209791BeD;
import X.C2209901BeO;
import X.C2209911BeP;
import X.C2209971BeV;
import X.C2209991BeX;
import X.C2210101Bei;
import X.C2210131Bel;
import X.C2210971Bg7;
import X.C786410Ut5;
import X.C844770XBz;
import X.EnumC21646419na;
import X.EnumC2192521ArS;
import X.EnumC2210021Bea;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.applog.IBDAccountCallback;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes35.dex */
public class Session {
    public static C2210971Bg7 LJIJI;
    public volatile long LIZ;
    public volatile long LIZIZ;
    public volatile int LIZJ;
    public volatile int LIZLLL;
    public volatile int LJ;
    public final C2209911BeP LJFF;
    public C2209991BeX LJI;
    public C2209991BeX LJII;
    public String LJIIIIZZ;
    public final AtomicLong LJIIIZ = new AtomicLong(1000);
    public long LJIIJ = -1;
    public volatile boolean LJIIJJI;
    public long LJIIL;
    public int LJIILIIL;
    public String LJIILJJIL;
    public volatile String LJIILL;
    public volatile long LJIILLIIL;
    public static final List<String> LJIIZILJ = Collections.singletonList("Session");
    public static final String coldLaunchId = UUID.randomUUID().toString();
    public static final AtomicInteger sessionIndex = new AtomicInteger(0);
    public static volatile boolean LJIJ = true;

    public final synchronized void LJ() {
        this.LJFF.LLILZ.LIZIZ.getClass();
    }

    public static String LIZJ() {
        if (!LJIJ) {
            String string = UUID.randomUUID().toString();
            C2209791BeD.LJIJJ().LJIIIIZZ("Session:genSessionId: {}", string);
            return string;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(coldLaunchId);
        sbLIZ.append("#");
        sbLIZ.append(sessionIndex.getAndIncrement());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C2209791BeD.LJIJJ().LJIIIIZZ("Session:genSessionId#: {}", strLIZIZ);
        return strLIZIZ;
    }

    public static String LIZLLL() {
        return coldLaunchId;
    }

    public Session(C2209911BeP c2209911BeP) {
        this.LJFF = c2209911BeP;
        this.LJIILLIIL = c2209911BeP.LLILZ.LIZLLL.getLong("latest_forground_session_time", 0L);
    }

    public final void LIZ(AbstractC2209931BeR abstractC2209931BeR) {
        if (abstractC2209931BeR != null) {
            LIZIZ(abstractC2209931BeR, this.LIZ);
            C2209901BeO c2209901BeO = this.LJFF.LLILLL;
            abstractC2209931BeR.LLJILJILJ = c2209901BeO.LJIIIZ;
            abstractC2209931BeR.LLIZ = c2209901BeO.LJIIZILJ();
            abstractC2209931BeR.LLILZ = this.LJIIIIZZ;
            abstractC2209931BeR.LLILLL = this.LJIIIZ.incrementAndGet();
            abstractC2209931BeR.LLJ = C786410Ut5.e3(this.LJFF.LLILLL.LJIIJ).getValue();
        }
    }

    public final void LIZIZ(AbstractC2209931BeR abstractC2209931BeR, long j) {
        IBDAccountCallback iBDAccountCallback = this.LJFF.LLILLL.LJJJLIIL;
        if (this.LJFF.LLILLL.LJJI && iBDAccountCallback != null) {
            Pair<Integer, Long> odinUserInfo = iBDAccountCallback.getOdinUserInfo();
            if (((Long) odinUserInfo.second).longValue() > 0) {
                abstractC2209931BeR.LLILZIL = ((Long) odinUserInfo.second).longValue();
                abstractC2209931BeR.LLJIJIL = 1;
                abstractC2209931BeR.LLJILJIL = 1;
                abstractC2209931BeR.LLJI = ((Integer) odinUserInfo.first).intValue();
                abstractC2209931BeR.LLILZLL = ((Long) odinUserInfo.second).longValue();
            } else if (this.LIZLLL == 0) {
                abstractC2209931BeR.LLILZLL = this.LIZIZ;
                abstractC2209931BeR.LLJI = this.LIZJ;
                abstractC2209931BeR.LLJIJIL = this.LIZLLL;
                abstractC2209931BeR.LLJILJIL = this.LJ;
            }
        } else {
            abstractC2209931BeR.LLILZIL = j;
        }
        C2209901BeO c2209901BeO = this.LJFF.LLILLL;
        String.valueOf(abstractC2209931BeR.LLILZIL);
        abstractC2209931BeR.LLIZLLLIL = c2209901BeO.LLLF();
    }

    public final synchronized C2209971BeV LJFF(AbstractC2209931BeR abstractC2209931BeR, ArrayList<AbstractC2209931BeR> arrayList, boolean z) {
        long j;
        C2209971BeV c2209971BeV;
        String str;
        boolean z2;
        String strLJ;
        long jLJFF = 0;
        if (abstractC2209931BeR != null) {
            if (abstractC2209931BeR instanceof C2210971Bg7) {
                j = -1;
            } else {
                j = abstractC2209931BeR.LLILLJJLI;
            }
        } else {
            j = 0;
        }
        this.LJIIIIZZ = LIZJ();
        if (z) {
            this.LJIILLIIL = j;
            this.LJFF.LLILZ.LIZLLL.edit().putLong("latest_forground_session_time", this.LJIILLIIL).apply();
            this.LJFF.getClass();
            if (TextUtils.isEmpty(this.LJIILL)) {
                this.LJIILL = this.LJIIIIZZ;
            }
        }
        this.LJIIIZ.set(10000L);
        this.LJIIJ = j;
        this.LJIIJJI = z;
        this.LJIIL = 0L;
        if (z) {
            Calendar calendar = Calendar.getInstance();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(calendar.get(1));
            sbLIZ.append(calendar.get(2));
            sbLIZ.append(calendar.get(5));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C2209571Bdr c2209571Bdr = this.LJFF.LLILZ;
            if (TextUtils.isEmpty(this.LJIILJJIL)) {
                this.LJIILJJIL = c2209571Bdr.LIZLLL.getString("session_last_day", "");
                this.LJIILIIL = c2209571Bdr.LIZLLL.getInt("session_order", 0);
            }
            if (!strLIZIZ.equals(this.LJIILJJIL)) {
                this.LJIILJJIL = strLIZIZ;
                this.LJIILIIL = 1;
            } else {
                this.LJIILIIL++;
            }
            c2209571Bdr.LIZLLL.edit().putString("session_last_day", strLIZIZ).putInt("session_order", this.LJIILIIL).apply();
        }
        if (j != -1) {
            c2209971BeV = new C2209971BeV();
            c2209971BeV.LLJILJILJ = this.LJFF.LLILLL.LJIIIZ;
            c2209971BeV.LLILZ = this.LJIIIIZZ;
            if (!this.LJIIJJI) {
                z2 = true;
            } else {
                z2 = false;
            }
            c2209971BeV.LLJJLIIIJLLLLLLLZ = z2;
            c2209971BeV.LLILLL = this.LJIIIZ.incrementAndGet();
            c2209971BeV.LJIIL(this.LJIIJ);
            C844770XBz c844770XBz = ((C2210131Bel) this.LJFF.LLIZLLLIL.LIZ).LIZIZ;
            if (c844770XBz != null) {
                strLJ = c844770XBz.LJ();
            } else {
                strLJ = "";
            }
            c2209971BeV.LLJJL = strLJ;
            C844770XBz c844770XBz2 = ((C2210131Bel) this.LJFF.LLIZLLLIL.LIZ).LIZIZ;
            if (c844770XBz2 != null) {
                jLJFF = c844770XBz2.LJFF();
            }
            c2209971BeV.LLJJJJLIIL = jLJFF;
            LIZIZ(c2209971BeV, this.LIZ);
            c2209971BeV.LLIZ = this.LJFF.LLILLL.LJIIZILJ();
            c2209971BeV.LLJJIJIIJIL = C2210101Bei.LIZ(this.LJFF.LLILLL.LJJJJLI, c2209971BeV);
            if (abstractC2209931BeR instanceof C2209991BeX) {
                c2209971BeV.LLJLIL = ((C2209991BeX) abstractC2209931BeR).LLJLILLLLZIIL;
            }
            if (this.LJFF.LLILLL.LJJIIZ && this.LJFF.LLILLL.LLLI() != null && this.LJFF.LLILLL.LLLI().LJFF(EnumC2192521ArS.Launch.value())) {
                this.LJFF.LLILLL.LLLI().LJI(c2209971BeV.LLILLJJLI, this.LJIIIIZZ, c2209971BeV.LLJLIL, this.LJIIJJI);
                c2209971BeV.LLJLILLLLZIIL = false;
                this.LJFF.LLILLL.LJJJJLI.LIZ(1, "priority_launch_sent");
            }
            arrayList.add(c2209971BeV);
            if (c2209971BeV.LLJJIJIIJIL > 0) {
                C2210101Bei.LIZIZ(this.LJFF.LLILLL.LJJJJLI, EnumC21646419na.COLLECTED, c2209971BeV);
            }
            this.LJFF.LLILLL.LJJJJLI.LIZIZ(EnumC2210021Bea.COLLECT_LAUNCH_COUNT, 1);
            if (this.LJIIJJI) {
                this.LJFF.LLILLL.LJJJJLI.LIZIZ(EnumC2210021Bea.COLLECT_FRONT_LAUNCH_COUNT, 1);
            }
            this.LJFF.LLILLL.LJJJLL.LIZ(c2209971BeV.LLILLJJLI, c2209971BeV.LLILZ, c2209971BeV.LLJJLIIIJLLLLLLLZ);
        } else {
            c2209971BeV = null;
        }
        C2209901BeO c2209901BeO = this.LJFF.LLILLL;
        if (c2209901BeO.LJIIIIZZ <= 0) {
            c2209901BeO.LJIIIIZZ = 6;
        }
        C2209791BeD c2209791BeD = c2209901BeO.LJJZZI;
        List<String> list = LJIIZILJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("startSession, ");
        if (this.LJIIJJI) {
            str = "fg";
        } else {
            str = "bg";
        }
        sbLIZ2.append(str);
        sbLIZ2.append(", ");
        sbLIZ2.append(this.LJIIIIZZ);
        sbLIZ2.append(", ");
        sbLIZ2.append(j);
        c2209791BeD.LJFF(0, list, C2188811AlT.LIZIZ(sbLIZ2), new Object[0]);
        return c2209971BeV;
    }
}
