package com.ss.android.ugc.aweme.api.component.idlepreload;

import X.C01GW;
import X.C0NO7;
import X.C0PEM;
import X.C1001410cAN;
import X.C1001420cAO;
import X.C1001430cAP;
import X.C1001460cAS;
import X.C1001510cAX;
import X.C1001550cAb;
import X.C1022820ciu;
import X.C1199104mb;
import X.C1DFH;
import X.C2107308Nj;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C593080NNy;
import X.C593090NNz;
import X.C603820NmG;
import X.EnumC1001380cAK;
import X.EnumC1001490cAV;
import X.EnumC599900Nfw;
import android.content.Context;
import com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceIDLEPreloadServiceImpl implements ICommerceIDLEPreloadService {
    public static final /* synthetic */ int LJFF = 0;
    public boolean LIZIZ;
    public List<String> LIZJ;
    public boolean LIZLLL;
    public final C01GW LIZ = C452501pT.LIZIZ(new C1199104mb());
    public long LJ = 200;

    public final Map<String, C593080NNy> LJIIIZ() {
        return (Map) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    public final boolean LIZIZ() {
        return C1001430cAP.LIZ().enableIdlePreload;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    public final boolean LIZ(EnumC1001380cAK enumC1001380cAK) {
        if (!this.LIZIZ) {
            this.LIZIZ = true;
            this.LIZLLL = C1001430cAP.LIZ().enableIdlePreload;
            this.LIZJ = C1001430cAP.LIZ().preloadStyleList;
            this.LJ = C1001430cAP.LIZ().delayTimeOnPageScroll;
        }
        if (this.LIZLLL && enumC1001380cAK.isEnabledForIdlePreload(this.LIZJ)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    public final void LIZLLL(EnumC599900Nfw enumC599900Nfw) {
        C593080NNy c593080NNy = LJIIIZ().get(enumC599900Nfw.getValue());
        if (c593080NNy == null) {
            c593080NNy = null;
        }
        C593080NNy c593080NNy2 = c593080NNy;
        if (c593080NNy2 != null) {
            c593080NNy2.LIZLLL();
            C603820NmG<String, C1001510cAX> c603820NmG = c593080NNy2.LIZIZ;
            if (c603820NmG != null) {
                c603820NmG.LJIIIZ(-1);
            }
            PriorityQueue<C1001510cAX> priorityQueue = c593080NNy2.LIZ;
            if (priorityQueue != null) {
                priorityQueue.clear();
            }
        }
        LJIIIZ().remove(enumC599900Nfw.getValue());
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    public final void LJI(C1001420cAO c1001420cAO) {
        String value = c1001420cAO.LIZIZ.getValue();
        Map<String, C593080NNy> mapLJIIIZ = LJIIIZ();
        C593080NNy c593080NNy = mapLJIIIZ.get(value);
        if (c593080NNy == null) {
            c593080NNy = new C593080NNy();
            mapLJIIIZ.put(value, c593080NNy);
        }
        C593080NNy c593080NNy2 = c593080NNy;
        C23250099c.LIZLLL(c593080NNy2.LJFF, null, null, new C593090NNz(c593080NNy2, c1001420cAO, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    public final void LIZJ(Aweme aweme, String str) {
        Object obj;
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trackFormatShowFail refer= ");
            sbLIZ.append(str);
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ(str, "refer");
            c1022820ciuLIZLLL.LIZIZ("idle_preload_fail", "fail_reason");
            C1001410cAN c1001410cAN = C1001410cAN.LIZIZ;
            String str2 = "1";
            if (c1001410cAN.LIZIZ()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            c1022820ciuLIZLLL.LIZIZ(obj, "use_idle_preload");
            if (c1001410cAN.LIZIZ()) {
                C1001420cAO c1001420cAOLJIIIIZZ = c1001410cAN.LJIIIIZZ(aweme.getAid(), EnumC1001380cAK.CARD_OPERATION, EnumC599900Nfw.FEED);
                if (c1001420cAOLJIIIIZZ == null || !c1001420cAOLJIIIIZZ.LIZ()) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c1022820ciuLIZLLL.LIZIZ(str2, "idle_preload_status");
            }
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    public final void LJ(Context context, Aweme aweme, String str) {
        if (AwemeExtKt.isAdTraffic(aweme) && Intrinsics.LJFF(str, "homepage_hot")) {
            EnumC599900Nfw enumC599900Nfw = EnumC599900Nfw.FEED;
            EnumC1001380cAK[] enumC1001380cAKArrValues = EnumC1001380cAK.values();
            ArrayList<EnumC1001380cAK> arrayList = new ArrayList();
            for (EnumC1001380cAK enumC1001380cAK : enumC1001380cAKArrValues) {
                if (enumC1001380cAK.isEnabledForIdlePreload(C1001430cAP.LIZ().preloadStyleList)) {
                    arrayList.add(enumC1001380cAK);
                }
            }
            C593080NNy c593080NNy = LJIIIZ().get(enumC599900Nfw.getValue());
            if (c593080NNy == null) {
                c593080NNy = null;
            }
            C593080NNy c593080NNy2 = c593080NNy;
            arrayList.toString();
            Objects.toString(c593080NNy2);
            for (EnumC1001380cAK enumC1001380cAK2 : arrayList) {
                if (c593080NNy2 != null) {
                    String strLIZ = C0NO7.LIZ(enumC1001380cAK2.getTaskIdWithType(aweme.getAid()), enumC599900Nfw);
                    C1001510cAX c1001510cAXLIZJ = c593080NNy2.LIZIZ.LIZJ(strLIZ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("processOnBoundaryCondition taskUniqueId = ");
                    sbLIZ.append(strLIZ);
                    sbLIZ.append(" task = ");
                    sbLIZ.append(c1001510cAXLIZJ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (c1001510cAXLIZJ != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("processOnBoundaryCondition FailedStrategy = ");
                        sbLIZ2.append(c1001510cAXLIZJ.LL.LJ);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        int i = C1001460cAS.LIZIZ[c1001510cAXLIZJ.LL.LJ.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3 && c1001510cAXLIZJ.LL.LJFF == EnumC1001490cAV.PENDING) {
                                    c1001510cAXLIZJ.LJI(EnumC1001490cAV.CANCELLED);
                                }
                            } else if (c1001510cAXLIZJ.LL.LJFF == EnumC1001490cAV.PENDING) {
                                c1001510cAXLIZJ.LJI(EnumC1001490cAV.CANCELLED);
                            }
                        } else if (c1001510cAXLIZJ.LL.LJFF == EnumC1001490cAV.PENDING) {
                            c1001510cAXLIZJ.LJFF(true);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(java.lang.String r8, X.EnumC1001380cAK r9, X.EnumC599900Nfw r10) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.api.component.idlepreload.CommerceIDLEPreloadServiceImpl.LJFF(java.lang.String, X.0cAK, X.0Nfw):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1001420cAO LJIIIIZZ(java.lang.String r5, X.EnumC1001380cAK r6, X.EnumC599900Nfw r7) {
        /*
            r4 = this;
            boolean r0 = r4.LIZIZ()
            r3 = 0
            if (r0 != 0) goto L8
            return r3
        L8:
            if (r5 != 0) goto Lb
            return r3
        Lb:
            java.util.Map r1 = r4.LJIIIZ()
            java.lang.String r0 = r7.getValue()
            java.lang.Object r2 = r1.get(r0)
            if (r2 != 0) goto L1a
            r2 = r3
        L1a:
            X.0NNy r2 = (X.C593080NNy) r2
            if (r2 == 0) goto L64
            java.lang.String r0 = r6.getTaskIdWithType(r5)
            java.lang.String r1 = X.C0NO7.LIZ(r0, r7)
            X.0NmG<java.lang.String, X.0cAX> r0 = r2.LIZIZ
            java.lang.Object r0 = r0.LIZJ(r1)
            X.0cAX r0 = (X.C1001510cAX) r0
            if (r0 == 0) goto L64
            X.0cAO r2 = r0.LL
        L32:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getPreloadTask task = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " , type = "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", scene = "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " shouldInterceptViewShow = "
            r1.append(r0)
            if (r2 == 0) goto L5d
            boolean r0 = r2.LIZIZ()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L5d:
            r1.append(r3)
            X.C2188811AlT.LIZIZ(r1)
            return r2
        L64:
            r2 = r3
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.api.component.idlepreload.CommerceIDLEPreloadServiceImpl.LJIIIIZZ(java.lang.String, X.0cAK, X.0Nfw):X.0cAO");
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.idelpreload.ICommerceIDLEPreloadService
    public final void LJII(Context context, EnumC599900Nfw enumC599900Nfw, int i, List<? extends Aweme> list, EnumC1001380cAK enumC1001380cAK) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1001550cAb(this, enumC1001380cAK, i, list, context, null), 3);
    }
}
