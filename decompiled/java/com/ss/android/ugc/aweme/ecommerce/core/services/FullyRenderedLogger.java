package com.ss.android.ugc.aweme.ecommerce.core.services;

import X.C01GW;
import X.C052K;
import X.C13048058s;
import X.C1742510vRh;
import X.C1742530vRj;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1303450k1X;
import X.EnumC1334250kpD;
import X.EnumC1742470vRd;
import Y.ARunnableS126S0100000_26;
import Y.ARunnableS29S1200000_26;
import Y.ARunnableS30S1100000_26;
import Y.ARunnableS7S1200100_26;
import Y.ARunnableS95S0200000_26;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomFullyRenderedConfigData;
import com.ss.android.ugc.aweme.ecommerce.api.FullyRenderedLoggerInterface;
import com.ss.android.ugc.aweme.ecommerce.core.services.FullyRenderedLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class FullyRenderedLogger implements FullyRenderedLoggerInterface {
    public final BPEAHandler LIZ;
    public final C01GW LIZIZ;
    public C1742510vRh LIZJ;
    public final ARunnableS126S0100000_26 LIZLLL;

    public final EcomFullyRenderedConfigData LJI() {
        return (EcomFullyRenderedConfigData) this.LIZIZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ() {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.services.FullyRenderedLogger.LJIIIZ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ() {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.services.FullyRenderedLogger.LJIIJ():void");
    }

    public FullyRenderedLogger() {
        HandlerThread handlerThread = new HandlerThread("fully_rendered_collector");
        handlerThread.start();
        this.LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
        this.LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(159));
        this.LIZLLL = new ARunnableS126S0100000_26(this, 41);
        C13048058s c13048058s = C13048058s.LIZ;
        C052K c052k = new C052K() { // from class: X.0vRe
            @Override // X.C052K
            public final void onEvent(String str, JSONObject jSONObject) {
                EnumC1742470vRd enumC1742470vRd;
                String string;
                String value;
                EnumC1742470vRd enumC1742470vRd2;
                EnumC1742470vRd enumC1742470vRd3;
                String string2;
                String value2;
                EnumC1742470vRd enumC1742470vRd4;
                String string3;
                String value3;
                String value4;
                EnumC1742470vRd enumC1742470vRd5;
                EnumC1742470vRd enumC1742470vRd6;
                if (!this.LIZ.LJIIIIZZ()) {
                    return;
                }
                String string4 = null;
                if (Intrinsics.LJFF(str, "rd_tiktokec_meaningful_rendered")) {
                    Object objOpt = jSONObject.opt("page_name");
                    if (objOpt != null) {
                        string3 = objOpt.toString();
                    } else {
                        string3 = null;
                    }
                    C1742510vRh c1742510vRh = this.LIZ.LIZJ;
                    if (c1742510vRh != null && (enumC1742470vRd6 = c1742510vRh.LIZ) != null) {
                        value3 = enumC1742470vRd6.getValue();
                    } else {
                        value3 = null;
                    }
                    if (Intrinsics.LJFF(string3, value3)) {
                        FullyRenderedLogger fullyRenderedLogger = this.LIZ;
                        C1742510vRh c1742510vRh2 = fullyRenderedLogger.LIZJ;
                        if (c1742510vRh2 == null || (enumC1742470vRd5 = c1742510vRh2.LIZ) == null || (value4 = enumC1742470vRd5.getValue()) == null) {
                            value4 = "";
                        }
                        Map<String, Object> mapLJ = C08HX.LJ(jSONObject);
                        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJ.size()));
                        for (Map.Entry entry : ((LinkedHashMap) mapLJ).entrySet()) {
                            Object key = entry.getKey();
                            Object value5 = entry.getValue();
                            if (value5 == null) {
                                value5 = "";
                            }
                            linkedHashMap.put(key, value5);
                        }
                        if (fullyRenderedLogger.LJIIIIZZ()) {
                            C786410Ut5.LJJZZIII(fullyRenderedLogger.LIZ, new ARunnableS29S1200000_26(linkedHashMap, fullyRenderedLogger, value4, 3));
                            return;
                        }
                        return;
                    }
                }
                if (Intrinsics.LJFF(str, "tiktokec_glide_page")) {
                    Object objOpt2 = jSONObject.opt("page_name");
                    if (objOpt2 != null) {
                        string2 = objOpt2.toString();
                    } else {
                        string2 = null;
                    }
                    C1742510vRh c1742510vRh3 = this.LIZ.LIZJ;
                    if (c1742510vRh3 != null && (enumC1742470vRd4 = c1742510vRh3.LIZ) != null) {
                        value2 = enumC1742470vRd4.getValue();
                    } else {
                        value2 = null;
                    }
                    if (Intrinsics.LJFF(string2, value2)) {
                        C1742510vRh c1742510vRh4 = this.LIZ.LIZJ;
                        if (c1742510vRh4 != null) {
                            c1742510vRh4.LJIIJ = true;
                            return;
                        }
                        return;
                    }
                }
                if (Intrinsics.LJFF(str, "tiktokec_stay_page")) {
                    Object objOpt3 = jSONObject.opt("page_name");
                    if (objOpt3 != null) {
                        string = objOpt3.toString();
                    } else {
                        string = null;
                    }
                    C1742510vRh c1742510vRh5 = this.LIZ.LIZJ;
                    if (c1742510vRh5 != null && (enumC1742470vRd3 = c1742510vRh5.LIZ) != null) {
                        value = enumC1742470vRd3.getValue();
                    } else {
                        value = null;
                    }
                    if (Intrinsics.LJFF(string, value)) {
                        FullyRenderedLogger fullyRenderedLogger2 = this.LIZ;
                        C1742510vRh c1742510vRh6 = fullyRenderedLogger2.LIZJ;
                        if (c1742510vRh6 != null && (enumC1742470vRd2 = c1742510vRh6.LIZ) != null) {
                            fullyRenderedLogger2.LIZLLL(enumC1742470vRd2);
                            return;
                        }
                        return;
                    }
                }
                if (Intrinsics.LJFF(str, "rd_tiktokec_meaningful_intercept")) {
                    C1742500vRg c1742500vRg = EnumC1742470vRd.Companion;
                    Object objOpt4 = jSONObject.opt("page_name");
                    if (objOpt4 != null) {
                        string4 = objOpt4.toString();
                    }
                    c1742500vRg.getClass();
                    if (string4 != null) {
                        if (EnumC1742470vRd.dealsSubpageNames$delegate.getValue().contains(string4)) {
                            enumC1742470vRd = EnumC1742470vRd.DEAL_RUNTIME;
                        } else {
                            enumC1742470vRd = EnumC1742470vRd.VALUE_MAP.get(string4);
                        }
                        if (enumC1742470vRd != null) {
                            FullyRenderedLogger fullyRenderedLogger3 = this.LIZ;
                            if (fullyRenderedLogger3.LJI().enabled && fullyRenderedLogger3.LJI().pageConfigs.containsKey(enumC1742470vRd.getValue()) && C1697810uHb.LJIIJJI(EnumC1742470vRd.CART, EnumC1742470vRd.TRENDS, EnumC1742470vRd.DEAL_RUNTIME).contains(enumC1742470vRd)) {
                                FullyRenderedLogger fullyRenderedLogger4 = this.LIZ;
                                C1742510vRh c1742510vRh7 = fullyRenderedLogger4.LIZJ;
                                if (c1742510vRh7 == null || c1742510vRh7.LIZ != enumC1742470vRd) {
                                    fullyRenderedLogger4.LIZJ(enumC1742470vRd);
                                }
                            }
                        }
                    }
                }
            }
        };
        c13048058s.getClass();
        ArrayList<C052K> arrayList = C13048058s.LJ;
        synchronized (arrayList) {
            try {
                arrayList.add(c052k);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LJIIIIZZ() {
        return LJI().enabled;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.api.FullyRenderedLoggerInterface
    public final void LIZIZ(String str) {
        if (!LJIIIIZZ()) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LIZ, new ARunnableS30S1100000_26(this, str, 0));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.api.FullyRenderedLoggerInterface
    public final void LIZJ(EnumC1742470vRd enumC1742470vRd) {
        if (LJI().enabled && LJI().pageConfigs.containsKey(enumC1742470vRd.getValue())) {
            C786410Ut5.LJJZZIII(this.LIZ, new ARunnableS95S0200000_26(enumC1742470vRd, this, 14));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.api.FullyRenderedLoggerInterface
    public final void LIZLLL(EnumC1742470vRd enumC1742470vRd) {
        if (!LJIIIIZZ()) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LIZ, new ARunnableS95S0200000_26(enumC1742470vRd, this, 13));
    }

    public final void LJII(EnumC1742470vRd enumC1742470vRd) {
        C1742510vRh c1742510vRh = this.LIZJ;
        if (c1742510vRh != null && enumC1742470vRd == c1742510vRh.LIZ) {
            c1742510vRh.LJIIJJI = EnumC1303450k1X.LLILZ;
            c1742510vRh.LJ = System.currentTimeMillis();
            for (C1742530vRj c1742530vRj : c1742510vRh.LJI) {
                if (!c1742530vRj.LIZLLL.isFinished()) {
                    c1742530vRj.LIZLLL = EnumC1334250kpD.INTERRUPTED;
                }
            }
            for (C1742530vRj c1742530vRj2 : c1742510vRh.LJII) {
                if (!c1742530vRj2.LIZLLL.isFinished()) {
                    c1742530vRj2.LIZLLL = EnumC1334250kpD.INTERRUPTED;
                }
            }
            LJIIIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.api.FullyRenderedLoggerInterface
    public final void LIZ(String str, EnumC1334250kpD enumC1334250kpD, long j) {
        if (!LJIIIIZZ()) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LIZ, new ARunnableS7S1200100_26(j, enumC1334250kpD, this, str, 1));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.api.FullyRenderedLoggerInterface
    public final void LJ(final String str, final String str2, final boolean z) {
        if (!LJIIIIZZ()) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LIZ, new Runnable() { // from class: X.0vRi
            public final void LIZ() {
                String str3;
                String str4;
                C1742510vRh c1742510vRh;
                if (z || (str3 = str) == null || str3.length() == 0 || (str4 = str2) == null || str4.length() == 0 || (c1742510vRh = this.LIZJ) == null) {
                    return;
                }
                String str5 = str2;
                String str6 = str;
                if (c1742510vRh.LJFF.contains(str5)) {
                    ArrayList<C1742530vRj> arrayList = c1742510vRh.LJII;
                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                        Iterator<C1742530vRj> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next().LIZ, str6)) {
                                return;
                            }
                        }
                    }
                    Long lLIZ = c1742510vRh.LIZ();
                    if (lLIZ == null || lLIZ.longValue() + c1742510vRh.LJIIIZ >= System.currentTimeMillis()) {
                        c1742510vRh.LJII.add(new C1742530vRj(str6, Long.valueOf(System.currentTimeMillis()), EnumC1334250kpD.STARTED, 20));
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FullyRenderedLogger@7d0c.onImageRequestStarted$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FullyRenderedLogger@7d0c.onImageRequestStarted$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.api.FullyRenderedLoggerInterface
    public final void LJFF(String str, EnumC1334250kpD enumC1334250kpD, long j) {
        if (!LJIIIIZZ()) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LIZ, new ARunnableS7S1200100_26(j, enumC1334250kpD, this, str, 0));
    }
}
