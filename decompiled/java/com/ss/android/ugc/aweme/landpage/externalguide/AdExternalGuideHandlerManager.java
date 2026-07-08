package com.ss.android.ugc.aweme.landpage.externalguide;

import X.AbstractC1038360d7y;
import X.C09CT;
import X.C1038280d7q;
import X.C1038300d7s;
import X.C1038480d8A;
import X.C1044250dHT;
import X.InterfaceC1036370d4l;
import X.InterfaceC1038370d7z;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideConfig;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideDialogConfig;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideFormatConfig;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AdExternalGuideHandlerManager implements InterfaceC1036370d4l {
    public final Context LIZ;
    public final AdExternalGuideConfig LIZIZ;
    public final List<InterfaceC1038370d7z> LIZJ = new ArrayList();

    @Override // X.InterfaceC1036370d4l
    public final void LIZIZ() {
        Iterator it2 = ((ArrayList) this.LIZJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1038370d7z) it2.next()).LIZIZ();
        }
        ((ArrayList) this.LIZJ).clear();
    }

    public static final class FrontEndConditionParamConfig implements Serializable {
        public static final int $stable = 8;

        @C09CT("page_anomaly_types")
        public final List<String> pageAnomalyTypes;

        public FrontEndConditionParamConfig() {
            this(null);
        }

        public final List<String> getPageAnomalyTypes() {
            return this.pageAnomalyTypes;
        }

        public FrontEndConditionParamConfig(List<String> list) {
            this.pageAnomalyTypes = list;
        }
    }

    @Override // X.InterfaceC1036370d4l
    public final void LIZ() {
        LIZIZ();
    }

    public AdExternalGuideHandlerManager(Context context, AdExternalGuideConfig adExternalGuideConfig) {
        this.LIZ = context;
        this.LIZIZ = adExternalGuideConfig;
    }

    @Override // X.InterfaceC1036370d4l
    public final C1038280d7q LIZJ(AdExternalGuideTriggerCondition.Type type, final AbstractC1038360d7y abstractC1038360d7y) {
        List<AdExternalGuideTriggerCondition> triggerConditions;
        List<AdExternalGuideTriggerCondition> triggerConditions2;
        String str;
        Map<String, AdExternalGuideDialogConfig> dialogConfig;
        AdExternalGuideDialogConfig adExternalGuideDialogConfig;
        List<AdExternalGuideTriggerCondition> triggerConditions3;
        ArrayList arrayList = new ArrayList();
        AdExternalGuideFormatConfig bannerGuideFormat = this.LIZIZ.getBannerGuideFormat();
        if (bannerGuideFormat != null && (triggerConditions3 = bannerGuideFormat.getTriggerConditions()) != null) {
            for (AdExternalGuideTriggerCondition adExternalGuideTriggerCondition : triggerConditions3) {
                if (LIZLLL(adExternalGuideTriggerCondition, type, abstractC1038360d7y)) {
                    arrayList.add(new C1038480d8A(adExternalGuideTriggerCondition, abstractC1038360d7y));
                }
            }
        }
        AdExternalGuideFormatConfig dialogGuideFormat = this.LIZIZ.getDialogGuideFormat();
        if (dialogGuideFormat != null && (triggerConditions2 = dialogGuideFormat.getTriggerConditions()) != null) {
            for (AdExternalGuideTriggerCondition adExternalGuideTriggerCondition2 : triggerConditions2) {
                if (LIZLLL(adExternalGuideTriggerCondition2, type, abstractC1038360d7y)) {
                    if (!(abstractC1038360d7y instanceof C1038300d7s)) {
                        str = "default";
                    } else {
                        str = ((C1038300d7s) abstractC1038360d7y).LIZ;
                    }
                    Map<String, AdExternalGuideDialogConfig> dialogConfig2 = adExternalGuideTriggerCondition2.getDialogConfig();
                    if ((dialogConfig2 != null && (adExternalGuideDialogConfig = dialogConfig2.get(str)) != null) || (!Intrinsics.LJFF(str, "default") && (dialogConfig = adExternalGuideTriggerCondition2.getDialogConfig()) != null && (adExternalGuideDialogConfig = dialogConfig.get("default")) != null)) {
                        arrayList.add(new C1044250dHT(this.LIZ, adExternalGuideTriggerCondition2, abstractC1038360d7y, adExternalGuideDialogConfig));
                    }
                }
            }
        }
        AdExternalGuideFormatConfig directJumpGuideFormat = this.LIZIZ.getDirectJumpGuideFormat();
        if (directJumpGuideFormat != null && (triggerConditions = directJumpGuideFormat.getTriggerConditions()) != null) {
            for (final AdExternalGuideTriggerCondition adExternalGuideTriggerCondition3 : triggerConditions) {
                if (LIZLLL(adExternalGuideTriggerCondition3, type, abstractC1038360d7y)) {
                    arrayList.add(new AbsAdExternalGuideHandler(adExternalGuideTriggerCondition3, abstractC1038360d7y) { // from class: X.0d8F
                        @Override // com.ss.android.ugc.aweme.landpage.externalguide.AbsAdExternalGuideHandler
                        public final boolean LJ() {
                            if (LJI() != null) {
                                C1038270d7p.LIZIZ = true;
                            }
                            LJII();
                            LJIIIIZZ(3L, 1L);
                            if (LJI() != null) {
                                C1038270d7p.LIZIZ = false;
                            }
                            return true;
                        }
                    });
                }
            }
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        C1038280d7q c1038280d7q = new C1038280d7q(Collections.unmodifiableList(arrayList));
        ((ArrayList) this.LIZJ).add(c1038280d7q);
        return c1038280d7q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r1.contains(((X.C1038300d7s) r10).LIZ) == true) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition r8, com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition.Type r9, X.AbstractC1038360d7y r10) {
        /*
            java.lang.Integer r0 = r8.getType()
            int r1 = r9.getValue()
            r7 = 0
            if (r0 == 0) goto Lbd
            int r0 = r0.intValue()
            if (r0 != r1) goto Lbd
            java.lang.Integer r0 = r8.getScene()
            if (r0 == 0) goto La3
            int r3 = r0.intValue()
            boolean r5 = r10 instanceof X.C1038300d7s
            r6 = 0
            r2 = 1
            if (r5 == 0) goto L76
            java.lang.Integer r4 = r8.getType()
            com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition$Type r0 = com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition.Type.FRONT_END
            int r1 = r0.getValue()
            if (r4 == 0) goto Lbc
            int r0 = r4.intValue()
            if (r0 != r1) goto Lbc
            X.04rF r4 = X.C1227904rF.LIZ     // Catch: java.lang.Throwable -> L48
            com.google.gson.k r1 = r8.getParams()     // Catch: java.lang.Throwable -> L48
            java.lang.Class<com.ss.android.ugc.aweme.landpage.externalguide.AdExternalGuideHandlerManager$FrontEndConditionParamConfig> r0 = com.ss.android.ugc.aweme.landpage.externalguide.AdExternalGuideHandlerManager.FrontEndConditionParamConfig.class
            r4.getClass()     // Catch: java.lang.Throwable -> L48
            java.lang.Object r1 = X.C1227904rF.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L48
            com.ss.android.ugc.aweme.landpage.externalguide.AdExternalGuideHandlerManager$FrontEndConditionParamConfig r1 = (com.ss.android.ugc.aweme.landpage.externalguide.AdExternalGuideHandlerManager.FrontEndConditionParamConfig) r1     // Catch: java.lang.Throwable -> L48
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L48
            goto L54
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L54:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L5b
            r1 = r6
        L5b:
            com.ss.android.ugc.aweme.landpage.externalguide.AdExternalGuideHandlerManager$FrontEndConditionParamConfig r1 = (com.ss.android.ugc.aweme.landpage.externalguide.AdExternalGuideHandlerManager.FrontEndConditionParamConfig) r1
            if (r1 == 0) goto Lbc
            java.util.List r0 = r1.getPageAnomalyTypes()
            if (r0 == 0) goto Lbc
            java.util.Set r1 = X.C13LP.LLIIJI(r0)
            if (r1 == 0) goto Lbc
            r0 = r10
            X.0d7s r0 = (X.C1038300d7s) r0
            java.lang.String r0 = r0.LIZ
            boolean r0 = r1.contains(r0)
            if (r0 != r2) goto Lbc
        L76:
            boolean r0 = r10 instanceof X.C1038290d7r
            if (r0 == 0) goto Lb5
            X.0d7r r10 = (X.C1038290d7r) r10
            com.bytedance.hybrid.spark.SparkContext r1 = r10.LIZ
        L7e:
            if (r1 == 0) goto L92
            java.lang.Class<X.0d3y> r0 = X.C1035880d3y.class
            java.lang.Object r0 = r1.LJFF(r0)
            X.0d3y r0 = (X.C1035880d3y) r0
            if (r0 == 0) goto L92
            int r0 = r0.getIabType()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L92:
            com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition$Scene r0 = com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition.Scene.IAB
            int r0 = r0.getValue()
            if (r3 != r0) goto La4
            if (r6 == 0) goto La2
            int r0 = r6.intValue()
            if (r0 == r2) goto La3
        La2:
            r7 = 1
        La3:
            return r7
        La4:
            com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition$Scene r0 = com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition.Scene.MIDDLE_PAGE
            int r0 = r0.getValue()
            if (r3 != r0) goto La3
            if (r6 == 0) goto La3
            int r0 = r6.intValue()
            if (r0 != r2) goto La3
            goto La2
        Lb5:
            if (r5 == 0) goto L92
            X.0d7s r10 = (X.C1038300d7s) r10
            com.bytedance.hybrid.spark.SparkContext r1 = r10.LIZIZ
            goto L7e
        Lbc:
            return r7
        Lbd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.landpage.externalguide.AdExternalGuideHandlerManager.LIZLLL(com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition, com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition$Type, X.0d7y):boolean");
    }
}
