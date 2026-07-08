package com.ss.android.ugc.aweme.ml.impl.v3;

import X.AbstractC1511460pR2;
import X.AbstractC1511510pR7;
import X.C04TD;
import X.C0N33;
import X.C1511580pRE;
import X.C1511600pRG;
import X.C2214951BmX;
import X.InterfaceC1511740pRU;
import com.ss.android.ugc.aweme.ml.ab.ExpandSmartCommentConfig;
import com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV3Service;
import com.ss.android.ugc.aweme.ml.api.SmartCommentConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartPreloadCommentV3Service implements ISmartPreloadCommentV3Service {
    public final Map<String, AbstractC1511510pR7> LIZ = new LinkedHashMap();

    public static ISmartPreloadCommentV3Service LIZIZ() {
        Object objLIZ = C04TD.LIZ(ISmartPreloadCommentV3Service.class, false);
        if (objLIZ != null) {
            return (ISmartPreloadCommentV3Service) objLIZ;
        }
        if (C04TD.G2 == null) {
            synchronized (ISmartPreloadCommentV3Service.class) {
                if (C04TD.G2 == null) {
                    C04TD.G2 = new SmartPreloadCommentV3Service();
                }
            }
        }
        return C04TD.G2;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV3Service
    public final SmartCommentConfig LIZ(String str) {
        AbstractC1511510pR7 abstractC1511510pR7 = (AbstractC1511510pR7) ((LinkedHashMap) this.LIZ).get(str);
        if (abstractC1511510pR7 == null) {
            return null;
        }
        if (abstractC1511510pR7 instanceof AbstractC1511460pR2) {
            return ((AbstractC1511460pR2) abstractC1511510pR7).LIZIZ();
        }
        return C1511580pRE.LIZ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV3Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.lang.String r7) {
        /*
            r6 = this;
            java.util.Map<java.lang.String, X.0pR7> r0 = r6.LIZ
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.String r0 = "homepage_hot"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            r4 = 0
            if (r0 == 0) goto L7b
            X.0pRD r5 = X.C1511570pRD.LIZLLL
        L14:
            if (r5 == 0) goto L78
        L16:
            java.util.Map<java.lang.String, X.0pR7> r1 = r6.LIZ
            java.lang.String r0 = r5.name
            r1.put(r0, r5)
            boolean r0 = r5 instanceof X.AbstractC1511460pR2
            if (r0 == 0) goto L78
            X.0pR2 r5 = (X.AbstractC1511460pR2) r5
            boolean r0 = r5.LIZJ
            if (r0 != 0) goto L78
            r0 = 1
            r5.LIZJ = r0
            java.lang.String r2 = r5.name
            X.0pR3 r0 = new X.0pR3
            r0.<init>(r2)
            r5.LIZIZ = r0
            X.0pP3 r1 = new X.0pP3
            r1.<init>(r2)
            X.01GW r0 = r5.LIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig r0 = (com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig) r0
            r1.LIZIZ = r0
            X.0pR3 r0 = r5.LIZIZ
            if (r0 == 0) goto L49
            r0.configService(r1)
        L49:
            boolean r0 = r5.enable()
            if (r0 == 0) goto L78
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0pR4> r0 = X.C1511480pR4.LJIIZILJ
            java.lang.Object r3 = r0.get(r2)
            X.0pR4 r3 = (X.C1511480pR4) r3
            if (r3 == 0) goto L78
            X.0pPU r2 = new X.0pPU
            r1 = 31
            r0 = 0
            r2.<init>(r0, r4, r0, r1)
            X.01GW r0 = r5.LIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ml.api.SmartCommentConfig r0 = (com.ss.android.ugc.aweme.ml.api.SmartCommentConfig) r0
            if (r0 == 0) goto L79
            int r0 = r0.getWaitCountForReal()
        L6f:
            r2.LIZJ = r0
            r0 = 103(0x67, float:1.44E-43)
            r2.LIZ = r0
            r3.LJII(r2, r5)
        L78:
            return
        L79:
            r0 = 2
            goto L6f
        L7b:
            boolean r0 = X.C1511580pRE.LIZIZ(r7)
            if (r0 == 0) goto L78
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "comment_preload_for_"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            X.0pQv r0 = X.C1511420pQy.LIZ()
            X.0pR7 r5 = r0.LIZIZ(r2)
            if (r5 != 0) goto L16
            com.ss.android.ugc.aweme.ml.api.SmartCommentConfig r0 = X.C1511580pRE.LIZ(r7)
            if (r0 == 0) goto L78
            X.0pP3 r1 = new X.0pP3
            r1.<init>(r7)
            r1.LIZIZ = r0
            X.0pOD r0 = new X.0pOD
            r0.<init>()
            r1.LIZJ = r0
            X.0pQv r0 = X.C1511420pQy.LIZ()
            X.0pR7 r5 = r0.LIZ(r2, r1)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.impl.v3.SmartPreloadCommentV3Service.LJFF(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV3Service
    public final SmartCommentConfig LJI(int i, String str) {
        ExpandSmartCommentConfig expandSmartCommentConfig;
        Map<String, SmartCommentConfig> map;
        SmartCommentConfig smartCommentConfig;
        if (i != -1 && i != 0) {
            if (str == null || (expandSmartCommentConfig = (ExpandSmartCommentConfig) C1511600pRG.LIZ.getValue()) == null || (map = expandSmartCommentConfig.preloadConfigs) == null || (smartCommentConfig = map.get(str)) == null) {
                return C1511580pRE.LIZ(str);
            }
            return smartCommentConfig;
        }
        return LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV3Service
    public final void LJII(String str, C0N33 c0n33, final C2214951BmX c2214951BmX) {
        AbstractC1511510pR7 abstractC1511510pR7 = (AbstractC1511510pR7) ((LinkedHashMap) this.LIZ).get(str);
        if (abstractC1511510pR7 != null) {
            abstractC1511510pR7.runAsyncDelay(0L, c0n33, new InterfaceC1511740pRU() { // from class: X.0pRH
                @Override // X.InterfaceC1511740pRU
                public final void LIZ(C1512100pS4 c1512100pS4) {
                    c2214951BmX.LIZ(c1512100pS4);
                }
            });
        }
    }
}
