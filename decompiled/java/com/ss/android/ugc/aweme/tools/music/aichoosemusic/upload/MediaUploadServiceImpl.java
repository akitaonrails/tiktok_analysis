package com.ss.android.ugc.aweme.tools.music.aichoosemusic.upload;

import X.AbstractC1921407fo;
import X.AbstractC2289508y5;
import X.AnonymousClass0956;
import X.AnonymousClass0983;
import X.C11IR;
import X.C11NZ;
import X.C123100dR;
import X.C1450080nq2;
import X.C1458370o3P;
import X.C1877407Wy;
import X.C1912807eQ;
import X.C1921307fn;
import X.C201955140j;
import X.C2188811AlT;
import X.C2265808uG;
import X.C2275508vp;
import X.C2275708vr;
import X.C2285908xV;
import X.C2288408xu;
import X.EnumC2274808vi;
import X.InterfaceC781210Ukh;
import Y.AfS139S0200000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.port.internal.IMediaUploadService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaUploadServiceImpl implements IMediaUploadService {
    public final ConcurrentHashMap<C1877407Wy, C2285908xV> LIZ = new ConcurrentHashMap<>();
    public final C1912807eQ LIZIZ = new C1912807eQ();
    public final Object LIZJ = new Object();

    public static void LIZLLL(String str) {
        C201955140j.LIZLLL(C1450080nq2.LIZIZ, "MediaUploadService", str);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IMediaUploadService
    public final String LIZ(AbstractC1921407fo abstractC1921407fo) {
        return this.LIZIZ.LIZ(C2265808uG.LIZ(abstractC1921407fo));
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IMediaUploadService
    public final void LIZJ(AbstractC1921407fo abstractC1921407fo) {
        C1877407Wy c1877407WyLIZ = C2265808uG.LIZ(abstractC1921407fo);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clear cache fp=");
        sbLIZ.append(c1877407WyLIZ.LIZ);
        LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        C1912807eQ c1912807eQ = this.LIZIZ;
        synchronized (c1912807eQ) {
            c1912807eQ.LIZIZ.remove(c1877407WyLIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IMediaUploadService
    public final C11NZ<String> LIZIZ(AbstractC1921407fo abstractC1921407fo, C2288408xu c2288408xu) {
        String strLJIILLIIL;
        final C1877407Wy c1877407WyLIZ = C2265808uG.LIZ(abstractC1921407fo);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("submit fp=");
        sbLIZ.append(c1877407WyLIZ.LIZ);
        LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        String strLIZ = this.LIZIZ.LIZ(c1877407WyLIZ);
        if (strLIZ != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cache hit fp=");
            sbLIZ2.append(c1877407WyLIZ.LIZ);
            LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
            return C11NZ.LJJJJZ(strLIZ);
        }
        if ((abstractC1921407fo instanceof C1921307fn) || (abstractC1921407fo instanceof C2275508vp)) {
            C1458370o3P.LIZ.getClass();
            if (C1458370o3P.LJIJI() && c2288408xu.LJ != EnumC2274808vi.PANEL_PIC.ordinal() && (strLJIILLIIL = C1458370o3P.LJIILLIIL()) != null && C123100dR.LIZ(strLJIILLIIL)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("preload hit fp=");
                sbLIZ3.append(c1877407WyLIZ.LIZ);
                LIZLLL(C2188811AlT.LIZIZ(sbLIZ3));
                this.LIZIZ.LIZIZ(c1877407WyLIZ, strLJIILLIIL);
                return C11NZ.LJJJJZ(strLJIILLIIL);
            }
        }
        synchronized (this.LIZJ) {
            try {
                String strLIZ2 = this.LIZIZ.LIZ(c1877407WyLIZ);
                if (strLIZ2 != null) {
                    return C11NZ.LJJJJZ(strLIZ2);
                }
                C2285908xV c2285908xV = this.LIZ.get(c1877407WyLIZ);
                if (c2285908xV != null) {
                    AnonymousClass0956 anonymousClass0956 = c2285908xV.LIZ.LJIIL;
                    if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("reuse inflight fp=");
                        sbLIZ4.append(c1877407WyLIZ.LIZ);
                        LIZLLL(C2188811AlT.LIZIZ(sbLIZ4));
                        return c2285908xV.LIZIZ;
                    }
                    this.LIZ.remove(c1877407WyLIZ);
                }
                AbstractC2289508y5 abstractC2289508y5LJFF = C2275708vr.LJFF(abstractC1921407fo, c2288408xu);
                if (abstractC2289508y5LJFF == null) {
                    return C11IR.LL;
                }
                abstractC2289508y5LJFF.LJ = c2288408xu.LIZLLL;
                abstractC2289508y5LJFF.LJFF = c2288408xu.LJ;
                AnonymousClass0983 anonymousClass0983LJLLLL = abstractC2289508y5LJFF.LJIILJJIL().LJLIIL(1L).LJJIJIIJIL(new AfS139S0200000_3((Object) this, (Context) c1877407WyLIZ, (Function1<? super Drawable, Unit>) 0)).LJJIIJ(new InterfaceC781210Ukh() { // from class: X.08xU
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        this.LIZ.LIZ.remove(c1877407WyLIZ);
                    }
                }).LJJLIIIJJI().LJLLLL();
                this.LIZ.put(c1877407WyLIZ, new C2285908xV(abstractC2289508y5LJFF, anonymousClass0983LJLLLL));
                abstractC2289508y5LJFF.LJIJ();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("new task fp=");
                sbLIZ5.append(c1877407WyLIZ.LIZ);
                sbLIZ5.append(" active=");
                sbLIZ5.append(this.LIZ.size());
                LIZLLL(C2188811AlT.LIZIZ(sbLIZ5));
                return anonymousClass0983LJLLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
