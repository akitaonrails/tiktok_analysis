package com.ss.android.ugc.aweme.commercialize.measurement.mrc;

import X.C1046180dKa;
import X.C1046220dKe;
import X.C1046460dL2;
import X.C1046510dL7;
import X.C1046520dL8;
import X.C1046530dL9;
import X.C11JF;
import X.C11NZ;
import X.C13LQ;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C19476611Hw;
import X.C1ECH;
import X.C2084808Es;
import X.C2188811AlT;
import X.C990150bsD;
import X.EnumC1022310ci5;
import X.EnumC1046210dKd;
import X.EnumC1046470dL3;
import X.InterfaceC1046170dKZ;
import X.InterfaceC1046550dLB;
import Y.AfS185S0100000_16;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS130S1100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class MRCManager implements IMRCManager {
    public final Map<String, C1046460dL2> LIZ = new LinkedHashMap();
    public final Map<String, Pair<Aweme, EnumC1022310ci5>> LIZIZ = new LinkedHashMap();
    public final Set<EnumC1022310ci5> LIZJ = C13LQ.LJLIIL(new EnumC1022310ci5[]{EnumC1022310ci5.RECOMMEND_FEED, EnumC1022310ci5.FOLLOWING_FEED, EnumC1022310ci5.POPULAR_FEED});

    @Override // com.ss.android.ugc.aweme.commercialize.measurement.mrc.IMRCManager
    public final void LIZ(String str) {
        Pair pair;
        if (!a0.LJJJIL(str) && (pair = (Pair) ((LinkedHashMap) this.LIZIZ).get(str)) != null) {
            Aweme aweme = (Aweme) pair.getFirst();
            Object second = pair.getSecond();
            if (C1046530dL9.LIZ().enableMRC && AwemeExtKt.isAdTraffic(aweme) && this.LIZJ.contains(second)) {
                if (((LinkedHashMap) this.LIZ).get(LJ((Aweme) pair.getFirst(), (EnumC1022310ci5) pair.getSecond())) != null) {
                    LIZJ("break", (Aweme) pair.getFirst(), (EnumC1022310ci5) pair.getSecond());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.measurement.mrc.IMRCManager
    public final void LIZIZ(EnumC1022310ci5 enumC1022310ci5) {
        Set setEntrySet = ((LinkedHashMap) this.LIZIZ).entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (((Pair) ((Map.Entry) obj).getValue()).getSecond() == enumC1022310ci5) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) ((Map.Entry) it2.next()).getValue();
            Aweme aweme = (Aweme) pair.getFirst();
            EnumC1022310ci5 enumC1022310ci52 = (EnumC1022310ci5) pair.getSecond();
            if (C1046530dL9.LIZ().enableMRC && AwemeExtKt.isAdTraffic(aweme) && this.LIZJ.contains(enumC1022310ci52)) {
                C1046460dL2 c1046460dL2 = (C1046460dL2) ((LinkedHashMap) this.LIZ).get(LJ(aweme, enumC1022310ci52));
                if (c1046460dL2 != null) {
                    c1046460dL2.LJI.LIZ();
                    c1046460dL2.LIZLLL.clear();
                }
            }
        }
    }

    public static String LJ(Aweme aweme, EnumC1022310ci5 enumC1022310ci5) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aweme.getAid());
        sbLIZ.append('_');
        sbLIZ.append(AwemeExtKt.getAwemeRawAdIdStr(aweme));
        sbLIZ.append('_');
        sbLIZ.append(enumC1022310ci5.getValue());
        return C2084808Es.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.measurement.mrc.IMRCManager
    public final void LIZJ(final String str, Aweme aweme, EnumC1022310ci5 enumC1022310ci5) {
        if (C1046530dL9.LIZ().enableMRC && AwemeExtKt.isAdTraffic(aweme) && this.LIZJ.contains(enumC1022310ci5)) {
            final C1046460dL2 c1046460dL2 = (C1046460dL2) ((LinkedHashMap) this.LIZ).get(LJ(aweme, enumC1022310ci5));
            if (c1046460dL2 != null) {
                final AwS130S1100000_16 awS130S1100000_16 = new AwS130S1100000_16(str, c1046460dL2, 3);
                final long j = c1046460dL2.LJFF;
                final boolean z = c1046460dL2.LJIIIIZZ;
                C1046180dKa.LIZLLL.LIZJ(c1046460dL2.LIZJ, c1046460dL2.LIZLLL, new C1046220dKe(EnumC1046210dKd.USE_HALF, c1046460dL2.LIZIZ.LIZJ, 12), new InterfaceC1046170dKZ() { // from class: X.0dL4
                    @Override // X.InterfaceC1046170dKZ
                    public final void LIZ(C1046150dKX c1046150dKX) {
                        boolean z2;
                        C1046460dL2 c1046460dL22 = c1046460dL2;
                        boolean z3 = z;
                        String str2 = str;
                        long j2 = j;
                        Function1 function1 = awS130S1100000_16;
                        c1046460dL22.getClass();
                        c1046460dL22.LIZ(c1046150dKX);
                        if (c1046460dL22.LIZIZ.LIZLLL && c1046460dL22.LJIIIZ >= c1046150dKX.LIZJ) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if ((c1046150dKX.LIZ || z2) && z3) {
                            c1046460dL22.LIZIZ(SystemClock.elapsedRealtime() - j2, str2);
                        }
                        if (function1 != null) {
                            function1.invoke(Boolean.TRUE);
                        }
                    }
                });
                if (c1046460dL2.LJ >= c1046460dL2.LJIILL) {
                    c1046460dL2.LJI.LIZ();
                }
                c1046460dL2.LIZJ();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [X.0csm] */
    @Override // com.ss.android.ugc.aweme.commercialize.measurement.mrc.IMRCManager
    public final void LIZLLL(Aweme aweme, Context context, EnumC1022310ci5 enumC1022310ci5, View view, String str, final C990150bsD c990150bsD) {
        if (!a0.LJJJIL(str) && C1046530dL9.LIZ().enableMRC && AwemeExtKt.isAdTraffic(aweme) && this.LIZJ.contains(enumC1022310ci5)) {
            this.LIZIZ.put(str, new Pair<>(aweme, enumC1022310ci5));
            C1046510dL7 c1046510dL7 = new C1046510dL7(C1697810uHb.LJIIJJI(EnumC1046470dL3.VIEWABLE_1S, EnumC1046470dL3.VIEWABLE_2S, EnumC1046470dL3.VIEWABLE_6S, EnumC1046470dL3.VIEWABLE_15S), C1046530dL9.LIZ().loopInterval, C1046530dL9.LIZ().enableCacheViewId, C1ECH.LIZJ, new InterfaceC1046550dLB() { // from class: X.0csm
                @Override // X.InterfaceC1046550dLB
                public final String LIZ() {
                    return c990150bsD.LIZ();
                }

                @Override // X.InterfaceC1046550dLB
                public final boolean isPlaying() {
                    return c990150bsD.isPlaying();
                }

                @Override // X.InterfaceC1046550dLB
                public final void LIZJ(String str2, String str3, EnumC1046470dL3 enumC1046470dL3) {
                    Aweme aweme2;
                    Pair pair = (Pair) ((LinkedHashMap) this.LIZIZ).get(str2);
                    if (pair != null && (aweme2 = (Aweme) pair.getFirst()) != null) {
                        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "viewable_impression", aweme2.getAwemeRawAd());
                        c1022820ciuLIZLLL.LIZIZ(enumC1046470dL3.getLabel(), "viewable_length");
                        c1022820ciuLIZLLL.LIZIZ(str3, "trigger_from");
                        c1022820ciuLIZLLL.LJII();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00b3 A[Catch: Exception -> 0x0198, PHI: r23
                  0x00b3: PHI (r23v6 java.lang.String) = (r23v2 java.lang.String), (r23v7 java.lang.String) binds: [B:32:0x00ac, B:30:0x00a8] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0198, blocks: (B:7:0x003a, B:9:0x004e, B:12:0x005f, B:14:0x0065, B:22:0x0076, B:25:0x0084, B:27:0x009e, B:29:0x00a4, B:35:0x00b3, B:38:0x00c1, B:40:0x0126, B:41:0x0137, B:45:0x014d, B:46:0x015b, B:37:0x00bd, B:24:0x0080, B:47:0x015f), top: B:60:0x003a }] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0126 A[Catch: Exception -> 0x0198, TryCatch #0 {Exception -> 0x0198, blocks: (B:7:0x003a, B:9:0x004e, B:12:0x005f, B:14:0x0065, B:22:0x0076, B:25:0x0084, B:27:0x009e, B:29:0x00a4, B:35:0x00b3, B:38:0x00c1, B:40:0x0126, B:41:0x0137, B:45:0x014d, B:46:0x015b, B:37:0x00bd, B:24:0x0080, B:47:0x015f), top: B:60:0x003a }] */
                /* JADX WARN: Removed duplicated region for block: B:43:0x014a  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
                /* JADX WARN: Type inference failed for: r10v2, types: [X.0csV, X.0csj, X.0csl] */
                @Override // X.InterfaceC1046550dLB
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZIZ(java.lang.String r28, float r29, float r30, long r31, long r33, long r35) {
                    /*
                        Method dump skipped, instruction units count: 483
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1028940csm.LIZIZ(java.lang.String, float, float, long, long, long):void");
                }
            });
            String strLJ = LJ(aweme, enumC1022310ci5);
            HashSet hashSet = new HashSet();
            hashSet.addAll(C1046530dL9.LIZ().viewIdWhiteList);
            C1046460dL2 c1046460dL2 = new C1046460dL2(str, context, c1046510dL7, view, hashSet);
            c1046460dL2.LIZJ();
            C1046520dL8 c1046520dL8 = c1046460dL2.LJI;
            C19476611Hw c19476611HwLJL = C11NZ.LJJJJLI(c1046520dL8.LIZ.LIZIZ, TimeUnit.MILLISECONDS).LJL(C1701940uOG.LIZIZ());
            c1046520dL8.LIZ.getClass();
            c1046520dL8.LIZJ = (C11JF) c19476611HwLJL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS185S0100000_16(new AwS595S0100000_16(c1046520dL8, 341), 38), new AfS185S0100000_16(new AwS595S0100000_16(c1046520dL8, 342), 39));
            c1046520dL8.LIZIZ.polling();
            C1046460dL2 c1046460dL22 = (C1046460dL2) ((LinkedHashMap) this.LIZ).get(strLJ);
            if (c1046460dL22 != null) {
                C11JF c11jf = c1046460dL22.LJI.LIZJ;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                c1046460dL22.LIZLLL.clear();
            }
            this.LIZ.put(strLJ, c1046460dL2);
        }
    }
}
