package com.ss.android.ugc.aweme.search.general;

import X.AbstractC1386130mAt;
import X.C0Q3E;
import X.C0QGA;
import X.C0QGC;
import X.C0QGF;
import X.C13LP;
import X.C2188811AlT;
import X.C255840A0w;
import X.C650560PfS;
import X.C663990Q2r;
import X.C664450Q4l;
import X.C666110QAv;
import X.C802400Vdm;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class GeneralExperienceServiceImpl implements IGeneralExperienceService {
    public static final boolean LJIIIIZZ = C650560PfS.LIZ;
    public int LJFF;
    public final AtomicInteger LIZ = new AtomicInteger(0);
    public volatile String LIZIZ = "";
    public volatile String LIZJ = "";
    public String LIZLLL = "";
    public final AtomicInteger LJ = new AtomicInteger(0);
    public final List<Integer> LJI = new ArrayList();
    public final Object LJII = new Object();

    @Override // com.ss.android.ugc.aweme.search.general.IGeneralExperienceService
    public final C0QGC getSessionInfo() {
        C0QGC c0qgc = new C0QGC(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ.get(), this.LJFF);
        if (LJIIIIZZ) {
            c0qgc.LJFF = C13LP.LJJLIIIJ(this.LJI, ",", null, null, 0, null, null, 62);
        }
        return c0qgc;
    }

    @Override // com.ss.android.ugc.aweme.search.general.IGeneralExperienceService
    public final void LJIIIIZZ() {
        if (C255840A0w.LIZ()) {
            LIZIZ(100);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.general.IGeneralExperienceService
    public final void LIZ(String str) {
        if (C255840A0w.LIZ() && this.LIZ.decrementAndGet() <= 0) {
            synchronized (this.LJII) {
                try {
                    this.LIZIZ = "";
                    this.LIZJ = "";
                    this.LIZLLL = "";
                    this.LJ.set(0);
                    this.LJFF = 0;
                    ((ArrayList) this.LJI).clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            ((ConcurrentHashMap) C664450Q4l.LIZ).clear();
            C802400Vdm.LIZLLL("search_session_id");
            C802400Vdm.LIZLLL("search_id");
        }
    }

    public final void LIZIZ(int i) {
        synchronized (this.LJII) {
            try {
                this.LJ.incrementAndGet();
                this.LIZLLL = "";
                this.LJFF = i;
                ((ArrayList) this.LJI).add(Integer.valueOf(i));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.general.IGeneralExperienceService
    public final void LJFF(String str) {
        if (str != null && !Intrinsics.LJFF(this.LIZJ, str)) {
            this.LIZJ = str;
            Npth.addImportTag("search_id", str);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.general.IGeneralExperienceService
    public final boolean LJI(int i) {
        if (!C255840A0w.LIZ() || this.LJFF == i) {
            return false;
        }
        LIZIZ(i);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.general.IGeneralExperienceService
    public final void LJII(C666110QAv c666110QAv) {
        if (!C255840A0w.LIZ()) {
            return;
        }
        C0QGA c0qga = new C0QGA();
        c0qga.LIZ(c666110QAv.LIZ, c666110QAv.LIZIZ);
        c0qga.LJIIJ = c666110QAv.LJII;
        c0qga.LJIIIIZZ = c666110QAv.LIZLLL;
        String str = c666110QAv.LJ;
        if (!(!a0.LJJJIL(str)) || str == null) {
            str = ((C663990Q2r) C0Q3E.LJI().Ww1().LIZJ()).LL;
        }
        c0qga.LJIIIZ = str;
        Map<String, ? extends Object> map = c666110QAv.LJFF;
        if (map != null) {
            c0qga.LJIIL = map;
        }
        Map<String, String> map2 = c666110QAv.LJI;
        if (map2 != null) {
            c0qga.LIZIZ(map2);
        }
        C0QGC sessionInfo = c666110QAv.LIZJ;
        if (sessionInfo == null) {
            sessionInfo = getSessionInfo();
        }
        c0qga.LIZJ = sessionInfo.LIZ;
        c0qga.LJ = sessionInfo.LIZIZ;
        c0qga.LIZLLL = Integer.valueOf(sessionInfo.LJ);
        c0qga.LJFF = sessionInfo.LIZJ;
        c0qga.LJI = sessionInfo.LIZLLL;
        c0qga.LJII = sessionInfo.LJFF;
        c0qga.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.search.general.IGeneralExperienceService
    public final void LJIIIZ(final String str) {
        if (!C255840A0w.LIZ() || str.length() == 0) {
            return;
        }
        if (Intrinsics.LJFF(this.LIZIZ, str)) {
            int iIncrementAndGet = this.LIZ.incrementAndGet();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init search session and sessionId is same, sessionId: ");
            sbLIZ.append(str);
            sbLIZ.append(", count: ");
            sbLIZ.append(iIncrementAndGet);
            sbLIZ.append('.');
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        synchronized (this.LJII) {
            try {
                this.LIZIZ = str;
                this.LJ.set(0);
                this.LJFF = 0;
                ((ArrayList) this.LJI).clear();
                this.LIZ.set(1);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        new AbstractC1386130mAt<C0QGF>(str) { // from class: X.0QGF
            public final String LJIILLIIL;
            public final String LJIIZILJ;
            public final long LJIJ;
            public final C01GW LJIJI;

            @Override // X.AbstractC1386130mAt
            public final void LJIIIIZZ() {
                LJ("search_session_id", this.LJIILLIIL);
                if (this.LJIIZILJ.length() > 0) {
                    LJ("enter_from", this.LJIIZILJ);
                }
                ((HashMap) this.LJIILJJIL).put("timestamp", Long.valueOf(this.LJIJ));
                if (((JSONObject) this.LJIJI.getValue()).length() > 0) {
                    ((HashMap) this.LJIILJJIL).put("extra", this.LJIJI.getValue());
                }
            }

            {
                super("search_general_session_event");
                this.LJIILLIIL = str;
                this.LJIIZILJ = "";
                this.LJIJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(365));
                this.LJIJ = System.currentTimeMillis();
                this.LJI = true;
            }
        }.LJIILJJIL();
        Npth.addImportTag("search_session_id", this.LIZIZ);
    }
}
