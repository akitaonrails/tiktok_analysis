package com.ss.android.ugc.aweme.minis.page.monitor;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C01GW;
import X.C08S3;
import X.C0NQ2;
import X.C0NQ4;
import X.C0NQ5;
import X.C0NQ9;
import X.C0NQD;
import X.C0PEM;
import X.C0QSJ;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1DEV;
import X.C1DFB;
import X.C2097608Jq;
import X.C2191201ApK;
import X.C2195221Avo;
import X.C2196361Axe;
import X.C2196371Axf;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1324510kZV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import X.InterfaceC665370Q7z;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.page.main.scope.MinisMainScope;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public final class MinisFpsMonitorAssem extends AbstractC738140SxQ implements IMinisTimingProtocol, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public boolean LL;
    public boolean LLILLL;
    public boolean LLILZ;
    public AnonymousClass0956 LLILZIL;
    public boolean LLIZ;
    public volatile InterfaceC1324510kZV LLIZLLLIL;
    public InterfaceC665370Q7z LLJ;
    public C0QSJ LLJI;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(213));
    public final C1DEV LLILZLL = C2191201ApK.LIZ();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MinisFpsMonitorAssem.class, "coreAbility", "getCoreAbility()Lcom/ss/android/ugc/aweme/minis/page/main/ability/MinisCoreAbility;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void LJJJJZI() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void LJLLLLLL() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void Xm0() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void Ym1() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MinisMainScope.class});
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final InterfaceC1324510kZV m268do() {
        InterfaceC1324510kZV interfaceC1324510kZV = this.LLIZLLLIL;
        if (interfaceC1324510kZV == null) {
            synchronized (this) {
                interfaceC1324510kZV = this.LLIZLLLIL;
                if (interfaceC1324510kZV == null) {
                    InterfaceC1324510kZV interfaceC1324510kZVBo = bo();
                    this.LLIZLLLIL = interfaceC1324510kZVBo;
                    return interfaceC1324510kZVBo;
                }
            }
        }
        return interfaceC1324510kZV;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MinisMainScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void pw1() {
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void sZ1() {
        this.LL = true;
        boolean z = this.LLILZ;
        ko(z ? 120 : 30, !z);
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void wB0() {
        this.LL = false;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0NQ4(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.minis.page.monitor.IMinisTimingProtocol
    public final void zd0() {
    }

    public final InterfaceC1324510kZV bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJI;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJ;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJ = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MinisMainScope.class});
            this.LLJI = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1324510kZV interfaceC1324510kZV = (InterfaceC1324510kZV) c0qsjLIZLLL.getAbility(InterfaceC1324510kZV.class);
        C687700QyG.LJ(interfaceC1324510kZV, InterfaceC1324510kZV.class);
        return interfaceC1324510kZV;
    }

    public final ConcurrentLinkedQueue<C0NQD> fo() {
        return (ConcurrentLinkedQueue) this.LLILLJJLI.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IMinisTimingProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LLIZ = false;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0NQ2(this, null), 3);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        this.LLIZ = true;
        boolean z = this.LLILZ;
        ko(z ? 120 : 30, !z);
    }

    public final void ho(boolean z) {
        Object obj;
        float f = 0.0f;
        float f2 = 0.0f;
        for (C0NQD c0nqd : fo()) {
            f += c0nqd.LIZ;
            f2 += c0nqd.LIZIZ;
        }
        fo().clear();
        C08S3 c08s3 = C08S3.LIZ;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("fps", String.valueOf(f / fo().size()));
        pairArr[1] = new Pair("game_stutter", String.valueOf(f2 / fo().size()));
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_first_time", obj);
        SchemaParserData schemaParserDataCl = m268do().Cl();
        if (schemaParserDataCl == null || !Intrinsics.LJFF(schemaParserDataCl.isNativeGame, Boolean.TRUE)) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("is_native_game", str);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        SchemaParserData schemaParserDataCl2 = m268do().Cl();
        if (schemaParserDataCl2 != null) {
            mapLJIIJ.putAll(schemaParserDataCl2.LIZLLL());
        }
        C2196371Axf c2196371Axf = C2195221Avo.LJIIIZ;
        if (c2196371Axf != null) {
            JSONArray jSONArray = C2196361Axe.LIZ;
            mapLJIIJ.put("load_type", C2196361Axe.LIZ(c2196371Axf));
        }
        c08s3.getClass();
        C08S3.LIZJ("tm_runtime_perf", mapLJIIJ);
        this.LLILZ = true;
        if (z) {
            ko(120, false);
        }
    }

    public final void ko(int i, boolean z) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0NQ5(this, i, z, null), 3);
    }

    public static AnonymousClass0956 lo(MinisFpsMonitorAssem minisFpsMonitorAssem, InterfaceC497601wk interfaceC497601wk, int i, boolean z) {
        C1DFB c1dfb = C0PEM.LIZJ;
        if (!minisFpsMonitorAssem.LLIZ && !minisFpsMonitorAssem.LL) {
            return null;
        }
        if (i > 0) {
            minisFpsMonitorAssem.LLILLL = z;
            return C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0NQ9(minisFpsMonitorAssem, 1000L, c1dfb, i, c1dfb, z, null), 3);
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }
}
