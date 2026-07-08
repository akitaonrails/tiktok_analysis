package com.ss.android.ugc.aweme.settingsrequest.api.optimized;

import X.C08QB;
import X.C08QT;
import X.C09RB;
import X.C0C7T;
import X.C0CCZ;
import X.C0CJ1;
import X.C0VSJ;
import X.C0VZ0;
import X.C2084808Es;
import X.C2188811AlT;
import X.C2456309jt;
import X.C296760BkA;
import X.C311570CJf;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2210981Bg8;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedChunkTask;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class FetchABTestCommonOptimizedChunkTask implements C0CCZ {
    public static volatile boolean LLIZ;
    public static volatile boolean LLIZLLLIL;
    public static InterfaceC2210981Bg8 LLJ = new InterfaceC2210981Bg8() { // from class: X.0C7x
        @Override // X.InterfaceC2210981Bg8
        public final void LIZ(boolean z) {
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZJ(boolean z) {
        }

        @Override // X.InterfaceC2210981Bg8
        public final void LIZIZ(String str, String str2) {
            if (FetchABTestCommonOptimizedChunkTask.LLIZLLLIL) {
                return;
            }
            if (C0C76.LIZ() != null) {
                C0C76.LIZ().isOpen();
            }
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj = new C799890VZj();
            c799890VZj.LIZ(new FetchABTestCommonOptimizedChunkTask(0, new C0C7T()));
            c799890VZj.LIZIZ();
            FetchABTestCommonOptimizedChunkTask.LLJ = null;
        }
    };
    public final int LL;
    public final C0C7T LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public C311570CJf LLILZIL = new C311570CJf(0);
    public boolean LLILZLL = true;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FetchABTestCommonOptimizedChunkTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return C296760BkA.LIZ() == 1 ? EnumC799870VZh.FIRST_WINDOW_FOCUS : C296760BkA.LIZ() == 2 ? EnumC799870VZh.BOOT_FINISH : (C296760BkA.LIZ() == 3 && C2456309jt.LIZ()) ? EnumC799870VZh.FIRST_WINDOW_FOCUS : EnumC799870VZh.BACKGROUND;
    }

    public final void LJ(String str) {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.w2(contextLIZ).getPath());
        sbLIZ.append('/');
        sbLIZ.append(C2084808Es.LIZ("cdn_file"));
        sbLIZ.append('/');
        sbLIZ.append(C2084808Es.LIZ(str));
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            C08QT c08qt = new C08QT(C09RB.LJIIIZ(C08QB.LJIILIIL(c0vsj), AFwS232S0000000_4.get$arr$(68)));
            while (c08qt.hasNext()) {
                File file = (File) c08qt.next();
                try {
                    if (file.exists()) {
                        file.delete();
                    }
                } catch (SecurityException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        Set<String> setLIZ = this.LLILLJJLI.LJFF.LIZ();
        setLIZ.remove(str);
        C0CJ1 c0cj1 = this.LLILLJJLI.LJFF;
        ((Keva) c0cj1.LJFF.getValue()).storeStringSet(c0cj1.LIZLLL, setLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    @Override // X.InterfaceC308150C6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedChunkTask.run(android.content.Context):void");
    }

    public FetchABTestCommonOptimizedChunkTask(int i, C0C7T c0c7t) {
        this.LL = i;
        this.LLILLJJLI = c0c7t;
    }

    public final n LIZ(n nVar, n nVar2) {
        k kVarLJJIIZ;
        n nVar3 = new n();
        Set<String> setLJJIJIL = nVar.LJJIJIL();
        if (setLJJIJIL != null) {
            for (String str : setLJJIJIL) {
                if (str != null && (kVarLJJIIZ = nVar.LJJIIZ(str)) != null && (kVarLJJIIZ instanceof n)) {
                    n nVar4 = (n) kVarLJJIIZ;
                    nVar3.LJJIFFI(str, nVar4.LJJIIZ("val"));
                    q qVarLJJIJIIJI = nVar4.LJJIJIIJI("type");
                    if (qVarLJJIJIIJI != null && (qVarLJJIJIIJI.LL instanceof Number) && qVarLJJIJIIJI.LJIIJJI() == 21) {
                        nVar2.LJJIFFI(str, nVar4.LJJIJIIJI("vid"));
                    }
                }
            }
        }
        return nVar3;
    }
}
