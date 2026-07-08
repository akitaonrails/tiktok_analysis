package com.ss.android.ugc.aweme.ml.feature.pspfeature;

import X.C1510050pOl;
import X.C2188811AlT;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import com.tiktok.strategycenter.feature.FeatureCenterManager;
import com.tiktok.strategycenter.feature.IFeatureCenterDataManager;
import com.tiktok.ttm.TTMContext;
import com.tiktok.ttm.TTMParamData;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class PSPFeatureDataService implements IFeatureCenterDataManager {
    public PSPFeatureDataService() {
        IFeatureCenterDataManager.LIZ.getClass();
        FeatureCenterManager.INSTANCE.setInstance$ttm_strategy_center_release(this);
    }

    public static FeatureProducer LJII(String str) {
        if (a0.LJJIJ(str, '.')) {
            FeatureServiceManager.Companion.getClass();
            return C1510050pOl.LIZ().getOnlyProducer(str);
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), str, 0, 2, null);
        if (producer$default != null) {
            return producer$default;
        }
        FeatureProducer producer = C1510050pOl.LIZ().getProducer(str, 2);
        if (producer != null) {
            return producer;
        }
        return C1510050pOl.LIZ().getProducer(str, 1);
    }

    public static String LJIIIIZZ(TTMContext tTMContext) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("psp_");
        if (tTMContext == null || (str = tTMContext.strategyName) == null) {
            str = "feature";
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.tiktok.strategycenter.feature.IFeatureCenterDataManager
    public final long LIZIZ(String str, String str2, TTMContext tTMContext) {
        Boolean booleanFeature$default;
        FeatureProducer featureProducerLJII = LJII(str);
        if (featureProducerLJII != null && (booleanFeature$default = FeatureProducer.getBooleanFeature$default(featureProducerLJII, str2, null, LJIIIIZZ(tTMContext), null, 10, null)) != null) {
            if (booleanFeature$default.booleanValue()) {
                return 1L;
            }
            return 0L;
        }
        return Long.MAX_VALUE;
    }

    @Override // com.tiktok.strategycenter.feature.IFeatureCenterDataManager
    public final double LIZ(String str, String str2, String str3, TTMContext tTMContext) {
        Number numericFeature$default;
        if (str3 == null) {
            FeatureProducer featureProducerLJII = LJII(str);
            if (featureProducerLJII != null) {
                numericFeature$default = FeatureProducer.getNumericFeature$default(featureProducerLJII, str2, (JSONObject) null, LJIIIIZZ(tTMContext), (ReturnCode) null, 8, (Object) null);
            } else {
                return Double.MAX_VALUE;
            }
        } else {
            FeatureProducer featureProducerLJII2 = LJII(str);
            if (featureProducerLJII2 != null) {
                numericFeature$default = FeatureProducer.getNumericFeature$default(featureProducerLJII2, str2, str3, LJIIIIZZ(tTMContext), (ReturnCode) null, 8, (Object) null);
            } else {
                return Double.MAX_VALUE;
            }
        }
        if (numericFeature$default != null) {
            return numericFeature$default.doubleValue();
        }
        return Double.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    @Override // com.tiktok.strategycenter.feature.IFeatureCenterDataManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r12, java.lang.String r13, java.lang.String r14, com.tiktok.ttm.TTMContext r15) {
        /*
            r11 = this;
            r3 = 0
            r6 = r14
            r2 = r13
            if (r6 != 0) goto L1e
            com.ss.ugc.clientai.core.api.FeatureProducer r1 = LJII(r12)
            if (r1 == 0) goto L3f
            java.lang.String r4 = LJIIIIZZ(r15)
            r6 = 8
            r5 = r3
            r7 = r3
            java.lang.Object r2 = com.ss.ugc.clientai.core.api.FeatureProducer.getFeature$default(r1, r2, r3, r4, r5, r6, r7)
        L17:
            if (r2 == 0) goto L3f
            boolean r0 = r2 instanceof com.tiktok.ttm.ttmparam.container.TTMContainer
            if (r0 == 0) goto L32
            return r2
        L1e:
            com.ss.ugc.clientai.core.api.FeatureProducer r4 = LJII(r12)
            if (r4 == 0) goto L3f
            java.lang.String r7 = LJIIIIZZ(r15)
            r9 = 8
            r5 = r2
            r8 = r3
            r10 = r3
            java.lang.Object r2 = com.ss.ugc.clientai.core.api.FeatureProducer.getFeature$default(r4, r5, r6, r7, r8, r9, r10)
            goto L17
        L32:
            com.tiktok.ttm.TTMParamData r1 = new com.tiktok.ttm.TTMParamData
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L3b
            r3 = r2
            java.util.List r3 = (java.util.List) r3
        L3b:
            r1.<init>(r3)
            return r1
        L3f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.feature.pspfeature.PSPFeatureDataService.LIZJ(java.lang.String, java.lang.String, java.lang.String, com.tiktok.ttm.TTMContext):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    @Override // com.tiktok.strategycenter.feature.IFeatureCenterDataManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tiktok.ttm.TTMParamData LIZLLL(java.lang.String r11, java.lang.String r12, java.lang.String r13, com.tiktok.ttm.TTMContext r14) {
        /*
            r10 = this;
            r2 = 0
            r5 = r13
            r4 = r12
            if (r5 != 0) goto L30
            com.ss.ugc.clientai.core.api.FeatureProducer r3 = LJII(r11)
            if (r3 == 0) goto L43
            r5 = 0
            java.lang.String r6 = LJIIIIZZ(r14)
            r8 = 8
            r7 = r5
            r9 = r5
            java.lang.Object r1 = com.ss.ugc.clientai.core.api.FeatureProducer.getFeature$default(r3, r4, r5, r6, r7, r8, r9)
        L18:
            boolean r0 = r1 instanceof org.json.JSONObject
            if (r0 == 0) goto L24
            com.tiktok.ttm.TTMParamData r2 = new com.tiktok.ttm.TTMParamData
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            r2.<init>(r1)
        L23:
            return r2
        L24:
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L23
            com.tiktok.ttm.TTMParamData r2 = new com.tiktok.ttm.TTMParamData
            java.util.Map r1 = (java.util.Map) r1
            r2.<init>(r1)
            return r2
        L30:
            com.ss.ugc.clientai.core.api.FeatureProducer r3 = LJII(r11)
            if (r3 == 0) goto L43
            java.lang.String r6 = LJIIIIZZ(r14)
            r7 = 0
            r8 = 8
            r9 = r7
            java.lang.Object r1 = com.ss.ugc.clientai.core.api.FeatureProducer.getFeature$default(r3, r4, r5, r6, r7, r8, r9)
            goto L18
        L43:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.feature.pspfeature.PSPFeatureDataService.LIZLLL(java.lang.String, java.lang.String, java.lang.String, com.tiktok.ttm.TTMContext):com.tiktok.ttm.TTMParamData");
    }

    @Override // com.tiktok.strategycenter.feature.IFeatureCenterDataManager
    public final TTMParamData LJ(String str, String str2, String str3, TTMContext tTMContext) {
        Object feature$default;
        if (str3 == null) {
            FeatureProducer featureProducerLJII = LJII(str);
            if (featureProducerLJII == null) {
                return null;
            }
            feature$default = FeatureProducer.getFeature$default(featureProducerLJII, str2, (JSONObject) null, LJIIIIZZ(tTMContext), (ReturnCode) null, 8, (Object) null);
        } else {
            FeatureProducer featureProducerLJII2 = LJII(str);
            if (featureProducerLJII2 == null) {
                return null;
            }
            feature$default = FeatureProducer.getFeature$default(featureProducerLJII2, str2, str3, LJIIIIZZ(tTMContext), (ReturnCode) null, 8, (Object) null);
        }
        if (feature$default == null) {
            return null;
        }
        return new TTMParamData(feature$default);
    }

    @Override // com.tiktok.strategycenter.feature.IFeatureCenterDataManager
    public final String LJFF(String str, String str2, String str3, TTMContext tTMContext) {
        if (str3 == null) {
            FeatureProducer featureProducerLJII = LJII(str);
            if (featureProducerLJII != null) {
                return FeatureProducer.getStringFeature$default(featureProducerLJII, str2, (JSONObject) null, LJIIIIZZ(tTMContext), (ReturnCode) null, 8, (Object) null);
            }
            return null;
        }
        FeatureProducer featureProducerLJII2 = LJII(str);
        if (featureProducerLJII2 != null) {
            return FeatureProducer.getStringFeature$default(featureProducerLJII2, str2, str3, LJIIIIZZ(tTMContext), (ReturnCode) null, 8, (Object) null);
        }
        return null;
    }

    @Override // com.tiktok.strategycenter.feature.IFeatureCenterDataManager
    public final long LJI(String str, String str2, String str3, TTMContext tTMContext) {
        Number numericFeature$default;
        if (str3 == null) {
            FeatureProducer featureProducerLJII = LJII(str);
            if (featureProducerLJII != null) {
                numericFeature$default = FeatureProducer.getNumericFeature$default(featureProducerLJII, str2, (JSONObject) null, LJIIIIZZ(tTMContext), (ReturnCode) null, 8, (Object) null);
            } else {
                return Long.MAX_VALUE;
            }
        } else {
            FeatureProducer featureProducerLJII2 = LJII(str);
            if (featureProducerLJII2 != null) {
                numericFeature$default = FeatureProducer.getNumericFeature$default(featureProducerLJII2, str2, str3, LJIIIIZZ(tTMContext), (ReturnCode) null, 8, (Object) null);
            } else {
                return Long.MAX_VALUE;
            }
        }
        if (numericFeature$default != null) {
            return numericFeature$default.longValue();
        }
        return Long.MAX_VALUE;
    }
}
